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
import com.navaidtechnologies.comsatsstore.databinding.ActivitySeFourthSubsBinding;

public class SE_fourth_subs extends AppCompatActivity {
    ActivitySeFourthSubsBinding binding;
    private AdView mAdView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySeFourthSubsBinding.inflate(getLayoutInflater());
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

        binding.SEPPIT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String sub = "3ppit";
                Intent intent = new Intent(SE_fourth_subs.this, MainActivity.class);
                intent.putExtra("sub", sub);
                startActivity(intent);
            }
        });

        binding.SELA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String sub = "3la";
                Intent intent = new Intent(SE_fourth_subs.this, MainActivity.class);
                intent.putExtra("sub", sub);
                startActivity(intent);
            }
        });
        binding.SEOS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String sub = "5OS";
                Intent intent = new Intent(SE_fourth_subs.this, MainActivity.class);
                intent.putExtra("sub", sub);
                startActivity(intent);
            }
        });
        binding.SEOOSE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Coming Up", Toast.LENGTH_SHORT).show();
            }
        });
        binding.SEDCACN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Coming Up", Toast.LENGTH_SHORT).show();
            }
        });
    }
}