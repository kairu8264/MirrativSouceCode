package com.dena.mirrorman.clientlog.logs;

import android.text.TextUtils;
import com.dena.mirrorman.net.api.response.App;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import java.util.HashMap;
import jo.p;
import te.c;
import xm.e;

/* loaded from: classes2.dex */
public final class Live {
    public static final int $stable = 0;
    private static final String APP_ID = "app_id";
    private static final String CAST_ID = "cast_id";
    private static final String CAST_NAME = "cast_name";
    public static final String COMMENT_SHARE_TYPE_SHARE = "share";
    public static final String COMMENT_SHARE_TYPE_TWITTER = "twitter";
    private static final String ERROR = "error";
    public static final Live INSTANCE = new Live();
    private static final String IS_MUTED = "is_muted";
    private static final String LIVE_ID = "live_id";
    private static final String LIVE_NAME = "live_name";
    private static final String LIVE_TYPE = "live_type";
    public static final String LIVE_TYPE_OPEN = "open";
    public static final String LIVE_TYPE_PRIVATE = "private";
    private static final String MEMORIAL_ID = "memorial_id";
    private static final String RECOMMEND_LIVE1 = "recommend_live1";
    private static final String RECOMMEND_LIVE2 = "recommend_live2";
    private static final String SHARE_TYPE = "service_name";
    public static final String SHARE_TYPE_COPY = "copy";
    public static final String SHARE_TYPE_SETTING_IN_BROADCASTING = "setting_in_broadcasting";
    public static final String SHARE_TYPE_SETTING_IN_PLAYER = "setting_in_player";
    private static final String TARGET_DETAIL = "target_detail";
    private static final String VIEW_DURATION = "view_duration";
    private static final String WHERE = "where";
    private static final String WORD = "word";

    /* loaded from: classes2.dex */
    public static class CastBasic extends LiveBasic {
        public static final int $stable = 0;

        public CastBasic(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
            super(str, str2, str3, str4, str5, str7);
            HashMap<String, String> hashMap = this.payload;
            p.e(str6);
            hashMap.put(Live.LIVE_TYPE, str6);
        }
    }

    /* loaded from: classes2.dex */
    public static final class CastCommentTypeChanged extends ActionLogBase {
        public static final int $stable = 0;

        public CastCommentTypeChanged(String str, String str2) {
            super("live.cast_comment_type_changed", MRLog.TARGET_TYPE_LIVE, str);
            HashMap<String, String> hashMap = this.payload;
            p.e(str2);
            hashMap.put("target_detail", str2);
        }
    }

    /* loaded from: classes2.dex */
    public static final class ClickRecommendLive extends LiveBasic {
        public static final int $stable = 0;

        public ClickRecommendLive(c cVar, String str, String str2, String str3, String str4) {
            super(MRLog.ACTION_TYPE_LIVE_CLICK_RECOMMEND_LIVE, cVar);
            HashMap<String, String> hashMap = this.payload;
            p.e(str);
            hashMap.put(Live.RECOMMEND_LIVE1, str);
            HashMap<String, String> hashMap2 = this.payload;
            p.e(str2);
            hashMap2.put(Live.RECOMMEND_LIVE2, str2);
            HashMap<String, String> hashMap3 = this.payload;
            p.e(str3);
            hashMap3.put("selected_live", str3);
            HashMap<String, String> hashMap4 = this.payload;
            p.e(str4);
            hashMap4.put("target_detail", str4);
        }
    }

    /* loaded from: classes2.dex */
    public static final class CollabError extends LiveBasic {
        public static final int $stable = 0;

        public CollabError(String str, String str2, String str3) {
            super("collab.error", str, str2, str3);
        }
    }

    /* loaded from: classes2.dex */
    public static final class ImpGiftPanel extends ActionLogBase {
        public static final int $stable = 0;

        public ImpGiftPanel(String str, boolean z10) {
            super("live.imp_gift_panel", MRLog.TARGET_TYPE_LIVE, str);
            this.payload.put("target_detail", z10 ? IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE : "0");
        }
    }

    /* loaded from: classes2.dex */
    public static final class PlayerEnd extends LiveBasic {
        public static final int $stable = 0;

