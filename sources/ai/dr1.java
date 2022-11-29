package ai;

import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class dr1 extends yf0 {

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ fr1 f3376w;

    public dr1(fr1 fr1Var) {
        this.f3376w = fr1Var;
    }

    @Override // ai.zf0
    public final void B(sr srVar) throws RemoteException {
        uq1 uq1Var;
        long j10;
        uq1Var = this.f3376w.f4169c;
        j10 = this.f3376w.f4167a;
        uq1Var.l(j10, srVar.f9916w);
    }

    @Override // ai.zf0
    public final void E(int i10) throws RemoteException {
        uq1 uq1Var;
        long j10;
        uq1Var = this.f3376w.f4169c;
        j10 = this.f3376w.f4167a;
        uq1Var.l(j10, i10);
    }

    @Override // ai.zf0
    public final void c() throws RemoteException {
        uq1 uq1Var;
        long j10;
        uq1Var = this.f3376w.f4169c;
        j10 = this.f3376w.f4167a;
        uq1Var.k(j10);
    }
}
