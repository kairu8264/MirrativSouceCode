package ph;

import android.app.Dialog;
import android.app.PendingIntent;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiActivity;

/* loaded from: classes3.dex */
public final class f1 implements Runnable {

    /* renamed from: w  reason: collision with root package name */
    public final d1 f47493w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ g1 f47494x;

    public f1(g1 g1Var, d1 d1Var) {
        this.f47494x = g1Var;
        this.f47493w = d1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f47494x.f47496x) {
            ConnectionResult b10 = this.f47493w.b();
            if (b10.U()) {
                g1 g1Var = this.f47494x;
                g1Var.f27216w.startActivityForResult(GoogleApiActivity.a(g1Var.b(), (PendingIntent) rh.p.i(b10.S()), this.f47493w.a(), false), 1);
                return;
            }
            g1 g1Var2 = this.f47494x;
            if (g1Var2.A.b(g1Var2.b(), b10.p(), null) != null) {
                g1 g1Var3 = this.f47494x;
                g1Var3.A.v(g1Var3.b(), this.f47494x.f27216w, b10.p(), 2, this.f47494x);
            } else if (b10.p() == 18) {
                g1 g1Var4 = this.f47494x;
                Dialog q10 = g1Var4.A.q(g1Var4.b(), this.f47494x);
                g1 g1Var5 = this.f47494x;
                g1Var5.A.r(g1Var5.b().getApplicationContext(), new e1(this, q10));
            } else {
                this.f47494x.l(b10, this.f47493w.a());
            }
        }
    }
}