        public PlayerEnd(c cVar, String str, int i10) {
            super(MRLog.ACTION_TYPE_LIVE_PLAYER_END, cVar);
            HashMap<String, String> hashMap = this.payload;
            p.e(str);
            hashMap.put("where", str);
            this.payload.put("is_muted", String.valueOf(i10));
        }
    }

    /* loaded from: classes2.dex */
    public static final class PlayerStart extends LiveBasic {
        public static final int $stable = 0;

        public PlayerStart(c cVar, String str, int i10) {
            super(MRLog.ACTION_TYPE_LIVE_PLAYER_START, cVar);
            HashMap<String, String> hashMap = this.payload;
            p.e(str);
            hashMap.put("where", str);
            this.payload.put("is_muted", String.valueOf(i10));
        }
    }

    /* loaded from: classes2.dex */
    public static final class RenderStart extends ActionLogBase {
        public static final int $stable = 0;

        public RenderStart(String str, long j10, String str2) {
            super("live.renderer_start", MRLog.TARGET_TYPE_LIVE, str);
            this.payload.put("target_detail", String.valueOf(j10));
            HashMap<String, String> hashMap = this.payload;
            p.e(str2);
            hashMap.put("where", str2);
        }
    }

    /* loaded from: classes2.dex */
    public static final class Share extends CastBasic {
        public static final int $stable = 0;

        public Share(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
            super(Live.COMMENT_SHARE_TYPE_SHARE, str, str2, str3, str4, str5, str6);
            HashMap<String, String> hashMap = this.payload;
            p.e(str7);
            hashMap.put("service_name", str7);
            HashMap<String, String> hashMap2 = this.payload;
            p.e(str8);
            hashMap2.put(Live.WORD, str8);
        }
    }

    /* loaded from: classes2.dex */
    public static final class ShowRecommendLive extends LiveBasic {
        public static final int $stable = 0;

        public ShowRecommendLive(c cVar, String str, String str2) {
            super(MRLog.ACTION_TYPE_LIVE_SHOW_RECOMMEND_LIVE, cVar);
            HashMap<String, String> hashMap = this.payload;
            p.e(str);
            hashMap.put(Live.RECOMMEND_LIVE1, str);
            HashMap<String, String> hashMap2 = this.payload;
            p.e(str2);
            hashMap2.put(Live.RECOMMEND_LIVE2, str2);
        }
    }

    /* loaded from: classes2.dex */
    public static final class ViewBackgroundEnd extends LiveBasic {
        public static final int $stable = 0;

        public ViewBackgroundEnd(String str, String str2, String str3, String str4, String str5, long j10) {
            super("live.view_background.end", str, str2, str3, str4, str5);
            this.payload.put(Live.VIEW_DURATION, String.valueOf(j10));
        }
    }

    /* loaded from: classes2.dex */
    public static final class ViewBackgroundStart extends LiveBasic {
        public static final int $stable = 0;

        public ViewBackgroundStart(String str, String str2, String str3, String str4, String str5) {
            super("live.view_background.start", str, str2, str3, str4, str5);
        }
    }

