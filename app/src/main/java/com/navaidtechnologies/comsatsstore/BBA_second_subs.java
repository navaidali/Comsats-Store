package com.navaidtechnologies.comsatsstore;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.LoadAdError;
import com.navaidtechnologies.comsatsstore.databinding.ActivityBbaSecondSubsBinding;

public class BBA_second_subs extends AppCompatActivity {
    ActivityBbaSecondSubsBinding binding;
    private AdView mAdView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityBbaSecondSubsBinding.inflate(getLayoutInflater());
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

        binding.BBAMAE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String sub = "B2MAE";
                Intent intent = new Intent(BBA_second_subs.this, MainActivity.class);
                intent.putExtra("sub", sub);
                startActivity(intent);
            }
        });

        binding.BBAAII.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String sub = "B2A2";
                Intent intent = new Intent(BBA_second_subs.this, MainActivity.class);
                intent.putExtra("sub", sub);
                startActivity(intent);
            }
        });

        binding.BBAITM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String sub = "B2ITM";
                Intent intent = new Intent(BBA_second_subs.this, MainActivity.class);
                intent.putExtra("sub", sub);
                startActivity(intent);
            }
        });

        binding.BBAIS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String sub = "is";
                Intent intent = new Intent(BBA_second_subs.this, MainActivity.class);
                intent.putExtra("sub", sub);
                startActivity(intent);
            }
        });
        binding.BBABMII.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String sub = "B2BM2";
                Intent intent = new Intent(BBA_second_subs.this, MainActivity.class);
                intent.putExtra("sub", sub);
                startActivity(intent);
            }
        });
    }
}