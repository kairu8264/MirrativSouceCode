package com.android.billingclient.api;

import androidx.annotation.RecentlyNonNull;
import java.util.List;
import jo.p;

/* loaded from: classes.dex */
public final class PurchaseHistoryResult {
    private final BillingResult zza;
    private final List<PurchaseHistoryRecord> zzb;

    /* JADX WARN: Multi-variable type inference failed */
    public PurchaseHistoryResult(@RecentlyNonNull BillingResult billingResult, List<? extends PurchaseHistoryRecord> list) {
        p.h(billingResult, "billingResult");
        this.zza = billingResult;
        this.zzb = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @RecentlyNonNull
    public static /* synthetic */ PurchaseHistoryResult copy$default(@RecentlyNonNull PurchaseHistoryResult purchaseHistoryResult, @RecentlyNonNull BillingResult billingResult, @RecentlyNonNull List list, int i10, @RecentlyNonNull Object obj) {
        if ((i10 & 1) != 0) {
            billingResult = purchaseHistoryResult.zza;
        }
        if ((i10 & 2) != 0) {
            list = purchaseHistoryResult.zzb;
        }
        return purchaseHistoryResult.copy(billingResult, list);
    }

    public final BillingResult component1() {
        return this.zza;
    }

    @RecentlyNonNull
    public final List<PurchaseHistoryRecord> component2() {
        return this.zzb;
    }

    public final PurchaseHistoryResult copy(@RecentlyNonNull BillingResult billingResult, List<? extends PurchaseHistoryRecord> list) {
        p.h(billingResult, "billingResult");
        return new PurchaseHistoryResult(billingResult, list);
    }

    public boolean equals(@RecentlyNonNull Object obj) {
        if (this != obj) {
            if (obj instanceof PurchaseHistoryResult) {
                PurchaseHistoryResult purchaseHistoryResult = (PurchaseHistoryResult) obj;
                return p.c(this.zza, purchaseHistoryResult.zza) && p.c(this.zzb, purchaseHistoryResult.zzb);
            }
            return false;
        }
        return true;
    }

    public final BillingResult getBillingResult() {
        return this.zza;
    }

    @RecentlyNonNull
    public final List<PurchaseHistoryRecord> getPurchaseHistoryRecordList() {
        return this.zzb;
    }

    public int hashCode() {
        BillingResult billingResult = this.zza;
        int hashCode = (billingResult != null ? billingResult.hashCode() : 0) * 31;
        List<PurchaseHistoryRecord> list = this.zzb;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        return "PurchaseHistoryResult(billingResult=" + this.zza + ", purchaseHistoryRecordList=" + this.zzb + ")";
    }
}
