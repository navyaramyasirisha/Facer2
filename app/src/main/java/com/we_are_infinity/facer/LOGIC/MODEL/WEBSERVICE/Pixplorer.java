package com.we_are_infinity.facer.LOGIC.MODEL.WEBSERVICE;

import com.we_are_infinity.facer.LOGIC.MODEL.WEBSERVICE.RESPONSE.PixplorerResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import rx.Observable;

/**
 * Created by Dominik Gudic on 18.11.2016.
 */

public interface Pixplorer {


    @GET("image?word={word};amount=10")
    Observable<Call<PixplorerResponse>> getImages(@Path("word") String word);
}
