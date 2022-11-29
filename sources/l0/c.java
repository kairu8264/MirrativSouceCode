package l0;

/* loaded from: classes.dex */
public final class c {
    public static final int a(Object obj) {
        return System.identityHashCode(obj);
    }

    public static final void b(i iVar, io.p<? super i, ? super Integer, wn.v> pVar) {
        jo.p.h(iVar, "composer");
        jo.p.h(pVar, "composable");
        ((io.p) jo.j0.e(pVar, 2)).invoke(iVar, 1);
    }

    public static final <T> T c(i iVar, io.p<? super i, ? super Integer, ? extends T> pVar) {
        jo.p.h(iVar, "composer");
        jo.p.h(pVar, "composable");
        return (T) ((io.p) jo.j0.e(pVar, 2)).invoke(iVar, 1);
    }
}
