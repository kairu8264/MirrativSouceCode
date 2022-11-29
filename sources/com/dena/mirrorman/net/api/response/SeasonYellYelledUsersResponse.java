package com.dena.mirrorman.net.api.response;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import jo.p;

/* loaded from: classes2.dex */
public final class SeasonYellYelledUsersResponse implements Parcelable {
    private final String bannerUrl;
    private final List<SeasonYellYelledRank> list;
    private final String yellLpUrl;
    public static final Parcelable.Creator<SeasonYellYelledUsersResponse> CREATOR = new Creator();
    public static final int $stable = 8;

    /* loaded from: classes2.dex */
    public static final class Creator implements Parcelable.Creator<SeasonYellYelledUsersResponse> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SeasonYellYelledUsersResponse createFromParcel(Parcel parcel) {
            p.h(parcel, "parcel");
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i10 = 0; i10 != readInt; i10++) {
                arrayList.add(SeasonYellYelledRank.CREATOR.createFromParcel(parcel));
            }
            return new SeasonYellYelledUsersResponse(arrayList, parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SeasonYellYelledUsersResponse[] newArray(int i10) {
            return new SeasonYellYelledUsersResponse[i10];
        }
    }

    public SeasonYellYelledUsersResponse(List<SeasonYellYelledRank> list, String str, String str2) {
        p.h(list, "list");
        p.h(str, "bannerUrl");
        p.h(str2, "yellLpUrl");
        this.list = list;
        this.bannerUrl = str;
        this.yellLpUrl = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SeasonYellYelledUsersResponse copy$default(SeasonYellYelledUsersResponse seasonYellYelledUsersResponse, List list, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = seasonYellYelledUsersResponse.list;
        }
        if ((i10 & 2) != 0) {
            str = seasonYellYelledUsersResponse.bannerUrl;
        }
        if ((i10 & 4) != 0) {
            str2 = seasonYellYelledUsersResponse.yellLpUrl;
        }
        return seasonYellYelledUsersResponse.copy(list, str, str2);
    }

    public final List<SeasonYellYelledRank> component1() {
        return this.list;
    }

    public final String component2() {
        return this.bannerUrl;
    }

    public final String component3() {
        return this.yellLpUrl;
    }

    public final SeasonYellYelledUsersResponse copy(List<SeasonYellYelledRank> list, String str, String str2) {
        p.h(list, "list");
        p.h(str, "bannerUrl");
        p.h(str2, "yellLpUrl");
        return new SeasonYellYelledUsersResponse(list, str, str2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SeasonYellYelledUsersResponse) {
            SeasonYellYelledUsersResponse seasonYellYelledUsersResponse = (SeasonYellYelledUsersResponse) obj;
            return p.c(this.list, seasonYellYelledUsersResponse.list) && p.c(this.bannerUrl, seasonYellYelledUsersResponse.bannerUrl) && p.c(this.yellLpUrl, seasonYellYelledUsersResponse.yellLpUrl);
        }
        return false;
    }

    public final String getBannerUrl() {
        return this.bannerUrl;
    }

    public final List<SeasonYellYelledRank> getList() {
        return this.list;
    }

    public final String getYellLpUrl() {
        return this.yellLpUrl;
    }

    public int hashCode() {
        return (((this.list.hashCode() * 31) + this.bannerUrl.hashCode()) * 31) + this.yellLpUrl.hashCode();
    }

    public String toString() {
        return "SeasonYellYelledUsersResponse(list=" + this.list + ", bannerUrl=" + this.bannerUrl + ", yellLpUrl=" + this.yellLpUrl + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        p.h(parcel, "out");
        List<SeasonYellYelledRank> list = this.list;
        parcel.writeInt(list.size());
        for (SeasonYellYelledRank seasonYellYelledRank : list) {
            seasonYellYelledRank.writeToParcel(parcel, i10);
        }
        parcel.writeString(this.bannerUrl);
        parcel.writeString(this.yellLpUrl);
    }
}
