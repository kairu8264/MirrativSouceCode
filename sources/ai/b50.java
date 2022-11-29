package ai;

import com.google.android.gms.common.ConnectionResult;
import rh.c;

/* loaded from: classes3.dex */
public final class b50 implements c.b {

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ mk0 f2242w;

    public b50(c50 c50Var, mk0 mk0Var) {
        this.f2242w = mk0Var;
    }

    @Override // rh.c.b
    public final void z0(ConnectionResult connectionResult) {
        this.f2242w.e(new RuntimeException("Connection failed."));
    }
}
