package com.dena.mirrorman.net.api.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.dena.mirrativ.mirrativapi.user.YellRankType;
import java.util.ArrayList;
import java.util.List;
import jo.p;
import ym.b;

/* loaded from: classes2.dex */
public final class SeasonYellYelledRank implements Parcelable {
    private final List<YelledUser> users;
    private final String yellBonusDescription;
    @b(YellRankType.TypeAdapter.class)
    private final YellRankType yellRank;
    public static final Parcelable.Creator<SeasonYellYelledRank> CREATOR = new Creator();
    public static final int $stable = 8;

    /* loaded from: classes2.dex */
    public static final class Creator implements Parcelable.Creator<SeasonYellYelledRank> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SeasonYellYelledRank createFromParcel(Parcel parcel) {
            p.h(parcel, "parcel");
            YellRankType valueOf = YellRankType.valueOf(parcel.readString());
            String readString = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i10 = 0; i10 != readInt; i10++) {
                arrayList.add(YelledUser.CREATOR.createFromParcel(parcel));
            }
            return new SeasonYellYelledRank(valueOf, readString, arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SeasonYellYelledRank[] newArray(int i10) {
            return new SeasonYellYelledRank[i10];
        }
    }

    public SeasonYellYelledRank(YellRankType yellRankType, String str, List<YelledUser> list) {
        p.h(yellRankType, "yellRank");
        p.h(str, "yellBonusDescription");
        p.h(list, "users");
        this.yellRank = yellRankType;
        this.yellBonusDescription = str;
        this.users = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SeasonYellYelledRank copy$default(SeasonYellYelledRank seasonYellYelledRank, YellRankType yellRankType, String str, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            yellRankType = seasonYellYelledRank.yellRank;
        }
        if ((i10 & 2) != 0) {
            str = seasonYellYelledRank.yellBonusDescription;
        }
        if ((i10 & 4) != 0) {
            list = seasonYellYelledRank.users;
        }
        return seasonYellYelledRank.copy(yellRankType, str, list);
    }

    public final YellRankType component1() {
        return this.yellRank;
    }

    public final String component2() {
        return this.yellBonusDescription;
    }

    public final List<YelledUser> component3() {
        return this.users;
    }

    public final SeasonYellYelledRank copy(YellRankType yellRankType, String str, List<YelledUser> list) {
        p.h(yellRankType, "yellRank");
        p.h(str, "yellBonusDescription");
        p.h(list, "users");
        return new SeasonYellYelledRank(yellRankType, str, list);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SeasonYellYelledRank) {
            SeasonYellYelledRank seasonYellYelledRank = (SeasonYellYelledRank) obj;
            return this.yellRank == seasonYellYelledRank.yellRank && p.c(this.yellBonusDescription, seasonYellYelledRank.yellBonusDescription) && p.c(this.users, seasonYellYelledRank.users);
        }
        return false;
    }

    public final List<YelledUser> getUsers() {
        return this.users;
    }

    public final String getYellBonusDescription() {
        return this.yellBonusDescription;
    }

    public final YellRankType getYellRank() {
        return this.yellRank;
    }

    public int hashCode() {
        return (((this.yellRank.hashCode() * 31) + this.yellBonusDescription.hashCode()) * 31) + this.users.hashCode();
    }

    public String toString() {
        return "SeasonYellYelledRank(yellRank=" + this.yellRank + ", yellBonusDescription=" + this.yellBonusDescription + ", users=" + this.users + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        p.h(parcel, "out");
        parcel.writeString(this.yellRank.name());
        parcel.writeString(this.yellBonusDescription);
        List<YelledUser> list = this.users;
        parcel.writeInt(list.size());
        for (YelledUser yelledUser : list) {
            yelledUser.writeToParcel(parcel, i10);
        }
    }
}
