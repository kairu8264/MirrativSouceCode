package pi;

import java.lang.Thread;

/* loaded from: classes3.dex */
public final class v4 implements Thread.UncaughtExceptionHandler {

    /* renamed from: a  reason: collision with root package name */
    public final String f48283a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ y4 f48284b;

    public v4(y4 y4Var, String str) {
        this.f48284b = y4Var;
        rh.p.i(str);
        this.f48283a = str;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final synchronized void uncaughtException(Thread thread, Throwable th2) {
        this.f48284b.f48285a.r().p().b(this.f48283a, th2);
    }
}
