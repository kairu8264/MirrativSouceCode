package ai;

import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class fb0 implements ah.d<ah.l, Object> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ pa0 f3985a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ f90 f3986b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ jb0 f3987c;

    public fb0(jb0 jb0Var, pa0 pa0Var, f90 f90Var) {
        this.f3987c = jb0Var;
        this.f3985a = pa0Var;
        this.f3986b = f90Var;
    }

    @Override // ah.d
    public final void a(rg.a aVar) {
        try {
            this.f3985a.B(aVar.d());
        } catch (RemoteException e10) {
            uj0.d("", e10);
        }
    }
}
