package ai;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* loaded from: classes3.dex */
public final class g43<V> implements Runnable {

    /* renamed from: w  reason: collision with root package name */
    public final Future<V> f4337w;

    /* renamed from: x  reason: collision with root package name */
    public final e43<? super V> f4338x;

    public g43(Future<V> future, e43<? super V> e43Var) {
        this.f4337w = future;
        this.f4338x = e43Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Throwable a10;
        Future<V> future = this.f4337w;
        if ((future instanceof k53) && (a10 = l53.a((k53) future)) != null) {
            this.f4338x.a(a10);
            return;
        }
        try {
            this.f4338x.b(j43.q(this.f4337w));
        } catch (Error e10) {
            e = e10;
            this.f4338x.a(e);
        } catch (RuntimeException e11) {
            e = e11;
            this.f4338x.a(e);
        } catch (ExecutionException e12) {
            this.f4338x.a(e12.getCause());
        }
    }

    public final String toString() {
        fx2 a10 = gx2.a(this);
        a10.a(this.f4338x);
        return a10.toString();
    }
}
