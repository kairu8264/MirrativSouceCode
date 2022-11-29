package com.dena.mirrorman.net.api.response.live;

import android.os.Parcel;
import android.os.Parcelable;
import jo.h;
import jo.p;

/* loaded from: classes2.dex */
public final class LivePreview implements Parcelable {
    private String streamingUrlEdge;
    private String streamingUrlHls;
    public static final Parcelable.Creator<LivePreview> CREATOR = new Creator();
    public static final int $stable = 8;

    /* loaded from: classes2.dex */
    public static final class Creator implements Parcelable.Creator<LivePreview> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LivePreview createFromParcel(Parcel parcel) {
            p.h(parcel, "parcel");
            return new LivePreview(parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LivePreview[] newArray(int i10) {
            return new LivePreview[i10];
        }
    }

    public LivePreview() {
        this(null, null, 3, null);
    }

    public LivePreview(String str, String str2) {
        this.streamingUrlHls = str;
        this.streamingUrlEdge = str2;
    }

    public static /* synthetic */ LivePreview copy$default(LivePreview livePreview, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = livePreview.streamingUrlHls;
        }
        if ((i10 & 2) != 0) {
            str2 = livePreview.streamingUrlEdge;
        }
        return livePreview.copy(str, str2);
    }

    public final String component1() {
        return this.streamingUrlHls;
    }

    public final String component2() {
        return this.streamingUrlEdge;
    }

    public final LivePreview copy(String str, String str2) {
        return new LivePreview(str, str2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LivePreview) {
            LivePreview livePreview = (LivePreview) obj;
            return p.c(this.streamingUrlHls, livePreview.streamingUrlHls) && p.c(this.streamingUrlEdge, livePreview.streamingUrlEdge);
        }
        return false;
    }

    public final String getStreamingUrlEdge() {
        return this.streamingUrlEdge;
    }

    public final String getStreamingUrlHls() {
        return this.streamingUrlHls;
    }

    public int hashCode() {
        String str = this.streamingUrlHls;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.streamingUrlEdge;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final void setStreamingUrlEdge(String str) {
        this.streamingUrlEdge = str;
    }

    public final void setStreamingUrlHls(String str) {
        this.streamingUrlHls = str;
    }

    public String toString() {
        return "LivePreview(streamingUrlHls=" + this.streamingUrlHls + ", streamingUrlEdge=" + this.streamingUrlEdge + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        p.h(parcel, "out");
        parcel.writeString(this.streamingUrlHls);
        parcel.writeString(this.streamingUrlEdge);
    }

    public /* synthetic */ LivePreview(String str, String str2, int i10, h hVar) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2);
    }
}
