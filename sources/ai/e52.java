package ai;

import android.content.Context;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class e52 extends st {

    /* renamed from: w  reason: collision with root package name */
    public final m62 f3541w;

    public e52(Context context, or0 or0Var, wl2 wl2Var, zg1 zg1Var, nt ntVar) {
        o62 o62Var = new o62(zg1Var, or0Var.g());
        o62Var.a(ntVar);
        this.f3541w = new m62(new z62(or0Var, context, o62Var, wl2Var), wl2Var.M());
    }

    @Override // ai.tt
    public final void S1(as asVar) throws RemoteException {
        this.f3541w.c(asVar, 1);
    }

    @Override // ai.tt
    public final synchronized String a() {
        return this.f3541w.d();
    }

    @Override // ai.tt
    public final synchronized String e() {
        return this.f3541w.e();
    }

    @Override // ai.tt
    public final synchronized boolean f() throws RemoteException {
        return this.f3541w.b();
    }

    @Override // ai.tt
    public final synchronized void x1(as asVar, int i10) throws RemoteException {
        this.f3541w.c(asVar, i10);
    }
}
