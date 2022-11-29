package ai;

import android.os.Looper;
import android.os.SystemClock;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

/* loaded from: classes3.dex */
public final class dj {

    /* renamed from: a  reason: collision with root package name */
    public final ExecutorService f3309a = vj.b("Loader:ExtractorMediaPeriod");

    /* renamed from: b  reason: collision with root package name */
    public bj<? extends cj> f3310b;

    /* renamed from: c  reason: collision with root package name */
    public IOException f3311c;

    public dj(String str) {
    }

    public final <T extends cj> long e(T t10, aj<T> ajVar, int i10) {
        Looper myLooper = Looper.myLooper();
        fj.d(myLooper != null);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        new bj(this, myLooper, t10, ajVar, i10, elapsedRealtime).b(0L);
        return elapsedRealtime;
    }

    public final boolean f() {
        return this.f3310b != null;
    }

    public final void g() {
        this.f3310b.c(false);
    }

    public final void h(Runnable runnable) {
        bj<? extends cj> bjVar = this.f3310b;
        if (bjVar != null) {
            bjVar.c(true);
        }
        this.f3309a.execute(runnable);
        this.f3309a.shutdown();
    }

    public final void i(int i10) throws IOException {
        IOException iOException = this.f3311c;
        if (iOException != null) {
            throw iOException;
        }
        bj<? extends cj> bjVar = this.f3310b;
        if (bjVar != null) {
            bjVar.a(bjVar.f2359y);
        }
    }
}
