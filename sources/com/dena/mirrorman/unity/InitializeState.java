package com.dena.mirrorman.unity;

/* loaded from: classes3.dex */
public enum InitializeState {
    DEFAULT("Default"),
    INITIALIZING("Initializing"),
    INITIALIZED("Initialized");
    
    private final String rawValue;

    InitializeState(String str) {
        this.rawValue = str;
    }

    public final String getRawValue() {
        return this.rawValue;
    }
}
