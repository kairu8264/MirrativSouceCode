package ph;

import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class a1 extends w0<Boolean> {

    /* renamed from: c  reason: collision with root package name */
    public final h<?> f47455c;

    public a1(h<?> hVar, vi.h<Boolean> hVar2) {
        super(4, hVar2);
        this.f47455c = hVar;
    }

    @Override // ph.b1
    public final /* bridge */ /* synthetic */ void d(r rVar, boolean z10) {
    }

    @Override // ph.j0
    public final boolean f(b0<?> b0Var) {
        if (b0Var.u().get(this.f47455c) == null) {
            return false;
        }
        throw null;
    }

    @Override // ph.j0
    public final nh.c[] g(b0<?> b0Var) {
        if (b0Var.u().get(this.f47455c) == null) {
            return null;
        }
        throw null;
    }

    @Override // ph.w0
    public final void h(b0<?> b0Var) throws RemoteException {
        if (b0Var.u().remove(this.f47455c) == null) {
            this.f47564b.e(Boolean.FALSE);
        } else {
            b0Var.s();
            throw null;
        }
    }
}
