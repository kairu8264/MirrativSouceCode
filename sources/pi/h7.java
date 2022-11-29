package pi;

import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

/* loaded from: classes3.dex */
public final class h7 implements Runnable {

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ hi.i1 f47911w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ u f47912x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ String f47913y;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ AppMeasurementDynamiteService f47914z;

    public h7(AppMeasurementDynamiteService appMeasurementDynamiteService, hi.i1 i1Var, u uVar, String str) {
        this.f47914z = appMeasurementDynamiteService;
        this.f47911w = i1Var;
        this.f47912x = uVar;
        this.f47913y = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f47914z.f27294w.L().n(this.f47911w, this.f47912x, this.f47913y);
    }
}
