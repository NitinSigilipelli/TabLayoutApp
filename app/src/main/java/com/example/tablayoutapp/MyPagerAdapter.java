package com.example.tablayoutapp;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class MyPagerAdapter extends FragmentPagerAdapter {
    private int numOfTabs;

    public MyPagerAdapter(@NonNull FragmentManager fm, int numOfTabs) {
        super(fm);
        this.numOfTabs = numOfTabs;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch(position){
            case 0 :
                return new WaifuFragment();
            case 1 :
                return new NekoFragment();
            case 2 :
                return new ShinobuFragment();
            default:
                return null;


        }

    }

    @Override
    public int getCount() {
        return numOfTabs;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        String title = null;
        if(position == 0){
            title = "Waifu";
        }else if(position == 1){
            title = "Neko";
        }else if(position == 2){
            title = "Shinobu";
        }
        return title;
    }
}
