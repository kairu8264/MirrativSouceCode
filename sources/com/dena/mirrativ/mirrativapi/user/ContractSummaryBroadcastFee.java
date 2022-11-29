package com.dena.mirrativ.mirrativapi.user;

/* loaded from: classes2.dex */
public final class ContractSummaryBroadcastFee {
    private final int cash;
    private final int cashUnit;
    private final int classId;
    private final int monthlyCashLimit;

    public ContractSummaryBroadcastFee(int i10, int i11, int i12, int i13) {
        this.cash = i10;
        this.cashUnit = i11;
        this.monthlyCashLimit = i12;
        this.classId = i13;
    }

    public static /* synthetic */ ContractSummaryBroadcastFee copy$default(ContractSummaryBroadcastFee contractSummaryBroadcastFee, int i10, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i10 = contractSummaryBroadcastFee.cash;
        }
        if ((i14 & 2) != 0) {
            i11 = contractSummaryBroadcastFee.cashUnit;
        }
        if ((i14 & 4) != 0) {
            i12 = contractSummaryBroadcastFee.monthlyCashLimit;
        }
        if ((i14 & 8) != 0) {
            i13 = contractSummaryBroadcastFee.classId;
        }
        return contractSummaryBroadcastFee.copy(i10, i11, i12, i13);
    }

    public final int component1() {
        return this.cash;
    }

    public final int component2() {
        return this.cashUnit;
    }

    public final int component3() {
        return this.monthlyCashLimit;
    }

    public final int component4() {
        return this.classId;
    }

    public final ContractSummaryBroadcastFee copy(int i10, int i11, int i12, int i13) {
        return new ContractSummaryBroadcastFee(i10, i11, i12, i13);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ContractSummaryBroadcastFee) {
            ContractSummaryBroadcastFee contractSummaryBroadcastFee = (ContractSummaryBroadcastFee) obj;
            return this.cash == contractSummaryBroadcastFee.cash && this.cashUnit == contractSummaryBroadcastFee.cashUnit && this.monthlyCashLimit == contractSummaryBroadcastFee.monthlyCashLimit && this.classId == contractSummaryBroadcastFee.classId;
        }
        return false;
    }

    public final int getCash() {
        return this.cash;
    }

    public final int getCashUnit() {
        return this.cashUnit;
    }

    public final int getClassId() {
        return this.classId;
    }

    public final int getMonthlyCashLimit() {
        return this.monthlyCashLimit;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.cash) * 31) + Integer.hashCode(this.cashUnit)) * 31) + Integer.hashCode(this.monthlyCashLimit)) * 31) + Integer.hashCode(this.classId);
    }

    public String toString() {
        return "ContractSummaryBroadcastFee(cash=" + this.cash + ", cashUnit=" + this.cashUnit + ", monthlyCashLimit=" + this.monthlyCashLimit + ", classId=" + this.classId + ')';
    }
}
