package com.google.android.gms.ads.mediation;

import ah.e;
import ah.f;
import ah.i;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.annotation.RecentlyNonNull;
import rg.g;

@Deprecated
/* loaded from: classes3.dex */
public interface MediationBannerAdapter extends f {
    @RecentlyNonNull
    View getBannerView();

    @Override // ah.f, com.google.android.gms.ads.mediation.MediationNativeAdapter, com.google.android.gms.internal.ads.zzcoi, com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    /* synthetic */ void onDestroy();

    @Override // ah.f, com.google.android.gms.ads.mediation.MediationNativeAdapter, com.google.android.gms.internal.ads.zzcoi, com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    /* synthetic */ void onPause();

    @Override // ah.f, com.google.android.gms.ads.mediation.MediationNativeAdapter, com.google.android.gms.internal.ads.zzcoi, com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    /* synthetic */ void onResume();

    void requestBannerAd(@RecentlyNonNull Context context, @RecentlyNonNull i iVar, @RecentlyNonNull Bundle bundle, @RecentlyNonNull g gVar, @RecentlyNonNull e eVar, Bundle bundle2);
}
