package pi;

import android.content.ComponentName;
import android.content.Context;

/* loaded from: classes3.dex */
public final class t8 implements Runnable {

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ v8 f48243w;

    public t8(v8 v8Var) {
        this.f48243w = v8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        w8 w8Var = this.f48243w.f48290y;
        Context F = w8Var.f48285a.F();
        this.f48243w.f48290y.f48285a.b();
        w8.M(w8Var, new ComponentName(F, "com.google.android.gms.measurement.AppMeasurementService"));
    }
}
