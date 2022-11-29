package com.dena.mirrativ.mirrativapi.user;

import android.os.Parcel;
import android.os.Parcelable;
import com.dena.mirrativ.mirrativapi.core.Status;
import com.dena.mirrorman.net.api.Referer;
import java.util.ArrayList;
import java.util.List;
import jo.p;

/* loaded from: classes2.dex */
public final class SeasonRatingLiveResult implements Parcelable {
    public static final Parcelable.Creator<SeasonRatingLiveResult> CREATOR = new Creator();
    private final SeasonRatingLiveResultExpInfo broadcast;
    private final List<SeasonRatingLiveResultClass> classList;
    private final SeasonRatingLiveResultExpInfo comment;
    private final int daysLeft;
    private final SeasonRatingLiveResultExpInfo follow;
    private final SeasonRatingLiveResultExpInfo gift;
    private final int hoursLeft;
    private final boolean isContractLiveResultEnabled;
    private final long liveDuration;
    private final String liveId;
    private final SeasonRatingLiveResultExpInfo others;
    private final Status status;
    private final SeasonRatingLiveResultExpInfo view;
    private final SeasonRatingLiveResultExpInfo yell;

    /* loaded from: classes2.dex */
    public static final class Creator implements Parcelable.Creator<SeasonRatingLiveResult> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SeasonRatingLiveResult createFromParcel(Parcel parcel) {
            p.h(parcel, "parcel");
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i10 = 0; i10 != readInt; i10++) {
                arrayList.add(SeasonRatingLiveResultClass.CREATOR.createFromParcel(parcel));
            }
            String readString = parcel.readString();
            Status createFromParcel = Status.CREATOR.createFromParcel(parcel);
            Parcelable.Creator<SeasonRatingLiveResultExpInfo> creator = SeasonRatingLiveResultExpInfo.CREATOR;
            return new SeasonRatingLiveResult(arrayList, readString, createFromParcel, creator.createFromParcel(parcel), creator.createFromParcel(parcel), creator.createFromParcel(parcel), creator.createFromParcel(parcel), creator.createFromParcel(parcel), parcel.readInt() == 0 ? null : creator.createFromParcel(parcel), creator.createFromParcel(parcel), parcel.readLong(), parcel.readInt(), parcel.readInt(), parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SeasonRatingLiveResult[] newArray(int i10) {
            return new SeasonRatingLiveResult[i10];
        }
    }

    public SeasonRatingLiveResult(List<SeasonRatingLiveResultClass> list, String str, Status status, SeasonRatingLiveResultExpInfo seasonRatingLiveResultExpInfo, SeasonRatingLiveResultExpInfo seasonRatingLiveResultExpInfo2, SeasonRatingLiveResultExpInfo seasonRatingLiveResultExpInfo3, SeasonRatingLiveResultExpInfo seasonRatingLiveResultExpInfo4, SeasonRatingLiveResultExpInfo seasonRatingLiveResultExpInfo5, SeasonRatingLiveResultExpInfo seasonRatingLiveResultExpInfo6, SeasonRatingLiveResultExpInfo seasonRatingLiveResultExpInfo7, long j10, int i10, int i11, boolean z10) {
        p.h(list, "classList");
        p.h(str, "liveId");
        p.h(status, "status");
        p.h(seasonRatingLiveResultExpInfo, "comment");
        p.h(seasonRatingLiveResultExpInfo2, "gift");
        p.h(seasonRatingLiveResultExpInfo3, "view");
        p.h(seasonRatingLiveResultExpInfo4, "follow");
        p.h(seasonRatingLiveResultExpInfo5, Referer.BROADCAST);
        p.h(seasonRatingLiveResultExpInfo7, "others");
        this.classList = list;
        this.liveId = str;
        this.status = status;
        this.comment = seasonRatingLiveResultExpInfo;
        this.gift = seasonRatingLiveResultExpInfo2;
        this.view = seasonRatingLiveResultExpInfo3;
        this.follow = seasonRatingLiveResultExpInfo4;
        this.broadcast = seasonRatingLiveResultExpInfo5;
        this.yell = seasonRatingLiveResultExpInfo6;
        this.others = seasonRatingLiveResultExpInfo7;
        this.liveDuration = j10;
        this.daysLeft = i10;
        this.hoursLeft = i11;
        this.isContractLiveResultEnabled = z10;
    }

