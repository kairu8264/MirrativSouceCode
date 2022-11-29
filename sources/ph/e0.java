package ph;

import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.a;
import java.util.Map;

/* loaded from: classes3.dex */
public final class e0 implements Runnable {

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ ConnectionResult f47482w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ f0 f47483x;

    public e0(f0 f0Var, ConnectionResult connectionResult) {
        this.f47483x = f0Var;
        this.f47482w = connectionResult;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Map map;
        b bVar;
        a.f fVar;
        a.f fVar2;
        a.f fVar3;
        a.f fVar4;
        f0 f0Var = this.f47483x;
        map = f0Var.f47492f.H;
        bVar = f0Var.f47488b;
        b0 b0Var = (b0) map.get(bVar);
        if (b0Var == null) {
            return;
        }
        if (this.f47482w.k0()) {
            this.f47483x.f47491e = true;
            fVar = this.f47483x.f47487a;
            if (fVar.f()) {
                this.f47483x.h();
                return;
            }
            try {
                f0 f0Var2 = this.f47483x;
                fVar3 = f0Var2.f47487a;
                fVar4 = f0Var2.f47487a;
                fVar3.j(null, fVar4.h());
                return;
            } catch (SecurityException e10) {
                Log.e("GoogleApiManager", "Failed to get service from broker. ", e10);
                fVar2 = this.f47483x.f47487a;
                fVar2.a("Failed to get service from broker.");
                b0Var.E(new ConnectionResult(10), null);
                return;
            }
        }
        b0Var.E(this.f47482w, null);
    }
}
