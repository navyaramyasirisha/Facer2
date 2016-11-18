package com.we_are_infinity.facer.UI.FRAGMENTS;


import android.Manifest;
import android.animation.Animator;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.ImageButton;

import com.squareup.otto.Bus;
import com.we_are_infinity.facer.LOGIC.EVENT.ErrorMessageEvent;
import com.we_are_infinity.facer.LOGIC.FACTORY.BusFactory;
import com.we_are_infinity.facer.LOGIC.UTIL.DipConversionUtil;
import com.we_are_infinity.facer.R;

import net.alhazmy13.gota.Gota;
import net.alhazmy13.gota.GotaResponse;

import java.io.File;
import java.io.IOException;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * A simple {@link Fragment} subclass.
 */
public class ImageSelectionFragment extends Fragment {


    private static final int RQ_TAKE = 1;
    private static final int RQ_SELECT = 2;
    @BindView(R.id.btnCamera)
    ImageButton btnCamera;
    @BindView(R.id.btnGallery)
    ImageButton btnGallery;
    @BindView(R.id.btnSearch)
    ImageButton btnSearch;
    @BindView(R.id.btnActivate)
    ImageButton btnActivate;

    boolean active = false;
    Bus eventBus = BusFactory.getInstance();
    private Uri newImageUri;

    public ImageSelectionFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_image_selection, container, false);
        ButterKnife.bind(this, view);
        newImageUri = getNewImageUri();
        return view;
    }

    @OnClick({R.id.btnCamera, R.id.btnGallery, R.id.btnSearch, R.id.btnActivate})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnCamera:
                createCameraIntent();
                break;
            case R.id.btnGallery:
                createGalleryIntent();
                break;
            case R.id.btnSearch:
                createSearchIntent();
                break;
            case R.id.btnActivate:
                if (!active)
                    animateActivation();
                active = true;
                break;
        }
    }


    private void createCameraIntent() {
        Intent i = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        i.putExtra(MediaStore.EXTRA_OUTPUT, newImageUri);
        if (newImageUri != null)
            startActivityForResult(i, RQ_TAKE);
        else
            eventBus.post(new ErrorMessageEvent(getString(R.string.global_generalError)));

    }

    private void createGalleryIntent() {

        new Gota.Builder(getActivity())
                .withPermissions(Manifest.permission.READ_EXTERNAL_STORAGE)
                .setListener(new Gota.OnRequestPermissionsBack() {
                    @Override
                    public void onRequestBack(GotaResponse gotaResponse) {
                        if (gotaResponse.isGranted(Manifest.permission.READ_EXTERNAL_STORAGE)) {
                            Intent i = new Intent(Intent.ACTION_GET_CONTENT);
                            newImageUri = getNewImageUri();
                            i.putExtra(MediaStore.EXTRA_OUTPUT, newImageUri);
                            i.addCategory(Intent.CATEGORY_OPENABLE);
                            startActivityForResult(i, RQ_SELECT);
                        }

                    }
                }).check();
    }

    private void createSearchIntent() {
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == Activity.RESULT_OK) {
            switch (requestCode) {
                case RQ_TAKE:

                    break;
                case RQ_SELECT:
                    break;
            }
        }
    }

    private Uri getNewImageUri() {
        File externalCacheDir = getActivity().getExternalCacheDir();
        File n = new File(externalCacheDir, String.valueOf(System.currentTimeMillis()));
        boolean fileCreated = false;
        try {
            if (!n.exists())
                fileCreated = n.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (fileCreated)
            return Uri.parse(n.getAbsolutePath());

        return null;
    }


    private void animateActivation() {
        btnActivate.animate().rotation(45).setListener(new Animator.AnimatorListener() {
            @Override
            public void onAnimationStart(Animator animator) {

                btnCamera.setVisibility(View.VISIBLE);
                btnSearch.setVisibility(View.VISIBLE);
                int dp = 80;
                btnCamera.animate().translationX(-1 * DipConversionUtil.dpToPx(dp)).setInterpolator(new AccelerateDecelerateInterpolator()).start();
                btnSearch.animate().translationX(DipConversionUtil.dpToPx(dp)).setInterpolator(new AccelerateDecelerateInterpolator()).start();
            }

            @Override
            public void onAnimationEnd(Animator animator) {
                btnActivate.setVisibility(View.GONE);
                btnGallery.setVisibility(View.VISIBLE);
            }

            @Override
            public void onAnimationCancel(Animator animator) {

            }

            @Override
            public void onAnimationRepeat(Animator animator) {

            }
        }).start();
    }
}
