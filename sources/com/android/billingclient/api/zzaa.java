package com.android.billingclient.api;

import com.android.billingclient.api.Purchase;
import java.util.concurrent.Callable;
import ji.p;

/* loaded from: classes.dex */
final class zzaa implements Callable<Void> {
    public final /* synthetic */ String zza;
    public final /* synthetic */ PurchasesResponseListener zzb;
    public final /* synthetic */ BillingClientImpl zzc;

    public zzaa(BillingClientImpl billingClientImpl, String str, PurchasesResponseListener purchasesResponseListener) {
        this.zzc = billingClientImpl;
        this.zza = str;
        this.zzb = purchasesResponseListener;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Void call() throws Exception {
        Purchase.PurchasesResult zzk = BillingClientImpl.zzk(this.zzc, this.zza);
        if (zzk.getPurchasesList() != null) {
            this.zzb.onQueryPurchasesResponse(zzk.getBillingResult(), zzk.getPurchasesList());
            return null;
        }
        this.zzb.onQueryPurchasesResponse(zzk.getBillingResult(), p.l());
        return null;
    }
}
