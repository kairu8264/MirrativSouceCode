package com.dena.mirrativ.mirrativapi.emomo.event.giftranking;

/* loaded from: classes2.dex */
public enum GiftRankingDateType {
    PAST(1),
    TODAY(2),
    FUTURE(3);
    
    private final int rawValue;

    GiftRankingDateType(int i10) {
        this.rawValue = i10;
    }

    public final int getRawValue() {
        return this.rawValue;
    }
}
