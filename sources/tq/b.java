package tq;

import jo.p;
import org.koin.core.error.DefinitionOverrideException;
import rq.c;

/* loaded from: classes4.dex */
public final class b {
    public static final void a(c<?> cVar, String str) {
        p.h(cVar, "factory");
        p.h(str, "mapping");
        throw new DefinitionOverrideException("Already existing definition for " + cVar.c() + " at " + str);
    }
}
