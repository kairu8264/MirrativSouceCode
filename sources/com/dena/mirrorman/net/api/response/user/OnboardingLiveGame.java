package com.dena.mirrorman.net.api.response.user;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import jo.p;

/* loaded from: classes2.dex */
public final class OnboardingLiveGame implements Parcelable {
    private final String appId;

    /* renamed from: id  reason: collision with root package name */
    private final String f26177id;
    public static final Parcelable.Creator<OnboardingLiveGame> CREATOR = new Creator();
    public static final int $stable = 8;

    /* loaded from: classes2.dex */
    public static final class Creator implements Parcelable.Creator<OnboardingLiveGame> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OnboardingLiveGame createFromParcel(Parcel parcel) {
            p.h(parcel, "parcel");
            return new OnboardingLiveGame(parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OnboardingLiveGame[] newArray(int i10) {
            return new OnboardingLiveGame[i10];
        }
    }

    public OnboardingLiveGame(String str, String str2) {
        p.h(str, TtmlNode.ATTR_ID);
        p.h(str2, "appId");
        this.f26177id = str;
        this.appId = str2;
    }

    public static /* synthetic */ OnboardingLiveGame copy$default(OnboardingLiveGame onboardingLiveGame, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = onboardingLiveGame.f26177id;
        }
        if ((i10 & 2) != 0) {
            str2 = onboardingLiveGame.appId;
        }
        return onboardingLiveGame.copy(str, str2);
    }

    public final String component1() {
        return this.f26177id;
    }

    public final String component2() {
        return this.appId;
    }

    public final OnboardingLiveGame copy(String str, String str2) {
        p.h(str, TtmlNode.ATTR_ID);
        p.h(str2, "appId");
        return new OnboardingLiveGame(str, str2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OnboardingLiveGame) {
            OnboardingLiveGame onboardingLiveGame = (OnboardingLiveGame) obj;
            return p.c(this.f26177id, onboardingLiveGame.f26177id) && p.c(this.appId, onboardingLiveGame.appId);
        }
        return false;
    }

    public final String getAppId() {
        return this.appId;
    }

    public final String getId() {
        return this.f26177id;
    }

    public int hashCode() {
        return (this.f26177id.hashCode() * 31) + this.appId.hashCode();
    }

    public String toString() {
        return "OnboardingLiveGame(id=" + this.f26177id + ", appId=" + this.appId + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        p.h(parcel, "out");
        parcel.writeString(this.f26177id);
        parcel.writeString(this.appId);
    }
}
