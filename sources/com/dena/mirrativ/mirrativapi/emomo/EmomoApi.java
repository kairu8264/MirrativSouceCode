package com.dena.mirrativ.mirrativapi.emomo;

import ao.d;
import com.dena.mirrativ.mirrativapi.core.StatusResponse;
import com.dena.mirrativ.mirrativapi.emomo.event.GiftGachaTicketResponse;
import com.dena.mirrativ.mirrativapi.emomo.event.emomoquest.EmomoQuestAvatar;
import com.dena.mirrativ.mirrativapi.emomo.event.emomoquest.EmomoQuestEventResponse;
import com.dena.mirrativ.mirrativapi.emomo.event.emomoquest.EmomoQuestOpenGiftEventResponse;
import com.dena.mirrativ.mirrativapi.emomo.event.emomorun.EmomoRunEventResponse;
import com.dena.mirrativ.mirrativapi.emomo.event.emomorun.EmomoRunGameResponse;
import com.dena.mirrativ.mirrativapi.emomo.event.emomorun.EmomoRunOpenGiftGachaResponse;
import com.dena.mirrativ.mirrativapi.emomo.event.emomorun.EmomoRunScoreResponse;
import com.dena.mirrativ.mirrativapi.emomo.event.giftranking.GiftRankingEventDetailResponse;
import com.dena.mirrativ.mirrativapi.emomo.event.giftranking.GiftRankingEventResponse;
import ep.e0;
import gr.c;
import gr.e;
import gr.f;
import gr.i;
import gr.o;
import gr.t;

/* loaded from: classes2.dex */
public interface EmomoApi {
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
        public static /* synthetic */ Object getEmomoRunScore$default(EmomoApi emomoApi, String str, int i10, Integer num, d dVar, int i11, Object obj) {
            if (obj == null) {
                if ((i11 & 4) != 0) {
                    num = null;
                }
                return emomoApi.getEmomoRunScore(str, i10, num, dVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getEmomoRunScore");
        }
    }

    @f("api/emomo_quest/avatar")
    Object getEmomoQuestAvatar(@i("x-referer") String str, d<? super EmomoQuestAvatar> dVar);

    @f("api/emomo_quest/event")
    Object getEmomoQuestEvent(@i("x-referer") String str, @t("gift_event_id") int i10, d<? super EmomoQuestEventResponse> dVar);

    @f("api/emomo_quest/gacha_ticket")
    Object getEmomoQuestGachaTicket(@i("x-referer") String str, @t("gift_event_id") int i10, d<? super GiftGachaTicketResponse> dVar);

    @f("api/emomo_quest/open_gift_event_id")
    Object getEmomoQuestOpenGiftEventId(@i("x-referer") String str, d<? super EmomoQuestOpenGiftEventResponse> dVar);

    @f("/api/emomo_run/event")
    Object getEmomoRunEvent(@i("x-referer") String str, @t("gift_event_id") int i10, d<? super EmomoRunEventResponse> dVar);

    @f("/api/emomo_run/score")
    Object getEmomoRunScore(@i("x-referer") String str, @t("gift_event_id") int i10, @t("is_in_game") Integer num, d<? super EmomoRunScoreResponse> dVar);

    @f("api/gift_ranking/event")
    Object getGiftRankingEventAsync(@i("x-referer") String str, @t("event_id") int i10, d<? super GiftRankingEventResponse> dVar);

    @f("api/gift_ranking/event_detail")
    Object getGiftRankingEventDetailAsync(@i("x-referer") String str, @t("event_id") int i10, @t("term") int i11, @t("broadcaster_id") Integer num, d<? super GiftRankingEventDetailResponse> dVar);

    @o("api/emomo_quest/game_state")
    @e
    Object postEmomoQuestGameState(@i("x-referer") String str, @c("gift_event_id") int i10, @c("is_questing") int i11, d<? super StatusResponse> dVar);

    @o("api/emomo_quest/open_equipment_gacha")
    @e
    Object postEmomoQuestOpenEquipmentGacha(@i("x-referer") String str, @c("gift_event_id") int i10, @c("gacha_type") int i11, d<? super e0> dVar);

    @o("api/emomo_quest/open_gift_gacha")
    @e
    Object postEmomoQuestOpenGiftGacha(@i("x-referer") String str, @c("gift_event_id") int i10, d<? super e0> dVar);

    @o("api/emomo_quest/send_gift_gacha")
    @e
    Object postEmomoQuestSendGiftGacha(@i("x-referer") String str, @c("live_id") String str2, @c("gift_id") String str3, @c("count") int i10, @c("gift_event_id") int i11, d<? super GiftGachaTicketResponse> dVar);

    @o("api/emomo_run/game_end")
    @e
    Object postEmomoRunGameEnd(@i("x-referer") String str, @c("gift_event_id") int i10, @c("game_no") int i11, @c("score") int i12, @c("score_run_multiple") float f10, @c("score_coin_multiple") float f11, @c("score_kicks_multiple") float f12, @c("stage_enemy_multiple") int i13, @c("current_time") long j10, @c("hash") String str2, d<? super EmomoRunGameResponse> dVar);

    @o("api/emomo_run/game_gift_consume")
    @e
    Object postEmomoRunGameGiftConsume(@i("x-referer") String str, @c("gift_event_id") int i10, @c("game_gift_id") int i11, d<? super StatusResponse> dVar);

    @o("api/emomo_run/game_heartbeat")
    @e
    Object postEmomoRunGameHeartbeat(@i("x-referer") String str, @c("gift_event_id") int i10, @c("game_no") int i11, @c("score") int i12, @c("score_run_multiple") float f10, @c("score_coin_multiple") float f11, @c("score_kicks_multiple") float f12, @c("stage_enemy_multiple") int i13, @c("current_time") long j10, @c("hash") String str2, d<? super EmomoRunGameResponse> dVar);

    @o("api/emomo_run/game_start")
    @e
    Object postEmomoRunGameStart(@i("x-referer") String str, @c("gift_event_id") int i10, @c("current_time") long j10, d<? super EmomoRunGameResponse> dVar);

    @o("api/emomo_run/game_state")
    @e
    Object postEmomoRunGameState(@i("x-referer") String str, @c("gift_event_id") int i10, @c("is_running") int i11, d<? super EmomoRunGameResponse> dVar);

    @o("api/emomo_run/open_gift_gacha")
    @e
    Object postEmomoRunOpenGiftGacha(@i("x-referer") String str, @c("gift_event_id") int i10, d<? super EmomoRunOpenGiftGachaResponse> dVar);

    @o("api/emomo_run/send_lottery_bot")
    @e
    Object postEmomoRunSendLotteryBot(@i("x-referer") String str, @c("gift_event_id") int i10, @c("game_gift_id") int i11, d<? super StatusResponse> dVar);
}
