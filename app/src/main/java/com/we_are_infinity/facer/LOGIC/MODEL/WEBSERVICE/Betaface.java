package com.we_are_infinity.facer.LOGIC.MODEL.WEBSERVICE;

import com.we_are_infinity.facer.LOGIC.MODEL.WEBSERVICE.REQUEST.GetImageInfoRequest;
import com.we_are_infinity.facer.LOGIC.MODEL.WEBSERVICE.REQUEST.GetRecognizeResultRequest;
import com.we_are_infinity.facer.LOGIC.MODEL.WEBSERVICE.REQUEST.RecognizeFacesRequest;
import com.we_are_infinity.facer.LOGIC.MODEL.WEBSERVICE.REQUEST.UploadImageRequest;
import com.we_are_infinity.facer.LOGIC.MODEL.WEBSERVICE.REQUEST.UploadNewImage_UrlRequest;
import com.we_are_infinity.facer.LOGIC.MODEL.WEBSERVICE.RESPONSE.GetImageInfoResponse;
import com.we_are_infinity.facer.LOGIC.MODEL.WEBSERVICE.RESPONSE.GetRecognizeResultResponse;
import com.we_are_infinity.facer.LOGIC.MODEL.WEBSERVICE.RESPONSE.RecognizeFacesResponse;
import com.we_are_infinity.facer.LOGIC.MODEL.WEBSERVICE.RESPONSE.UploadImageResponse;
import com.we_are_infinity.facer.LOGIC.MODEL.WEBSERVICE.RESPONSE.UploadNewImage_UrlResponse;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;
import rx.Observable;

/**
 * Created by Dominik Gudic on 11.11.2016.
 */

public interface Betaface {

    @POST("GetImageInfo")
    Observable<Call<GetImageInfoResponse>> getImageInfo(@Body GetImageInfoRequest request);

    @POST("GetRecognizeResult")
    Observable<Call<GetRecognizeResultResponse>> getRecognizeResult(@Body GetRecognizeResultRequest request);

    @POST("RecognizeFaces")
    Observable<Call<RecognizeFacesResponse>> recognizeFaces(@Body GetRecognizeResultRequest request);

    @POST("UploadImage")
    Observable<Call<UploadImageResponse>> uploadImage(@Body UploadImageRequest request);

    @POST("UploadNewImage_Url")
    Observable<Call<UploadNewImage_UrlResponse>> uploadNewImage_Url(@Body UploadNewImage_UrlRequest request);
}
