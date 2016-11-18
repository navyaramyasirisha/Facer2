package com.we_are_infinity.facer.LOGIC.MODEL.WEBSERVICE.REQUEST;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Dominik Gudic on 11.11.2016.
 */

public class UploadImageRequest {

    @SerializedName("api_key")
    @Expose
    public String apiKey;
    @SerializedName("api_secret")
    @Expose
    public String apiSecret;
    @SerializedName("detection_flags")
    @Expose
    public String detectionFlags;
    @SerializedName("image_base64")
    @Expose
    public String imageBase64;
    @SerializedName("original_filename")
    @Expose
    public String originalFilename;
    @SerializedName("url")
    @Expose
    public String url;
}
