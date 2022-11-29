package ai;

import android.content.Context;
import android.view.ViewGroup;

/* loaded from: classes3.dex */
public final class sl0 {

    /* renamed from: a  reason: collision with root package name */
    public final Context f9865a;

    /* renamed from: b  reason: collision with root package name */
    public final em0 f9866b;

    /* renamed from: c  reason: collision with root package name */
    public final ViewGroup f9867c;

    /* renamed from: d  reason: collision with root package name */
    public rl0 f9868d;

    public sl0(Context context, ViewGroup viewGroup, rp0 rp0Var) {
        this.f9865a = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.f9867c = viewGroup;
        this.f9866b = rp0Var;
        this.f9868d = null;
    }

    public final void a(int i10, int i11, int i12, int i13) {
        rh.p.d("The underlay may only be modified from the UI thread.");
        rl0 rl0Var = this.f9868d;
        if (rl0Var != null) {
            rl0Var.u(i10, i11, i12, i13);
        }
    }

    public final void b(int i10, int i11, int i12, int i13, int i14, boolean z10, dm0 dm0Var) {
        if (this.f9868d != null) {
            return;
        }
        vx.a(this.f9866b.l().c(), this.f9866b.h(), "vpr2");
        Context context = this.f9865a;
        em0 em0Var = this.f9866b;
        rl0 rl0Var = new rl0(context, em0Var, i14, z10, em0Var.l().c(), dm0Var);
        this.f9868d = rl0Var;
        this.f9867c.addView(rl0Var, 0, new ViewGroup.LayoutParams(-1, -1));
        this.f9868d.u(i10, i11, i12, i13);
        this.f9866b.b0(false);
    }

    public final rl0 c() {
        rh.p.d("getAdVideoUnderlay must be called from the UI thread.");
        return this.f9868d;
    }

    public final void d() {
        rh.p.d("onPause must be called from the UI thread.");
        rl0 rl0Var = this.f9868d;
        if (rl0Var != null) {
            rl0Var.y();
        }
    }

    public final void e() {
        rh.p.d("onDestroy must be called from the UI thread.");
        rl0 rl0Var = this.f9868d;
        if (rl0Var != null) {
            rl0Var.m();
            this.f9867c.removeView(this.f9868d);
            this.f9868d = null;
        }
    }

    public final void f(int i10) {
        rh.p.d("setPlayerBackgroundColor must be called from the UI thread.");
        rl0 rl0Var = this.f9868d;
        if (rl0Var != null) {
            rl0Var.t(i10);
        }
    }
}
