package com.dena.mirrorman.unity;

/* loaded from: classes3.dex */
public enum MiniGameStateType {
    UNLOADED(0),
    LOADING(1),
    LOADED(2),
    STARTING(3),
    PLAYING(4),
    GAMEOVER(5),
    FINISHING(6),
    RESULT(7);
    
    private final int rawValue;

    MiniGameStateType(int i10) {
        this.rawValue = i10;
    }

    public final int getRawValue() {
        return this.rawValue;
    }
}
