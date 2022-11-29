package com.dena.mirrorman.net.api;

/* loaded from: classes2.dex */
public final class Referer {
    public static final int $stable = 0;
    public static final String ADD_TO_MYAPP = ".add_my_app";
    public static final String APP_PAGE = "app_page";
    public static final String APP_USER_ID = ".app_user_id";
    public static final String ARCHIVE_VIEW = "archive_view";
    public static final String AVATAR = "avatar";
    public static final String BLOCK = ".block";
    public static final String BLOCKEDUSERS = "blocked_users";
    public static final String BROADCAST = "broadcast";
    public static final String BROADCAST_AVATAR = "broadcast.avatar";
    public static final String CLOSET = "closet";
    public static final String COIN_CHALLENGE = "coin_challenge";
    public static final String COLLAB_CONNECTED_USERS_LIST = "collab_connected_users_list";
    public static final String COLLAB_RECOMMEND_LIVE = "collab_recommend_live";
    public static final String Connect = "connect";
    public static final String DEEPLINK = "deeplink";
    public static final String EXCHANGE_DIAMOND_TO_GIFT_CODE = "exchange_diamond_to_gift_code";
    public static final String FOLLOW = ".follow";
    public static final String FOLLOWER = "follower";
    public static final String FOLLOWING = "following";
    public static final String FROM_GCM = ".from_gcm";
    public static final String GIFT_CODE_SELECTION = "incentive_gift_code";
    public static final String GIFT_PANEL = "gift_panel";
    public static final String GROUPSHOT_CAMPAIGN = "groupshot.campaign";
    public static final String HOME = "home";
    public static final String HOME_FOLLOW = "home.follow";
    public static final String HOME_SELECT = "home.select";
    public static final Referer INSTANCE = new Referer();
    public static final String KICKEDUSERS = "kicked_users";
    public static final String LINK_TWITTER = ".link_twitter";
    public static final String LIVEOWNER = ".liveowner";
    public static final String LIVE_GAME = "live_game";
    public static final String LIVE_HISTORY = "live_history";
    public static final String LIVE_PREPARATION = "live.preparation";
    public static final String LIVE_REQUEST_USERS = "live_request_users";
    public static final String LIVE_RESULT = "live_result";
    public static final String LIVE_VIEW = "live_view";
    public static final String LIVE_VIEWERS = "live_viewers";
    public static final String MISSION = "mission";
    public static final String MY_PAGE = "my_page";
    public static final String MY_PAGE_BALLOON = "my_page_balloon";
    public static final String NEWFOLLOWERS = "new_follower";
    public static final String NOTICE = "notice";
    public static final String OPEN_PROFILE = ".open_profile";
    public static final String PLAYER_VIEWER_LIST = "player_viewer_list";
    public static final String POST_COMMENT = ".post_comment";
    public static final String PROFILE = "profile";
    public static final String PROFILE_EDIT = "profile_edit";
    public static final String PUSH_NOTIFICATION = "push_notification";
    public static final String RECOMMENDED_GIFTS = "recommended_gifts";
    public static final String REPORT_USER = ".report_user";
    public static final String SEARCH = "search";
    public static final String SEND_GIFT = ".send_gift";
    public static final String SETTINGS = "settings";
    public static final String SETTING_WITHDRAW = "setting.withdraw";
    public static final String SHORTCUT_GIFT = "shortcut_gift";
    public static final String START_LIVEPREPARE = ".start_liveprepare";
    public static final String TUTORIAL = "tutorial";
    public static final String UNFOLLOW = ".unfollow";
    public static final String URGE_USERS = ".urge_users";
    public static final String URLSCHEME = "urlscheme";
    public static final String VIEW_HISTORY = "view_history";
    public static final String WEBVIEW = "webview";

