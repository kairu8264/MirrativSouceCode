package ai;

import android.os.RemoteException;
import android.view.View;

/* loaded from: classes3.dex */
public final class a02 extends la0 {

    /* renamed from: w  reason: collision with root package name */
    public final uy1<ya0, n02> f1659w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ c02 f1660x;

    public /* synthetic */ a02(c02 c02Var, uy1 uy1Var, b02 b02Var) {
        this.f1660x = c02Var;
        this.f1659w = uy1Var;
    }

    @Override // ai.ma0
    public final void B(sr srVar) throws RemoteException {
        this.f1659w.f10880c.c4(srVar);
    }

    @Override // ai.ma0
    public final void L(yh.a aVar) throws RemoteException {
        c02.c(this.f1660x, (View) yh.b.z0(aVar));
        this.f1659w.f10880c.g();
    }

    @Override // ai.ma0
    public final void X3(i90 i90Var) throws RemoteException {
        c02.d(this.f1660x, i90Var);
        this.f1659w.f10880c.g();
    }

    @Override // ai.ma0
    public final void s(String str) throws RemoteException {
        this.f1659w.f10880c.M5(0, str);
    }
}
