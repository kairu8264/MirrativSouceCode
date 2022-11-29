package ai;

import android.os.RemoteException;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class o02 extends jf0 implements g61 {

    /* renamed from: w  reason: collision with root package name */
    public kf0 f7594w;

    /* renamed from: x  reason: collision with root package name */
    public f61 f7595x;

    /* renamed from: y  reason: collision with root package name */
    public yc1 f7596y;

    @Override // ai.kf0
    public final synchronized void L(yh.a aVar) throws RemoteException {
        Executor executor;
        yc1 yc1Var = this.f7596y;
        if (yc1Var != null) {
            executor = ((h32) yc1Var).f4727d.f5610b;
            final sl2 sl2Var = ((h32) yc1Var).f4724a;
            final fl2 fl2Var = ((h32) yc1Var).f4725b;
            final uy1 uy1Var = ((h32) yc1Var).f4726c;
            final h32 h32Var = (h32) yc1Var;
            executor.execute(new Runnable(h32Var, sl2Var, fl2Var, uy1Var) { // from class: ai.g32

                /* renamed from: w  reason: collision with root package name */
                public final h32 f4319w;

                /* renamed from: x  reason: collision with root package name */
                public final sl2 f4320x;

                /* renamed from: y  reason: collision with root package name */
                public final fl2 f4321y;

                /* renamed from: z  reason: collision with root package name */
                public final uy1 f4322z;

                {
                    this.f4319w = h32Var;
                    this.f4320x = sl2Var;
                    this.f4321y = fl2Var;
                    this.f4322z = uy1Var;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    h32 h32Var2 = this.f4319w;
                    sl2 sl2Var2 = this.f4320x;
                    fl2 fl2Var2 = this.f4321y;
                    uy1 uy1Var2 = this.f4322z;
                    j32 j32Var = h32Var2.f4727d;
                    j32.e(sl2Var2, fl2Var2, uy1Var2);
                }
            });
        }
    }

    @Override // ai.kf0
    public final synchronized void L4(yh.a aVar) throws RemoteException {
        kf0 kf0Var = this.f7594w;
        if (kf0Var != null) {
            ((i32) kf0Var).f5111y.a();
        }
    }

    @Override // ai.g61
    public final synchronized void M1(f61 f61Var) {
        this.f7595x = f61Var;
    }

    @Override // ai.kf0
    public final synchronized void N2(yh.a aVar, lf0 lf0Var) throws RemoteException {
        kf0 kf0Var = this.f7594w;
        if (kf0Var != null) {
            ((i32) kf0Var).f5112z.p0(lf0Var);
        }
    }

    @Override // ai.kf0
    public final synchronized void P(yh.a aVar) throws RemoteException {
        f61 f61Var = this.f7595x;
        if (f61Var != null) {
            f61Var.zza();
        }
    }

    @Override // ai.kf0
    public final synchronized void S4(yh.a aVar, int i10) throws RemoteException {
        f61 f61Var = this.f7595x;
        if (f61Var != null) {
            f61Var.a(i10);
        }
    }

    public final synchronized void S5(kf0 kf0Var) {
        this.f7594w = kf0Var;
    }

    public final synchronized void T5(yc1 yc1Var) {
        this.f7596y = yc1Var;
    }

    @Override // ai.kf0
    public final synchronized void X(yh.a aVar) throws RemoteException {
        kf0 kf0Var = this.f7594w;
        if (kf0Var != null) {
            ((i32) kf0Var).f5112z.zza();
        }
    }

    @Override // ai.kf0
    public final synchronized void e0(yh.a aVar) throws RemoteException {
        kf0 kf0Var = this.f7594w;
        if (kf0Var != null) {
            kf0Var.e0(aVar);
        }
    }

    @Override // ai.kf0
    public final synchronized void h0(yh.a aVar) throws RemoteException {
        kf0 kf0Var = this.f7594w;
        if (kf0Var != null) {
            ((i32) kf0Var).f5111y.zzb();
        }
    }

    @Override // ai.kf0
    public final synchronized void k3(yh.a aVar) throws RemoteException {
        kf0 kf0Var = this.f7594w;
        if (kf0Var != null) {
            ((i32) kf0Var).f5109w.s0();
        }
    }

    @Override // ai.kf0
    public final synchronized void u0(yh.a aVar, int i10) throws RemoteException {
        yc1 yc1Var = this.f7596y;
        if (yc1Var != null) {
            String valueOf = String.valueOf(((h32) yc1Var).f4726c.f10878a);
            uj0.f(valueOf.length() != 0 ? "Fail to initialize adapter ".concat(valueOf) : new String("Fail to initialize adapter "));
        }
    }

    @Override // ai.kf0
    public final synchronized void z4(yh.a aVar) throws RemoteException {
        kf0 kf0Var = this.f7594w;
        if (kf0Var != null) {
            ((i32) kf0Var).f5110x.onAdClicked();
        }
    }
}
