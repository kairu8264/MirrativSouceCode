package ph;

import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public abstract class g1 extends LifecycleCallback implements DialogInterface.OnCancelListener {
    public final nh.d A;

    /* renamed from: x  reason: collision with root package name */
    public volatile boolean f47496x;

    /* renamed from: y  reason: collision with root package name */
    public final AtomicReference<d1> f47497y;

    /* renamed from: z  reason: collision with root package name */
    public final Handler f47498z;

    public g1(g gVar, nh.d dVar) {
        super(gVar);
        this.f47497y = new AtomicReference<>(null);
        this.f47498z = new di.f(Looper.getMainLooper());
        this.A = dVar;
    }

    public static final int p(d1 d1Var) {
        if (d1Var == null) {
            return -1;
        }
        return d1Var.a();
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void e(int i10, int i11, Intent intent) {
        d1 d1Var = this.f47497y.get();
        if (i10 != 1) {
            if (i10 == 2) {
                int g10 = this.A.g(b());
                if (g10 == 0) {
                    o();
                    return;
                } else if (d1Var == null) {
                    return;
                } else {
                    if (d1Var.b().p() == 18 && g10 == 18) {
                        return;
                    }
                }
            }
        } else if (i11 == -1) {
            o();
            return;
        } else if (i11 == 0) {
            if (d1Var == null) {
                return;
            }
            l(new ConnectionResult(intent != null ? intent.getIntExtra("<<ResolutionFailureErrorDetail>>", 13) : 13, null, d1Var.b().toString()), p(d1Var));
            return;
        }
        if (d1Var != null) {
            l(d1Var.b(), d1Var.a());
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void f(Bundle bundle) {
        super.f(bundle);
        if (bundle != null) {
            this.f47497y.set(bundle.getBoolean("resolving_error", false) ? new d1(new ConnectionResult(bundle.getInt("failed_status"), (PendingIntent) bundle.getParcelable("failed_resolution")), bundle.getInt("failed_client_id", -1)) : null);
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void i(Bundle bundle) {
        super.i(bundle);
        d1 d1Var = this.f47497y.get();
        if (d1Var == null) {
            return;
        }
        bundle.putBoolean("resolving_error", true);
        bundle.putInt("failed_client_id", d1Var.a());
        bundle.putInt("failed_status", d1Var.b().p());
        bundle.putParcelable("failed_resolution", d1Var.b().S());
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public void j() {
        super.j();
        this.f47496x = true;
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public void k() {
        super.k();
        this.f47496x = false;
    }

    public final void l(ConnectionResult connectionResult, int i10) {
        this.f47497y.set(null);
        m(connectionResult, i10);
    }

    public abstract void m(ConnectionResult connectionResult, int i10);

    public abstract void n();

    public final void o() {
        this.f47497y.set(null);
        n();
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        l(new ConnectionResult(13, null), p(this.f47497y.get()));
    }

    public final void s(ConnectionResult connectionResult, int i10) {
        d1 d1Var = new d1(connectionResult, i10);
        if (this.f47497y.compareAndSet(null, d1Var)) {
            this.f47498z.post(new f1(this, d1Var));
        }
    }
}
