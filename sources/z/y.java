package z;

import b0.p;
import q1.s0;
import z.j;

/* loaded from: classes.dex */
public final class y implements r1.d<b0.p>, r1.b, b0.p {

    /* renamed from: w  reason: collision with root package name */
    public final g0 f62390w;

    /* renamed from: x  reason: collision with root package name */
    public final j f62391x;

    /* renamed from: y  reason: collision with root package name */
    public b0.p f62392y;

    /* renamed from: z  reason: collision with root package name */
    public static final b f62389z = new b(null);
    public static final a A = new a();

    /* loaded from: classes.dex */
    public static final class a implements p.a {
        @Override // b0.p.a
        public void a() {
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
    public static final class c implements p.a {

        /* renamed from: a  reason: collision with root package name */
        public final p.a f62393a;

        /* renamed from: b  reason: collision with root package name */
        public final j.a f62394b;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ j f62396d;

        public c(j jVar) {
            this.f62396d = jVar;
            b0.p c10 = y.this.c();
            this.f62393a = c10 != null ? c10.a() : null;
            this.f62394b = jVar.a(jVar.c(), jVar.b());
        }

        @Override // b0.p.a
        public void a() {
            this.f62396d.e(this.f62394b);
            p.a aVar = this.f62393a;
            if (aVar != null) {
                aVar.a();
            }
            s0 t10 = y.this.f62390w.t();
            if (t10 != null) {
                t10.b();
            }
        }
    }

    public y(g0 g0Var, j jVar) {
        jo.p.h(g0Var, "state");
        jo.p.h(jVar, "beyondBoundsInfo");
        this.f62390w = g0Var;
        this.f62391x = jVar;
    }

    @Override // b0.p
    public p.a a() {
        p.a a10;
        j jVar = this.f62391x;
        if (jVar.d()) {
            return new c(jVar);
        }
        b0.p pVar = this.f62392y;
        return (pVar == null || (a10 = pVar.a()) == null) ? A : a10;
    }

    public final b0.p c() {
        return this.f62392y;
    }

    @Override // r1.d
    /* renamed from: f */
    public b0.p getValue() {
        return this;
    }

    @Override // r1.d
    public r1.f<b0.p> getKey() {
        return b0.q.a();
    }

    @Override // r1.b
    public void j0(r1.e eVar) {
        jo.p.h(eVar, "scope");
        this.f62392y = (b0.p) eVar.a(b0.q.a());
    }
}
