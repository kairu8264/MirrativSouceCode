package com.android.billingclient.api;

import android.text.TextUtils;

/* loaded from: classes.dex */
public final class zzap {
    private String zza;

    private zzap() {
    }

    public /* synthetic */ zzap(zzao zzaoVar) {
    }

    public final zzap zza(String str) {
        this.zza = str;
        return this;
    }

    public final zzaq zzb() {
        if (!TextUtils.isEmpty(this.zza)) {
            return new zzaq(this.zza, null, null);
        }
        throw new IllegalArgumentException("SKU must be set.");
    }
}
