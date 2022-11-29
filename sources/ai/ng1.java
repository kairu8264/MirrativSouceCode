package ai;

import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class ng1 extends ov {

    /* renamed from: w  reason: collision with root package name */
    public final Object f7324w = new Object();

    /* renamed from: x  reason: collision with root package name */
    public final pv f7325x;

    /* renamed from: y  reason: collision with root package name */
    public final o90 f7326y;

    public ng1(pv pvVar, o90 o90Var) {
        this.f7325x = pvVar;
        this.f7326y = o90Var;
    }

    @Override // ai.pv
    public final void a() throws RemoteException {
        throw new RemoteException();
    }

    @Override // ai.pv
    public final void b0(boolean z10) throws RemoteException {
        throw new RemoteException();
    }

    @Override // ai.pv
    public final void c() throws RemoteException {
        throw new RemoteException();
    }

    @Override // ai.pv
    public final boolean e() throws RemoteException {
        throw new RemoteException();
    }

    @Override // ai.pv
    public final float g() throws RemoteException {
        o90 o90Var = this.f7326y;
        if (o90Var != null) {
            return o90Var.y();
        }
        return 0.0f;
    }

    @Override // ai.pv
    public final int h() throws RemoteException {
        throw new RemoteException();
    }

    @Override // ai.pv
    public final float i() throws RemoteException {
        o90 o90Var = this.f7326y;
        if (o90Var != null) {
            return o90Var.O();
        }
        return 0.0f;
    }

    @Override // ai.pv
    public final float k() throws RemoteException {
        throw new RemoteException();
    }

    @Override // ai.pv
    public final void l() throws RemoteException {
        throw new RemoteException();
    }

    @Override // ai.pv
    public final boolean n() throws RemoteException {
        throw new RemoteException();
    }

    @Override // ai.pv
    public final void n5(sv svVar) throws RemoteException {
        synchronized (this.f7324w) {
            pv pvVar = this.f7325x;
            if (pvVar != null) {
                pvVar.n5(svVar);
            }
        }
    }

    @Override // ai.pv
    public final sv o() throws RemoteException {
        synchronized (this.f7324w) {
            pv pvVar = this.f7325x;
            if (pvVar != null) {
                return pvVar.o();
            }
            return null;
        }
    }

    @Override // ai.pv
    public final boolean p() throws RemoteException {
        throw new RemoteException();
    }
}
