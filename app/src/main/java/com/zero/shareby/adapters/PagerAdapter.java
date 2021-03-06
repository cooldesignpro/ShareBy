package com.zero.shareby.adapters;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.zero.shareby.fragments.DashboardFragment;
import com.zero.shareby.fragments.PendingRequestsFragment;
import com.zero.shareby.fragments.PostDashboard;

public class PagerAdapter extends FragmentPagerAdapter {

    private Context mContext;
    public PagerAdapter(Context context,FragmentManager fm) {
        super(fm);
        mContext=context;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return DashboardFragment.getInstance();

            case 1:
                return PendingRequestsFragment.getInstance();

            case 2:
                return PostDashboard.getInstance();

        }
        return null;
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0:
                return "Dashboard";

            case 1:
                return "Requests";

            case 2:
                return "Your Posts";
        }
        return "Default";
    }
}
