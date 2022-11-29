package ai;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class o80 extends jr0 {

    /* renamed from: w  reason: collision with root package name */
    public final oi.a f7683w;

    public o80(oi.a aVar) {
        this.f7683w = aVar;
    }

    @Override // ai.kr0
    public final Bundle E0(Bundle bundle) throws RemoteException {
        return this.f7683w.p(bundle);
    }

    @Override // ai.kr0
    public final void E2(String str, String str2, yh.a aVar) throws RemoteException {
        this.f7683w.u(str, str2, aVar != null ? yh.b.z0(aVar) : null);
    }

    @Override // ai.kr0
    public final void F0(Bundle bundle) throws RemoteException {
        this.f7683w.o(bundle);
    }

    @Override // ai.kr0
    public final void H4(yh.a aVar, String str, String str2) throws RemoteException {
        this.f7683w.t(aVar != null ? (Activity) yh.b.z0(aVar) : null, str, str2);
    }

    @Override // ai.kr0
    public final int R(String str) throws RemoteException {
        return this.f7683w.l(str);
    }

    @Override // ai.kr0
    public final void S0(String str, String str2, Bundle bundle) throws RemoteException {
        this.f7683w.n(str, str2, bundle);
    }

    @Override // ai.kr0
    public final void a0(Bundle bundle) throws RemoteException {
        this.f7683w.r(bundle);
    }

    @Override // ai.kr0
    public final List f2(String str, String str2) throws RemoteException {
        return this.f7683w.g(str, str2);
    }

    @Override // ai.kr0
    public final String i() throws RemoteException {
        return this.f7683w.f();
    }

    @Override // ai.kr0
    public final String j() throws RemoteException {
        return this.f7683w.j();
    }

    @Override // ai.kr0
    public final void j0(Bundle bundle) throws RemoteException {
        this.f7683w.s(bundle);
    }

    @Override // ai.kr0
    public final long k() throws RemoteException {
        return this.f7683w.d();
    }

    @Override // ai.kr0
    public final String m() throws RemoteException {
        return this.f7683w.e();
    }

    @Override // ai.kr0
    public final void o0(String str) throws RemoteException {
        this.f7683w.a(str);
    }

    @Override // ai.kr0
    public final String q() throws RemoteException {
        return this.f7683w.h();
    }

    @Override // ai.kr0
    public final void r0(String str) throws RemoteException {
        this.f7683w.c(str);
    }

    @Override // ai.kr0
    public final void t4(String str, String str2, Bundle bundle) throws RemoteException {
        this.f7683w.b(str, str2, bundle);
    }

    @Override // ai.kr0
    public final Map v2(String str, String str2, boolean z10) throws RemoteException {
        return this.f7683w.m(str, str2, z10);
    }

    @Override // ai.kr0
    public final String w() throws RemoteException {
        return this.f7683w.i();
    }
}
