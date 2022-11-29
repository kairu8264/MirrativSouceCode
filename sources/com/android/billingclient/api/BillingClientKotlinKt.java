package com.android.billingclient.api;

import androidx.annotation.RecentlyNonNull;
import ao.d;
import java.util.List;
import jo.p;
import uo.a0;
import uo.y;

/* loaded from: classes.dex */
public final class BillingClientKotlinKt {
    @RecentlyNonNull
    public static final Object acknowledgePurchase(@RecentlyNonNull BillingClient billingClient, @RecentlyNonNull AcknowledgePurchaseParams acknowledgePurchaseParams, @RecentlyNonNull d<? super BillingResult> dVar) {
        final y b10 = a0.b(null, 1, null);
        billingClient.acknowledgePurchase(acknowledgePurchaseParams, new AcknowledgePurchaseResponseListener() { // from class: com.android.billingclient.api.BillingClientKotlinKt$acknowledgePurchase$2
            @Override // com.android.billingclient.api.AcknowledgePurchaseResponseListener
            public final void onAcknowledgePurchaseResponse(BillingResult billingResult) {
                y yVar = y.this;
                p.g(billingResult, "it");
                yVar.F(billingResult);
            }
        });
        return b10.o(dVar);
    }

    @RecentlyNonNull
    public static final Object consumePurchase(@RecentlyNonNull BillingClient billingClient, @RecentlyNonNull ConsumeParams consumeParams, @RecentlyNonNull d<? super ConsumeResult> dVar) {
        final y b10 = a0.b(null, 1, null);
        billingClient.consumeAsync(consumeParams, new ConsumeResponseListener() { // from class: com.android.billingclient.api.BillingClientKotlinKt$consumePurchase$2
            @Override // com.android.billingclient.api.ConsumeResponseListener
            public final void onConsumeResponse(BillingResult billingResult, String str) {
                p.g(billingResult, "billingResult");
                y.this.F(new ConsumeResult(billingResult, str));
            }
        });
        return b10.o(dVar);
    }

    @RecentlyNonNull
    public static final Object queryPurchaseHistory(@RecentlyNonNull BillingClient billingClient, @RecentlyNonNull String str, @RecentlyNonNull d<? super PurchaseHistoryResult> dVar) {
        final y b10 = a0.b(null, 1, null);
        billingClient.queryPurchaseHistoryAsync(str, new PurchaseHistoryResponseListener() { // from class: com.android.billingclient.api.BillingClientKotlinKt$queryPurchaseHistory$2
            @Override // com.android.billingclient.api.PurchaseHistoryResponseListener
            public final void onPurchaseHistoryResponse(BillingResult billingResult, List<PurchaseHistoryRecord> list) {
                p.g(billingResult, "billingResult");
                y.this.F(new PurchaseHistoryResult(billingResult, list));
            }
        });
        return b10.o(dVar);
    }

    @RecentlyNonNull
    public static final Object queryPurchasesAsync(@RecentlyNonNull BillingClient billingClient, @RecentlyNonNull String str, @RecentlyNonNull d<? super PurchasesResult> dVar) {
        final y b10 = a0.b(null, 1, null);
        billingClient.queryPurchasesAsync(str, new PurchasesResponseListener() { // from class: com.android.billingclient.api.BillingClientKotlinKt$queryPurchasesAsync$2
            @Override // com.android.billingclient.api.PurchasesResponseListener
            public final void onQueryPurchasesResponse(BillingResult billingResult, List<Purchase> list) {
                p.g(billingResult, "billingResult");
                p.g(list, "purchases");
                y.this.F(new PurchasesResult(billingResult, list));
            }
        });
        return b10.o(dVar);
    }

    @RecentlyNonNull
    public static final Object querySkuDetails(@RecentlyNonNull BillingClient billingClient, @RecentlyNonNull SkuDetailsParams skuDetailsParams, @RecentlyNonNull d<? super SkuDetailsResult> dVar) {
        final y b10 = a0.b(null, 1, null);
        billingClient.querySkuDetailsAsync(skuDetailsParams, new SkuDetailsResponseListener() { // from class: com.android.billingclient.api.BillingClientKotlinKt$querySkuDetails$2
            @Override // com.android.billingclient.api.SkuDetailsResponseListener
            public final void onSkuDetailsResponse(BillingResult billingResult, List<SkuDetails> list) {
                p.g(billingResult, "billingResult");
                y.this.F(new SkuDetailsResult(billingResult, list));
            }
        });
        return b10.o(dVar);
    }
}
