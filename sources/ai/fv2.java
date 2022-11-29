package ai;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.ads.zzggm;

/* loaded from: classes3.dex */
public final class fv2 extends sh.a {
    public static final Parcelable.Creator<fv2> CREATOR = new gv2();

    /* renamed from: w  reason: collision with root package name */
    public final int f4216w;

    /* renamed from: x  reason: collision with root package name */
    public s64 f4217x = null;

    /* renamed from: y  reason: collision with root package name */
    public byte[] f4218y;

    public fv2(int i10, byte[] bArr) {
        this.f4216w = i10;
        this.f4218y = bArr;
        zzb();
    }

    public final s64 p() {
        if (this.f4217x == null) {
            try {
                this.f4217x = s64.x0(this.f4218y, di3.a());
                this.f4218y = null;
            } catch (zzggm | NullPointerException e10) {
                throw new IllegalStateException(e10);
            }
        }
        zzb();
        return this.f4217x;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = sh.b.a(parcel);
        sh.b.k(parcel, 1, this.f4216w);
        byte[] bArr = this.f4218y;
        if (bArr == null) {
            bArr = this.f4217x.L();
        }
        sh.b.f(parcel, 2, bArr, false);
        sh.b.b(parcel, a10);
    }

    public final void zzb() {
        s64 s64Var = this.f4217x;
        if (s64Var != null || this.f4218y == null) {
            if (s64Var == null || this.f4218y != null) {
                if (s64Var != null && this.f4218y != null) {
                    throw new IllegalStateException("Invalid internal representation - full");
                }
                if (s64Var != null || this.f4218y != null) {
                    throw new IllegalStateException("Impossible");
                }
                throw new IllegalStateException("Invalid internal representation - empty");
            }
        }
    }
}
