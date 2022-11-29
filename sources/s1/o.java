package s1;

/* loaded from: classes.dex */
public final class o {
    public static final y a(k kVar) {
        jo.p.h(kVar, "<this>");
        y t02 = kVar.t0();
        if (t02 != null) {
            return t02;
        }
        throw new IllegalStateException("LayoutNode should be attached to an owner".toString());
    }
}
