package com.we_are_infinity.facer.LOGIC.MODEL.WEBSERVICE.RESPONSE;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Dominik Gudic on 18.11.2016.
 */

public class PixplorerResponse {

    @SerializedName("images")
    @Expose
    public List<Image> images = new ArrayList<Image>();

    @SerializedName("count")
    @Expose
    public Integer count;

    public List<Image> getImages() {
        return images;
    }

    public Integer getCount() {
        return count;
    }

    class Image {

        @SerializedName("imageurl")
        @Expose
        public String imageurl;


        public String getImageurl() {
            return imageurl;
        }
    }

}