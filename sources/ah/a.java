package ah;

import android.content.Context;
import androidx.annotation.RecentlyNonNull;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class a {
    @RecentlyNonNull
    public abstract w getSDKVersionInfo();

    @RecentlyNonNull
    public abstract w getVersionInfo();

    public abstract void initialize(@RecentlyNonNull Context context, @RecentlyNonNull b bVar, @RecentlyNonNull List<j> list);

    public void loadBannerAd(@RecentlyNonNull h hVar, @RecentlyNonNull d<g, Object> dVar) {
        dVar.a(new rg.a(7, getClass().getSimpleName().concat(" does not support banner ads."), "com.google.android.gms.ads"));
    }

    public void loadInterscrollerAd(@RecentlyNonNull h hVar, @RecentlyNonNull d<k, Object> dVar) {
        dVar.a(new rg.a(7, getClass().getSimpleName().concat(" does not support interscroller ads."), "com.google.android.gms.ads"));
    }

    public void loadInterstitialAd(@RecentlyNonNull m mVar, @RecentlyNonNull d<l, Object> dVar) {
        dVar.a(new rg.a(7, getClass().getSimpleName().concat(" does not support interstitial ads."), "com.google.android.gms.ads"));
    }

    public void loadNativeAd(@RecentlyNonNull o oVar, @RecentlyNonNull d<v, Object> dVar) {
        dVar.a(new rg.a(7, getClass().getSimpleName().concat(" does not support native ads."), "com.google.android.gms.ads"));
    }

    public void loadRewardedAd(@RecentlyNonNull r rVar, @RecentlyNonNull d<q, Object> dVar) {
        dVar.a(new rg.a(7, getClass().getSimpleName().concat(" does not support rewarded ads."), "com.google.android.gms.ads"));
    }

    public void loadRewardedInterstitialAd(@RecentlyNonNull r rVar, @RecentlyNonNull d<q, Object> dVar) {
        dVar.a(new rg.a(7, getClass().getSimpleName().concat(" does not support rewarded interstitial ads."), "com.google.android.gms.ads"));
    }
}
