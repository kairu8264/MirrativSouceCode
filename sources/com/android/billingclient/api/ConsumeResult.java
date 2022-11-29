package com.android.billingclient.api;

import androidx.annotation.RecentlyNonNull;
import jo.p;

/* loaded from: classes.dex */
public final class ConsumeResult {
    private final BillingResult zza;
    private final String zzb;

    public ConsumeResult(@RecentlyNonNull BillingResult billingResult, String str) {
        p.h(billingResult, "billingResult");
        this.zza = billingResult;
        this.zzb = str;
    }

    @RecentlyNonNull
    public static /* synthetic */ ConsumeResult copy$default(@RecentlyNonNull ConsumeResult consumeResult, @RecentlyNonNull BillingResult billingResult, @RecentlyNonNull String str, int i10, @RecentlyNonNull Object obj) {
        if ((i10 & 1) != 0) {
            billingResult = consumeResult.zza;
        }
        if ((i10 & 2) != 0) {
            str = consumeResult.zzb;
        }
        return consumeResult.copy(billingResult, str);
    }

    public final BillingResult component1() {
        return this.zza;
    }

    @RecentlyNonNull
    public final String component2() {
        return this.zzb;
    }

    public final ConsumeResult copy(@RecentlyNonNull BillingResult billingResult, String str) {
        p.h(billingResult, "billingResult");
        return new ConsumeResult(billingResult, str);
    }

    public boolean equals(@RecentlyNonNull Object obj) {
        if (this != obj) {
            if (obj instanceof ConsumeResult) {
                ConsumeResult consumeResult = (ConsumeResult) obj;
                return p.c(this.zza, consumeResult.zza) && p.c(this.zzb, consumeResult.zzb);
            }
            return false;
        }
        return true;
    }

    public final BillingResult getBillingResult() {
        return this.zza;
    }

    @RecentlyNonNull
    public final String getPurchaseToken() {
        return this.zzb;
    }

    public int hashCode() {
        BillingResult billingResult = this.zza;
        int hashCode = (billingResult != null ? billingResult.hashCode() : 0) * 31;
        String str = this.zzb;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "ConsumeResult(billingResult=" + this.zza + ", purchaseToken=" + this.zzb + ")";
    }
}
