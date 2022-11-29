package l0;

import java.util.Collection;

/* loaded from: classes.dex */
public final /* synthetic */ class z1 {
    public static final <T> v0.s<T> a() {
        return new v0.s<>();
    }

    public static final <T> v0.s<T> b(T... tArr) {
        jo.p.h(tArr, "elements");
        v0.s<T> sVar = new v0.s<>();
        sVar.addAll(xn.o.d0(tArr));
        return sVar;
    }

    public static final <K, V> v0.u<K, V> c() {
        return new v0.u<>();
    }

    public static final <T> s0<T> d(T t10, t1<T> t1Var) {
        jo.p.h(t1Var, "policy");
        return b.a(t10, t1Var);
    }

    public static /* synthetic */ s0 e(Object obj, t1 t1Var, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            t1Var = u1.n();
        }
        return u1.f(obj, t1Var);
    }

    public static final <T> c2<T> f(T t10, i iVar, int i10) {
        iVar.x(-1058319986);
        iVar.x(-492369756);
        Object y10 = iVar.y();
        if (y10 == i.f39065a.a()) {
            y10 = e(t10, null, 2, null);
            iVar.q(y10);
        }
        iVar.O();
        s0 s0Var = (s0) y10;
        s0Var.setValue(t10);
        iVar.O();
        return s0Var;
    }

    public static final <T> v0.s<T> g(Collection<? extends T> collection) {
        jo.p.h(collection, "<this>");
        v0.s<T> sVar = new v0.s<>();
        sVar.addAll(collection);
        return sVar;
    }
}
