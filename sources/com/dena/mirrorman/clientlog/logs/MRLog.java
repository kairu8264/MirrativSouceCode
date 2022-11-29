package com.dena.mirrorman.clientlog.logs;

import io.l;
import java.util.List;
import jo.h;
import jo.p;
import ke.a;
import wn.k;
import wn.q;
import wn.v;

/* loaded from: classes2.dex */
public final class MRLog {
    public static final String ACTION_COLLAB_REQUEST_IMP = "collab.request_imp";
    public static final String ACTION_COLLAB_START_BROADCAST_BUTTON_TAP = "collab.start_broadcast_button_tap";
    public static final String ACTION_TYPE_ACCOUNT_IMP = "account.imp";
    public static final String ACTION_TYPE_ANNOUNCEMENT_FOREGROUND_PERMISSION_IMP = "announcement.foreground_permission.imp";
    public static final String ACTION_TYPE_ANNOUNCEMENT_FOREGROUND_PERMISSION_TAP = "announcement.foreground_permission.tap";
    public static final String ACTION_TYPE_AVATAR_CATEGORY_SELECT = "avatar.category_select";
    public static final String ACTION_TYPE_AVATAR_CLOSET_HELP_CLICK = "avatar.closet_help.click";
    public static final String ACTION_TYPE_AVATAR_GESTURE = "avatar.gesture";
    public static final String ACTION_TYPE_AVATAR_IMP_CLOSET = "avatar.imp_closet";
    public static final String ACTION_TYPE_AVATAR_ITEM_SCROLL = "avatar_item_scroll";
    public static final String ACTION_TYPE_AVATAR_ITEM_SELECT = "avatar_item_select";
    public static final String ACTION_TYPE_AVATAR_KANDUME_HELP_CLICK = "avatar.kandume_help.click";
    public static final String ACTION_TYPE_AVATAR_PURCHASE_CLICK = "avatar_purchase_btn.click";
    public static final String ACTION_TYPE_AVATAR_SELECT_POSE_OPEN = "avatar.select_pose.open";
    public static final String ACTION_TYPE_AVATAR_SLOT_CLICK = "avatar_slot.click";
    public static final String ACTION_TYPE_AVATAR_SLOT_EDIT_NAME = "avatar_slot.edit_name";
    public static final String ACTION_TYPE_AVATAR_SLOT_SELECT = "avatar_slot.select";
    public static final String ACTION_TYPE_AVATAR_SUBCATEGORY_SELECT = "avatar.subcategory_select";
    public static final String ACTION_TYPE_AVATAR_ZOOM = "avatar.zoom";
    public static final String ACTION_TYPE_BILLING_CONSUMED = "billing.consumed";
    public static final String ACTION_TYPE_BROADCAST_SETTING_TAP = "broadcast_setting.tap";
    public static final String ACTION_TYPE_CAMPAIGN_MODAL_BUTTON_TAP = "campaign_modal.button_tap";
    public static final String ACTION_TYPE_CAMPAIGN_MODAL_IMP = "campaign_modal.imp";
    public static final String ACTION_TYPE_CAROUSEL_BANNER = "carousel_banner";
    public static final String ACTION_TYPE_CASH_BONUS_HISTORY_IMP = "cash_bonus_history.imp";
    public static final String ACTION_TYPE_CHAT_HEALTH_AGREEMENT_IMP = "chat_health.agreement.imp";
    public static final String ACTION_TYPE_CHAT_HEALTH_BIRTHDAY_IMP = "chat_health.birthday.imp";
    public static final String ACTION_TYPE_CHAT_HEALTH_GENERATION_IMP = "chat_health.generation.imp";
    public static final String ACTION_TYPE_CHAT_HEALTH_REQUEST_IMP = "chat_health.request.imp";
    public static final String ACTION_TYPE_CHEER_FUNCTION_LP_IMP = "live.view_cheer_function_lp.imp";
    public static final String ACTION_TYPE_CHILD_COLLAB_FAILED = "child.collab.failed";
    public static final String ACTION_TYPE_CLICK = "click";
    public static final String ACTION_TYPE_COIN_CHALLENGE_CM_VIEW_TAP = "coin_challenge.cm_view.tap";
    public static final String ACTION_TYPE_COIN_CONSUME = "coin_consume";
    public static final String ACTION_TYPE_COLLAB_CONNECTED_USERS_IMP = "collab.connected_users_imp";
    public static final String ACTION_TYPE_COLLAB_INVITABLE_USERS_IMP = "collab.invitable_users_imp";
    public static final String ACTION_TYPE_COLLAB_INVITABLE_USERS_LIST_GET = "collab.invitable_users_list_get";
    public static final String ACTION_TYPE_COLLAB_INVITE_IMP = "collab.invite_imp";
    public static final String ACTION_TYPE_COLLAB_MATCHING_CANCEL = "collab.matching.cancel";
    public static final String ACTION_TYPE_COLLAB_MATCHING_CLOSE = "collab.matching.close";
    public static final String ACTION_TYPE_COLLAB_MATCHING_PLAYSTYLE_NOTICE = "collab_matching.playstyle_notice";
    public static final String ACTION_TYPE_COLLAB_MATCHING_PLAYSTYLE_NOTICE_IMP = "collab_matching.playstyle_notice_imp";
    public static final String ACTION_TYPE_COLLAB_MATCHING_RESTART = "collab.matching.restart";
    public static final String ACTION_TYPE_COLLAB_MATCHING_START_FAILURE_NOTICE = "collab_matching.start_failure_notice";
    public static final String ACTION_TYPE_COLLAB_MATCHING_START_POP_IMP = "collab_matching.start_pop_imp";
    public static final String ACTION_TYPE_COLLAB_VOLUME_CONTROL = "collab.volume_control";
    public static final String ACTION_TYPE_COMMENT_SEND_BUTTON_TAP = "comment.send_button_tap";
    public static final String ACTION_TYPE_COMMENT_SHOW_OWN_COMMENT = "comment.show_own_comment";
    public static final String ACTION_TYPE_CONTINUOUS_LIVE_HOLIDAY_PURCHASE_POPUP = "continuous_live_holiday.purchase_popup";
    public static final String ACTION_TYPE_CONTRACT_RANKING_VIEW = "contract.ranking.view";
    public static final String ACTION_TYPE_DAILY_MISSION_IMP = "daily_mission.imp";
    public static final String ACTION_TYPE_DAILY_MISSION_INSTALL_BUTTON_TAP = "daily_mission.install_button.tap";
    public static final String ACTION_TYPE_DAILY_MISSION_MOVIE_PLAY = "daily_mission.movie.play";
    public static final String ACTION_TYPE_DATA_INHERIT_LOGIN_IMP = "data_inherit_login_imp";
    public static final String ACTION_TYPE_DEMOGRAPHIC = "demo_graphic";
    public static final String ACTION_TYPE_DEMOGRAPHIC_IMP = "demo_graphic.imp";
    public static final String ACTION_TYPE_DISPLAYED_GIFT = "displayed.gift";
    public static final String ACTION_TYPE_EDIT_DEVICE_PUSH_SETTING = "edit_device_push_setting";
    public static final String ACTION_TYPE_EMOMO_QUEST_LANDING_PAGE_IMP = "emomo_quest.landing_page.imp";
    public static final String ACTION_TYPE_EMOMO_QUEST_RANKING_IMP = "emomo_quest.ranking.imp";
    public static final String ACTION_TYPE_EMOMO_QUEST_SHARE_PANEL_COMPLETE = "emomo_quest.share_panel.complete";
    public static final String ACTION_TYPE_EMOMO_QUEST_SHARE_PANEL_IMP = "emomo_quest.share_panel.imp";
    public static final String ACTION_TYPE_EMOMO_RUN_GAME_HEARTBEAT = "emomo_run.game_heartbeat";
    public static final String ACTION_TYPE_EMOMO_RUN_GAME_START = "emomo_run.game_start";
    public static final String ACTION_TYPE_EMOMO_RUN_RESULT_IMP = "emomo_run.result_imp";
    public static final String ACTION_TYPE_EMOMO_RUN_SHARE_PANEL = "emomo_run.share_panel";
    public static final String ACTION_TYPE_EMOMO_RUN_TITLE_IMP = "emomo_run.title_imp";
    public static final String ACTION_TYPE_EMOMO_SHARE_SCREEN = "emomo_share_screen";
    public static final String ACTION_TYPE_EMOMO_SHARE_SHARE_PANEL = "emomo_share.share_panel";
    public static final String ACTION_TYPE_EMOMO_SHARE_STOP_SHARE_SCREEN = "emomo_share.stop_share_screen";
    public static final String ACTION_TYPE_EXCHANGE_GIFT_CODE_CONFIRM = "exchange_gift_code.confirm";
    public static final String ACTION_TYPE_EXCHANGE_GIFT_CODE_SELECT = "exchange_gift_code.select";
    public static final String ACTION_TYPE_FOLLOW_RECOMMEND_POPUP_IMP = "follow_recommend_popup.imp";
    public static final String ACTION_TYPE_FOREGROUND_PERMISSION_GOT = "foreground_permission.got";
    public static final String ACTION_TYPE_FRIEND_LINK_BACK = "friend_link.back";
    public static final String ACTION_TYPE_FRIEND_LINK_CLICK = "friend_link.join";
    public static final String ACTION_TYPE_GAME_ID_COMMENT_BTN_TAP = "game_id_comment_btn_tap";
    public static final String ACTION_TYPE_GET_DEVICE_SETTING = "get_device_setting";
    public static final String ACTION_TYPE_GIFT_BOX_GACHA_CLICK_LINE = "giftbox_gacha.click_line";
    public static final String ACTION_TYPE_GIFT_BOX_GACHA_CLICK_OTHER = "giftbox_gacha.click_other";
    public static final String ACTION_TYPE_GIFT_BOX_GACHA_CLICK_TWEET = "giftbox_gacha.click_tweet";
    public static final String ACTION_TYPE_GIFT_BOX_GACHA_GACHA_IMP = "giftbox_gacha.gacha_imp";
    public static final String ACTION_TYPE_GIFT_BOX_GACHA_PRESENT_IMP = "giftbox_gacha.present_imp";
    public static final String ACTION_TYPE_GIFT_BOX_GACHA_TWEET_DONE = "giftbox_gacha.tweet_done";
    public static final String ACTION_TYPE_GIFT_PANEL_TAB_IMP = "live.imp_gift_panel_tab";
    public static final String ACTION_TYPE_GIFT_RANKING_POINT_ITEM_DISPLAYED = "displayed.point_item";
    public static final String ACTION_TYPE_GIFT_RANKING_RANK_UP_DISPLAYED = "displayed.rank_up";
    public static final String ACTION_TYPE_GROUPSHOT_BACKGROUND_SELECT = "groupshot.background_select";
    public static final String ACTION_TYPE_GROUPSHOT_GALLERY_BUTTON = "gallery.button_group_shot_gallery";
    public static final String ACTION_TYPE_GROUPSHOT_GALLERY_DETAIL = "gallery.detail";
    public static final String ACTION_TYPE_GROUPSHOT_GALLERY_LIVE_CATALOG = "gallery.show_on_home";
    public static final String ACTION_TYPE_GROUPSHOT_PARTICIPANT_SELECT = "groupshot.participant_select";
    public static final String ACTION_TYPE_GROUPSHOT_POSE_SELECT = "groupshot.pose_select";
    public static final String ACTION_TYPE_GROUPSHOT_POSITION_SELECT = "groupshot.position_select";
    public static final String ACTION_TYPE_GROUPSHOT_SAVE_CLICK = "groupshot.save.click";
    public static final String ACTION_TYPE_GROUPSHOT_SETTING_START = "groupshot.setting_start";
    public static final String ACTION_TYPE_GROUPSHOT_SHARE = "groupshot.share";
    public static final String ACTION_TYPE_GROUPSHOT_TAKEN = "groupshot.taken";
    public static final String ACTION_TYPE_GROUPSHOT_THUMBNAIL_SET = "groupshot.thumbnail_set";
    public static final String ACTION_TYPE_HOME_CLICK_APP = "home.click_app";
    public static final String ACTION_TYPE_INCENTIVE_GIFT_CODE_CONFIRM = "incentive_gift_code.confirm";
    public static final String ACTION_TYPE_INCENTIVE_GIFT_CODE_SELECT = "incentive_gift_code.select";
    public static final String ACTION_TYPE_INQUIRY_TAP = "inquiry.tap";
    public static final String ACTION_TYPE_INVITATION_BANNER = "invitation_banner";
    public static final String ACTION_TYPE_KARAOKE_KEY_CHANGED = "karaoke.key_change";
    public static final String ACTION_TYPE_KARAOKE_OPEN_SETTING_SCREEN = "karaoke.open_setting_screen";
    public static final String ACTION_TYPE_KARAOKE_TAP_SINGER_INITIAL_BAR = "karaoke.tap_singer_initial_bar";
    public static final String ACTION_TYPE_KARAOKE_TEMPO_CHANGED = "karaoke.tempo_change";
    public static final String ACTION_TYPE_LIVE_ANNOTATION = "live.annotation";
    public static final String ACTION_TYPE_LIVE_ANNOUNCEMENT_IMP = "live_announcement.imp";
    public static final String ACTION_TYPE_LIVE_CATALOG_TAP = "live.catalog_tap";
    public static final String ACTION_TYPE_LIVE_CATALOG_VISIBLE = "live.catalog_visible";
    public static final String ACTION_TYPE_LIVE_CLICK_CURRENT_USER_GIFT_RANK = "live.click_current_user_gift_rank";
    public static final String ACTION_TYPE_LIVE_CLICK_RECOMMEND_LIVE = "live.click_recommend_live";
    public static final String ACTION_TYPE_LIVE_GAME_DETAIL_IMP = "live_game_detail.imp";
    public static final String ACTION_TYPE_LIVE_GAME_LISTING_ICON_IMP = "live_game_listing.icon_imp";
    public static final String ACTION_TYPE_LIVE_GAME_LISTING_ICON_TAP = "live_game_listing.icon_tap";
    public static final String ACTION_TYPE_LIVE_GAME_LISTING_IMP = "live_game_listing.imp";
    public static final String ACTION_TYPE_LIVE_GAME_LISTING_TAB_SELECT = "live_game_listing.tab.select";
    public static final String ACTION_TYPE_LIVE_IMP_COLLAB_INVITE_BUTTON = "live.imp_collab_invite_button";
    public static final String ACTION_TYPE_LIVE_PLAYER_END = "live.player_end";
    public static final String ACTION_TYPE_LIVE_PLAYER_SEASON_RATING_TAP = "live.player_season_rating.tap";
    public static final String ACTION_TYPE_LIVE_PLAYER_START = "live.player_start";
    public static final String ACTION_TYPE_LIVE_PREPARATION_BUTTON_TAP = "live.preparation_button.tap";
    public static final String ACTION_TYPE_LIVE_PREPARATION_IMP = "live.preparation.imp";
    public static final String ACTION_TYPE_LIVE_PRESET_CLICK = "live_preset.click";
    public static final String ACTION_TYPE_LIVE_PRESET_LOAD = "live_preset.load";
    public static final String ACTION_TYPE_LIVE_REQUEST_IMP = "live_request.imp";
    public static final String ACTION_TYPE_LIVE_REQUEST_USERS_IMP = "live_request.users.imp";
    public static final String ACTION_TYPE_LIVE_RESULT_IMP = "live.result.imp";
    public static final String ACTION_TYPE_LIVE_RESULT_SHARE = "live_result_share";
    public static final String ACTION_TYPE_LIVE_RESULT_SHARE_SHARE_PANEL = "live_result_share.share_panel";
    public static final String ACTION_TYPE_LIVE_SETTING_BUTTON_TAP = "live.setting_button.tap";
    public static final String ACTION_TYPE_LIVE_SETTING_HIDE_NOTIFICATION = "live.setting.hide.notification";
    public static final String ACTION_TYPE_LIVE_SETTING_HIDE_NOTIFICATION_ALERT = "live.setting.hide.notification.alert";
    public static final String ACTION_TYPE_LIVE_SHOW_RECOMMEND_LIVE = "live.show_recommend_live";
    public static final String ACTION_TYPE_LIVE_TAP_COLLAB_INVITE_BUTTON = "live.tap_collab_invite_button";
    public static final String ACTION_TYPE_LIVE_TAP_SETTING = "live.tap_setting";
    public static final String ACTION_TYPE_LIVE_VIEW_CAST_GAME_ID_TAP = "live_view.cast_game_id_tap";
    public static final String ACTION_TYPE_LIVE_VIEW_CAST_GAME_ID_URL_TAP = "live_view.cast_game_id_url_tap";
    public static final String ACTION_TYPE_LIVE_VIEW_PROFILE = "live.view_profile";
    public static final String ACTION_TYPE_LIVE_VIEW_START = "live.view_start";
    public static final String ACTION_TYPE_LIVE_WIPE_END = "live.wipe_end";
    public static final String ACTION_TYPE_LIVE_WIPE_START = "live.wipe_start";
    public static final String ACTION_TYPE_LLSTREAM_DECODE_ERROR = "llstream.decode_error";
    public static final String ACTION_TYPE_MEDIA_CODEC_INFO = "media_codec_info";
    public static final String ACTION_TYPE_MEMORIAL_COMMENT = "memorial.comment";
    public static final String ACTION_TYPE_MISSION_CLEAR_POP_IMP = "mission_clear_pop.imp";
    public static final String ACTION_TYPE_MISSION_CLEAR_POP_TAP = "mission_clear_pop.tap";
    public static final String ACTION_TYPE_MULTI_EMOMO_GIFT_LOAD = "multi_emomo_gift_load";
    public static final String ACTION_TYPE_MULTI_EMOMO_GIFT_MOVIE_FINISHED = "multi_emomo_gift_movie_finished";
    public static final String ACTION_TYPE_MYPAGE_CONTINUOUS_LIVE_RIBBON_TAP = "mypage.continuous_live_ribbon.tap";
    public static final String ACTION_TYPE_MYPAGE_TAB_SELECT = "mypage.tab.select";
    public static final String ACTION_TYPE_MY_GIFT_CREATION_RICH_TAB_IMP = "mygift.creation_rich_tab_imp";
    public static final String ACTION_TYPE_MY_GIFT_CREATION_SCREEN_IMP = "mygift.creation_screen_imp";
    public static final String ACTION_TYPE_MY_GIFT_CREATION_SIMPLE_TAB_IMP = "mygift.creation_simple_tab_imp";
    public static final String ACTION_TYPE_NOTICE_CAGALOG_VISIBLE = "notice.catalog_visible";
    public static final String ACTION_TYPE_NOTICE_CAMPAIGN_TAB_VIEW = "notice.campaign_tab.view";
    public static final String ACTION_TYPE_NOTICE_CATALOG_TAP = "notice.catalog_tap";
    public static final String ACTION_TYPE_NOTICE_CLICK = "notice.click";
    public static final String ACTION_TYPE_NOTICE_LAUNCH = "notice.launch";
    public static final String ACTION_TYPE_NOTICE_PRESENT_BUTTON_TAP = "notice.present_button_tap";
    public static final String ACTION_TYPE_NOTICE_TAB_VIEW = "notice.tab_view";
    public static final String ACTION_TYPE_OFFER_WALL_BUTTON_TAP = "offer_wall_button.tap";
    public static final String ACTION_TYPE_OMOTENASHI_LP_IMP = "live.omotenashi_lp.imp";
    public static final String ACTION_TYPE_OTHER_USER_PROFILE_EMOMO_VIEW_IMP = "other_user_profile.emomo_view_imp";
    public static final String ACTION_TYPE_OTHER_USER_PROFILE_IMP = "other_user_profile.imp";
    public static final String ACTION_TYPE_PAYMENT_RESTORE = "payment.restore";
    public static final String ACTION_TYPE_PERFORMANCE_MONITORING = "performance_monitoring";
    public static final String ACTION_TYPE_POSTED_GAME_ID_COMMENT_TAP = "posted_game_id_comment_tap";
    public static final String ACTION_TYPE_PROFILE_SHARE_DONE = "profile_share.done";
    public static final String ACTION_TYPE_PROFILE_SHARE_TAP = "profile_share.tap";
    public static final String ACTION_TYPE_PUSH_NOTIFICATION_CLICK = "push_notification.click";
    public static final String ACTION_TYPE_PUSH_NOTIFICATION_RECEIVE = "push_notification.receive";
    public static final String ACTION_TYPE_RECEIVED_GIFT = "received.gift";
    public static final String ACTION_TYPE_RECORDER_RETRY = "recorder.retry";
    public static final String ACTION_TYPE_REWARD_CM_BUTTON_TMP = "reward_cm_button.imp";
    public static final String ACTION_TYPE_SAFETY_NET = "safety.net";
    public static final String ACTION_TYPE_SETTING_COMMENT = "live.setting.comment";
    public static final String ACTION_TYPE_SETTING_DATA_INHERIT_TAP = "setting.data_inherit_tap";
    public static final String ACTION_TYPE_SETTING_GAME_ID_EDIT_IMP = "setting.game_id_edit_imp";
    public static final String ACTION_TYPE_SETTING_GAME_ID_HELP = "setting.game_id_help";
    public static final String ACTION_TYPE_SETTING_GIFT_OVERLAY = "live.setting.gift_overlay";
    public static final String ACTION_TYPE_SETTING_IMP = "setting.imp";
    public static final String ACTION_TYPE_SETTING_MIC = "live.setting.mic";
    public static final String ACTION_TYPE_SHARE_ACPN_SHARE_BUTTON_CLICK = "share_acpn.share_button.click";
    public static final String ACTION_TYPE_SHARE_PANEL_PROCEED = "share_panel.proceed";
    public static final String ACTION_TYPE_SHOOTER_ANALYSIS_LOG = "shooter.analysis_log";
    public static final String ACTION_TYPE_SHOOTER_CLIENT_FETCH_INFORMATION = "shooter.client_fetch_information";
    public static final String ACTION_TYPE_SHOOTER_CLIENT_GAME_SCREEN_START = "shooter.client_game_screen_start";
    public static final String ACTION_TYPE_SHOOTER_CLIENT_UNITY_LAUNCH = "shooter.client_unity_launch";
    public static final String ACTION_TYPE_SHOOTER_CLIENT_WAIT_AT_LOBBY = "shooter.client_wait_at_lobby";
    public static final String ACTION_TYPE_SHOOTER_GO_PLAY = "shooter.go_play";
    public static final String ACTION_TYPE_SHOOTER_HOST_CREATE_ROOM = "shooter.host_create_room";
    public static final String ACTION_TYPE_SHOOTER_HOST_FETCH_INFORMATION = "shooter.host_fetch_information";
    public static final String ACTION_TYPE_SHOOTER_HOST_GAME_SCREEN_START = "shooter.host_game_screen_start";
    public static final String ACTION_TYPE_SHOOTER_HOST_ROOM_ID_SEND = "shooter.host_room_id_send";
    public static final String ACTION_TYPE_SHOOTER_HOST_UNITY_LAUNCH = "shooter.host_unity_launch";
    public static final String ACTION_TYPE_SHOOTER_HOST_WAIT_AT_LOBBY = "shooter.host_wait_at_lobby";
    public static final String ACTION_TYPE_SHOOTER_ICON_TAP = "shooter.icon_tap";
    public static final String ACTION_TYPE_SPPEDTEST = "speedtest";
    public static final String ACTION_TYPE_TOOLBAR_SEARCH = "toolbar.launch_search_tab";
    public static final String ACTION_TYPE_TUTORIAL_AVATAR_CREATE_TAP = "tutorial.avatar_create.tap";
    public static final String ACTION_TYPE_TUTORIAL_MYAPP_REG = "tutorial.myapp_reg";
    public static final String ACTION_TYPE_TUTORIAL_MYAPP_REG_SEARCH = "tutorial.myapp_reg_search";
    public static final String ACTION_TYPE_TUTORIAL_NUU_WELCOME_LIVE = "tutorial.nuu_welcome_live";
    public static final String ACTION_TYPE_TUTORIAL_SELECT_LOGIN_CREATE = "tutorial.select_login_create";
    public static final String ACTION_TYPE_TUTORIAL_SURVEY = "tutorial.survey";
    public static final String ACTION_TYPE_TUTORIAL_SURVEY_IMP = "tutorial.survey.imp";
    public static final String ACTION_TYPE_TWITTER_FOLLOW_POPUP = "twitter_follow_popup";
    public static final String ACTION_TYPE_URGE_APP_PUSH_SETTING = "urge_app_push_setting";
    public static final String ACTION_TYPE_URGE_DEVICE_PUSH_SETTING = "urge_device_push_setting";
    public static final String ACTION_TYPE_USER_IDENTIFICATION_TAP = "user_identification.tap";
    public static final String ACTION_TYPE_WEEKLY_MISSION_IMP = "weekly_mission.imp";
    public static final String ACTION_TYPE_YELL_VIEW_YELL_RANK_LIST_IMP = "yell.view_yell_rank_list_imp";
    public static final String PAYLOAD_ACTION_URL = "action_url";
    public static final String PAYLOAD_AD_ID = "ad_id";
    public static final String PAYLOAD_GIFT_ID = "gift_id";
    public static final String PAYLOAD_KEY_APP_ID = "app_id";
    public static final String PAYLOAD_KEY_CAST_ID = "cast_id";
    public static final String PAYLOAD_KEY_CAST_NAME = "cast_name";
    public static final String PAYLOAD_KEY_CATEGORY_ID = "category_id";
    public static final String PAYLOAD_KEY_DESCRIPTION = "description";
    public static final String PAYLOAD_KEY_ERROR = "error";
    public static final String PAYLOAD_KEY_IS_MUTED = "is_muted";
    public static final String PAYLOAD_KEY_IS_OMOTENASHI = "is_omotenashi";
    public static final String PAYLOAD_KEY_LIVE_ID = "live_id";
    public static final String PAYLOAD_KEY_LIVE_NAME = "live_name";
    public static final String PAYLOAD_KEY_MEMORIAL_ID = "memorial_id";
    public static final String PAYLOAD_KEY_SETTING = "setting";
    public static final String PAYLOAD_KEY_STEP = "step";
    public static final String PAYLOAD_KEY_TARGET_DETAIL = "target_detail";
    public static final String PAYLOAD_KEY_TEXT = "text";
    public static final String PAYLOAD_KEY_URL = "url";
    public static final String PAYLOAD_KEY_WHERE = "where";
    public static final String PAYLOAD_NOTIFICATION_TYPE = "notification_type";
    public static final String PAYLOAD_PAGE_ID = "page_id";
    public static final String PAYLOAD_TAB_ID = "tab_id";
    public static final String TARGET_ID_IMP = "imp";
    public static final String TARGET_ID_TAP = "tap";
    public static final String TARGET_TYPE_BANNER = "banner";
    public static final String TARGET_TYPE_GAME_ID = "game_id";
    public static final String TARGET_TYPE_LIVE = "live";
    public static final String TARGET_TYPE_LIVER = "liver";
    public static final String TARGET_TYPE_NOT_IN_LIVE = "not in live";
    public static final String TARGET_TYPE_QUIZ = "quiz";
    public static final String TARGET_TYPE_RETURN_VIEW = "return_view";
    public static final String TARGET_TYPE_SERVICE = "service";
    public static final String TARGET_TYPE_URL = "url";
    public static final String TARGET_TYPE_USER = "user";
    public static final String TARGET_TYPE_VIEWER = "viewer";
    public static final String TARGET_TYPE_WIPE_CLOSE = "wipe_close";
    private final String actionType;
    private final String pageId;
    private final List<k<String, String>> payload;
    private final String serviceName;
    private final String targetId;
    private final String targetType;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* loaded from: classes2.dex */
    public static final class Builder {
        public static final int $stable = 8;
        private final String actionType;
        private String pageId;
        private List<k<String, String>> payload;
        private String serviceName;
        private String targetId;
        private String targetType;

