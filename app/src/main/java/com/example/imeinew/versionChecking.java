package com.example.imeinew;

import android.content.Context;
import android.os.Build;
import android.util.Log;

public class versionChecking {

    public void GetversionChecking(Context Cnt){
        String manufacturer = Build.MANUFACTURER;

        String model = Build.MODEL;

        int version = Build.VERSION.SDK_INT;

        String versionRelease = Build.VERSION.RELEASE;

        Log.e("MyActivity", "manufacturer " + manufacturer

                + " \n model " + model

                + " \n version " + version

                + " \n versionRelease " + versionRelease

        );
    }
}
