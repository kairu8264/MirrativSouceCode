package com.dena.mirrorman.net.live;

import ao.d;
import com.dena.mirrorman.net.api.response.DashboardCatalog;

/* loaded from: classes2.dex */
public interface GetLiveCatalogRequest {

    /* loaded from: classes2.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ Object execute$default(GetLiveCatalogRequest getLiveCatalogRequest, String str, d dVar, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 1) != 0) {
                    str = null;
                }
                return getLiveCatalogRequest.execute(str, dVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: execute");
        }
    }

    Object execute(String str, d<? super DashboardCatalog> dVar);

    boolean getAsSmall();
}
