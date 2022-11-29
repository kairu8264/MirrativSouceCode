package ai;

import android.view.View;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public final class z32 implements wg.f {

    /* renamed from: a  reason: collision with root package name */
    public final t41 f12851a;

    /* renamed from: b  reason: collision with root package name */
    public final n51 f12852b;

    /* renamed from: c  reason: collision with root package name */
    public final pc1 f12853c;

    /* renamed from: d  reason: collision with root package name */
    public final ic1 f12854d;

    /* renamed from: e  reason: collision with root package name */
    public final ax0 f12855e;

    /* renamed from: f  reason: collision with root package name */
    public final AtomicBoolean f12856f = new AtomicBoolean(false);

    public z32(t41 t41Var, n51 n51Var, pc1 pc1Var, ic1 ic1Var, ax0 ax0Var) {
        this.f12851a = t41Var;
        this.f12852b = n51Var;
        this.f12853c = pc1Var;
        this.f12854d = ic1Var;
        this.f12855e = ax0Var;
    }

    @Override // wg.f
    public final synchronized void a(View view) {
        if (this.f12856f.compareAndSet(false, true)) {
            this.f12855e.f();
            this.f12854d.S0(view);
        }
    }

    @Override // wg.f
    public final void b() {
        if (this.f12856f.get()) {
            this.f12852b.zza();
            this.f12853c.zza();
        }
    }

    @Override // wg.f
    public final void zzb() {
        if (this.f12856f.get()) {
            this.f12851a.onAdClicked();
        }
    }
}
