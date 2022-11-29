package com.dena.mirrorman.clientlog.logs;

import jo.p;

/* loaded from: classes2.dex */
public final class UrgeUsers {
    public static final int $stable = 0;

    /* loaded from: classes2.dex */
    public static final class Follow extends ActionLogBase {
        public static final int $stable = 0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Follow(String str, String str2) {
            super("urge_users.follow", MRLog.TARGET_TYPE_USER, str);
            p.h(str, "user_ids");
            p.h(str2, MRLog.PAYLOAD_KEY_WHERE);
            this.payload.put(MRLog.PAYLOAD_KEY_WHERE, str2);
        }
    }

    /* loaded from: classes2.dex */
    public static final class Launch extends ActionLogBase {
        public static final int $stable = 0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Launch(String str, String str2) {
            super("urge_users.launch", MRLog.TARGET_TYPE_USER, str);
            p.h(str, LogBase.USER_ID);
            p.h(str2, MRLog.PAYLOAD_KEY_WHERE);
            this.payload.put(MRLog.PAYLOAD_KEY_WHERE, str2);
        }
    }
}
