package com.dena.mirrorman.clientlog.logs;

import com.dena.mirrorman.clientlog.logs.MRLog;
import com.dena.mirrorman.net.api.response.Karaoke;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import java.net.URLEncoder;
import jo.h;
import jo.p;
import org.json.JSONObject;
import wn.q;
import xn.s;

/* loaded from: classes2.dex */
public final class KaraokeLog extends ActionLogBase {
    public static final int $stable = 0;
    public static final String ARTIST_PAGE = "artist_page";
    public static final Companion Companion = new Companion(null);
    public static final String ENTER_BACKGROUND = "enter_background";
    public static final String FME_FAILURE = "fme_failure";
    public static final String SEARCH = "search";
    public static final String SING_END = "song_end";
    public static final String SONG_LIST = "song_list";
    public static final String SONG_LIST_RECOMMENDED_SINGER = "song_list_recommended_singer";
    public static final String USER_TERMINATED = "user_terminated";
    private static final String UTF_8 = "utf-8";

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(h hVar) {
            this();
        }

        private final String getTabName(String str) {
            return p.c(str, IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE) ? "popular" : p.c(str, "2") ? "singer" : "unknown";
        }

        public final String createArtistReferer(String str, String str2, String str3) {
            p.h(str, "referer");
            p.h(str2, "singerId");
            p.h(str3, "title");
            if (p.c(str, "singer")) {
                return new KaraokeReferer("singer", URLEncoder.encode(str3, KaraokeLog.UTF_8), str2, null, null, null, 56, null).toJson();
            }
            return p.c(str, "search") ? new KaraokeReferer("search", URLEncoder.encode(str3, KaraokeLog.UTF_8), str2, null, null, "singer", 24, null).toJson() : "";
        }

        public final String createGenreReferer(String str, String str2) {
            p.h(str, "genreId");
            p.h(str2, "title");
            return new KaraokeReferer("genre", null, null, URLEncoder.encode(str2, KaraokeLog.UTF_8), str, null, 38, null).toJson();
        }

        public final MRLog createInitialBarLog(String str, String str2) {
            p.h(str, "liveId");
            p.h(str2, "initial");
            String jSONObject = new JSONObject().put("section", str2).toString();
            p.g(jSONObject, "JSONObject()\n           …              .toString()");
            MRLog.Companion companion = MRLog.Companion;
            MRLog.Builder builder = new MRLog.Builder(MRLog.ACTION_TYPE_KARAOKE_TAP_SINGER_INITIAL_BAR);
            builder.setPageId("singer_list");
            builder.setPayload(s.m(q.a(MRLog.PAYLOAD_KEY_LIVE_ID, str), q.a(MRLog.PAYLOAD_KEY_TARGET_DETAIL, jSONObject)));
            return builder.build();
        }

        public final MRLog createKeyChangeLog(String str, String str2, int i10, int i11, Karaoke karaoke) {
            p.h(str, "liveId");
            p.h(str2, "pageId");
            p.h(karaoke, "karaoke");
            String jSONObject = new JSONObject().put("before_value", i10).put("after_value", i11).toString();
            p.g(jSONObject, "JSONObject()\n           …              .toString()");
            String jSONObject2 = new JSONObject().put("karaoke_id", karaoke.getId()).put("karaoke_title", karaoke.getTitle()).put("singer_id", karaoke.getSingerId()).put("singer_name", karaoke.getSingerName()).put("karaoke_duration", karaoke.getPlayingTime()).toString();
            p.g(jSONObject2, "JSONObject()\n           …              .toString()");
            MRLog.Companion companion = MRLog.Companion;
            MRLog.Builder builder = new MRLog.Builder(MRLog.ACTION_TYPE_KARAOKE_KEY_CHANGED);
            builder.setPageId(str2);
            builder.setTargetType(jSONObject);
            builder.setPayload(s.m(q.a(MRLog.PAYLOAD_KEY_LIVE_ID, str), q.a(MRLog.PAYLOAD_KEY_TARGET_DETAIL, jSONObject2)));
            return builder.build();
        }

        public final KaraokeLog createOpenCategoryPage(String str, String str2, String str3) {
            p.h(str, "liveId");
            p.h(str2, "genreId");
            String jSONObject = new JSONObject().put("genre_id", str2).put("genre_name", str3).toString();
            p.g(jSONObject, "JSONObject()\n           …              .toString()");
            return new KaraokeLog(KaraokeActionType.OPEN_CATEGORY_PAGE, str, null, null, jSONObject, KaraokeLog.SONG_LIST, IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE, 12, null);
        }

        public final KaraokeLog createOpenSearchLog(String str) {
            p.h(str, "liveId");
            return new KaraokeLog(KaraokeActionType.OPEN_SEARCH_PAGE, str, null, null, null, KaraokeLog.SONG_LIST, null, 92, null);
        }

