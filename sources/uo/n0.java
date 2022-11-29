package uo;

/* loaded from: classes4.dex */
public final class n0 {
    public static final void a(ao.g gVar, Throwable th2) {
        try {
            l0 l0Var = (l0) gVar.get(l0.f56050r);
            if (l0Var == null) {
                m0.a(gVar, th2);
            } else {
                l0Var.handleException(gVar, th2);
            }
        } catch (Throwable th3) {
            m0.a(gVar, b(th2, th3));
        }
    }

    public static final Throwable b(Throwable th2, Throwable th3) {
        if (th2 == th3) {
            return th2;
        }
        RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th3);
        wn.a.a(runtimeException, th2);
        return runtimeException;
    }
}
