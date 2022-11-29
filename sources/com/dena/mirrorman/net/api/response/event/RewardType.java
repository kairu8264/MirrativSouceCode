package com.dena.mirrorman.net.api.response.event;

/* loaded from: classes2.dex */
public enum RewardType {
    BASE(1),
    ACHIEVE(2),
    RANKING(3);
    
    private final int rawValue;

    RewardType(int i10) {
        this.rawValue = i10;
    }

    public final int getRawValue() {
        return this.rawValue;
    }
}
