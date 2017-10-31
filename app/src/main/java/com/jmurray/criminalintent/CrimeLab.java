package com.jmurray.criminalintent;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Created by Joshua on 10/9/2017.
 */

public class CrimeLab {
    private static CrimeLab sCrimeLab;

    public void addCrime(Crime c) {
        mCrimes.add(c);
    }

    public void deleteCrime(UUID current) {
        for(int i = 0;i < mCrimes.size();i++){
            if(mCrimes.get(i).getID() == current) {
                mCrimes.remove(i);
            }
        }
    }

    private List<Crime> mCrimes;

    public static CrimeLab get(Context context) {
        if(sCrimeLab == null) {
            sCrimeLab = new CrimeLab(context);
        }
        return sCrimeLab;
    }

    private CrimeLab(Context context) {
        mCrimes = new ArrayList<>();
    }

    public List<Crime> getCrimes() {
        return mCrimes;
    }

    public Crime getCrime(UUID id) {
        for(Crime crime : mCrimes) {
            if(crime.getID().equals(id)) {
                return crime;
            }
        }
        return null;
    }
}
