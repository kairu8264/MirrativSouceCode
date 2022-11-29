package com.dena.mirrativ.mirrativapi.user;

/* loaded from: classes2.dex */
public final class PaidCoinChangeRate {
    private final int border;
    private final int cashRate;
    private final int coinRate;
    private final int grade;

    public PaidCoinChangeRate(int i10, int i11, int i12, int i13) {
        this.grade = i10;
        this.border = i11;
        this.cashRate = i12;
        this.coinRate = i13;
    }

    public static /* synthetic */ PaidCoinChangeRate copy$default(PaidCoinChangeRate paidCoinChangeRate, int i10, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i10 = paidCoinChangeRate.grade;
        }
        if ((i14 & 2) != 0) {
            i11 = paidCoinChangeRate.border;
        }
        if ((i14 & 4) != 0) {
            i12 = paidCoinChangeRate.cashRate;
        }
        if ((i14 & 8) != 0) {
            i13 = paidCoinChangeRate.coinRate;
        }
        return paidCoinChangeRate.copy(i10, i11, i12, i13);
    }

    public final int component1() {
        return this.grade;
    }

    public final int component2() {
        return this.border;
    }

    public final int component3() {
        return this.cashRate;
    }

    public final int component4() {
        return this.coinRate;
    }

    public final PaidCoinChangeRate copy(int i10, int i11, int i12, int i13) {
        return new PaidCoinChangeRate(i10, i11, i12, i13);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PaidCoinChangeRate) {
            PaidCoinChangeRate paidCoinChangeRate = (PaidCoinChangeRate) obj;
            return this.grade == paidCoinChangeRate.grade && this.border == paidCoinChangeRate.border && this.cashRate == paidCoinChangeRate.cashRate && this.coinRate == paidCoinChangeRate.coinRate;
        }
        return false;
    }

    public final int getBorder() {
        return this.border;
    }

    public final int getCashRate() {
        return this.cashRate;
    }

    public final int getCoinRate() {
        return this.coinRate;
    }

    public final int getGrade() {
        return this.grade;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.grade) * 31) + Integer.hashCode(this.border)) * 31) + Integer.hashCode(this.cashRate)) * 31) + Integer.hashCode(this.coinRate);
    }

    public String toString() {
        return "PaidCoinChangeRate(grade=" + this.grade + ", border=" + this.border + ", cashRate=" + this.cashRate + ", coinRate=" + this.coinRate + ')';
    }
}
