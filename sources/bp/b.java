package bp;

import java.util.concurrent.Executor;
import uo.k0;
import uo.s1;
import zo.l0;
import zo.n0;

/* loaded from: classes4.dex */
public final class b extends s1 implements Executor {

    /* renamed from: y  reason: collision with root package name */
    public static final b f18564y = new b();

    /* renamed from: z  reason: collision with root package name */
    public static final k0 f18565z;

    static {
        int d10;
        m mVar = m.f18580x;
        d10 = n0.d("kotlinx.coroutines.io.parallelism", po.n.d(64, l0.a()), 0, 0, 12, null);
        f18565z = mVar.d0(d10);
    }

    @Override // uo.k0
    public void X(ao.g gVar, Runnable runnable) {
        f18565z.X(gVar, runnable);
    }

    @Override // uo.k0
    public void Y(ao.g gVar, Runnable runnable) {
        f18565z.Y(gVar, runnable);
    }

    @Override // uo.s1, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO".toString());
    }

    @Override // uo.k0
    public k0 d0(int i10) {
        return m.f18580x.d0(i10);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        X(ao.h.f16651w, runnable);
    }

    @Override // uo.k0
    public String toString() {
        return "Dispatchers.IO";
    }
}
