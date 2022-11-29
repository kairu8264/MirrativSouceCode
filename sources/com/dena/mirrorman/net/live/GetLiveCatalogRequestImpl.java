package com.dena.mirrorman.net.live;

import ao.d;
import com.dena.mirrorman.net.api.response.DashboardCatalog;
import com.dena.mirrorman.net.retrofit.MRRequest;
import jo.h;
import kf.p;
import uo.r0;

/* loaded from: classes2.dex */
public final class GetLiveCatalogRequestImpl implements GetLiveCatalogRequest {
    public static final int $stable = 0;
    private final String appId;
    private final boolean asSmall;
    private final String catalogId;
    private final p noticePreference;
    private final String referer;
    private final MRRequest request;

    public GetLiveCatalogRequestImpl(MRRequest mRRequest, p pVar, String str, String str2, String str3) {
        jo.p.h(mRRequest, "request");
        jo.p.h(pVar, "noticePreference");
        jo.p.h(str, "referer");
        jo.p.h(str2, "catalogId");
        this.request = mRRequest;
        this.noticePreference = pVar;
        this.referer = str;
        this.catalogId = str2;
        this.appId = str3;
    }

    @Override // com.dena.mirrorman.net.live.GetLiveCatalogRequest
    public Object execute(String str, d<? super DashboardCatalog> dVar) {
        return r0.e(new GetLiveCatalogRequestImpl$execute$2(this, str, null), dVar);
    }

    @Override // com.dena.mirrorman.net.live.GetLiveCatalogRequest
    public boolean getAsSmall() {
        return this.asSmall;
    }

    public /* synthetic */ GetLiveCatalogRequestImpl(MRRequest mRRequest, p pVar, String str, String str2, String str3, int i10, h hVar) {
        this(mRRequest, pVar, str, str2, (i10 & 16) != 0 ? null : str3);
    }
}
