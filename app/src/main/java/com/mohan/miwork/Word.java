package com.mohan.miwork;

public class Word {

    private String mDefaultTranslation;

    private String mMiworkTranslations;

    private int mImageResourceId;

    public Word(String defaulTranslations, String miWorkTranslation) {
        mDefaultTranslation = defaulTranslations;
        mMiworkTranslations = miWorkTranslation;
    }


    public String getmDefaultTranslation() {
        return mDefaultTranslation;
    }

    public String getmMiworkTranslations() {
        return mMiworkTranslations;
    }

    public int getmImageResourceId () {
        return mImageResourceId;
    }
}
