package ai;

import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class rr1 implements e43<String> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ tr1 f9541a;

    public rr1(tr1 tr1Var) {
        this.f9541a = tr1Var;
    }

    @Override // ai.e43
    public final void a(Throwable th2) {
        long j10;
        mk0 mk0Var;
        synchronized (this) {
            this.f9541a.f10387c = true;
            tr1 tr1Var = this.f9541a;
            long elapsedRealtime = wg.t.k().elapsedRealtime();
            j10 = this.f9541a.f10388d;
            tr1Var.u("com.google.android.gms.ads.MobileAds", false, "Internal Error.", (int) (elapsedRealtime - j10));
            mk0Var = this.f9541a.f10389e;
            mk0Var.e(new Exception());
        }
    }

    @Override // ai.e43
    public final /* bridge */ /* synthetic */ void b(String str) {
        long j10;
        Executor executor;
        final String str2 = str;
        synchronized (this) {
            this.f9541a.f10387c = true;
            tr1 tr1Var = this.f9541a;
            long elapsedRealtime = wg.t.k().elapsedRealtime();
            j10 = this.f9541a.f10388d;
            tr1Var.u("com.google.android.gms.ads.MobileAds", true, "", (int) (elapsedRealtime - j10));
            executor = this.f9541a.f10393i;
            executor.execute(new Runnable(this, str2) { // from class: ai.qr1

                /* renamed from: w  reason: collision with root package name */
                public final rr1 f9066w;

                /* renamed from: x  reason: collision with root package name */
                public final String f9067x;

                {
                    this.f9066w = this;
                    this.f9067x = str2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    rr1 rr1Var = this.f9066w;
                    tr1.k(rr1Var.f9541a, this.f9067x);
                }
            });
        }
    }
}
