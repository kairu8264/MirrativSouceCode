package l0;

/* loaded from: classes.dex */
public final class h2<T> {
    public static <T> i a(i iVar) {
        jo.p.h(iVar, "composer");
        return iVar;
    }

    public static final <V> void b(i iVar, V v10, io.p<? super T, ? super V, wn.v> pVar) {
        jo.p.h(pVar, "block");
        if (iVar.f() || !jo.p.c(iVar.y(), v10)) {
            iVar.q(v10);
            iVar.A(v10, pVar);
        }
    }
}
