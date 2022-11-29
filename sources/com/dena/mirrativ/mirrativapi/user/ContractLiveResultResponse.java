package com.dena.mirrativ.mirrativapi.user;

import android.os.Parcel;
import android.os.Parcelable;
import com.dena.mirrativ.mirrativapi.user.RankingGradeType;
import jo.p;
import ym.b;

/* loaded from: classes2.dex */
public final class ContractLiveResultResponse implements Parcelable {
    public static final Parcelable.Creator<ContractLiveResultResponse> CREATOR = new Creator();
    private final BroadcastFee broadcastFee;
    private final ContractLiveResultGift gift;
    @b(RankingGradeType.TypeAdapter.class)
    private final RankingGradeType grade;
    private final int monthlyCashEnd;
    private final int monthlyCashStart;
    private final int totalCash;

    /* loaded from: classes2.dex */
    public static final class Creator implements Parcelable.Creator<ContractLiveResultResponse> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ContractLiveResultResponse createFromParcel(Parcel parcel) {
            p.h(parcel, "parcel");
            return new ContractLiveResultResponse(parcel.readInt(), parcel.readInt(), parcel.readInt(), BroadcastFee.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : ContractLiveResultGift.CREATOR.createFromParcel(parcel), RankingGradeType.valueOf(parcel.readString()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ContractLiveResultResponse[] newArray(int i10) {
            return new ContractLiveResultResponse[i10];
        }
    }

    public ContractLiveResultResponse(int i10, int i11, int i12, BroadcastFee broadcastFee, ContractLiveResultGift contractLiveResultGift, RankingGradeType rankingGradeType) {
        p.h(broadcastFee, "broadcastFee");
        p.h(rankingGradeType, "grade");
        this.totalCash = i10;
        this.monthlyCashStart = i11;
        this.monthlyCashEnd = i12;
        this.broadcastFee = broadcastFee;
        this.gift = contractLiveResultGift;
        this.grade = rankingGradeType;
    }

    public static /* synthetic */ ContractLiveResultResponse copy$default(ContractLiveResultResponse contractLiveResultResponse, int i10, int i11, int i12, BroadcastFee broadcastFee, ContractLiveResultGift contractLiveResultGift, RankingGradeType rankingGradeType, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i10 = contractLiveResultResponse.totalCash;
        }
        if ((i13 & 2) != 0) {
            i11 = contractLiveResultResponse.monthlyCashStart;
        }
        int i14 = i11;
        if ((i13 & 4) != 0) {
            i12 = contractLiveResultResponse.monthlyCashEnd;
        }
        int i15 = i12;
        if ((i13 & 8) != 0) {
            broadcastFee = contractLiveResultResponse.broadcastFee;
        }
        BroadcastFee broadcastFee2 = broadcastFee;
        if ((i13 & 16) != 0) {
            contractLiveResultGift = contractLiveResultResponse.gift;
        }
        ContractLiveResultGift contractLiveResultGift2 = contractLiveResultGift;
        if ((i13 & 32) != 0) {
            rankingGradeType = contractLiveResultResponse.grade;
        }
        return contractLiveResultResponse.copy(i10, i14, i15, broadcastFee2, contractLiveResultGift2, rankingGradeType);
    }

    public final int component1() {
        return this.totalCash;
    }

    public final int component2() {
        return this.monthlyCashStart;
    }

    public final int component3() {
        return this.monthlyCashEnd;
    }

    public final BroadcastFee component4() {
        return this.broadcastFee;
    }

    public final ContractLiveResultGift component5() {
        return this.gift;
    }

    public final RankingGradeType component6() {
        return this.grade;
    }

    public final ContractLiveResultResponse copy(int i10, int i11, int i12, BroadcastFee broadcastFee, ContractLiveResultGift contractLiveResultGift, RankingGradeType rankingGradeType) {
        p.h(broadcastFee, "broadcastFee");
        p.h(rankingGradeType, "grade");
        return new ContractLiveResultResponse(i10, i11, i12, broadcastFee, contractLiveResultGift, rankingGradeType);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ContractLiveResultResponse) {
            ContractLiveResultResponse contractLiveResultResponse = (ContractLiveResultResponse) obj;
            return this.totalCash == contractLiveResultResponse.totalCash && this.monthlyCashStart == contractLiveResultResponse.monthlyCashStart && this.monthlyCashEnd == contractLiveResultResponse.monthlyCashEnd && p.c(this.broadcastFee, contractLiveResultResponse.broadcastFee) && p.c(this.gift, contractLiveResultResponse.gift) && this.grade == contractLiveResultResponse.grade;
        }
        return false;
    }

    public final BroadcastFee getBroadcastFee() {
        return this.broadcastFee;
    }

    public final ContractLiveResultGift getGift() {
        return this.gift;
    }

    public final RankingGradeType getGrade() {
        return this.grade;
    }

    public final int getMonthlyCashEnd() {
        return this.monthlyCashEnd;
    }

    public final int getMonthlyCashStart() {
        return this.monthlyCashStart;
    }

    public final int getTotalCash() {
        return this.totalCash;
    }

    public int hashCode() {
        int hashCode = ((((((Integer.hashCode(this.totalCash) * 31) + Integer.hashCode(this.monthlyCashStart)) * 31) + Integer.hashCode(this.monthlyCashEnd)) * 31) + this.broadcastFee.hashCode()) * 31;
        ContractLiveResultGift contractLiveResultGift = this.gift;
        return ((hashCode + (contractLiveResultGift == null ? 0 : contractLiveResultGift.hashCode())) * 31) + this.grade.hashCode();
    }

    public String toString() {
        return "ContractLiveResultResponse(totalCash=" + this.totalCash + ", monthlyCashStart=" + this.monthlyCashStart + ", monthlyCashEnd=" + this.monthlyCashEnd + ", broadcastFee=" + this.broadcastFee + ", gift=" + this.gift + ", grade=" + this.grade + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        p.h(parcel, "out");
        parcel.writeInt(this.totalCash);
        parcel.writeInt(this.monthlyCashStart);
        parcel.writeInt(this.monthlyCashEnd);
        this.broadcastFee.writeToParcel(parcel, i10);
        ContractLiveResultGift contractLiveResultGift = this.gift;
        if (contractLiveResultGift == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            contractLiveResultGift.writeToParcel(parcel, i10);
        }
        parcel.writeString(this.grade.name());
    }
}
