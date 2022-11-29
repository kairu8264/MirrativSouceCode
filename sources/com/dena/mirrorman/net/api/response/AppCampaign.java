package com.dena.mirrorman.net.api.response;

import android.os.Parcel;
import android.os.Parcelable;
import jo.p;

/* loaded from: classes2.dex */
public final class AppCampaign implements Parcelable {
    private final String appId;
    private final String imageUrl;
    private final String url;
    public static final Parcelable.Creator<AppCampaign> CREATOR = new Creator();
    public static final int $stable = 8;

    /* loaded from: classes2.dex */
    public static final class Creator implements Parcelable.Creator<AppCampaign> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AppCampaign createFromParcel(Parcel parcel) {
            p.h(parcel, "parcel");
            return new AppCampaign(parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AppCampaign[] newArray(int i10) {
            return new AppCampaign[i10];
        }
    }

    public AppCampaign(String str, String str2, String str3) {
        p.h(str, "appId");
        p.h(str2, "imageUrl");
        p.h(str3, "url");
        this.appId = str;
        this.imageUrl = str2;
        this.url = str3;
    }

    public static /* synthetic */ AppCampaign copy$default(AppCampaign appCampaign, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = appCampaign.appId;
        }
        if ((i10 & 2) != 0) {
            str2 = appCampaign.imageUrl;
        }
        if ((i10 & 4) != 0) {
            str3 = appCampaign.url;
        }
        return appCampaign.copy(str, str2, str3);
    }

    public final String component1() {
        return this.appId;
    }

    public final String component2() {
        return this.imageUrl;
    }

    public final String component3() {
        return this.url;
    }

    public final AppCampaign copy(String str, String str2, String str3) {
        p.h(str, "appId");
        p.h(str2, "imageUrl");
        p.h(str3, "url");
        return new AppCampaign(str, str2, str3);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AppCampaign) {
            AppCampaign appCampaign = (AppCampaign) obj;
            return p.c(this.appId, appCampaign.appId) && p.c(this.imageUrl, appCampaign.imageUrl) && p.c(this.url, appCampaign.url);
        }
        return false;
    }

    public final String getAppId() {
        return this.appId;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return (((this.appId.hashCode() * 31) + this.imageUrl.hashCode()) * 31) + this.url.hashCode();
    }

    public String toString() {
        return "AppCampaign(appId=" + this.appId + ", imageUrl=" + this.imageUrl + ", url=" + this.url + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        p.h(parcel, "out");
        parcel.writeString(this.appId);
        parcel.writeString(this.imageUrl);
        parcel.writeString(this.url);
    }
}
