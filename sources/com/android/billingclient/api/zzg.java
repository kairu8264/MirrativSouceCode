package com.android.billingclient.api;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import ji.a;

/* loaded from: classes.dex */
public final class zzg extends BroadcastReceiver {
    public final /* synthetic */ zzh zza;
    private final PurchasesUpdatedListener zzb;
    private boolean zzc;

    public /* synthetic */ zzg(zzh zzhVar, PurchasesUpdatedListener purchasesUpdatedListener, zzf zzfVar) {
        this.zza = zzhVar;
        this.zzb = purchasesUpdatedListener;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.zzb.onPurchasesUpdated(a.g(intent, "BillingBroadcastManager"), a.i(intent.getExtras()));
    }

    public final void zzb(Context context, IntentFilter intentFilter) {
        zzg zzgVar;
        if (this.zzc) {
            return;
        }
        zzgVar = this.zza.zzb;
        context.registerReceiver(zzgVar, intentFilter);
        this.zzc = true;
    }

    public final void zzc(Context context) {
        zzg zzgVar;
        if (this.zzc) {
            zzgVar = this.zza.zzb;
            context.unregisterReceiver(zzgVar);
            this.zzc = false;
            return;
        }
        a.k("BillingBroadcastManager", "Receiver is not registered.");
    }
}
