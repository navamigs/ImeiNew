package com.example.imeinew;

import android.Manifest;
import android.content.Context;
import android.content.pm.PackageManager;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView imei_number,phone_number;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Context Cnt = this ;
        setContentView(R.layout.activity_main);

        imei_number = (TextView) findViewById(R.id.imei);
        phone_number = (TextView) findViewById(R.id.phonenumber);

        imeiN imeiObj =  new imeiN ( ) ;
        phoneNum phonenumberObj = new phoneNum();
        imei_number.setText(imeiObj.GetimeiN( this ) );
        phone_number.setText(phonenumberObj.Getphonenumber(this));

    }
}
