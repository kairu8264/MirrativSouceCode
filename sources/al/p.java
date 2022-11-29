package al;

import java.lang.Thread;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public class p implements Thread.UncaughtExceptionHandler {

    /* renamed from: a  reason: collision with root package name */
    public final a f13864a;

    /* renamed from: b  reason: collision with root package name */
    public final hl.e f13865b;

    /* renamed from: c  reason: collision with root package name */
    public final Thread.UncaughtExceptionHandler f13866c;

    /* renamed from: d  reason: collision with root package name */
    public final xk.a f13867d;

    /* renamed from: e  reason: collision with root package name */
    public final AtomicBoolean f13868e = new AtomicBoolean(false);

    /* loaded from: classes2.dex */
    public interface a {
        void a(hl.e eVar, Thread thread, Throwable th2);
    }

    public p(a aVar, hl.e eVar, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, xk.a aVar2) {
        this.f13864a = aVar;
        this.f13865b = eVar;
        this.f13866c = uncaughtExceptionHandler;
        this.f13867d = aVar2;
    }

    public boolean a() {
        return this.f13868e.get();
    }

    public final boolean b(Thread thread, Throwable th2) {
        if (thread == null) {
            xk.f.f().d("Crashlytics will not record uncaught exception; null thread");
            return false;
        } else if (th2 == null) {
            xk.f.f().d("Crashlytics will not record uncaught exception; null throwable");
            return false;
        } else if (this.f13867d.b()) {
            xk.f.f().b("Crashlytics will not record uncaught exception; native crash exists for session.");
            return false;
        } else {
            return true;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Thread$UncaughtExceptionHandler] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Thread$UncaughtExceptionHandler] */
    /* JADX WARN: Type inference failed for: r2v3, types: [xk.f] */
    /* JADX WARN: Type inference failed for: r3v1, types: [xk.f] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Thread] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Thread] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.util.concurrent.atomic.AtomicBoolean] */
    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th2) {
        ?? r02 = "Completed exception processing. Invoking default exception handler.";
        this.f13868e.set(true);
        try {
            try {
                if (b(thread, th2)) {
                    this.f13864a.a(this.f13865b, thread, th2);
                } else {
                    xk.f.f().b("Uncaught exception will not be recorded by Crashlytics.");
                }
            } catch (Exception e10) {
                xk.f.f().e("An error occurred in the uncaught exception handler", e10);
            }
        } finally {
            xk.f.f().b(r02);
            this.f13866c.uncaughtException(thread, th2);
            this.f13868e.set(false);
        }
    }
}
