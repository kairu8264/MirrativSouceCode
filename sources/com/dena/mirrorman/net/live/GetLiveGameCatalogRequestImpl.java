package com.dena.mirrorman.net.live;

import ao.d;
import com.dena.mirrorman.net.api.response.DashboardCatalog;
import com.dena.mirrorman.net.retrofit.MRRequest;
import jo.p;
import uo.r0;

/* loaded from: classes2.dex */
public final class GetLiveGameCatalogRequestImpl implements GetLiveCatalogRequest {
    public static final int $stable = 8;
    private final boolean asSmall;
    private final String liveGameId;
    private final String referer;
    private final MRRequest request;

    public GetLiveGameCatalogRequestImpl(MRRequest mRRequest, String str, String str2) {
        p.h(mRRequest, "request");
        p.h(str, "referer");
        p.h(str2, "liveGameId");
        this.request = mRRequest;
        this.referer = str;
        this.liveGameId = str2;
        this.asSmall = true;
    }

    @Override // com.dena.mirrorman.net.live.GetLiveCatalogRequest
    public Object execute(String str, d<? super DashboardCatalog> dVar) {
        return r0.e(new GetLiveGameCatalogRequestImpl$execute$2(this, str, null), dVar);
    }

    @Override // com.dena.mirrorman.net.live.GetLiveCatalogRequest
    public boolean getAsSmall() {
        return this.asSmall;
    }
}
