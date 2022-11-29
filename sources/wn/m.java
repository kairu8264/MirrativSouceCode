package wn;

import wn.l;

/* loaded from: classes4.dex */
public final class m {
    public static final Object a(Throwable th2) {
        jo.p.h(th2, "exception");
        return new l.b(th2);
    }

    public static final void b(Object obj) {
        if (obj instanceof l.b) {
            throw ((l.b) obj).f59225w;
        }
    }
}
