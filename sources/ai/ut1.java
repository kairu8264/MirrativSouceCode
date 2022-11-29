package ai;

import android.os.Binder;
import com.google.android.gms.internal.ads.zzeap;
import java.io.InputStream;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class ut1 {

    /* renamed from: a  reason: collision with root package name */
    public final ScheduledExecutorService f10838a;

    /* renamed from: b  reason: collision with root package name */
    public final t43 f10839b;

    /* renamed from: c  reason: collision with root package name */
    public final ou1 f10840c;

    /* renamed from: d  reason: collision with root package name */
    public final kn3<cw1> f10841d;

    public ut1(ScheduledExecutorService scheduledExecutorService, t43 t43Var, ou1 ou1Var, kn3<cw1> kn3Var) {
        this.f10838a = scheduledExecutorService;
        this.f10839b = t43Var;
        this.f10840c = ou1Var;
        this.f10841d = kn3Var;
    }

    public final s43<InputStream> a(final ie0 ie0Var) {
        s43 s43Var;
        String str = ie0Var.f5204z;
        wg.t.d();
        if (yg.d2.f(str)) {
            s43Var = j43.c(new zzeap(1));
        } else {
            final ou1 ou1Var = this.f10840c;
            synchronized (ou1Var.f7060x) {
                if (ou1Var.f7061y) {
                    s43Var = ou1Var.f7059w;
                } else {
                    ou1Var.f7061y = true;
                    ou1Var.A = ie0Var;
                    ou1Var.B.o();
                    ou1Var.f7059w.c(new Runnable(ou1Var) { // from class: ai.nu1

                        /* renamed from: w  reason: collision with root package name */
                        public final ou1 f7532w;

                        {
                            this.f7532w = ou1Var;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f7532w.a();
                        }
                    }, hk0.f4883f);
                    s43Var = ou1Var.f7059w;
                }
            }
        }
        final int callingUid = Binder.getCallingUid();
        return j43.g((z33) j43.h(z33.E(s43Var), ((Integer) ft.c().c(ox.P3)).intValue(), TimeUnit.SECONDS, this.f10838a), Throwable.class, new p33(this, ie0Var, callingUid) { // from class: ai.tt1

            /* renamed from: a  reason: collision with root package name */
            public final ut1 f10464a;

            /* renamed from: b  reason: collision with root package name */
            public final ie0 f10465b;

            /* renamed from: c  reason: collision with root package name */
            public final int f10466c;

            {
                this.f10464a = this;
                this.f10465b = ie0Var;
                this.f10466c = callingUid;
            }

            @Override // ai.p33
            public final s43 a(Object obj) {
                return this.f10464a.b(this.f10465b, this.f10466c, (Throwable) obj);
            }
        }, this.f10839b);
    }

    public final /* synthetic */ s43 b(ie0 ie0Var, int i10, Throwable th2) throws Exception {
        return this.f10841d.zzb().U5(ie0Var, i10);
    }
}
