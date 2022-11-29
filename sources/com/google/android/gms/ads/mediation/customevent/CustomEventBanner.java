package com.google.android.gms.ads.mediation.customevent;

import ah.e;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.RecentlyNonNull;
import bh.a;
import bh.b;
import rg.g;

/* loaded from: classes3.dex */
public interface CustomEventBanner extends a {
    /* synthetic */ void onDestroy();

    /* synthetic */ void onPause();

    /* synthetic */ void onResume();

    void requestBannerAd(@RecentlyNonNull Context context, @RecentlyNonNull b bVar, String str, @RecentlyNonNull g gVar, @RecentlyNonNull e eVar, Bundle bundle);
}
