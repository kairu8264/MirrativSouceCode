package ai;

import com.dena.mirrorman.clientlog.logs.MRLog;

/* loaded from: classes3.dex */
public final class sr1 extends g50 {
    public final /* synthetic */ tr1 A;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ Object f9921w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ String f9922x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ long f9923y;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ mk0 f9924z;

    public sr1(tr1 tr1Var, Object obj, String str, long j10, mk0 mk0Var) {
        this.A = tr1Var;
        this.f9921w = obj;
        this.f9922x = str;
        this.f9923y = j10;
        this.f9924z = mk0Var;
    }

    @Override // ai.h50
    public final void c() {
        yp1 yp1Var;
        rb1 rb1Var;
        synchronized (this.f9921w) {
            this.A.u(this.f9922x, true, "", (int) (wg.t.k().elapsedRealtime() - this.f9923y));
            yp1Var = this.A.f10396l;
            yp1Var.b(this.f9922x);
            rb1Var = this.A.f10399o;
            rb1Var.t(this.f9922x);
            this.f9924z.d(Boolean.TRUE);
        }
    }

    @Override // ai.h50
    public final void s(String str) {
        yp1 yp1Var;
        rb1 rb1Var;
        synchronized (this.f9921w) {
            this.A.u(this.f9922x, false, str, (int) (wg.t.k().elapsedRealtime() - this.f9923y));
            yp1Var = this.A.f10396l;
            yp1Var.c(this.f9922x, MRLog.PAYLOAD_KEY_ERROR);
            rb1Var = this.A.f10399o;
            rb1Var.l0(this.f9922x, MRLog.PAYLOAD_KEY_ERROR);
            this.f9924z.d(Boolean.FALSE);
        }
    }
}