    /* loaded from: classes2.dex */
    public static final class Broadcast {
        public static final int $stable = 0;
        public static final String APP_SETTING = "broadcast.setting.app_setting";
        public static final String COLLAB_END = "broadcast.collab_end";
        public static final String GROUPSHOT = "broadcast.groupshot";
        public static final String GROUPSHOT_GALLERY = "broadcast.groupshot.gallery";
        public static final String GROUPSHOT_GALLERY_DETAIL = "broadcast.groupshot.gallery.detail";
        public static final Broadcast INSTANCE = new Broadcast();
        public static final String POWERSAVE = "broadcast.powersave";
        public static final String RESULT = "broadcast.result";
        public static final String SETTING = "broadcast.setting";
        public static final String VIEWERLIST = "broadcast.viewerlist";

        private Broadcast() {
        }
    }

    /* loaded from: classes2.dex */
    public static final class Chat {
        public static final int $stable = 0;
        public static final String GROUP_EDIT = "chat.group_edit";
        public static final String GROUP_USERS = "chat.group_users";
        public static final Chat INSTANCE = new Chat();
        public static final String INVITATIONS = "chat.invitations";
        public static final String THREAD = "chat.thread";

        private Chat() {
        }
    }

    /* loaded from: classes2.dex */
    public static final class Event {
        public static final int $stable = 0;
        public static final String EMOMO_RUN = "event.emomo_run";
        public static final String EMOMO_RUN_RANKING = "event.emomo_run_ranking";
        public static final String GIFT_RANKING = "event.gift_ranking";
        public static final Event INSTANCE = new Event();
        public static final String PETIT_GIFT_RANKING = "event.petit_gift_ranking";
        public static final String SHOOTER_RANKING = "event.shooter_ranking";

        private Event() {
        }
    }

    /* loaded from: classes2.dex */
    public static final class LiveView {
        public static final int $stable = 0;
        public static final String AUTO_RETRY = "live_view.auto_retry";
        public static final String AUTO_RETRY2 = "live_view.auto_retry2";
        public static final String FINISHED_DIALOG = "live_view.finished_dialog";
        public static final String FINISHED_DIALOG_URGE_FOLLOW = "live_view.finished_dialog_urge_follow";
        public static final String GUIDE_FOLLOW = "live_view.guide_follow";
        public static final LiveView INSTANCE = new LiveView();
        public static final String LEFTUP_FOLLOW_BUTTON = "live_view.leftup_follow_button";
        public static final String PROFILE_COLLAB_MATCHING = "live_view.profile.collab_matching";
        public static final String RESUME = "live_view.resume";
        public static final String RETRY = "live_view.retry";
        public static final String SETTING = "live_view.setting";

        private LiveView() {
        }
    }

    /* loaded from: classes2.dex */
    public static final class Notice {
        public static final int $stable = 0;
        public static final String CAMPAIGN = "notice.campaign";
        public static final String FOLLOW_PUSH_SETTINGS = "notice.follow_push_settings";
        public static final Notice INSTANCE = new Notice();
        public static final String NEWS = "notice.news";
        public static final String PRESENT_BOX = "notice.present_box";
        public static final String YOURS = "notice.yours";

        /* loaded from: classes2.dex */
        public static final class Campaign {
            public static final int $stable = 0;
            public static final String APP = "notice.campaign.app";
            public static final String EMOMO = "notice.campaign.emomo";
            public static final Campaign INSTANCE = new Campaign();
            public static final String RECOMMEND = "notice.campaign.recommend";

            private Campaign() {
            }
        }

        private Notice() {
        }
    }

    /* loaded from: classes2.dex */
    public static final class Search {
        public static final int $stable = 0;
        public static final String APP = "search.app";
        public static final Search INSTANCE = new Search();
        public static final String LIVE = "search.live";
        public static final String RECOMMEND_APPS = "search.recommend_apps";
        public static final String RECOMMEND_USERS = "search.recommend_users";
        public static final String USER = "search.user";

        private Search() {
        }
    }

    private Referer() {
    }
}
