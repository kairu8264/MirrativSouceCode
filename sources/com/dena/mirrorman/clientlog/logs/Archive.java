package com.dena.mirrorman.clientlog.logs;

import android.text.TextUtils;
import com.dena.mirrorman.net.api.response.live.LiveBasicParams;
import com.dena.mirrorman.net.api.response.live.LiveTimeline;
import java.util.HashMap;
import java.util.List;
import jo.p;
import te.c;

/* loaded from: classes2.dex */
public final class Archive {
    public static final int $stable = 0;
    private static final String APP_ID = "app_id";
    private static final String CAST_ID = "cast_id";
    private static final String CAST_NAME = "cast_name";
    public static final Archive INSTANCE = new Archive();
    private static final String LIVE_ID = "live_id";
    private static final String LIVE_NAME = "live_name";
    private static final String VIEW_DURATION = "view_duration";
    private static final String WHERE = "where";

    /* loaded from: classes2.dex */
    public static class ArchiveBasic extends ActionLogBase {
        public static final int $stable = 0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ArchiveBasic(String str, String str2, String str3, String str4, String str5, String str6) {
            super(str, "archive", str2);
            p.e(str);
            HashMap<String, String> hashMap = this.payload;
            p.e(str3);
            hashMap.put("cast_id", str3);
            HashMap<String, String> hashMap2 = this.payload;
            p.e(str4);
            hashMap2.put("cast_name", str4);
            HashMap<String, String> hashMap3 = this.payload;
            p.e(str2);
            hashMap3.put("live_id", str2);
            HashMap<String, String> hashMap4 = this.payload;
            p.e(str5);
            hashMap4.put("live_name", str5);
            if (TextUtils.isEmpty(str6)) {
                return;
            }
            HashMap<String, String> hashMap5 = this.payload;
            p.e(str6);
            hashMap5.put("app_id", str6);
        }
    }

    /* loaded from: classes2.dex */
    public static final class Share extends ArchiveBasic {
        public static final int $stable = 0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Share(LiveBasicParams liveBasicParams, String str) {
            super("archive.share", liveBasicParams.getLiveId(), liveBasicParams.getOwner().getUserId(), liveBasicParams.getOwner().getName(), liveBasicParams.getTitle(), null);
            p.h(liveBasicParams, "param");
            HashMap<String, String> hashMap = this.payload;
            p.e(str);
            hashMap.put("where", str);
        }
    }

    /* loaded from: classes2.dex */
    public static final class ViewBackgroundEnd extends ArchiveBasic {
        public static final int $stable = 0;

        public ViewBackgroundEnd(String str, String str2, String str3, String str4, String str5, long j10) {
            super("archive.view_background.end", str, str2, str3, str4, str5);
            this.payload.put(Archive.VIEW_DURATION, String.valueOf(j10));
        }
    }

    /* loaded from: classes2.dex */
    public static final class ViewBackgroundStart extends ArchiveBasic {
        public static final int $stable = 0;

        public ViewBackgroundStart(String str, String str2, String str3, String str4, String str5) {
            super("archive.view_background.start", str, str2, str3, str4, str5);
        }
    }

    /* loaded from: classes2.dex */
    public static final class ViewEnd extends ArchiveBasic {
        public static final int $stable = 0;

        public ViewEnd(String str, String str2, String str3, String str4, String str5, long j10, long j11) {
            super("archive.view_end", str, str2, str3, str4, str5);
            this.payload.put(Archive.VIEW_DURATION, String.valueOf(j10));
            this.payload.put(MRLog.PAYLOAD_KEY_STEP, String.valueOf(j11));
        }
    }

    /* loaded from: classes2.dex */
    public static final class ViewForeground extends ArchiveBasic {
        public static final int $stable = 0;

        public ViewForeground(String str, String str2, String str3, String str4, String str5) {
            super("archive.view_foreground", str, str2, str3, str4, str5);
        }
    }

    /* loaded from: classes2.dex */
    public static final class ViewStart extends ArchiveBasic {
        public static final int $stable = 0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewStart(c cVar, String str) {
            super("archive.view_start", cVar.getLiveId(), cVar.g(), cVar.e(), cVar.getTitle(), null);
            p.h(cVar, "info");
            String appID = getAppID(cVar.getTimeline());
            if (!TextUtils.isEmpty(appID)) {
                HashMap<String, String> hashMap = this.payload;
                p.e(appID);
                hashMap.put("app_id", appID);
            }
            HashMap<String, String> hashMap2 = this.payload;
            p.e(str);
            hashMap2.put("where", str);
        }

        private final String getAppID(List<LiveTimeline> list) {
            if (list == null || !(!list.isEmpty())) {
                return null;
            }
            LiveTimeline liveTimeline = list.get(0);
            if (liveTimeline.getApp() == null || TextUtils.isEmpty(liveTimeline.getApp().getAppId())) {
                return null;
            }
            return liveTimeline.getApp().getAppId();
        }
    }

    private Archive() {
    }
}
