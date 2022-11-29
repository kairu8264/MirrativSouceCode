package ai;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public final class xf2 extends zt implements xg.b0, jm, v61 {
    public final String A;
    public final rf2 B;
    public final yg2 C;
    public final zj0 D;
    public nx0 F;
    public by0 G;

    /* renamed from: w  reason: collision with root package name */
    public final or0 f11917w;

    /* renamed from: x  reason: collision with root package name */
    public final Context f11918x;

    /* renamed from: y  reason: collision with root package name */
    public final ViewGroup f11919y;

    /* renamed from: z  reason: collision with root package name */
    public AtomicBoolean f11920z = new AtomicBoolean();
    public long E = -1;

    public xf2(or0 or0Var, Context context, String str, rf2 rf2Var, yg2 yg2Var, zj0 zj0Var) {
        this.f11919y = new FrameLayout(context);
        this.f11917w = or0Var;
        this.f11918x = context;
        this.A = str;
        this.B = rf2Var;
        this.C = yg2Var;
        yg2Var.t(this);
        this.D = zj0Var;
    }

    public static /* synthetic */ xg.s W5(xf2 xf2Var, by0 by0Var) {
        boolean l10 = by0Var.l();
        int intValue = ((Integer) ft.c().c(ox.f8048n3)).intValue();
        xg.r rVar = new xg.r();
        rVar.f60285d = 50;
        rVar.f60282a = true != l10 ? 0 : intValue;
        rVar.f60283b = true != l10 ? intValue : 0;
        rVar.f60284c = intValue;
        return new xg.s(xf2Var.f11918x, rVar, xf2Var);
    }

    @Override // ai.au
    public final synchronized pv B0() {
        return null;
    }

    @Override // ai.au
    public final void E1(eu euVar) {
    }

    @Override // ai.au
    public final void E3(yh.a aVar) {
    }

    @Override // ai.au
    public final synchronized boolean G() {
        return this.B.zzb();
    }

    @Override // ai.au
    public final void H2(zc0 zc0Var) {
    }

    @Override // ai.au
    public final nt K() {
        return null;
    }

    @Override // ai.au
    public final void N1(pu puVar) {
    }

    @Override // ai.au
    public final synchronized String O() {
        return this.A;
    }

    @Override // ai.au
    public final void O3(ls lsVar) {
        this.B.h(lsVar);
    }

    @Override // ai.au
    public final void P1(String str) {
    }

    public final /* synthetic */ void R5() {
        S5(5);
    }

    public final synchronized void S5(int i10) {
        if (this.f11920z.compareAndSet(false, true)) {
            by0 by0Var = this.G;
            if (by0Var != null && by0Var.q() != null) {
                this.C.B(this.G.q());
            }
            this.C.A();
            this.f11919y.removeAllViews();
            nx0 nx0Var = this.F;
            if (nx0Var != null) {
                wg.t.g().c(nx0Var);
            }
            if (this.G != null) {
                long j10 = -1;
                if (this.E != -1) {
                    j10 = wg.t.k().elapsedRealtime() - this.E;
                }
                this.G.o(j10, i10);
            }
            g();
        }
    }

    @Override // ai.au
    public final synchronized void T3(uw uwVar) {
    }

    @Override // ai.au
    public final void V0(String str) {
    }

    @Override // ai.au
    public final void V1(jt jtVar) {
    }

    @Override // ai.au
    public final void V3(as asVar, qt qtVar) {
    }

    @Override // ai.au
    public final synchronized void X4(lu luVar) {
    }

    @Override // xg.b0
    public final void d() {
        S5(4);
    }

    @Override // ai.au
    public final synchronized void d1(ky kyVar) {
    }

    @Override // ai.au
    public final synchronized boolean e4(as asVar) throws RemoteException {
        rh.p.d("loadAd must be called on the main UI thread.");
        wg.t.d();
        if (yg.d2.k(this.f11918x) && asVar.O == null) {
            uj0.c("Failed to load the ad because app ID is missing.");
            this.C.z(tm2.d(4, null, null));
            return false;
        }
        if (G()) {
            return false;
        }
        this.f11920z = new AtomicBoolean();
        return this.B.a(asVar, this.A, new vf2(this), new wf2(this));
    }

    public final void f() {
        dt.a();
        if (nj0.n()) {
            S5(5);
        } else {
            this.f11917w.h().execute(new Runnable(this) { // from class: ai.tf2

                /* renamed from: w  reason: collision with root package name */
                public final xf2 f10280w;

                {
                    this.f10280w = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.f10280w.R5();
                }
            });
        }
    }

    @Override // ai.au
    public final synchronized void g() {
        rh.p.d("destroy must be called on the main UI thread.");
        by0 by0Var = this.G;
        if (by0Var != null) {
            by0Var.b();
        }
    }

    @Override // ai.au
    public final yh.a h() {
        rh.p.d("getAdFrame must be called on the main UI thread.");
        return yh.b.h1(this.f11919y);
    }

    @Override // ai.au
    public final boolean i() {
        return false;
    }

    @Override // ai.v61
    public final void i0() {
        if (this.G == null) {
            return;
        }
        this.E = wg.t.k().elapsedRealtime();
        int i10 = this.G.i();
        if (i10 <= 0) {
            return;
        }
        nx0 nx0Var = new nx0(this.f11917w.i(), wg.t.k());
        this.F = nx0Var;
        nx0Var.a(i10, new Runnable(this) { // from class: ai.uf2

            /* renamed from: w  reason: collision with root package name */
            public final xf2 f10696w;

            {
                this.f10696w = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f10696w.f();
            }
        });
    }

    @Override // ai.au
    public final void i1(ff0 ff0Var) {
    }

    @Override // ai.au
    public final synchronized void k() {
        rh.p.d("pause must be called on the main UI thread.");
    }

    @Override // ai.au
    public final void l5(iv ivVar) {
    }

    @Override // ai.au
    public final synchronized void m() {
    }

    @Override // ai.au
    public final void m1(om omVar) {
        this.C.f(omVar);
    }

    @Override // ai.au
    public final synchronized void n() {
        rh.p.d("resume must be called on the main UI thread.");
    }

    @Override // ai.au
    public final void n0(boolean z10) {
    }

    @Override // ai.au
    public final void q() {
    }

    @Override // ai.au
    public final void q1(nt ntVar) {
    }

    @Override // ai.au
    public final synchronized fs r() {
        rh.p.d("getAdSize must be called on the main UI thread.");
        by0 by0Var = this.G;
        if (by0Var != null) {
            return cm2.b(this.f11918x, Collections.singletonList(by0Var.g()));
        }
        return null;
    }

    @Override // ai.au
    public final void s1(tv tvVar) {
    }

    @Override // ai.au
    public final void s2(hu huVar) {
    }

    @Override // ai.au
    public final synchronized void t2(boolean z10) {
    }

    @Override // ai.au
    public final synchronized String u() {
        return null;
    }

    @Override // ai.au
    public final Bundle w() {
        return new Bundle();
    }

    @Override // ai.au
    public final hu x() {
        return null;
    }

    @Override // ai.au
    public final synchronized lv y() {
        return null;
    }

    @Override // ai.au
    public final synchronized String z() {
        return null;
    }

    @Override // ai.au
    public final synchronized void z3(fs fsVar) {
        rh.p.d("setAdSize must be called on the main UI thread.");
    }

    @Override // ai.au
    public final void z5(ed0 ed0Var, String str) {
    }

    @Override // ai.jm
    public final void zza() {
        S5(3);
    }
}