        public Builder(String str) {
            p.h(str, "actionType");
            this.actionType = str;
        }

        public final MRLog build() {
            return new MRLog(this.actionType, this.targetType, this.targetId, this.pageId, this.payload, this.serviceName);
        }

        public final String getPageId() {
            return this.pageId;
        }

        public final List<k<String, String>> getPayload() {
            return this.payload;
        }

        public final String getServiceName() {
            return this.serviceName;
        }

        public final String getTargetId() {
            return this.targetId;
        }

        public final String getTargetType() {
            return this.targetType;
        }

        public final void setPageId(String str) {
            this.pageId = str;
        }

        public final void setPayload(List<k<String, String>> list) {
            this.payload = list;
        }

        public final void setServiceName(String str) {
            this.serviceName = str;
        }

        public final void setTargetId(String str) {
            this.targetId = str;
        }

        public final void setTargetType(String str) {
            this.targetType = str;
        }
    }

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(h hVar) {
            this();
        }

        public static /* synthetic */ MRLog build$default(Companion companion, String str, l lVar, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                lVar = MRLog$Companion$build$1.INSTANCE;
            }
            p.h(str, "actionType");
            p.h(lVar, "block");
            Builder builder = new Builder(str);
            lVar.invoke(builder);
            return builder.build();
        }

        public final MRLog build(String str, l<? super Builder, v> lVar) {
            p.h(str, "actionType");
            p.h(lVar, "block");
            Builder builder = new Builder(str);
            lVar.invoke(builder);
            return builder.build();
        }

        public final k<String, String> purchaseItemIds(a aVar) {
            p.h(aVar, "equipAvatars");
            return q.a("purchase_item_ids", ShopSelectItemLog.Companion.build(aVar).toJson());
        }

        public final k<String, String> selectItemIds(a aVar) {
            p.h(aVar, "equipAvatars");
            return q.a("select_item_ids", ShopSelectItemLog.Companion.build(aVar).toJson());
        }
    }

    public MRLog(String str, String str2, String str3, String str4, List<k<String, String>> list, String str5) {
        p.h(str, "actionType");
        this.actionType = str;
        this.targetType = str2;
        this.targetId = str3;
        this.pageId = str4;
        this.payload = list;
        this.serviceName = str5;
    }

    public static final MRLog build(String str, l<? super Builder, v> lVar) {
        return Companion.build(str, lVar);
    }

    public static /* synthetic */ MRLog copy$default(MRLog mRLog, String str, String str2, String str3, String str4, List list, String str5, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = mRLog.actionType;
        }
        if ((i10 & 2) != 0) {
            str2 = mRLog.targetType;
        }
        String str6 = str2;
        if ((i10 & 4) != 0) {
            str3 = mRLog.targetId;
        }
        String str7 = str3;
        if ((i10 & 8) != 0) {
            str4 = mRLog.pageId;
        }
        String str8 = str4;
        List<k<String, String>> list2 = list;
        if ((i10 & 16) != 0) {
            list2 = mRLog.payload;
        }
        List list3 = list2;
        if ((i10 & 32) != 0) {
            str5 = mRLog.serviceName;
        }
        return mRLog.copy(str, str6, str7, str8, list3, str5);
    }

    public final String component1() {
        return this.actionType;
    }

    public final String component2() {
        return this.targetType;
    }

    public final String component3() {
        return this.targetId;
    }

    public final String component4() {
        return this.pageId;
    }

    public final List<k<String, String>> component5() {
        return this.payload;
    }

    public final String component6() {
        return this.serviceName;
    }

    public final MRLog copy(String str, String str2, String str3, String str4, List<k<String, String>> list, String str5) {
        p.h(str, "actionType");
        return new MRLog(str, str2, str3, str4, list, str5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MRLog) {
            MRLog mRLog = (MRLog) obj;
            return p.c(this.actionType, mRLog.actionType) && p.c(this.targetType, mRLog.targetType) && p.c(this.targetId, mRLog.targetId) && p.c(this.pageId, mRLog.pageId) && p.c(this.payload, mRLog.payload) && p.c(this.serviceName, mRLog.serviceName);
        }
        return false;
    }

    public final String getActionType() {
        return this.actionType;
    }

    public final String getPageId() {
        return this.pageId;
    }

    public final List<k<String, String>> getPayload() {
        return this.payload;
    }

    public final String getServiceName() {
        return this.serviceName;
    }

    public final String getTargetId() {
        return this.targetId;
    }

    public final String getTargetType() {
        return this.targetType;
    }

    public int hashCode() {
        int hashCode = this.actionType.hashCode() * 31;
        String str = this.targetType;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.targetId;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.pageId;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<k<String, String>> list = this.payload;
        int hashCode5 = (hashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        String str4 = this.serviceName;
        return hashCode5 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        return "MRLog(actionType=" + this.actionType + ", targetType=" + this.targetType + ", targetId=" + this.targetId + ", pageId=" + this.pageId + ", payload=" + this.payload + ", serviceName=" + this.serviceName + ')';
    }

    public /* synthetic */ MRLog(String str, String str2, String str3, String str4, List list, String str5, int i10, h hVar) {
        this(str, str2, str3, str4, (i10 & 16) != 0 ? null : list, (i10 & 32) != 0 ? null : str5);
    }
}
