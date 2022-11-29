package ai;

import java.util.concurrent.TimeoutException;

/* loaded from: classes3.dex */
public final class d53 extends TimeoutException {
    public /* synthetic */ d53(String str, c53 c53Var) {
        super(str);
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
