package com.dena.mirrativ.mirrativapi.livegame;

import android.os.Parcel;
import android.os.Parcelable;
import com.dena.mirrorman.clientlog.logs.MRLog;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import jo.p;

/* loaded from: classes2.dex */
public final class LiveGameListItem implements Parcelable {
    public static final Parcelable.Creator<LiveGameListItem> CREATOR = new Creator();
    private final String animatedBannerUrl;
    private final String appId;
    private final String bannerUrl;
    private final String description;
    private final String iconUrl;

    /* renamed from: id  reason: collision with root package name */
    private final String f21657id;
    private final boolean isOnlivePlayOnly;
    private final String logoUrl;
    private final LiveGameMission mission;
    private final Provider provider;
    private final String title;

    /* loaded from: classes2.dex */
    public static final class Creator implements Parcelable.Creator<LiveGameListItem> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LiveGameListItem createFromParcel(Parcel parcel) {
            p.h(parcel, "parcel");
            return new LiveGameListItem(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() == 0 ? null : LiveGameMission.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? Provider.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LiveGameListItem[] newArray(int i10) {
            return new LiveGameListItem[i10];
        }
    }

    public LiveGameListItem(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z10, LiveGameMission liveGameMission, Provider provider) {
        p.h(str, TtmlNode.ATTR_ID);
        p.h(str2, "title");
        p.h(str3, MRLog.PAYLOAD_KEY_DESCRIPTION);
        p.h(str4, "iconUrl");
        p.h(str5, "logoUrl");
        p.h(str6, "bannerUrl");
        p.h(str7, "animatedBannerUrl");
        p.h(str8, "appId");
        this.f21657id = str;
        this.title = str2;
        this.description = str3;
        this.iconUrl = str4;
        this.logoUrl = str5;
        this.bannerUrl = str6;
        this.animatedBannerUrl = str7;
        this.appId = str8;
        this.isOnlivePlayOnly = z10;
        this.mission = liveGameMission;
        this.provider = provider;
    }

    public final String component1() {
        return this.f21657id;
    }

    public final LiveGameMission component10() {
        return this.mission;
    }

    public final Provider component11() {
        return this.provider;
    }

    public final String component2() {
        return this.title;
    }

    public final String component3() {
        return this.description;
    }

    public final String component4() {
        return this.iconUrl;
    }

    public final String component5() {
        return this.logoUrl;
    }

    public final String component6() {
        return this.bannerUrl;
    }

    public final String component7() {
        return this.animatedBannerUrl;
    }

    public final String component8() {
        return this.appId;
    }

    public final boolean component9() {
        return this.isOnlivePlayOnly;
    }

    public final LiveGameListItem copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z10, LiveGameMission liveGameMission, Provider provider) {
        p.h(str, TtmlNode.ATTR_ID);
        p.h(str2, "title");
        p.h(str3, MRLog.PAYLOAD_KEY_DESCRIPTION);
        p.h(str4, "iconUrl");
        p.h(str5, "logoUrl");
        p.h(str6, "bannerUrl");
        p.h(str7, "animatedBannerUrl");
        p.h(str8, "appId");
        return new LiveGameListItem(str, str2, str3, str4, str5, str6, str7, str8, z10, liveGameMission, provider);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LiveGameListItem) {
            LiveGameListItem liveGameListItem = (LiveGameListItem) obj;
            return p.c(this.f21657id, liveGameListItem.f21657id) && p.c(this.title, liveGameListItem.title) && p.c(this.description, liveGameListItem.description) && p.c(this.iconUrl, liveGameListItem.iconUrl) && p.c(this.logoUrl, liveGameListItem.logoUrl) && p.c(this.bannerUrl, liveGameListItem.bannerUrl) && p.c(this.animatedBannerUrl, liveGameListItem.animatedBannerUrl) && p.c(this.appId, liveGameListItem.appId) && this.isOnlivePlayOnly == liveGameListItem.isOnlivePlayOnly && p.c(this.mission, liveGameListItem.mission) && p.c(this.provider, liveGameListItem.provider);
        }
        return false;
    }

    public final String getAnimatedBannerUrl() {
        return this.animatedBannerUrl;
    }

    public final String getAppId() {
        return this.appId;
    }

    public final String getBannerUrl() {
        return this.bannerUrl;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getIconUrl() {
        return this.iconUrl;
    }

    public final String getId() {
        return this.f21657id;
    }

    public final String getLogoUrl() {
        return this.logoUrl;
    }

    public final LiveGameMission getMission() {
        return this.mission;
    }

    public final Provider getProvider() {
        return this.provider;
    }

    public final String getTitle() {
        return this.title;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((((((((((((this.f21657id.hashCode() * 31) + this.title.hashCode()) * 31) + this.description.hashCode()) * 31) + this.iconUrl.hashCode()) * 31) + this.logoUrl.hashCode()) * 31) + this.bannerUrl.hashCode()) * 31) + this.animatedBannerUrl.hashCode()) * 31) + this.appId.hashCode()) * 31;
        boolean z10 = this.isOnlivePlayOnly;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        int i11 = (hashCode + i10) * 31;
        LiveGameMission liveGameMission = this.mission;
        int hashCode2 = (i11 + (liveGameMission == null ? 0 : liveGameMission.hashCode())) * 31;
        Provider provider = this.provider;
        return hashCode2 + (provider != null ? provider.hashCode() : 0);
    }

    public final boolean isOnlivePlayOnly() {
        return this.isOnlivePlayOnly;
    }

    public String toString() {
        return "LiveGameListItem(id=" + this.f21657id + ", title=" + this.title + ", description=" + this.description + ", iconUrl=" + this.iconUrl + ", logoUrl=" + this.logoUrl + ", bannerUrl=" + this.bannerUrl + ", animatedBannerUrl=" + this.animatedBannerUrl + ", appId=" + this.appId + ", isOnlivePlayOnly=" + this.isOnlivePlayOnly + ", mission=" + this.mission + ", provider=" + this.provider + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        p.h(parcel, "out");
        parcel.writeString(this.f21657id);
        parcel.writeString(this.title);
        parcel.writeString(this.description);
        parcel.writeString(this.iconUrl);
        parcel.writeString(this.logoUrl);
        parcel.writeString(this.bannerUrl);
        parcel.writeString(this.animatedBannerUrl);
        parcel.writeString(this.appId);
        parcel.writeInt(this.isOnlivePlayOnly ? 1 : 0);
        LiveGameMission liveGameMission = this.mission;
        if (liveGameMission == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            liveGameMission.writeToParcel(parcel, i10);
        }
        Provider provider = this.provider;
        if (provider == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        provider.writeToParcel(parcel, i10);
    }
}
