package ai;

import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class gb0 implements ah.d<ah.v, Object> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ sa0 f4379a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ f90 f4380b;

    public gb0(jb0 jb0Var, sa0 sa0Var, f90 f90Var) {
        this.f4379a = sa0Var;
        this.f4380b = f90Var;
    }

    @Override // ah.d
    public final void a(rg.a aVar) {
        try {
            this.f4379a.B(aVar.d());
        } catch (RemoteException e10) {
            uj0.d("", e10);
        }
    }
}
