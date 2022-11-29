package com.android.billingclient.api;

import androidx.annotation.RecentlyNonNull;
import java.util.List;
import jo.p;

/* loaded from: classes.dex */
public final class SkuDetailsResult {
    private final BillingResult zza;
    private final List<SkuDetails> zzb;

    /* JADX WARN: Multi-variable type inference failed */
    public SkuDetailsResult(@RecentlyNonNull BillingResult billingResult, List<? extends SkuDetails> list) {
        p.h(billingResult, "billingResult");
        this.zza = billingResult;
        this.zzb = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @RecentlyNonNull
    public static /* synthetic */ SkuDetailsResult copy$default(@RecentlyNonNull SkuDetailsResult skuDetailsResult, @RecentlyNonNull BillingResult billingResult, @RecentlyNonNull List list, int i10, @RecentlyNonNull Object obj) {
        if ((i10 & 1) != 0) {
            billingResult = skuDetailsResult.zza;
        }
        if ((i10 & 2) != 0) {
            list = skuDetailsResult.zzb;
        }
        return skuDetailsResult.copy(billingResult, list);
    }

    public final BillingResult component1() {
        return this.zza;
    }

    @RecentlyNonNull
    public final List<SkuDetails> component2() {
        return this.zzb;
    }

    public final SkuDetailsResult copy(@RecentlyNonNull BillingResult billingResult, List<? extends SkuDetails> list) {
        p.h(billingResult, "billingResult");
        return new SkuDetailsResult(billingResult, list);
    }

    public boolean equals(@RecentlyNonNull Object obj) {
        if (this != obj) {
            if (obj instanceof SkuDetailsResult) {
                SkuDetailsResult skuDetailsResult = (SkuDetailsResult) obj;
                return p.c(this.zza, skuDetailsResult.zza) && p.c(this.zzb, skuDetailsResult.zzb);
            }
            return false;
        }
        return true;
    }

    public final BillingResult getBillingResult() {
        return this.zza;
    }

    @RecentlyNonNull
    public final List<SkuDetails> getSkuDetailsList() {
        return this.zzb;
    }

    public int hashCode() {
        BillingResult billingResult = this.zza;
        int hashCode = (billingResult != null ? billingResult.hashCode() : 0) * 31;
        List<SkuDetails> list = this.zzb;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        return "SkuDetailsResult(billingResult=" + this.zza + ", skuDetailsList=" + this.zzb + ")";
    }
}
