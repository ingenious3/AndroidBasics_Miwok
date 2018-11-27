package com.example.android.miwok.data;

public class Word {

    private String miwokTranslation;
    private String defaultTranslation;
    private int mImage;
    private int mAudio;
    private final int NO_IMAGE_RESOURCE = -1;

    public Word(String defaultTranslation, String miwokTranslation, int mImage, int mAudio) {
        this.miwokTranslation = miwokTranslation;
        this.defaultTranslation = defaultTranslation;
        this.mImage = mImage;
        this.mAudio = mAudio;
    }

    public Word(String miwokTranslation, String defaultTranslation, int mAudio) {
        this.miwokTranslation = miwokTranslation;
        this.defaultTranslation = defaultTranslation;
        this.mAudio = mAudio;
    }

    public String getMiwokTranslation() {
        return miwokTranslation;
    }

    public void setMiwokTranslation(String miwokTranslation) {
        this.miwokTranslation = miwokTranslation;
    }

    public String getDefaultTranslation() {
        return defaultTranslation;
    }

    public void setDefaultTranslation(String defaultTranslation) {
        this.defaultTranslation = defaultTranslation;
    }

    public int getmImage() {
        return mImage;
    }

    public void setmImage(int mImage) {
        this.mImage = mImage;
    }

    public int getmAudio() {
        return mAudio;
    }

    public void setmAudio(int mAudio) {
        this.mAudio = mAudio;
    }

    public boolean hasImage(){
        return mImage != NO_IMAGE_RESOURCE;
    }
}
