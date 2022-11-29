package com.dena.mirrativ.mirrativapi.livegame;

import android.os.Parcel;
import android.os.Parcelable;
import com.dena.mirrorman.clientlog.logs.MRLog;
import jo.p;

/* loaded from: classes2.dex */
public final class LiveGameMission implements Parcelable {
    public static final Parcelable.Creator<LiveGameMission> CREATOR = new Creator();
    private final CoinBoost coinBoost;
    private final String condition;
    private final LiveGameMissionStatus player;
    private final LiveGameMissionStatus viewer;

    /* loaded from: classes2.dex */
    public static final class Creator implements Parcelable.Creator<LiveGameMission> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LiveGameMission createFromParcel(Parcel parcel) {
            p.h(parcel, "parcel");
            String readString = parcel.readString();
            Parcelable.Creator<LiveGameMissionStatus> creator = LiveGameMissionStatus.CREATOR;
            return new LiveGameMission(readString, creator.createFromParcel(parcel), creator.createFromParcel(parcel), parcel.readInt() == 0 ? null : CoinBoost.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LiveGameMission[] newArray(int i10) {
            return new LiveGameMission[i10];
        }
    }

    public LiveGameMission(String str, LiveGameMissionStatus liveGameMissionStatus, LiveGameMissionStatus liveGameMissionStatus2, CoinBoost coinBoost) {
        p.h(str, "condition");
        p.h(liveGameMissionStatus, "player");
        p.h(liveGameMissionStatus2, MRLog.TARGET_TYPE_VIEWER);
        this.condition = str;
        this.player = liveGameMissionStatus;
        this.viewer = liveGameMissionStatus2;
        this.coinBoost = coinBoost;
    }

    public static /* synthetic */ LiveGameMission copy$default(LiveGameMission liveGameMission, String str, LiveGameMissionStatus liveGameMissionStatus, LiveGameMissionStatus liveGameMissionStatus2, CoinBoost coinBoost, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = liveGameMission.condition;
        }
        if ((i10 & 2) != 0) {
            liveGameMissionStatus = liveGameMission.player;
        }
        if ((i10 & 4) != 0) {
            liveGameMissionStatus2 = liveGameMission.viewer;
        }
        if ((i10 & 8) != 0) {
            coinBoost = liveGameMission.coinBoost;
        }
        return liveGameMission.copy(str, liveGameMissionStatus, liveGameMissionStatus2, coinBoost);
    }

    public final String component1() {
        return this.condition;
    }

    public final LiveGameMissionStatus component2() {
        return this.player;
    }

    public final LiveGameMissionStatus component3() {
        return this.viewer;
    }

    public final CoinBoost component4() {
        return this.coinBoost;
    }

    public final LiveGameMission copy(String str, LiveGameMissionStatus liveGameMissionStatus, LiveGameMissionStatus liveGameMissionStatus2, CoinBoost coinBoost) {
        p.h(str, "condition");
        p.h(liveGameMissionStatus, "player");
        p.h(liveGameMissionStatus2, MRLog.TARGET_TYPE_VIEWER);
        return new LiveGameMission(str, liveGameMissionStatus, liveGameMissionStatus2, coinBoost);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LiveGameMission) {
            LiveGameMission liveGameMission = (LiveGameMission) obj;
            return p.c(this.condition, liveGameMission.condition) && p.c(this.player, liveGameMission.player) && p.c(this.viewer, liveGameMission.viewer) && p.c(this.coinBoost, liveGameMission.coinBoost);
        }
        return false;
    }

    public final CoinBoost getCoinBoost() {
        return this.coinBoost;
    }

    public final String getCondition() {
        return this.condition;
    }

    public final LiveGameMissionStatus getPlayer() {
        return this.player;
    }

    public final LiveGameMissionStatus getViewer() {
        return this.viewer;
    }

    public int hashCode() {
        int hashCode = ((((this.condition.hashCode() * 31) + this.player.hashCode()) * 31) + this.viewer.hashCode()) * 31;
        CoinBoost coinBoost = this.coinBoost;
        return hashCode + (coinBoost == null ? 0 : coinBoost.hashCode());
    }

    public String toString() {
        return "LiveGameMission(condition=" + this.condition + ", player=" + this.player + ", viewer=" + this.viewer + ", coinBoost=" + this.coinBoost + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        p.h(parcel, "out");
        parcel.writeString(this.condition);
        this.player.writeToParcel(parcel, i10);
        this.viewer.writeToParcel(parcel, i10);
        CoinBoost coinBoost = this.coinBoost;
        if (coinBoost == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        coinBoost.writeToParcel(parcel, i10);
    }
}
