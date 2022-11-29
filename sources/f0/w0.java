package f0;

import l0.u1;

/* loaded from: classes.dex */
public final class w0 {

    /* renamed from: a  reason: collision with root package name */
    public d0 f31652a;

    /* renamed from: b  reason: collision with root package name */
    public final long f31653b;

    /* renamed from: c  reason: collision with root package name */
    public io.l<? super y1.z, wn.v> f31654c;

    /* renamed from: d  reason: collision with root package name */
    public g0.i f31655d;

    /* renamed from: e  reason: collision with root package name */
    public q1.q f31656e;

    /* renamed from: f  reason: collision with root package name */
    public y1.z f31657f;

    /* renamed from: g  reason: collision with root package name */
    public long f31658g;

    /* renamed from: h  reason: collision with root package name */
    public long f31659h;

    /* renamed from: i  reason: collision with root package name */
    public final l0.s0 f31660i;

    /* loaded from: classes.dex */
    public static final class a extends jo.q implements io.l<y1.z, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public static final a f31661w = new a();

        public a() {
            super(1);
        }

        public final void a(y1.z zVar) {
            jo.p.h(zVar, "it");
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(y1.z zVar) {
            a(zVar);
            return wn.v.f59242a;
        }
    }

    public w0(d0 d0Var, long j10) {
        jo.p.h(d0Var, "textDelegate");
        this.f31652a = d0Var;
        this.f31653b = j10;
        this.f31654c = a.f31661w;
        this.f31658g = b1.f.f16721b.c();
        this.f31659h = c1.c0.f18634b.e();
        this.f31660i = u1.f(wn.v.f59242a, u1.h());
    }

    public final wn.v a() {
        this.f31660i.getValue();
        return wn.v.f59242a;
    }

    public final q1.q b() {
        return this.f31656e;
    }

    public final y1.z c() {
        return this.f31657f;
    }

    public final io.l<y1.z, wn.v> d() {
        return this.f31654c;
    }

    public final long e() {
        return this.f31658g;
    }

    public final g0.i f() {
        return this.f31655d;
    }

    public final long g() {
        return this.f31653b;
    }

    public final d0 h() {
        return this.f31652a;
    }

    public final void i(wn.v vVar) {
        this.f31660i.setValue(vVar);
    }

    public final void j(q1.q qVar) {
        this.f31656e = qVar;
    }

    public final void k(y1.z zVar) {
        i(wn.v.f59242a);
        this.f31657f = zVar;
    }

    public final void l(io.l<? super y1.z, wn.v> lVar) {
        jo.p.h(lVar, "<set-?>");
        this.f31654c = lVar;
    }

    public final void m(long j10) {
        this.f31658g = j10;
    }

    public final void n(g0.i iVar) {
        this.f31655d = iVar;
    }

    public final void o(long j10) {
        this.f31659h = j10;
    }

    public final void p(d0 d0Var) {
        jo.p.h(d0Var, "<set-?>");
        this.f31652a = d0Var;
    }
}
