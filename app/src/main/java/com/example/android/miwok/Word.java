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

    // Image resource ID
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;

    public Word(String defaultTranslation, String miwokTranslation)
    {
        this.mDefaultTranslation = defaultTranslation;
        this.mMiwokTranslation = miwokTranslation;
    }

    public Word(String defaultTranslation, String miwokTranslation, int imageResourceId)
    {
        this.mDefaultTranslation = defaultTranslation;
        this.mMiwokTranslation = miwokTranslation;
        this.mImageResourceId = imageResourceId;
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

    /**
     * Get image resource id of the word
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

    /**
     * Returns whether the word has an image or not
     */
    public boolean hasImage()
    {
        return this.mImageResourceId != NO_IMAGE_PROVIDED;
    }
}
