package com.dena.mirrorman.clientlog.logs;

import jo.p;

/* loaded from: classes2.dex */
public final class AdImp extends AdLogBase {
    public static final int $stable = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdImp(String str, String str2) {
        super(MRLog.TARGET_ID_IMP, str, str2);
        p.h(str2, "referer");
    }
}
