package com.dena.mirrorman.clientlog.logs;

import android.text.TextUtils;
import jo.p;

/* loaded from: classes2.dex */
public final class AdClick extends AdLogBase {
    public static final int $stable = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdClick(String str, String str2, String str3) {
        super(MRLog.ACTION_TYPE_CLICK, str, str3);
        p.h(str2, "actionUrl");
        p.h(str3, "referer");
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        getPayload().put(MRLog.PAYLOAD_ACTION_URL, str2);
    }
}
