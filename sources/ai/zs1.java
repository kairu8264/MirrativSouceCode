package ai;

import android.os.Binder;
import com.google.android.gms.internal.ads.zzeap;
import java.io.InputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class zs1 {

    /* renamed from: a  reason: collision with root package name */
    public final t43 f13102a;

    /* renamed from: b  reason: collision with root package name */
    public final t43 f13103b;

    /* renamed from: c  reason: collision with root package name */
    public final iu1 f13104c;

    /* renamed from: d  reason: collision with root package name */
    public final kn3<cw1> f13105d;

    public zs1(t43 t43Var, t43 t43Var2, iu1 iu1Var, kn3<cw1> kn3Var) {
        this.f13102a = t43Var;
        this.f13103b = t43Var2;
        this.f13104c = iu1Var;
        this.f13105d = kn3Var;
    }

    public final s43<InputStream> a(final ie0 ie0Var) {
        s43 g10;
        String str = ie0Var.f5204z;
        wg.t.d();
        if (yg.d2.f(str)) {
            g10 = j43.c(new zzeap(1));
        } else {
            g10 = j43.g(this.f13102a.h(new Callable(this, ie0Var) { // from class: ai.ws1

                /* renamed from: a  reason: collision with root package name */
                public final zs1 f11741a;

                /* renamed from: b  reason: collision with root package name */
                public final ie0 f11742b;

                {
                    this.f11741a = this;
                    this.f11742b = ie0Var;
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.f11741a.c(this.f11742b);
                }
            }), ExecutionException.class, xs1.f12206a, this.f13103b);
        }
        final int callingUid = Binder.getCallingUid();
        return j43.g(g10, zzeap.class, new p33(this, ie0Var, callingUid) { // from class: ai.ys1

            /* renamed from: a  reason: collision with root package name */
            public final zs1 f12722a;

            /* renamed from: b  reason: collision with root package name */
            public final ie0 f12723b;

            /* renamed from: c  reason: collision with root package name */
            public final int f12724c;

            {
                this.f12722a = this;
                this.f12723b = ie0Var;
                this.f12724c = callingUid;
            }

            @Override // ai.p33
            public final s43 a(Object obj) {
                return this.f12722a.b(this.f12723b, this.f12724c, (zzeap) obj);
            }
        }, this.f13103b);
    }

    public final /* synthetic */ s43 b(ie0 ie0Var, int i10, zzeap zzeapVar) throws Exception {
        return this.f13105d.zzb().R5(ie0Var, i10);
    }

    public final /* synthetic */ InputStream c(ie0 ie0Var) throws Exception {
        mk0<InputStream> mk0Var;
        final iu1 iu1Var = this.f13104c;
        synchronized (iu1Var.f7060x) {
            if (iu1Var.f7061y) {
                mk0Var = iu1Var.f7059w;
            } else {
                iu1Var.f7061y = true;
                iu1Var.A = ie0Var;
                iu1Var.B.o();
                iu1Var.f7059w.c(new Runnable(iu1Var) { // from class: ai.hu1

                    /* renamed from: w  reason: collision with root package name */
                    public final iu1 f5000w;

                    {
                        this.f5000w = iu1Var;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f5000w.a();
                    }
                }, hk0.f4883f);
                mk0Var = iu1Var.f7059w;
            }
        }
        return mk0Var.get(((Integer) ft.c().c(ox.P3)).intValue(), TimeUnit.SECONDS);
    }
}
