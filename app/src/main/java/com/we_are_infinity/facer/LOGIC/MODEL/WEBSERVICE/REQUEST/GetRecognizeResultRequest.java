package com.we_are_infinity.facer.LOGIC.MODEL.WEBSERVICE.REQUEST;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Dominik Gudic on 11.11.2016.
 */

public class GetRecognizeResultRequest {

    @SerializedName("api_key")
    @Expose
    public String apiKey;
    @SerializedName("api_secret")
    @Expose
    public String apiSecret;
    @SerializedName("recognize_uid")
    @Expose
    public String recognizeUid;


}
