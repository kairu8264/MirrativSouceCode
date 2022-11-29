package ai;

import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class ib0 implements ah.d<ah.q, Object> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ va0 f5154a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ f90 f5155b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ jb0 f5156c;

    public ib0(jb0 jb0Var, va0 va0Var, f90 f90Var) {
        this.f5156c = jb0Var;
        this.f5154a = va0Var;
        this.f5155b = f90Var;
    }

    @Override // ah.d
    public final void a(rg.a aVar) {
        try {
            this.f5154a.B(aVar.d());
        } catch (RemoteException e10) {
            uj0.d("", e10);
        }
    }
}
