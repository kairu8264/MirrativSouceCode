package com.dena.mirrorman.net.live;

import ao.d;
import bo.c;
import co.f;
import co.l;
import com.dena.mirrorman.net.api.response.DashboardCatalog;
import com.dena.mirrorman.net.api.response.DashboardCatalogItem;
import com.dena.mirrorman.net.api.response.live.LiveBasicParams;
import com.dena.mirrorman.net.retrofit.MRRequest;
import io.p;
import java.util.List;
import uo.q0;
import wn.m;
import wn.v;

@f(c = "com.dena.mirrorman.net.live.GetLiveCatalogRequestImpl$execute$2", f = "GetLiveCatalogRequestImpl.kt", l = {17}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class GetLiveCatalogRequestImpl$execute$2 extends l implements p<q0, d<? super DashboardCatalog>, Object> {
    public final /* synthetic */ String $nextPageKey;
    public int label;
    public final /* synthetic */ GetLiveCatalogRequestImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetLiveCatalogRequestImpl$execute$2(GetLiveCatalogRequestImpl getLiveCatalogRequestImpl, String str, d<? super GetLiveCatalogRequestImpl$execute$2> dVar) {
        super(2, dVar);
        this.this$0 = getLiveCatalogRequestImpl;
        this.$nextPageKey = str;
    }

    @Override // co.a
    public final d<v> create(Object obj, d<?> dVar) {
        return new GetLiveCatalogRequestImpl$execute$2(this.this$0, this.$nextPageKey, dVar);
    }

    @Override // io.p
    public final Object invoke(q0 q0Var, d<? super DashboardCatalog> dVar) {
        return ((GetLiveCatalogRequestImpl$execute$2) create(q0Var, dVar)).invokeSuspend(v.f59242a);
    }

    @Override // co.a
    public final Object invokeSuspend(Object obj) {
        MRRequest mRRequest;
        String str;
        String str2;
        String str3;
        kf.p pVar;
        Object c10 = c.c();
        int i10 = this.label;
        if (i10 == 0) {
            m.b(obj);
            mRRequest = this.this$0.request;
            str = this.this$0.referer;
            str2 = this.this$0.catalogId;
            str3 = this.this$0.appId;
            String str4 = this.$nextPageKey;
            this.label = 1;
            obj = mRRequest.getLiveCatalog(str, str2, str3, str4, this);
            if (obj == c10) {
                return c10;
            }
        } else if (i10 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            m.b(obj);
        }
        DashboardCatalog dashboardCatalog = (DashboardCatalog) obj;
        List<DashboardCatalogItem> list = dashboardCatalog.getList();
        GetLiveCatalogRequestImpl getLiveCatalogRequestImpl = this.this$0;
        for (DashboardCatalogItem dashboardCatalogItem : list) {
            LiveBasicParams live_small = dashboardCatalogItem.getLive_small();
            if (live_small != null) {
                LiveBasicParams live_small2 = dashboardCatalogItem.getLive_small();
                long startedAt = live_small2 != null ? live_small2.getStartedAt() : 0L;
                pVar = getLiveCatalogRequestImpl.noticePreference;
                live_small.setNew(startedAt > pVar.b5());
            }
        }
        return dashboardCatalog;
    }
}
