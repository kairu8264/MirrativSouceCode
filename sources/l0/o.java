package l0;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class o implements u {
    public final HashSet<k1> A;
    public final p1 B;
    public final m0.d<f1> C;
    public final HashSet<f1> D;
    public final m0.d<x<?>> E;
    public final List<io.q<e<?>, r1, j1, wn.v>> F;
    public final List<io.q<e<?>, r1, j1, wn.v>> G;
    public final m0.d<f1> H;
    public m0.b<f1, m0.c<Object>> I;
    public boolean J;
    public o K;
    public int L;
    public final j M;
    public final ao.g N;
    public final boolean O;
    public boolean P;
    public io.p<? super i, ? super Integer, wn.v> Q;

    /* renamed from: w  reason: collision with root package name */
    public final m f39210w;

    /* renamed from: x  reason: collision with root package name */
    public final e<?> f39211x;

    /* renamed from: y  reason: collision with root package name */
    public final AtomicReference<Object> f39212y;

    /* renamed from: z  reason: collision with root package name */
    public final Object f39213z;

    /* loaded from: classes.dex */
    public static final class a implements j1 {

        /* renamed from: a  reason: collision with root package name */
        public final Set<k1> f39214a;

        /* renamed from: b  reason: collision with root package name */
        public final List<k1> f39215b;

        /* renamed from: c  reason: collision with root package name */
        public final List<k1> f39216c;

        /* renamed from: d  reason: collision with root package name */
        public final List<io.a<wn.v>> f39217d;

        public a(Set<k1> set) {
            jo.p.h(set, "abandoning");
            this.f39214a = set;
            this.f39215b = new ArrayList();
            this.f39216c = new ArrayList();
            this.f39217d = new ArrayList();
        }

        @Override // l0.j1
        public void a(k1 k1Var) {
            jo.p.h(k1Var, "instance");
            int lastIndexOf = this.f39215b.lastIndexOf(k1Var);
            if (lastIndexOf >= 0) {
                this.f39215b.remove(lastIndexOf);
                this.f39214a.remove(k1Var);
                return;
            }
            this.f39216c.add(k1Var);
        }

        @Override // l0.j1
        public void b(io.a<wn.v> aVar) {
            jo.p.h(aVar, "effect");
            this.f39217d.add(aVar);
        }

        @Override // l0.j1
        public void c(k1 k1Var) {
            jo.p.h(k1Var, "instance");
            int lastIndexOf = this.f39216c.lastIndexOf(k1Var);
            if (lastIndexOf >= 0) {
                this.f39216c.remove(lastIndexOf);
                this.f39214a.remove(k1Var);
                return;
            }
            this.f39215b.add(k1Var);
        }

        public final void d() {
            if (!this.f39214a.isEmpty()) {
                Object a10 = g2.f39062a.a("Compose:abandons");
                try {
                    Iterator<k1> it = this.f39214a.iterator();
                    while (it.hasNext()) {
                        it.remove();
                        it.next().b();
                    }
                    wn.v vVar = wn.v.f59242a;
                } finally {
                    g2.f39062a.b(a10);
                }
            }
        }

        public final void e() {
            Object a10;
            if (!this.f39216c.isEmpty()) {
                a10 = g2.f39062a.a("Compose:onForgotten");
                try {
                    for (int size = this.f39216c.size() - 1; -1 < size; size--) {
                        k1 k1Var = this.f39216c.get(size);
                        if (!this.f39214a.contains(k1Var)) {
                            k1Var.c();
                        }
                    }
                    wn.v vVar = wn.v.f59242a;
                } finally {
                }
            }
            if (!this.f39215b.isEmpty()) {
                a10 = g2.f39062a.a("Compose:onRemembered");
                try {
                    List<k1> list = this.f39215b;
                    int size2 = list.size();
                    for (int i10 = 0; i10 < size2; i10++) {
                        k1 k1Var2 = list.get(i10);
                        this.f39214a.remove(k1Var2);
                        k1Var2.a();
                    }
                    wn.v vVar2 = wn.v.f59242a;
                } finally {
                }
            }
        }

        public final void f() {
            if (!this.f39217d.isEmpty()) {
                Object a10 = g2.f39062a.a("Compose:sideeffects");
                try {
                    List<io.a<wn.v>> list = this.f39217d;
                    int size = list.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        list.get(i10).invoke();
                    }
                    this.f39217d.clear();
                    wn.v vVar = wn.v.f59242a;
                } finally {
                    g2.f39062a.b(a10);
                }
            }
        }
    }

    public o(m mVar, e<?> eVar, ao.g gVar) {
        jo.p.h(mVar, "parent");
        jo.p.h(eVar, "applier");
        this.f39210w = mVar;
        this.f39211x = eVar;
        this.f39212y = new AtomicReference<>(null);
        this.f39213z = new Object();
        HashSet<k1> hashSet = new HashSet<>();
        this.A = hashSet;
        p1 p1Var = new p1();
        this.B = p1Var;
        this.C = new m0.d<>();
        this.D = new HashSet<>();
        this.E = new m0.d<>();
        ArrayList arrayList = new ArrayList();
        this.F = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.G = arrayList2;
        this.H = new m0.d<>();
        this.I = new m0.b<>(0, 1, null);
        j jVar = new j(eVar, mVar, p1Var, hashSet, arrayList, arrayList2, this);
        mVar.m(jVar);
        this.M = jVar;
        this.N = gVar;
        this.O = mVar instanceof g1;
        this.Q = g.f39003a.a();
    }

    /* JADX WARN: Type inference failed for: r2v7, types: [java.util.HashSet, T] */
    public static final void c(o oVar, boolean z10, jo.e0<HashSet<f1>> e0Var, Object obj) {
        int f10;
        m0.c<f1> o10;
        m0.d<f1> dVar = oVar.C;
        f10 = dVar.f(obj);
        if (f10 >= 0) {
            o10 = dVar.o(f10);
            for (f1 f1Var : o10) {
                if (!oVar.H.m(obj, f1Var) && f1Var.t(obj) != h0.IGNORED) {
                    if (f1Var.u() && !z10) {
                        oVar.D.add(f1Var);
                    } else {
                        HashSet<f1> hashSet = e0Var.f38136w;
                        HashSet<f1> hashSet2 = hashSet;
                        if (hashSet == null) {
                            ?? hashSet3 = new HashSet();
                            e0Var.f38136w = hashSet3;
                            hashSet2 = hashSet3;
                        }
                        hashSet2.add(f1Var);
                    }
                }
            }
        }
    }

    public final h0 A(f1 f1Var, d dVar, Object obj) {
        synchronized (this.f39213z) {
            o oVar = this.K;
            if (oVar == null || !this.B.u(this.L, dVar)) {
                oVar = null;
            }
            if (oVar == null) {
                if (r() && this.M.E1(f1Var, obj)) {
                    return h0.IMMINENT;
                } else if (obj == null) {
                    this.I.j(f1Var, null);
                } else {
                    p.b(this.I, f1Var, obj);
                }
            }
            if (oVar != null) {
                return oVar.A(f1Var, dVar, obj);
            }
            this.f39210w.i(this);
            return r() ? h0.DEFERRED : h0.SCHEDULED;
        }
    }

    public final void B(Object obj) {
        int f10;
        m0.c<f1> o10;
        m0.d<f1> dVar = this.C;
        f10 = dVar.f(obj);
        if (f10 >= 0) {
            o10 = dVar.o(f10);
            for (f1 f1Var : o10) {
                if (f1Var.t(obj) == h0.IMMINENT) {
                    this.H.c(obj, f1Var);
                }
            }
        }
    }

    public final void C(x<?> xVar) {
        jo.p.h(xVar, "state");
        if (this.C.e(xVar)) {
            return;
        }
        this.E.n(xVar);
    }

    public final void D(Object obj, f1 f1Var) {
        jo.p.h(obj, "instance");
        jo.p.h(f1Var, "scope");
        this.C.m(obj, f1Var);
    }

    public final void E(boolean z10) {
        this.J = z10;
    }

    public final m0.b<f1, m0.c<Object>> F() {
        m0.b<f1, m0.c<Object>> bVar = this.I;
        this.I = new m0.b<>(0, 1, null);
        return bVar;
    }

    @Override // l0.u
    public <R> R a(u uVar, int i10, io.a<? extends R> aVar) {
        jo.p.h(aVar, "block");
        if (uVar != null && !jo.p.c(uVar, this) && i10 >= 0) {
            this.K = (o) uVar;
            this.L = i10;
            try {
                return aVar.invoke();
            } finally {
                this.K = null;
                this.L = 0;
            }
        }
        return aVar.invoke();
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00a9 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(java.util.Set<? extends java.lang.Object> r17, boolean r18) {
        /*
            Method dump skipped, instructions count: 413
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: l0.o.b(java.util.Set, boolean):void");
    }

    public final void d(List<io.q<e<?>, r1, j1, wn.v>> list) {
        boolean isEmpty;
        a aVar = new a(this.A);
        try {
            if (list.isEmpty()) {
                if (isEmpty) {
                    return;
                }
                return;
            }
            Object a10 = g2.f39062a.a("Compose:applyChanges");
            this.f39211x.h();
            r1 x10 = this.B.x();
            try {
                e<?> eVar = this.f39211x;
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    list.get(i10).s0(eVar, x10, aVar);
                }
                list.clear();
                wn.v vVar = wn.v.f59242a;
                x10.F();
                this.f39211x.e();
                g2 g2Var = g2.f39062a;
                g2Var.b(a10);
                aVar.e();
                aVar.f();
                if (this.J) {
                    Object a11 = g2Var.a("Compose:unobserve");
                    this.J = false;
                    m0.d<f1> dVar = this.C;
                    int j10 = dVar.j();
                    int i11 = 0;
                    for (int i12 = 0; i12 < j10; i12++) {
                        int i13 = dVar.k()[i12];
                        m0.c<f1> cVar = dVar.i()[i13];
                        jo.p.e(cVar);
                        int size2 = cVar.size();
                        int i14 = 0;
                        for (int i15 = 0; i15 < size2; i15++) {
                            Object obj = cVar.j()[i15];
                            if (obj != null) {
                                if (!(!((f1) obj).s())) {
                                    if (i14 != i15) {
                                        cVar.j()[i14] = obj;
                                    }
                                    i14++;
                                }
                            } else {
                                throw new NullPointerException("null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                            }
                        }
                        int size3 = cVar.size();
                        for (int i16 = i14; i16 < size3; i16++) {
                            cVar.j()[i16] = null;
                        }
                        cVar.m(i14);
                        if (cVar.size() > 0) {
                            if (i11 != i12) {
                                int i17 = dVar.k()[i11];
                                dVar.k()[i11] = i13;
                                dVar.k()[i12] = i17;
                            }
                            i11++;
                        }
                    }
                    int j11 = dVar.j();
                    for (int i18 = i11; i18 < j11; i18++) {
                        dVar.l()[dVar.k()[i18]] = null;
                    }
                    dVar.p(i11);
                    f();
                    wn.v vVar2 = wn.v.f59242a;
                    g2.f39062a.b(a11);
                }
                if (this.G.isEmpty()) {
                    aVar.d();
                }
            } catch (Throwable th2) {
                x10.F();
                throw th2;
            }
        } finally {
            if (this.G.isEmpty()) {
                aVar.d();
            }
        }
    }

    @Override // l0.l
    public void dispose() {
        synchronized (this.f39213z) {
            if (!this.P) {
                this.P = true;
                this.Q = g.f39003a.b();
                boolean z10 = this.B.m() > 0;
                if (z10 || (true ^ this.A.isEmpty())) {
                    a aVar = new a(this.A);
                    if (z10) {
                        r1 x10 = this.B.x();
                        k.U(x10, aVar);
                        wn.v vVar = wn.v.f59242a;
                        x10.F();
                        this.f39211x.clear();
                        aVar.e();
                    }
                    aVar.d();
                }
                this.M.q0();
            }
            wn.v vVar2 = wn.v.f59242a;
        }
        this.f39210w.p(this);
    }

    @Override // l0.u
    public void e() {
        synchronized (this.f39213z) {
            if (!this.G.isEmpty()) {
                d(this.G);
            }
            wn.v vVar = wn.v.f59242a;
        }
    }

    public final void f() {
        m0.d<x<?>> dVar = this.E;
        int j10 = dVar.j();
        int i10 = 0;
        for (int i11 = 0; i11 < j10; i11++) {
            int i12 = dVar.k()[i11];
            m0.c<x<?>> cVar = dVar.i()[i12];
            jo.p.e(cVar);
            int size = cVar.size();
            int i13 = 0;
            for (int i14 = 0; i14 < size; i14++) {
                Object obj = cVar.j()[i14];
                Objects.requireNonNull(obj, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                if (!(!this.C.e((x) obj))) {
                    if (i13 != i14) {
                        cVar.j()[i13] = obj;
                    }
                    i13++;
                }
            }
            int size2 = cVar.size();
            for (int i15 = i13; i15 < size2; i15++) {
                cVar.j()[i15] = null;
            }
            cVar.m(i13);
            if (cVar.size() > 0) {
                if (i10 != i11) {
                    int i16 = dVar.k()[i10];
                    dVar.k()[i10] = i12;
                    dVar.k()[i11] = i16;
                }
                i10++;
            }
        }
        int j11 = dVar.j();
        for (int i17 = i10; i17 < j11; i17++) {
            dVar.l()[dVar.k()[i17]] = null;
        }
        dVar.p(i10);
        Iterator<f1> it = this.D.iterator();
        jo.p.g(it, "iterator()");
        while (it.hasNext()) {
            if (!it.next().u()) {
                it.remove();
            }
        }
    }

    public final void g() {
        Object andSet = this.f39212y.getAndSet(p.c());
        if (andSet != null) {
            if (!jo.p.c(andSet, p.c())) {
                if (andSet instanceof Set) {
                    b((Set) andSet, true);
                    return;
                } else if (!(andSet instanceof Object[])) {
                    throw new IllegalStateException(("corrupt pendingModifications drain: " + this.f39212y).toString());
                } else {
                    for (Set<? extends Object> set : (Set[]) andSet) {
                        b(set, true);
                    }
                    return;
                }
            }
            throw new IllegalStateException("pending composition has not been applied".toString());
        }
    }

    public final void h() {
        Object andSet = this.f39212y.getAndSet(null);
        if (jo.p.c(andSet, p.c())) {
            return;
        }
        if (andSet instanceof Set) {
            b((Set) andSet, false);
        } else if (!(andSet instanceof Object[])) {
            if (andSet == null) {
                throw new IllegalStateException("calling recordModificationsOf and applyChanges concurrently is not supported".toString());
            }
            throw new IllegalStateException(("corrupt pendingModifications drain: " + this.f39212y).toString());
        } else {
            for (Set<? extends Object> set : (Set[]) andSet) {
                b(set, false);
            }
        }
    }

    public final boolean i() {
        return this.M.A0();
    }

    @Override // l0.l
    public boolean j() {
        return this.P;
    }

    @Override // l0.u
    public void k(List<wn.k<r0, r0>> list) {
        jo.p.h(list, "references");
        int size = list.size();
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                z10 = true;
                break;
            } else if (!jo.p.c(list.get(i10).c().b(), this)) {
                break;
            } else {
                i10++;
            }
        }
        k.X(z10);
        try {
            this.M.F0(list);
            wn.v vVar = wn.v.f59242a;
        } catch (Throwable th2) {
            if (!this.A.isEmpty()) {
                new a(this.A).d();
            }
            throw th2;
        }
    }

    @Override // l0.u
    public boolean l() {
        boolean W0;
        synchronized (this.f39213z) {
            g();
            W0 = this.M.W0(F());
            if (!W0) {
                h();
            }
        }
        return W0;
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x000f  */
    @Override // l0.u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean m(java.util.Set<? extends java.lang.Object> r3) {
        /*
            r2 = this;
            java.lang.String r0 = "values"
            jo.p.h(r3, r0)
            java.util.Iterator r3 = r3.iterator()
        L9:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L25
            java.lang.Object r0 = r3.next()
            m0.d<l0.f1> r1 = r2.C
            boolean r1 = r1.e(r0)
            if (r1 != 0) goto L23
            m0.d<l0.x<?>> r1 = r2.E
            boolean r0 = r1.e(r0)
            if (r0 == 0) goto L9
        L23:
            r3 = 1
            return r3
        L25:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: l0.o.m(java.util.Set):boolean");
    }

    @Override // l0.l
    public void n(io.p<? super i, ? super Integer, wn.v> pVar) {
        jo.p.h(pVar, "content");
        if (!this.P) {
            this.Q = pVar;
            this.f39210w.a(this, pVar);
            return;
        }
        throw new IllegalStateException("The composition is disposed".toString());
    }

    @Override // l0.u
    public void o(Object obj) {
        f1 C0;
        jo.p.h(obj, "value");
        if (i() || (C0 = this.M.C0()) == null) {
            return;
        }
        C0.G(true);
        this.C.c(obj, C0);
        if (obj instanceof x) {
            this.E.n(obj);
            for (v0.c0 c0Var : ((x) obj).m()) {
                this.E.c(c0Var, obj);
            }
        }
        C0.w(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.util.Set[]] */
    @Override // l0.u
    public void p(Set<? extends Object> set) {
        Object obj;
        Set<? extends Object> set2;
        jo.p.h(set, "values");
        do {
            obj = this.f39212y.get();
            if (obj == null ? true : jo.p.c(obj, p.c())) {
                set2 = set;
            } else if (obj instanceof Set) {
                set2 = new Set[]{(Set) obj, set};
            } else if (!(obj instanceof Object[])) {
                throw new IllegalStateException(("corrupt pendingModifications: " + this.f39212y).toString());
            } else {
                Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.collections.Set<kotlin.Any>>");
                set2 = xn.n.w((Set[]) obj, set);
            }
        } while (!this.f39212y.compareAndSet(obj, set2));
        if (obj == null) {
            synchronized (this.f39213z) {
                h();
                wn.v vVar = wn.v.f59242a;
            }
        }
    }

    @Override // l0.u
    public void q() {
        synchronized (this.f39213z) {
            d(this.F);
            h();
            wn.v vVar = wn.v.f59242a;
        }
    }

    @Override // l0.u
    public boolean r() {
        return this.M.L0();
    }

    @Override // l0.u
    public void s(Object obj) {
        int f10;
        m0.c<x> o10;
        jo.p.h(obj, "value");
        synchronized (this.f39213z) {
            B(obj);
            m0.d<x<?>> dVar = this.E;
            f10 = dVar.f(obj);
            if (f10 >= 0) {
                o10 = dVar.o(f10);
                for (x xVar : o10) {
                    B(xVar);
                }
            }
            wn.v vVar = wn.v.f59242a;
        }
    }

    @Override // l0.l
    public boolean t() {
        boolean z10;
        synchronized (this.f39213z) {
            z10 = this.I.f() > 0;
        }
        return z10;
    }

    @Override // l0.u
    public void u(io.a<wn.v> aVar) {
        jo.p.h(aVar, "block");
        this.M.P0(aVar);
    }

    @Override // l0.u
    public void v() {
        synchronized (this.f39213z) {
            this.M.i0();
            if (!this.A.isEmpty()) {
                new a(this.A).d();
            }
            wn.v vVar = wn.v.f59242a;
        }
    }

    @Override // l0.u
    public void w(q0 q0Var) {
        jo.p.h(q0Var, "state");
        a aVar = new a(this.A);
        r1 x10 = q0Var.a().x();
        try {
            k.U(x10, aVar);
            wn.v vVar = wn.v.f59242a;
            x10.F();
            aVar.e();
        } catch (Throwable th2) {
            x10.F();
            throw th2;
        }
    }

    @Override // l0.u
    public void x(io.p<? super i, ? super Integer, wn.v> pVar) {
        jo.p.h(pVar, "content");
        try {
            synchronized (this.f39213z) {
                g();
                this.M.l0(F(), pVar);
                wn.v vVar = wn.v.f59242a;
            }
        } catch (Throwable th2) {
            if (!this.A.isEmpty()) {
                new a(this.A).d();
            }
            throw th2;
        }
    }

    @Override // l0.u
    public void y() {
        Object[] p10;
        synchronized (this.f39213z) {
            for (Object obj : this.B.p()) {
                f1 f1Var = obj instanceof f1 ? (f1) obj : null;
                if (f1Var != null) {
                    f1Var.invalidate();
                }
            }
            wn.v vVar = wn.v.f59242a;
        }
    }

    public final h0 z(f1 f1Var, Object obj) {
        jo.p.h(f1Var, "scope");
        if (f1Var.m()) {
            f1Var.C(true);
        }
        d j10 = f1Var.j();
        if (j10 != null && this.B.y(j10) && j10.b()) {
            if (!j10.b()) {
                return h0.IGNORED;
            }
            if (!f1Var.k()) {
                return h0.IGNORED;
            }
            return A(f1Var, j10, obj);
        }
        return h0.IGNORED;
    }

    public /* synthetic */ o(m mVar, e eVar, ao.g gVar, int i10, jo.h hVar) {
        this(mVar, eVar, (i10 & 4) != 0 ? null : gVar);
    }
}
