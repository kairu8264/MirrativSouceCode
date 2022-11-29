package com.dena.mirrativ.mirrativapi.user;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import jo.h;
import jo.p;
import xn.s;

/* loaded from: classes2.dex */
public final class UserProfileSeasonYell implements Parcelable, Serializable {
    public static final Parcelable.Creator<UserProfileSeasonYell> CREATOR = new Creator();
    private final boolean isDisplayTarget;
    private final List<UserProfileSeasonYellPreviewViewer> previewViewers;
    private final int totalViewerCount;

    /* loaded from: classes2.dex */
    public static final class Creator implements Parcelable.Creator<UserProfileSeasonYell> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UserProfileSeasonYell createFromParcel(Parcel parcel) {
            p.h(parcel, "parcel");
            boolean z10 = parcel.readInt() != 0;
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt2);
            for (int i10 = 0; i10 != readInt2; i10++) {
                arrayList.add(UserProfileSeasonYellPreviewViewer.CREATOR.createFromParcel(parcel));
            }
            return new UserProfileSeasonYell(z10, readInt, arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UserProfileSeasonYell[] newArray(int i10) {
            return new UserProfileSeasonYell[i10];
        }
    }

    public UserProfileSeasonYell() {
        this(false, 0, null, 7, null);
    }

    public UserProfileSeasonYell(boolean z10, int i10, List<UserProfileSeasonYellPreviewViewer> list) {
        p.h(list, "previewViewers");
        this.isDisplayTarget = z10;
        this.totalViewerCount = i10;
        this.previewViewers = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UserProfileSeasonYell copy$default(UserProfileSeasonYell userProfileSeasonYell, boolean z10, int i10, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z10 = userProfileSeasonYell.isDisplayTarget;
        }
        if ((i11 & 2) != 0) {
            i10 = userProfileSeasonYell.totalViewerCount;
        }
        if ((i11 & 4) != 0) {
            list = userProfileSeasonYell.previewViewers;
        }
        return userProfileSeasonYell.copy(z10, i10, list);
    }

    public final boolean component1() {
        return this.isDisplayTarget;
    }

    public final int component2() {
        return this.totalViewerCount;
    }

    public final List<UserProfileSeasonYellPreviewViewer> component3() {
        return this.previewViewers;
    }

    public final UserProfileSeasonYell copy(boolean z10, int i10, List<UserProfileSeasonYellPreviewViewer> list) {
        p.h(list, "previewViewers");
        return new UserProfileSeasonYell(z10, i10, list);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof UserProfileSeasonYell) {
            UserProfileSeasonYell userProfileSeasonYell = (UserProfileSeasonYell) obj;
            return this.isDisplayTarget == userProfileSeasonYell.isDisplayTarget && this.totalViewerCount == userProfileSeasonYell.totalViewerCount && p.c(this.previewViewers, userProfileSeasonYell.previewViewers);
        }
        return false;
    }

    public final List<UserProfileSeasonYellPreviewViewer> getPreviewViewers() {
        return this.previewViewers;
    }

    public final int getTotalViewerCount() {
        return this.totalViewerCount;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    public int hashCode() {
        boolean z10 = this.isDisplayTarget;
        ?? r02 = z10;
        if (z10) {
            r02 = 1;
        }
        return (((r02 * 31) + Integer.hashCode(this.totalViewerCount)) * 31) + this.previewViewers.hashCode();
    }

    public final boolean isDisplayTarget() {
        return this.isDisplayTarget;
    }

    public String toString() {
        return "UserProfileSeasonYell(isDisplayTarget=" + this.isDisplayTarget + ", totalViewerCount=" + this.totalViewerCount + ", previewViewers=" + this.previewViewers + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        p.h(parcel, "out");
        parcel.writeInt(this.isDisplayTarget ? 1 : 0);
        parcel.writeInt(this.totalViewerCount);
        List<UserProfileSeasonYellPreviewViewer> list = this.previewViewers;
        parcel.writeInt(list.size());
        for (UserProfileSeasonYellPreviewViewer userProfileSeasonYellPreviewViewer : list) {
            userProfileSeasonYellPreviewViewer.writeToParcel(parcel, i10);
        }
    }

    public /* synthetic */ UserProfileSeasonYell(boolean z10, int i10, List list, int i11, h hVar) {
        this((i11 & 1) != 0 ? false : z10, (i11 & 2) != 0 ? 0 : i10, (i11 & 4) != 0 ? s.k() : list);
    }
}
