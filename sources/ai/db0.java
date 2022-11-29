package ai;

import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class db0 implements ah.d<ah.g, Object> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ma0 f3194a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ f90 f3195b;

    public db0(jb0 jb0Var, ma0 ma0Var, f90 f90Var) {
        this.f3194a = ma0Var;
        this.f3195b = f90Var;
    }

    @Override // ah.d
    public final void a(rg.a aVar) {
        try {
            this.f3194a.B(aVar.d());
        } catch (RemoteException e10) {
            uj0.d("", e10);
        }
    }
}
