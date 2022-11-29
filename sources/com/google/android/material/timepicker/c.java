package com.google.android.material.timepicker;

import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes3.dex */
public class c implements Parcelable {
    public static final Parcelable.Creator<c> CREATOR = new a();
    public int A;
    public int B;
    public int C;

    /* renamed from: w  reason: collision with root package name */
    public final com.google.android.material.timepicker.a f27886w;

    /* renamed from: x  reason: collision with root package name */
    public final com.google.android.material.timepicker.a f27887x;

    /* renamed from: y  reason: collision with root package name */
    public final int f27888y;

    /* renamed from: z  reason: collision with root package name */
    public int f27889z;

    /* loaded from: classes3.dex */
    public static class a implements Parcelable.Creator<c> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public c createFromParcel(Parcel parcel) {
            return new c(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public c[] newArray(int i10) {
            return new c[i10];
        }
    }

    public c() {
        this(0);
    }

    public static String a(Resources resources, CharSequence charSequence) {
        return b(resources, charSequence, "%02d");
    }

    public static String b(Resources resources, CharSequence charSequence, String str) {
        return String.format(resources.getConfiguration().locale, str, Integer.valueOf(Integer.parseInt(String.valueOf(charSequence))));
    }

    public static int c(int i10) {
        return i10 >= 12 ? 1 : 0;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            return this.f27889z == cVar.f27889z && this.A == cVar.A && this.f27888y == cVar.f27888y && this.B == cVar.B;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f27888y), Integer.valueOf(this.f27889z), Integer.valueOf(this.A), Integer.valueOf(this.B)});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f27889z);
        parcel.writeInt(this.A);
        parcel.writeInt(this.B);
        parcel.writeInt(this.f27888y);
    }

    public c(int i10) {
        this(0, 0, 10, i10);
    }

    public c(int i10, int i11, int i12, int i13) {
        this.f27889z = i10;
        this.A = i11;
        this.B = i12;
        this.f27888y = i13;
        this.C = c(i10);
        this.f27886w = new com.google.android.material.timepicker.a(59);
        this.f27887x = new com.google.android.material.timepicker.a(i13 == 1 ? 24 : 12);
    }

    public c(Parcel parcel) {
        this(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
    }
}
