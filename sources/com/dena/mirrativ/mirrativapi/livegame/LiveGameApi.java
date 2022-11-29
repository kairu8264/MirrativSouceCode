package com.dena.mirrativ.mirrativapi.livegame;

import ao.d;
import gr.c;
import gr.e;
import gr.f;
import gr.i;
import gr.o;
import gr.t;

/* loaded from: classes2.dex */
public interface LiveGameApi {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* loaded from: classes2.dex */
    public static final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final String REFERER = "x-referer";

        private Companion() {
        }
    }

    /* loaded from: classes2.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ Object getLiveGameList$default(LiveGameApi liveGameApi, String str, String str2, d dVar, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 2) != 0) {
                    str2 = null;
                }
                return liveGameApi.getLiveGameList(str, str2, dVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getLiveGameList");
        }

        public static /* synthetic */ Object postLiveGameStart$default(LiveGameApi liveGameApi, String str, String str2, boolean z10, String str3, d dVar, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 8) != 0) {
                    str3 = null;
                }
                return liveGameApi.postLiveGameStart(str, str2, z10, str3, dVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: postLiveGameStart");
        }
    }

    @f("api/live_game/app_ranking")
    Object getLiveGameAppRanking(@i("x-referer") String str, @t("live_game_id") String str2, @t("live_id") String str3, d<? super LiveGameAppRankingResponse> dVar);

    @f("api/live_game_daily_ranking/today")
    Object getLiveGameDailyRankingToday(@i("x-referer") String str, @t("cursor") String str2, @t("live_id") String str3, d<? super LiveGameDailyRankingResponse> dVar);

    @f("/api/live_game_daily_ranking/yesterday")
    Object getLiveGameDailyRankingYesterday(@i("x-referer") String str, @t("cursor") String str2, d<? super LiveGameDailyRankingYesterdayResponse> dVar);

    @f("api/live_game/detail")
    Object getLiveGameDetail(@i("x-referer") String str, @t("live_game_id") String str2, d<? super LiveGameDetailResponse> dVar);

    @f("api/live_game/gift_help")
    Object getLiveGameGiftHelp(@i("x-referer") String str, @t("live_game_id") String str2, d<? super LiveGameGiftHelpResponse> dVar);

    @f("api/live_game/list")
    Object getLiveGameList(@i("x-referer") String str, @t("cursor") String str2, d<? super LiveGameListResponse> dVar);

    @o("api/live_game/start")
    @e
    Object postLiveGameStart(@i("x-referer") String str, @c("id") String str2, @c("is_viewer_self_start") boolean z10, @c("live_id") String str3, d<? super LiveGameStartResponse> dVar);
}
