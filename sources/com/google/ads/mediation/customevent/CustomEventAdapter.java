package com.google.ads.mediation.customevent;

import ai.uj0;
import android.app.Activity;
import android.view.View;
import androidx.annotation.RecentlyNonNull;
import bh.c;
import com.google.ads.mediation.MediationBannerAdapter;
import com.google.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.common.annotation.KeepName;
import wf.a;
import xf.d;
import xf.e;

@KeepName
/* loaded from: classes3.dex */
public final class CustomEventAdapter implements MediationBannerAdapter<c, xf.c>, MediationInterstitialAdapter<c, xf.c> {

    /* renamed from: a  reason: collision with root package name */
    public View f26645a;

    /* renamed from: b  reason: collision with root package name */
    public CustomEventBanner f26646b;

    /* renamed from: c  reason: collision with root package name */
    public CustomEventInterstitial f26647c;

    public static <T> T a(String str) {
        try {
            return (T) Class.forName(str).newInstance();
        } catch (Throwable th2) {
            String message = th2.getMessage();
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 46 + String.valueOf(message).length());
            sb2.append("Could not instantiate custom event adapter: ");
            sb2.append(str);
            sb2.append(". ");
            sb2.append(message);
            uj0.f(sb2.toString());
            return null;
        }
    }

    @Override // com.google.ads.mediation.MediationBannerAdapter, wf.b
    public void destroy() {
        CustomEventBanner customEventBanner = this.f26646b;
        if (customEventBanner != null) {
            customEventBanner.destroy();
        }
        CustomEventInterstitial customEventInterstitial = this.f26647c;
        if (customEventInterstitial != null) {
            customEventInterstitial.destroy();
        }
    }

    @Override // com.google.ads.mediation.MediationBannerAdapter, wf.b
    @RecentlyNonNull
    public Class<c> getAdditionalParametersType() {
        return c.class;
    }

    @Override // com.google.ads.mediation.MediationBannerAdapter
    @RecentlyNonNull
    public View getBannerView() {
        return this.f26645a;
    }

    @Override // com.google.ads.mediation.MediationBannerAdapter, wf.b
    @RecentlyNonNull
    public Class<xf.c> getServerParametersType() {
        return xf.c.class;
    }

    @Override // com.google.ads.mediation.MediationInterstitialAdapter
    public void showInterstitial() {
        this.f26647c.showInterstitial();
    }

    @Override // com.google.ads.mediation.MediationBannerAdapter
    public void requestBannerAd(@RecentlyNonNull wf.c cVar, @RecentlyNonNull Activity activity, @RecentlyNonNull xf.c cVar2, @RecentlyNonNull vf.c cVar3, @RecentlyNonNull a aVar, @RecentlyNonNull c cVar4) {
        CustomEventBanner customEventBanner = (CustomEventBanner) a(cVar2.f60256b);
        this.f26646b = customEventBanner;
        if (customEventBanner == null) {
            cVar.a(this, vf.a.INTERNAL_ERROR);
            return;
        }
        this.f26646b.requestBannerAd(new d(this, cVar), activity, cVar2.f60255a, cVar2.f60257c, cVar3, aVar, cVar4 == null ? null : cVar4.a(cVar2.f60255a));
    }

    @Override // com.google.ads.mediation.MediationInterstitialAdapter
    public void requestInterstitialAd(@RecentlyNonNull wf.d dVar, @RecentlyNonNull Activity activity, @RecentlyNonNull xf.c cVar, @RecentlyNonNull a aVar, @RecentlyNonNull c cVar2) {
        CustomEventInterstitial customEventInterstitial = (CustomEventInterstitial) a(cVar.f60256b);
        this.f26647c = customEventInterstitial;
        if (customEventInterstitial == null) {
            dVar.b(this, vf.a.INTERNAL_ERROR);
            return;
        }
        this.f26647c.requestInterstitialAd(new e(this, this, dVar), activity, cVar.f60255a, cVar.f60257c, aVar, cVar2 == null ? null : cVar2.a(cVar.f60255a));
    }
}
