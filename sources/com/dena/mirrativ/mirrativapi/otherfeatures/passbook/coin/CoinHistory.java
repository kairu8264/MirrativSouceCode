package com.dena.mirrativ.mirrativapi.otherfeatures.passbook.coin;

import jo.p;

/* loaded from: classes2.dex */
public final class CoinHistory {
    private final int coin;
    private final int coinType;
    private final long createdAt;
    private final long expiresAt;
    private final String label;
    private final int type;

    public CoinHistory(int i10, int i11, int i12, String str, long j10, long j11) {
        this.type = i10;
        this.coinType = i11;
        this.coin = i12;
        this.label = str;
        this.createdAt = j10;
        this.expiresAt = j11;
    }

    public final int component1() {
        return this.type;
    }

    public final int component2() {
        return this.coinType;
    }

    public final int component3() {
        return this.coin;
    }

    public final String component4() {
        return this.label;
    }

    public final long component5() {
        return this.createdAt;
    }

    public final long component6() {
        return this.expiresAt;
    }

    public final CoinHistory copy(int i10, int i11, int i12, String str, long j10, long j11) {
        return new CoinHistory(i10, i11, i12, str, j10, j11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CoinHistory) {
            CoinHistory coinHistory = (CoinHistory) obj;
            return this.type == coinHistory.type && this.coinType == coinHistory.coinType && this.coin == coinHistory.coin && p.c(this.label, coinHistory.label) && this.createdAt == coinHistory.createdAt && this.expiresAt == coinHistory.expiresAt;
        }
        return false;
    }

    public final int getCoin() {
        return this.coin;
    }

    public final int getCoinType() {
        return this.coinType;
    }

    public final long getCreatedAt() {
        return this.createdAt;
    }

    public final long getExpiresAt() {
        return this.expiresAt;
    }

    public final String getLabel() {
        return this.label;
    }

    public final int getType() {
        return this.type;
    }

    public int hashCode() {
        int hashCode = ((((Integer.hashCode(this.type) * 31) + Integer.hashCode(this.coinType)) * 31) + Integer.hashCode(this.coin)) * 31;
        String str = this.label;
        return ((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + Long.hashCode(this.createdAt)) * 31) + Long.hashCode(this.expiresAt);
    }

    public String toString() {
        return "CoinHistory(type=" + this.type + ", coinType=" + this.coinType + ", coin=" + this.coin + ", label=" + this.label + ", createdAt=" + this.createdAt + ", expiresAt=" + this.expiresAt + ')';
    }
}
