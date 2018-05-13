package ru.alexandrpokh.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by shu on 08.05.2018.
 */
public class CrimeListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
