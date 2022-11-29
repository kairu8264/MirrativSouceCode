package com.dena.mirrorman.unity;

/* loaded from: classes3.dex */
public enum LoadAvatarState {
    DEFAULT("Default"),
    LOADING("Loading"),
    LOADED("Loaded");
    
    private final String rawValue;

    LoadAvatarState(String str) {
        this.rawValue = str;
    }

    public final String getRawValue() {
        return this.rawValue;
    }
}
