package com.android.billingclient.api;

import android.content.Context;
import android.content.IntentFilter;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzh {
    private final Context zza;
    private final zzg zzb;

    public zzh(Context context, PurchasesUpdatedListener purchasesUpdatedListener) {
        this.zza = context;
        this.zzb = new zzg(this, purchasesUpdatedListener, null);
    }

    public final PurchasesUpdatedListener zzb() {
        return zzg.zza(this.zzb);
    }

    public final void zzc() {
        this.zzb.zzc(this.zza);
    }

    public final void zzd() {
        this.zzb.zzb(this.zza, new IntentFilter("com.android.vending.billing.PURCHASES_UPDATED"));
    }
}
