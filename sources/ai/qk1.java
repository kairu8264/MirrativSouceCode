package ai;

import android.os.Bundle;
import android.os.RemoteException;
import java.util.List;

/* loaded from: classes3.dex */
public final class qk1 extends w00 {

    /* renamed from: w  reason: collision with root package name */
    public final String f8993w;

    /* renamed from: x  reason: collision with root package name */
    public final jg1 f8994x;

    /* renamed from: y  reason: collision with root package name */
    public final og1 f8995y;

    public qk1(String str, jg1 jg1Var, og1 og1Var) {
        this.f8993w = str;
        this.f8994x = jg1Var;
        this.f8995y = og1Var;
    }

    @Override // ai.x00
    public final void T(Bundle bundle) throws RemoteException {
        this.f8994x.C(bundle);
    }

    @Override // ai.x00
    public final m00 a() throws RemoteException {
        return this.f8995y.n();
    }

    @Override // ai.x00
    public final String b() throws RemoteException {
        return this.f8995y.h0();
    }

    @Override // ai.x00
    public final String c() throws RemoteException {
        return this.f8995y.e();
    }

    @Override // ai.x00
    public final List<?> d() throws RemoteException {
        return this.f8995y.a();
    }

    @Override // ai.x00
    public final double e() throws RemoteException {
        return this.f8995y.m();
    }

    @Override // ai.x00
    public final String f() throws RemoteException {
        return this.f8995y.g();
    }

    @Override // ai.x00
    public final String g() throws RemoteException {
        return this.f8995y.l();
    }

    @Override // ai.x00
    public final String h() throws RemoteException {
        return this.f8995y.k();
    }

    @Override // ai.x00
    public final Bundle i() throws RemoteException {
        return this.f8995y.f();
    }

    @Override // ai.x00
    public final void j() throws RemoteException {
        this.f8994x.b();
    }

    @Override // ai.x00
    public final void j0(Bundle bundle) throws RemoteException {
        this.f8994x.E(bundle);
    }

    @Override // ai.x00
    public final pv k() throws RemoteException {
        return this.f8995y.e0();
    }

    @Override // ai.x00
    public final e00 l() throws RemoteException {
        return this.f8995y.f0();
    }

    @Override // ai.x00
    public final boolean l0(Bundle bundle) throws RemoteException {
        return this.f8994x.D(bundle);
    }

    @Override // ai.x00
    public final String q() throws RemoteException {
        return this.f8993w;
    }

    @Override // ai.x00
    public final yh.a w() throws RemoteException {
        return this.f8995y.j();
    }

    @Override // ai.x00
    public final yh.a zzb() throws RemoteException {
        return yh.b.h1(this.f8994x);
    }
}
