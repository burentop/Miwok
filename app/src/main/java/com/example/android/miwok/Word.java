package com.example.android.miwok;


public class Word {

    private String mMiwokTranslation;
    private String mDefaultTranslation;
    private int mImageResourceId;

    public Word(String defaultTranslation, String miwokTranslation) {
        mMiwokTranslation = miwokTranslation;
        mDefaultTranslation = defaultTranslation;
    }

    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    public int getImageResourceID() {
        return mImageResourceId;
    }
}
