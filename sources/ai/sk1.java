package ai;

import android.os.Bundle;
import android.os.RemoteException;
import java.util.List;

/* loaded from: classes3.dex */
public final class sk1 extends y00 {

    /* renamed from: w  reason: collision with root package name */
    public final String f9852w;

    /* renamed from: x  reason: collision with root package name */
    public final jg1 f9853x;

    /* renamed from: y  reason: collision with root package name */
    public final og1 f9854y;

    public sk1(String str, jg1 jg1Var, og1 og1Var) {
        this.f9852w = str;
        this.f9853x = jg1Var;
        this.f9854y = og1Var;
    }

    @Override // ai.z00
    public final void T(Bundle bundle) throws RemoteException {
        this.f9853x.E(bundle);
    }

    @Override // ai.z00
    public final boolean T1(Bundle bundle) throws RemoteException {
        return this.f9853x.D(bundle);
    }

    @Override // ai.z00
    public final m00 a() throws RemoteException {
        return this.f9854y.p();
    }

    @Override // ai.z00
    public final String b() throws RemoteException {
        return this.f9854y.h0();
    }

    @Override // ai.z00
    public final String c() throws RemoteException {
        return this.f9854y.e();
    }

    @Override // ai.z00
    public final void c2(Bundle bundle) throws RemoteException {
        this.f9853x.C(bundle);
    }

    @Override // ai.z00
    public final List<?> d() throws RemoteException {
        return this.f9854y.a();
    }

    @Override // ai.z00
    public final String e() throws RemoteException {
        return this.f9854y.o();
    }

    @Override // ai.z00
    public final String f() throws RemoteException {
        return this.f9854y.g();
    }

    @Override // ai.z00
    public final void g() throws RemoteException {
        this.f9853x.b();
    }

    @Override // ai.z00
    public final Bundle h() throws RemoteException {
        return this.f9854y.f();
    }

    @Override // ai.z00
    public final pv i() throws RemoteException {
        return this.f9854y.e0();
    }

    @Override // ai.z00
    public final String l() throws RemoteException {
        return this.f9852w;
    }

    @Override // ai.z00
    public final e00 o() throws RemoteException {
        return this.f9854y.f0();
    }

    @Override // ai.z00
    public final yh.a p() throws RemoteException {
        return this.f9854y.j();
    }

    @Override // ai.z00
    public final yh.a zzb() throws RemoteException {
        return yh.b.h1(this.f9853x);
    }
}
