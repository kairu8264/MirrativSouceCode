package ai;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public final class hh2 extends zt implements xg.q, jm {
    public final ah2 A;
    public final yg2 B;
    public nx0 D;
    public my0 E;

    /* renamed from: w  reason: collision with root package name */
    public final or0 f4851w;

    /* renamed from: x  reason: collision with root package name */
    public final Context f4852x;

    /* renamed from: z  reason: collision with root package name */
    public final String f4854z;

    /* renamed from: y  reason: collision with root package name */
    public AtomicBoolean f4853y = new AtomicBoolean();
    public long C = -1;

    public hh2(or0 or0Var, Context context, String str, ah2 ah2Var, yg2 yg2Var) {
        this.f4851w = or0Var;
        this.f4852x = context;
        this.f4854z = str;
        this.A = ah2Var;
        this.B = yg2Var;
        yg2Var.u(this);
    }

    @Override // ai.au
    public final synchronized pv B0() {
        return null;
    }

    @Override // xg.q
    public final void B4() {
    }

    @Override // xg.q
    public final void D5(int i10) {
        int i11 = i10 - 1;
        if (i10 == 0) {
            throw null;
        }
        if (i11 == 0) {
            R5(2);
        } else if (i11 == 1) {
            R5(4);
        } else if (i11 == 2) {
            R5(3);
        } else if (i11 != 3) {
        } else {
            R5(6);
        }
    }

    @Override // ai.au
    public final void E1(eu euVar) {
    }

    @Override // ai.au
    public final void E3(yh.a aVar) {
    }

    @Override // ai.au
    public final synchronized boolean G() {
        return this.A.zzb();
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
        return this.f4854z;
    }

    @Override // ai.au
    public final void O3(ls lsVar) {
        this.A.h(lsVar);
    }

    @Override // ai.au
    public final void P1(String str) {
    }

    public final synchronized void R5(int i10) {
        if (this.f4853y.compareAndSet(false, true)) {
            this.B.A();
            nx0 nx0Var = this.D;
            if (nx0Var != null) {
                wg.t.g().c(nx0Var);
            }
            if (this.E != null) {
                long j10 = -1;
                if (this.C != -1) {
                    j10 = wg.t.k().elapsedRealtime() - this.C;
                }
                this.E.j(j10, i10);
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

    @Override // xg.q
    public final synchronized void c() {
        my0 my0Var = this.E;
        if (my0Var != null) {
            my0Var.j(wg.t.k().elapsedRealtime() - this.C, 1);
        }
    }

    @Override // xg.q
    public final void d() {
    }

    @Override // ai.au
    public final synchronized void d1(ky kyVar) {
    }

    public final void e() {
        this.f4851w.h().execute(new Runnable(this) { // from class: ai.ch2

            /* renamed from: w  reason: collision with root package name */
            public final hh2 f2830w;

            {
                this.f2830w = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f2830w.i0();
            }
        });
    }

    @Override // ai.au
    public final synchronized boolean e4(as asVar) throws RemoteException {
        rh.p.d("loadAd must be called on the main UI thread.");
        wg.t.d();
        if (yg.d2.k(this.f4852x) && asVar.O == null) {
            uj0.c("Failed to load the ad because app ID is missing.");
            this.B.z(tm2.d(4, null, null));
            return false;
        }
        if (G()) {
            return false;
        }
        this.f4853y = new AtomicBoolean();
        return this.A.a(asVar, this.f4854z, new fh2(this), new gh2(this));
    }

    @Override // xg.q
    public final void f4() {
    }

    @Override // ai.au
    public final synchronized void g() {
        rh.p.d("destroy must be called on the main UI thread.");
        my0 my0Var = this.E;
        if (my0Var != null) {
            my0Var.b();
        }
    }

    @Override // ai.au
    public final yh.a h() {
        return null;
    }

    @Override // ai.au
    public final boolean i() {
        return false;
    }

    public final /* synthetic */ void i0() {
        R5(5);
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
        this.B.f(omVar);
    }

    @Override // ai.au
    public final synchronized void n() {
        rh.p.d("resume must be called on the main UI thread.");
    }

    @Override // ai.au
    public final void n0(boolean z10) {
    }

    @Override // ai.au
    public final synchronized void q() {
    }

    @Override // ai.au
    public final void q1(nt ntVar) {
    }

    @Override // ai.au
    public final synchronized fs r() {
        return null;
    }

    @Override // xg.q
    public final synchronized void s0() {
        if (this.E == null) {
            return;
        }
        this.C = wg.t.k().elapsedRealtime();
        int i10 = this.E.i();
        if (i10 <= 0) {
            return;
        }
        nx0 nx0Var = new nx0(this.f4851w.i(), wg.t.k());
        this.D = nx0Var;
        nx0Var.a(i10, new Runnable(this) { // from class: ai.eh2

            /* renamed from: w  reason: collision with root package name */
            public final hh2 f3671w;

            {
                this.f3671w = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f3671w.e();
            }
        });
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
        R5(3);
    }
}
