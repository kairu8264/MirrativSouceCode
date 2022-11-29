package com.android.billingclient.api;

import com.android.billingclient.api.Purchase;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
final class zzz implements Callable<Purchase.PurchasesResult> {
    public final /* synthetic */ String zza;
    public final /* synthetic */ BillingClientImpl zzb;

    public zzz(BillingClientImpl billingClientImpl, String str) {
        this.zzb = billingClientImpl;
        this.zza = str;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Purchase.PurchasesResult call() throws Exception {
        return BillingClientImpl.zzk(this.zzb, this.zza);
    }
}
