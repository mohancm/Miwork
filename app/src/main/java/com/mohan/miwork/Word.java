package com.mohan.miwork;

public class Word {

    private String mDefaultTranslation;

    private String mMiworkTranslations;

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
}
