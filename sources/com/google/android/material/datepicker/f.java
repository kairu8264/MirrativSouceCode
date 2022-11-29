package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.datepicker.a;
import java.util.Arrays;

/* loaded from: classes3.dex */
public class f implements a.c {
    public static final Parcelable.Creator<f> CREATOR = new a();

    /* renamed from: w  reason: collision with root package name */
    public final long f27536w;

    /* loaded from: classes3.dex */
    public static class a implements Parcelable.Creator<f> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public f createFromParcel(Parcel parcel) {
            return new f(parcel.readLong(), null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public f[] newArray(int i10) {
            return new f[i10];
        }
    }

    public /* synthetic */ f(long j10, a aVar) {
        this(j10);
    }

    public static f a(long j10) {
        return new f(j10);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && this.f27536w == ((f) obj).f27536w;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f27536w)});
    }

    @Override // com.google.android.material.datepicker.a.c
    public boolean p0(long j10) {
        return j10 >= this.f27536w;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f27536w);
    }

    public f(long j10) {
        this.f27536w = j10;
    }
}
