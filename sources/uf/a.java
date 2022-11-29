package uf;

import m2.u;

/* loaded from: classes3.dex */
public final class a implements m1.a {

    /* renamed from: w  reason: collision with root package name */
    public final boolean f55837w;

    /* renamed from: x  reason: collision with root package name */
    public final boolean f55838x;

    public a(boolean z10, boolean z11) {
        this.f55837w = z10;
        this.f55838x = z11;
    }

    @Override // m1.a
    public Object b(long j10, long j11, ao.d<? super u> dVar) {
        long f10;
        f10 = b.f(j11, this.f55837w, this.f55838x);
        return u.b(f10);
    }

    @Override // m1.a
    public long c(long j10, long j11, int i10) {
        long e10;
        if (m1.f.d(i10, m1.f.f40505a.b())) {
            e10 = b.e(j11, this.f55837w, this.f55838x);
            return e10;
        }
        return b1.f.f16721b.c();
    }
}
