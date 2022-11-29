package com.dena.mirrorman.net.live;

import ao.d;
import bo.c;
import co.f;
import co.l;
import com.dena.mirrorman.net.api.response.DashboardCatalog;
import com.dena.mirrorman.net.retrofit.MRRequest;
import io.p;
import uo.q0;
import wn.m;
import wn.v;

@f(c = "com.dena.mirrorman.net.live.GetLiveGameCatalogRequestImpl$execute$2", f = "GetLiveGameCatalogRequestImpl.kt", l = {14}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class GetLiveGameCatalogRequestImpl$execute$2 extends l implements p<q0, d<? super DashboardCatalog>, Object> {
    public final /* synthetic */ String $nextPageKey;
    public int label;
    public final /* synthetic */ GetLiveGameCatalogRequestImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetLiveGameCatalogRequestImpl$execute$2(GetLiveGameCatalogRequestImpl getLiveGameCatalogRequestImpl, String str, d<? super GetLiveGameCatalogRequestImpl$execute$2> dVar) {
        super(2, dVar);
        this.this$0 = getLiveGameCatalogRequestImpl;
        this.$nextPageKey = str;
    }

    @Override // co.a
    public final d<v> create(Object obj, d<?> dVar) {
        return new GetLiveGameCatalogRequestImpl$execute$2(this.this$0, this.$nextPageKey, dVar);
    }

    @Override // io.p
    public final Object invoke(q0 q0Var, d<? super DashboardCatalog> dVar) {
        return ((GetLiveGameCatalogRequestImpl$execute$2) create(q0Var, dVar)).invokeSuspend(v.f59242a);
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
            str = this.this$0.referer;
            str2 = this.this$0.liveGameId;
            String str3 = this.$nextPageKey;
            this.label = 1;
            obj = mRRequest.getLiveGameCatalog(str, str2, str3, this);
            if (obj == c10) {
                return c10;
            }
        } else if (i10 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            m.b(obj);
        }
        return obj;
    }
}
