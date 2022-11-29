package pi;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public final class c extends sh.a {
    public static final Parcelable.Creator<c> CREATOR = new d();
    public boolean A;
    public String B;
    public final u C;
    public long D;
    public u E;
    public final long F;
    public final u G;

    /* renamed from: w  reason: collision with root package name */
    public String f47680w;

    /* renamed from: x  reason: collision with root package name */
    public String f47681x;

    /* renamed from: y  reason: collision with root package name */
    public ea f47682y;

    /* renamed from: z  reason: collision with root package name */
    public long f47683z;

    public c(c cVar) {
        rh.p.i(cVar);
        this.f47680w = cVar.f47680w;
        this.f47681x = cVar.f47681x;
        this.f47682y = cVar.f47682y;
        this.f47683z = cVar.f47683z;
        this.A = cVar.A;
        this.B = cVar.B;
        this.C = cVar.C;
        this.D = cVar.D;
        this.E = cVar.E;
        this.F = cVar.F;
        this.G = cVar.G;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = sh.b.a(parcel);
        sh.b.q(parcel, 2, this.f47680w, false);
        sh.b.q(parcel, 3, this.f47681x, false);
        sh.b.p(parcel, 4, this.f47682y, i10, false);
        sh.b.n(parcel, 5, this.f47683z);
        sh.b.c(parcel, 6, this.A);
        sh.b.q(parcel, 7, this.B, false);
        sh.b.p(parcel, 8, this.C, i10, false);
        sh.b.n(parcel, 9, this.D);
        sh.b.p(parcel, 10, this.E, i10, false);
        sh.b.n(parcel, 11, this.F);
        sh.b.p(parcel, 12, this.G, i10, false);
        sh.b.b(parcel, a10);
    }

    public c(String str, String str2, ea eaVar, long j10, boolean z10, String str3, u uVar, long j11, u uVar2, long j12, u uVar3) {
        this.f47680w = str;
        this.f47681x = str2;
        this.f47682y = eaVar;
        this.f47683z = j10;
        this.A = z10;
        this.B = str3;
        this.C = uVar;
        this.D = j11;
        this.E = uVar2;
        this.F = j12;
        this.G = uVar3;
    }
}