    public final List<SeasonRatingLiveResultClass> component1() {
        return this.classList;
    }

    public final SeasonRatingLiveResultExpInfo component10() {
        return this.others;
    }

    public final long component11() {
        return this.liveDuration;
    }

    public final int component12() {
        return this.daysLeft;
    }

    public final int component13() {
        return this.hoursLeft;
    }

    public final boolean component14() {
        return this.isContractLiveResultEnabled;
    }

    public final String component2() {
        return this.liveId;
    }

    public final Status component3() {
        return this.status;
    }

    public final SeasonRatingLiveResultExpInfo component4() {
        return this.comment;
    }

    public final SeasonRatingLiveResultExpInfo component5() {
        return this.gift;
    }

    public final SeasonRatingLiveResultExpInfo component6() {
        return this.view;
    }

    public final SeasonRatingLiveResultExpInfo component7() {
        return this.follow;
    }

    public final SeasonRatingLiveResultExpInfo component8() {
        return this.broadcast;
    }

    public final SeasonRatingLiveResultExpInfo component9() {
        return this.yell;
    }

    public final SeasonRatingLiveResult copy(List<SeasonRatingLiveResultClass> list, String str, Status status, SeasonRatingLiveResultExpInfo seasonRatingLiveResultExpInfo, SeasonRatingLiveResultExpInfo seasonRatingLiveResultExpInfo2, SeasonRatingLiveResultExpInfo seasonRatingLiveResultExpInfo3, SeasonRatingLiveResultExpInfo seasonRatingLiveResultExpInfo4, SeasonRatingLiveResultExpInfo seasonRatingLiveResultExpInfo5, SeasonRatingLiveResultExpInfo seasonRatingLiveResultExpInfo6, SeasonRatingLiveResultExpInfo seasonRatingLiveResultExpInfo7, long j10, int i10, int i11, boolean z10) {
        p.h(list, "classList");
        p.h(str, "liveId");
        p.h(status, "status");
        p.h(seasonRatingLiveResultExpInfo, "comment");
        p.h(seasonRatingLiveResultExpInfo2, "gift");
        p.h(seasonRatingLiveResultExpInfo3, "view");
        p.h(seasonRatingLiveResultExpInfo4, "follow");
        p.h(seasonRatingLiveResultExpInfo5, Referer.BROADCAST);
        p.h(seasonRatingLiveResultExpInfo7, "others");
        return new SeasonRatingLiveResult(list, str, status, seasonRatingLiveResultExpInfo, seasonRatingLiveResultExpInfo2, seasonRatingLiveResultExpInfo3, seasonRatingLiveResultExpInfo4, seasonRatingLiveResultExpInfo5, seasonRatingLiveResultExpInfo6, seasonRatingLiveResultExpInfo7, j10, i10, i11, z10);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SeasonRatingLiveResult) {
            SeasonRatingLiveResult seasonRatingLiveResult = (SeasonRatingLiveResult) obj;
            return p.c(this.classList, seasonRatingLiveResult.classList) && p.c(this.liveId, seasonRatingLiveResult.liveId) && p.c(this.status, seasonRatingLiveResult.status) && p.c(this.comment, seasonRatingLiveResult.comment) && p.c(this.gift, seasonRatingLiveResult.gift) && p.c(this.view, seasonRatingLiveResult.view) && p.c(this.follow, seasonRatingLiveResult.follow) && p.c(this.broadcast, seasonRatingLiveResult.broadcast) && p.c(this.yell, seasonRatingLiveResult.yell) && p.c(this.others, seasonRatingLiveResult.others) && this.liveDuration == seasonRatingLiveResult.liveDuration && this.daysLeft == seasonRatingLiveResult.daysLeft && this.hoursLeft == seasonRatingLiveResult.hoursLeft && this.isContractLiveResultEnabled == seasonRatingLiveResult.isContractLiveResultEnabled;
        }
        return false;
    }

    public final SeasonRatingLiveResultExpInfo getBroadcast() {
        return this.broadcast;
    }

    public final List<SeasonRatingLiveResultClass> getClassList() {
        return this.classList;
    }

    public final SeasonRatingLiveResultExpInfo getComment() {
        return this.comment;
    }

    public final int getDaysLeft() {
        return this.daysLeft;
    }

    public final SeasonRatingLiveResultExpInfo getFollow() {
        return this.follow;
    }

    public final SeasonRatingLiveResultExpInfo getGift() {
        return this.gift;
    }

    public final int getHoursLeft() {
        return this.hoursLeft;
    }

    public final long getLiveDuration() {
        return this.liveDuration;
    }

    public final String getLiveId() {
        return this.liveId;
    }

    public final SeasonRatingLiveResultExpInfo getOthers() {
        return this.others;
    }

    public final Status getStatus() {
        return this.status;
    }

    public final SeasonRatingLiveResultExpInfo getView() {
        return this.view;
    }

    public final SeasonRatingLiveResultExpInfo getYell() {
        return this.yell;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((((((((((((this.classList.hashCode() * 31) + this.liveId.hashCode()) * 31) + this.status.hashCode()) * 31) + this.comment.hashCode()) * 31) + this.gift.hashCode()) * 31) + this.view.hashCode()) * 31) + this.follow.hashCode()) * 31) + this.broadcast.hashCode()) * 31;
        SeasonRatingLiveResultExpInfo seasonRatingLiveResultExpInfo = this.yell;
        int hashCode2 = (((((((((hashCode + (seasonRatingLiveResultExpInfo == null ? 0 : seasonRatingLiveResultExpInfo.hashCode())) * 31) + this.others.hashCode()) * 31) + Long.hashCode(this.liveDuration)) * 31) + Integer.hashCode(this.daysLeft)) * 31) + Integer.hashCode(this.hoursLeft)) * 31;
        boolean z10 = this.isContractLiveResultEnabled;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        return hashCode2 + i10;
    }

    public final boolean isContractLiveResultEnabled() {
        return this.isContractLiveResultEnabled;
    }

    public String toString() {
        return "SeasonRatingLiveResult(classList=" + this.classList + ", liveId=" + this.liveId + ", status=" + this.status + ", comment=" + this.comment + ", gift=" + this.gift + ", view=" + this.view + ", follow=" + this.follow + ", broadcast=" + this.broadcast + ", yell=" + this.yell + ", others=" + this.others + ", liveDuration=" + this.liveDuration + ", daysLeft=" + this.daysLeft + ", hoursLeft=" + this.hoursLeft + ", isContractLiveResultEnabled=" + this.isContractLiveResultEnabled + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        p.h(parcel, "out");
        List<SeasonRatingLiveResultClass> list = this.classList;
        parcel.writeInt(list.size());
        for (SeasonRatingLiveResultClass seasonRatingLiveResultClass : list) {
            seasonRatingLiveResultClass.writeToParcel(parcel, i10);
        }
        parcel.writeString(this.liveId);
        this.status.writeToParcel(parcel, i10);
        this.comment.writeToParcel(parcel, i10);
        this.gift.writeToParcel(parcel, i10);
        this.view.writeToParcel(parcel, i10);
        this.follow.writeToParcel(parcel, i10);
        this.broadcast.writeToParcel(parcel, i10);
        SeasonRatingLiveResultExpInfo seasonRatingLiveResultExpInfo = this.yell;
        if (seasonRatingLiveResultExpInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            seasonRatingLiveResultExpInfo.writeToParcel(parcel, i10);
        }
        this.others.writeToParcel(parcel, i10);
        parcel.writeLong(this.liveDuration);
        parcel.writeInt(this.daysLeft);
        parcel.writeInt(this.hoursLeft);
        parcel.writeInt(this.isContractLiveResultEnabled ? 1 : 0);
    }
}
