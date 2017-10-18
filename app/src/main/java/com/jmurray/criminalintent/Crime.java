package com.jmurray.criminalintent;

import java.util.Date;
import java.util.UUID;

/**
 * Created by Joshua on 10/6/2017.
 */

public class Crime {
    private UUID mID;
    private String mTitle;
    private Date mDate;
    private boolean mSolved;
    private boolean mRequiresPolice;

    public Crime() {
        mID = UUID.randomUUID();
        mDate = new Date();
    }

    public UUID getID() {
        return mID;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public Date getDate() {
        return mDate;
    }

    public void setDate(Date date) {
        mDate = date;
    }

    public boolean isSolved() {
        return mSolved;
    }

    public void setSolved(boolean solved) {
        mSolved = solved;
    }

    public void setRequiresPolice(boolean police) {
        mRequiresPolice = police;
    }

    public boolean getReuiresPolice () {
        return mRequiresPolice;
    }
}
