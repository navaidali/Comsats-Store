package com.navaidtechnologies.comsatsstore;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.LoadAdError;
import com.navaidtechnologies.comsatsstore.databinding.ActivityCsSemesterBinding;

public class CS_semester_activity extends AppCompatActivity {

    ActivityCsSemesterBinding binding;
    private AdView mAdView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityCsSemesterBinding.inflate(getLayoutInflater());
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

        binding.csFirstSemester.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CS_semester_activity.this, CS_first_subs.class);
                startActivity(intent);
            }
        });

        binding.csSecondSemester.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CS_semester_activity.this, CS_second_subs.class);
                startActivity(intent);
            }
        });

        binding.csThirdSemester.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CS_semester_activity.this, CS_third_subs.class);
                startActivity(intent);
            }
        });

        binding.csFourthSemester.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CS_semester_activity.this, CS_fourth_subs.class);
                startActivity(intent);
            }
        });

        binding.csFifthSemester.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CS_semester_activity.this, CS_fifth_subs.class);
                startActivity(intent);
            }
        });

        binding.csSixthSemester.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CS_semester_activity.this, CS_sixth_subs.class);
                startActivity(intent);
            }
        });

        binding.csSeventhSemester.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CS_semester_activity.this, CS_seventh_subs.class);
                startActivity(intent);
            }
        });

        binding.csEighthSemester.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CS_semester_activity.this, CS_eight_subs.class);
                startActivity(intent);
            }
        });
    }
}