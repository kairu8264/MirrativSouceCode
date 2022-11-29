package pi;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class p6 implements Runnable {

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ long f48125w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ i7 f48126x;

    public p6(i7 i7Var, long j10) {
        this.f48126x = i7Var;
        this.f48125w = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f48126x.y(this.f48125w, true);
        this.f48126x.f48285a.L().S(new AtomicReference<>());
    }
}
