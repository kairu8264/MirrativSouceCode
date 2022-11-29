package ai;

import java.lang.Thread;

/* loaded from: classes3.dex */
public final class od0 implements Thread.UncaughtExceptionHandler {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Thread.UncaughtExceptionHandler f7719a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ pd0 f7720b;

    public od0(pd0 pd0Var, Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f7720b = pd0Var;
        this.f7719a = uncaughtExceptionHandler;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th2) {
        try {
            try {
                this.f7720b.e(thread, th2);
                Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f7719a;
                if (uncaughtExceptionHandler != null) {
                    uncaughtExceptionHandler.uncaughtException(thread, th2);
                }
            } catch (Throwable unused) {
                uj0.c("AdMob exception reporter failed reporting the exception.");
                Thread.UncaughtExceptionHandler uncaughtExceptionHandler2 = this.f7719a;
                if (uncaughtExceptionHandler2 != null) {
                    uncaughtExceptionHandler2.uncaughtException(thread, th2);
                }
            }
        } catch (Throwable th3) {
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler3 = this.f7719a;
            if (uncaughtExceptionHandler3 != null) {
                uncaughtExceptionHandler3.uncaughtException(thread, th2);
            }
            throw th3;
        }
    }
}
