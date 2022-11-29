package bp;

import uo.s1;

/* loaded from: classes4.dex */
public class f extends s1 {
    public final long A;
    public final String B;
    public a C = h0();

    /* renamed from: y  reason: collision with root package name */
    public final int f18567y;

    /* renamed from: z  reason: collision with root package name */
    public final int f18568z;

    public f(int i10, int i11, long j10, String str) {
        this.f18567y = i10;
        this.f18568z = i11;
        this.A = j10;
        this.B = str;
    }

    @Override // uo.k0
    public void X(ao.g gVar, Runnable runnable) {
        a.j(this.C, runnable, null, false, 6, null);
    }

    @Override // uo.k0
    public void Y(ao.g gVar, Runnable runnable) {
        a.j(this.C, runnable, null, true, 2, null);
    }

    public final a h0() {
        return new a(this.f18567y, this.f18568z, this.A, this.B);
    }

    public final void i0(Runnable runnable, i iVar, boolean z10) {
        this.C.i(runnable, iVar, z10);
    }
}
