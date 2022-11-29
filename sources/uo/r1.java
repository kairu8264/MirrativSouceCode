package uo;

import java.util.concurrent.CancellationException;

/* loaded from: classes4.dex */
public final class r1 {
    public static final CancellationException a(String str, Throwable th2) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th2);
        return cancellationException;
    }
}
