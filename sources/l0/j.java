package l0;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import kotlin.KotlinNothingValueException;
import n0.f;

/*  JADX ERROR: JadxRuntimeException in pass: ClassModifier
    jadx.core.utils.exceptions.JadxRuntimeException: Not class type: V
    	at jadx.core.dex.info.ClassInfo.checkClassType(ClassInfo.java:53)
    	at jadx.core.dex.info.ClassInfo.fromType(ClassInfo.java:31)
    	at jadx.core.dex.visitors.ClassModifier.removeSyntheticFields(ClassModifier.java:83)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:61)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:55)
    */
/* loaded from: classes.dex */
public final class j implements l0.i {
    public int A;
    public int B;
    public v0.h C;
    public int D;
    public final b2<f1> E;
    public boolean F;
    public boolean G;
    public o1 H;
    public p1 I;
    public r1 J;
    public boolean K;
    public n0.f<l0.q<Object>, ? extends c2<? extends Object>> L;
    public l0.d M;
    public final List<io.q<l0.e<?>, r1, j1, wn.v>> N;
    public boolean O;
    public int P;
    public int Q;
    public b2<Object> R;
    public int S;
    public boolean T;
    public boolean U;
    public final l0.f0 V;
    public final b2<io.q<l0.e<?>, r1, j1, wn.v>> W;
    public int X;
    public int Y;
    public int Z;

    /* renamed from: a0  reason: collision with root package name */
    public int f39071a0;

    /* renamed from: b  reason: collision with root package name */
    public final l0.e<?> f39072b;

    /* renamed from: c  reason: collision with root package name */
    public final l0.m f39073c;

    /* renamed from: d  reason: collision with root package name */
    public final p1 f39074d;

    /* renamed from: e  reason: collision with root package name */
    public final Set<k1> f39075e;

    /* renamed from: f  reason: collision with root package name */
    public List<io.q<l0.e<?>, r1, j1, wn.v>> f39076f;

    /* renamed from: g  reason: collision with root package name */
    public List<io.q<l0.e<?>, r1, j1, wn.v>> f39077g;

    /* renamed from: h  reason: collision with root package name */
    public final l0.u f39078h;

    /* renamed from: i  reason: collision with root package name */
    public final b2<y0> f39079i;

    /* renamed from: j  reason: collision with root package name */
    public y0 f39080j;

    /* renamed from: k  reason: collision with root package name */
    public int f39081k;

    /* renamed from: l  reason: collision with root package name */
    public l0.f0 f39082l;

    /* renamed from: m  reason: collision with root package name */
    public int f39083m;

    /* renamed from: n  reason: collision with root package name */
    public l0.f0 f39084n;

    /* renamed from: o  reason: collision with root package name */
    public int[] f39085o;

    /* renamed from: p  reason: collision with root package name */
    public HashMap<Integer, Integer> f39086p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f39087q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f39088r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f39089s;

    /* renamed from: t  reason: collision with root package name */
    public final List<l0.g0> f39090t;

    /* renamed from: u  reason: collision with root package name */
    public final l0.f0 f39091u;

    /* renamed from: v  reason: collision with root package name */
    public n0.f<l0.q<Object>, ? extends c2<? extends Object>> f39092v;

    /* renamed from: w  reason: collision with root package name */
    public final HashMap<Integer, n0.f<l0.q<Object>, c2<Object>>> f39093w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f39094x;

    /* renamed from: y  reason: collision with root package name */
    public final l0.f0 f39095y;

    /* renamed from: z  reason: collision with root package name */
    public boolean f39096z;

    /* loaded from: classes.dex */
    public static final class a implements k1 {

        /* renamed from: w  reason: collision with root package name */
        public final b f39097w;

        public a(b bVar) {
            jo.p.h(bVar, "ref");
            this.f39097w = bVar;
        }

        @Override // l0.k1
        public void a() {
        }

        @Override // l0.k1
        public void b() {
            this.f39097w.q();
        }

        @Override // l0.k1
        public void c() {
            this.f39097w.q();
        }

        public final b d() {
            return this.f39097w;
        }
    }

    /* loaded from: classes.dex */
    public static final class a0 extends jo.q implements io.q<l0.e<?>, r1, j1, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ p1 f39098w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ l0.d f39099x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ List<io.q<l0.e<?>, r1, j1, wn.v>> f39100y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a0(p1 p1Var, l0.d dVar, List<io.q<l0.e<?>, r1, j1, wn.v>> list) {
            super(3);
            this.f39098w = p1Var;
            this.f39099x = dVar;
            this.f39100y = list;
        }

