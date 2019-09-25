package com.example.imeinew;

import android.Manifest;
import android.content.Context;
import android.content.pm.PackageManager;
import android.support.v4.app.ActivityCompat;
import android.telephony.TelephonyManager;
import android.widget.TextView;

public class imeiN {

    public String GetimeiN(Context Cnt) {
        String IMEI_Number_Holder;
        TelephonyManager telephonyManager;

        telephonyManager = (TelephonyManager)Cnt.getSystemService(Context.TELEPHONY_SERVICE); // permission for service info
        if (ActivityCompat.checkSelfPermission(Cnt, Manifest.permission.READ_PHONE_STATE) != PackageManager.PERMISSION_GRANTED) {
            // TODO: Consider calling
            //    ActivityCompat#requestPermissions
            // here to request the missing permissions, and then overriding
            //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
            //                                          int[] grantResults)
            // to handle the case where the user grants the permission. See the documentation
            // for ActivityCompat#requestPermissions for more details.
        }
        return( IMEI_Number_Holder = telephonyManager.getDeviceId());

    }


}
