package com.dena.mirrorman.clientlog.logs;

import jo.p;

/* loaded from: classes2.dex */
public final class OpenDeeplink extends ActionLogBase {
    public static final int $stable = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OpenDeeplink(String str) {
        super("open_deeplink", "", "");
        p.h(str, "url");
        this.payload.put("url", str);
    }
}
