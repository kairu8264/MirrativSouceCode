package f0;

import d2.l;
import java.util.List;
import y1.a;

/* loaded from: classes.dex */
public final class d0 {

    /* renamed from: k  reason: collision with root package name */
    public static final a f31368k = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final y1.a f31369a;

    /* renamed from: b  reason: collision with root package name */
    public final y1.d0 f31370b;

    /* renamed from: c  reason: collision with root package name */
    public final int f31371c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f31372d;

    /* renamed from: e  reason: collision with root package name */
    public final int f31373e;

    /* renamed from: f  reason: collision with root package name */
    public final m2.d f31374f;

    /* renamed from: g  reason: collision with root package name */
    public final l.b f31375g;

    /* renamed from: h  reason: collision with root package name */
    public final List<a.b<y1.p>> f31376h;

    /* renamed from: i  reason: collision with root package name */
    public y1.e f31377i;

    /* renamed from: j  reason: collision with root package name */
    public m2.q f31378j;

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final void a(c1.w wVar, y1.z zVar) {
            jo.p.h(wVar, "canvas");
            jo.p.h(zVar, "textLayoutResult");
            y1.a0.f61062a.a(wVar, zVar);
        }
    }

    public d0(y1.a aVar, y1.d0 d0Var, int i10, boolean z10, int i11, m2.d dVar, l.b bVar, List<a.b<y1.p>> list) {
        this.f31369a = aVar;
        this.f31370b = d0Var;
        this.f31371c = i10;
        this.f31372d = z10;
        this.f31373e = i11;
        this.f31374f = dVar;
        this.f31375g = bVar;
        this.f31376h = list;
        if (!(i10 > 0)) {
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    public /* synthetic */ d0(y1.a aVar, y1.d0 d0Var, int i10, boolean z10, int i11, m2.d dVar, l.b bVar, List list, jo.h hVar) {
        this(aVar, d0Var, i10, z10, i11, dVar, bVar, list);
    }

    public static /* synthetic */ y1.z m(d0 d0Var, long j10, m2.q qVar, y1.z zVar, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            zVar = null;
        }
        return d0Var.l(j10, qVar, zVar);
    }

    public final m2.d a() {
        return this.f31374f;
    }

    public final l.b b() {
        return this.f31375g;
    }

    public final int c() {
        return (int) Math.ceil(f().c());
    }

    public final int d() {
        return this.f31371c;
    }

    public final int e() {
        return (int) Math.ceil(f().a());
    }

    public final y1.e f() {
        y1.e eVar = this.f31377i;
        if (eVar != null) {
            return eVar;
        }
        throw new IllegalStateException("layoutIntrinsics must be called first");
    }

    public final int g() {
        return this.f31373e;
    }

    public final List<a.b<y1.p>> h() {
        return this.f31376h;
    }

    public final boolean i() {
        return this.f31372d;
    }

    public final y1.d0 j() {
        return this.f31370b;
    }

    public final y1.a k() {
        return this.f31369a;
    }

    public final y1.z l(long j10, m2.q qVar, y1.z zVar) {
        jo.p.h(qVar, "layoutDirection");
        if (zVar != null && s0.a(zVar, this.f31369a, this.f31370b, this.f31376h, this.f31371c, this.f31372d, this.f31373e, this.f31374f, qVar, this.f31375g, j10)) {
            return zVar.a(new y1.y(zVar.k().j(), this.f31370b, zVar.k().g(), zVar.k().e(), zVar.k().h(), zVar.k().f(), zVar.k().b(), zVar.k().d(), zVar.k().c(), j10, (jo.h) null), m2.c.d(j10, m2.p.a((int) Math.ceil(zVar.v().y()), (int) Math.ceil(zVar.v().g()))));
        }
        y1.d o10 = o(j10, qVar);
        return new y1.z(new y1.y(this.f31369a, this.f31370b, this.f31376h, this.f31371c, this.f31372d, this.f31373e, this.f31374f, qVar, this.f31375g, j10, (jo.h) null), o10, m2.c.d(j10, m2.p.a((int) Math.ceil(o10.y()), (int) Math.ceil(o10.g()))), null);
    }

    public final void n(m2.q qVar) {
        jo.p.h(qVar, "layoutDirection");
        y1.e eVar = this.f31377i;
        if (eVar == null || qVar != this.f31378j || eVar.b()) {
            this.f31378j = qVar;
            eVar = new y1.e(this.f31369a, y1.e0.c(this.f31370b, qVar), this.f31376h, this.f31374f, this.f31375g);
        }
        this.f31377i = eVar;
    }

    public final y1.d o(long j10, m2.q qVar) {
        n(qVar);
        int p10 = m2.b.p(j10);
        boolean z10 = false;
        int n10 = ((this.f31372d || j2.k.d(this.f31373e, j2.k.f37107a.b())) && m2.b.j(j10)) ? m2.b.n(j10) : Integer.MAX_VALUE;
        if (!this.f31372d && j2.k.d(this.f31373e, j2.k.f37107a.b())) {
            z10 = true;
        }
        int i10 = z10 ? 1 : this.f31371c;
        if (p10 != n10) {
            n10 = po.n.m(c(), p10, n10);
        }
        return new y1.d(f(), m2.c.b(0, n10, 0, m2.b.m(j10), 5, null), i10, j2.k.d(this.f31373e, j2.k.f37107a.b()), null);
    }

    public /* synthetic */ d0(y1.a aVar, y1.d0 d0Var, int i10, boolean z10, int i11, m2.d dVar, l.b bVar, List list, int i12, jo.h hVar) {
        this(aVar, d0Var, (i12 & 4) != 0 ? Integer.MAX_VALUE : i10, (i12 & 8) != 0 ? true : z10, (i12 & 16) != 0 ? j2.k.f37107a.a() : i11, dVar, bVar, (i12 & 128) != 0 ? xn.s.k() : list, null);
    }
}
