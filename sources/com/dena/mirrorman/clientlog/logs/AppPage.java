package com.dena.mirrorman.clientlog.logs;

import java.util.HashMap;
import jo.p;

/* loaded from: classes2.dex */
public final class AppPage {
    public static final int $stable = 0;

    /* loaded from: classes2.dex */
    public static final class Launch extends ActionLogBase {
        public static final int $stable = 0;

        public Launch(String str, String str2, boolean z10) {
            super("apppage.launch", "app", str);
            HashMap<String, String> hashMap = this.payload;
            p.e(str2);
            hashMap.put(MRLog.PAYLOAD_KEY_WHERE, str2);
            this.payload.put(MRLog.PAYLOAD_KEY_TARGET_DETAIL, String.valueOf(z10));
        }
    }
}
