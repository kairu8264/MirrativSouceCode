package com.android.billingclient.api;

import java.util.List;

@zze
/* loaded from: classes.dex */
public interface PurchasesResponseListener {
    @zze
    void onQueryPurchasesResponse(BillingResult billingResult, List<Purchase> list);
}
