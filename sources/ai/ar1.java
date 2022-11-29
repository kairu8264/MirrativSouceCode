package ai;

import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class ar1 extends lt {

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ uq1 f1978w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ br1 f1979x;

    public ar1(br1 br1Var, uq1 uq1Var) {
        this.f1979x = br1Var;
        this.f1978w = uq1Var;
    }

    @Override // ai.nt
    public final void F(int i10) throws RemoteException {
        long j10;
        uq1 uq1Var = this.f1978w;
        j10 = this.f1979x.f2445a;
        uq1Var.f(j10, i10);
    }

    @Override // ai.nt
    public final void Z(sr srVar) throws RemoteException {
        long j10;
        uq1 uq1Var = this.f1978w;
        j10 = this.f1979x.f2445a;
        uq1Var.f(j10, srVar.f9916w);
    }

    @Override // ai.nt
    public final void a() throws RemoteException {
        long j10;
        uq1 uq1Var = this.f1978w;
        j10 = this.f1979x.f2445a;
        uq1Var.e(j10);
    }

    @Override // ai.nt
    public final void c() {
    }

    @Override // ai.nt
    public final void e() throws RemoteException {
        long j10;
        uq1 uq1Var = this.f1978w;
        j10 = this.f1979x.f2445a;
        uq1Var.h(j10);
    }

    @Override // ai.nt
    public final void f() throws RemoteException {
        long j10;
        uq1 uq1Var = this.f1978w;
        j10 = this.f1979x.f2445a;
        uq1Var.g(j10);
    }

    @Override // ai.nt
    public final void h() {
    }

    @Override // ai.nt
    public final void zzb() throws RemoteException {
        long j10;
        uq1 uq1Var = this.f1978w;
        j10 = this.f1979x.f2445a;
        uq1Var.i(j10);
    }
}
