package com.we_are_infinity.facer.LOGIC.MODEL.WEBSERVICE.RESPONSE;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Dominik Gudic on 11.11.2016.
 */

public class RecognizeFacesResponse {


    @SerializedName("int_response")
    @Expose
    public Integer intResponse;
    @SerializedName("string_response")
    @Expose
    public String stringResponse;
    @SerializedName("recognize_uid")
    @Expose
    public String recognizeUid;


    public Integer getIntResponse() {
        return intResponse;
    }

    public String getStringResponse() {
        return stringResponse;
    }

    public String getRecognizeUid() {
        return recognizeUid;
    }
}
