package ai;

import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class bl2 extends qt2 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ eu f2396a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ cl2 f2397b;

    public bl2(cl2 cl2Var, eu euVar) {
        this.f2397b = cl2Var;
        this.f2396a = euVar;
    }

    @Override // ai.qt2
    public final void t() {
        cm1 cm1Var;
        cm1Var = this.f2397b.f2865z;
        if (cm1Var != null) {
            try {
                this.f2396a.c();
            } catch (RemoteException e10) {
                uj0.i("#007 Could not call remote method.", e10);
            }
        }
    }
}
