package rh;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

/* loaded from: classes3.dex */
public final class f1 extends r0 {

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ c f51444g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(c cVar, int i10, Bundle bundle) {
        super(cVar, i10, null);
        this.f51444g = cVar;
    }

    @Override // rh.r0
    public final void f(ConnectionResult connectionResult) {
        if (this.f51444g.r() && c.f0(this.f51444g)) {
            c.b0(this.f51444g, 16);
            return;
        }
        this.f51444g.L.a(connectionResult);
        this.f51444g.J(connectionResult);
    }

    @Override // rh.r0
    public final boolean g() {
        this.f51444g.L.a(ConnectionResult.A);
        return true;
    }
}
