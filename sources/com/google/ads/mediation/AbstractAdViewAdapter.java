package com.google.ads.mediation;

import ah.n;
import ah.p;
import ah.s;
import ah.u;
import ah.x;
import ah.y;
import ai.dt;
import ai.nj0;
import ai.pv;
import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import android.view.View;
import androidx.annotation.RecentlyNonNull;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.internal.ads.zzcoi;
import java.util.Date;
import java.util.Set;
import rg.e;
import rg.f;
import rg.g;
import rg.i;
import wf.h;
import wf.j;
import zg.a;

/* loaded from: classes3.dex */
public abstract class AbstractAdViewAdapter implements com.google.android.gms.ads.mediation.MediationBannerAdapter, MediationNativeAdapter, u, zzcoi, y {
    @RecentlyNonNull
    public static final String AD_UNIT_ID_PARAMETER = "pubid";
    private e adLoader;
    @RecentlyNonNull
    public i mAdView;
    @RecentlyNonNull
    public a mInterstitialAd;

    public f buildAdRequest(Context context, ah.e eVar, Bundle bundle, Bundle bundle2) {
        f.a aVar = new f.a();
        Date a10 = eVar.a();
        if (a10 != null) {
            aVar.f(a10);
        }
        int g10 = eVar.g();
        if (g10 != 0) {
            aVar.g(g10);
        }
        Set<String> i10 = eVar.i();
        if (i10 != null) {
            for (String str : i10) {
                aVar.a(str);
            }
        }
        Location j10 = eVar.j();
        if (j10 != null) {
            aVar.d(j10);
        }
        if (eVar.e()) {
            dt.a();
            aVar.e(nj0.r(context));
        }
        if (eVar.c() != -1) {
            aVar.h(eVar.c() == 1);
        }
        aVar.i(eVar.d());
        aVar.b(AdMobAdapter.class, buildExtrasBundle(bundle, bundle2));
        return aVar.c();
    }

    @RecentlyNonNull
    public abstract Bundle buildExtrasBundle(@RecentlyNonNull Bundle bundle, @RecentlyNonNull Bundle bundle2);

    @RecentlyNonNull
    public String getAdUnitId(@RecentlyNonNull Bundle bundle) {
        return bundle.getString(AD_UNIT_ID_PARAMETER);
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter
    @RecentlyNonNull
    public View getBannerView() {
        return this.mAdView;
    }

    public a getInterstitialAd() {
        return this.mInterstitialAd;
    }

    @Override // com.google.android.gms.internal.ads.zzcoi
    @RecentlyNonNull
    public Bundle getInterstitialAdapterInfo() {
        x xVar = new x();
        xVar.a(1);
        return xVar.b();
    }

    @Override // ah.y
    public pv getVideoController() {
        i iVar = this.mAdView;
        if (iVar != null) {
            return iVar.e().c();
        }
        return null;
    }

    public e.a newAdLoader(Context context, String str) {
        return new e.a(context, str);
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter, ah.f, com.google.android.gms.ads.mediation.MediationNativeAdapter, com.google.android.gms.internal.ads.zzcoi, com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public void onDestroy() {
        i iVar = this.mAdView;
        if (iVar != null) {
            iVar.a();
            this.mAdView = null;
        }
        if (this.mInterstitialAd != null) {
            this.mInterstitialAd = null;
        }
        if (this.adLoader != null) {
            this.adLoader = null;
        }
    }

    @Override // ah.u
    public void onImmersiveModeUpdated(boolean z10) {
        a aVar = this.mInterstitialAd;
        if (aVar != null) {
            aVar.c(z10);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter, ah.f, com.google.android.gms.ads.mediation.MediationNativeAdapter, com.google.android.gms.internal.ads.zzcoi, com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public void onPause() {
        i iVar = this.mAdView;
        if (iVar != null) {
            iVar.c();
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter, ah.f, com.google.android.gms.ads.mediation.MediationNativeAdapter, com.google.android.gms.internal.ads.zzcoi, com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public void onResume() {
        i iVar = this.mAdView;
        if (iVar != null) {
            iVar.d();
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter
    public void requestBannerAd(@RecentlyNonNull Context context, @RecentlyNonNull ah.i iVar, @RecentlyNonNull Bundle bundle, @RecentlyNonNull g gVar, @RecentlyNonNull ah.e eVar, @RecentlyNonNull Bundle bundle2) {
        i iVar2 = new i(context);
        this.mAdView = iVar2;
        iVar2.setAdSize(new g(gVar.c(), gVar.a()));
        this.mAdView.setAdUnitId(getAdUnitId(bundle));
        this.mAdView.setAdListener(new wf.g(this, iVar));
        this.mAdView.b(buildAdRequest(context, eVar, bundle2, bundle));
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public void requestInterstitialAd(@RecentlyNonNull Context context, @RecentlyNonNull n nVar, @RecentlyNonNull Bundle bundle, @RecentlyNonNull ah.e eVar, @RecentlyNonNull Bundle bundle2) {
        a.a(context, getAdUnitId(bundle), buildAdRequest(context, eVar, bundle2, bundle), new h(this, nVar));
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeAdapter
    public void requestNativeAd(@RecentlyNonNull Context context, @RecentlyNonNull p pVar, @RecentlyNonNull Bundle bundle, @RecentlyNonNull s sVar, @RecentlyNonNull Bundle bundle2) {
        j jVar = new j(this, pVar);
        e.a d10 = newAdLoader(context, bundle.getString(AD_UNIT_ID_PARAMETER)).d(jVar);
        d10.f(sVar.f());
        d10.e(sVar.b());
        if (sVar.h()) {
            d10.c(jVar);
        }
        if (sVar.zza()) {
            for (String str : sVar.zzb().keySet()) {
                d10.b(str, jVar, true != sVar.zzb().get(str).booleanValue() ? null : jVar);
            }
        }
        e a10 = d10.a();
        this.adLoader = a10;
        a10.a(buildAdRequest(context, sVar, bundle2, bundle));
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public void showInterstitial() {
        a aVar = this.mInterstitialAd;
        if (aVar != null) {
            aVar.d(null);
        }
    }
}
