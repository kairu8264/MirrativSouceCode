package pi;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

/* loaded from: classes3.dex */
public final class ma implements d6 {

    /* renamed from: a  reason: collision with root package name */
    public final hi.l1 f48052a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ AppMeasurementDynamiteService f48053b;

    public ma(AppMeasurementDynamiteService appMeasurementDynamiteService, hi.l1 l1Var) {
        this.f48053b = appMeasurementDynamiteService;
        this.f48052a = l1Var;
    }

    @Override // pi.d6
    public final void a(String str, String str2, Bundle bundle, long j10) {
        try {
            this.f48052a.M0(str, str2, bundle, j10);
        } catch (RemoteException e10) {
            b5 b5Var = this.f48053b.f27294w;
            if (b5Var != null) {
                b5Var.r().v().b("Event listener threw exception", e10);
            }
        }
    }
}
