package wd;

import com.dena.mirrativ.mirrativapi.core.StatusResponse;
import com.dena.mirrorman.clientlog.logs.ActionLogBase;
import com.dena.mirrorman.net.retrofit.MRClientLogRequest;
import ep.c0;

/* loaded from: classes2.dex */
public final class a extends c {
    @Override // n8.c
    public String i() {
        return ActionLogBase.ACTION;
    }

    @Override // wd.c
    public Object o(MRClientLogRequest mRClientLogRequest, c0 c0Var, ao.d<? super StatusResponse> dVar) {
        return mRClientLogRequest.analyticsActionRequest(c0Var, dVar);
    }
}
