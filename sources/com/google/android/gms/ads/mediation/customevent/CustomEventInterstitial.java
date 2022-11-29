package com.google.android.gms.ads.mediation.customevent;

import ah.e;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.RecentlyNonNull;
import bh.a;
import bh.d;

/* loaded from: classes3.dex */
public interface CustomEventInterstitial extends a {
    /* synthetic */ void onDestroy();

    /* synthetic */ void onPause();

    /* synthetic */ void onResume();

    void requestInterstitialAd(@RecentlyNonNull Context context, @RecentlyNonNull d dVar, String str, @RecentlyNonNull e eVar, Bundle bundle);

    void showInterstitial();
}
