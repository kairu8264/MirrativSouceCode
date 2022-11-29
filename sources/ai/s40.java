package ai;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public final class s40 extends sh.a {
    public static final Parcelable.Creator<s40> CREATOR = new t40();
    public final String[] A;
    public final String[] B;
    public final boolean C;
    public final long D;

    /* renamed from: w  reason: collision with root package name */
    public final boolean f9710w;

    /* renamed from: x  reason: collision with root package name */
    public final String f9711x;

    /* renamed from: y  reason: collision with root package name */
    public final int f9712y;

    /* renamed from: z  reason: collision with root package name */
    public final byte[] f9713z;

    public s40(boolean z10, String str, int i10, byte[] bArr, String[] strArr, String[] strArr2, boolean z11, long j10) {
        this.f9710w = z10;
        this.f9711x = str;
        this.f9712y = i10;
        this.f9713z = bArr;
        this.A = strArr;
        this.B = strArr2;
        this.C = z11;
        this.D = j10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = sh.b.a(parcel);
        sh.b.c(parcel, 1, this.f9710w);
        sh.b.q(parcel, 2, this.f9711x, false);
        sh.b.k(parcel, 3, this.f9712y);
        sh.b.f(parcel, 4, this.f9713z, false);
        sh.b.r(parcel, 5, this.A, false);
        sh.b.r(parcel, 6, this.B, false);
        sh.b.c(parcel, 7, this.C);
        sh.b.n(parcel, 8, this.D);
        sh.b.b(parcel, a10);
    }
}
