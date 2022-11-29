package com.dena.mirrorman.clientlog.logs;

import com.dena.mirrorman.clientlog.logs.Live;
import com.dena.mirrorman.net.api.Referer;
import java.util.HashMap;
import jo.h;
import jo.p;

/* loaded from: classes2.dex */
public final class Tutorial {
    public static final int $stable = 0;

    /* loaded from: classes2.dex */
    public static final class CommentGuide extends Live.LiveBasic {
        public static final int $stable = 0;

        public CommentGuide(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
            super("tutorial.live.share.comment", str, str2, str3, str4, str5);
            HashMap<String, String> hashMap = this.payload;
            p.e(str7);
            hashMap.put("word", str7);
            HashMap<String, String> hashMap2 = this.payload;
            p.e(str6);
            hashMap2.put(LogBase.SERVICE_NAME, str6);
        }
    }

    /* loaded from: classes2.dex */
    public static final class Dashboard extends ActionLogBase {
        public static final int $stable = 0;
        public static final Companion Companion = new Companion(null);
        public static final int STEP_COVER = 0;
        public static final int STEP_LIVE = 1;

        /* loaded from: classes2.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(h hVar) {
                this();
            }
        }

        public Dashboard(int i10) {
            super("tutorial.dashboard", MRLog.TARGET_TYPE_SERVICE, "");
            this.payload.put(MRLog.PAYLOAD_KEY_STEP, String.valueOf(i10));
        }
    }

    /* loaded from: classes2.dex */
    public static final class Introduction extends ActionLogBase {
        public static final int $stable = 0;

        public Introduction(int i10) {
            super(Referer.TUTORIAL, MRLog.TARGET_TYPE_SERVICE, "");
            this.payload.put(MRLog.PAYLOAD_KEY_STEP, String.valueOf(i10));
        }
    }

    /* loaded from: classes2.dex */
    public static final class PlayLive extends Live.LiveBasic {
        public static final int $stable = 0;

        public PlayLive(String str, String str2, String str3, String str4, String str5, int i10, int i11, String str6) {
            super("tutorial.playlive", str, str2, str3, str4, str5);
            this.payload.put(MRLog.PAYLOAD_KEY_STEP, String.valueOf(i10));
            this.payload.put(MRLog.PAYLOAD_KEY_TARGET_DETAIL, String.valueOf(i11));
            HashMap<String, String> hashMap = this.payload;
            p.e(str6);
            hashMap.put("word", str6);
        }
    }
}
