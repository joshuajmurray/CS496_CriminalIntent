package com.jmurray.criminalintent;

import android.content.Context;
import android.widget.Toast;

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
       mCrimes.remove(getCrime(current));//this isn't working... ?!!??!
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
