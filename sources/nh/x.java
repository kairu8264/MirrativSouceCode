package nh;

import android.content.Context;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import yh.a;

/* loaded from: classes3.dex */
public final class x extends sh.a {
    public static final Parcelable.Creator<x> CREATOR = new y();
    public final boolean A;

    /* renamed from: w  reason: collision with root package name */
    public final String f43574w;

    /* renamed from: x  reason: collision with root package name */
    public final boolean f43575x;

    /* renamed from: y  reason: collision with root package name */
    public final boolean f43576y;

    /* renamed from: z  reason: collision with root package name */
    public final Context f43577z;

    public x(String str, boolean z10, boolean z11, IBinder iBinder, boolean z12) {
        this.f43574w = str;
        this.f43575x = z10;
        this.f43576y = z11;
        this.f43577z = (Context) yh.b.z0(a.AbstractBinderC1060a.s0(iBinder));
        this.A = z12;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [yh.a, android.os.IBinder] */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = sh.b.a(parcel);
        sh.b.q(parcel, 1, this.f43574w, false);
        sh.b.c(parcel, 2, this.f43575x);
        sh.b.c(parcel, 3, this.f43576y);
        sh.b.j(parcel, 4, yh.b.h1(this.f43577z), false);
        sh.b.c(parcel, 5, this.A);
        sh.b.b(parcel, a10);
    }
}
