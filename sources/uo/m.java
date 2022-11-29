package uo;

import java.util.concurrent.Future;

/* loaded from: classes4.dex */
public final class m extends n {

    /* renamed from: w  reason: collision with root package name */
    public final Future<?> f56060w;

    public m(Future<?> future) {
        this.f56060w = future;
    }

    @Override // uo.o
    public void a(Throwable th2) {
        if (th2 != null) {
            this.f56060w.cancel(false);
        }
    }

    @Override // io.l
    public /* bridge */ /* synthetic */ wn.v invoke(Throwable th2) {
        a(th2);
        return wn.v.f59242a;
    }

    public String toString() {
        return "CancelFutureOnCancel[" + this.f56060w + ']';
    }
}
