package ai;

import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class uk2 extends qt2 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ fv f10739a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ wk2 f10740b;

    public uk2(wk2 wk2Var, fv fvVar) {
        this.f10740b = wk2Var;
        this.f10739a = fvVar;
    }

    @Override // ai.qt2
    public final void t() {
        cm1 cm1Var;
        cm1Var = this.f10740b.B;
        if (cm1Var != null) {
            try {
                this.f10739a.c();
            } catch (RemoteException e10) {
                uj0.i("#007 Could not call remote method.", e10);
            }
        }
    }
}
