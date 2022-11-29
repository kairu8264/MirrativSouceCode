package h0;

import l0.c2;

/* loaded from: classes.dex */
public final class u implements m1 {

    /* renamed from: a  reason: collision with root package name */
    public final long f34226a;

    /* renamed from: b  reason: collision with root package name */
    public final long f34227b;

    /* renamed from: c  reason: collision with root package name */
    public final long f34228c;

    /* renamed from: d  reason: collision with root package name */
    public final long f34229d;

    /* renamed from: e  reason: collision with root package name */
    public final long f34230e;

    /* renamed from: f  reason: collision with root package name */
    public final long f34231f;

    /* renamed from: g  reason: collision with root package name */
    public final long f34232g;

    /* renamed from: h  reason: collision with root package name */
    public final long f34233h;

    public u(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17) {
        this.f34226a = j10;
        this.f34227b = j11;
        this.f34228c = j12;
        this.f34229d = j13;
        this.f34230e = j14;
        this.f34231f = j15;
        this.f34232g = j16;
        this.f34233h = j17;
    }

    public /* synthetic */ u(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, jo.h hVar) {
        this(j10, j11, j12, j13, j14, j15, j16, j17);
    }

    @Override // h0.m1
    public c2<c1.c0> a(boolean z10, boolean z11, l0.i iVar, int i10) {
        long j10;
        iVar.x(-66424183);
        if (z10) {
            j10 = z11 ? this.f34226a : this.f34228c;
        } else {
            j10 = z11 ? this.f34230e : this.f34232g;
        }
        c2<c1.c0> l10 = l0.u1.l(c1.c0.g(j10), iVar, 0);
        iVar.O();
        return l10;
    }

    @Override // h0.m1
    public c2<c1.c0> b(boolean z10, boolean z11, l0.i iVar, int i10) {
        long j10;
        iVar.x(-1176343362);
        if (z10) {
            j10 = z11 ? this.f34227b : this.f34229d;
        } else {
            j10 = z11 ? this.f34231f : this.f34233h;
        }
        c2<c1.c0> l10 = l0.u1.l(c1.c0.g(j10), iVar, 0);
        iVar.O();
        return l10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !jo.p.c(jo.f0.b(u.class), jo.f0.b(obj.getClass()))) {
            return false;
        }
        u uVar = (u) obj;
        return c1.c0.m(this.f34226a, uVar.f34226a) && c1.c0.m(this.f34227b, uVar.f34227b) && c1.c0.m(this.f34228c, uVar.f34228c) && c1.c0.m(this.f34229d, uVar.f34229d) && c1.c0.m(this.f34230e, uVar.f34230e) && c1.c0.m(this.f34231f, uVar.f34231f) && c1.c0.m(this.f34232g, uVar.f34232g) && c1.c0.m(this.f34233h, uVar.f34233h);
    }

    public int hashCode() {
        return (((((((((((((c1.c0.s(this.f34226a) * 31) + c1.c0.s(this.f34227b)) * 31) + c1.c0.s(this.f34228c)) * 31) + c1.c0.s(this.f34229d)) * 31) + c1.c0.s(this.f34230e)) * 31) + c1.c0.s(this.f34231f)) * 31) + c1.c0.s(this.f34232g)) * 31) + c1.c0.s(this.f34233h);
    }
}
