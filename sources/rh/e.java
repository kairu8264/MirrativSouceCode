package rh;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public class e extends sh.a {
    public static final Parcelable.Creator<e> CREATOR = new i1();
    public final int A;
    public final int[] B;

    /* renamed from: w  reason: collision with root package name */
    public final r f51433w;

    /* renamed from: x  reason: collision with root package name */
    public final boolean f51434x;

    /* renamed from: y  reason: collision with root package name */
    public final boolean f51435y;

    /* renamed from: z  reason: collision with root package name */
    public final int[] f51436z;

    public e(r rVar, boolean z10, boolean z11, int[] iArr, int i10, int[] iArr2) {
        this.f51433w = rVar;
        this.f51434x = z10;
        this.f51435y = z11;
        this.f51436z = iArr;
        this.A = i10;
        this.B = iArr2;
    }

    public int[] P() {
        return this.f51436z;
    }

    public int[] S() {
        return this.B;
    }

    public boolean U() {
        return this.f51434x;
    }

    public boolean k0() {
        return this.f51435y;
    }

    public int p() {
        return this.A;
    }

    public final r r0() {
        return this.f51433w;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = sh.b.a(parcel);
        sh.b.p(parcel, 1, this.f51433w, i10, false);
        sh.b.c(parcel, 2, U());
        sh.b.c(parcel, 3, k0());
        sh.b.l(parcel, 4, P(), false);
        sh.b.k(parcel, 5, p());
        sh.b.l(parcel, 6, S(), false);
        sh.b.b(parcel, a10);
    }
}
