package com.android.billingclient.api;

import android.text.TextUtils;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class BillingFlowParams {
    public static final String EXTRA_PARAM_KEY_ACCOUNT_ID = "accountId";
    public static final String EXTRA_PARAM_KEY_OLD_SKUS = "skusToReplace";
    public static final String EXTRA_PARAM_KEY_OLD_SKU_PURCHASE_TOKEN = "oldSkuPurchaseToken";
    public static final String EXTRA_PARAM_KEY_REPLACE_SKUS_PRORATION_MODE = "prorationMode";
    public static final String EXTRA_PARAM_KEY_VR = "vr";
    private boolean zza;
    private String zzb;
    private String zzc;
    private String zzd;
    private int zze = 0;
    private ArrayList<SkuDetails> zzf;
    private boolean zzg;

    /* loaded from: classes.dex */
    public static class Builder {
        private String zza;
        private String zzb;
        private String zzc;
        private int zzd = 0;
        private ArrayList<SkuDetails> zze;
        private boolean zzf;

        private Builder() {
        }

        public /* synthetic */ Builder(zzai zzaiVar) {
        }

        public BillingFlowParams build() {
            ArrayList<SkuDetails> arrayList = this.zze;
            if (arrayList != null && !arrayList.isEmpty()) {
                ArrayList<SkuDetails> arrayList2 = this.zze;
                int size = arrayList2.size();
                int i10 = 0;
                while (i10 < size) {
                    int i11 = i10 + 1;
                    if (arrayList2.get(i10) == null) {
                        throw new IllegalArgumentException("SKU cannot be null.");
                    }
                    i10 = i11;
                }
                if (this.zze.size() > 1) {
                    SkuDetails skuDetails = this.zze.get(0);
                    String type = skuDetails.getType();
                    ArrayList<SkuDetails> arrayList3 = this.zze;
                    int size2 = arrayList3.size();
                    for (int i12 = 0; i12 < size2; i12++) {
                        SkuDetails skuDetails2 = arrayList3.get(i12);
                        if (!type.equals("play_pass_subs") && !skuDetails2.getType().equals("play_pass_subs") && !type.equals(skuDetails2.getType())) {
                            throw new IllegalArgumentException("SKUs should have the same type.");
                        }
                    }
                    String zzc = skuDetails.zzc();
                    ArrayList<SkuDetails> arrayList4 = this.zze;
                    int size3 = arrayList4.size();
                    for (int i13 = 0; i13 < size3; i13++) {
                        SkuDetails skuDetails3 = arrayList4.get(i13);
                        if (!type.equals("play_pass_subs") && !skuDetails3.getType().equals("play_pass_subs") && !zzc.equals(skuDetails3.zzc())) {
                            throw new IllegalArgumentException("All SKUs must have the same package name.");
                        }
                    }
                }
                BillingFlowParams billingFlowParams = new BillingFlowParams(null);
                billingFlowParams.zza = true ^ this.zze.get(0).zzc().isEmpty();
                billingFlowParams.zzb = this.zza;
                billingFlowParams.zzd = this.zzc;
                billingFlowParams.zzc = this.zzb;
                billingFlowParams.zze = this.zzd;
                billingFlowParams.zzf = this.zze;
                billingFlowParams.zzg = this.zzf;
                return billingFlowParams;
            }
            throw new IllegalArgumentException("SkuDetails must be provided.");
        }

        public Builder setObfuscatedAccountId(String str) {
            this.zza = str;
            return this;
        }

        public Builder setObfuscatedProfileId(String str) {
            this.zzc = str;
            return this;
        }

        public Builder setSkuDetails(SkuDetails skuDetails) {
            ArrayList<SkuDetails> arrayList = new ArrayList<>();
            arrayList.add(skuDetails);
            this.zze = arrayList;
            return this;
        }

        @zzc
        public Builder setSubscriptionUpdateParams(SubscriptionUpdateParams subscriptionUpdateParams) {
            this.zzb = subscriptionUpdateParams.getOldSkuPurchaseToken();
            this.zzd = subscriptionUpdateParams.getReplaceSkusProrationMode();
            return this;
        }

        public Builder setVrPurchaseFlow(boolean z10) {
            this.zzf = z10;
            return this;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface ProrationMode {
        public static final int DEFERRED = 4;
        @zzb
        public static final int IMMEDIATE_AND_CHARGE_FULL_PRICE = 5;
        public static final int IMMEDIATE_AND_CHARGE_PRORATED_PRICE = 2;
        public static final int IMMEDIATE_WITHOUT_PRORATION = 3;
        public static final int IMMEDIATE_WITH_TIME_PRORATION = 1;
        public static final int UNKNOWN_SUBSCRIPTION_UPGRADE_DOWNGRADE_POLICY = 0;
    }

    @zzc
    /* loaded from: classes.dex */
    public static class SubscriptionUpdateParams {
        private String zza;
        private int zzb = 0;

        @zzc
        /* loaded from: classes.dex */
        public static class Builder {
            private String zza;
            private int zzb = 0;

            private Builder() {
            }

            public /* synthetic */ Builder(zzai zzaiVar) {
            }

            @zzc
            public SubscriptionUpdateParams build() {
                if (TextUtils.isEmpty(this.zza) && TextUtils.isEmpty(null)) {
                    throw new IllegalArgumentException("Old SKU purchase token/id must be provided.");
                }
                SubscriptionUpdateParams subscriptionUpdateParams = new SubscriptionUpdateParams(null);
                subscriptionUpdateParams.zza = this.zza;
                subscriptionUpdateParams.zzb = this.zzb;
                return subscriptionUpdateParams;
            }

            @zzc
            public Builder setOldSkuPurchaseToken(String str) {
                this.zza = str;
                return this;
            }

            @zzc
            public Builder setReplaceSkusProrationMode(int i10) {
                this.zzb = i10;
                return this;
            }
        }

        private SubscriptionUpdateParams() {
        }

        public /* synthetic */ SubscriptionUpdateParams(zzai zzaiVar) {
        }

        @zzc
        public static Builder newBuilder() {
            return new Builder(null);
        }

        @zzc
        public String getOldSkuPurchaseToken() {
            return this.zza;
        }

        @zzc
        public int getReplaceSkusProrationMode() {
            return this.zzb;
        }
    }

    private BillingFlowParams() {
    }

    public /* synthetic */ BillingFlowParams(zzai zzaiVar) {
    }

    public static Builder newBuilder() {
        return new Builder(null);
    }

    public boolean getVrPurchaseFlow() {
        return this.zzg;
    }

    public final int zzb() {
        return this.zze;
    }

    public final String zzf() {
        return this.zzb;
    }

    public final String zzg() {
        return this.zzd;
    }

    public final String zzh() {
        return this.zzc;
    }

    public final ArrayList<SkuDetails> zzj() {
        ArrayList<SkuDetails> arrayList = new ArrayList<>();
        arrayList.addAll(this.zzf);
        return arrayList;
    }

    public final boolean zzm() {
        return (!this.zzg && this.zzb == null && this.zzd == null && this.zze == 0 && !this.zza) ? false : true;
    }
}
