package ai;

import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class r12 extends ra0 {

    /* renamed from: w  reason: collision with root package name */
    public final uy1<ya0, n02> f9298w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ t12 f9299x;

    public /* synthetic */ r12(t12 t12Var, uy1 uy1Var, s12 s12Var) {
        this.f9299x = t12Var;
        this.f9298w = uy1Var;
    }

    @Override // ai.sa0
    public final void B(sr srVar) throws RemoteException {
        this.f9298w.f10880c.c4(srVar);
    }

    @Override // ai.sa0
    public final void a5(o90 o90Var) throws RemoteException {
        t12.c(this.f9299x, o90Var);
        this.f9298w.f10880c.g();
    }

    @Override // ai.sa0
    public final void s(String str) throws RemoteException {
        this.f9298w.f10880c.M5(0, str);
    }
}
