package com.we_are_infinity.facer.LOGIC.MODEL.WEBSERVICE.RESPONSE;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Dominik Gudic on 11.11.2016.
 */

public class GetImageInfoResponse {

    @SerializedName("int_response")
    @Expose
    public Integer intResponse;
    @SerializedName("string_response")
    @Expose
    public String stringResponse;
    @SerializedName("checksum")
    @Expose
    public String checksum;
    @SerializedName("faces")
    @Expose
    public List<Face> faces = new ArrayList<Face>();
    @SerializedName("original_filename")
    @Expose
    public String originalFilename;
    @SerializedName("uid")
    @Expose
    public String uid;

    public Integer getIntResponse() {
        return intResponse;
    }

    public String getStringResponse() {
        return stringResponse;
    }

    public String getChecksum() {
        return checksum;
    }

    public List<Face> getFaces() {
        return faces;
    }

    public String getOriginalFilename() {
        return originalFilename;
    }

    public String getUid() {
        return uid;
    }

    public class Face {

        @SerializedName("angle")
        @Expose
        public Double angle;
        @SerializedName("height")
        @Expose
        public Double height;
        @SerializedName("image_uid")
        @Expose
        public String imageUid;
        @SerializedName("person_name")
        @Expose
        public String personName;
        @SerializedName("score")
        @Expose
        public Double score;
        @SerializedName("uid")
        @Expose
        public String uid;
        @SerializedName("width")
        @Expose
        public Double width;
        @SerializedName("x")
        @Expose
        public Double x;
        @SerializedName("y")
        @Expose
        public Double y;

        public Double getAngle() {
            return angle;
        }

        public Double getHeight() {
            return height;
        }

        public String getImageUid() {
            return imageUid;
        }

        public String getPersonName() {
            return personName;
        }

        public Double getScore() {
            return score;
        }

        public String getUid() {
            return uid;
        }

        public Double getWidth() {
            return width;
        }

        public Double getX() {
            return x;
        }

        public Double getY() {
            return y;
        }
    }
}