package ai;

import android.os.Bundle;
import android.os.RemoteException;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class xk1 extends f20 {

    /* renamed from: w  reason: collision with root package name */
    public final String f11971w;

    /* renamed from: x  reason: collision with root package name */
    public final jg1 f11972x;

    /* renamed from: y  reason: collision with root package name */
    public final og1 f11973y;

    public xk1(String str, jg1 jg1Var, og1 og1Var) {
        this.f11971w = str;
        this.f11972x = jg1Var;
        this.f11973y = og1Var;
    }

    @Override // ai.g20
    public final yh.a C() throws RemoteException {
        return this.f11973y.j();
    }

    @Override // ai.g20
    public final j00 D() throws RemoteException {
        return this.f11972x.p().a();
    }

    @Override // ai.g20
    public final lv G() throws RemoteException {
        if (((Boolean) ft.c().c(ox.f7952b5)).booleanValue()) {
            return this.f11972x.d();
        }
        return null;
    }

    @Override // ai.g20
    public final boolean I() {
        return this.f11972x.h();
    }

    @Override // ai.g20
    public final Bundle J() throws RemoteException {
        return this.f11973y.f();
    }

    @Override // ai.g20
    public final void J4(Bundle bundle) throws RemoteException {
        this.f11972x.E(bundle);
    }

    @Override // ai.g20
    public final void K() {
        this.f11972x.R();
    }

    @Override // ai.g20
    public final void M() {
        this.f11972x.g();
    }

    @Override // ai.g20
    public final void O5(yu yuVar) throws RemoteException {
        this.f11972x.P(yuVar);
    }

    @Override // ai.g20
    public final void P5(iv ivVar) throws RemoteException {
        this.f11972x.q(ivVar);
    }

    @Override // ai.g20
    public final void T0(d20 d20Var) throws RemoteException {
        this.f11972x.N(d20Var);
    }

    @Override // ai.g20
    public final void T4(vu vuVar) throws RemoteException {
        this.f11972x.Q(vuVar);
    }

    @Override // ai.g20
    public final boolean Y4(Bundle bundle) throws RemoteException {
        return this.f11972x.D(bundle);
    }

    @Override // ai.g20
    public final List<?> a() throws RemoteException {
        return this.f11973y.a();
    }

    @Override // ai.g20
    public final String c() throws RemoteException {
        return this.f11973y.h0();
    }

    @Override // ai.g20
    public final m00 e() throws RemoteException {
        return this.f11973y.n();
    }

    @Override // ai.g20
    public final String f() throws RemoteException {
        return this.f11973y.e();
    }

    @Override // ai.g20
    public final String g() throws RemoteException {
        return this.f11973y.o();
    }

    @Override // ai.g20
    public final String h() throws RemoteException {
        return this.f11973y.g();
    }

    @Override // ai.g20
    public final double i() throws RemoteException {
        return this.f11973y.m();
    }

    @Override // ai.g20
    public final String j() throws RemoteException {
        return this.f11973y.k();
    }

    @Override // ai.g20
    public final String k() throws RemoteException {
        return this.f11973y.l();
    }

    @Override // ai.g20
    public final e00 l() throws RemoteException {
        return this.f11973y.f0();
    }

    @Override // ai.g20
    public final pv n() throws RemoteException {
        return this.f11973y.e0();
    }

    @Override // ai.g20
    public final String o() throws RemoteException {
        return this.f11971w;
    }

    @Override // ai.g20
    public final void o5(Bundle bundle) throws RemoteException {
        this.f11972x.C(bundle);
    }

    @Override // ai.g20
    public final void p() throws RemoteException {
        this.f11972x.b();
    }

    @Override // ai.g20
    public final yh.a r() throws RemoteException {
        return yh.b.h1(this.f11972x);
    }

    @Override // ai.g20
    public final List<?> u() throws RemoteException {
        if (y()) {
            return this.f11973y.c();
        }
        return Collections.emptyList();
    }

    @Override // ai.g20
    public final boolean y() throws RemoteException {
        return (this.f11973y.c().isEmpty() || this.f11973y.d() == null) ? false : true;
    }

    @Override // ai.g20
    public final void z() throws RemoteException {
        this.f11972x.O();
    }
}
