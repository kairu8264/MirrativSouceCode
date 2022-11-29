package com.dena.mirrorman.clientlog.logs;

import jo.h;
import jo.p;

/* loaded from: classes2.dex */
public final class BulkSendLog extends ActionLogBase {
    public static final int $stable = 0;
    public static final String ALL_USERS = "all_users";
    public static final Companion Companion = new Companion(null);
    public static final String ONLY_GIFTING_USERS = "only_gifting_users";

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(h hVar) {
            this();
        }
    }

    public /* synthetic */ BulkSendLog(BulkSendLogActionType bulkSendLogActionType, String str, String str2, int i10, h hVar) {
        this(bulkSendLogActionType, str, (i10 & 4) != 0 ? null : str2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BulkSendLog(BulkSendLogActionType bulkSendLogActionType, String str, String str2) {
        super(bulkSendLogActionType.getRawValue());
        p.h(bulkSendLogActionType, "actionType");
        p.h(str, "liveId");
        this.payload.put(MRLog.PAYLOAD_KEY_LIVE_ID, str);
        if (str2 != null) {
            setTarget_type(str2);
        }
    }
}
