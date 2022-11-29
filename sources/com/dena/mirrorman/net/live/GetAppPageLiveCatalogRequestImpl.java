package com.dena.mirrorman.net.live;

import ao.d;
import com.dena.mirrorman.net.api.response.DashboardCatalog;
import com.dena.mirrorman.net.retrofit.MRRequest;
import jo.p;
import uo.r0;

/* loaded from: classes2.dex */
public final class GetAppPageLiveCatalogRequestImpl implements GetLiveCatalogRequest {
    public static final int $stable = 8;
    private final String appId;
    private final boolean asSmall;
    private final MRRequest request;

    public GetAppPageLiveCatalogRequestImpl(MRRequest mRRequest, String str) {
        p.h(mRRequest, "request");
        p.h(str, "appId");
        this.request = mRRequest;
        this.appId = str;
    }

    @Override // com.dena.mirrorman.net.live.GetLiveCatalogRequest
    public Object execute(String str, d<? super DashboardCatalog> dVar) {
        return r0.e(new GetAppPageLiveCatalogRequestImpl$execute$2(this, str, null), dVar);
    }

    @Override // com.dena.mirrorman.net.live.GetLiveCatalogRequest
    public boolean getAsSmall() {
        return this.asSmall;
    }
}
