package ru.alexandrpokh.criminalintent;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Created by shu on 08.05.2018.
 */
public class CrimeLab {
    private static CrimeLab sCrimeLab;
    private List<Crime> mCrimes;

    public static CrimeLab get(Context context) {
        if (sCrimeLab == null) {
            sCrimeLab = new CrimeLab(context);
        }
        return sCrimeLab;
    }

    private CrimeLab(Context context) {
        mCrimes = new ArrayList<>();
     //   mAppContext = appContext;

        for(int i = 0; i<100; i++){
            Crime crime = new Crime();
            crime.setTitle("Косяк №" + i);
            crime.setSolved(i%2 == 0);
            mCrimes.add(crime);
        }
    }

    public List<Crime> getCrimes() {
        return mCrimes;
    }

    public Crime getCrime(UUID id) {
        for (Crime c : mCrimes) {
            if (c.getId().equals(id))
                return c;
            }
            return null;
    }

    public int getPosition(UUID id){
        for (Crime c : mCrimes) {
            if (c.getId().equals(id))
                return mCrimes.indexOf(c);
            }
        return Integer.parseInt(null);
    }

}

