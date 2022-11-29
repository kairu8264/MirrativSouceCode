package com.dena.mirrativ.mirrativapi.livegame;

import android.os.Parcel;
import android.os.Parcelable;
import com.dena.mirrorman.clientlog.logs.MRLog;
import jo.p;

/* loaded from: classes2.dex */
public final class CoinBoost implements Parcelable {
    public static final Parcelable.Creator<CoinBoost> CREATOR = new Creator();
    private final String description;

    /* loaded from: classes2.dex */
    public static final class Creator implements Parcelable.Creator<CoinBoost> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CoinBoost createFromParcel(Parcel parcel) {
            p.h(parcel, "parcel");
            return new CoinBoost(parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CoinBoost[] newArray(int i10) {
            return new CoinBoost[i10];
        }
    }

    public CoinBoost(String str) {
        p.h(str, MRLog.PAYLOAD_KEY_DESCRIPTION);
        this.description = str;
    }

    public static /* synthetic */ CoinBoost copy$default(CoinBoost coinBoost, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = coinBoost.description;
        }
        return coinBoost.copy(str);
    }

    public final String component1() {
        return this.description;
    }

    public final CoinBoost copy(String str) {
        p.h(str, MRLog.PAYLOAD_KEY_DESCRIPTION);
        return new CoinBoost(str);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CoinBoost) && p.c(this.description, ((CoinBoost) obj).description);
    }

    public final String getDescription() {
        return this.description;
    }

    public int hashCode() {
        return this.description.hashCode();
    }

    public String toString() {
        return "CoinBoost(description=" + this.description + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        p.h(parcel, "out");
        parcel.writeString(this.description);
    }
}
