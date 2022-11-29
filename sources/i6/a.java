package i6;

import com.google.android.exoplayer2.util.FileTypes;
import ep.d0;
import ep.u;
import ep.x;
import jo.q;
import wn.g;
import wn.i;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final wn.f f36333a;

    /* renamed from: b  reason: collision with root package name */
    public final wn.f f36334b;

    /* renamed from: c  reason: collision with root package name */
    public final long f36335c;

    /* renamed from: d  reason: collision with root package name */
    public final long f36336d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f36337e;

    /* renamed from: f  reason: collision with root package name */
    public final u f36338f;

    /* renamed from: i6.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0461a extends q implements io.a<ep.d> {
        public C0461a() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final ep.d invoke() {
            return ep.d.f30809p.b(a.this.d());
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends q implements io.a<x> {
        public b() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final x invoke() {
            String d10 = a.this.d().d(FileTypes.HEADER_CONTENT_TYPE);
            if (d10 == null) {
                return null;
            }
            return x.f31036g.b(d10);
        }
    }

    public a(rp.e eVar) {
        i iVar = i.NONE;
        this.f36333a = g.b(iVar, new C0461a());
        this.f36334b = g.b(iVar, new b());
        this.f36335c = Long.parseLong(eVar.s0());
        this.f36336d = Long.parseLong(eVar.s0());
        int i10 = 0;
        this.f36337e = Integer.parseInt(eVar.s0()) > 0;
        int parseInt = Integer.parseInt(eVar.s0());
        u.a aVar = new u.a();
        while (i10 < parseInt) {
            i10++;
            aVar.a(eVar.s0());
        }
        this.f36338f = aVar.g();
    }

    public final ep.d a() {
        return (ep.d) this.f36333a.getValue();
    }

    public final x b() {
        return (x) this.f36334b.getValue();
    }

    public final long c() {
        return this.f36336d;
    }

    public final u d() {
        return this.f36338f;
    }

    public final long e() {
        return this.f36335c;
    }

    public final boolean f() {
        return this.f36337e;
    }

    public final void g(rp.d dVar) {
        dVar.J0(this.f36335c).b1(10);
        dVar.J0(this.f36336d).b1(10);
        dVar.J0(this.f36337e ? 1L : 0L).b1(10);
        dVar.J0(this.f36338f.size()).b1(10);
        int size = this.f36338f.size();
        for (int i10 = 0; i10 < size; i10++) {
            dVar.a0(this.f36338f.g(i10)).a0(": ").a0(this.f36338f.m(i10)).b1(10);
        }
    }

    public a(d0 d0Var) {
        i iVar = i.NONE;
        this.f36333a = g.b(iVar, new C0461a());
        this.f36334b = g.b(iVar, new b());
        this.f36335c = d0Var.I();
        this.f36336d = d0Var.F();
        this.f36337e = d0Var.j() != null;
        this.f36338f = d0Var.p();
    }
}
