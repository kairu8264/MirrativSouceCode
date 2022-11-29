package uo;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes4.dex */
public final class b2 extends e2 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater B = AtomicIntegerFieldUpdater.newUpdater(b2.class, "_invoked");
    public final io.l<Throwable, wn.v> A;
    private volatile /* synthetic */ int _invoked = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public b2(io.l<? super Throwable, wn.v> lVar) {
        this.A = lVar;
    }

    @Override // uo.f0
    public void Q(Throwable th2) {
        if (B.compareAndSet(this, 0, 1)) {
            this.A.invoke(th2);
        }
    }

    @Override // io.l
    public /* bridge */ /* synthetic */ wn.v invoke(Throwable th2) {
        Q(th2);
        return wn.v.f59242a;
    }
}
