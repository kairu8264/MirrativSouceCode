package l0;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.KotlinNothingValueException;
import n0.f;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a  reason: collision with root package name */
    public static t f39176a;

    /* renamed from: b  reason: collision with root package name */
    public static final io.q<l0.e<?>, r1, j1, wn.v> f39177b = b.f39189w;

    /* renamed from: c  reason: collision with root package name */
    public static final io.q<l0.e<?>, r1, j1, wn.v> f39178c = d.f39191w;

    /* renamed from: d  reason: collision with root package name */
    public static final io.q<l0.e<?>, r1, j1, wn.v> f39179d = a.f39188w;

    /* renamed from: e  reason: collision with root package name */
    public static final io.q<l0.e<?>, r1, j1, wn.v> f39180e = e.f39192w;

    /* renamed from: f  reason: collision with root package name */
    public static final io.q<l0.e<?>, r1, j1, wn.v> f39181f = c.f39190w;

    /* renamed from: g  reason: collision with root package name */
    public static final Object f39182g = new v0("provider");

    /* renamed from: h  reason: collision with root package name */
    public static final Object f39183h = new v0("provider");

    /* renamed from: i  reason: collision with root package name */
    public static final Object f39184i = new v0("compositionLocalMap");

    /* renamed from: j  reason: collision with root package name */
    public static final Object f39185j = new v0("providerValues");

    /* renamed from: k  reason: collision with root package name */
    public static final Object f39186k = new v0("providers");

    /* renamed from: l  reason: collision with root package name */
    public static final Object f39187l = new v0("reference");

    /* loaded from: classes.dex */
    public static final class a extends jo.q implements io.q<l0.e<?>, r1, j1, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public static final a f39188w = new a();

        public a() {
            super(3);
        }

        public final void a(l0.e<?> eVar, r1 r1Var, j1 j1Var) {
            jo.p.h(eVar, "<anonymous parameter 0>");
            jo.p.h(r1Var, "slots");
            jo.p.h(j1Var, "<anonymous parameter 2>");
            r1Var.N();
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
        public static final b f39189w = new b();

        public b() {
            super(3);
        }

        public final void a(l0.e<?> eVar, r1 r1Var, j1 j1Var) {
            jo.p.h(eVar, "<anonymous parameter 0>");
            jo.p.h(r1Var, "slots");
            jo.p.h(j1Var, "rememberManager");
            k.U(r1Var, j1Var);
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
        public static final c f39190w = new c();

        public c() {
            super(3);
        }

        public final void a(l0.e<?> eVar, r1 r1Var, j1 j1Var) {
            jo.p.h(eVar, "<anonymous parameter 0>");
            jo.p.h(r1Var, "slots");
            jo.p.h(j1Var, "<anonymous parameter 2>");
            r1Var.H0();
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
        public static final d f39191w = new d();

        public d() {
            super(3);
        }

        public final void a(l0.e<?> eVar, r1 r1Var, j1 j1Var) {
            jo.p.h(eVar, "<anonymous parameter 0>");
            jo.p.h(r1Var, "slots");
            jo.p.h(j1Var, "<anonymous parameter 2>");
            r1Var.O0();
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
        public static final e f39192w = new e();

        public e() {
            super(3);
        }

        public final void a(l0.e<?> eVar, r1 r1Var, j1 j1Var) {
            jo.p.h(eVar, "<anonymous parameter 0>");
            jo.p.h(r1Var, "slots");
            jo.p.h(j1Var, "<anonymous parameter 2>");
            r1Var.P(0);
        }

        @Override // io.q
        public /* bridge */ /* synthetic */ wn.v s0(l0.e<?> eVar, r1 r1Var, j1 j1Var) {
            a(eVar, r1Var, j1Var);
            return wn.v.f59242a;
        }
    }

    public static final int A(o1 o1Var, int i10, int i11) {
        int i12 = 0;
        while (i10 > 0 && i10 != i11) {
            i10 = o1Var.M(i10);
            i12++;
        }
        return i12;
    }

    public static final List<g0> B(List<g0> list, int i10, int i11) {
        ArrayList arrayList = new ArrayList();
        for (int C = C(list, i10); C < list.size(); C++) {
            g0 g0Var = list.get(C);
            if (g0Var.b() >= i11) {
                break;
            }
            arrayList.add(g0Var);
        }
        return arrayList;
    }

    public static final int C(List<g0> list, int i10) {
        int D = D(list, i10);
        return D < 0 ? -(D + 1) : D;
    }

    public static final int D(List<g0> list, int i10) {
        int size = list.size() - 1;
        int i11 = 0;
        while (i11 <= size) {
            int i12 = (i11 + size) >>> 1;
            int j10 = jo.p.j(list.get(i12).b(), i10);
            if (j10 < 0) {
                i11 = i12 + 1;
            } else if (j10 <= 0) {
                return i12;
            } else {
                size = i12 - 1;
            }
        }
        return -(i11 + 1);
    }

    public static final g0 E(List<g0> list, int i10, int i11) {
        int C = C(list, i10);
        if (C < list.size()) {
            g0 g0Var = list.get(C);
            if (g0Var.b() < i11) {
                return g0Var;
            }
            return null;
        }
        return null;
    }

    public static final Object F() {
        return f39184i;
    }

    public static final Object G() {
        return f39182g;
    }

    public static final Object H(j0 j0Var) {
        return j0Var.d() != null ? new i0(Integer.valueOf(j0Var.a()), j0Var.d()) : Integer.valueOf(j0Var.a());
    }

    public static final Object I() {
        return f39183h;
    }

    public static final Object J() {
        return f39186k;
    }

    public static final Object K() {
        return f39185j;
    }

    public static final Object L() {
        return f39187l;
    }

    public static final <T> T M(n0.f<q<Object>, ? extends c2<? extends Object>> fVar, q<T> qVar) {
        jo.p.h(fVar, "<this>");
        jo.p.h(qVar, "key");
        c2<? extends Object> c2Var = fVar.get(qVar);
        if (c2Var != null) {
            return (T) c2Var.getValue();
        }
        return null;
    }

    public static final void N(List<g0> list, int i10, f1 f1Var, Object obj) {
        int D = D(list, i10);
        m0.c cVar = null;
        if (D < 0) {
            int i11 = -(D + 1);
            if (obj != null) {
                cVar = new m0.c();
                cVar.add(obj);
            }
            list.add(i11, new g0(f1Var, i10, cVar));
        } else if (obj == null) {
            list.get(D).e(null);
        } else {
            m0.c<Object> a10 = list.get(D).a();
            if (a10 != null) {
                a10.add(obj);
            }
        }
    }

    public static final boolean O() {
        t tVar = f39176a;
        return tVar != null && tVar.a();
    }

    public static final <K, V> HashMap<K, LinkedHashSet<V>> P() {
        return new HashMap<>();
    }

    public static final int Q(o1 o1Var, int i10, int i11, int i12) {
        if (i10 == i11) {
            return i10;
        }
        if (i10 == i12 || i11 == i12) {
            return i12;
        }
        if (o1Var.M(i10) == i11) {
            return i11;
        }
        if (o1Var.M(i11) == i10) {
            return i10;
        }
        if (o1Var.M(i10) == o1Var.M(i11)) {
            return o1Var.M(i10);
        }
        int A = A(o1Var, i10, i12);
        int A2 = A(o1Var, i11, i12);
        int i13 = A - A2;
        for (int i14 = 0; i14 < i13; i14++) {
            i10 = o1Var.M(i10);
        }
        int i15 = A2 - A;
        for (int i16 = 0; i16 < i15; i16++) {
            i11 = o1Var.M(i11);
        }
        while (i10 != i11) {
            i10 = o1Var.M(i10);
            i11 = o1Var.M(i11);
        }
        return i10;
    }

    public static final <K, V> V R(HashMap<K, LinkedHashSet<V>> hashMap, K k10) {
        V v10;
        LinkedHashSet<V> linkedHashSet = hashMap.get(k10);
        if (linkedHashSet == null || (v10 = (V) xn.a0.Y(linkedHashSet)) == null) {
            return null;
        }
        T(hashMap, k10, v10);
        return v10;
    }

    public static final <K, V> boolean S(HashMap<K, LinkedHashSet<V>> hashMap, K k10, V v10) {
        LinkedHashSet<V> linkedHashSet = hashMap.get(k10);
        if (linkedHashSet == null) {
            linkedHashSet = new LinkedHashSet<>();
            hashMap.put(k10, linkedHashSet);
        }
        return linkedHashSet.add(v10);
    }

    public static final <K, V> wn.v T(HashMap<K, LinkedHashSet<V>> hashMap, K k10, V v10) {
        LinkedHashSet<V> linkedHashSet = hashMap.get(k10);
        if (linkedHashSet != null) {
            linkedHashSet.remove(v10);
            if (linkedHashSet.isEmpty()) {
                hashMap.remove(k10);
            }
            return wn.v.f59242a;
        }
        return null;
    }

    public static final void U(r1 r1Var, j1 j1Var) {
        f1 f1Var;
        o l10;
        jo.p.h(r1Var, "<this>");
        jo.p.h(j1Var, "rememberManager");
        Iterator<Object> d02 = r1Var.d0();
        while (d02.hasNext()) {
            Object next = d02.next();
            if (next instanceof k1) {
                j1Var.a((k1) next);
            } else if ((next instanceof f1) && (l10 = (f1Var = (f1) next).l()) != null) {
                l10.E(true);
                f1Var.x();
            }
        }
        r1Var.E0();
    }

    public static final g0 V(List<g0> list, int i10) {
        int D = D(list, i10);
        if (D >= 0) {
            return list.remove(D);
        }
        return null;
    }

    public static final void W(List<g0> list, int i10, int i11) {
        int C = C(list, i10);
        while (C < list.size() && list.get(C).b() < i11) {
            list.remove(C);
        }
    }

    public static final void X(boolean z10) {
        if (z10) {
            return;
        }
        x("Check failed".toString());
        throw new KotlinNothingValueException();
    }

    public static final void Y() {
        t tVar = f39176a;
        if (tVar != null) {
            tVar.c();
            wn.v vVar = wn.v.f59242a;
        }
    }

    public static final void Z(int i10, int i11, int i12, String str) {
        jo.p.h(str, "info");
        t tVar = f39176a;
        if (tVar != null) {
            tVar.b(i10, i11, i12, str);
            wn.v vVar = wn.v.f59242a;
        }
    }

    public static final boolean t(int i10) {
        return i10 != 0;
    }

    public static final int u(boolean z10) {
        return z10 ? 1 : 0;
    }

    public static final List<Object> v(p1 p1Var, l0.d dVar) {
        ArrayList arrayList = new ArrayList();
        o1 w10 = p1Var.w();
        try {
            w(w10, arrayList, p1Var.d(dVar));
            wn.v vVar = wn.v.f59242a;
            return arrayList;
        } finally {
            w10.d();
        }
    }

    public static final void w(o1 o1Var, List<Object> list, int i10) {
        if (o1Var.G(i10)) {
            list.add(o1Var.I(i10));
            return;
        }
        int i11 = i10 + 1;
        int B = i10 + o1Var.B(i10);
        while (i11 < B) {
            w(o1Var, list, i11);
            i11 += o1Var.B(i11);
        }
    }

    public static final Void x(String str) {
        jo.p.h(str, "message");
        throw new IllegalStateException(("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (" + str + "). Please report to Google or use https://goo.gle/compose-feedback").toString());
    }

    public static final n0.f<q<Object>, c2<Object>> y(d1<?>[] d1VarArr, n0.f<q<Object>, ? extends c2<? extends Object>> fVar, i iVar, int i10) {
        iVar.x(721128344);
        f.a n10 = n0.a.a().n();
        for (d1<?> d1Var : d1VarArr) {
            if (d1Var.a() || !z(fVar, d1Var.b())) {
                n10.put(d1Var.b(), d1Var.b().b(d1Var.c(), iVar, 72));
            }
        }
        n0.f<q<Object>, c2<Object>> a10 = n10.a();
        iVar.O();
        return a10;
    }

    public static final <T> boolean z(n0.f<q<Object>, ? extends c2<? extends Object>> fVar, q<T> qVar) {
        jo.p.h(fVar, "<this>");
        jo.p.h(qVar, "key");
        return fVar.containsKey(qVar);
    }
}
