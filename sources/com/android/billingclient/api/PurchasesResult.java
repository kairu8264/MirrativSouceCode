package com.android.billingclient.api;

import androidx.annotation.RecentlyNonNull;
import java.util.List;
import jo.p;

/* loaded from: classes.dex */
public final class PurchasesResult {
    private final BillingResult zza;
    private final List<Purchase> zzb;

    /* JADX WARN: Multi-variable type inference failed */
    public PurchasesResult(@RecentlyNonNull BillingResult billingResult, @RecentlyNonNull List<? extends Purchase> list) {
        p.h(billingResult, "billingResult");
        p.h(list, "purchasesList");
        this.zza = billingResult;
        this.zzb = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @RecentlyNonNull
    public static /* synthetic */ PurchasesResult copy$default(@RecentlyNonNull PurchasesResult purchasesResult, @RecentlyNonNull BillingResult billingResult, @RecentlyNonNull List list, int i10, @RecentlyNonNull Object obj) {
        if ((i10 & 1) != 0) {
            billingResult = purchasesResult.zza;
        }
        if ((i10 & 2) != 0) {
            list = purchasesResult.zzb;
        }
        return purchasesResult.copy(billingResult, list);
    }

    public final BillingResult component1() {
        return this.zza;
    }

    public final List<Purchase> component2() {
        return this.zzb;
    }

    public final PurchasesResult copy(@RecentlyNonNull BillingResult billingResult, @RecentlyNonNull List<? extends Purchase> list) {
        p.h(billingResult, "billingResult");
        p.h(list, "purchasesList");
        return new PurchasesResult(billingResult, list);
    }

    public boolean equals(@RecentlyNonNull Object obj) {
        if (this != obj) {
            if (obj instanceof PurchasesResult) {
                PurchasesResult purchasesResult = (PurchasesResult) obj;
                return p.c(this.zza, purchasesResult.zza) && p.c(this.zzb, purchasesResult.zzb);
            }
            return false;
        }
        return true;
    }

    public final BillingResult getBillingResult() {
        return this.zza;
    }

    public final List<Purchase> getPurchasesList() {
        return this.zzb;
    }

    public int hashCode() {
        BillingResult billingResult = this.zza;
        int hashCode = (billingResult != null ? billingResult.hashCode() : 0) * 31;
        List<Purchase> list = this.zzb;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        return "PurchasesResult(billingResult=" + this.zza + ", purchasesList=" + this.zzb + ")";
    }
}
