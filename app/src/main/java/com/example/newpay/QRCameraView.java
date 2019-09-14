package com.example.newpay;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.google.zxing.Result;

import me.dm7.barcodescanner.zxing.ZXingScannerView;

public class QRCameraView extends AppCompatActivity implements ZXingScannerView.ResultHandler {

    private ZXingScannerView myScanerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.cameraqr);
        myScanerView = new ZXingScannerView(this);
        setContentView(myScanerView);

    }

    @Override
    public void handleResult(Result rawResult) {

    }
}