        public final void a(l0.e<?> eVar, r1 r1Var, j1 j1Var) {
            jo.p.h(eVar, "applier");
            jo.p.h(r1Var, "slots");
            jo.p.h(j1Var, "rememberManager");
            p1 p1Var = this.f39098w;
            List<io.q<l0.e<?>, r1, j1, wn.v>> list = this.f39100y;
            r1 x10 = p1Var.x();
            try {
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    list.get(i10).s0(eVar, x10, j1Var);
                }
                wn.v vVar = wn.v.f59242a;
                x10.F();
                r1Var.D();
                p1 p1Var2 = this.f39098w;
                r1Var.o0(p1Var2, this.f39099x.d(p1Var2));
                r1Var.O();
            } catch (Throwable th2) {
                x10.F();
                throw th2;
            }
        }

        @Override // io.q
        public /* bridge */ /* synthetic */ wn.v s0(l0.e<?> eVar, r1 r1Var, j1 j1Var) {
            a(eVar, r1Var, j1Var);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public final class b extends l0.m {

        /* renamed from: a  reason: collision with root package name */
        public final int f39101a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f39102b;

        /* renamed from: c  reason: collision with root package name */
        public Set<Set<w0.a>> f39103c;

        /* renamed from: d  reason: collision with root package name */
        public final Set<j> f39104d = new LinkedHashSet();

        /* renamed from: e  reason: collision with root package name */
        public final s0 f39105e;

        public b(int i10, boolean z10) {
            s0 e10;
            this.f39101a = i10;
            this.f39102b = z10;
            e10 = z1.e(n0.a.a(), null, 2, null);
            this.f39105e = e10;
        }

        @Override // l0.m
        public void a(l0.u uVar, io.p<? super l0.i, ? super Integer, wn.v> pVar) {
            jo.p.h(uVar, "composition");
            jo.p.h(pVar, "content");
            j.this.f39073c.a(uVar, pVar);
        }

        @Override // l0.m
        public void b(r0 r0Var) {
            jo.p.h(r0Var, "reference");
            j.this.f39073c.b(r0Var);
        }

        @Override // l0.m
        public void c() {
            j jVar = j.this;
            jVar.B--;
        }

        @Override // l0.m
        public boolean d() {
            return this.f39102b;
        }

        @Override // l0.m
        public n0.f<l0.q<Object>, c2<Object>> e() {
            return r();
        }

        @Override // l0.m
        public int f() {
            return this.f39101a;
        }

        @Override // l0.m
        public ao.g g() {
            return j.this.f39073c.g();
        }

        @Override // l0.m
        public void h(r0 r0Var) {
            jo.p.h(r0Var, "reference");
            j.this.f39073c.h(r0Var);
        }

        @Override // l0.m
        public void i(l0.u uVar) {
            jo.p.h(uVar, "composition");
            j.this.f39073c.i(j.this.B0());
            j.this.f39073c.i(uVar);
        }

        @Override // l0.m
        public void j(r0 r0Var, q0 q0Var) {
            jo.p.h(r0Var, "reference");
            jo.p.h(q0Var, "data");
            j.this.f39073c.j(r0Var, q0Var);
        }

        @Override // l0.m
        public q0 k(r0 r0Var) {
            jo.p.h(r0Var, "reference");
            return j.this.f39073c.k(r0Var);
        }

        @Override // l0.m
        public void l(Set<w0.a> set) {
            jo.p.h(set, "table");
            Set set2 = this.f39103c;
            if (set2 == null) {
                set2 = new HashSet();
                this.f39103c = set2;
            }
            set2.add(set);
        }

        @Override // l0.m
        public void m(l0.i iVar) {
            jo.p.h(iVar, "composer");
            super.m((j) iVar);
            this.f39104d.add(iVar);
        }

        @Override // l0.m
        public void n() {
            j.this.B++;
        }

        @Override // l0.m
        public void o(l0.i iVar) {
            jo.p.h(iVar, "composer");
            Set<Set<w0.a>> set = this.f39103c;
            if (set != null) {
                Iterator<T> it = set.iterator();
                while (it.hasNext()) {
                    ((Set) it.next()).remove(((j) iVar).f39074d);
                }
            }
            jo.j0.a(this.f39104d).remove(iVar);
        }

        @Override // l0.m
        public void p(l0.u uVar) {
            jo.p.h(uVar, "composition");
            j.this.f39073c.p(uVar);
        }

        public final void q() {
            if (!this.f39104d.isEmpty()) {
                Set<Set<w0.a>> set = this.f39103c;
                if (set != null) {
                    for (j jVar : this.f39104d) {
                        for (Set<w0.a> set2 : set) {
                            set2.remove(jVar.f39074d);
                        }
                    }
                }
                this.f39104d.clear();
            }
        }

        public final n0.f<l0.q<Object>, c2<Object>> r() {
            return (n0.f) this.f39105e.getValue();
        }

        public final void s(n0.f<l0.q<Object>, ? extends c2<? extends Object>> fVar) {
            this.f39105e.setValue(fVar);
        }

        public final void t(n0.f<l0.q<Object>, ? extends c2<? extends Object>> fVar) {
            jo.p.h(fVar, "scope");
            s(fVar);
        }
    }

    /* loaded from: classes.dex */
    public static final class b0 extends jo.q implements io.q<l0.e<?>, r1, j1, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a<wn.v> f39107w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b0(io.a<wn.v> aVar) {
            super(3);
            this.f39107w = aVar;
        }

        public final void a(l0.e<?> eVar, r1 r1Var, j1 j1Var) {
            jo.p.h(eVar, "<anonymous parameter 0>");
            jo.p.h(r1Var, "<anonymous parameter 1>");
            jo.p.h(j1Var, "rememberManager");
            j1Var.b(this.f39107w);
        }

        @Override // io.q
        public /* bridge */ /* synthetic */ wn.v s0(l0.e<?> eVar, r1 r1Var, j1 j1Var) {
            a(eVar, r1Var, j1Var);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends jo.q implements io.q<l0.e<?>, r1, j1, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.p<T, V, wn.v> f39108w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ V f39109x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(io.p<? super T, ? super V, wn.v> pVar, V v10) {
            super(3);
            this.f39108w = pVar;
            this.f39109x = v10;
        }

        public final void a(l0.e<?> eVar, r1 r1Var, j1 j1Var) {
            jo.p.h(eVar, "applier");
            jo.p.h(r1Var, "<anonymous parameter 1>");
            jo.p.h(j1Var, "<anonymous parameter 2>");
            this.f39108w.invoke(eVar.a(), this.f39109x);
        }

        @Override // io.q
        public /* bridge */ /* synthetic */ wn.v s0(l0.e<?> eVar, r1 r1Var, j1 j1Var) {
            a(eVar, r1Var, j1Var);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class c0 extends jo.q implements io.q<l0.e<?>, r1, j1, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ l0.d f39110w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c0(l0.d dVar) {
            super(3);
            this.f39110w = dVar;
        }

        public final void a(l0.e<?> eVar, r1 r1Var, j1 j1Var) {
            jo.p.h(eVar, "<anonymous parameter 0>");
            jo.p.h(r1Var, "slots");
            jo.p.h(j1Var, "<anonymous parameter 2>");
            r1Var.Q(this.f39110w);
        }

        @Override // io.q
        public /* bridge */ /* synthetic */ wn.v s0(l0.e<?> eVar, r1 r1Var, j1 j1Var) {
            a(eVar, r1Var, j1Var);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends jo.q implements io.q<l0.e<?>, r1, j1, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a<T> f39111w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ l0.d f39112x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ int f39113y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(io.a<? extends T> aVar, l0.d dVar, int i10) {
            super(3);
            this.f39111w = aVar;
            this.f39112x = dVar;
            this.f39113y = i10;
        }

        public final void a(l0.e<?> eVar, r1 r1Var, j1 j1Var) {
            jo.p.h(eVar, "applier");
            jo.p.h(r1Var, "slots");
            jo.p.h(j1Var, "<anonymous parameter 2>");
            Object invoke = this.f39111w.invoke();
            r1Var.e1(this.f39112x, invoke);
            eVar.d(this.f39113y, invoke);
            eVar.g(invoke);
        }

        @Override // io.q
        public /* bridge */ /* synthetic */ wn.v s0(l0.e<?> eVar, r1 r1Var, j1 j1Var) {
            a(eVar, r1Var, j1Var);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class d0 extends jo.q implements io.q<l0.e<?>, r1, j1, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ j f39114w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ r0 f39115x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ l0.d f39116y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d0(j jVar, r0 r0Var, l0.d dVar) {
            super(3);
            this.f39114w = jVar;
            this.f39115x = r0Var;
            this.f39116y = dVar;
        }

        public final void a(l0.e<?> eVar, r1 r1Var, j1 j1Var) {
            jo.p.h(eVar, "<anonymous parameter 0>");
            jo.p.h(r1Var, "slots");
            jo.p.h(j1Var, "<anonymous parameter 2>");
            p1 p1Var = new p1();
            l0.d dVar = this.f39116y;
            r1 x10 = p1Var.x();
            try {
                x10.D();
                r1Var.t0(dVar, 1, x10);
                x10.O();
                wn.v vVar = wn.v.f59242a;
                x10.F();
                this.f39114w.f39073c.j(this.f39115x, new q0(p1Var));
            } catch (Throwable th2) {
                x10.F();
                throw th2;
            }
        }

        @Override // io.q
        public /* bridge */ /* synthetic */ wn.v s0(l0.e<?> eVar, r1 r1Var, j1 j1Var) {
            a(eVar, r1Var, j1Var);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class e extends jo.q implements io.q<l0.e<?>, r1, j1, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ l0.d f39117w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ int f39118x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(l0.d dVar, int i10) {
            super(3);
            this.f39117w = dVar;
            this.f39118x = i10;
        }

        public final void a(l0.e<?> eVar, r1 r1Var, j1 j1Var) {
            jo.p.h(eVar, "applier");
            jo.p.h(r1Var, "slots");
            jo.p.h(j1Var, "<anonymous parameter 2>");
            Object v02 = r1Var.v0(this.f39117w);
            eVar.i();
            eVar.f(this.f39118x, v02);
        }

        @Override // io.q
        public /* bridge */ /* synthetic */ wn.v s0(l0.e<?> eVar, r1 r1Var, j1 j1Var) {
            a(eVar, r1Var, j1Var);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class e0 extends jo.q implements io.q<l0.e<?>, r1, j1, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ int f39119w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e0(int i10) {
            super(3);
            this.f39119w = i10;
        }

        public final void a(l0.e<?> eVar, r1 r1Var, j1 j1Var) {
            jo.p.h(eVar, "<anonymous parameter 0>");
            jo.p.h(r1Var, "slots");
            jo.p.h(j1Var, "<anonymous parameter 2>");
            r1Var.p0(this.f39119w);
        }

        @Override // io.q
        public /* bridge */ /* synthetic */ wn.v s0(l0.e<?> eVar, r1 r1Var, j1 j1Var) {
            a(eVar, r1Var, j1Var);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class f extends jo.q implements io.p<Integer, Object, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ j f39120w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ int f39121x;

        /* loaded from: classes.dex */
        public static final class a extends jo.q implements io.q<l0.e<?>, r1, j1, wn.v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ Object f39122w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ int f39123x;

            /* renamed from: y  reason: collision with root package name */
            public final /* synthetic */ int f39124y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Object obj, int i10, int i11) {
                super(3);
                this.f39122w = obj;
                this.f39123x = i10;
                this.f39124y = i11;
            }

            public final void a(l0.e<?> eVar, r1 r1Var, j1 j1Var) {
                jo.p.h(eVar, "<anonymous parameter 0>");
                jo.p.h(r1Var, "slots");
                jo.p.h(j1Var, "rememberManager");
                if (jo.p.c(this.f39122w, r1Var.P0(this.f39123x, this.f39124y))) {
                    j1Var.a((k1) this.f39122w);
                    r1Var.K0(this.f39124y, l0.i.f39065a.a());
                    return;
                }
                l0.k.x("Slot table is out of sync".toString());
                throw new KotlinNothingValueException();
            }

            @Override // io.q
            public /* bridge */ /* synthetic */ wn.v s0(l0.e<?> eVar, r1 r1Var, j1 j1Var) {
                a(eVar, r1Var, j1Var);
                return wn.v.f59242a;
            }
        }

        /* loaded from: classes.dex */
        public static final class b extends jo.q implements io.q<l0.e<?>, r1, j1, wn.v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ Object f39125w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ int f39126x;

            /* renamed from: y  reason: collision with root package name */
            public final /* synthetic */ int f39127y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(Object obj, int i10, int i11) {
                super(3);
                this.f39125w = obj;
                this.f39126x = i10;
                this.f39127y = i11;
            }

            public final void a(l0.e<?> eVar, r1 r1Var, j1 j1Var) {
                jo.p.h(eVar, "<anonymous parameter 0>");
                jo.p.h(r1Var, "slots");
                jo.p.h(j1Var, "<anonymous parameter 2>");
                if (jo.p.c(this.f39125w, r1Var.P0(this.f39126x, this.f39127y))) {
                    r1Var.K0(this.f39127y, l0.i.f39065a.a());
                } else {
                    l0.k.x("Slot table is out of sync".toString());
                    throw new KotlinNothingValueException();
                }
            }

            @Override // io.q
            public /* bridge */ /* synthetic */ wn.v s0(l0.e<?> eVar, r1 r1Var, j1 j1Var) {
                a(eVar, r1Var, j1Var);
                return wn.v.f59242a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(j jVar, int i10) {
            super(2);
            this.f39120w = jVar;
            this.f39121x = i10;
        }

        public final void a(int i10, Object obj) {
            if (obj instanceof k1) {
                this.f39120w.H.N(this.f39121x);
                j.p1(this.f39120w, false, new a(obj, this.f39121x, i10), 1, null);
            } else if (obj instanceof f1) {
                f1 f1Var = (f1) obj;
                l0.o l10 = f1Var.l();
                if (l10 != null) {
                    l10.E(true);
                    f1Var.x();
                }
                this.f39120w.H.N(this.f39121x);
                j.p1(this.f39120w, false, new b(obj, this.f39121x, i10), 1, null);
            }
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ wn.v invoke(Integer num, Object obj) {
            a(num.intValue(), obj);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class f0 extends jo.q implements io.p<l0.i, Integer, n0.f<l0.q<Object>, ? extends c2<? extends Object>>> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ d1<?>[] f39128w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ n0.f<l0.q<Object>, c2<Object>> f39129x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public f0(d1<?>[] d1VarArr, n0.f<l0.q<Object>, ? extends c2<? extends Object>> fVar) {
            super(2);
            this.f39128w = d1VarArr;
            this.f39129x = fVar;
        }

        public final n0.f<l0.q<Object>, c2<Object>> a(l0.i iVar, int i10) {
            n0.f<l0.q<Object>, c2<Object>> y10;
            iVar.x(935231726);
            y10 = l0.k.y(this.f39128w, this.f39129x, iVar, 8);
            iVar.O();
            return y10;
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ n0.f<l0.q<Object>, ? extends c2<? extends Object>> invoke(l0.i iVar, Integer num) {
            return a(iVar, num.intValue());
        }
    }

    /* loaded from: classes.dex */
    public static final class g extends jo.q implements io.l<c2<?>, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ j f39130w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(j jVar) {
            super(1);
            this.f39130w = jVar;
        }

        public final void a(c2<?> c2Var) {
            jo.p.h(c2Var, "it");
            this.f39130w.B++;
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(c2<?> c2Var) {
            a(c2Var);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class g0 extends jo.q implements io.q<l0.e<?>, r1, j1, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ Object f39131w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g0(Object obj) {
            super(3);
            this.f39131w = obj;
        }

        public final void a(l0.e<?> eVar, r1 r1Var, j1 j1Var) {
            jo.p.h(eVar, "<anonymous parameter 0>");
            jo.p.h(r1Var, "slots");
            jo.p.h(j1Var, "<anonymous parameter 2>");
            r1Var.Z0(this.f39131w);
        }

        @Override // io.q
        public /* bridge */ /* synthetic */ wn.v s0(l0.e<?> eVar, r1 r1Var, j1 j1Var) {
            a(eVar, r1Var, j1Var);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class h extends jo.q implements io.l<c2<?>, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ j f39132w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(j jVar) {
            super(1);
            this.f39132w = jVar;
        }

        public final void a(c2<?> c2Var) {
            jo.p.h(c2Var, "it");
            j jVar = this.f39132w;
            jVar.B--;
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(c2<?> c2Var) {
            a(c2Var);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class h0 extends jo.q implements io.q<l0.e<?>, r1, j1, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ Object f39133w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h0(Object obj) {
            super(3);
            this.f39133w = obj;
        }

        public final void a(l0.e<?> eVar, r1 r1Var, j1 j1Var) {
            jo.p.h(eVar, "<anonymous parameter 0>");
            jo.p.h(r1Var, "<anonymous parameter 1>");
            jo.p.h(j1Var, "rememberManager");
            j1Var.c((k1) this.f39133w);
        }

        @Override // io.q
        public /* bridge */ /* synthetic */ wn.v s0(l0.e<?> eVar, r1 r1Var, j1 j1Var) {
            a(eVar, r1Var, j1Var);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class i extends jo.q implements io.a<wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.p<l0.i, Integer, wn.v> f39134w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ j f39135x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ Object f39136y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public i(io.p<? super l0.i, ? super Integer, wn.v> pVar, j jVar, Object obj) {
            super(0);
            this.f39134w = pVar;
            this.f39135x = jVar;
            this.f39136y = obj;
        }

        public final void a() {
            Object obj;
            if (this.f39134w != null) {
                this.f39135x.B1(200, l0.k.G());
                l0.c.b(this.f39135x, this.f39134w);
                this.f39135x.u0();
            } else if (this.f39135x.f39088r && (obj = this.f39136y) != null && !jo.p.c(obj, l0.i.f39065a.a())) {
                this.f39135x.B1(200, l0.k.G());
                j jVar = this.f39135x;
                Object obj2 = this.f39136y;
                Objects.requireNonNull(obj2, "null cannot be cast to non-null type kotlin.Function2<androidx.compose.runtime.Composer, kotlin.Int, kotlin.Unit>");
                l0.c.b(jVar, (io.p) jo.j0.e(obj2, 2));
                this.f39135x.u0();
            } else {
                this.f39135x.w1();
            }
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ wn.v invoke() {
            a();
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class i0 extends jo.q implements io.q<l0.e<?>, r1, j1, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ Object f39137w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ int f39138x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i0(Object obj, int i10) {
            super(3);
            this.f39137w = obj;
            this.f39138x = i10;
        }

        public final void a(l0.e<?> eVar, r1 r1Var, j1 j1Var) {
            f1 f1Var;
            l0.o l10;
            jo.p.h(eVar, "<anonymous parameter 0>");
            jo.p.h(r1Var, "slots");
            jo.p.h(j1Var, "rememberManager");
            Object obj = this.f39137w;
            if (obj instanceof k1) {
                j1Var.c((k1) obj);
            }
            Object K0 = r1Var.K0(this.f39138x, this.f39137w);
            if (K0 instanceof k1) {
                j1Var.a((k1) K0);
            } else if (!(K0 instanceof f1) || (l10 = (f1Var = (f1) K0).l()) == null) {
            } else {
                f1Var.x();
                l10.E(true);
            }
        }

        @Override // io.q
        public /* bridge */ /* synthetic */ wn.v s0(l0.e<?> eVar, r1 r1Var, j1 j1Var) {
            a(eVar, r1Var, j1Var);
            return wn.v.f59242a;
        }
    }

    /* renamed from: l0.j$j  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0555j<T> implements Comparator {
        public C0555j() {
        }

        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            return zn.a.c(Integer.valueOf(((l0.g0) t10).b()), Integer.valueOf(((l0.g0) t11).b()));
        }
    }

    /* loaded from: classes.dex */
    public static final class k extends jo.q implements io.q<l0.e<?>, r1, j1, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.l<l0.l, wn.v> f39139w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ j f39140x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public k(io.l<? super l0.l, wn.v> lVar, j jVar) {
            super(3);
            this.f39139w = lVar;
            this.f39140x = jVar;
        }

        public final void a(l0.e<?> eVar, r1 r1Var, j1 j1Var) {
            jo.p.h(eVar, "<anonymous parameter 0>");
            jo.p.h(r1Var, "<anonymous parameter 1>");
            jo.p.h(j1Var, "<anonymous parameter 2>");
            this.f39139w.invoke(this.f39140x.B0());
        }

        @Override // io.q
        public /* bridge */ /* synthetic */ wn.v s0(l0.e<?> eVar, r1 r1Var, j1 j1Var) {
            a(eVar, r1Var, j1Var);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class l extends jo.q implements io.q<l0.e<?>, r1, j1, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ jo.c0 f39141w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ l0.d f39142x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(jo.c0 c0Var, l0.d dVar) {
            super(3);
            this.f39141w = c0Var;
            this.f39142x = dVar;
        }

        public final void a(l0.e<?> eVar, r1 r1Var, j1 j1Var) {
            jo.p.h(eVar, "applier");
            jo.p.h(r1Var, "slots");
            jo.p.h(j1Var, "<anonymous parameter 2>");
            this.f39141w.f38129w = j.H0(r1Var, this.f39142x, eVar);
        }

        @Override // io.q
        public /* bridge */ /* synthetic */ wn.v s0(l0.e<?> eVar, r1 r1Var, j1 j1Var) {
            a(eVar, r1Var, j1Var);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class m extends jo.q implements io.a<wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ j f39143w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ List<io.q<l0.e<?>, r1, j1, wn.v>> f39144x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ o1 f39145y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ r0 f39146z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(j jVar, List<io.q<l0.e<?>, r1, j1, wn.v>> list, o1 o1Var, r0 r0Var) {
            super(0);
            this.f39143w = jVar;
            this.f39144x = list;
            this.f39145y = o1Var;
            this.f39146z = r0Var;
        }

        public final void a() {
            j jVar = this.f39143w;
            List<io.q<l0.e<?>, r1, j1, wn.v>> list = this.f39144x;
            o1 o1Var = this.f39145y;
            r0 r0Var = this.f39146z;
            List list2 = jVar.f39076f;
            try {
                jVar.f39076f = list;
                o1 o1Var2 = jVar.H;
                int[] iArr = jVar.f39085o;
                jVar.f39085o = null;
                jVar.H = o1Var;
                jVar.K0(r0Var.c(), r0Var.e(), r0Var.f(), true);
                wn.v vVar = wn.v.f59242a;
                jVar.H = o1Var2;
                jVar.f39085o = iArr;
            } finally {
                jVar.f39076f = list2;
            }
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ wn.v invoke() {
            a();
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class n extends jo.q implements io.q<l0.e<?>, r1, j1, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ jo.c0 f39147w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ List<io.q<l0.e<?>, r1, j1, wn.v>> f39148x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(jo.c0 c0Var, List<io.q<l0.e<?>, r1, j1, wn.v>> list) {
            super(3);
            this.f39147w = c0Var;
            this.f39148x = list;
        }

        public final void a(l0.e<?> eVar, r1 r1Var, j1 j1Var) {
            jo.p.h(eVar, "applier");
            jo.p.h(r1Var, "slots");
            jo.p.h(j1Var, "rememberManager");
            int i10 = this.f39147w.f38129w;
            if (i10 > 0) {
                eVar = new u0(eVar, i10);
            }
            List<io.q<l0.e<?>, r1, j1, wn.v>> list = this.f39148x;
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                list.get(i11).s0(eVar, r1Var, j1Var);
            }
        }

        @Override // io.q
        public /* bridge */ /* synthetic */ wn.v s0(l0.e<?> eVar, r1 r1Var, j1 j1Var) {
            a(eVar, r1Var, j1Var);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class o extends jo.q implements io.q<l0.e<?>, r1, j1, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ jo.c0 f39149w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ List<Object> f39150x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(jo.c0 c0Var, List<? extends Object> list) {
            super(3);
            this.f39149w = c0Var;
            this.f39150x = list;
        }

        public final void a(l0.e<?> eVar, r1 r1Var, j1 j1Var) {
            jo.p.h(eVar, "applier");
            jo.p.h(r1Var, "<anonymous parameter 1>");
            jo.p.h(j1Var, "<anonymous parameter 2>");
            int i10 = this.f39149w.f38129w;
            List<Object> list = this.f39150x;
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                Object obj = list.get(i11);
                int i12 = i10 + i11;
                eVar.f(i12, obj);
                eVar.d(i12, obj);
            }
        }

        @Override // io.q
        public /* bridge */ /* synthetic */ wn.v s0(l0.e<?> eVar, r1 r1Var, j1 j1Var) {
            a(eVar, r1Var, j1Var);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class p extends jo.q implements io.q<l0.e<?>, r1, j1, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ j f39151w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ r0 f39152x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ r0 f39153y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(j jVar, r0 r0Var, r0 r0Var2) {
            super(3);
            this.f39151w = jVar;
            this.f39152x = r0Var;
            this.f39153y = r0Var2;
        }

        public final void a(l0.e<?> eVar, r1 r1Var, j1 j1Var) {
            jo.p.h(eVar, "<anonymous parameter 0>");
            jo.p.h(r1Var, "slots");
            jo.p.h(j1Var, "<anonymous parameter 2>");
            q0 k10 = this.f39151w.f39073c.k(this.f39152x);
            if (k10 != null) {
                List<l0.d> r02 = r1Var.r0(1, k10.a(), 1);
                if (true ^ r02.isEmpty()) {
                    l0.o oVar = (l0.o) this.f39153y.b();
                    int size = r02.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        Object Q0 = r1Var.Q0(r02.get(i10), 0);
                        f1 f1Var = Q0 instanceof f1 ? (f1) Q0 : null;
                        if (f1Var != null) {
                            f1Var.g(oVar);
                        }
                    }
                    return;
                }
                return;
            }
            l0.k.x("Could not resolve state for movable content");
            throw new KotlinNothingValueException();
        }

        @Override // io.q
        public /* bridge */ /* synthetic */ wn.v s0(l0.e<?> eVar, r1 r1Var, j1 j1Var) {
            a(eVar, r1Var, j1Var);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class q extends jo.q implements io.a<wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ j f39154w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ r0 f39155x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(j jVar, r0 r0Var) {
            super(0);
            this.f39154w = jVar;
            this.f39155x = r0Var;
        }

        public final void a() {
            this.f39154w.K0(this.f39155x.c(), this.f39155x.e(), this.f39155x.f(), true);
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ wn.v invoke() {
            a();
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class r extends jo.q implements io.q<l0.e<?>, r1, j1, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ jo.c0 f39156w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ List<io.q<l0.e<?>, r1, j1, wn.v>> f39157x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(jo.c0 c0Var, List<io.q<l0.e<?>, r1, j1, wn.v>> list) {
            super(3);
            this.f39156w = c0Var;
            this.f39157x = list;
        }

        public final void a(l0.e<?> eVar, r1 r1Var, j1 j1Var) {
            jo.p.h(eVar, "applier");
            jo.p.h(r1Var, "slots");
            jo.p.h(j1Var, "rememberManager");
            int i10 = this.f39156w.f38129w;
            if (i10 > 0) {
                eVar = new u0(eVar, i10);
            }
            List<io.q<l0.e<?>, r1, j1, wn.v>> list = this.f39157x;
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                list.get(i11).s0(eVar, r1Var, j1Var);
            }
        }

        @Override // io.q
        public /* bridge */ /* synthetic */ wn.v s0(l0.e<?> eVar, r1 r1Var, j1 j1Var) {
            a(eVar, r1Var, j1Var);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class s extends jo.q implements io.q<l0.e<?>, r1, j1, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public static final s f39158w = new s();

        static {
        }

        public s() {
            super(3);
        }

        public final void a(l0.e<?> eVar, r1 r1Var, j1 j1Var) {
            jo.p.h(eVar, "applier");
            jo.p.h(r1Var, "slots");
            jo.p.h(j1Var, "<anonymous parameter 2>");
            j.I0(r1Var, eVar, 0);
            r1Var.N();
        }

        @Override // io.q
        public /* bridge */ /* synthetic */ wn.v s0(l0.e<?> eVar, r1 r1Var, j1 j1Var) {
            a(eVar, r1Var, j1Var);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class t extends jo.q implements io.p<l0.i, Integer, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ p0<Object> f39159w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ Object f39160x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t(p0<Object> p0Var, Object obj) {
            super(2);
            this.f39159w = p0Var;
            this.f39160x = obj;
        }

        public final void a(l0.i iVar, int i10) {
            if ((i10 & 11) == 2 && iVar.j()) {
                iVar.I();
            } else {
                this.f39159w.a().s0(this.f39160x, iVar, 8);
            }
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ wn.v invoke(l0.i iVar, Integer num) {
            a(iVar, num.intValue());
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class u extends jo.q implements io.q<l0.e<?>, r1, j1, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ Object[] f39161w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u(Object[] objArr) {
            super(3);
            this.f39161w = objArr;
        }

        public final void a(l0.e<?> eVar, r1 r1Var, j1 j1Var) {
            jo.p.h(eVar, "applier");
            jo.p.h(r1Var, "<anonymous parameter 1>");
            jo.p.h(j1Var, "<anonymous parameter 2>");
            int length = this.f39161w.length;
            for (int i10 = 0; i10 < length; i10++) {
                eVar.g(this.f39161w[i10]);
            }
        }

        @Override // io.q
        public /* bridge */ /* synthetic */ wn.v s0(l0.e<?> eVar, r1 r1Var, j1 j1Var) {
            a(eVar, r1Var, j1Var);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class v extends jo.q implements io.q<l0.e<?>, r1, j1, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ int f39162w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ int f39163x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public v(int i10, int i11) {
            super(3);
            this.f39162w = i10;
            this.f39163x = i11;
        }

        public final void a(l0.e<?> eVar, r1 r1Var, j1 j1Var) {
            jo.p.h(eVar, "applier");
            jo.p.h(r1Var, "<anonymous parameter 1>");
            jo.p.h(j1Var, "<anonymous parameter 2>");
            eVar.c(this.f39162w, this.f39163x);
        }

        @Override // io.q
        public /* bridge */ /* synthetic */ wn.v s0(l0.e<?> eVar, r1 r1Var, j1 j1Var) {
            a(eVar, r1Var, j1Var);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class w extends jo.q implements io.q<l0.e<?>, r1, j1, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ int f39164w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ int f39165x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ int f39166y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public w(int i10, int i11, int i12) {
            super(3);
            this.f39164w = i10;
            this.f39165x = i11;
            this.f39166y = i12;
        }

        public final void a(l0.e<?> eVar, r1 r1Var, j1 j1Var) {
            jo.p.h(eVar, "applier");
            jo.p.h(r1Var, "<anonymous parameter 1>");
            jo.p.h(j1Var, "<anonymous parameter 2>");
            eVar.b(this.f39164w, this.f39165x, this.f39166y);
        }

        @Override // io.q
        public /* bridge */ /* synthetic */ wn.v s0(l0.e<?> eVar, r1 r1Var, j1 j1Var) {
            a(eVar, r1Var, j1Var);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class x extends jo.q implements io.q<l0.e<?>, r1, j1, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ int f39167w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public x(int i10) {
            super(3);
            this.f39167w = i10;
        }

        public final void a(l0.e<?> eVar, r1 r1Var, j1 j1Var) {
            jo.p.h(eVar, "<anonymous parameter 0>");
            jo.p.h(r1Var, "slots");
            jo.p.h(j1Var, "<anonymous parameter 2>");
            r1Var.z(this.f39167w);
        }

        @Override // io.q
        public /* bridge */ /* synthetic */ wn.v s0(l0.e<?> eVar, r1 r1Var, j1 j1Var) {
            a(eVar, r1Var, j1Var);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class y extends jo.q implements io.q<l0.e<?>, r1, j1, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ int f39168w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public y(int i10) {
            super(3);
            this.f39168w = i10;
        }

        public final void a(l0.e<?> eVar, r1 r1Var, j1 j1Var) {
            jo.p.h(eVar, "applier");
            jo.p.h(r1Var, "<anonymous parameter 1>");
            jo.p.h(j1Var, "<anonymous parameter 2>");
            int i10 = this.f39168w;
            for (int i11 = 0; i11 < i10; i11++) {
                eVar.i();
            }
        }

        @Override // io.q
        public /* bridge */ /* synthetic */ wn.v s0(l0.e<?> eVar, r1 r1Var, j1 j1Var) {
            a(eVar, r1Var, j1Var);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class z extends jo.q implements io.q<l0.e<?>, r1, j1, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ p1 f39169w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ l0.d f39170x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public z(p1 p1Var, l0.d dVar) {
            super(3);
            this.f39169w = p1Var;
            this.f39170x = dVar;
        }

        public final void a(l0.e<?> eVar, r1 r1Var, j1 j1Var) {
            jo.p.h(eVar, "<anonymous parameter 0>");
            jo.p.h(r1Var, "slots");
            jo.p.h(j1Var, "<anonymous parameter 2>");
            r1Var.D();
            p1 p1Var = this.f39169w;
            r1Var.o0(p1Var, this.f39170x.d(p1Var));
            r1Var.O();
        }

        @Override // io.q
        public /* bridge */ /* synthetic */ wn.v s0(l0.e<?> eVar, r1 r1Var, j1 j1Var) {
            a(eVar, r1Var, j1Var);
            return wn.v.f59242a;
        }
    }

    public j(l0.e<?> eVar, l0.m mVar, p1 p1Var, Set<k1> set, List<io.q<l0.e<?>, r1, j1, wn.v>> list, List<io.q<l0.e<?>, r1, j1, wn.v>> list2, l0.u uVar) {
        jo.p.h(eVar, "applier");
        jo.p.h(mVar, "parentContext");
        jo.p.h(p1Var, "slotTable");
        jo.p.h(set, "abandonSet");
        jo.p.h(list, "changes");
        jo.p.h(list2, "lateChanges");
        jo.p.h(uVar, "composition");
        this.f39072b = eVar;
        this.f39073c = mVar;
        this.f39074d = p1Var;
        this.f39075e = set;
        this.f39076f = list;
        this.f39077g = list2;
        this.f39078h = uVar;
        this.f39079i = new b2<>();
        this.f39082l = new l0.f0();
        this.f39084n = new l0.f0();
        this.f39090t = new ArrayList();
        this.f39091u = new l0.f0();
        this.f39092v = n0.a.a();
        this.f39093w = new HashMap<>();
        this.f39095y = new l0.f0();
        this.A = -1;
        this.C = v0.m.B();
        this.E = new b2<>();
        o1 w10 = p1Var.w();
        w10.d();
        this.H = w10;
        p1 p1Var2 = new p1();
        this.I = p1Var2;
        r1 x10 = p1Var2.x();
        x10.F();
        this.J = x10;
        o1 w11 = this.I.w();
        try {
            l0.d a10 = w11.a(0);
            w11.d();
            this.M = a10;
            this.N = new ArrayList();
            this.R = new b2<>();
            this.U = true;
            this.V = new l0.f0();
            this.W = new b2<>();
            this.X = -1;
            this.Y = -1;
            this.Z = -1;
        } catch (Throwable th2) {
            w11.d();
            throw th2;
        }
    }

    public static final int G0(r1 r1Var) {
        int U = r1Var.U();
        int V = r1Var.V();
        while (V >= 0 && !r1Var.k0(V)) {
            V = r1Var.y0(V);
        }
        int i10 = V + 1;
        int i11 = 0;
        while (i10 < U) {
            if (r1Var.f0(U, i10)) {
                if (r1Var.k0(i10)) {
                    i11 = 0;
                }
                i10++;
            } else {
                i11 += r1Var.k0(i10) ? 1 : r1Var.w0(i10);
                i10 += r1Var.c0(i10);
            }
        }
        return i11;
    }

    public static final int H0(r1 r1Var, l0.d dVar, l0.e<Object> eVar) {
        int B = r1Var.B(dVar);
        l0.k.X(r1Var.U() < B);
        I0(r1Var, eVar, B);
        int G0 = G0(r1Var);
        while (r1Var.U() < B) {
            if (r1Var.e0(B)) {
                if (r1Var.j0()) {
                    eVar.g(r1Var.u0(r1Var.U()));
                    G0 = 0;
                }
                r1Var.T0();
            } else {
                G0 += r1Var.N0();
            }
        }
        l0.k.X(r1Var.U() == B);
        return G0;
    }

    public static final void I0(r1 r1Var, l0.e<Object> eVar, int i10) {
        while (!r1Var.g0(i10)) {
            r1Var.O0();
            if (r1Var.k0(r1Var.V())) {
                eVar.i();
            }
            r1Var.N();
        }
    }

    public static /* synthetic */ void U0(j jVar, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        jVar.T0(z10);
    }

    public static /* synthetic */ Object Y0(j jVar, l0.u uVar, l0.u uVar2, Integer num, List list, io.a aVar, int i10, Object obj) {
        l0.u uVar3 = (i10 & 1) != 0 ? null : uVar;
        l0.u uVar4 = (i10 & 2) != 0 ? null : uVar2;
        Integer num2 = (i10 & 4) != 0 ? null : num;
        List list2 = list;
        if ((i10 & 8) != 0) {
            list2 = xn.s.k();
        }
        return jVar.X0(uVar3, uVar4, num2, list2, aVar);
    }

    public static /* synthetic */ n0.f p0(j jVar, Integer num, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            num = null;
        }
        return jVar.o0(num);
    }

    public static /* synthetic */ void p1(j jVar, boolean z10, io.q qVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        jVar.o1(z10, qVar);
    }

    public static final int u1(j jVar, int i10, boolean z10, int i11) {
        List B;
        if (jVar.H.C(i10)) {
            Object A = jVar.H.A(i10);
            Objects.requireNonNull(A, "null cannot be cast to non-null type androidx.compose.runtime.MovableContent<kotlin.Any?>");
            p0 p0Var = (p0) A;
            Object y10 = jVar.H.y(i10, 0);
            l0.d a10 = jVar.H.a(i10);
            B = l0.k.B(jVar.f39090t, i10, jVar.H.B(i10) + i10);
            ArrayList arrayList = new ArrayList(B.size());
            int size = B.size();
            for (int i12 = 0; i12 < size; i12++) {
                l0.g0 g0Var = (l0.g0) B.get(i12);
                arrayList.add(wn.q.a(g0Var.c(), g0Var.a()));
            }
            r0 r0Var = new r0(p0Var, y10, jVar.B0(), jVar.f39074d, a10, arrayList, jVar.o0(Integer.valueOf(i10)));
            jVar.f39073c.b(r0Var);
            jVar.m1();
            jVar.a1(new d0(jVar, r0Var, a10));
            if (z10) {
                jVar.S0();
                jVar.V0();
                jVar.Q0();
                int K = jVar.H.G(i10) ? 1 : jVar.H.K(i10);
                if (K > 0) {
                    jVar.l1(i11, K);
                    return 0;
                }
                return 0;
            }
            return jVar.H.K(i10);
        } else if (jVar.H.e(i10)) {
            int B2 = jVar.H.B(i10) + i10;
            int i13 = i10 + 1;
            int i14 = 0;
            while (i13 < B2) {
                boolean G = jVar.H.G(i13);
                if (G) {
                    jVar.S0();
                    jVar.d1(jVar.H.I(i13));
                }
                i14 += u1(jVar, i13, G || z10, G ? 0 : i11 + i14);
                if (G) {
                    jVar.S0();
                    jVar.q1();
                }
                i13 += jVar.H.B(i13);
            }
            return i14;
        } else {
            return jVar.H.K(i10);
        }
    }

    @Override // l0.i
    public <V, T> void A(V v10, io.p<? super T, ? super V, wn.v> pVar) {
        jo.p.h(pVar, "block");
        c cVar = new c(pVar, v10);
        if (f()) {
            g1(cVar);
        } else {
            b1(cVar);
        }
    }

    public final boolean A0() {
        return this.B > 0;
    }

    public final void A1(int i10) {
        z1(i10, null, false, null);
    }

    @Override // l0.i
    public void B() {
        z1(-127, null, false, null);
    }

    public l0.u B0() {
        return this.f39078h;
    }

    public final void B1(int i10, Object obj) {
        z1(i10, obj, false, null);
    }

    @Override // l0.i
    public void C(int i10, Object obj) {
        z1(i10, obj, false, null);
    }

    public final f1 C0() {
        b2<f1> b2Var = this.E;
        if (this.B == 0 && b2Var.d()) {
            return b2Var.e();
        }
        return null;
    }

    public final void C1(boolean z10, Object obj) {
        if (z10) {
            this.H.S();
            return;
        }
        if (obj != null && this.H.l() != obj) {
            p1(this, false, new g0(obj), 1, null);
        }
        this.H.R();
    }

    @Override // l0.i
    public void D() {
        z1(125, null, true, null);
        this.f39089s = true;
    }

    public final Object D0(o1 o1Var) {
        return o1Var.I(o1Var.s());
    }

    public final void D1() {
        int u10;
        this.H = this.f39074d.w();
        A1(100);
        this.f39073c.n();
        this.f39092v = this.f39073c.e();
        l0.f0 f0Var = this.f39095y;
        u10 = l0.k.u(this.f39094x);
        f0Var.i(u10);
        this.f39094x = P(this.f39092v);
        this.L = null;
        if (!this.f39087q) {
            this.f39087q = this.f39073c.d();
        }
        Set<w0.a> set = (Set) v1(w0.c.a(), this.f39092v);
        if (set != null) {
            set.add(this.f39074d);
            this.f39073c.l(set);
        }
        A1(this.f39073c.f());
    }

    @Override // l0.i
    public void E() {
        this.f39096z = false;
    }

    public final int E0(o1 o1Var, int i10) {
        Object w10;
        if (o1Var.D(i10)) {
            Object A = o1Var.A(i10);
            if (A != null) {
                if (A instanceof Enum) {
                    return ((Enum) A).ordinal();
                }
                if (A instanceof p0) {
                    return 126665345;
                }
                return A.hashCode();
            }
            return 0;
        }
        int z10 = o1Var.z(i10);
        if (z10 == 207 && (w10 = o1Var.w(i10)) != null && !jo.p.c(w10, l0.i.f39065a.a())) {
            z10 = w10.hashCode();
        }
        return z10;
    }

    public final boolean E1(f1 f1Var, Object obj) {
        jo.p.h(f1Var, "scope");
        l0.d j10 = f1Var.j();
        if (j10 == null) {
            return false;
        }
        int d10 = j10.d(this.f39074d);
        if (!this.F || d10 < this.H.k()) {
            return false;
        }
        l0.k.N(this.f39090t, d10, f1Var, obj);
        return true;
    }

    @Override // l0.i
    public void F(e1 e1Var) {
        jo.p.h(e1Var, "scope");
        f1 f1Var = e1Var instanceof f1 ? (f1) e1Var : null;
        if (f1Var == null) {
            return;
        }
        f1Var.G(true);
    }

    public void F0(List<wn.k<r0, r0>> list) {
        io.q<? super l0.e<?>, ? super r1, ? super j1, wn.v> qVar;
        List v10;
        List list2;
        io.q<? super l0.e<?>, ? super r1, ? super j1, wn.v> qVar2;
        jo.p.h(list, "references");
        List<io.q<l0.e<?>, r1, j1, wn.v>> list3 = this.f39077g;
        List list4 = this.f39076f;
        try {
            this.f39076f = list3;
            qVar = l0.k.f39181f;
            a1(qVar);
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                wn.k<r0, r0> kVar = list.get(i10);
                r0 a10 = kVar.a();
                r0 b10 = kVar.b();
                l0.d a11 = a10.a();
                int d10 = a10.g().d(a11);
                jo.c0 c0Var = new jo.c0();
                V0();
                a1(new l(c0Var, a11));
                if (b10 != null) {
                    v10 = l0.k.v(b10.g(), b10.a());
                    if (!v10.isEmpty()) {
                        a1(new o(c0Var, v10));
                        int d11 = this.f39074d.d(a11);
                        J1(d11, N1(d11) + v10.size());
                    }
                    a1(new p(this, b10, a10));
                    p1 g10 = b10.g();
                    o1 w10 = g10.w();
                    o1 o1Var = this.H;
                    int[] iArr = this.f39085o;
                    this.f39085o = null;
                    this.H = w10;
                    int d12 = g10.d(b10.a());
                    w10.N(d12);
                    this.S = d12;
                    ArrayList arrayList = new ArrayList();
                    List list5 = this.f39076f;
                    try {
                        this.f39076f = arrayList;
                        list2 = list5;
                    } catch (Throwable th2) {
                        th = th2;
                        list2 = list5;
                    }
                    try {
                        X0(b10.b(), a10.b(), Integer.valueOf(w10.k()), b10.d(), new q(this, a10));
                        wn.v vVar = wn.v.f59242a;
                        this.f39076f = list2;
                        if (!arrayList.isEmpty()) {
                            a1(new r(c0Var, arrayList));
                        }
                        this.H = o1Var;
                        this.f39085o = iArr;
                        w10.d();
                    } catch (Throwable th3) {
                        th = th3;
                        this.f39076f = list2;
                        throw th;
                    }
                } else {
                    if (jo.p.c(a10.g(), this.I)) {
                        n0();
                    }
                    o1 w11 = a10.g().w();
                    w11.N(d10);
                    this.S = d10;
                    ArrayList arrayList2 = new ArrayList();
                    Y0(this, null, null, null, null, new m(this, arrayList2, w11, a10), 15, null);
                    if (!arrayList2.isEmpty()) {
                        a1(new n(c0Var, arrayList2));
                    }
                    wn.v vVar2 = wn.v.f59242a;
                    w11.d();
                }
                qVar2 = l0.k.f39178c;
                a1(qVar2);
            }
            a1(s.f39158w);
            this.S = 0;
            wn.v vVar3 = wn.v.f59242a;
            this.f39076f = list4;
            j0();
        } catch (Throwable th4) {
            this.f39076f = list4;
            throw th4;
        }
    }

    public final void F1(int i10, Object obj, Object obj2) {
        if (obj == null) {
            if (obj2 != null && i10 == 207 && !jo.p.c(obj2, l0.i.f39065a.a())) {
                G1(obj2.hashCode());
            } else {
                G1(i10);
            }
        } else if (obj instanceof Enum) {
            G1(((Enum) obj).ordinal());
        } else {
            G1(obj.hashCode());
        }
    }

    @Override // l0.i
    public <T> T G(l0.q<T> qVar) {
        jo.p.h(qVar, "key");
        return (T) v1(qVar, p0(this, null, 1, null));
    }

    public final void G1(int i10) {
        this.P = i10 ^ Integer.rotateLeft(L(), 3);
    }

    @Override // l0.i
    public void H(int i10, Object obj) {
        if (this.H.n() == i10 && !jo.p.c(this.H.l(), obj) && this.A < 0) {
            this.A = this.H.k();
            this.f39096z = true;
        }
        z1(i10, null, false, obj);
    }

    public final void H1(int i10, Object obj, Object obj2) {
        if (obj == null) {
            if (obj2 != null && i10 == 207 && !jo.p.c(obj2, l0.i.f39065a.a())) {
                I1(obj2.hashCode());
            } else {
                I1(i10);
            }
        } else if (obj instanceof Enum) {
            I1(((Enum) obj).ordinal());
        } else {
            I1(obj.hashCode());
        }
    }

    @Override // l0.i
    public void I() {
        if (this.f39083m == 0) {
            f1 C0 = C0();
            if (C0 != null) {
                C0.z();
            }
            if (this.f39090t.isEmpty()) {
                y1();
                return;
            } else {
                Z0();
                return;
            }
        }
        l0.k.x("No nodes can be emitted before calling skipAndEndGroup".toString());
        throw new KotlinNothingValueException();
    }

    public final void I1(int i10) {
        this.P = Integer.rotateRight(Integer.hashCode(i10) ^ L(), 3);
    }

    @Override // l0.i
    public void J() {
        boolean t10;
        u0();
        u0();
        t10 = l0.k.t(this.f39095y.h());
        this.f39094x = t10;
        this.L = null;
    }

    public final int J0(int i10) {
        return (-2) - i10;
    }

    public final void J1(int i10, int i11) {
        if (N1(i10) != i11) {
            if (i10 < 0) {
                HashMap<Integer, Integer> hashMap = this.f39086p;
                if (hashMap == null) {
                    hashMap = new HashMap<>();
                    this.f39086p = hashMap;
                }
                hashMap.put(Integer.valueOf(i10), Integer.valueOf(i11));
                return;
            }
            int[] iArr = this.f39085o;
            if (iArr == null) {
                iArr = new int[this.H.u()];
                xn.n.s(iArr, -1, 0, 0, 6, null);
                this.f39085o = iArr;
            }
            iArr[i10] = i11;
        }
    }

    @Override // l0.i
    public boolean K() {
        if (!this.f39094x) {
            f1 C0 = C0();
            if (!(C0 != null && C0.n())) {
                return false;
            }
        }
        return true;
    }

    public final void K0(p0<Object> p0Var, n0.f<l0.q<Object>, ? extends c2<? extends Object>> fVar, Object obj, boolean z10) {
        C(126665345, p0Var);
        P(obj);
        int L = L();
        this.P = 126665345;
        if (f()) {
            r1.m0(this.J, 0, 1, null);
        }
        boolean z11 = (f() || jo.p.c(this.H.l(), fVar)) ? false : true;
        if (z11) {
            this.f39093w.put(Integer.valueOf(this.H.k()), fVar);
        }
        z1(202, l0.k.F(), false, fVar);
        if (f() && !z10) {
            this.K = true;
            this.L = null;
            r1 r1Var = this.J;
            this.f39073c.h(new r0(p0Var, obj, B0(), this.I, r1Var.A(r1Var.y0(r1Var.V())), xn.s.k(), p0(this, null, 1, null)));
        } else {
            boolean z12 = this.f39094x;
            this.f39094x = z11;
            l0.c.b(this, s0.c.c(1378964644, true, new t(p0Var, obj)));
            this.f39094x = z12;
        }
        u0();
        this.P = L;
        N();
    }

    public final void K1(int i10, int i11) {
        int N1 = N1(i10);
        if (N1 != i11) {
            int i12 = i11 - N1;
            int b10 = this.f39079i.b() - 1;
            while (i10 != -1) {
                int N12 = N1(i10) + i12;
                J1(i10, N12);
                int i13 = b10;
                while (true) {
                    if (-1 < i13) {
                        y0 f10 = this.f39079i.f(i13);
                        if (f10 != null && f10.n(i10, N12)) {
                            b10 = i13 - 1;
                            break;
                        }
                        i13--;
                    } else {
                        break;
                    }
                }
                if (i10 < 0) {
                    i10 = this.H.s();
                } else if (this.H.G(i10)) {
                    return;
                } else {
                    i10 = this.H.M(i10);
                }
            }
        }
    }

    @Override // l0.i
    public int L() {
        return this.P;
    }

    public final boolean L0() {
        return this.F;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final n0.f<l0.q<Object>, c2<Object>> L1(n0.f<l0.q<Object>, ? extends c2<? extends Object>> fVar, n0.f<l0.q<Object>, ? extends c2<? extends Object>> fVar2) {
        f.a<l0.q<Object>, ? extends c2<? extends Object>> n10 = fVar.n();
        n10.putAll(fVar2);
        n0.f a10 = n10.a();
        B1(204, l0.k.J());
        P(a10);
        P(fVar2);
        u0();
        return a10;
    }

    @Override // l0.i
    public l0.m M() {
        B1(206, l0.k.L());
        Object M0 = M0();
        a aVar = M0 instanceof a ? (a) M0 : null;
        if (aVar == null) {
            aVar = new a(new b(L(), this.f39087q));
            M1(aVar);
        }
        aVar.d().t(p0(this, null, 1, null));
        u0();
        return aVar.d();
    }

    public final Object M0() {
        if (!f()) {
            return this.f39096z ? l0.i.f39065a.a() : this.H.H();
        }
        P1();
        return l0.i.f39065a.a();
    }

    public final void M1(Object obj) {
        if (f()) {
            this.J.X0(obj);
            if (obj instanceof k1) {
                a1(new h0(obj));
                this.f39075e.add(obj);
                return;
            }
            return;
        }
        int q10 = this.H.q() - 1;
        if (obj instanceof k1) {
            this.f39075e.add(obj);
        }
        o1(true, new i0(obj, q10));
    }

    @Override // l0.i
    public void N() {
        u0();
    }

    public final Object N0(o1 o1Var, int i10) {
        return o1Var.I(i10);
    }

    public final int N1(int i10) {
        int i11;
        Integer num;
        if (i10 < 0) {
            HashMap<Integer, Integer> hashMap = this.f39086p;
            if (hashMap == null || (num = hashMap.get(Integer.valueOf(i10))) == null) {
                return 0;
            }
            return num.intValue();
        }
        int[] iArr = this.f39085o;
        return (iArr == null || (i11 = iArr[i10]) < 0) ? this.H.K(i10) : i11;
    }

    @Override // l0.i
    public void O() {
        u0();
    }

    public final int O0(int i10, int i11, int i12, int i13) {
        int M = this.H.M(i11);
        while (M != i12 && !this.H.G(M)) {
            M = this.H.M(M);
        }
        if (this.H.G(M)) {
            i13 = 0;
        }
        if (M == i11) {
            return i13;
        }
        int N1 = (N1(M) - this.H.K(i11)) + i13;
        loop1: while (i13 < N1 && M != i10) {
            M++;
            while (M < i10) {
                int B = this.H.B(M) + M;
                if (i10 >= B) {
                    i13 += N1(M);
                    M = B;
                }
            }
            break loop1;
        }
        return i13;
    }

    public final void O1() {
        if (this.f39089s) {
            this.f39089s = false;
        } else {
            l0.k.x("A call to createNode(), emitNode() or useNode() expected was not expected".toString());
            throw new KotlinNothingValueException();
        }
    }

    @Override // l0.i
    public boolean P(Object obj) {
        if (jo.p.c(M0(), obj)) {
            return false;
        }
        M1(obj);
        return true;
    }

    public final void P0(io.a<wn.v> aVar) {
        jo.p.h(aVar, "block");
        if (!this.F) {
            this.F = true;
            try {
                aVar.invoke();
                return;
            } finally {
                this.F = false;
            }
        }
        l0.k.x("Preparing a composition while composing is not supported".toString());
        throw new KotlinNothingValueException();
    }

    public final void P1() {
        if (!this.f39089s) {
            return;
        }
        l0.k.x("A call to createNode(), emitNode() or useNode() expected".toString());
        throw new KotlinNothingValueException();
    }

    public final void Q() {
        j0();
        this.f39079i.a();
        this.f39082l.a();
        this.f39084n.a();
        this.f39091u.a();
        this.f39095y.a();
        this.f39093w.clear();
        this.H.d();
        this.P = 0;
        this.B = 0;
        this.f39089s = false;
        this.F = false;
        this.f39088r = false;
    }

    public final void Q0() {
        if (this.R.d()) {
            R0(this.R.i());
            this.R.a();
        }
    }

    public final void R0(Object[] objArr) {
        a1(new u(objArr));
    }

    public final void S0() {
        int i10 = this.f39071a0;
        this.f39071a0 = 0;
        if (i10 > 0) {
            int i11 = this.X;
            if (i11 >= 0) {
                this.X = -1;
                b1(new v(i11, i10));
                return;
            }
            int i12 = this.Y;
            this.Y = -1;
            int i13 = this.Z;
            this.Z = -1;
            b1(new w(i12, i13, i10));
        }
    }

    public final void T0(boolean z10) {
        int s10 = z10 ? this.H.s() : this.H.k();
        int i10 = s10 - this.S;
        if (!(i10 >= 0)) {
            l0.k.x("Tried to seek backward".toString());
            throw new KotlinNothingValueException();
        } else if (i10 > 0) {
            a1(new x(i10));
            this.S = s10;
        }
    }

    public final void V0() {
        int i10 = this.Q;
        if (i10 > 0) {
            this.Q = 0;
            a1(new y(i10));
        }
    }

    public final boolean W0(m0.b<f1, m0.c<Object>> bVar) {
        jo.p.h(bVar, "invalidationsRequested");
        if (this.f39076f.isEmpty()) {
            if (bVar.h() || (!this.f39090t.isEmpty()) || this.f39088r) {
                r0(bVar, null);
                return !this.f39076f.isEmpty();
            }
            return false;
        }
        l0.k.x("Expected applyChanges() to have been called".toString());
        throw new KotlinNothingValueException();
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x004f, code lost:
        if (r9 == null) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final <R> R X0(l0.u r9, l0.u r10, java.lang.Integer r11, java.util.List<wn.k<l0.f1, m0.c<java.lang.Object>>> r12, io.a<? extends R> r13) {
        /*
            r8 = this;
            boolean r0 = r8.U
            boolean r1 = r8.F
            int r2 = r8.f39081k
            r3 = 0
            r8.U = r3     // Catch: java.lang.Throwable -> L5c
            r4 = 1
            r8.F = r4     // Catch: java.lang.Throwable -> L5c
            r8.f39081k = r3     // Catch: java.lang.Throwable -> L5c
            int r4 = r12.size()     // Catch: java.lang.Throwable -> L5c
        L12:
            if (r3 >= r4) goto L41
            java.lang.Object r5 = r12.get(r3)     // Catch: java.lang.Throwable -> L5c
            wn.k r5 = (wn.k) r5     // Catch: java.lang.Throwable -> L5c
            java.lang.Object r6 = r5.a()     // Catch: java.lang.Throwable -> L5c
            l0.f1 r6 = (l0.f1) r6     // Catch: java.lang.Throwable -> L5c
            java.lang.Object r5 = r5.b()     // Catch: java.lang.Throwable -> L5c
            m0.c r5 = (m0.c) r5     // Catch: java.lang.Throwable -> L5c
            if (r5 == 0) goto L3a
            java.util.Iterator r5 = r5.iterator()     // Catch: java.lang.Throwable -> L5c
        L2c:
            boolean r7 = r5.hasNext()     // Catch: java.lang.Throwable -> L5c
            if (r7 == 0) goto L3e
            java.lang.Object r7 = r5.next()     // Catch: java.lang.Throwable -> L5c
            r8.E1(r6, r7)     // Catch: java.lang.Throwable -> L5c
            goto L2c
        L3a:
            r5 = 0
            r8.E1(r6, r5)     // Catch: java.lang.Throwable -> L5c
        L3e:
            int r3 = r3 + 1
            goto L12
        L41:
            if (r9 == 0) goto L51
            if (r11 == 0) goto L4a
            int r11 = r11.intValue()     // Catch: java.lang.Throwable -> L5c
            goto L4b
        L4a:
            r11 = -1
        L4b:
            java.lang.Object r9 = r9.a(r10, r11, r13)     // Catch: java.lang.Throwable -> L5c
            if (r9 != 0) goto L55
        L51:
            java.lang.Object r9 = r13.invoke()     // Catch: java.lang.Throwable -> L5c
        L55:
            r8.U = r0
            r8.F = r1
            r8.f39081k = r2
            return r9
        L5c:
            r9 = move-exception
            r8.U = r0
            r8.F = r1
            r8.f39081k = r2
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: l0.j.X0(l0.u, l0.u, java.lang.Integer, java.util.List, io.a):java.lang.Object");
    }

    public final void Z0() {
        l0.g0 E;
        boolean z10 = this.F;
        this.F = true;
        int s10 = this.H.s();
        int B = this.H.B(s10) + s10;
        int i10 = this.f39081k;
        int L = L();
        int i11 = this.f39083m;
        E = l0.k.E(this.f39090t, this.H.k(), B);
        boolean z11 = false;
        int i12 = s10;
        while (E != null) {
            int b10 = E.b();
            l0.k.V(this.f39090t, b10);
            if (E.d()) {
                this.H.N(b10);
                int k10 = this.H.k();
                r1(i12, k10, s10);
                this.f39081k = O0(b10, k10, s10, i10);
                this.P = m0(this.H.M(k10), s10, L);
                this.L = null;
                E.c().h(this);
                this.L = null;
                this.H.O(s10);
                i12 = k10;
                z11 = true;
            } else {
                this.E.h(E.c());
                E.c().y();
                this.E.g();
            }
            E = l0.k.E(this.f39090t, this.H.k(), B);
        }
        if (z11) {
            r1(i12, s10, s10);
            this.H.Q();
            int N1 = N1(s10);
            this.f39081k = i10 + N1;
            this.f39083m = i11 + N1;
        } else {
            y1();
        }
        this.P = L;
        this.F = z10;
    }

    @Override // l0.i
    public boolean a(boolean z10) {
        Object M0 = M0();
        if ((M0 instanceof Boolean) && z10 == ((Boolean) M0).booleanValue()) {
            return false;
        }
        M1(Boolean.valueOf(z10));
        return true;
    }

    public final void a1(io.q<? super l0.e<?>, ? super r1, ? super j1, wn.v> qVar) {
        this.f39076f.add(qVar);
    }

    @Override // l0.i
    public boolean b(float f10) {
        Object M0 = M0();
        if (M0 instanceof Float) {
            if (f10 == ((Number) M0).floatValue()) {
                return false;
            }
        }
        M1(Float.valueOf(f10));
        return true;
    }

    public final void b1(io.q<? super l0.e<?>, ? super r1, ? super j1, wn.v> qVar) {
        V0();
        Q0();
        a1(qVar);
    }

    @Override // l0.i
    public void c() {
        this.f39096z = this.A >= 0;
    }

    public final void c1() {
        io.q<? super l0.e<?>, ? super r1, ? super j1, wn.v> qVar;
        t1(this.H.k());
        qVar = l0.k.f39177b;
        n1(qVar);
        this.S += this.H.p();
    }

    @Override // l0.i
    public boolean d(int i10) {
        Object M0 = M0();
        if ((M0 instanceof Integer) && i10 == ((Number) M0).intValue()) {
            return false;
        }
        M1(Integer.valueOf(i10));
        return true;
    }

    public final void d1(Object obj) {
        this.R.h(obj);
    }

    @Override // l0.i
    public boolean e(long j10) {
        Object M0 = M0();
        if ((M0 instanceof Long) && j10 == ((Number) M0).longValue()) {
            return false;
        }
        M1(Long.valueOf(j10));
        return true;
    }

    public final void e1() {
        io.q qVar;
        int s10 = this.H.s();
        if (this.V.g(-1) <= s10) {
            if (this.V.g(-1) == s10) {
                this.V.h();
                qVar = l0.k.f39179d;
                p1(this, false, qVar, 1, null);
                return;
            }
            return;
        }
        l0.k.x("Missed recording an endGroup".toString());
        throw new KotlinNothingValueException();
    }

    @Override // l0.i
    public boolean f() {
        return this.O;
    }

    public final void f1() {
        io.q qVar;
        if (this.T) {
            qVar = l0.k.f39179d;
            p1(this, false, qVar, 1, null);
            this.T = false;
        }
    }

    @Override // l0.i
    public void g(boolean z10) {
        if (this.f39083m == 0) {
            if (f()) {
                return;
            }
            if (!z10) {
                y1();
                return;
            }
            int k10 = this.H.k();
            int j10 = this.H.j();
            for (int i10 = k10; i10 < j10; i10++) {
                this.H.i(i10, new f(this, i10));
            }
            l0.k.W(this.f39090t, k10, j10);
            this.H.N(k10);
            this.H.Q();
            return;
        }
        l0.k.x("No nodes can be emitted before calling dactivateToEndGroup".toString());
        throw new KotlinNothingValueException();
    }

    public final void g1(io.q<? super l0.e<?>, ? super r1, ? super j1, wn.v> qVar) {
        this.N.add(qVar);
    }

    @Override // l0.i
    public l0.i h(int i10) {
        z1(i10, null, false, null);
        h0();
        return this;
    }

    public final void h0() {
        l0.g0 V;
        f1 f1Var;
        if (!f()) {
            V = l0.k.V(this.f39090t, this.H.s());
            Object H = this.H.H();
            if (jo.p.c(H, l0.i.f39065a.a())) {
                f1Var = new f1((l0.o) B0());
                M1(f1Var);
            } else {
                Objects.requireNonNull(H, "null cannot be cast to non-null type androidx.compose.runtime.RecomposeScopeImpl");
                f1Var = (f1) H;
            }
            f1Var.D(V != null);
            this.E.h(f1Var);
            f1Var.H(this.D);
            return;
        }
        f1 f1Var2 = new f1((l0.o) B0());
        this.E.h(f1Var2);
        M1(f1Var2);
        f1Var2.H(this.D);
    }

    public final void h1(l0.d dVar) {
        if (this.N.isEmpty()) {
            n1(new z(this.I, dVar));
            return;
        }
        List D0 = xn.a0.D0(this.N);
        this.N.clear();
        V0();
        Q0();
        n1(new a0(this.I, dVar, D0));
    }

    @Override // l0.i
    public void i(io.a<wn.v> aVar) {
        jo.p.h(aVar, "effect");
        a1(new b0(aVar));
    }

    public final void i0() {
        this.f39093w.clear();
    }

    public final void i1(io.q<? super l0.e<?>, ? super r1, ? super j1, wn.v> qVar) {
        this.W.h(qVar);
    }

    @Override // l0.i
    public boolean j() {
        if (!f() && !this.f39096z && !this.f39094x) {
            f1 C0 = C0();
            if (((C0 == null || C0.o()) ? false : true) && !this.f39088r) {
                return true;
            }
        }
        return false;
    }

    public final void j0() {
        this.f39080j = null;
        this.f39081k = 0;
        this.f39083m = 0;
        this.S = 0;
        this.P = 0;
        this.f39089s = false;
        this.T = false;
        this.V.a();
        this.E.a();
        k0();
    }

    public final void j1(int i10, int i11, int i12) {
        if (i12 > 0) {
            int i13 = this.f39071a0;
            if (i13 > 0 && this.Y == i10 - i13 && this.Z == i11 - i13) {
                this.f39071a0 = i13 + i12;
                return;
            }
            S0();
            this.Y = i10;
            this.Z = i11;
            this.f39071a0 = i12;
        }
    }

    @Override // l0.i
    public l0.e<?> k() {
        return this.f39072b;
    }

    public final void k0() {
        this.f39085o = null;
        this.f39086p = null;
    }

    public final void k1(int i10) {
        this.S = i10 - (this.H.k() - this.S);
    }

    @Override // l0.i
    public l1 l() {
        l0.d a10;
        io.l<l0.l, wn.v> i10;
        f1 f1Var = null;
        f1 g10 = this.E.d() ? this.E.g() : null;
        if (g10 != null) {
            g10.D(false);
        }
        if (g10 != null && (i10 = g10.i(this.D)) != null) {
            a1(new k(i10, this));
        }
        if (g10 != null && !g10.q() && (g10.r() || this.f39087q)) {
            if (g10.j() == null) {
                if (f()) {
                    r1 r1Var = this.J;
                    a10 = r1Var.A(r1Var.V());
                } else {
                    o1 o1Var = this.H;
                    a10 = o1Var.a(o1Var.s());
                }
                g10.A(a10);
            }
            g10.C(false);
            f1Var = g10;
        }
        t0(false);
        return f1Var;
    }

    public final void l0(m0.b<f1, m0.c<Object>> bVar, io.p<? super l0.i, ? super Integer, wn.v> pVar) {
        jo.p.h(bVar, "invalidationsRequested");
        jo.p.h(pVar, "content");
        if (this.f39076f.isEmpty()) {
            r0(bVar, pVar);
        } else {
            l0.k.x("Expected applyChanges() to have been called".toString());
            throw new KotlinNothingValueException();
        }
    }

    public final void l1(int i10, int i11) {
        if (i11 > 0) {
            if (i10 >= 0) {
                if (this.X == i10) {
                    this.f39071a0 += i11;
                    return;
                }
                S0();
                this.X = i10;
                this.f39071a0 = i11;
                return;
            }
            l0.k.x(("Invalid remove index " + i10).toString());
            throw new KotlinNothingValueException();
        }
    }

    @Override // l0.i
    public void m() {
        int i10 = 126;
        if (f() || (!this.f39096z ? this.H.n() != 126 : this.H.n() != 125)) {
            i10 = 125;
        }
        z1(i10, null, true, null);
        this.f39089s = true;
    }

    public final int m0(int i10, int i11, int i12) {
        if (i10 == i11) {
            return i12;
        }
        int E0 = E0(this.H, i10);
        return E0 == 126665345 ? E0 : Integer.rotateLeft(m0(this.H.M(i10), i11, i12), 3) ^ E0;
    }

    public final void m1() {
        o1 o1Var;
        int s10;
        io.q qVar;
        if (this.H.u() <= 0 || this.V.g(-1) == (s10 = (o1Var = this.H).s())) {
            return;
        }
        if (!this.T && this.U) {
            qVar = l0.k.f39180e;
            p1(this, false, qVar, 1, null);
            this.T = true;
        }
        l0.d a10 = o1Var.a(s10);
        this.V.i(s10);
        p1(this, false, new c0(a10), 1, null);
    }

    @Override // l0.i
    public ao.g n() {
        return this.f39073c.g();
    }

    public final void n0() {
        l0.k.X(this.J.T());
        p1 p1Var = new p1();
        this.I = p1Var;
        r1 x10 = p1Var.x();
        x10.F();
        this.J = x10;
    }

    public final void n1(io.q<? super l0.e<?>, ? super r1, ? super j1, wn.v> qVar) {
        U0(this, false, 1, null);
        m1();
        a1(qVar);
    }

    @Override // l0.i
    public void o() {
        O1();
        if (!f()) {
            d1(D0(this.H));
        } else {
            l0.k.x("useNode() called while inserting".toString());
            throw new KotlinNothingValueException();
        }
    }

    public final n0.f<l0.q<Object>, c2<Object>> o0(Integer num) {
        n0.f fVar;
        if (num != null || (fVar = this.L) == null) {
            if (f() && this.K) {
                int V = this.J.V();
                while (V > 0) {
                    if (this.J.a0(V) == 202 && jo.p.c(this.J.b0(V), l0.k.F())) {
                        Object Y = this.J.Y(V);
                        Objects.requireNonNull(Y, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<androidx.compose.runtime.CompositionLocal<kotlin.Any?>, androidx.compose.runtime.State<kotlin.Any?>>{ androidx.compose.runtime.ComposerKt.CompositionLocalMap }");
                        n0.f<l0.q<Object>, c2<Object>> fVar2 = (n0.f) Y;
                        this.L = fVar2;
                        return fVar2;
                    }
                    V = this.J.y0(V);
                }
            }
            if (this.H.u() > 0) {
                int intValue = num != null ? num.intValue() : this.H.s();
                while (intValue > 0) {
                    if (this.H.z(intValue) == 202 && jo.p.c(this.H.A(intValue), l0.k.F())) {
                        n0.f<l0.q<Object>, c2<Object>> fVar3 = this.f39093w.get(Integer.valueOf(intValue));
                        if (fVar3 == null) {
                            Object w10 = this.H.w(intValue);
                            Objects.requireNonNull(w10, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<androidx.compose.runtime.CompositionLocal<kotlin.Any?>, androidx.compose.runtime.State<kotlin.Any?>>{ androidx.compose.runtime.ComposerKt.CompositionLocalMap }");
                            fVar3 = (n0.f) w10;
                        }
                        this.L = fVar3;
                        return fVar3;
                    }
                    intValue = this.H.M(intValue);
                }
            }
            n0.f fVar4 = this.f39092v;
            this.L = fVar4;
            return fVar4;
        }
        return fVar;
    }

    public final void o1(boolean z10, io.q<? super l0.e<?>, ? super r1, ? super j1, wn.v> qVar) {
        T0(z10);
        a1(qVar);
    }

    @Override // l0.i
    public void p(d1<?>[] d1VarArr) {
        n0.f<l0.q<Object>, c2<Object>> L1;
        boolean z10;
        int u10;
        jo.p.h(d1VarArr, "values");
        n0.f<l0.q<Object>, ? extends c2<? extends Object>> p02 = p0(this, null, 1, null);
        B1(201, l0.k.I());
        B1(203, l0.k.K());
        n0.f<l0.q<Object>, ? extends c2<? extends Object>> fVar = (n0.f) l0.c.c(this, new f0(d1VarArr, p02));
        u0();
        if (f()) {
            L1 = L1(p02, fVar);
            this.K = true;
        } else {
            Object x10 = this.H.x(0);
            Objects.requireNonNull(x10, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<androidx.compose.runtime.CompositionLocal<kotlin.Any?>, androidx.compose.runtime.State<kotlin.Any?>>{ androidx.compose.runtime.ComposerKt.CompositionLocalMap }");
            n0.f<l0.q<Object>, c2<Object>> fVar2 = (n0.f) x10;
            Object x11 = this.H.x(1);
            Objects.requireNonNull(x11, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<androidx.compose.runtime.CompositionLocal<kotlin.Any?>, androidx.compose.runtime.State<kotlin.Any?>>{ androidx.compose.runtime.ComposerKt.CompositionLocalMap }");
            n0.f fVar3 = (n0.f) x11;
            if (j() && jo.p.c(fVar3, fVar)) {
                x1();
                L1 = fVar2;
            } else {
                L1 = L1(p02, fVar);
                z10 = !jo.p.c(L1, fVar2);
                if (z10 && !f()) {
                    this.f39093w.put(Integer.valueOf(this.H.k()), L1);
                }
                l0.f0 f0Var = this.f39095y;
                u10 = l0.k.u(this.f39094x);
                f0Var.i(u10);
                this.f39094x = z10;
                this.L = L1;
                z1(202, l0.k.F(), false, L1);
            }
        }
        z10 = false;
        if (z10) {
            this.f39093w.put(Integer.valueOf(this.H.k()), L1);
        }
        l0.f0 f0Var2 = this.f39095y;
        u10 = l0.k.u(this.f39094x);
        f0Var2.i(u10);
        this.f39094x = z10;
        this.L = L1;
        z1(202, l0.k.F(), false, L1);
    }

    @Override // l0.i
    public void q(Object obj) {
        M1(obj);
    }

    public final void q0() {
        g2 g2Var = g2.f39062a;
        Object a10 = g2Var.a("Compose:Composer.dispose");
        try {
            this.f39073c.o(this);
            this.E.a();
            this.f39090t.clear();
            this.f39076f.clear();
            this.f39093w.clear();
            k().clear();
            this.G = true;
            wn.v vVar = wn.v.f59242a;
            g2Var.b(a10);
        } catch (Throwable th2) {
            g2.f39062a.b(a10);
            throw th2;
        }
    }

    public final void q1() {
        if (this.R.d()) {
            this.R.g();
        } else {
            this.Q++;
        }
    }

    @Override // l0.i
    public <T> void r(io.a<? extends T> aVar) {
        jo.p.h(aVar, "factory");
        O1();
        if (f()) {
            int e10 = this.f39082l.e();
            r1 r1Var = this.J;
            l0.d A = r1Var.A(r1Var.V());
            this.f39083m++;
            g1(new d(aVar, A, e10));
            i1(new e(A, e10));
            return;
        }
        l0.k.x("createNode() can only be called when inserting".toString());
        throw new KotlinNothingValueException();
    }

    public final void r0(m0.b<f1, m0.c<Object>> bVar, io.p<? super l0.i, ? super Integer, wn.v> pVar) {
        if (!this.F) {
            Object a10 = g2.f39062a.a("Compose:recompose");
            try {
                v0.h B = v0.m.B();
                this.C = B;
                this.D = B.f();
                this.f39093w.clear();
                int f10 = bVar.f();
                for (int i10 = 0; i10 < f10; i10++) {
                    Object obj = bVar.e()[i10];
                    if (obj != null) {
                        m0.c cVar = (m0.c) bVar.g()[i10];
                        f1 f1Var = (f1) obj;
                        l0.d j10 = f1Var.j();
                        if (j10 == null) {
                            return;
                        }
                        this.f39090t.add(new l0.g0(f1Var, j10.a(), cVar));
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type Key of androidx.compose.runtime.collection.IdentityArrayMap");
                    }
                }
                List<l0.g0> list = this.f39090t;
                if (list.size() > 1) {
                    xn.w.x(list, new C0555j());
                }
                this.f39081k = 0;
                this.F = true;
                D1();
                Object M0 = M0();
                if (M0 != pVar && pVar != null) {
                    M1(pVar);
                }
                u1.i(new g(this), new h(this), new i(pVar, this, M0));
                v0();
                this.F = false;
                this.f39090t.clear();
                wn.v vVar = wn.v.f59242a;
                return;
            } finally {
                g2.f39062a.b(a10);
            }
        }
        l0.k.x("Reentrant composition is not supported".toString());
        throw new KotlinNothingValueException();
    }

    public final void r1(int i10, int i11, int i12) {
        int Q;
        o1 o1Var = this.H;
        Q = l0.k.Q(o1Var, i10, i11, i12);
        while (i10 > 0 && i10 != Q) {
            if (o1Var.G(i10)) {
                q1();
            }
            i10 = o1Var.M(i10);
        }
        s0(i11, Q);
    }

    @Override // l0.i
    public void s() {
        t0(true);
    }

    public final void s0(int i10, int i11) {
        if (i10 <= 0 || i10 == i11) {
            return;
        }
        s0(this.H.M(i10), i11);
        if (this.H.G(i10)) {
            d1(N0(this.H, i10));
        }
    }

    public final void s1() {
        this.N.add(this.W.g());
    }

    @Override // l0.i
    public void t() {
        u0();
        f1 C0 = C0();
        if (C0 == null || !C0.r()) {
            return;
        }
        C0.B(true);
    }

    public final void t0(boolean z10) {
        List<j0> list;
        if (f()) {
            int V = this.J.V();
            H1(this.J.a0(V), this.J.b0(V), this.J.Y(V));
        } else {
            int s10 = this.H.s();
            H1(this.H.z(s10), this.H.A(s10), this.H.w(s10));
        }
        int i10 = this.f39083m;
        y0 y0Var = this.f39080j;
        int i11 = 0;
        if (y0Var != null && y0Var.b().size() > 0) {
            List<j0> b10 = y0Var.b();
            List<j0> f10 = y0Var.f();
            Set e10 = v0.b.e(f10);
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int size = f10.size();
            int size2 = b10.size();
            int i12 = 0;
            int i13 = 0;
            int i14 = 0;
            while (i12 < size2) {
                j0 j0Var = b10.get(i12);
                if (!e10.contains(j0Var)) {
                    l1(y0Var.g(j0Var) + y0Var.e(), j0Var.c());
                    y0Var.n(j0Var.b(), i11);
                    k1(j0Var.b());
                    this.H.N(j0Var.b());
                    c1();
                    this.H.P();
                    l0.k.W(this.f39090t, j0Var.b(), j0Var.b() + this.H.B(j0Var.b()));
                } else if (!linkedHashSet.contains(j0Var)) {
                    if (i13 < size) {
                        j0 j0Var2 = f10.get(i13);
                        if (j0Var2 != j0Var) {
                            int g10 = y0Var.g(j0Var2);
                            linkedHashSet.add(j0Var2);
                            if (g10 != i14) {
                                int o10 = y0Var.o(j0Var2);
                                list = f10;
                                j1(y0Var.e() + g10, i14 + y0Var.e(), o10);
                                y0Var.j(g10, i14, o10);
                            } else {
                                list = f10;
                            }
                        } else {
                            list = f10;
                            i12++;
                        }
                        i13++;
                        i14 += y0Var.o(j0Var2);
                        f10 = list;
                    }
                    i11 = 0;
                }
                i12++;
                i11 = 0;
            }
            S0();
            if (b10.size() > 0) {
                k1(this.H.m());
                this.H.Q();
            }
        }
        int i15 = this.f39081k;
        while (!this.H.E()) {
            int k10 = this.H.k();
            c1();
            l1(i15, this.H.P());
            l0.k.W(this.f39090t, k10, this.H.k());
        }
        boolean f11 = f();
        if (f11) {
            if (z10) {
                s1();
                i10 = 1;
            }
            this.H.f();
            int V2 = this.J.V();
            this.J.N();
            if (!this.H.r()) {
                int J0 = J0(V2);
                this.J.O();
                this.J.F();
                h1(this.M);
                this.O = false;
                if (!this.f39074d.isEmpty()) {
                    J1(J0, 0);
                    K1(J0, i10);
                }
            }
        } else {
            if (z10) {
                q1();
            }
            e1();
            int s11 = this.H.s();
            if (i10 != N1(s11)) {
                K1(s11, i10);
            }
            if (z10) {
                i10 = 1;
            }
            this.H.g();
            S0();
        }
        y0(i10, f11);
    }

    public final void t1(int i10) {
        u1(this, i10, false, 0);
        S0();
    }

    @Override // l0.i
    public void u() {
        this.f39087q = true;
    }

    public final void u0() {
        t0(false);
    }

    @Override // l0.i
    public e1 v() {
        return C0();
    }

    public final void v0() {
        u0();
        this.f39073c.c();
        u0();
        f1();
        z0();
        this.H.d();
        this.f39088r = false;
    }

    public final <T> T v1(l0.q<T> qVar, n0.f<l0.q<Object>, ? extends c2<? extends Object>> fVar) {
        if (l0.k.z(fVar, qVar)) {
            return (T) l0.k.M(fVar, qVar);
        }
        return qVar.a().getValue();
    }

    @Override // l0.i
    public void w() {
        if (this.f39096z && this.H.s() == this.A) {
            this.A = -1;
            this.f39096z = false;
        }
        t0(false);
    }

    public final void w0() {
        if (this.J.T()) {
            r1 x10 = this.I.x();
            this.J = x10;
            x10.O0();
            this.K = false;
            this.L = null;
        }
    }

    public void w1() {
        if (this.f39090t.isEmpty()) {
            x1();
            return;
        }
        o1 o1Var = this.H;
        int n10 = o1Var.n();
        Object o10 = o1Var.o();
        Object l10 = o1Var.l();
        F1(n10, o10, l10);
        C1(o1Var.F(), null);
        Z0();
        o1Var.g();
        H1(n10, o10, l10);
    }

    @Override // l0.i
    public void x(int i10) {
        z1(i10, null, false, null);
    }

    public final void x0(boolean z10, y0 y0Var) {
        this.f39079i.h(this.f39080j);
        this.f39080j = y0Var;
        this.f39082l.i(this.f39081k);
        if (z10) {
            this.f39081k = 0;
        }
        this.f39084n.i(this.f39083m);
        this.f39083m = 0;
    }

    public final void x1() {
        this.f39083m += this.H.P();
    }

    @Override // l0.i
    public Object y() {
        return M0();
    }

    public final void y0(int i10, boolean z10) {
        y0 g10 = this.f39079i.g();
        if (g10 != null && !z10) {
            g10.l(g10.a() + 1);
        }
        this.f39080j = g10;
        this.f39081k = this.f39082l.h() + i10;
        this.f39083m = this.f39084n.h() + i10;
    }

    public final void y1() {
        this.f39083m = this.H.t();
        this.H.Q();
    }

    @Override // l0.i
    public w0.a z() {
        return this.f39074d;
    }

    public final void z0() {
        V0();
        if (this.f39079i.c()) {
            if (this.V.d()) {
                j0();
                return;
            } else {
                l0.k.x("Missed recording an endGroup()".toString());
                throw new KotlinNothingValueException();
            }
        }
        l0.k.x("Start/end imbalance".toString());
        throw new KotlinNothingValueException();
    }

    public final void z1(int i10, Object obj, boolean z10, Object obj2) {
        P1();
        F1(i10, obj, obj2);
        y0 y0Var = null;
        if (f()) {
            this.H.c();
            int U = this.J.U();
            if (z10) {
                this.J.W0(l0.i.f39065a.a());
            } else if (obj2 != null) {
                r1 r1Var = this.J;
                if (obj == null) {
                    obj = l0.i.f39065a.a();
                }
                r1Var.S0(i10, obj, obj2);
            } else {
                r1 r1Var2 = this.J;
                if (obj == null) {
                    obj = l0.i.f39065a.a();
                }
                r1Var2.U0(i10, obj);
            }
            y0 y0Var2 = this.f39080j;
            if (y0Var2 != null) {
                j0 j0Var = new j0(i10, -1, J0(U), -1, 0);
                y0Var2.i(j0Var, this.f39081k - y0Var2.e());
                y0Var2.h(j0Var);
            }
            x0(z10, null);
            return;
        }
        if (this.f39080j == null) {
            if (this.H.n() == i10 && jo.p.c(obj, this.H.o())) {
                C1(z10, obj2);
            } else {
                this.f39080j = new y0(this.H.h(), this.f39081k);
            }
        }
        y0 y0Var3 = this.f39080j;
        if (y0Var3 != null) {
            j0 d10 = y0Var3.d(i10, obj);
            if (d10 != null) {
                y0Var3.h(d10);
                int b10 = d10.b();
                this.f39081k = y0Var3.g(d10) + y0Var3.e();
                int m10 = y0Var3.m(d10);
                int a10 = m10 - y0Var3.a();
                y0Var3.k(m10, y0Var3.a());
                k1(b10);
                this.H.N(b10);
                if (a10 > 0) {
                    n1(new e0(a10));
                }
                C1(z10, obj2);
            } else {
                this.H.c();
                this.O = true;
                this.L = null;
                w0();
                this.J.D();
                int U2 = this.J.U();
                if (z10) {
                    this.J.W0(l0.i.f39065a.a());
                } else if (obj2 != null) {
                    r1 r1Var3 = this.J;
                    if (obj == null) {
                        obj = l0.i.f39065a.a();
                    }
                    r1Var3.S0(i10, obj, obj2);
                } else {
                    r1 r1Var4 = this.J;
                    if (obj == null) {
                        obj = l0.i.f39065a.a();
                    }
                    r1Var4.U0(i10, obj);
                }
                this.M = this.J.A(U2);
                j0 j0Var2 = new j0(i10, -1, J0(U2), -1, 0);
                y0Var3.i(j0Var2, this.f39081k - y0Var3.e());
                y0Var3.h(j0Var2);
                y0Var = new y0(new ArrayList(), z10 ? 0 : this.f39081k);
            }
        }
        x0(z10, y0Var);
    }
}
