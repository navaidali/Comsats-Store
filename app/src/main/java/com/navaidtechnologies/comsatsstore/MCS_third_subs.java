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
import com.navaidtechnologies.comsatsstore.databinding.ActivityMcsThirdSubsBinding;

public class MCS_third_subs extends AppCompatActivity {
    ActivityMcsThirdSubsBinding binding;
    private AdView mAdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMcsThirdSubsBinding.inflate(getLayoutInflater());
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

        binding.MCSOSC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String sub = "M3OSC";
                Intent intent = new Intent(MCS_third_subs.this, MainActivity.class);
                intent.putExtra("sub", sub);
                startActivity(intent);
            }
        });

        binding.MCSCCN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String sub = "M3CCN";
                Toast.makeText(getApplicationContext(), "Coming Up", Toast.LENGTH_SHORT).show();
            }
        });

        binding.MCSSEII.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String sub = "M3SEII";
                Intent intent = new Intent(MCS_third_subs.this, MainActivity.class);
                intent.putExtra("sub", sub);
                startActivity(intent);
            }
        });

        binding.MCSVp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String sub = "M3VP";
                Intent intent = new Intent(MCS_third_subs.this, MainActivity.class);
                intent.putExtra("sub", sub);
                startActivity(intent);
            }
        });

        binding.MCSESD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String sub = "M3ESD";
                Toast.makeText(getApplicationContext(), "Coming Up", Toast.LENGTH_SHORT).show();
            }
        });

        binding.MCSCa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String sub = "M3CA";
                Intent intent = new Intent(MCS_third_subs.this, MainActivity.class);
                intent.putExtra("sub", sub);
                startActivity(intent);
            }
        });
    }
}