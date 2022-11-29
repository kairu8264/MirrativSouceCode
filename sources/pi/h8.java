package pi;

import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

/* loaded from: classes3.dex */
public final class h8 implements Runnable {
    public final /* synthetic */ AppMeasurementDynamiteService A;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ hi.i1 f47915w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ String f47916x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ String f47917y;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ boolean f47918z;

    public h8(AppMeasurementDynamiteService appMeasurementDynamiteService, hi.i1 i1Var, String str, String str2, boolean z10) {
        this.A = appMeasurementDynamiteService;
        this.f47915w = i1Var;
        this.f47916x = str;
        this.f47917y = str2;
        this.f47918z = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A.f27294w.L().V(this.f47915w, this.f47916x, this.f47917y, this.f47918z);
    }
}
