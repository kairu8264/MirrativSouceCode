package ai;

import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class eb0 implements ah.d<ah.k, Object> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ma0 f3599a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ f90 f3600b;

    public eb0(jb0 jb0Var, ma0 ma0Var, f90 f90Var) {
        this.f3599a = ma0Var;
        this.f3600b = f90Var;
    }

    @Override // ah.d
    public final void a(rg.a aVar) {
        try {
            this.f3599a.B(aVar.d());
        } catch (RemoteException e10) {
            uj0.d("", e10);
        }
    }
}
