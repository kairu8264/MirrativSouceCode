package ai;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.internal.ads.zzcmw;

/* loaded from: classes3.dex */
public final class ts1 implements xg.q, dr0 {
    public boolean A;
    public boolean B;
    public long C;
    public cv D;
    public boolean E;

    /* renamed from: w  reason: collision with root package name */
    public final Context f10455w;

    /* renamed from: x  reason: collision with root package name */
    public final zj0 f10456x;

    /* renamed from: y  reason: collision with root package name */
    public ms1 f10457y;

    /* renamed from: z  reason: collision with root package name */
    public rp0 f10458z;

    public ts1(Context context, zj0 zj0Var) {
        this.f10455w = context;
        this.f10456x = zj0Var;
    }

    @Override // xg.q
    public final void B4() {
    }

    @Override // xg.q
    public final synchronized void D5(int i10) {
        this.f10458z.destroy();
        if (!this.E) {
            yg.p1.k("Inspector closed.");
            cv cvVar = this.D;
            if (cvVar != null) {
                try {
                    cvVar.x0(null);
                } catch (RemoteException unused) {
                }
            }
        }
        this.B = false;
        this.A = false;
        this.C = 0L;
        this.E = false;
        this.D = null;
    }

    public final void a(ms1 ms1Var) {
        this.f10457y = ms1Var;
    }

    @Override // ai.dr0
    public final synchronized void b(boolean z10) {
        if (z10) {
            yg.p1.k("Ad inspector loaded.");
            this.A = true;
            h();
            return;
        }
        uj0.f("Ad inspector failed to load.");
        try {
            cv cvVar = this.D;
            if (cvVar != null) {
                cvVar.x0(tm2.d(17, null, null));
            }
        } catch (RemoteException unused) {
        }
        this.E = true;
        this.f10458z.destroy();
    }

    @Override // xg.q
    public final void c() {
    }

    @Override // xg.q
    public final void d() {
    }

    public final synchronized void e(cv cvVar, s30 s30Var) {
        if (g(cvVar)) {
            try {
                wg.t.e();
                rp0 a10 = cq0.a(this.f10455w, ir0.b(), "", false, false, null, null, this.f10456x, null, null, null, qn.a(), null, null);
                this.f10458z = a10;
                fr0 i02 = a10.i0();
                if (i02 == null) {
                    uj0.f("Failed to obtain a web view for the ad inspector");
                    try {
                        cvVar.x0(tm2.d(17, "Failed to obtain a web view for the ad inspector", null));
                        return;
                    } catch (RemoteException unused) {
                        return;
                    }
                }
                this.D = cvVar;
                i02.L0(null, null, null, null, null, false, null, null, null, null, null, null, null, null, s30Var, null);
                i02.b1(this);
                this.f10458z.loadUrl((String) ft.c().c(ox.f8075q6));
                wg.t.c();
                xg.o.a(this.f10455w, new AdOverlayInfoParcel(this, this.f10458z, 1, this.f10456x), true);
                this.C = wg.t.k().currentTimeMillis();
            } catch (zzcmw e10) {
                uj0.g("Failed to obtain a web view for the ad inspector", e10);
                try {
                    cvVar.x0(tm2.d(17, "Failed to obtain a web view for the ad inspector", null));
                } catch (RemoteException unused2) {
                }
            }
        }
    }

    public final /* synthetic */ void f() {
        this.f10458z.B("window.inspectorInfo", this.f10457y.m().toString());
    }

    @Override // xg.q
    public final void f4() {
    }

    public final synchronized boolean g(cv cvVar) {
        if (!((Boolean) ft.c().c(ox.f8067p6)).booleanValue()) {
            uj0.f("Ad inspector had an internal error.");
            try {
                cvVar.x0(tm2.d(16, null, null));
            } catch (RemoteException unused) {
            }
            return false;
        } else if (this.f10457y == null) {
            uj0.f("Ad inspector had an internal error.");
            try {
                cvVar.x0(tm2.d(16, null, null));
            } catch (RemoteException unused2) {
            }
            return false;
        } else {
            if (!this.A && !this.B) {
                if (wg.t.k().currentTimeMillis() >= this.C + ((Integer) ft.c().c(ox.f8091s6)).intValue()) {
                    return true;
                }
            }
            uj0.f("Ad inspector cannot be opened because it is already open.");
            try {
                cvVar.x0(tm2.d(19, null, null));
            } catch (RemoteException unused3) {
            }
            return false;
        }
    }

    public final synchronized void h() {
        if (this.A && this.B) {
            hk0.f4882e.execute(new Runnable(this) { // from class: ai.ss1

                /* renamed from: w  reason: collision with root package name */
                public final ts1 f9988w;

                {
                    this.f9988w = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.f9988w.f();
                }
            });
        }
    }

    @Override // xg.q
    public final synchronized void s0() {
        this.B = true;
        h();
    }
}
