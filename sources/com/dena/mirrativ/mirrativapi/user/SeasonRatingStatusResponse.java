package com.dena.mirrativ.mirrativapi.user;

import android.os.Parcel;
import android.os.Parcelable;
import com.dena.mirrativ.mirrativapi.core.Status;
import jo.p;

/* loaded from: classes2.dex */
public final class SeasonRatingStatusResponse implements Parcelable {
    public static final Parcelable.Creator<SeasonRatingStatusResponse> CREATOR = new Creator();
    private final int coin;
    private final int diamond;
    private final SeasonRatingStatusSeason lastSeason;
    private final SeasonRatingStatusSeason season;
    private final boolean showPopup;
    private final Status status;

    /* loaded from: classes2.dex */
    public static final class Creator implements Parcelable.Creator<SeasonRatingStatusResponse> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SeasonRatingStatusResponse createFromParcel(Parcel parcel) {
            p.h(parcel, "parcel");
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            boolean z10 = parcel.readInt() != 0;
            Parcelable.Creator<SeasonRatingStatusSeason> creator = SeasonRatingStatusSeason.CREATOR;
            return new SeasonRatingStatusResponse(readInt, readInt2, z10, creator.createFromParcel(parcel), parcel.readInt() == 0 ? null : creator.createFromParcel(parcel), Status.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SeasonRatingStatusResponse[] newArray(int i10) {
            return new SeasonRatingStatusResponse[i10];
        }
    }

    public SeasonRatingStatusResponse(int i10, int i11, boolean z10, SeasonRatingStatusSeason seasonRatingStatusSeason, SeasonRatingStatusSeason seasonRatingStatusSeason2, Status status) {
        p.h(seasonRatingStatusSeason, "season");
        p.h(status, "status");
        this.coin = i10;
        this.diamond = i11;
        this.showPopup = z10;
        this.season = seasonRatingStatusSeason;
        this.lastSeason = seasonRatingStatusSeason2;
        this.status = status;
    }

    public static /* synthetic */ SeasonRatingStatusResponse copy$default(SeasonRatingStatusResponse seasonRatingStatusResponse, int i10, int i11, boolean z10, SeasonRatingStatusSeason seasonRatingStatusSeason, SeasonRatingStatusSeason seasonRatingStatusSeason2, Status status, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = seasonRatingStatusResponse.coin;
        }
        if ((i12 & 2) != 0) {
            i11 = seasonRatingStatusResponse.diamond;
        }
        int i13 = i11;
        if ((i12 & 4) != 0) {
            z10 = seasonRatingStatusResponse.showPopup;
        }
        boolean z11 = z10;
        if ((i12 & 8) != 0) {
            seasonRatingStatusSeason = seasonRatingStatusResponse.season;
        }
        SeasonRatingStatusSeason seasonRatingStatusSeason3 = seasonRatingStatusSeason;
        if ((i12 & 16) != 0) {
            seasonRatingStatusSeason2 = seasonRatingStatusResponse.lastSeason;
        }
        SeasonRatingStatusSeason seasonRatingStatusSeason4 = seasonRatingStatusSeason2;
        if ((i12 & 32) != 0) {
            status = seasonRatingStatusResponse.status;
        }
        return seasonRatingStatusResponse.copy(i10, i13, z11, seasonRatingStatusSeason3, seasonRatingStatusSeason4, status);
    }

    public final int component1() {
        return this.coin;
    }

    public final int component2() {
        return this.diamond;
    }

    public final boolean component3() {
        return this.showPopup;
    }

    public final SeasonRatingStatusSeason component4() {
        return this.season;
    }

    public final SeasonRatingStatusSeason component5() {
        return this.lastSeason;
    }

    public final Status component6() {
        return this.status;
    }

    public final SeasonRatingStatusResponse copy(int i10, int i11, boolean z10, SeasonRatingStatusSeason seasonRatingStatusSeason, SeasonRatingStatusSeason seasonRatingStatusSeason2, Status status) {
        p.h(seasonRatingStatusSeason, "season");
        p.h(status, "status");
        return new SeasonRatingStatusResponse(i10, i11, z10, seasonRatingStatusSeason, seasonRatingStatusSeason2, status);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SeasonRatingStatusResponse) {
            SeasonRatingStatusResponse seasonRatingStatusResponse = (SeasonRatingStatusResponse) obj;
            return this.coin == seasonRatingStatusResponse.coin && this.diamond == seasonRatingStatusResponse.diamond && this.showPopup == seasonRatingStatusResponse.showPopup && p.c(this.season, seasonRatingStatusResponse.season) && p.c(this.lastSeason, seasonRatingStatusResponse.lastSeason) && p.c(this.status, seasonRatingStatusResponse.status);
        }
        return false;
    }

    public final int getCoin() {
        return this.coin;
    }

    public final int getDiamond() {
        return this.diamond;
    }

    public final SeasonRatingStatusSeason getLastSeason() {
        return this.lastSeason;
    }

    public final SeasonRatingStatusSeason getSeason() {
        return this.season;
    }

    public final boolean getShowPopup() {
        return this.showPopup;
    }

    public final Status getStatus() {
        return this.status;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((Integer.hashCode(this.coin) * 31) + Integer.hashCode(this.diamond)) * 31;
        boolean z10 = this.showPopup;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        int hashCode2 = (((hashCode + i10) * 31) + this.season.hashCode()) * 31;
        SeasonRatingStatusSeason seasonRatingStatusSeason = this.lastSeason;
        return ((hashCode2 + (seasonRatingStatusSeason == null ? 0 : seasonRatingStatusSeason.hashCode())) * 31) + this.status.hashCode();
    }

    public String toString() {
        return "SeasonRatingStatusResponse(coin=" + this.coin + ", diamond=" + this.diamond + ", showPopup=" + this.showPopup + ", season=" + this.season + ", lastSeason=" + this.lastSeason + ", status=" + this.status + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        p.h(parcel, "out");
        parcel.writeInt(this.coin);
        parcel.writeInt(this.diamond);
        parcel.writeInt(this.showPopup ? 1 : 0);
        this.season.writeToParcel(parcel, i10);
        SeasonRatingStatusSeason seasonRatingStatusSeason = this.lastSeason;
        if (seasonRatingStatusSeason == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            seasonRatingStatusSeason.writeToParcel(parcel, i10);
        }
        this.status.writeToParcel(parcel, i10);
    }
}
