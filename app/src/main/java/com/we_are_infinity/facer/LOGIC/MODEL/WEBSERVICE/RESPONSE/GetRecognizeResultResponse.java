package com.we_are_infinity.facer.LOGIC.MODEL.WEBSERVICE.RESPONSE;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Dominik Gudic on 11.11.2016.
 */

public class GetRecognizeResultResponse {

    @SerializedName("int_response")
    @Expose
    public Integer intResponse;
    @SerializedName("string_response")
    @Expose
    public String stringResponse;
    @SerializedName("faces_matches")
    @Expose
    public List<FacesMatch> facesMatches = new ArrayList<FacesMatch>();
    @SerializedName("recognize_uid")
    @Expose
    public String recognizeUid;

    public Integer getIntResponse() {
        return intResponse;
    }

    public String getStringResponse() {
        return stringResponse;
    }

    public List<FacesMatch> getFacesMatches() {
        return facesMatches;
    }

    public String getRecognizeUid() {
        return recognizeUid;
    }

    public class Match {

        @SerializedName("confidence")
        @Expose
        public Double confidence;
        @SerializedName("face_uid")
        @Expose
        public String faceUid;
        @SerializedName("is_match")
        @Expose
        public Boolean isMatch;
        @SerializedName("person_name")
        @Expose
        public String personName;


        public Double getConfidence() {
            return confidence;
        }

        public String getFaceUid() {
            return faceUid;
        }

        public Boolean getMatch() {
            return isMatch;
        }

        public String getPersonName() {
            return personName;
        }
    }


    public class FacesMatch {

        @SerializedName("face_uid")
        @Expose
        public String faceUid;
        @SerializedName("matches")
        @Expose
        public List<Match> matches = new ArrayList<Match>();

        public String getFaceUid() {
            return faceUid;
        }

        public List<Match> getMatches() {
            return matches;
        }
    }
}
