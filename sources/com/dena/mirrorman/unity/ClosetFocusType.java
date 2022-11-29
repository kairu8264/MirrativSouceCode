package com.dena.mirrorman.unity;

/* loaded from: classes3.dex */
public enum ClosetFocusType {
    DEFAULT("Default"),
    FACE("Face"),
    SETUP("Setup"),
    TOPS("Tops"),
    BOTTOMS("Bottoms"),
    FOOT("Foot"),
    COMPANION("Companion"),
    MAIN("Main"),
    MAIN_ZOOMOUT("Main_Zoomout"),
    BONE_SCALE("BoneScale"),
    LEFT_INTERIOR("LeftInterior"),
    RIGHT_INTERIOR("RightInterior"),
    MACHINE("machine");
    
    private final String rawValue;

    ClosetFocusType(String str) {
        this.rawValue = str;
    }

    public final String getRawValue() {
        return this.rawValue;
    }
}
