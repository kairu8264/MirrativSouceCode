package com.dena.mirrorman.unity;

/* loaded from: classes3.dex */
public enum CameraType {
    DEFAULT("Default");
    
    private final String rawValue;

    CameraType(String str) {
        this.rawValue = str;
    }

    public final String getRawValue() {
        return this.rawValue;
    }
}
