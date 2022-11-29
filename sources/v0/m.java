package v0;

import com.mirrativ.llstream.protocol.v1.topic.TopicConstant;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.KotlinNothingValueException;
import l0.a2;
import v0.k;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a */
    public static final io.l<k, wn.v> f56506a = b.f56517w;

    /* renamed from: b */
    public static final a2<h> f56507b = new a2<>();

    /* renamed from: c */
    public static final Object f56508c = new Object();

    /* renamed from: d */
    public static k f56509d;

    /* renamed from: e */
    public static int f56510e;

    /* renamed from: f */
    public static final j f56511f;

    /* renamed from: g */
    public static final List<io.p<Set<? extends Object>, h, wn.v>> f56512g;

    /* renamed from: h */
    public static final List<io.l<Object, wn.v>> f56513h;

    /* renamed from: i */
    public static final AtomicReference<v0.a> f56514i;

    /* renamed from: j */
    public static final h f56515j;

    /* loaded from: classes.dex */
    public static final class a extends jo.q implements io.l<k, wn.v> {

        /* renamed from: w */
        public static final a f56516w = new a();

        public a() {
            super(1);
        }

        public final void a(k kVar) {
            jo.p.h(kVar, "it");
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(k kVar) {
            a(kVar);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends jo.q implements io.l<k, wn.v> {

        /* renamed from: w */
        public static final b f56517w = new b();

        public b() {
            super(1);
        }

        public final void a(k kVar) {
            jo.p.h(kVar, "it");
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(k kVar) {
            a(kVar);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends jo.q implements io.l<Object, wn.v> {

        /* renamed from: w */
        public final /* synthetic */ io.l<Object, wn.v> f56518w;

        /* renamed from: x */
        public final /* synthetic */ io.l<Object, wn.v> f56519x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(io.l<Object, wn.v> lVar, io.l<Object, wn.v> lVar2) {
            super(1);
            this.f56518w = lVar;
            this.f56519x = lVar2;
        }

        public final void a(Object obj) {
            jo.p.h(obj, "state");
            this.f56518w.invoke(obj);
            this.f56519x.invoke(obj);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(Object obj) {
            a(obj);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends jo.q implements io.l<Object, wn.v> {

        /* renamed from: w */
        public final /* synthetic */ io.l<Object, wn.v> f56520w;

        /* renamed from: x */
        public final /* synthetic */ io.l<Object, wn.v> f56521x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(io.l<Object, wn.v> lVar, io.l<Object, wn.v> lVar2) {
            super(1);
            this.f56520w = lVar;
            this.f56521x = lVar2;
        }

        public final void a(Object obj) {
            jo.p.h(obj, "state");
            this.f56520w.invoke(obj);
            this.f56521x.invoke(obj);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(Object obj) {
            a(obj);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class e extends jo.q implements io.l<k, T> {

        /* renamed from: w */
        public final /* synthetic */ io.l<k, T> f56522w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public e(io.l<? super k, ? extends T> lVar) {
            super(1);
            this.f56522w = lVar;
        }

        @Override // io.l
        /* renamed from: a */
        public final h invoke(k kVar) {
            jo.p.h(kVar, "invalid");
            h hVar = (h) this.f56522w.invoke(kVar);
            synchronized (m.C()) {
                m.f56509d = m.f56509d.u(hVar.f());
                wn.v vVar = wn.v.f59242a;
            }
            return hVar;
        }
    }

    static {
        k.a aVar = k.A;
        f56509d = aVar.a();
        f56510e = 1;
        f56511f = new j();
        f56512g = new ArrayList();
        f56513h = new ArrayList();
        int i10 = f56510e;
        f56510e = i10 + 1;
        v0.a aVar2 = new v0.a(i10, aVar.a());
        f56509d = f56509d.u(aVar2.f());
        AtomicReference<v0.a> atomicReference = new AtomicReference<>(aVar2);
        f56514i = atomicReference;
        v0.a aVar3 = atomicReference.get();
        jo.p.g(aVar3, "currentGlobalSnapshot.get()");
        f56515j = aVar3;
    }

    public static final <T extends d0> T A(T t10, h hVar) {
        jo.p.h(t10, TopicConstant.EXTEND_AAC_RAW);
        jo.p.h(hVar, "snapshot");
        T t11 = (T) N(t10, hVar.f(), hVar.g());
        if (t11 != null) {
            return t11;
        }
        M();
        throw new KotlinNothingValueException();
    }

    public static final h B() {
        h a10 = f56507b.a();
        if (a10 == null) {
            v0.a aVar = f56514i.get();
            jo.p.g(aVar, "currentGlobalSnapshot.get()");
            return aVar;
        }
        return a10;
    }

    public static final Object C() {
        return f56508c;
    }

    public static final h D() {
        return f56515j;
    }

    public static final io.l<Object, wn.v> E(io.l<Object, wn.v> lVar, io.l<Object, wn.v> lVar2, boolean z10) {
        if (!z10) {
            lVar2 = null;
        }
        if (lVar == null || lVar2 == null || jo.p.c(lVar, lVar2)) {
            return lVar == null ? lVar2 : lVar;
        }
        return new c(lVar, lVar2);
    }

    public static /* synthetic */ io.l F(io.l lVar, io.l lVar2, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        return E(lVar, lVar2, z10);
    }

    public static final io.l<Object, wn.v> G(io.l<Object, wn.v> lVar, io.l<Object, wn.v> lVar2) {
        if (lVar == null || lVar2 == null || jo.p.c(lVar, lVar2)) {
            return lVar == null ? lVar2 : lVar;
        }
        return new d(lVar, lVar2);
    }

    public static final <T extends d0> T H(T t10, c0 c0Var) {
        jo.p.h(t10, "<this>");
        jo.p.h(c0Var, "state");
        T t11 = (T) V(c0Var);
        if (t11 != null) {
            t11.f(Integer.MAX_VALUE);
            return t11;
        }
        T t12 = (T) t10.b();
        t12.f(Integer.MAX_VALUE);
        t12.e(c0Var.d());
        c0Var.j(t12);
        return t12;
    }

    public static final <T extends d0> T I(T t10, c0 c0Var, h hVar) {
        jo.p.h(t10, "<this>");
        jo.p.h(c0Var, "state");
        jo.p.h(hVar, "snapshot");
        T t11 = (T) H(t10, c0Var);
        t11.a(t10);
        t11.f(hVar.f());
        return t11;
    }

    public static final void J(h hVar, c0 c0Var) {
        jo.p.h(hVar, "snapshot");
        jo.p.h(c0Var, "state");
        io.l<Object, wn.v> j10 = hVar.j();
        if (j10 != null) {
            j10.invoke(c0Var);
        }
    }

    public static final Map<d0, d0> K(v0.c cVar, v0.c cVar2, k kVar) {
        d0 N;
        Set<c0> C = cVar2.C();
        int f10 = cVar.f();
        if (C == null) {
            return null;
        }
        k t10 = cVar2.g().u(cVar2.f()).t(cVar2.D());
        HashMap hashMap = null;
        for (c0 c0Var : C) {
            d0 d10 = c0Var.d();
            d0 N2 = N(d10, f10, kVar);
            if (N2 != null && (N = N(d10, f10, t10)) != null && !jo.p.c(N2, N)) {
                d0 N3 = N(d10, cVar2.f(), cVar2.g());
                if (N3 != null) {
                    d0 k10 = c0Var.k(N, N2, N3);
                    if (k10 == null) {
                        return null;
                    }
                    if (hashMap == null) {
                        hashMap = new HashMap();
                    }
                    hashMap.put(N2, k10);
                    hashMap = hashMap;
                } else {
                    M();
                    throw new KotlinNothingValueException();
                }
            }
        }
        return hashMap;
    }

    public static final <T extends d0> T L(T t10, c0 c0Var, h hVar, T t11) {
        jo.p.h(t10, "<this>");
        jo.p.h(c0Var, "state");
        jo.p.h(hVar, "snapshot");
        jo.p.h(t11, "candidate");
        if (hVar.i()) {
            hVar.o(c0Var);
        }
        int f10 = hVar.f();
        if (t11.d() == f10) {
            return t11;
        }
        T t12 = (T) H(t10, c0Var);
        t12.f(f10);
        hVar.o(c0Var);
        return t12;
    }

    public static final Void M() {
        throw new IllegalStateException("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied".toString());
    }

    public static final <T extends d0> T N(T t10, int i10, k kVar) {
        T t11 = null;
        while (t10 != null) {
            if (X(t10, i10, kVar) && (t11 == null || t11.d() < t10.d())) {
                t11 = t10;
            }
            t10 = (T) t10.c();
        }
        if (t11 != null) {
            return t11;
        }
        return null;
    }

    public static final <T extends d0> T O(T t10, c0 c0Var) {
        jo.p.h(t10, "<this>");
        jo.p.h(c0Var, "state");
        return (T) P(t10, c0Var, B());
    }

    public static final <T extends d0> T P(T t10, c0 c0Var, h hVar) {
        jo.p.h(t10, "<this>");
        jo.p.h(c0Var, "state");
        jo.p.h(hVar, "snapshot");
        io.l<Object, wn.v> h10 = hVar.h();
        if (h10 != null) {
            h10.invoke(c0Var);
        }
        T t11 = (T) N(t10, hVar.f(), hVar.g());
        if (t11 != null) {
            return t11;
        }
        M();
        throw new KotlinNothingValueException();
    }

    public static final void Q(int i10) {
        f56511f.f(i10);
    }

    public static final Void R() {
        throw new IllegalStateException("Cannot modify a state object in a read-only snapshot".toString());
    }

    public static final <T> T S(h hVar, io.l<? super k, ? extends T> lVar) {
        T invoke = lVar.invoke(f56509d.p(hVar.f()));
        synchronized (C()) {
            int i10 = f56510e;
            f56510e = i10 + 1;
            f56509d = f56509d.p(hVar.f());
            f56514i.set(new v0.a(i10, f56509d));
            hVar.d();
            f56509d = f56509d.u(i10);
            wn.v vVar = wn.v.f59242a;
        }
        return invoke;
    }

    public static final <T extends h> T T(io.l<? super k, ? extends T> lVar) {
        return (T) w(new e(lVar));
    }

    public static final int U(int i10, k kVar) {
        int a10;
        jo.p.h(kVar, "invalid");
        int s10 = kVar.s(i10);
        synchronized (C()) {
            a10 = f56511f.a(s10);
        }
        return a10;
    }

    public static final d0 V(c0 c0Var) {
        int e10 = f56511f.e(f56510e) - 1;
        k a10 = k.A.a();
        d0 d0Var = null;
        for (d0 d10 = c0Var.d(); d10 != null; d10 = d10.c()) {
            if (d10.d() == 0) {
                return d10;
            }
            if (X(d10, e10, a10)) {
                if (d0Var != null) {
                    return d10.d() < d0Var.d() ? d10 : d0Var;
                }
                d0Var = d10;
            }
        }
        return null;
    }

    public static final boolean W(int i10, int i11, k kVar) {
        return (i11 == 0 || i11 > i10 || kVar.r(i11)) ? false : true;
    }

    public static final boolean X(d0 d0Var, int i10, k kVar) {
        return W(i10, d0Var.d(), kVar);
    }

    public static final void Y(h hVar) {
        if (!f56509d.r(hVar.f())) {
            throw new IllegalStateException("Snapshot is not open".toString());
        }
    }

    public static final <T extends d0> T Z(T t10, c0 c0Var, h hVar) {
        jo.p.h(t10, "<this>");
        jo.p.h(c0Var, "state");
        jo.p.h(hVar, "snapshot");
        if (hVar.i()) {
            hVar.o(c0Var);
        }
        T t11 = (T) N(t10, hVar.f(), hVar.g());
        if (t11 != null) {
            if (t11.d() == hVar.f()) {
                return t11;
            }
            T t12 = (T) I(t11, c0Var, hVar);
            hVar.o(c0Var);
            return t12;
        }
        M();
        throw new KotlinNothingValueException();
    }

    public static final /* synthetic */ void b() {
        x();
    }

    public static final /* synthetic */ h c(h hVar, io.l lVar, boolean z10) {
        return y(hVar, lVar, z10);
    }

    public static final /* synthetic */ AtomicReference e() {
        return f56514i;
    }

    public static final /* synthetic */ List g() {
        return f56513h;
    }

    public static final /* synthetic */ int h() {
        return f56510e;
    }

    public static final /* synthetic */ io.l k(io.l lVar, io.l lVar2, boolean z10) {
        return E(lVar, lVar2, z10);
    }

    public static final /* synthetic */ io.l l(io.l lVar, io.l lVar2) {
        return G(lVar, lVar2);
    }

    public static final /* synthetic */ void q(int i10) {
        f56510e = i10;
    }

    public static final /* synthetic */ h t(io.l lVar) {
        return T(lVar);
    }

    public static final k v(k kVar, int i10, int i11) {
        jo.p.h(kVar, "<this>");
        while (i10 < i11) {
            kVar = kVar.u(i10);
            i10++;
        }
        return kVar;
    }

    public static final <T> T w(io.l<? super k, ? extends T> lVar) {
        T t10;
        List D0;
        v0.a aVar = f56514i.get();
        synchronized (C()) {
            jo.p.g(aVar, "previousGlobalSnapshot");
            t10 = (T) S(aVar, lVar);
        }
        Set<c0> C = aVar.C();
        if (C != null) {
            synchronized (C()) {
                D0 = xn.a0.D0(f56512g);
            }
            int size = D0.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((io.p) D0.get(i10)).invoke(C, aVar);
            }
        }
        return t10;
    }

    public static final void x() {
        w(a.f56516w);
    }

    public static final h y(h hVar, io.l<Object, wn.v> lVar, boolean z10) {
        boolean z11 = hVar instanceof v0.c;
        if (!z11 && hVar != null) {
            return new g0(hVar, lVar, false, z10);
        }
        return new f0(z11 ? (v0.c) hVar : null, lVar, null, false, z10);
    }

    public static /* synthetic */ h z(h hVar, io.l lVar, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            lVar = null;
        }
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        return y(hVar, lVar, z10);
    }
}
