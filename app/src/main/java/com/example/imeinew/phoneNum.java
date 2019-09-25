package com.example.imeinew;

import android.Manifest;
import android.content.Context;
import android.content.pm.PackageManager;
import android.support.v4.app.ActivityCompat;
import android.telephony.TelephonyManager;

public class phoneNum {

    public String Getphonenumber(Context Cnt) {
        TelephonyManager telephonyManager;
        String phone_number_holder;

        telephonyManager = (TelephonyManager) Cnt.getSystemService(Context.TELEPHONY_SERVICE);// permission for service info
        if (ActivityCompat.checkSelfPermission(Cnt, Manifest.permission.READ_PHONE_STATE) != PackageManager.PERMISSION_GRANTED) {
        } //permission check
            return( phone_number_holder = telephonyManager.getLine1Number());

    }
}