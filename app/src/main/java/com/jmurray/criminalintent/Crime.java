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

    public String getDateOnly() {
        return android.text.format.DateFormat.format("EEE, MMM d yyyy", mDate).toString();
    }

    public void setDate(Date date) {
        mDate = date;
    }

    public String getTime() {
        return android.text.format.DateFormat.format("hh:mm a", mDate).toString();
    }

    public boolean isSolved() {
        return mSolved;
    }

    public void setSolved(boolean solved) {
        mSolved = solved;
    }
}
