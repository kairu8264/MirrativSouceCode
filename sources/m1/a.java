package m1;

import m2.u;

/* loaded from: classes.dex */
public interface a {
    static /* synthetic */ Object a(a aVar, long j10, ao.d dVar) {
        return u.b(u.f40549b.a());
    }

    static /* synthetic */ Object i(a aVar, long j10, long j11, ao.d dVar) {
        return u.b(u.f40549b.a());
    }

    default Object b(long j10, long j11, ao.d<? super u> dVar) {
        return i(this, j10, j11, dVar);
    }

    default long c(long j10, long j11, int i10) {
        return b1.f.f16721b.c();
    }

    default Object f(long j10, ao.d<? super u> dVar) {
        return a(this, j10, dVar);
    }

    default long g(long j10, int i10) {
        return b1.f.f16721b.c();
    }
}
