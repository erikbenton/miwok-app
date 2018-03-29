package com.example.android.miwok;

public class Word
{
    private String defaultTranslation;
    private String miwokTranslation;

    public Word(String miwokTranslationTemp, String defaultTranslationTemp)
    {
        miwokTranslation = miwokTranslationTemp;
        defaultTranslation = defaultTranslationTemp;
    }

    public String getDefaultTranslation() {
        return defaultTranslation;
    }

    public String getMiwokTranslation() {
        return miwokTranslation;
    }

    public void setDefaultTranslation(String defaultTranslation) {
        this.defaultTranslation = defaultTranslation;
    }

    public void setMiwokTranslation(String miwokTranslation) {
        this.miwokTranslation = miwokTranslation;
    }
}
