package com.dena.mirrativ.mirrativapi.otherfeatures;

import ao.d;
import com.dena.mirrativ.mirrativapi.otherfeatures.coin.Coin;
import com.dena.mirrativ.mirrativapi.otherfeatures.coin.GetCoinProductsResponse;
import com.dena.mirrativ.mirrativapi.otherfeatures.live.NuuWelcomeLiveResponse;
import com.dena.mirrativ.mirrativapi.otherfeatures.passbook.coin.CoinHistoriesResponse;
import com.dena.mirrativ.mirrativapi.otherfeatures.passbook.orb.OrbHistoriesResponse;
import gr.c;
import gr.e;
import gr.f;
import gr.i;
import gr.o;
import gr.t;

/* loaded from: classes2.dex */
public interface OtherFeaturesApi {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* loaded from: classes2.dex */
    public static final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final String REFERER = "x-referer";

        private Companion() {
        }
    }

    /* loaded from: classes2.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ Object getUserCoinHistories$default(OtherFeaturesApi otherFeaturesApi, String str, Integer num, d dVar, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 2) != 0) {
                    num = null;
                }
                return otherFeaturesApi.getUserCoinHistories(str, num, dVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getUserCoinHistories");
        }

        public static /* synthetic */ Object getUserOrbHistories$default(OtherFeaturesApi otherFeaturesApi, String str, Integer num, d dVar, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 2) != 0) {
                    num = null;
                }
                return otherFeaturesApi.getUserOrbHistories(str, num, dVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getUserOrbHistories");
        }
    }

    @o("api/purchase/android_coin")
    @e
    Object coinPurchaseRequest(@i("x-referer") String str, @c("receipt") String str2, @c("product_id") String str3, d<? super Coin.Purchase> dVar);

    @f("api/coin/products")
    Object getCoinProducts(@i("x-referer") String str, d<? super GetCoinProductsResponse> dVar);

    @f("api/live/nuu_welcome")
    Object getNuuWelcomeLive(@i("x-referer") String str, d<? super NuuWelcomeLiveResponse> dVar);

    @f("api/user/coin_history")
    Object getUserCoinHistories(@i("x-referer") String str, @t("page") Integer num, d<? super CoinHistoriesResponse> dVar);

    @f("api/user/diamond_history")
    Object getUserOrbHistories(@i("x-referer") String str, @t("page") Integer num, d<? super OrbHistoriesResponse> dVar);

    @f("api/coin/products")
    Object oldCoinProductsRequest(@i("x-referer") String str, d<? super Coin.CoinProducts> dVar);
}
