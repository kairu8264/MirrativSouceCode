package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;

/* loaded from: classes3.dex */
public interface zzcoh extends MediationBannerAdapter {
    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter, ah.f, com.google.android.gms.ads.mediation.MediationNativeAdapter, com.google.android.gms.internal.ads.zzcoi, com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    /* synthetic */ void onDestroy();

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter, ah.f, com.google.android.gms.ads.mediation.MediationNativeAdapter, com.google.android.gms.internal.ads.zzcoi, com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    /* synthetic */ void onPause();

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter, ah.f, com.google.android.gms.ads.mediation.MediationNativeAdapter, com.google.android.gms.internal.ads.zzcoi, com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    /* synthetic */ void onResume();

    Bundle zza();
}
