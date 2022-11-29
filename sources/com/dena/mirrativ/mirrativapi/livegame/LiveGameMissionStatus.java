package com.dena.mirrativ.mirrativapi.livegame;

import android.os.Parcel;
import android.os.Parcelable;
import jo.p;
import ym.b;

/* loaded from: classes2.dex */
public final class LiveGameMissionStatus implements Parcelable {
    public static final Parcelable.Creator<LiveGameMissionStatus> CREATOR = new Creator();
    private final String coin;
    @b(LiveGameMissionStatusTypeAdapter.class)
    private final LiveGameMissionStatusType status;

    /* loaded from: classes2.dex */
    public static final class Creator implements Parcelable.Creator<LiveGameMissionStatus> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LiveGameMissionStatus createFromParcel(Parcel parcel) {
            p.h(parcel, "parcel");
            return new LiveGameMissionStatus(parcel.readString(), LiveGameMissionStatusType.valueOf(parcel.readString()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LiveGameMissionStatus[] newArray(int i10) {
            return new LiveGameMissionStatus[i10];
        }
    }

    public LiveGameMissionStatus(String str, LiveGameMissionStatusType liveGameMissionStatusType) {
        p.h(str, "coin");
        p.h(liveGameMissionStatusType, "status");
        this.coin = str;
        this.status = liveGameMissionStatusType;
    }

    public static /* synthetic */ LiveGameMissionStatus copy$default(LiveGameMissionStatus liveGameMissionStatus, String str, LiveGameMissionStatusType liveGameMissionStatusType, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = liveGameMissionStatus.coin;
        }
        if ((i10 & 2) != 0) {
            liveGameMissionStatusType = liveGameMissionStatus.status;
        }
        return liveGameMissionStatus.copy(str, liveGameMissionStatusType);
    }

    public final String component1() {
        return this.coin;
    }

    public final LiveGameMissionStatusType component2() {
        return this.status;
    }

    public final LiveGameMissionStatus copy(String str, LiveGameMissionStatusType liveGameMissionStatusType) {
        p.h(str, "coin");
        p.h(liveGameMissionStatusType, "status");
        return new LiveGameMissionStatus(str, liveGameMissionStatusType);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LiveGameMissionStatus) {
            LiveGameMissionStatus liveGameMissionStatus = (LiveGameMissionStatus) obj;
            return p.c(this.coin, liveGameMissionStatus.coin) && this.status == liveGameMissionStatus.status;
        }
        return false;
    }

    public final String getCoin() {
        return this.coin;
    }

    public final LiveGameMissionStatusType getStatus() {
        return this.status;
    }

    public int hashCode() {
        return (this.coin.hashCode() * 31) + this.status.hashCode();
    }

    public String toString() {
        return "LiveGameMissionStatus(coin=" + this.coin + ", status=" + this.status + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        p.h(parcel, "out");
        parcel.writeString(this.coin);
        parcel.writeString(this.status.name());
    }
}
