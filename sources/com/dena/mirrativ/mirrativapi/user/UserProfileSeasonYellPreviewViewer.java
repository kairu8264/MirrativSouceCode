package com.dena.mirrativ.mirrativapi.user;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import jo.h;
import jo.p;

/* loaded from: classes2.dex */
public final class UserProfileSeasonYellPreviewViewer implements Parcelable, Serializable {
    public static final Parcelable.Creator<UserProfileSeasonYellPreviewViewer> CREATOR = new Creator();
    private final String badgeImageUrl;
    private final String profileImageUrl;

    /* loaded from: classes2.dex */
    public static final class Creator implements Parcelable.Creator<UserProfileSeasonYellPreviewViewer> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UserProfileSeasonYellPreviewViewer createFromParcel(Parcel parcel) {
            p.h(parcel, "parcel");
            return new UserProfileSeasonYellPreviewViewer(parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UserProfileSeasonYellPreviewViewer[] newArray(int i10) {
            return new UserProfileSeasonYellPreviewViewer[i10];
        }
    }

    public UserProfileSeasonYellPreviewViewer() {
        this(null, null, 3, null);
    }

    public UserProfileSeasonYellPreviewViewer(String str, String str2) {
        p.h(str, "profileImageUrl");
        p.h(str2, "badgeImageUrl");
        this.profileImageUrl = str;
        this.badgeImageUrl = str2;
    }

    public static /* synthetic */ UserProfileSeasonYellPreviewViewer copy$default(UserProfileSeasonYellPreviewViewer userProfileSeasonYellPreviewViewer, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = userProfileSeasonYellPreviewViewer.profileImageUrl;
        }
        if ((i10 & 2) != 0) {
            str2 = userProfileSeasonYellPreviewViewer.badgeImageUrl;
        }
        return userProfileSeasonYellPreviewViewer.copy(str, str2);
    }

    public final String component1() {
        return this.profileImageUrl;
    }

    public final String component2() {
        return this.badgeImageUrl;
    }

    public final UserProfileSeasonYellPreviewViewer copy(String str, String str2) {
        p.h(str, "profileImageUrl");
        p.h(str2, "badgeImageUrl");
        return new UserProfileSeasonYellPreviewViewer(str, str2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof UserProfileSeasonYellPreviewViewer) {
            UserProfileSeasonYellPreviewViewer userProfileSeasonYellPreviewViewer = (UserProfileSeasonYellPreviewViewer) obj;
            return p.c(this.profileImageUrl, userProfileSeasonYellPreviewViewer.profileImageUrl) && p.c(this.badgeImageUrl, userProfileSeasonYellPreviewViewer.badgeImageUrl);
        }
        return false;
    }

    public final String getBadgeImageUrl() {
        return this.badgeImageUrl;
    }

    public final String getProfileImageUrl() {
        return this.profileImageUrl;
    }

    public int hashCode() {
        return (this.profileImageUrl.hashCode() * 31) + this.badgeImageUrl.hashCode();
    }

    public String toString() {
        return "UserProfileSeasonYellPreviewViewer(profileImageUrl=" + this.profileImageUrl + ", badgeImageUrl=" + this.badgeImageUrl + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        p.h(parcel, "out");
        parcel.writeString(this.profileImageUrl);
        parcel.writeString(this.badgeImageUrl);
    }

    public /* synthetic */ UserProfileSeasonYellPreviewViewer(String str, String str2, int i10, h hVar) {
        this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? "" : str2);
    }
}
