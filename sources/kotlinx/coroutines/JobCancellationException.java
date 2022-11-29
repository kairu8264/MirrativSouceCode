package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import jo.p;
import uo.d2;
import uo.i0;
import uo.u0;

/* loaded from: classes4.dex */
public final class JobCancellationException extends CancellationException implements i0<JobCancellationException> {

    /* renamed from: w  reason: collision with root package name */
    public final d2 f38908w;

    public JobCancellationException(String str, Throwable th2, d2 d2Var) {
        super(str);
        this.f38908w = d2Var;
        if (th2 != null) {
            initCause(th2);
        }
    }

    @Override // uo.i0
    /* renamed from: b */
    public JobCancellationException a() {
        if (u0.c()) {
            String message = getMessage();
            p.e(message);
            return new JobCancellationException(message, this, this.f38908w);
        }
        return null;
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof JobCancellationException) {
                JobCancellationException jobCancellationException = (JobCancellationException) obj;
                if (!p.c(jobCancellationException.getMessage(), getMessage()) || !p.c(jobCancellationException.f38908w, this.f38908w) || !p.c(jobCancellationException.getCause(), getCause())) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        if (u0.c()) {
            return super.fillInStackTrace();
        }
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public int hashCode() {
        String message = getMessage();
        p.e(message);
        int hashCode = ((message.hashCode() * 31) + this.f38908w.hashCode()) * 31;
        Throwable cause = getCause();
        return hashCode + (cause == null ? 0 : cause.hashCode());
    }

    @Override // java.lang.Throwable
    public String toString() {
        return super.toString() + "; job=" + this.f38908w;
    }
}
