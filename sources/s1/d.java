package s1;

import e1.a;

/* loaded from: classes.dex */
public final class d extends n<d, z0.h> implements z {
    public static final b E = new b(null);
    public static final io.l<d, wn.v> F = a.f51829w;
    public z0.f A;
    public final z0.b B;
    public boolean C;
    public final io.a<wn.v> D;

    /* loaded from: classes.dex */
    public static final class a extends jo.q implements io.l<d, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public static final a f51829w = new a();

        public a() {
            super(1);
        }

        public final void a(d dVar) {
            jo.p.h(dVar, "drawEntity");
            if (dVar.m0()) {
                dVar.C = true;
                dVar.b().O1();
            }
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(d dVar) {
            a(dVar);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class b {
        public b() {
        }

        public /* synthetic */ b(jo.h hVar) {
            this();
        }
    }

    /* loaded from: classes.dex */
    public static final class c implements z0.b {

        /* renamed from: a  reason: collision with root package name */
        public final m2.d f51830a;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ p f51832c;

        public c(p pVar) {
            this.f51832c = pVar;
            this.f51830a = d.this.a().X();
        }

        @Override // z0.b
        public long c() {
            return m2.p.b(this.f51832c.a());
        }

        @Override // z0.b
        public m2.d getDensity() {
            return this.f51830a;
        }

        @Override // z0.b
        public m2.q getLayoutDirection() {
            return d.this.a().getLayoutDirection();
        }
    }

    /* renamed from: s1.d$d  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0790d extends jo.q implements io.a<wn.v> {
        public C0790d() {
            super(0);
        }

        public final void a() {
            z0.f fVar = d.this.A;
            if (fVar != null) {
                fVar.R(d.this.B);
            }
            d.this.C = false;
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ wn.v invoke() {
            a();
            return wn.v.f59242a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(p pVar, z0.h hVar) {
        super(pVar, hVar);
        jo.p.h(pVar, "layoutNodeWrapper");
        jo.p.h(hVar, "modifier");
        this.A = o();
        this.B = new c(pVar);
        this.C = true;
        this.D = new C0790d();
    }

    @Override // s1.n
    public void g() {
        this.A = o();
        this.C = true;
        super.g();
    }

    public final void m(c1.w wVar) {
        d dVar;
        e1.a aVar;
        jo.p.h(wVar, "canvas");
        long b10 = m2.p.b(e());
        if (this.A != null && this.C) {
            o.a(a()).getSnapshotObserver().e(this, F, this.D);
        }
        m h02 = a().h0();
        p b11 = b();
        dVar = h02.f51907x;
        h02.f51907x = this;
        aVar = h02.f51906w;
        q1.e0 B1 = b11.B1();
        m2.q layoutDirection = b11.B1().getLayoutDirection();
        a.C0296a z10 = aVar.z();
        m2.d a10 = z10.a();
        m2.q b12 = z10.b();
        c1.w c10 = z10.c();
        long d10 = z10.d();
        a.C0296a z11 = aVar.z();
        z11.j(B1);
        z11.k(layoutDirection);
        z11.i(wVar);
        z11.l(b10);
        wVar.p();
        c().x0(h02);
        wVar.k();
        a.C0296a z12 = aVar.z();
        z12.j(a10);
        z12.k(b12);
        z12.i(c10);
        z12.l(d10);
        h02.f51907x = dVar;
    }

    @Override // s1.z
    public boolean m0() {
        return b().h();
    }

    public final void n() {
        this.C = true;
    }

    public final z0.f o() {
        z0.h c10 = c();
        if (c10 instanceof z0.f) {
            return (z0.f) c10;
        }
        return null;
    }
}
