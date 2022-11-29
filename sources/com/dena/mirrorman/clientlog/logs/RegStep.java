package com.dena.mirrorman.clientlog.logs;

import java.util.HashMap;
import jo.h;
import jo.p;

/* loaded from: classes2.dex */
public final class RegStep extends ActionLogBase {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    public static final int STEP_REGIST = 1;

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(h hVar) {
            this();
        }
    }

    public RegStep(int i10, String str) {
        super("reg_step", MRLog.TARGET_TYPE_SERVICE, "");
        this.payload.put(MRLog.PAYLOAD_KEY_STEP, String.valueOf(i10));
        HashMap<String, String> hashMap = this.payload;
        p.e(str);
        hashMap.put(MRLog.PAYLOAD_KEY_WHERE, str);
    }
}
