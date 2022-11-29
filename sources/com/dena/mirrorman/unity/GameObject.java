package com.dena.mirrorman.unity;

/* loaded from: classes3.dex */
public enum GameObject {
    SCENE_MANAGER("SceneManager"),
    AVATAR("Avatar");
    
    private final String rawValue;

    GameObject(String str) {
        this.rawValue = str;
    }

    public final String getRawValue() {
        return this.rawValue;
    }
}
