package rh;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import rh.i;

/* loaded from: classes3.dex */
public final class p0 extends sh.a {
    public static final Parcelable.Creator<p0> CREATOR = new q0();
    public final boolean A;

    /* renamed from: w  reason: collision with root package name */
    public final int f51494w;

    /* renamed from: x  reason: collision with root package name */
    public final IBinder f51495x;

    /* renamed from: y  reason: collision with root package name */
    public final ConnectionResult f51496y;

    /* renamed from: z  reason: collision with root package name */
    public final boolean f51497z;

    public p0(int i10, IBinder iBinder, ConnectionResult connectionResult, boolean z10, boolean z11) {
        this.f51494w = i10;
        this.f51495x = iBinder;
        this.f51496y = connectionResult;
        this.f51497z = z10;
        this.A = z11;
    }

    public final i P() {
        IBinder iBinder = this.f51495x;
        if (iBinder == null) {
            return null;
        }
        return i.a.s0(iBinder);
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof p0) {
            p0 p0Var = (p0) obj;
            return this.f51496y.equals(p0Var.f51496y) && n.a(P(), p0Var.P());
        }
        return false;
    }

    public final ConnectionResult p() {
        return this.f51496y;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = sh.b.a(parcel);
        sh.b.k(parcel, 1, this.f51494w);
        sh.b.j(parcel, 2, this.f51495x, false);
        sh.b.p(parcel, 3, this.f51496y, i10, false);
        sh.b.c(parcel, 4, this.f51497z);
        sh.b.c(parcel, 5, this.A);
        sh.b.b(parcel, a10);
    }
}
