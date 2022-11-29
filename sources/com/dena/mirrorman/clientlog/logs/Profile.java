package com.dena.mirrorman.clientlog.logs;

import java.util.HashMap;
import jo.p;

/* loaded from: classes2.dex */
public final class Profile {
    public static final int $stable = 0;

    /* loaded from: classes2.dex */
    public static final class Launch extends ActionLogBase {
        public static final int $stable = 0;

        public Launch(String str, String str2, String str3) {
            super("profile.launch", MRLog.TARGET_TYPE_USER, str);
            HashMap<String, String> hashMap = this.payload;
            p.e(str3);
            hashMap.put(MRLog.PAYLOAD_KEY_TARGET_DETAIL, str3);
            HashMap<String, String> hashMap2 = this.payload;
            p.e(str2);
            hashMap2.put(MRLog.PAYLOAD_KEY_WHERE, str2);
        }
    }
}
