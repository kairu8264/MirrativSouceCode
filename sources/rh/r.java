package rh;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public class r extends sh.a {
    public static final Parcelable.Creator<r> CREATOR = new z0();
    public final int A;

    /* renamed from: w  reason: collision with root package name */
    public final int f51503w;

    /* renamed from: x  reason: collision with root package name */
    public final boolean f51504x;

    /* renamed from: y  reason: collision with root package name */
    public final boolean f51505y;

    /* renamed from: z  reason: collision with root package name */
    public final int f51506z;

    public r(int i10, boolean z10, boolean z11, int i11, int i12) {
        this.f51503w = i10;
        this.f51504x = z10;
        this.f51505y = z11;
        this.f51506z = i11;
        this.A = i12;
    }

    public int P() {
        return this.A;
    }

    public boolean S() {
        return this.f51504x;
    }

    public boolean U() {
        return this.f51505y;
    }

    public int k0() {
        return this.f51503w;
    }

    public int p() {
        return this.f51506z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = sh.b.a(parcel);
        sh.b.k(parcel, 1, k0());
        sh.b.c(parcel, 2, S());
        sh.b.c(parcel, 3, U());
        sh.b.k(parcel, 4, p());
        sh.b.k(parcel, 5, P());
        sh.b.b(parcel, a10);
    }
}
