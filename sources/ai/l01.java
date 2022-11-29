package ai;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public final class l01 implements k61, vk {

    /* renamed from: w  reason: collision with root package name */
    public final fl2 f6429w;

    /* renamed from: x  reason: collision with root package name */
    public final n51 f6430x;

    /* renamed from: y  reason: collision with root package name */
    public final t61 f6431y;

    /* renamed from: z  reason: collision with root package name */
    public final AtomicBoolean f6432z = new AtomicBoolean();
    public final AtomicBoolean A = new AtomicBoolean();

    public l01(fl2 fl2Var, n51 n51Var, t61 t61Var) {
        this.f6429w = fl2Var;
        this.f6430x = n51Var;
        this.f6431y = t61Var;
    }

    @Override // ai.vk
    public final void U(uk ukVar) {
        if (this.f6429w.f4090f == 1 && ukVar.f10736j) {
            b();
        }
        if (ukVar.f10736j && this.A.compareAndSet(false, true)) {
            this.f6431y.zza();
        }
    }

    @Override // ai.k61
    public final synchronized void a() {
        if (this.f6429w.f4090f != 1) {
            b();
        }
    }

    public final void b() {
        if (this.f6432z.compareAndSet(false, true)) {
            this.f6430x.zza();
        }
    }
}
