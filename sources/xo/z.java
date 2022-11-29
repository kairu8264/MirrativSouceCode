package xo;

import uo.u0;

/* loaded from: classes4.dex */
public final class z extends yo.c<x<?>> {

    /* renamed from: a  reason: collision with root package name */
    public long f60632a = -1;

    /* renamed from: b  reason: collision with root package name */
    public ao.d<? super wn.v> f60633b;

    @Override // yo.c
    /* renamed from: c */
    public boolean a(x<?> xVar) {
        if (this.f60632a >= 0) {
            return false;
        }
        this.f60632a = xVar.Y();
        return true;
    }

    @Override // yo.c
    /* renamed from: d */
    public ao.d<wn.v>[] b(x<?> xVar) {
        if (u0.a()) {
            if (!(this.f60632a >= 0)) {
                throw new AssertionError();
            }
        }
        long j10 = this.f60632a;
        this.f60632a = -1L;
        this.f60633b = null;
        return xVar.X(j10);
    }
}
