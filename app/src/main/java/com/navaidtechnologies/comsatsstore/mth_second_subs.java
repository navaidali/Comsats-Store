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
import com.navaidtechnologies.comsatsstore.databinding.ActivityMthSecondSubsBinding;

public class mth_second_subs extends AppCompatActivity {
    ActivityMthSecondSubsBinding binding;
    private AdView mAdView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMthSecondSubsBinding.inflate(getLayoutInflater());
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

        binding.mthCalII.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Coming Up", Toast.LENGTH_SHORT).show();
            }
        });

        binding.mthCskils.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String sub = "4cskils";
                Intent intent = new Intent(mth_second_subs.this, MainActivity.class);
                intent.putExtra("sub", sub);
                startActivity(intent);
            }
        });

        binding.mthCh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Coming Up", Toast.LENGTH_SHORT).show();
            }
        });

        binding.mthDM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String sub = "2dis";
                Intent intent = new Intent(mth_second_subs.this, MainActivity.class);
                intent.putExtra("sub", sub);
                startActivity(intent);
            }
        });

        binding.mthICP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String sub = "ICP";
                Intent intent = new Intent(mth_second_subs.this, MainActivity.class);
                intent.putExtra("sub", sub);
                startActivity(intent);
            }
        });

        binding.mthEAM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Coming Up", Toast.LENGTH_SHORT).show();
            }
        });


    }
}