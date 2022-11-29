package com.dena.mirrorman.clientlog.logs;

import java.util.HashMap;
import jo.p;

/* loaded from: classes2.dex */
public final class RegCancel extends ActionLogBase {
    public static final int $stable = 0;

    public RegCancel(int i10, String str) {
        super("reg_cancel", MRLog.TARGET_TYPE_SERVICE, "");
        this.payload.put(MRLog.PAYLOAD_KEY_STEP, String.valueOf(i10));
        HashMap<String, String> hashMap = this.payload;
        p.e(str);
        hashMap.put(MRLog.PAYLOAD_KEY_WHERE, str);
    }
}
