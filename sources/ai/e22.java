package ai;

import com.google.android.gms.internal.ads.zzdym;
import com.google.android.gms.internal.ads.zzeeg;
import com.google.android.gms.internal.ads.zzehe;
import com.google.android.gms.internal.ads.zzfaw;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeoutException;

/* loaded from: classes3.dex */
public final class e22 implements e43 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ long f3502a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f3503b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ fl2 f3504c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ kl2 f3505d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ f22 f3506e;

    public e22(f22 f22Var, long j10, String str, fl2 fl2Var, kl2 kl2Var) {
        this.f3506e = f22Var;
        this.f3502a = j10;
        this.f3503b = str;
        this.f3504c = fl2Var;
        this.f3505d = kl2Var;
    }

    @Override // ai.e43
    public final void a(Throwable th2) {
        vh.f fVar;
        int i10;
        boolean z10;
        sr srVar;
        vy1 vy1Var;
        g22 g22Var;
        fVar = this.f3506e.f3895a;
        long elapsedRealtime = fVar.elapsedRealtime() - this.f3502a;
        if (th2 instanceof TimeoutException) {
            i10 = 2;
        } else if (th2 instanceof zzehe) {
            i10 = 3;
        } else if (th2 instanceof CancellationException) {
            i10 = 4;
        } else if (th2 instanceof zzfaw) {
            i10 = 5;
        } else {
            i10 = ((th2 instanceof zzdym) && tm2.a(th2).f9916w == 3) ? 1 : 6;
        }
        f22.f(this.f3506e, this.f3503b, i10, elapsedRealtime, this.f3504c.f4085c0);
        z10 = this.f3506e.f3898d;
        if (z10) {
            g22Var = this.f3506e.f3896b;
            g22Var.a(this.f3505d, this.f3504c, i10, th2 instanceof zzeeg ? (zzeeg) th2 : null, elapsedRealtime);
        }
        if (((Boolean) ft.c().c(ox.X5)).booleanValue()) {
            sr a10 = tm2.a(th2);
            int i11 = a10.f9916w;
            if ((i11 == 3 || i11 == 0) && (srVar = a10.f9919z) != null && !srVar.f9918y.equals("com.google.android.gms.ads")) {
                a10 = tm2.a(new zzeeg(13, a10.f9919z));
            }
            vy1Var = this.f3506e.f3899e;
            vy1Var.c(this.f3504c, elapsedRealtime, a10);
        }
    }

    @Override // ai.e43
    public final void b(Object obj) {
        vh.f fVar;
        boolean z10;
        vy1 vy1Var;
        g22 g22Var;
        fVar = this.f3506e.f3895a;
        long elapsedRealtime = fVar.elapsedRealtime() - this.f3502a;
        f22.f(this.f3506e, this.f3503b, 0, elapsedRealtime, this.f3504c.f4085c0);
        z10 = this.f3506e.f3898d;
        if (z10) {
            g22Var = this.f3506e.f3896b;
            g22Var.a(this.f3505d, this.f3504c, 0, null, elapsedRealtime);
        }
        if (((Boolean) ft.c().c(ox.X5)).booleanValue()) {
            vy1Var = this.f3506e.f3899e;
            vy1Var.c(this.f3504c, elapsedRealtime, null);
        }
    }
}
