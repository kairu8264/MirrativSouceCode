package h0;

import l0.c2;

/* loaded from: classes.dex */
public final class q implements c {

    /* renamed from: a  reason: collision with root package name */
    public final long f34129a;

    /* renamed from: b  reason: collision with root package name */
    public final long f34130b;

    /* renamed from: c  reason: collision with root package name */
    public final long f34131c;

    /* renamed from: d  reason: collision with root package name */
    public final long f34132d;

    public q(long j10, long j11, long j12, long j13) {
        this.f34129a = j10;
        this.f34130b = j11;
        this.f34131c = j12;
        this.f34132d = j13;
    }

    public /* synthetic */ q(long j10, long j11, long j12, long j13, jo.h hVar) {
        this(j10, j11, j12, j13);
    }

    @Override // h0.c
    public c2<c1.c0> a(boolean z10, l0.i iVar, int i10) {
        iVar.x(-655254499);
        c2<c1.c0> l10 = l0.u1.l(c1.c0.g(z10 ? this.f34129a : this.f34131c), iVar, 0);
        iVar.O();
        return l10;
    }

    @Override // h0.c
    public c2<c1.c0> b(boolean z10, l0.i iVar, int i10) {
        iVar.x(-2133647540);
        c2<c1.c0> l10 = l0.u1.l(c1.c0.g(z10 ? this.f34130b : this.f34132d), iVar, 0);
        iVar.O();
        return l10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !jo.p.c(jo.f0.b(q.class), jo.f0.b(obj.getClass()))) {
            return false;
        }
        q qVar = (q) obj;
        return c1.c0.m(this.f34129a, qVar.f34129a) && c1.c0.m(this.f34130b, qVar.f34130b) && c1.c0.m(this.f34131c, qVar.f34131c) && c1.c0.m(this.f34132d, qVar.f34132d);
    }

    public int hashCode() {
        return (((((c1.c0.s(this.f34129a) * 31) + c1.c0.s(this.f34130b)) * 31) + c1.c0.s(this.f34131c)) * 31) + c1.c0.s(this.f34132d);
    }
}
