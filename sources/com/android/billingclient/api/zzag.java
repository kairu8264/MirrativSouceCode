package com.android.billingclient.api;

import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzag {
    private final List<PurchaseHistoryRecord> zza;
    private final BillingResult zzb;

    public zzag(BillingResult billingResult, List<PurchaseHistoryRecord> list) {
        this.zza = list;
        this.zzb = billingResult;
    }

    public final BillingResult zza() {
        return this.zzb;
    }

    public final List<PurchaseHistoryRecord> zzb() {
        return this.zza;
    }
}
