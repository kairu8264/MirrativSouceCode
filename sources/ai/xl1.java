package ai;

import android.os.RemoteException;
import rg.u;

/* loaded from: classes3.dex */
public final class xl1 extends u.a {

    /* renamed from: a  reason: collision with root package name */
    public final og1 f11988a;

    public xl1(og1 og1Var) {
        this.f11988a = og1Var;
    }

    public static sv f(og1 og1Var) {
        pv e02 = og1Var.e0();
        if (e02 == null) {
            return null;
        }
        try {
            return e02.o();
        } catch (RemoteException unused) {
            return null;
        }
    }

    @Override // rg.u.a
    public final void a() {
        sv f10 = f(this.f11988a);
        if (f10 == null) {
            return;
        }
        try {
            f10.e();
        } catch (RemoteException e10) {
            uj0.g("Unable to call onVideoEnd()", e10);
        }
    }

    @Override // rg.u.a
    public final void c() {
        sv f10 = f(this.f11988a);
        if (f10 == null) {
            return;
        }
        try {
            f10.f();
        } catch (RemoteException e10) {
            uj0.g("Unable to call onVideoEnd()", e10);
        }
    }

    @Override // rg.u.a
    public final void e() {
        sv f10 = f(this.f11988a);
        if (f10 == null) {
            return;
        }
        try {
            f10.c();
        } catch (RemoteException e10) {
            uj0.g("Unable to call onVideoEnd()", e10);
        }
    }
}
