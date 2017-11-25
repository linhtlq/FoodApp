package com.example.mypc.ffood;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by Dell on 11/24/2017.
 */

public class PagerAdapter extends FragmentStatePagerAdapter {
    int mNumOfTabs;

    public PagerAdapter(FragmentManager fm, int NumOfTabs) {
        super(fm);
        this.mNumOfTabs = NumOfTabs;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                TrangChu tab1 = new TrangChu();
                return tab1;
            case 1:
                SanPham tab2 = new SanPham();
                return tab2;
            case 2:
                User tab3 = new User();
                return tab3;
            case 3:
                Map tab4 = new Map();
                return tab4;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return mNumOfTabs;
    }
}
