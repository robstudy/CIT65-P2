package com.bignerdranch.android.thebeatbox;

/**
 * Created by robertgarza1 on 5/4/16.
 */
public class Sound {

    private String mAssetPath;
    private String mName;

    public Sound(String assetPath) {
        mAssetPath = assetPath;
        String[] components = assetPath.split("/");
        String filename = components[components.length - 1];
        mName = filename.replace(".wav", "").substring(3);
    }
    // Plus auto generated getters and setters.


    public String getAssetPath() {
        return mAssetPath;
    }

    public void setAssetPath(String mAssetPath) {
        this.mAssetPath = mAssetPath;
    }

    public String getName() {
        return mName;
    }

    public void setName(String mName) {
        this.mName = mName;
    }
}
