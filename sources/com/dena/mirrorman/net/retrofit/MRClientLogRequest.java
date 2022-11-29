package com.dena.mirrorman.net.retrofit;

import ao.d;
import com.dena.mirrativ.mirrativapi.core.StatusResponse;
import ep.c0;
import gr.a;
import gr.o;

/* loaded from: classes2.dex */
public interface MRClientLogRequest {
    @o("api/analytics/log")
    Object analyticsActionRequest(@a c0 c0Var, d<? super StatusResponse> dVar);

    @o("api/analytics/adlog")
    Object analyticsAdRequest(@a c0 c0Var, d<? super StatusResponse> dVar);
}
