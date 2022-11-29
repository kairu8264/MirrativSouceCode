package s1;

import q1.l0;
import q1.m0;
import q1.p0;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a */
    public static final a f51834a = new a(null);

    /* renamed from: b */
    public static final int f51835b = b.a(0);

    /* renamed from: c */
    public static final int f51836c = b.a(1);

    /* renamed from: d */
    public static final int f51837d = b.a(2);

    /* renamed from: e */
    public static final int f51838e = b.a(3);

    /* renamed from: f */
    public static final int f51839f = b.a(4);

    /* renamed from: g */
    public static final int f51840g = b.a(5);

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final int a() {
            return e.f51835b;
        }

        public final int b() {
            return e.f51839f;
        }

        public final int c() {
            return e.f51838e;
        }

        public final int d() {
            return e.f51836c;
        }

        public final int e() {
            return e.f51840g;
        }

        public final int f() {
            return e.f51837d;
        }
    }

    /* loaded from: classes.dex */
    public static final class b<T extends n<T, M>, M extends x0.f> {
        public static <T extends n<T, M>, M extends x0.f> int a(int i10) {
            return i10;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T extends n<T, ?>> void g(n<?, ?>[] nVarArr, T t10, int i10) {
        t10.i(nVarArr[i10]);
        nVarArr[i10] = t10;
    }

    public static final void h(n<?, ?>[] nVarArr, p pVar, x0.f fVar) {
        jo.p.h(pVar, "layoutNodeWrapper");
        jo.p.h(fVar, "modifier");
        if (fVar instanceof l0) {
            g(nVarArr, new e0(pVar, fVar), f51839f);
        }
        if (fVar instanceof m0) {
            g(nVarArr, new e0(pVar, fVar), f51840g);
        }
    }

    public static final void i(n<?, ?>[] nVarArr, p pVar, x0.f fVar) {
        jo.p.h(pVar, "layoutNodeWrapper");
        jo.p.h(fVar, "modifier");
        if (fVar instanceof z0.h) {
            g(nVarArr, new d(pVar, (z0.h) fVar), f51835b);
        }
        if (fVar instanceof n1.d0) {
            g(nVarArr, new b0(pVar, (n1.d0) fVar), f51836c);
        }
        if (fVar instanceof w1.n) {
            g(nVarArr, new w1.m(pVar, (w1.n) fVar), f51837d);
        }
        if (fVar instanceof p0) {
            g(nVarArr, new e0(pVar, fVar), f51838e);
        }
    }

    public static final void j(n<?, ?>[] nVarArr) {
        for (n<?, ?> nVar : nVarArr) {
            for (; nVar != null; nVar = nVar.d()) {
                if (nVar.f()) {
                    nVar.h();
                }
            }
        }
        int length = nVarArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            nVarArr[i10] = null;
        }
    }

    public static n<?, ?>[] k(n<?, ?>[] nVarArr) {
        jo.p.h(nVarArr, "entities");
        return nVarArr;
    }

    public static /* synthetic */ n[] l(n[] nVarArr, int i10, jo.h hVar) {
        if ((i10 & 1) != 0) {
            nVarArr = new n[6];
        }
        return k(nVarArr);
    }

    public static final boolean m(n<?, ?>[] nVarArr, int i10) {
        return nVarArr[i10] != null;
    }

    public static final <T extends n<T, M>, M extends x0.f> T n(n<?, ?>[] nVarArr, int i10) {
        return (T) nVarArr[i10];
    }
}
