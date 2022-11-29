package yg;

import ai.tj0;
import ai.uj0;
import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import java.io.IOException;

/* loaded from: classes3.dex */
public final class b1 extends b0 {

    /* renamed from: c  reason: collision with root package name */
    public final Context f61857c;

    public b1(Context context) {
        this.f61857c = context;
    }

    @Override // yg.b0
    public final void a() {
        boolean z10;
        try {
            z10 = AdvertisingIdClient.b(this.f61857c);
        } catch (GooglePlayServicesNotAvailableException | GooglePlayServicesRepairableException | IOException | IllegalStateException e10) {
            uj0.d("Fail to get isAdIdFakeForDebugLogging", e10);
            z10 = false;
        }
        tj0.h(z10);
        StringBuilder sb2 = new StringBuilder(43);
        sb2.append("Update ad debug logging enablement as ");
        sb2.append(z10);
        uj0.f(sb2.toString());
    }
}
