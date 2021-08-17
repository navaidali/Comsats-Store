package com.navaidtechnologies.comsatsstore;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.LoadAdError;
import com.navaidtechnologies.comsatsstore.databinding.ActivityCsSeventhSubsBinding;

public class CS_seventh_subs extends AppCompatActivity {

    private AdView mAdView;
    ActivityCsSeventhSubsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityCsSeventhSubsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        mAdView = binding.adView;
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        mAdView.setAdListener(new AdListener() {
            @Override
            public void onAdLoaded() {
                // Code to be executed when an ad finishes loading.
                super.onAdLoaded();
            }

            @Override
            public void onAdFailedToLoad(LoadAdError adError) {
                // Code to be executed when an ad request fails.
                super.onAdFailedToLoad(adError);
                mAdView.loadAd(adRequest);

            }

            @Override
            public void onAdOpened() {
                // Code to be executed when an ad opens an overlay that
                // covers the screen.
                super.onAdOpened();
            }

            @Override
            public void onAdClicked() {
                // Code to be executed when the user clicks on an ad.
                super.onAdClicked();
            }

            @Override
            public void onAdClosed() {
                // Code to be executed when the user is about to return
                // to the app after tapping on an ad.
                super.onAdClosed();
            }
        });

        binding.CSMAD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String sub = "7MAD";
                Intent intent = new Intent(CS_seventh_subs.this, MainActivity.class);
                intent.putExtra("sub", sub);
                startActivity(intent);
            }
        });

        binding.CSML.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String sub = "7ML";
                Toast.makeText(getApplicationContext(), "Coming Up", Toast.LENGTH_SHORT).show();
            }
        });

        binding.CSCC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String sub = "7CC";
                Intent intent = new Intent(CS_seventh_subs.this, MainActivity.class);
                intent.putExtra("sub", sub);
                startActivity(intent);
            }
        });

        binding.CSNC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String sub = "7NC";
                Toast.makeText(getApplicationContext(), "Coming Up", Toast.LENGTH_SHORT).show();
            }
        });

        binding.CSITM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String sub = "B2ITM";
                Intent intent = new Intent(CS_seventh_subs.this, MainActivity.class);
                intent.putExtra("sub", sub);
                startActivity(intent);
            }
        });
    }
}