    /* loaded from: classes2.dex */
    public static final class ViewEnd extends LiveBasic {
        public static final int $stable = 0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewEnd(c cVar, long j10, int i10, long j11) {
            super("live.view_end", cVar);
            p.h(cVar, "info");
            this.payload.put(Live.VIEW_DURATION, String.valueOf(j10));
            this.payload.put("is_muted", String.valueOf(i10));
            this.payload.put(MRLog.PAYLOAD_KEY_STEP, String.valueOf(j11));
            if (cVar.getOwner().isBirthday()) {
                HashMap hashMap = new HashMap();
                hashMap.put("memorial_id", IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
                HashMap<String, String> hashMap2 = this.payload;
                String s10 = new e().s(hashMap);
                p.g(s10, "Gson().toJson(targetDetailParams)");
                hashMap2.put("target_detail", s10);
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class ViewForeground extends LiveBasic {
        public static final int $stable = 0;

        public ViewForeground(String str, String str2, String str3, String str4, String str5) {
            super("live.view_foreground", str, str2, str3, str4, str5);
        }
    }

    /* loaded from: classes2.dex */
    public static final class click_comment_share_request extends LiveBasic {
        public static final int $stable = 0;

        public click_comment_share_request(c cVar, String str, int i10) {
            super("live.click_comment_share_request", cVar);
            HashMap<String, String> hashMap = this.payload;
            p.e(str);
            hashMap.put("target_detail", str);
            this.payload.put("nth", String.valueOf(i10));
        }
    }

    /* loaded from: classes2.dex */
    public static final class click_share_panel extends LiveBasic {
        public static final int $stable = 0;

        public click_share_panel(c cVar, String str, String str2) {
            super("live.click_share_panel", cVar);
            HashMap<String, String> hashMap = this.payload;
            p.e(str);
            hashMap.put("where", str);
            HashMap<String, String> hashMap2 = this.payload;
            p.e(str2);
            hashMap2.put("target_detail", str2);
        }
    }

    /* loaded from: classes2.dex */
    public static final class imp_comment_share_request extends LiveBasic {
        public static final int $stable = 0;

        public imp_comment_share_request(c cVar, String str) {
            super("live.imp_comment_share_request", cVar);
            HashMap<String, String> hashMap = this.payload;
            p.e(str);
            hashMap.put("target_detail", str);
        }
    }

    /* loaded from: classes2.dex */
    public static final class imp_share_panel extends LiveBasic {
        public static final int $stable = 0;

        public imp_share_panel(c cVar, String str) {
            super("live.imp_share_panel", cVar);
            HashMap<String, String> hashMap = this.payload;
            p.e(str);
            hashMap.put("where", str);
        }
    }

    private Live() {
    }

    public final String getAppId(c cVar) {
        if ((cVar != null ? cVar.getApp() : null) != null) {
            App.AppParams app = cVar.getApp();
            p.e(app);
            return app.getAppId();
        }
        return null;
    }

    /* loaded from: classes2.dex */
    public static class LiveBasic extends ActionLogBase {
        public static final int $stable = 0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LiveBasic(String str, c cVar) {
            super(str, MRLog.TARGET_TYPE_LIVE, (cVar == null || (r0 = cVar.getLiveId()) == null) ? "" : "");
            p.e(str);
            setData(cVar);
        }

        private final void setData(c cVar) {
            this.payload.put("cast_id", (cVar == null || (r2 = cVar.g()) == null) ? "" : "");
            this.payload.put("cast_name", (cVar == null || (r2 = cVar.e()) == null) ? "" : "");
            this.payload.put("live_id", (cVar == null || (r2 = cVar.getLiveId()) == null) ? "" : "");
            HashMap<String, String> hashMap = this.payload;
            String title = cVar != null ? cVar.getTitle() : "";
            p.e(title);
            hashMap.put("live_name", title);
            String appId = Live.INSTANCE.getAppId(cVar);
            if (TextUtils.isEmpty(appId)) {
                return;
            }
            HashMap<String, String> hashMap2 = this.payload;
            p.e(appId);
            hashMap2.put("app_id", appId);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LiveBasic(String str, String str2, String str3, String str4, String str5, String str6) {
            super(str, MRLog.TARGET_TYPE_LIVE, str2);
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LiveBasic(String str, String str2, String str3, String str4) {
            super(str, "collab.error", str2, str3, null, 16, null);
            p.e(str);
            HashMap<String, String> hashMap = this.payload;
            p.e(str4);
            hashMap.put("error", str4);
        }
    }

    /* loaded from: classes2.dex */
    public static final class ViewReconnect extends ActionLogBase {
        public static final int $stable = 0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewReconnect(String str, String str2, long j10) {
            super("live.view_reconnect");
            p.h(str, "liveid");
            this.payload.put("live_id", str);
            HashMap<String, String> hashMap = this.payload;
            p.e(str2);
            hashMap.put("where", str2);
            this.payload.put(Live.VIEW_DURATION, String.valueOf(j10));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewReconnect(String str, String str2, long j10, long j11) {
            super("live.view_reconnect");
            p.h(str, "liveid");
            this.payload.put("live_id", str);
            HashMap<String, String> hashMap = this.payload;
            p.e(str2);
            hashMap.put("where", str2);
            this.payload.put(Live.VIEW_DURATION, String.valueOf(j10));
            this.payload.put(MRLog.PAYLOAD_KEY_STEP, String.valueOf(j11));
        }
    }
}
