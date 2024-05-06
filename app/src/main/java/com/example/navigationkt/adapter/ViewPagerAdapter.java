package com.example.navigationkt.adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.example.navigationkt.fragment.FragmentFavorite;
import com.example.navigationkt.fragment.FragmentHome;
import com.example.navigationkt.fragment.FragmentStatistic;

public class ViewPagerAdapter extends FragmentStatePagerAdapter {
    public ViewPagerAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0: return new FragmentHome();
            case 1: return new FragmentFavorite();
            case 2: return new FragmentStatistic();
        }
        return null;
    }

    @Override
    public int getCount() {
        return 3;
    }
}
