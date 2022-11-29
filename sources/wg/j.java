package wg;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public final class j extends sh.a {
    public static final Parcelable.Creator<j> CREATOR = new k();
    public final float A;
    public final int B;
    public final boolean C;
    public final boolean D;
    public final boolean E;

    /* renamed from: w  reason: collision with root package name */
    public final boolean f58713w;

    /* renamed from: x  reason: collision with root package name */
    public final boolean f58714x;

    /* renamed from: y  reason: collision with root package name */
    public final String f58715y;

    /* renamed from: z  reason: collision with root package name */
    public final boolean f58716z;

    public j(boolean z10, boolean z11, String str, boolean z12, float f10, int i10, boolean z13, boolean z14, boolean z15) {
        this.f58713w = z10;
        this.f58714x = z11;
        this.f58715y = str;
        this.f58716z = z12;
        this.A = f10;
        this.B = i10;
        this.C = z13;
        this.D = z14;
        this.E = z15;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = sh.b.a(parcel);
        sh.b.c(parcel, 2, this.f58713w);
        sh.b.c(parcel, 3, this.f58714x);
        sh.b.q(parcel, 4, this.f58715y, false);
        sh.b.c(parcel, 5, this.f58716z);
        sh.b.h(parcel, 6, this.A);
        sh.b.k(parcel, 7, this.B);
        sh.b.c(parcel, 8, this.C);
        sh.b.c(parcel, 9, this.D);
        sh.b.c(parcel, 10, this.E);
        sh.b.b(parcel, a10);
    }

    public j(boolean z10, boolean z11, boolean z12, float f10, int i10, boolean z13, boolean z14, boolean z15) {
        this(z10, z11, null, z12, f10, -1, z13, z14, z15);
    }
}
