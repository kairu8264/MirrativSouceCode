package jf;

import com.dena.mirrorman.clientlog.logs.MRLog;

/* loaded from: classes2.dex */
public enum x {
    LIVE(MRLog.TARGET_TYPE_LIVE),
    DAILY("daily"),
    MONTHLY("monthly"),
    CHEER("cheer");
    
    private final String value;

    x(String str) {
        this.value = str;
    }

    public final String c() {
        return this.value;
    }
}
