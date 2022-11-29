package com.google.android.gms.ads.mediation.rtb;

import ah.a;
import ah.d;
import ah.g;
import ah.h;
import ah.k;
import ah.l;
import ah.m;
import ah.o;
import ah.q;
import ah.r;
import ah.v;
import androidx.annotation.RecentlyNonNull;
import ch.b;

/* loaded from: classes3.dex */
public abstract class RtbAdapter extends a {
    public abstract void collectSignals(@RecentlyNonNull ch.a aVar, @RecentlyNonNull b bVar);

    public void loadRtbBannerAd(@RecentlyNonNull h hVar, @RecentlyNonNull d<g, Object> dVar) {
        loadBannerAd(hVar, dVar);
    }

    public void loadRtbInterscrollerAd(@RecentlyNonNull h hVar, @RecentlyNonNull d<k, Object> dVar) {
        dVar.a(new rg.a(7, getClass().getSimpleName().concat(" does not support interscroller ads."), "com.google.android.gms.ads"));
    }

    public void loadRtbInterstitialAd(@RecentlyNonNull m mVar, @RecentlyNonNull d<l, Object> dVar) {
        loadInterstitialAd(mVar, dVar);
    }

    public void loadRtbNativeAd(@RecentlyNonNull o oVar, @RecentlyNonNull d<v, Object> dVar) {
        loadNativeAd(oVar, dVar);
    }

    public void loadRtbRewardedAd(@RecentlyNonNull r rVar, @RecentlyNonNull d<q, Object> dVar) {
        loadRewardedAd(rVar, dVar);
    }

    public void loadRtbRewardedInterstitialAd(@RecentlyNonNull r rVar, @RecentlyNonNull d<q, Object> dVar) {
        loadRewardedInterstitialAd(rVar, dVar);
    }
}
