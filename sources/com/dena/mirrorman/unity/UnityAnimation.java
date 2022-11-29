package com.dena.mirrorman.unity;

/* loaded from: classes3.dex */
public enum UnityAnimation {
    POSE_RESET("Pose_Reset"),
    EMOKARA_LEFT_FLICK("EmoKara_001"),
    EMOKARA_RIGHT_FLICK("EmoKara_002"),
    EMOKARA_ENTER("EmoKara_Enter"),
    EMOKARA_EXIT("EmoKara_Exit");
    
    private final String rawValue;

    UnityAnimation(String str) {
        this.rawValue = str;
    }

    public final String getRawValue() {
        return this.rawValue;
    }
}
