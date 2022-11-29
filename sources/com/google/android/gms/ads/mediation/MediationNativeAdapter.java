package com.google.android.gms.ads.mediation;

import ah.f;
import ah.p;
import ah.s;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.RecentlyNonNull;

@Deprecated
/* loaded from: classes3.dex */
public interface MediationNativeAdapter extends f {
    @Override // com.google.android.gms.internal.ads.zzcoi, com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    /* synthetic */ void onDestroy();

    @Override // com.google.android.gms.internal.ads.zzcoi, com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    /* synthetic */ void onPause();

    @Override // com.google.android.gms.internal.ads.zzcoi, com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    /* synthetic */ void onResume();

    void requestNativeAd(@RecentlyNonNull Context context, @RecentlyNonNull p pVar, @RecentlyNonNull Bundle bundle, @RecentlyNonNull s sVar, Bundle bundle2);
}
