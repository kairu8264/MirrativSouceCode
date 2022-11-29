package com.dena.mirrativ.mirrativapi.user;

/* loaded from: classes2.dex */
public final class ContractSummaryGift {
    private final int cash;

    public ContractSummaryGift(int i10) {
        this.cash = i10;
    }

    public static /* synthetic */ ContractSummaryGift copy$default(ContractSummaryGift contractSummaryGift, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = contractSummaryGift.cash;
        }
        return contractSummaryGift.copy(i10);
    }

    public final int component1() {
        return this.cash;
    }

    public final ContractSummaryGift copy(int i10) {
        return new ContractSummaryGift(i10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ContractSummaryGift) && this.cash == ((ContractSummaryGift) obj).cash;
    }

    public final int getCash() {
        return this.cash;
    }

    public int hashCode() {
        return Integer.hashCode(this.cash);
    }

    public String toString() {
        return "ContractSummaryGift(cash=" + this.cash + ')';
    }
}
