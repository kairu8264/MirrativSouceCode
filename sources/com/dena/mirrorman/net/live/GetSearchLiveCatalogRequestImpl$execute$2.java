package com.dena.mirrorman.net.live;

import ao.d;
import bo.c;
import co.b;
import co.f;
import co.l;
import com.dena.mirrorman.net.api.Referer;
import com.dena.mirrorman.net.api.response.DashboardCatalog;
import com.dena.mirrorman.net.api.response.live.LivesResponse;
import com.dena.mirrorman.net.retrofit.MRRequest;
import io.p;
import uo.q0;
import wn.m;
import wn.v;

@f(c = "com.dena.mirrorman.net.live.GetSearchLiveCatalogRequestImpl$execute$2", f = "GetSearchLiveCatalogRequestImpl.kt", l = {16}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class GetSearchLiveCatalogRequestImpl$execute$2 extends l implements p<q0, d<? super DashboardCatalog>, Object> {
    public final /* synthetic */ String $nextPageKey;
    public int label;
    public final /* synthetic */ GetSearchLiveCatalogRequestImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetSearchLiveCatalogRequestImpl$execute$2(GetSearchLiveCatalogRequestImpl getSearchLiveCatalogRequestImpl, String str, d<? super GetSearchLiveCatalogRequestImpl$execute$2> dVar) {
        super(2, dVar);
        this.this$0 = getSearchLiveCatalogRequestImpl;
        this.$nextPageKey = str;
    }

    @Override // co.a
    public final d<v> create(Object obj, d<?> dVar) {
        return new GetSearchLiveCatalogRequestImpl$execute$2(this.this$0, this.$nextPageKey, dVar);
    }

    @Override // io.p
    public final Object invoke(q0 q0Var, d<? super DashboardCatalog> dVar) {
        return ((GetSearchLiveCatalogRequestImpl$execute$2) create(q0Var, dVar)).invokeSuspend(v.f59242a);
    }

    @Override // co.a
    public final Object invokeSuspend(Object obj) {
        MRRequest mRRequest;
        String str;
        String str2;
        Object c10 = c.c();
        int i10 = this.label;
        if (i10 == 0) {
            m.b(obj);
            mRRequest = this.this$0.request;
            str = this.this$0.searchWord;
            String str3 = this.$nextPageKey;
            Integer d10 = str3 != null ? b.d(Integer.parseInt(str3)) : null;
            str2 = this.this$0.appId;
            this.label = 1;
            obj = mRRequest.getLiveSearch(Referer.Search.LIVE, str, d10, str2, this);
            if (obj == c10) {
                return c10;
            }
        } else if (i10 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            m.b(obj);
        }
        return DashboardCatalog.Companion.convert((LivesResponse) obj);
    }
}
