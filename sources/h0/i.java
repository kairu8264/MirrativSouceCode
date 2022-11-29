package h0;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    public static final l0.c1<h> f33897a = l0.r.d(a.f33898w);

    /* loaded from: classes.dex */
    public static final class a extends jo.q implements io.a<h> {

        /* renamed from: w  reason: collision with root package name */
        public static final a f33898w = new a();

        public a() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final h invoke() {
            return i.f(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 4095, null);
        }
    }

    public static final long a(h hVar, long j10) {
        jo.p.h(hVar, "$this$contentColorFor");
        if (!c1.c0.m(j10, hVar.h()) && !c1.c0.m(j10, hVar.i())) {
            if (!c1.c0.m(j10, hVar.j()) && !c1.c0.m(j10, hVar.k())) {
                return c1.c0.m(j10, hVar.a()) ? hVar.c() : c1.c0.m(j10, hVar.l()) ? hVar.g() : c1.c0.m(j10, hVar.b()) ? hVar.d() : c1.c0.f18634b.e();
            }
            return hVar.f();
        }
        return hVar.e();
    }

    public static final long b(long j10, l0.i iVar, int i10) {
        long a10 = a(q0.f34133a.a(iVar, 6), j10);
        return (a10 > c1.c0.f18634b.e() ? 1 : (a10 == c1.c0.f18634b.e() ? 0 : -1)) != 0 ? a10 : ((c1.c0) iVar.G(p.a())).u();
    }

    public static final l0.c1<h> c() {
        return f33897a;
    }

    public static final long d(h hVar) {
        jo.p.h(hVar, "<this>");
        return hVar.m() ? hVar.h() : hVar.l();
    }

    public static final h e(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21) {
        return new h(j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, true, null);
    }

    public static /* synthetic */ h f(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, int i10, Object obj) {
        return e((i10 & 1) != 0 ? c1.e0.c(4284612846L) : j10, (i10 & 2) != 0 ? c1.e0.c(4281794739L) : j11, (i10 & 4) != 0 ? c1.e0.c(4278442694L) : j12, (i10 & 8) != 0 ? c1.e0.c(4278290310L) : j13, (i10 & 16) != 0 ? c1.c0.f18634b.f() : j14, (i10 & 32) != 0 ? c1.c0.f18634b.f() : j15, (i10 & 64) != 0 ? c1.e0.c(4289724448L) : j16, (i10 & 128) != 0 ? c1.c0.f18634b.f() : j17, (i10 & 256) != 0 ? c1.c0.f18634b.a() : j18, (i10 & 512) != 0 ? c1.c0.f18634b.a() : j19, (i10 & 1024) != 0 ? c1.c0.f18634b.a() : j20, (i10 & 2048) != 0 ? c1.c0.f18634b.f() : j21);
    }
}
