package com.google.android.gms.ads.mediation.customevent;

import ah.e;
import ah.i;
import ah.n;
import ah.p;
import ah.s;
import ai.uj0;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.annotation.RecentlyNonNull;
import bh.f;
import bh.h;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.common.annotation.KeepName;
import java.util.Objects;
import rg.a;
import rg.g;

@KeepName
/* loaded from: classes3.dex */
public final class CustomEventAdapter implements MediationBannerAdapter, MediationInterstitialAdapter, MediationNativeAdapter {

    /* renamed from: e  reason: collision with root package name */
    public static final a f27155e = new a(0, "Could not instantiate custom event adapter", "com.google.android.gms.ads");

    /* renamed from: a  reason: collision with root package name */
    public View f27156a;

    /* renamed from: b  reason: collision with root package name */
    public CustomEventBanner f27157b;

    /* renamed from: c  reason: collision with root package name */
    public CustomEventInterstitial f27158c;

    /* renamed from: d  reason: collision with root package name */
    public CustomEventNative f27159d;

    public static <T> T a(Class<T> cls, String str) {
        Objects.requireNonNull(str);
        try {
            return cls.cast(Class.forName(str).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
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

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter
    @RecentlyNonNull
    public View getBannerView() {
        return this.f27156a;
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter, ah.f, com.google.android.gms.ads.mediation.MediationNativeAdapter, com.google.android.gms.internal.ads.zzcoi, com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public void onDestroy() {
        CustomEventBanner customEventBanner = this.f27157b;
        if (customEventBanner != null) {
            customEventBanner.onDestroy();
        }
        CustomEventInterstitial customEventInterstitial = this.f27158c;
        if (customEventInterstitial != null) {
            customEventInterstitial.onDestroy();
        }
        CustomEventNative customEventNative = this.f27159d;
        if (customEventNative != null) {
            customEventNative.onDestroy();
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter, ah.f, com.google.android.gms.ads.mediation.MediationNativeAdapter, com.google.android.gms.internal.ads.zzcoi, com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public void onPause() {
        CustomEventBanner customEventBanner = this.f27157b;
        if (customEventBanner != null) {
            customEventBanner.onPause();
        }
        CustomEventInterstitial customEventInterstitial = this.f27158c;
        if (customEventInterstitial != null) {
            customEventInterstitial.onPause();
        }
        CustomEventNative customEventNative = this.f27159d;
        if (customEventNative != null) {
            customEventNative.onPause();
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter, ah.f, com.google.android.gms.ads.mediation.MediationNativeAdapter, com.google.android.gms.internal.ads.zzcoi, com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public void onResume() {
        CustomEventBanner customEventBanner = this.f27157b;
        if (customEventBanner != null) {
            customEventBanner.onResume();
        }
        CustomEventInterstitial customEventInterstitial = this.f27158c;
        if (customEventInterstitial != null) {
            customEventInterstitial.onResume();
        }
        CustomEventNative customEventNative = this.f27159d;
        if (customEventNative != null) {
            customEventNative.onResume();
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter
    public void requestBannerAd(@RecentlyNonNull Context context, @RecentlyNonNull i iVar, @RecentlyNonNull Bundle bundle, @RecentlyNonNull g gVar, @RecentlyNonNull e eVar, Bundle bundle2) {
        CustomEventBanner customEventBanner = (CustomEventBanner) a(CustomEventBanner.class, bundle.getString("class_name"));
        this.f27157b = customEventBanner;
        if (customEventBanner == null) {
            iVar.d(this, f27155e);
            return;
        }
        Bundle bundle3 = bundle2 == null ? null : bundle2.getBundle(bundle.getString("class_name"));
        CustomEventBanner customEventBanner2 = this.f27157b;
        Objects.requireNonNull(customEventBanner2);
        customEventBanner2.requestBannerAd(context, new f(this, iVar), bundle.getString("parameter"), gVar, eVar, bundle3);
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public void requestInterstitialAd(@RecentlyNonNull Context context, @RecentlyNonNull n nVar, @RecentlyNonNull Bundle bundle, @RecentlyNonNull e eVar, Bundle bundle2) {
        CustomEventInterstitial customEventInterstitial = (CustomEventInterstitial) a(CustomEventInterstitial.class, bundle.getString("class_name"));
        this.f27158c = customEventInterstitial;
        if (customEventInterstitial == null) {
            nVar.l(this, f27155e);
            return;
        }
        Bundle bundle3 = bundle2 == null ? null : bundle2.getBundle(bundle.getString("class_name"));
        CustomEventInterstitial customEventInterstitial2 = this.f27158c;
        Objects.requireNonNull(customEventInterstitial2);
        customEventInterstitial2.requestInterstitialAd(context, new bh.g(this, this, nVar), bundle.getString("parameter"), eVar, bundle3);
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeAdapter
    public void requestNativeAd(@RecentlyNonNull Context context, @RecentlyNonNull p pVar, @RecentlyNonNull Bundle bundle, @RecentlyNonNull s sVar, Bundle bundle2) {
        CustomEventNative customEventNative = (CustomEventNative) a(CustomEventNative.class, bundle.getString("class_name"));
        this.f27159d = customEventNative;
        if (customEventNative == null) {
            pVar.g(this, f27155e);
            return;
        }
        Bundle bundle3 = bundle2 == null ? null : bundle2.getBundle(bundle.getString("class_name"));
        CustomEventNative customEventNative2 = this.f27159d;
        Objects.requireNonNull(customEventNative2);
        customEventNative2.requestNativeAd(context, new h(this, pVar), bundle.getString("parameter"), sVar, bundle3);
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public void showInterstitial() {
        CustomEventInterstitial customEventInterstitial = this.f27158c;
        if (customEventInterstitial != null) {
            customEventInterstitial.showInterstitial();
        }
    }
}
