package com.dena.mirrorman.clientlog.logs;

import java.util.HashMap;
import jo.p;

/* loaded from: classes2.dex */
public final class Home {
    public static final int $stable = 0;

    /* loaded from: classes2.dex */
    public static final class ClickApp extends ActionLogBase {
        public static final int $stable = 0;

        public ClickApp(String str, String str2) {
            super(MRLog.ACTION_TYPE_HOME_CLICK_APP, "app", str2, str, null, 16, null);
            HashMap<String, String> hashMap = this.payload;
            p.e(str2);
            hashMap.put(MRLog.PAYLOAD_KEY_APP_ID, str2);
        }
    }

    /* loaded from: classes2.dex */
    public static final class ClickPlusApp extends ActionLogBase {
        public static final int $stable = 0;

        public ClickPlusApp(String str) {
            super("home.click_plus_app", "app", "", str, null, 16, null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class ClickRecommendTag extends ActionLogBase {
        public static final int $stable = 0;

        public ClickRecommendTag(String str, String str2, String str3) {
            super("home.click_recommend_tag", "", "", str, null, 16, null);
            HashMap<String, String> hashMap = this.payload;
            p.e(str2);
            hashMap.put("word", str2);
            HashMap<String, String> hashMap2 = this.payload;
            p.e(str3);
            hashMap2.put(MRLog.PAYLOAD_KEY_APP_ID, str3);
        }
    }

    /* loaded from: classes2.dex */
    public static final class LaunchTab extends ActionLogBase {
        public static final int $stable = 0;

        public LaunchTab(String str, String str2) {
            super("home.launch_tab", "", "", str, null, 16, null);
            HashMap<String, String> hashMap = this.payload;
            p.e(str2);
            hashMap.put(MRLog.PAYLOAD_KEY_WHERE, str2);
        }
    }
}
