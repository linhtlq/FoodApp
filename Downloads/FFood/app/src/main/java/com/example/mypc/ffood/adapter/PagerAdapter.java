package com.example.mypc.ffood.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.mypc.ffood.fragment.JPfood;
import com.example.mypc.ffood.fragment.TrangChu;
import com.example.mypc.ffood.fragment.USAfood;
import com.example.mypc.ffood.fragment.VNfood;

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
                VNfood tab2 = new VNfood();
                return tab2;
            case 2:
                USAfood tab3 = new USAfood();
                return tab3;
            case 3:
                JPfood tab4 = new JPfood();
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
