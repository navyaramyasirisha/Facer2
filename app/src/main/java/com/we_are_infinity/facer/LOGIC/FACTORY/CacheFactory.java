package com.we_are_infinity.facer.LOGIC.FACTORY;

import android.graphics.Bitmap;
import android.util.LruCache;

import com.we_are_infinity.facer.LOGIC.MODEL.APP.Image;

/**
 * Created by Dominik Gudic on 18.11.2016.
 */

public class CacheFactory {


    private static LruCache<String, Image> cache = new LruCache<>(1024 * 1024 * 10); //10 MiB

    public void purgeCache() {
        cache.evictAll();
    }

    public void putBitmap(String key, Image img) {
        cache.put(key, img);
    }

    public void removeImage(String key){
        cache.remove(key);
    }

}
