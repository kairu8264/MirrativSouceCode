package xg;

import ai.nc1;
import ai.or;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import yg.d2;

/* loaded from: classes3.dex */
public final class o {
    public static final void a(Context context, AdOverlayInfoParcel adOverlayInfoParcel, boolean z10) {
        if (adOverlayInfoParcel.G == 4 && adOverlayInfoParcel.f27152y == null) {
            or orVar = adOverlayInfoParcel.f27151x;
            if (orVar != null) {
                orVar.onAdClicked();
            }
            nc1 nc1Var = adOverlayInfoParcel.U;
            if (nc1Var != null) {
                nc1Var.zzb();
            }
            Activity g10 = adOverlayInfoParcel.f27153z.g();
            e eVar = adOverlayInfoParcel.f27150w;
            if (eVar != null && eVar.F && g10 != null) {
                context = g10;
            }
            wg.t.b();
            e eVar2 = adOverlayInfoParcel.f27150w;
            a.b(context, eVar2, adOverlayInfoParcel.E, eVar2 != null ? eVar2.E : null);
            return;
        }
        Intent intent = new Intent();
        intent.setClassName(context, "com.google.android.gms.ads.AdActivity");
        intent.putExtra("com.google.android.gms.ads.internal.overlay.useClientJar", adOverlayInfoParcel.I.f13016z);
        intent.putExtra("shouldCallOnOverlayOpened", z10);
        Bundle bundle = new Bundle(1);
        bundle.putParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", adOverlayInfoParcel);
        intent.putExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", bundle);
        if (!vh.n.h()) {
            intent.addFlags(524288);
        }
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        wg.t.d();
        d2.p(context, intent);
    }
}
