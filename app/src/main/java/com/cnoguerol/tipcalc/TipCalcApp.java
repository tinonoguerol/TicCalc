package com.cnoguerol.tipcalc;

import android.app.Application;

/**
 * Created by cnoguerol.
 */
public class TipCalcApp extends Application {
    private final static String ABOUT_URL = "https://about.me/adriancatalan";

    public static String getAboutUrl() {
        return ABOUT_URL;
    }
}

