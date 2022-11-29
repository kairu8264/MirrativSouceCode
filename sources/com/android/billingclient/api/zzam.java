package com.android.billingclient.api;

import android.os.Bundle;
import com.android.billingclient.api.BillingResult;
import java.util.ArrayList;
import ji.a;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzam {
    public static BillingResult zza(Bundle bundle, String str, String str2) {
        BillingResult billingResult = zzak.zzl;
        if (bundle == null) {
            a.k("BillingClient", String.format("%s got null owned items list", str2));
            return billingResult;
        }
        int a10 = a.a(bundle, "BillingClient");
        String h10 = a.h(bundle, "BillingClient");
        BillingResult.Builder newBuilder = BillingResult.newBuilder();
        newBuilder.setResponseCode(a10);
        newBuilder.setDebugMessage(h10);
        BillingResult build = newBuilder.build();
        if (a10 != 0) {
            a.k("BillingClient", String.format("%s failed. Response code: %s", str2, Integer.valueOf(a10)));
            return build;
        } else if (bundle.containsKey("INAPP_PURCHASE_ITEM_LIST") && bundle.containsKey("INAPP_PURCHASE_DATA_LIST") && bundle.containsKey("INAPP_DATA_SIGNATURE_LIST")) {
            ArrayList<String> stringArrayList = bundle.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
            ArrayList<String> stringArrayList2 = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
            ArrayList<String> stringArrayList3 = bundle.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
            if (stringArrayList == null) {
                a.k("BillingClient", String.format("Bundle returned from %s contains null SKUs list.", str2));
                return billingResult;
            } else if (stringArrayList2 == null) {
                a.k("BillingClient", String.format("Bundle returned from %s contains null purchases list.", str2));
                return billingResult;
            } else if (stringArrayList3 == null) {
                a.k("BillingClient", String.format("Bundle returned from %s contains null signatures list.", str2));
                return billingResult;
            } else {
                return zzak.zzp;
            }
        } else {
            a.k("BillingClient", String.format("Bundle returned from %s doesn't contain required fields.", str2));
            return billingResult;
        }
    }
}
