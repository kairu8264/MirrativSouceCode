package ai;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public final class p11 implements xg.q {

    /* renamed from: w  reason: collision with root package name */
    public final d61 f8218w;

    /* renamed from: x  reason: collision with root package name */
    public final AtomicBoolean f8219x = new AtomicBoolean(false);

    /* renamed from: y  reason: collision with root package name */
    public final AtomicBoolean f8220y = new AtomicBoolean(false);

    public p11(d61 d61Var) {
        this.f8218w = d61Var;
    }

    @Override // xg.q
    public final void B4() {
    }

    @Override // xg.q
    public final void D5(int i10) {
        this.f8219x.set(true);
        b();
    }

    public final boolean a() {
        return this.f8219x.get();
    }

    public final void b() {
        if (this.f8220y.get()) {
            return;
        }
        this.f8220y.set(true);
        this.f8218w.zza();
    }

    @Override // xg.q
    public final void c() {
    }

    @Override // xg.q
    public final void d() {
        b();
    }

    @Override // xg.q
    public final void f4() {
    }

    @Override // xg.q
    public final void s0() {
        this.f8218w.b();
    }
}
