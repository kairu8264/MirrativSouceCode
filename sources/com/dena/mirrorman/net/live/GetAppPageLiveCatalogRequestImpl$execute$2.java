package com.dena.mirrorman.net.live;

import ao.d;
import bo.c;
import co.b;
import co.f;
import co.l;
import com.dena.mirrorman.net.api.Referer;
import com.dena.mirrorman.net.api.response.App;
import com.dena.mirrorman.net.api.response.DashboardCatalog;
import com.dena.mirrorman.net.retrofit.MRRequest;
import io.p;
import uo.q0;
import wn.m;
import wn.v;

@f(c = "com.dena.mirrorman.net.live.GetAppPageLiveCatalogRequestImpl$execute$2", f = "GetAppPageLiveCatalogRequestImpl.kt", l = {15}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class GetAppPageLiveCatalogRequestImpl$execute$2 extends l implements p<q0, d<? super DashboardCatalog>, Object> {
    public final /* synthetic */ String $nextPageKey;
    public int label;
    public final /* synthetic */ GetAppPageLiveCatalogRequestImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetAppPageLiveCatalogRequestImpl$execute$2(GetAppPageLiveCatalogRequestImpl getAppPageLiveCatalogRequestImpl, String str, d<? super GetAppPageLiveCatalogRequestImpl$execute$2> dVar) {
        super(2, dVar);
        this.this$0 = getAppPageLiveCatalogRequestImpl;
        this.$nextPageKey = str;
    }

    @Override // co.a
    public final d<v> create(Object obj, d<?> dVar) {
        return new GetAppPageLiveCatalogRequestImpl$execute$2(this.this$0, this.$nextPageKey, dVar);
    }

    @Override // io.p
    public final Object invoke(q0 q0Var, d<? super DashboardCatalog> dVar) {
        return ((GetAppPageLiveCatalogRequestImpl$execute$2) create(q0Var, dVar)).invokeSuspend(v.f59242a);
    }

    @Override // co.a
    public final Object invokeSuspend(Object obj) {
        MRRequest mRRequest;
        String str;
        Object c10 = c.c();
        int i10 = this.label;
        if (i10 == 0) {
            m.b(obj);
            mRRequest = this.this$0.request;
            str = this.this$0.appId;
            String str2 = this.$nextPageKey;
            Integer d10 = str2 != null ? b.d(Integer.parseInt(str2)) : null;
            this.label = 1;
            obj = mRRequest.getAppPage(Referer.APP_PAGE, str, d10, this);
            if (obj == c10) {
                return c10;
            }
        } else if (i10 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            m.b(obj);
        }
        return DashboardCatalog.Companion.convert((App.AppPage) obj);
    }
}
