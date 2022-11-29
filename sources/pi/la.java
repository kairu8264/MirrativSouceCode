package pi;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

/* loaded from: classes3.dex */
public final class la implements c6 {

    /* renamed from: a  reason: collision with root package name */
    public final hi.l1 f48032a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ AppMeasurementDynamiteService f48033b;

    public la(AppMeasurementDynamiteService appMeasurementDynamiteService, hi.l1 l1Var) {
        this.f48033b = appMeasurementDynamiteService;
        this.f48032a = l1Var;
    }

    @Override // pi.c6
    public final void a(String str, String str2, Bundle bundle, long j10) {
        try {
            this.f48032a.M0(str, str2, bundle, j10);
        } catch (RemoteException e10) {
            b5 b5Var = this.f48033b.f27294w;
            if (b5Var != null) {
                b5Var.r().v().b("Event interceptor threw exception", e10);
            }
        }
    }
}
