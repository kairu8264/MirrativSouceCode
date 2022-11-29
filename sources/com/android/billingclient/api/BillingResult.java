package com.android.billingclient.api;

/* loaded from: classes.dex */
public final class BillingResult {
    private int zza;
    private String zzb;

    /* loaded from: classes.dex */
    public static class Builder {
        private int zza;
        private String zzb = "";

        private Builder() {
        }

        public /* synthetic */ Builder(zzaj zzajVar) {
        }

        public BillingResult build() {
            BillingResult billingResult = new BillingResult();
            billingResult.zza = this.zza;
            billingResult.zzb = this.zzb;
            return billingResult;
        }

        public Builder setDebugMessage(String str) {
            this.zzb = str;
            return this;
        }

        public Builder setResponseCode(int i10) {
            this.zza = i10;
            return this;
        }
    }

    public static Builder newBuilder() {
        return new Builder(null);
    }

    public String getDebugMessage() {
        return this.zzb;
    }

    public int getResponseCode() {
        return this.zza;
    }
}
