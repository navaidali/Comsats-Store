package com.navaidtechnologies.comsatsstore;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.LoadAdError;
import com.navaidtechnologies.comsatsstore.databinding.ActivitySeThirdSubsBinding;

public class SE_third_subs extends AppCompatActivity {
    ActivitySeThirdSubsBinding binding;
    private AdView mAdView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySeThirdSubsBinding.inflate(getLayoutInflater());
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

        binding.SEDSA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String sub = "3dsa";
                Intent intent = new Intent(SE_third_subs.this, MainActivity.class);
                intent.putExtra("sub", sub);
                startActivity(intent);
            }
        });

        binding.SERWS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String sub = "2rws";
                Intent intent = new Intent(SE_third_subs.this, MainActivity.class);
                intent.putExtra("sub", sub);
                startActivity(intent);
            }
        });

        binding.SEDE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String sub = "4de";
                Intent intent = new Intent(SE_third_subs.this, MainActivity.class);
                intent.putExtra("sub", sub);
                startActivity(intent);
            }
        });

        binding.SEDLD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String sub = "3dld";
                Intent intent = new Intent(SE_third_subs.this, MainActivity.class);
                intent.putExtra("sub", sub);
                startActivity(intent);
            }
        });

        binding.SEDBSI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String sub = "4dbs";
                Intent intent = new Intent(SE_third_subs.this, MainActivity.class);
                intent.putExtra("sub", sub);
                startActivity(intent);
            }
        });

    }
}