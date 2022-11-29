package pi;

import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

/* loaded from: classes3.dex */
public final class ja implements Runnable {

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ hi.i1 f47979w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ String f47980x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ String f47981y;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ AppMeasurementDynamiteService f47982z;

    public ja(AppMeasurementDynamiteService appMeasurementDynamiteService, hi.i1 i1Var, String str, String str2) {
        this.f47982z = appMeasurementDynamiteService;
        this.f47979w = i1Var;
        this.f47980x = str;
        this.f47981y = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f47982z.f27294w.L().T(this.f47979w, this.f47980x, this.f47981y);
    }
}
