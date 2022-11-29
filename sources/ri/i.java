package ri;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public final class i extends sh.a {
    public static final Parcelable.Creator<i> CREATOR = new j();

    /* renamed from: w  reason: collision with root package name */
    public final long f51539w;

    /* renamed from: x  reason: collision with root package name */
    public final a[] f51540x;

    /* renamed from: y  reason: collision with root package name */
    public final int f51541y;

    /* renamed from: z  reason: collision with root package name */
    public final boolean f51542z;

    public i(long j10, a[] aVarArr, int i10, boolean z10) {
        this.f51539w = j10;
        this.f51540x = aVarArr;
        this.f51542z = z10;
        if (z10) {
            this.f51541y = i10;
        } else {
            this.f51541y = -1;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = sh.b.a(parcel);
        sh.b.n(parcel, 2, this.f51539w);
        sh.b.t(parcel, 3, this.f51540x, i10, false);
        sh.b.k(parcel, 4, this.f51541y);
        sh.b.c(parcel, 5, this.f51542z);
        sh.b.b(parcel, a10);
    }
}
