package ai;

import android.os.Bundle;
import android.os.DeadObjectException;
import rh.c;

/* loaded from: classes3.dex */
public final class a50 implements c.a {

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ mk0 f1745w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ c50 f1746x;

    public a50(c50 c50Var, mk0 mk0Var) {
        this.f1746x = c50Var;
        this.f1745w = mk0Var;
    }

    @Override // rh.c.a
    public final void i0(Bundle bundle) {
        o40 o40Var;
        try {
            mk0 mk0Var = this.f1745w;
            o40Var = this.f1746x.f2714a;
            mk0Var.d(o40Var.h0());
        } catch (DeadObjectException e10) {
            this.f1745w.e(e10);
        }
    }

    @Override // rh.c.a
    public final void s0(int i10) {
        mk0 mk0Var = this.f1745w;
        StringBuilder sb2 = new StringBuilder(34);
        sb2.append("onConnectionSuspended: ");
        sb2.append(i10);
        mk0Var.e(new RuntimeException(sb2.toString()));
    }
}
