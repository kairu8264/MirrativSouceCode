package com.google.android.gms.ads.mediation;

import ah.e;
import ah.f;
import ah.n;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.RecentlyNonNull;

@Deprecated
/* loaded from: classes3.dex */
public interface MediationInterstitialAdapter extends f {
    @Override // 
    /* synthetic */ void onDestroy();

    @Override // 
    /* synthetic */ void onPause();

    @Override // 
    /* synthetic */ void onResume();

    void requestInterstitialAd(@RecentlyNonNull Context context, @RecentlyNonNull n nVar, @RecentlyNonNull Bundle bundle, @RecentlyNonNull e eVar, Bundle bundle2);

    void showInterstitial();
}
