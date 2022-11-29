package com.dena.mirrorman.unity;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import jo.h;
import jo.p;

/* loaded from: classes3.dex */
public enum MiniGameOutputType {
    UNKNOWN("unknown"),
    START(TtmlNode.START),
    GAMEOVER("gameover"),
    RESULT("result"),
    HEARTBEAT("heartbeat"),
    CONSUME_GIFT("consume_gift"),
    OPEN_GIFT_TREASURE("open_gift_treasure"),
    TOUCH_TITLE("touch_title"),
    TOUCH_PLAYING("touch_playing"),
    TOUCH_RESULT_NEXT_TITLE("touch_result_next_title"),
    TOUCH_RESULT_NEXT_START("touch_result_next_start"),
    TOUCH_RESULT_SHARE("touch_result_share"),
    TOUCH_RESULT_RANKING("touch_result_ranking"),
    TOUCH_TITLE_RANKING("touch_title_ranking"),
    TOUCH_HELP("touch_help"),
    OPEN_GIFT_GACHA("open_gift_gacha"),
    NOTIFY_ROOM_ID("notify_room_id"),
    REQUEST_AUTH_INFO("request_auth_info"),
    PLAYING("playing"),
    SHOW_COMMENT("show_comment"),
    HIDE_COMMENT("hide_comment"),
    LOG("log"),
    WAITING("waiting"),
    EMOMO_QUEST_UPDATE_AVATAR("emomo_quest/update_avatar"),
    EMOMO_QUEST_TOUCH_RESULT_SHARE("emomo_quest/touch_result_share"),
    EMOMO_QUEST_TOUCH_RESULT_RANKING("emomo_quest/touch_result_ranking"),
    EMOMO_QUEST_TOUCH_TITLE_RANKING("emomo_quest/touch_title_ranking"),
    EMOMO_QUEST_TOUCH_HELP("emomo_quest/touch_help"),
    EMOMO_QUEST_GIFT_GACHA_PAGE("emomo_quest/gift_gacha_page"),
    EMOMO_QUEST_GIFT_GACHA_RESULT("emomo_quest/open_gift_gacha"),
    EMOMO_QUEST_OPEN_EQUIPMENT_GACHA("emomo_quest/open_equipment_gacha"),
    EMOMO_QUEST_COMPLETE_OPEN_EQUIPMENT_GACHA_ANIMATION("emomo_quest/complete_open_equipment_gacha_animation"),
    EMOMO_QUEST_LOG("emomo_quest/log"),
    EMOMO_QUEST_CLOSE_GAME("emomo_quest/close_game"),
    CLOSE_GAME("close_game");
    
    public static final Companion Companion = new Companion(null);
    private final String value;

    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(h hVar) {
            this();
        }

        public final MiniGameOutputType fromString(String str) {
            MiniGameOutputType miniGameOutputType;
            p.h(str, "value");
            MiniGameOutputType[] values = MiniGameOutputType.values();
            int length = values.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    miniGameOutputType = null;
                    break;
                }
                miniGameOutputType = values[i10];
                if (p.c(miniGameOutputType.getValue(), str)) {
                    break;
                }
                i10++;
            }
            return miniGameOutputType == null ? MiniGameOutputType.UNKNOWN : miniGameOutputType;
        }
    }

    MiniGameOutputType(String str) {
        this.value = str;
    }

    public final String getValue() {
        return this.value;
    }
}
