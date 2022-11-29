package pi;

import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

/* loaded from: classes3.dex */
public final class i9 implements Runnable {

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ la f47953w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ AppMeasurementDynamiteService f47954x;

    public i9(AppMeasurementDynamiteService appMeasurementDynamiteService, la laVar) {
        this.f47954x = appMeasurementDynamiteService;
        this.f47953w = laVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f47954x.f27294w.I().I(this.f47953w);
    }
}