        public final MRLog createOpenSettingLog(String str, String str2, Karaoke karaoke) {
            p.h(str, "liveId");
            p.h(str2, "pageId");
            p.h(karaoke, "karaoke");
            String jSONObject = new JSONObject().put("karaoke_id", karaoke.getId()).put("karaoke_title", karaoke.getTitle()).put("singer_id", karaoke.getSingerId()).put("singer_name", karaoke.getSingerName()).put("karaoke_duration", karaoke.getPlayingTime()).toString();
            p.g(jSONObject, "JSONObject()\n           …              .toString()");
            MRLog.Companion companion = MRLog.Companion;
            MRLog.Builder builder = new MRLog.Builder(MRLog.ACTION_TYPE_KARAOKE_OPEN_SETTING_SCREEN);
            builder.setPageId(str2);
            builder.setPayload(s.m(q.a(MRLog.PAYLOAD_KEY_LIVE_ID, str), q.a(MRLog.PAYLOAD_KEY_TARGET_DETAIL, jSONObject)));
            return builder.build();
        }

        public final KaraokeLog createOpenSingerLog(String str, String str2, String str3, String str4, String str5) {
            p.h(str, "liveId");
            p.h(str2, "singerId");
            p.h(str3, "title");
            p.h(str4, "referer");
            String jSONObject = new JSONObject().put("singer_id", str2).put("singer_name", str3).toString();
            p.g(jSONObject, "JSONObject()\n           …              .toString()");
            KaraokeActionType karaokeActionType = KaraokeActionType.OPEN_SINGER_PAGE;
            if (str5 == null) {
                str5 = "2";
            }
            return new KaraokeLog(karaokeActionType, str, null, null, jSONObject, str4, str5, 12, null);
        }

        public final String createPopularReferer() {
            return new KaraokeReferer("popular", null, null, null, null, null, 62, null).toJson();
        }

        public final String createSearchReferer() {
            return new KaraokeReferer("search", null, null, null, null, "song", 30, null).toJson();
        }

        public final KaraokeLog createSelectSongListTabLog(String str, String str2) {
            p.h(str, "liveId");
            p.h(str2, "tabId");
            String jSONObject = new JSONObject().put(MRLog.PAYLOAD_TAB_ID, str2).put("tab_name", getTabName(str2)).toString();
            p.g(jSONObject, "JSONObject()\n           …              .toString()");
            return new KaraokeLog(KaraokeActionType.SELECT_LIST_TAB, str, null, null, jSONObject, KaraokeLog.SONG_LIST, null, 76, null);
        }

        public final MRLog createTempoChangeLog(String str, String str2, int i10, int i11, Karaoke karaoke) {
            p.h(str, "liveId");
            p.h(str2, "pageId");
            p.h(karaoke, "karaoke");
            String jSONObject = new JSONObject().put("before_value", i10).put("after_value", i11).toString();
            p.g(jSONObject, "JSONObject()\n           …              .toString()");
            String jSONObject2 = new JSONObject().put("karaoke_id", karaoke.getId()).put("karaoke_title", karaoke.getTitle()).put("singer_id", karaoke.getSingerId()).put("singer_name", karaoke.getSingerName()).put("karaoke_duration", karaoke.getPlayingTime()).toString();
            p.g(jSONObject2, "JSONObject()\n           …              .toString()");
            MRLog.Companion companion = MRLog.Companion;
            MRLog.Builder builder = new MRLog.Builder(MRLog.ACTION_TYPE_KARAOKE_TEMPO_CHANGED);
            builder.setPageId(str2);
            builder.setTargetType(jSONObject);
            builder.setPayload(s.m(q.a(MRLog.PAYLOAD_KEY_LIVE_ID, str), q.a(MRLog.PAYLOAD_KEY_TARGET_DETAIL, jSONObject2)));
            return builder.build();
        }
    }

    public /* synthetic */ KaraokeLog(KaraokeActionType karaokeActionType, String str, String str2, String str3, String str4, String str5, String str6, int i10, h hVar) {
        this(karaokeActionType, (i10 & 2) != 0 ? null : str, (i10 & 4) != 0 ? null : str2, (i10 & 8) != 0 ? null : str3, (i10 & 16) != 0 ? null : str4, (i10 & 32) != 0 ? null : str5, (i10 & 64) == 0 ? str6 : null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KaraokeLog(KaraokeActionType karaokeActionType, String str, String str2, String str3, String str4, String str5, String str6) {
        super(karaokeActionType.getRawValue(), str2, str3);
        p.h(karaokeActionType, "actionType");
        if (str != null) {
            this.payload.put(MRLog.PAYLOAD_KEY_LIVE_ID, str);
        }
        if (str4 != null) {
            this.payload.put(MRLog.PAYLOAD_KEY_TARGET_DETAIL, str4);
        }
        if (str5 != null) {
            this.payload.put("page_id", str5);
        }
        if (str6 != null) {
            this.payload.put(MRLog.PAYLOAD_KEY_WHERE, str6);
        }
    }
}
