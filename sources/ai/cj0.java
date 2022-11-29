package ai;

import android.content.Context;

/* loaded from: classes3.dex */
public final class cj0 extends yg.b0 {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ fj0 f2843c;

    public cj0(fj0 fj0Var) {
        this.f2843c = fj0Var;
    }

    @Override // yg.b0
    public final void a() {
        Context context;
        zj0 zj0Var;
        Object obj;
        tx txVar;
        context = this.f2843c.f4051e;
        zj0Var = this.f2843c.f4052f;
        rx rxVar = new rx(context, zj0Var.f13013w);
        obj = this.f2843c.f4047a;
        synchronized (obj) {
            try {
                wg.t.m();
                txVar = this.f2843c.f4053g;
                ux.a(txVar, rxVar);
            } catch (IllegalArgumentException e10) {
                uj0.g("Cannot config CSI reporter.", e10);
            }
        }
    }
}
