package com.twitter.sdk.android.core.internal.oauth;

import android.os.Parcel;
import android.os.Parcelable;
import in.r;

/* loaded from: classes4.dex */
public class g implements Parcelable {
    public static final Parcelable.Creator<g> CREATOR = new a();

    /* renamed from: w  reason: collision with root package name */
    public final r f28293w;

    /* renamed from: x  reason: collision with root package name */
    public final String f28294x;

    /* renamed from: y  reason: collision with root package name */
    public final long f28295y;

    /* loaded from: classes4.dex */
    public class a implements Parcelable.Creator<g> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public g createFromParcel(Parcel parcel) {
            return new g(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public g[] newArray(int i10) {
            return new g[i10];
        }
    }

    public /* synthetic */ g(Parcel parcel, a aVar) {
        this(parcel);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "authToken=" + this.f28293w + ",userName=" + this.f28294x + ",userId=" + this.f28295y;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f28293w, i10);
        parcel.writeString(this.f28294x);
        parcel.writeLong(this.f28295y);
    }

    public g(r rVar, String str, long j10) {
        this.f28293w = rVar;
        this.f28294x = str;
        this.f28295y = j10;
    }

    public g(Parcel parcel) {
        this.f28293w = (r) parcel.readParcelable(r.class.getClassLoader());
        this.f28294x = parcel.readString();
        this.f28295y = parcel.readLong();
    }
}
