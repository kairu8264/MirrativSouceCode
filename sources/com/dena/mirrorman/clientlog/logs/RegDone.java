package com.dena.mirrorman.clientlog.logs;

import java.util.HashMap;
import jo.h;
import jo.p;

/* loaded from: classes2.dex */
public final class RegDone extends ActionLogBase {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    public static final String PROVIDER_TYPE_BLANK = "";
    public static final String PROVIDER_TYPE_TWITTER = "twitter";

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(h hVar) {
            this();
        }
    }

    public RegDone(String str, String str2) {
        super("reg_done", MRLog.TARGET_TYPE_SERVICE, "");
        HashMap<String, String> hashMap = this.payload;
        p.e(str);
        hashMap.put("social_login_provider", str);
        HashMap<String, String> hashMap2 = this.payload;
        p.e(str2);
        hashMap2.put(MRLog.PAYLOAD_KEY_WHERE, str2);
    }
}
