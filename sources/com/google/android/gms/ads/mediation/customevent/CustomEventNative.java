package com.google.android.gms.ads.mediation.customevent;

import ah.s;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.RecentlyNonNull;
import bh.a;
import bh.e;

/* loaded from: classes3.dex */
public interface CustomEventNative extends a {
    /* synthetic */ void onDestroy();

    /* synthetic */ void onPause();

    /* synthetic */ void onResume();

    void requestNativeAd(@RecentlyNonNull Context context, @RecentlyNonNull e eVar, String str, @RecentlyNonNull s sVar, Bundle bundle);
}
