package ph;

import android.os.Handler;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.a;
import java.util.Map;
import java.util.Set;
import rh.c;

/* loaded from: classes3.dex */
public final class f0 implements c.InterfaceC0781c, s0 {

    /* renamed from: a  reason: collision with root package name */
    public final a.f f47487a;

    /* renamed from: b  reason: collision with root package name */
    public final b<?> f47488b;

    /* renamed from: c  reason: collision with root package name */
    public rh.i f47489c = null;

    /* renamed from: d  reason: collision with root package name */
    public Set<Scope> f47490d = null;

    /* renamed from: e  reason: collision with root package name */
    public boolean f47491e = false;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ e f47492f;

    public f0(e eVar, a.f fVar, b<?> bVar) {
        this.f47492f = eVar;
        this.f47487a = fVar;
        this.f47488b = bVar;
    }

    @Override // rh.c.InterfaceC0781c
    public final void a(ConnectionResult connectionResult) {
        Handler handler;
        handler = this.f47492f.L;
        handler.post(new e0(this, connectionResult));
    }

    @Override // ph.s0
    public final void b(rh.i iVar, Set<Scope> set) {
        if (iVar != null && set != null) {
            this.f47489c = iVar;
            this.f47490d = set;
            h();
            return;
        }
        Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
        c(new ConnectionResult(4));
    }

    @Override // ph.s0
    public final void c(ConnectionResult connectionResult) {
        Map map;
        map = this.f47492f.H;
        b0 b0Var = (b0) map.get(this.f47488b);
        if (b0Var != null) {
            b0Var.F(connectionResult);
        }
    }

    public final void h() {
        rh.i iVar;
        if (!this.f47491e || (iVar = this.f47489c) == null) {
            return;
        }
        this.f47487a.j(iVar, this.f47490d);
    }
}
