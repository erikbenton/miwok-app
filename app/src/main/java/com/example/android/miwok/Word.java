package com.example.android.miwok;

/**
 * {@link Word} represents a vocabulary word that the user wants to learn.
 * It contains a default translation and a Miwok translation for that word.
 */
public class Word
{
    // Default translation
    private String mDefaultTranslation;
    // Miwok translation
    private String mMiwokTranslation;

    public Word(String defaultTranslation, String miwokTranslation)
    {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }

    /**
     * Get default translation of the word
     */
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    /**
     * Get default translation of the word
     */
    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }
}
