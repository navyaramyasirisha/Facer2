package com.we_are_infinity.facer.LOGIC.MODEL.WEBSERVICE.REQUEST;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Dominik Gudic on 11.11.2016.
 */

public class RecognizeFacesRequest {

    @SerializedName("api_key")
    @Expose
    public String apiKey;
    @SerializedName("api_secret")
    @Expose
    public String apiSecret;
    @SerializedName("faces_uids")
    @Expose
    public String facesUids;
    @SerializedName("parameters")
    @Expose
    public String parameters;
    @SerializedName("targets")
    @Expose
    public String targets;
}
