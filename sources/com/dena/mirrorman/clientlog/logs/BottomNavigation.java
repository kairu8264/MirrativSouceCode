package com.dena.mirrorman.clientlog.logs;

import java.util.HashMap;
import jo.p;

/* loaded from: classes2.dex */
public final class BottomNavigation {
    public static final int $stable = 0;

    /* loaded from: classes2.dex */
    public static final class LaunchTab extends ActionLogBase {
        public static final int $stable = 0;

        public LaunchTab(String str, String str2) {
            super("bottom_navs.launch_tab", "bottom_nav", str, "", null, 16, null);
            HashMap<String, String> hashMap = this.payload;
            p.e(str2);
            hashMap.put(MRLog.PAYLOAD_KEY_WHERE, str2);
        }
    }
}
