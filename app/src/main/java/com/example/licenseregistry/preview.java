package com.example.licenseregistry;

import androidx.appcompat.app.AppCompatActivity;

import android.content.pm.ActivityInfo;
import android.net.Uri;
import android.os.Bundle;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class preview extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preview);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        Button back = findViewById(R.id.back);
        Button submitprev =  findViewById(R.id.submitprev);

        TextView nametv =  findViewById(R.id.name);
        TextView ntltv =  findViewById(R.id.ntl);
        TextView sextv = findViewById(R.id.sx);
        TextView dobtv = findViewById(R.id.dob);
        TextView kgtv =  findViewById(R.id.kg);
        TextView mtstv =  findViewById(R.id.mts);
        TextView adstv = findViewById(R.id.ads);
        TextView bdttv =findViewById(R.id.bdt);
        TextView eyectv =   findViewById(R.id.eyec);
        String nameset = getIntent().getExtras().getString("fname");
        String ntlest = getIntent().getExtras().getString("ntlity");
        String sexset = getIntent().getExtras().getString("sexx");
        String dobset = getIntent().getExtras().getString("bods");
        String kgset = getIntent().getExtras().getString("wghtt");
        String mtsset = getIntent().getExtras().getString("hghtt");
        String adsset = getIntent().getExtras().getString("addss");
        String bdtset = getIntent().getExtras().getString("blds");
        String eyecset = getIntent().getExtras().getString("eycs");

        nametv.setText(nameset);
        ntltv.setText(ntlest);
        sextv.setText(sexset);
        dobtv.setText(dobset);
        kgtv.setText(kgset);
        mtstv.setText(mtsset);
        adstv.setText(adsset);
        bdttv.setText(bdtset);
        eyectv.setText(eyecset);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(preview.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });

        submitprev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(preview.this, "Activity not yet available...", Toast.LENGTH_LONG).show();
            }
        });

    }
}