package da;

import jo.p;
import uo.l0;

/* loaded from: classes.dex */
public final class c extends ao.a implements l0 {
    public c() {
        super(l0.f56050r);
    }

    @Override // uo.l0
    public void handleException(ao.g gVar, Throwable th2) {
        p.h(gVar, "context");
        p.h(th2, "exception");
        g9.a.c(th2);
    }
}
