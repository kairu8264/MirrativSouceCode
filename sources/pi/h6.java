package pi;

import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

/* loaded from: classes3.dex */
public final class h6 implements Runnable {

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ hi.i1 f47909w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ AppMeasurementDynamiteService f47910x;

    public h6(AppMeasurementDynamiteService appMeasurementDynamiteService, hi.i1 i1Var) {
        this.f47910x = appMeasurementDynamiteService;
        this.f47909w = i1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f47910x.f27294w.L().R(this.f47909w);
    }
}
