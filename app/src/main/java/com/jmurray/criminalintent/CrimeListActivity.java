package com.jmurray.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by Joshua on 10/15/2017.
 */

public class CrimeListActivity extends SingleFragmentActivity {


    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }

    @Override
    protected int getLayoutResId() {
        return R.layout.activity_twopane;
    }
}
