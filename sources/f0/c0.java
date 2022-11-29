package f0;

import b1.f;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import l0.k1;
import q1.q0;
import x0.f;

/* loaded from: classes.dex */
public final class c0 implements k1 {
    public final x0.f A;
    public x0.f B;
    public x0.f C;

    /* renamed from: w  reason: collision with root package name */
    public final w0 f31337w;

    /* renamed from: x  reason: collision with root package name */
    public g0.q f31338x;

    /* renamed from: y  reason: collision with root package name */
    public e0 f31339y;

    /* renamed from: z  reason: collision with root package name */
    public final q1.c0 f31340z;

    /* loaded from: classes.dex */
    public static final class a extends jo.q implements io.l<q1.q, wn.v> {
        public a() {
            super(1);
        }

        public final void a(q1.q qVar) {
            g0.q qVar2;
            jo.p.h(qVar, "it");
            c0.this.k().j(qVar);
            if (g0.r.b(c0.this.f31338x, c0.this.k().g())) {
                long f10 = q1.r.f(qVar);
                if (!b1.f.j(f10, c0.this.k().e()) && (qVar2 = c0.this.f31338x) != null) {
                    qVar2.f(c0.this.k().g());
                }
                c0.this.k().m(f10);
            }
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(q1.q qVar) {
            a(qVar);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends jo.q implements io.l<w1.y, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ y1.a f31342w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ c0 f31343x;

        /* loaded from: classes.dex */
        public static final class a extends jo.q implements io.l<List<y1.z>, Boolean> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ c0 f31344w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(c0 c0Var) {
                super(1);
                this.f31344w = c0Var;
            }

            @Override // io.l
            /* renamed from: a */
            public final Boolean invoke(List<y1.z> list) {
                boolean z10;
                jo.p.h(list, "it");
                if (this.f31344w.k().c() != null) {
                    y1.z c10 = this.f31344w.k().c();
                    jo.p.e(c10);
                    list.add(c10);
                    z10 = true;
                } else {
                    z10 = false;
                }
                return Boolean.valueOf(z10);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(y1.a aVar, c0 c0Var) {
            super(1);
            this.f31342w = aVar;
            this.f31343x = c0Var;
        }

        public final void a(w1.y yVar) {
            jo.p.h(yVar, "$this$semantics");
            w1.w.N(yVar, this.f31342w);
            w1.w.i(yVar, null, new a(this.f31343x), 1, null);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(w1.y yVar) {
            a(yVar);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends jo.q implements io.l<e1.e, wn.v> {
        public c() {
            super(1);
        }

        public final void a(e1.e eVar) {
            Map<Long, g0.j> e10;
            jo.p.h(eVar, "$this$drawBehind");
            y1.z c10 = c0.this.k().c();
            if (c10 != null) {
                c0 c0Var = c0.this;
                c0Var.k().a();
                g0.q qVar = c0Var.f31338x;
                g0.j jVar = (qVar == null || (e10 = qVar.e()) == null) ? null : e10.get(Long.valueOf(c0Var.k().g()));
                if (jVar != null) {
                    if (!jVar.b()) {
                        jVar.c();
                        throw null;
                    } else {
                        jVar.a();
                        throw null;
                    }
                }
                d0.f31368k.a(eVar.M0().e(), c10);
            }
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(e1.e eVar) {
            a(eVar);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class d implements q1.c0 {

        /* loaded from: classes.dex */
        public static final class a extends jo.q implements io.l<q0.a, wn.v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ List<wn.k<q1.q0, m2.k>> f31347w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(List<? extends wn.k<? extends q1.q0, m2.k>> list) {
                super(1);
                this.f31347w = list;
            }

            public final void a(q0.a aVar) {
                jo.p.h(aVar, "$this$layout");
                List<wn.k<q1.q0, m2.k>> list = this.f31347w;
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    wn.k<q1.q0, m2.k> kVar = list.get(i10);
                    q0.a.l(aVar, kVar.a(), kVar.b().n(), 0.0f, 2, null);
                }
            }

            @Override // io.l
            public /* bridge */ /* synthetic */ wn.v invoke(q0.a aVar) {
                a(aVar);
                return wn.v.f59242a;
            }
        }

        public d() {
        }

        @Override // q1.c0
        public int a(q1.m mVar, List<? extends q1.l> list, int i10) {
            jo.p.h(mVar, "<this>");
            jo.p.h(list, "measurables");
            return m2.o.f(d0.m(c0.this.k().h(), m2.c.a(0, i10, 0, Integer.MAX_VALUE), mVar.getLayoutDirection(), null, 4, null).A());
        }

        @Override // q1.c0
        public q1.d0 c(q1.e0 e0Var, List<? extends q1.b0> list, long j10) {
            int i10;
            wn.k kVar;
            g0.q qVar;
            jo.p.h(e0Var, "$this$measure");
            jo.p.h(list, "measurables");
            y1.z c10 = c0.this.k().c();
            y1.z l10 = c0.this.k().h().l(j10, e0Var.getLayoutDirection(), c10);
            if (!jo.p.c(c10, l10)) {
                c0.this.k().d().invoke(l10);
                if (c10 != null) {
                    c0 c0Var = c0.this;
                    if (!jo.p.c(c10.k().j(), l10.k().j()) && (qVar = c0Var.f31338x) != null) {
                        qVar.g(c0Var.k().g());
                    }
                }
            }
            c0.this.k().k(l10);
            if (list.size() >= l10.z().size()) {
                List<b1.h> z10 = l10.z();
                ArrayList arrayList = new ArrayList(z10.size());
                int size = z10.size();
                int i11 = 0;
                while (i11 < size) {
                    b1.h hVar = z10.get(i11);
                    if (hVar != null) {
                        i10 = size;
                        kVar = new wn.k(list.get(i11).M(m2.c.b(0, (int) Math.floor(hVar.n()), 0, (int) Math.floor(hVar.h()), 5, null)), m2.k.b(m2.l.a(lo.c.c(hVar.i()), lo.c.c(hVar.l()))));
                    } else {
                        i10 = size;
                        kVar = null;
                    }
                    if (kVar != null) {
                        arrayList.add(kVar);
                    }
                    i11++;
                    size = i10;
                }
                return e0Var.W(m2.o.g(l10.A()), m2.o.f(l10.A()), xn.n0.h(wn.q.a(q1.b.a(), Integer.valueOf(lo.c.c(l10.g()))), wn.q.a(q1.b.b(), Integer.valueOf(lo.c.c(l10.j())))), new a(arrayList));
            }
            throw new IllegalStateException("Check failed.".toString());
        }

        @Override // q1.c0
        public int d(q1.m mVar, List<? extends q1.l> list, int i10) {
            jo.p.h(mVar, "<this>");
            jo.p.h(list, "measurables");
            c0.this.k().h().n(mVar.getLayoutDirection());
            return c0.this.k().h().c();
        }

        @Override // q1.c0
        public int e(q1.m mVar, List<? extends q1.l> list, int i10) {
            jo.p.h(mVar, "<this>");
            jo.p.h(list, "measurables");
            return m2.o.f(d0.m(c0.this.k().h(), m2.c.a(0, i10, 0, Integer.MAX_VALUE), mVar.getLayoutDirection(), null, 4, null).A());
        }

        @Override // q1.c0
        public int g(q1.m mVar, List<? extends q1.l> list, int i10) {
            jo.p.h(mVar, "<this>");
            jo.p.h(list, "measurables");
            c0.this.k().h().n(mVar.getLayoutDirection());
            return c0.this.k().h().e();
        }
    }

    /* loaded from: classes.dex */
    public static final class e extends jo.q implements io.a<q1.q> {
        public e() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final q1.q invoke() {
            return c0.this.k().b();
        }
    }

    /* loaded from: classes.dex */
    public static final class f extends jo.q implements io.a<y1.z> {
        public f() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final y1.z invoke() {
            return c0.this.k().c();
        }
    }

    /* loaded from: classes.dex */
    public static final class g implements e0 {

        /* renamed from: a  reason: collision with root package name */
        public long f31350a;

        /* renamed from: b  reason: collision with root package name */
        public long f31351b;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ g0.q f31353d;

        public g(g0.q qVar) {
            this.f31353d = qVar;
            f.a aVar = b1.f.f16721b;
            this.f31350a = aVar.c();
            this.f31351b = aVar.c();
        }

        @Override // f0.e0
        public void a() {
            if (g0.r.b(this.f31353d, c0.this.k().g())) {
                this.f31353d.j();
            }
        }

        @Override // f0.e0
        public void b(long j10) {
        }

        @Override // f0.e0
        public void c(long j10) {
            q1.q b10 = c0.this.k().b();
            if (b10 != null) {
                c0 c0Var = c0.this;
                g0.q qVar = this.f31353d;
                if (!b10.h()) {
                    return;
                }
                if (c0Var.l(j10, j10)) {
                    qVar.i(c0Var.k().g());
                } else {
                    qVar.h(b10, j10, g0.k.f32240a.g());
                }
                this.f31350a = j10;
            }
            if (g0.r.b(this.f31353d, c0.this.k().g())) {
                this.f31351b = b1.f.f16721b.c();
            }
        }

        @Override // f0.e0
        public void d() {
        }

        @Override // f0.e0
        public void e(long j10) {
            q1.q b10 = c0.this.k().b();
            if (b10 != null) {
                g0.q qVar = this.f31353d;
                c0 c0Var = c0.this;
                if (b10.h() && g0.r.b(qVar, c0Var.k().g())) {
                    long r10 = b1.f.r(this.f31351b, j10);
                    this.f31351b = r10;
                    long r11 = b1.f.r(this.f31350a, r10);
                    if (c0Var.l(this.f31350a, r11) || !qVar.d(b10, r11, this.f31350a, false, g0.k.f32240a.d())) {
                        return;
                    }
                    this.f31350a = r11;
                    this.f31351b = b1.f.f16721b.c();
                }
            }
        }

        @Override // f0.e0
        public void onStop() {
            if (g0.r.b(this.f31353d, c0.this.k().g())) {
                this.f31353d.j();
            }
        }
    }

    @co.f(c = "androidx.compose.foundation.text.TextController$update$2", f = "CoreText.kt", l = {191}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class h extends co.l implements io.p<n1.e0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f31354w;

        /* renamed from: x  reason: collision with root package name */
        public /* synthetic */ Object f31355x;

        public h(ao.d<? super h> dVar) {
            super(2, dVar);
        }

        @Override // io.p
        /* renamed from: a */
        public final Object invoke(n1.e0 e0Var, ao.d<? super wn.v> dVar) {
            return ((h) create(e0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            h hVar = new h(dVar);
            hVar.f31355x = obj;
            return hVar;
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f31354w;
            if (i10 == 0) {
                wn.m.b(obj);
                e0 h10 = c0.this.h();
                this.f31354w = 1;
                if (w.d((n1.e0) this.f31355x, h10, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                wn.m.b(obj);
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "androidx.compose.foundation.text.TextController$update$3", f = "CoreText.kt", l = {282}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class i extends co.l implements io.p<n1.e0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f31357w;

        /* renamed from: x  reason: collision with root package name */
        public /* synthetic */ Object f31358x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ j f31359y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(j jVar, ao.d<? super i> dVar) {
            super(2, dVar);
            this.f31359y = jVar;
        }

        @Override // io.p
        /* renamed from: a */
        public final Object invoke(n1.e0 e0Var, ao.d<? super wn.v> dVar) {
            return ((i) create(e0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            i iVar = new i(this.f31359y, dVar);
            iVar.f31358x = obj;
            return iVar;
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f31357w;
            if (i10 == 0) {
                wn.m.b(obj);
                j jVar = this.f31359y;
                this.f31357w = 1;
                if (g0.c0.c((n1.e0) this.f31358x, jVar, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                wn.m.b(obj);
            }
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class j implements g0.g {

        /* renamed from: a  reason: collision with root package name */
        public long f31360a = b1.f.f16721b.c();

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ g0.q f31362c;

        public j(g0.q qVar) {
            this.f31362c = qVar;
        }

        @Override // g0.g
        public boolean a(long j10, g0.k kVar) {
            jo.p.h(kVar, "adjustment");
            q1.q b10 = c0.this.k().b();
            if (b10 != null) {
                g0.q qVar = this.f31362c;
                c0 c0Var = c0.this;
                if (b10.h()) {
                    qVar.h(b10, j10, kVar);
                    this.f31360a = j10;
                    return g0.r.b(qVar, c0Var.k().g());
                }
                return false;
            }
            return false;
        }

        @Override // g0.g
        public boolean b(long j10, g0.k kVar) {
            jo.p.h(kVar, "adjustment");
            q1.q b10 = c0.this.k().b();
            if (b10 != null) {
                g0.q qVar = this.f31362c;
                c0 c0Var = c0.this;
                if (!b10.h() || !g0.r.b(qVar, c0Var.k().g())) {
                    return false;
                }
                if (qVar.d(b10, j10, this.f31360a, false, kVar)) {
                    this.f31360a = j10;
                }
            }
            return true;
        }

        @Override // g0.g
        public boolean c(long j10) {
            q1.q b10 = c0.this.k().b();
            if (b10 != null) {
                g0.q qVar = this.f31362c;
                c0 c0Var = c0.this;
                if (b10.h() && g0.r.b(qVar, c0Var.k().g())) {
                    if (qVar.d(b10, j10, this.f31360a, false, g0.k.f32240a.e())) {
                        this.f31360a = j10;
                        return true;
                    }
                    return true;
                }
                return false;
            }
            return true;
        }

        @Override // g0.g
        public boolean d(long j10) {
            q1.q b10 = c0.this.k().b();
            if (b10 != null) {
                g0.q qVar = this.f31362c;
                c0 c0Var = c0.this;
                if (b10.h()) {
                    if (qVar.d(b10, j10, this.f31360a, false, g0.k.f32240a.e())) {
                        this.f31360a = j10;
                    }
                    return g0.r.b(qVar, c0Var.k().g());
                }
                return false;
            }
            return false;
        }
    }

    public c0(w0 w0Var) {
        jo.p.h(w0Var, "state");
        this.f31337w = w0Var;
        this.f31340z = new d();
        f.a aVar = x0.f.f59359u;
        this.A = q1.k0.a(g(aVar), new a());
        this.B = f(w0Var.h().k());
        this.C = aVar;
    }

    @Override // l0.k1
    public void a() {
        g0.q qVar = this.f31338x;
        if (qVar != null) {
            w0 w0Var = this.f31337w;
            w0Var.n(qVar.a(new g0.h(w0Var.g(), new e(), new f())));
        }
    }

    @Override // l0.k1
    public void b() {
        g0.q qVar;
        g0.i f10 = this.f31337w.f();
        if (f10 == null || (qVar = this.f31338x) == null) {
            return;
        }
        qVar.b(f10);
    }

    @Override // l0.k1
    public void c() {
        g0.q qVar;
        g0.i f10 = this.f31337w.f();
        if (f10 == null || (qVar = this.f31338x) == null) {
            return;
        }
        qVar.b(f10);
    }

    public final x0.f f(y1.a aVar) {
        return w1.p.b(x0.f.f59359u, false, new b(aVar, this), 1, null);
    }

    public final x0.f g(x0.f fVar) {
        return z0.i.a(c1.h0.c(fVar, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 65535, null), new c());
    }

    public final e0 h() {
        e0 e0Var = this.f31339y;
        if (e0Var != null) {
            return e0Var;
        }
        jo.p.v("longPressDragObserver");
        return null;
    }

    public final q1.c0 i() {
        return this.f31340z;
    }

    public final x0.f j() {
        return this.A.L(this.B).L(this.C);
    }

    public final w0 k() {
        return this.f31337w;
    }

    public final boolean l(long j10, long j11) {
        y1.z c10 = this.f31337w.c();
        if (c10 != null) {
            int length = c10.k().j().g().length();
            int w10 = c10.w(j10);
            int w11 = c10.w(j11);
            int i10 = length - 1;
            return (w10 >= i10 && w11 >= i10) || (w10 < 0 && w11 < 0);
        }
        return false;
    }

    public final void m(e0 e0Var) {
        jo.p.h(e0Var, "<set-?>");
        this.f31339y = e0Var;
    }

    public final void n(d0 d0Var) {
        jo.p.h(d0Var, "textDelegate");
        if (this.f31337w.h() == d0Var) {
            return;
        }
        this.f31337w.p(d0Var);
        this.B = f(this.f31337w.h().k());
    }

    public final void o(g0.q qVar) {
        x0.f fVar;
        this.f31338x = qVar;
        if (qVar != null) {
            if (x0.a()) {
                m(new g(qVar));
                fVar = n1.o0.b(x0.f.f59359u, h(), new h(null));
            } else {
                j jVar = new j(qVar);
                fVar = n1.s.b(n1.o0.b(x0.f.f59359u, jVar, new i(jVar, null)), v0.a(), false, 2, null);
            }
        } else {
            fVar = x0.f.f59359u;
        }
        this.C = fVar;
    }
}
