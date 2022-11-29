package com.dena.mirrorman.clientlog.logs;

import java.util.HashMap;
import jo.h;
import jo.p;

/* loaded from: classes2.dex */
public final class Review extends ActionLogBase {
    public static final int $stable = 0;
    public static final String CANCEL = ".cancel";
    public static final Companion Companion = new Companion(null);
    public static final String NO = ".no";
    public static final String REVIEW_REQUIRE = "ReviewRequire";
    public static final String SATISFACTION_CONFIRM = "SatisfactionConfirm";
    public static final String SHOW = ".show";
    public static final String YES = ".yes";

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(h hVar) {
            this();
        }
    }

    public Review(String str, String str2) {
        super("review", MRLog.TARGET_TYPE_SERVICE, "");
        HashMap<String, String> hashMap = this.payload;
        p.e(str);
        hashMap.put(MRLog.PAYLOAD_KEY_LIVE_ID, str);
        HashMap<String, String> hashMap2 = this.payload;
        p.e(str2);
        hashMap2.put(MRLog.PAYLOAD_KEY_TARGET_DETAIL, str2);
    }
}
