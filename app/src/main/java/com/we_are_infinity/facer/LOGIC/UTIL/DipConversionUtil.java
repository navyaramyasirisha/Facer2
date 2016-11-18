package com.we_are_infinity.facer.LOGIC.UTIL;

import android.content.res.Resources;

/**
 * Created by Dominik Gudic on 02.11.2016.
 */

public class DipConversionUtil {

    public static int pxToDp(int px) {
        return (int) (px / Resources.getSystem().getDisplayMetrics().density);
    }

    public static int dpToPx(int dp) {
        return (int) (dp * Resources.getSystem().getDisplayMetrics().density);
    }

}
