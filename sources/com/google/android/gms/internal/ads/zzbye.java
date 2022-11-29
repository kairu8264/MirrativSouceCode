package com.google.android.gms.internal.ads;

import ah.e;
import ah.n;
import ai.nb0;
import ai.ny;
import ai.ob0;
import ai.uj0;
import ai.zj0;
import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import p.d;
import wg.t;
import yg.d2;

/* loaded from: classes3.dex */
public final class zzbye implements MediationInterstitialAdapter {

    /* renamed from: a  reason: collision with root package name */
    public Activity f27267a;

    /* renamed from: b  reason: collision with root package name */
    public n f27268b;

    /* renamed from: c  reason: collision with root package name */
    public Uri f27269c;

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public final void onDestroy() {
        uj0.a("Destroying AdMobCustomTabsAdapter adapter.");
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public final void onPause() {
        uj0.a("Pausing AdMobCustomTabsAdapter adapter.");
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public final void onResume() {
        uj0.a("Resuming AdMobCustomTabsAdapter adapter.");
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public final void requestInterstitialAd(Context context, n nVar, Bundle bundle, e eVar, Bundle bundle2) {
        this.f27268b = nVar;
        if (nVar == null) {
            uj0.f("Listener not set for mediation. Returning.");
        } else if (context instanceof Activity) {
            if (vh.n.b() && ny.a(context)) {
                String string = bundle.getString("tab_url");
                if (TextUtils.isEmpty(string)) {
                    uj0.f("The tab_url retrieved from mediation metadata is empty. Bailing out.");
                    this.f27268b.b(this, 0);
                    return;
                }
                this.f27267a = (Activity) context;
                this.f27269c = Uri.parse(string);
                this.f27268b.q(this);
                return;
            }
            uj0.f("Default browser does not support custom tabs. Bailing out.");
            this.f27268b.b(this, 0);
        } else {
            uj0.f("AdMobCustomTabs can only work with Activity context. Bailing out.");
            this.f27268b.b(this, 0);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public final void showInterstitial() {
        d a10 = new d.a().a();
        a10.f45629a.setData(this.f27269c);
        d2.f61866i.post(new ob0(this, new AdOverlayInfoParcel(new xg.e(a10.f45629a, null), null, new nb0(this), null, new zj0(0, 0, false, false, false), null, null)));
        t.h().h();
    }
}
