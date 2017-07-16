package com.bulutcolak.merhabakodluyoruz;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class MerhabaKodluyoruzActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_merhaba_kodluyoruz);

        Log.e("LogDeneme", "Kullanıcı arayüzü oluşturuldu");


    }
}
