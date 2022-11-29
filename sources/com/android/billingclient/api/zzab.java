package com.android.billingclient.api;

import java.util.concurrent.Callable;

/* loaded from: classes.dex */
final class zzab implements Callable<Void> {
    public final /* synthetic */ String zza;
    public final /* synthetic */ PurchaseHistoryResponseListener zzb;
    public final /* synthetic */ BillingClientImpl zzc;

    public zzab(BillingClientImpl billingClientImpl, String str, PurchaseHistoryResponseListener purchaseHistoryResponseListener) {
        this.zzc = billingClientImpl;
        this.zza = str;
        this.zzb = purchaseHistoryResponseListener;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Void call() throws Exception {
        zzag zzi = BillingClientImpl.zzi(this.zzc, this.zza);
        this.zzb.onPurchaseHistoryResponse(zzi.zza(), zzi.zzb());
        return null;
    }
}
