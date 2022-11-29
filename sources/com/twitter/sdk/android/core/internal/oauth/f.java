package com.twitter.sdk.android.core.internal.oauth;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes4.dex */
public class f extends in.a implements Parcelable {
    public static final Parcelable.Creator<f> CREATOR = new a();
    @ym.c("token_type")

    /* renamed from: x  reason: collision with root package name */
    private final String f28291x;
    @ym.c("access_token")

    /* renamed from: y  reason: collision with root package name */
    private final String f28292y;

    /* loaded from: classes4.dex */
    public class a implements Parcelable.Creator<f> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public f createFromParcel(Parcel parcel) {
            return new f(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public f[] newArray(int i10) {
            return new f[i10];
        }
    }

    public /* synthetic */ f(Parcel parcel, a aVar) {
        this(parcel);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        f fVar = (f) obj;
        String str = this.f28292y;
        if (str == null ? fVar.f28292y == null : str.equals(fVar.f28292y)) {
            String str2 = this.f28291x;
            String str3 = fVar.f28291x;
            return str2 != null ? str2.equals(str3) : str3 == null;
        }
        return false;
    }

    public int hashCode() {
        String str = this.f28291x;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f28292y;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f28291x);
        parcel.writeString(this.f28292y);
    }

    public f(Parcel parcel) {
        this.f28291x = parcel.readString();
        this.f28292y = parcel.readString();
    }
}
