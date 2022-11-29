package rh;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public final class g1 extends sh.a {
    public static final Parcelable.Creator<g1> CREATOR = new h1();

    /* renamed from: w  reason: collision with root package name */
    public Bundle f51449w;

    /* renamed from: x  reason: collision with root package name */
    public nh.c[] f51450x;

    /* renamed from: y  reason: collision with root package name */
    public int f51451y;

    /* renamed from: z  reason: collision with root package name */
    public e f51452z;

    public g1() {
    }

    public g1(Bundle bundle, nh.c[] cVarArr, int i10, e eVar) {
        this.f51449w = bundle;
        this.f51450x = cVarArr;
        this.f51451y = i10;
        this.f51452z = eVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = sh.b.a(parcel);
        sh.b.e(parcel, 1, this.f51449w, false);
        sh.b.t(parcel, 2, this.f51450x, i10, false);
        sh.b.k(parcel, 3, this.f51451y);
        sh.b.p(parcel, 4, this.f51452z, i10, false);
        sh.b.b(parcel, a10);
    }
}
