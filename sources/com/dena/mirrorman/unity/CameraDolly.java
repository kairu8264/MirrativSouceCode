package com.dena.mirrorman.unity;

/* loaded from: classes3.dex */
public enum CameraDolly {
    DEFAULT(1.0f),
    GROUP_SHOT(2.0f);
    
    private final float rawValue;

    CameraDolly(float f10) {
        this.rawValue = f10;
    }

    public final float getRawValue() {
        return this.rawValue;
    }
}
