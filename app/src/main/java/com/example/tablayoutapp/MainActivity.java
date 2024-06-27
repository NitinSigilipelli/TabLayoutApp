package com.example.tablayoutapp;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;

import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        TabLayout tabLayout = findViewById(R.id.tabLayout);
        TabItem tabChat = findViewById(R.id.tabWaifu);
        TabItem tabStatus = findViewById(R.id.tabNeko);
        TabItem tabCalls = findViewById(R.id.tabShinobu);
        ViewPager viewPager = findViewById(R.id.viewPager);
        MyPagerAdapter pagerAdapter = new MyPagerAdapter(getSupportFragmentManager(),tabLayout.getTabCount());
        viewPager.setAdapter(pagerAdapter);
        // It is used to join TabLayout with ViewPager.
        tabLayout.setupWithViewPager(viewPager);

    }
}