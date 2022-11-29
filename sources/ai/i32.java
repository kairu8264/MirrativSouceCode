package ai;

import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class i32 extends jf0 {

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ c71 f5109w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ t41 f5110x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ d61 f5111y;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ wc1 f5112z;

    public i32(j32 j32Var, c71 c71Var, t41 t41Var, d61 d61Var, wc1 wc1Var) {
        this.f5109w = c71Var;
        this.f5110x = t41Var;
        this.f5111y = d61Var;
        this.f5112z = wc1Var;
    }

    @Override // ai.kf0
    public final void L(yh.a aVar) {
    }

    @Override // ai.kf0
    public final void L4(yh.a aVar) throws RemoteException {
        this.f5111y.a();
    }

    @Override // ai.kf0
    public final void N2(yh.a aVar, lf0 lf0Var) {
        this.f5112z.p0(lf0Var);
    }

    @Override // ai.kf0
    public final void P(yh.a aVar) {
    }

    @Override // ai.kf0
    public final void S4(yh.a aVar, int i10) {
    }

    @Override // ai.kf0
    public final void X(yh.a aVar) {
        this.f5112z.zza();
    }

    @Override // ai.kf0
    public final void e0(yh.a aVar) {
        this.f5109w.D5(4);
    }

    @Override // ai.kf0
    public final void h0(yh.a aVar) {
        this.f5111y.zzb();
    }

    @Override // ai.kf0
    public final void k3(yh.a aVar) {
        this.f5109w.s0();
    }

    @Override // ai.kf0
    public final void u0(yh.a aVar, int i10) {
    }

    @Override // ai.kf0
    public final void z4(yh.a aVar) {
        this.f5110x.onAdClicked();
    }
}
