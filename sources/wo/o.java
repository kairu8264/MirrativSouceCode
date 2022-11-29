package wo;

import java.util.concurrent.CancellationException;
import uo.r1;

/* loaded from: classes4.dex */
public final /* synthetic */ class o {
    public static final void a(x<?> xVar, Throwable th2) {
        if (th2 != null) {
            r0 = th2 instanceof CancellationException ? (CancellationException) th2 : null;
            if (r0 == null) {
                r0 = r1.a("Channel was consumed, consumer had failed", th2);
            }
        }
        xVar.c(r0);
    }
}
