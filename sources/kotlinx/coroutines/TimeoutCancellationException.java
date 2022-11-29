package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import uo.d2;
import uo.i0;

/* loaded from: classes4.dex */
public final class TimeoutCancellationException extends CancellationException implements i0<TimeoutCancellationException> {

    /* renamed from: w  reason: collision with root package name */
    public final d2 f38909w;

    public TimeoutCancellationException(String str, d2 d2Var) {
        super(str);
        this.f38909w = d2Var;
    }

    @Override // uo.i0
    /* renamed from: b */
    public TimeoutCancellationException a() {
        String message = getMessage();
        if (message == null) {
            message = "";
        }
        TimeoutCancellationException timeoutCancellationException = new TimeoutCancellationException(message, this.f38909w);
        timeoutCancellationException.initCause(this);
        return timeoutCancellationException;
    }

    public TimeoutCancellationException(String str) {
        this(str, null);
    }
}
