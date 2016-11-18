package com.we_are_infinity.facer.LOGIC.MODEL.APP;

import android.graphics.Bitmap;

/**
 * Created by Dominik Gudic on 18.11.2016.
 */

public class Image {

    String url;
    Bitmap b;

    public Image() {
    }

    public Image(String url, Bitmap b) {
        this.url = url;
        this.b = b;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Bitmap getB() {
        return b;
    }

    public void setB(Bitmap b) {
        this.b = b;
    }
}
