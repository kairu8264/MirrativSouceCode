package ai;

import android.content.Context;

/* loaded from: classes3.dex */
public final class br1 implements pq1 {

    /* renamed from: a  reason: collision with root package name */
    public final long f2445a;

    /* renamed from: b  reason: collision with root package name */
    public final j62 f2446b;

    public br1(long j10, Context context, uq1 uq1Var, or0 or0Var, String str) {
        this.f2445a = j10;
        jj2 t10 = or0Var.t();
        t10.b(context);
        t10.a(new fs());
        t10.A(str);
        j62 zza = t10.zza().zza();
        this.f2446b = zza;
        zza.q1(new ar1(this, uq1Var));
    }

    @Override // ai.pq1
    public final void a(as asVar) {
        this.f2446b.e4(asVar);
    }

    @Override // ai.pq1
    public final void b() {
        this.f2446b.g();
    }

    @Override // ai.pq1
    public final void zzb() {
        this.f2446b.E3(yh.b.h1(null));
    }
}
