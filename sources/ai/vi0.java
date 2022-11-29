package ai;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import java.io.IOException;

/* loaded from: classes3.dex */
public final class vi0 implements Runnable {

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ Context f11097w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ mk0 f11098x;

    public vi0(wi0 wi0Var, Context context, mk0 mk0Var) {
        this.f11097w = context;
        this.f11098x = mk0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f11098x.d(AdvertisingIdClient.getAdvertisingIdInfo(this.f11097w));
        } catch (GooglePlayServicesNotAvailableException | GooglePlayServicesRepairableException | IOException | IllegalStateException e10) {
            this.f11098x.e(e10);
            uj0.d("Exception while getting advertising Id info", e10);
        }
    }
}
