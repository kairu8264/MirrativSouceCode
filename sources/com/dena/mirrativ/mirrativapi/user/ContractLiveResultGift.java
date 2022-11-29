package com.dena.mirrativ.mirrativapi.user;

import android.os.Parcel;
import android.os.Parcelable;
import jo.p;

/* loaded from: classes2.dex */
public final class ContractLiveResultGift implements Parcelable {
    public static final Parcelable.Creator<ContractLiveResultGift> CREATOR = new Creator();
    private final int cash;
    private final int paidCoin;
    private final int paidCoinChangeRate;

    /* loaded from: classes2.dex */
    public static final class Creator implements Parcelable.Creator<ContractLiveResultGift> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ContractLiveResultGift createFromParcel(Parcel parcel) {
            p.h(parcel, "parcel");
            return new ContractLiveResultGift(parcel.readInt(), parcel.readInt(), parcel.readInt());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ContractLiveResultGift[] newArray(int i10) {
            return new ContractLiveResultGift[i10];
        }
    }

    public ContractLiveResultGift(int i10, int i11, int i12) {
        this.cash = i10;
        this.paidCoin = i11;
        this.paidCoinChangeRate = i12;
    }

    public static /* synthetic */ ContractLiveResultGift copy$default(ContractLiveResultGift contractLiveResultGift, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i10 = contractLiveResultGift.cash;
        }
        if ((i13 & 2) != 0) {
            i11 = contractLiveResultGift.paidCoin;
        }
        if ((i13 & 4) != 0) {
            i12 = contractLiveResultGift.paidCoinChangeRate;
        }
        return contractLiveResultGift.copy(i10, i11, i12);
    }

    public final int component1() {
        return this.cash;
    }

    public final int component2() {
        return this.paidCoin;
    }

    public final int component3() {
        return this.paidCoinChangeRate;
    }

    public final ContractLiveResultGift copy(int i10, int i11, int i12) {
        return new ContractLiveResultGift(i10, i11, i12);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ContractLiveResultGift) {
            ContractLiveResultGift contractLiveResultGift = (ContractLiveResultGift) obj;
            return this.cash == contractLiveResultGift.cash && this.paidCoin == contractLiveResultGift.paidCoin && this.paidCoinChangeRate == contractLiveResultGift.paidCoinChangeRate;
        }
        return false;
    }

    public final int getCash() {
        return this.cash;
    }

    public final int getPaidCoin() {
        return this.paidCoin;
    }

    public final int getPaidCoinChangeRate() {
        return this.paidCoinChangeRate;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.cash) * 31) + Integer.hashCode(this.paidCoin)) * 31) + Integer.hashCode(this.paidCoinChangeRate);
    }

    public String toString() {
        return "ContractLiveResultGift(cash=" + this.cash + ", paidCoin=" + this.paidCoin + ", paidCoinChangeRate=" + this.paidCoinChangeRate + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        p.h(parcel, "out");
        parcel.writeInt(this.cash);
        parcel.writeInt(this.paidCoin);
        parcel.writeInt(this.paidCoinChangeRate);
    }
}
