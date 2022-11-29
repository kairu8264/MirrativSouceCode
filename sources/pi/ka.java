package pi;

import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

/* loaded from: classes3.dex */
public final class ka implements Runnable {

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ hi.i1 f48010w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ AppMeasurementDynamiteService f48011x;

    public ka(AppMeasurementDynamiteService appMeasurementDynamiteService, hi.i1 i1Var) {
        this.f48011x = appMeasurementDynamiteService;
        this.f48010w = i1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f48011x.f27294w.N().B(this.f48010w, this.f48011x.f27294w.l());
    }
}
