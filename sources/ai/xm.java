package ai;

import android.content.Context;
import android.os.Binder;
import android.os.RemoteException;
import rh.c;

/* loaded from: classes3.dex */
public final class xm {

    /* renamed from: a  reason: collision with root package name */
    public final Runnable f11989a = new tm(this);

    /* renamed from: b  reason: collision with root package name */
    public final Object f11990b = new Object();

    /* renamed from: c  reason: collision with root package name */
    public an f11991c;

    /* renamed from: d  reason: collision with root package name */
    public Context f11992d;

    /* renamed from: e  reason: collision with root package name */
    public dn f11993e;

    public static /* synthetic */ void j(xm xmVar) {
        synchronized (xmVar.f11990b) {
            an anVar = xmVar.f11991c;
            if (anVar == null) {
                return;
            }
            if (anVar.isConnected() || xmVar.f11991c.b()) {
                xmVar.f11991c.disconnect();
            }
            xmVar.f11991c = null;
            xmVar.f11993e = null;
            Binder.flushPendingCommands();
        }
    }

    public final void d(Context context) {
        if (context == null) {
            return;
        }
        synchronized (this.f11990b) {
            if (this.f11992d != null) {
                return;
            }
            this.f11992d = context.getApplicationContext();
            if (((Boolean) ft.c().c(ox.E2)).booleanValue()) {
                l();
            } else {
                if (((Boolean) ft.c().c(ox.D2)).booleanValue()) {
                    wg.t.g().b(new um(this));
                }
            }
        }
    }

    public final void e() {
        if (((Boolean) ft.c().c(ox.F2)).booleanValue()) {
            synchronized (this.f11990b) {
                l();
                ow2 ow2Var = yg.d2.f61866i;
                ow2Var.removeCallbacks(this.f11989a);
                ow2Var.postDelayed(this.f11989a, ((Long) ft.c().c(ox.G2)).longValue());
            }
        }
    }

    public final ym f(bn bnVar) {
        synchronized (this.f11990b) {
            if (this.f11993e == null) {
                return new ym();
            }
            try {
                if (this.f11991c.h0()) {
                    return this.f11993e.f4(bnVar);
                }
                return this.f11993e.M1(bnVar);
            } catch (RemoteException e10) {
                uj0.d("Unable to call into cache service.", e10);
                return new ym();
            }
        }
    }

    public final long g(bn bnVar) {
        synchronized (this.f11990b) {
            if (this.f11993e == null) {
                return -2L;
            }
            if (this.f11991c.h0()) {
                try {
                    return this.f11993e.B4(bnVar);
                } catch (RemoteException e10) {
                    uj0.d("Unable to call into cache service.", e10);
                }
            }
            return -2L;
        }
    }

    public final synchronized an i(c.a aVar, c.b bVar) {
        return new an(this.f11992d, wg.t.r().a(), aVar, bVar);
    }

    public final void l() {
        synchronized (this.f11990b) {
            if (this.f11992d != null && this.f11991c == null) {
                an i10 = i(new vm(this), new wm(this));
                this.f11991c = i10;
                i10.o();
            }
        }
    }
}
