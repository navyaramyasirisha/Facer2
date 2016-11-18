package com.we_are_infinity.facer.LOGIC.MODEL.WEBSERVICE.REQUEST;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Dominik Gudic on 11.11.2016.
 */

public class UploadNewImage_UrlRequest {

    @SerializedName("api_key")
    @Expose
    public String apiKey;
    @SerializedName("api_secret")
    @Expose
    public String apiSecret;
    @SerializedName("detection_flags")
    @Expose
    public String detectionFlags;
    @SerializedName("image_url")
    @Expose
    public String imageUrl;
    @SerializedName("original_filename")
    @Expose
    public String originalFilename;

}
