package kotlinx.coroutines.flow.internal;

import java.util.concurrent.CancellationException;
import uo.u0;
import xo.d;

/* loaded from: classes4.dex */
public final class AbortFlowException extends CancellationException {

    /* renamed from: w  reason: collision with root package name */
    public final d<?> f38910w;

    public AbortFlowException(d<?> dVar) {
        super("Flow was aborted, no more elements needed");
        this.f38910w = dVar;
    }

    public final d<?> a() {
        return this.f38910w;
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        if (u0.c()) {
            return super.fillInStackTrace();
        }
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
