package com.tenjin.android.sdk.demo;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.tenjin.android.TenjinSDK;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onResume() {
        super.onResume();
        startTenjinSDK();
    }

    private void startTenjinSDK() {
        // Tenjin SDK Integration
        // Add Tenjin API Key from your Tenjin dashboard - https://www.tenjin.io/dashboard/docs.
        TenjinSDK instance = TenjinSDK.getInstance(this, "YWZKFWDZEREQCFMF3DST3AYHZPCC9MWV");
        // Set the appstore
        // If you distribute your app on Google Play store or Amazon store. Then set it to googleplay
        instance.setAppStore(TenjinSDK.AppStoreType.googleplay);
        // connect to start the TenjinSDK
        instance.connect();
    }
}