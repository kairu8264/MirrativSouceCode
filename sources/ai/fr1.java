package ai;

import android.content.Context;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class fr1 implements pq1 {

    /* renamed from: a  reason: collision with root package name */
    public final long f4167a;

    /* renamed from: b  reason: collision with root package name */
    public final String f4168b;

    /* renamed from: c  reason: collision with root package name */
    public final uq1 f4169c;

    /* renamed from: d  reason: collision with root package name */
    public final wk2 f4170d;

    public fr1(long j10, Context context, uq1 uq1Var, or0 or0Var, String str) {
        this.f4167a = j10;
        this.f4168b = str;
        this.f4169c = uq1Var;
        yk2 w10 = or0Var.w();
        w10.a(context);
        w10.t(str);
        this.f4170d = w10.zza().zzb();
    }

    @Override // ai.pq1
    public final void a(as asVar) {
        try {
            this.f4170d.t5(asVar, new dr1(this));
        } catch (RemoteException e10) {
            uj0.i("#007 Could not call remote method.", e10);
        }
    }

    @Override // ai.pq1
    public final void b() {
    }

    @Override // ai.pq1
    public final void zzb() {
        try {
            this.f4170d.o4(new er1(this));
            this.f4170d.S(yh.b.h1(null));
        } catch (RemoteException e10) {
            uj0.i("#007 Could not call remote method.", e10);
        }
    }
}
