package com.dena.mirrorman.net.api.response;

import com.dena.mirrativ.mirrativapi.core.BooleanTypeAdapter;
import com.dena.mirrorman.net.api.response.user.TimeMachine;
import java.util.List;
import jo.h;
import jo.p;
import xn.s;
import ym.b;

/* loaded from: classes2.dex */
public final class Feature {
    public static final int $stable = 0;

    /* loaded from: classes2.dex */
    public static final class Category {
        public static final int $stable = 8;

        /* renamed from: id  reason: collision with root package name */
        private int f26148id;
        private String title;

        public final int getId() {
            return this.f26148id;
        }

        public final String getTitle() {
            return this.title;
        }

        public final void setId(int i10) {
            this.f26148id = i10;
        }

        public final void setTitle(String str) {
            this.title = str;
        }
    }

    /* loaded from: classes2.dex */
    public static final class Share {
        public static final int $stable = 8;
        private String popupDescription;
        private String popupTitle;
        private String text;

        public final String getPopupDescription() {
            return this.popupDescription;
        }

        public final String getPopupTitle() {
            return this.popupTitle;
        }

        public final String getText() {
            return this.text;
        }

        public final void setPopupDescription(String str) {
            this.popupDescription = str;
        }

        public final void setPopupTitle(String str) {
            this.popupTitle = str;
        }

        public final void setText(String str) {
            this.text = str;
        }
    }

    /* loaded from: classes2.dex */
    public static final class Strings {
        public static final int $stable = 8;
        private String text_chat_tutorial_makeroom_dm;
        private String text_private_tutorial_ttl;
        private String text_q_late;

        public final String getText_chat_tutorial_makeroom_dm() {
            return this.text_chat_tutorial_makeroom_dm;
        }

        public final String getText_private_tutorial_ttl() {
            return this.text_private_tutorial_ttl;
        }

        public final String getText_q_late() {
            return this.text_q_late;
        }

        public final void setText_chat_tutorial_makeroom_dm(String str) {
            this.text_chat_tutorial_makeroom_dm = str;
        }

        public final void setText_private_tutorial_ttl(String str) {
            this.text_private_tutorial_ttl = str;
        }

        public final void setText_q_late(String str) {
            this.text_q_late = str;
        }
    }

    /* loaded from: classes2.dex */
    public static final class TweetHashTags {
        public static final int $stable = 8;
        private final List<String> line1;
        private final List<String> line2;

        public TweetHashTags() {
            this(null, null, 3, null);
        }

        public TweetHashTags(List<String> list, List<String> list2) {
            p.h(list, "line1");
            p.h(list2, "line2");
            this.line1 = list;
            this.line2 = list2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ TweetHashTags copy$default(TweetHashTags tweetHashTags, List list, List list2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                list = tweetHashTags.line1;
            }
            if ((i10 & 2) != 0) {
                list2 = tweetHashTags.line2;
            }
            return tweetHashTags.copy(list, list2);
        }

        public final List<String> component1() {
            return this.line1;
        }

        public final List<String> component2() {
            return this.line2;
        }

        public final TweetHashTags copy(List<String> list, List<String> list2) {
            p.h(list, "line1");
            p.h(list2, "line2");
            return new TweetHashTags(list, list2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof TweetHashTags) {
                TweetHashTags tweetHashTags = (TweetHashTags) obj;
                return p.c(this.line1, tweetHashTags.line1) && p.c(this.line2, tweetHashTags.line2);
            }
            return false;
        }

        public final List<String> getLine1() {
            return this.line1;
        }

        public final List<String> getLine2() {
            return this.line2;
        }

        public int hashCode() {
            return (this.line1.hashCode() * 31) + this.line2.hashCode();
        }

        public String toString() {
            return "TweetHashTags(line1=" + this.line1 + ", line2=" + this.line2 + ')';
        }

        public /* synthetic */ TweetHashTags(List list, List list2, int i10, h hVar) {
            this((i10 & 1) != 0 ? s.k() : list, (i10 & 2) != 0 ? s.k() : list2);
        }
    }

    /* loaded from: classes2.dex */
    public static final class Capabilities {
        public static final int $stable = 8;
        private final List<String> ab_emomo_tab_female_default_names;
        private final List<String> ab_emomo_tab_male_default_names;
        @b(BooleanTypeAdapter.class)
        private final boolean androidLargerVirtualdisplay;
        @b(BooleanTypeAdapter.class)
        private final boolean androidSameAspectRatioAsScreen;
        @b(BooleanTypeAdapter.class)
        private final boolean appUserDetailEnabled;
        private final String app_add_request_form_url;
        private final String avatar_asset_bundle_url;
        private final int avatar_compatible;
        @b(BooleanTypeAdapter.class)
        private final boolean coinChallengeEnabled;
        private final int collab_alpha;
        @b(BooleanTypeAdapter.class)
        private final boolean collaboEmomoEnabled;
        @b(BooleanTypeAdapter.class)
        private final boolean demographicEnabled;
        private final int demographicLastShownTime;
        @b(BooleanTypeAdapter.class)
        private final boolean disabledAlpha;
        private final String encourageLivePopupImageUrl;
        @b(BooleanTypeAdapter.class)
        private final boolean gameAppIconEnabled;
        private final int giftRankingEnabled;
        @b(BooleanTypeAdapter.class)
        private final boolean handoverCodeSupported;
        @b(BooleanTypeAdapter.class)
        private final boolean homeRewardAdButtonEnabled;
        @b(BooleanTypeAdapter.class)
        private final boolean isDefaultBroadcastQualityHigh;
        @b(BooleanTypeAdapter.class)
        private final boolean isInviteCollabSupported;
        @b(BooleanTypeAdapter.class)
        private final boolean isLlstreamV1Subscribe;
        private final int is_avatar_candidate;
        private final int karaokeEnabled;
        @b(BooleanTypeAdapter.class)
        private final boolean liveGameListingIconEnabled;
        @b(BooleanTypeAdapter.class)
        private final boolean livePrepareTutorialEnabled;
        @b(BooleanTypeAdapter.class)
        private final boolean mailSupportEnabled;
        private final int max_group_user_num;
        @b(BooleanTypeAdapter.class)
        private final boolean mediaCodecAsyncModeEnabled;
        private final int noticeCountsCacheExpire;
        @b(BooleanTypeAdapter.class)
        private final boolean offerWallOnly;
        private final String offerWallUrl;
        private final boolean onboardingSurveyEnabled;
        private final int packageUsageStatsInterval;
        private final String recommend_text_to_speech_app_id;
        private final List<Category> report_categories;
        private final String seasonRatingInfoUrl;
        private final Share share;
        private final String signature_verify_nonce;
        @b(BooleanTypeAdapter.class)
        private final boolean speedtestEnabled;
        private final Strings strings;
        private final TimeMachine timeMachine;
        private final TweetHashTags tweetHashTags;
        private final int userMeCacheExpire;

        public Capabilities(int i10, int i11, Strings strings, String str, List<Category> list, String str2, String str3, Share share, int i12, int i13, String str4, List<String> list2, List<String> list3, int i14, int i15, String str5, String str6, int i16, int i17, int i18, int i19, TweetHashTags tweetHashTags, TimeMachine timeMachine, String str7, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z20, boolean z21, boolean z22, boolean z23, boolean z24, boolean z25, boolean z26, boolean z27, boolean z28, boolean z29) {
            this.collab_alpha = i10;
            this.max_group_user_num = i11;
            this.strings = strings;
            this.signature_verify_nonce = str;
            this.report_categories = list;
            this.recommend_text_to_speech_app_id = str2;
            this.app_add_request_form_url = str3;
            this.share = share;
            this.avatar_compatible = i12;
            this.is_avatar_candidate = i13;
            this.avatar_asset_bundle_url = str4;
            this.ab_emomo_tab_female_default_names = list2;
            this.ab_emomo_tab_male_default_names = list3;
            this.karaokeEnabled = i14;
            this.giftRankingEnabled = i15;
            this.encourageLivePopupImageUrl = str5;
            this.offerWallUrl = str6;
            this.demographicLastShownTime = i16;
            this.userMeCacheExpire = i17;
            this.noticeCountsCacheExpire = i18;
            this.packageUsageStatsInterval = i19;
            this.tweetHashTags = tweetHashTags;
            this.timeMachine = timeMachine;
            this.seasonRatingInfoUrl = str7;
            this.disabledAlpha = z10;
            this.handoverCodeSupported = z11;
            this.appUserDetailEnabled = z12;
            this.gameAppIconEnabled = z13;
            this.isDefaultBroadcastQualityHigh = z14;
            this.collaboEmomoEnabled = z15;
            this.mailSupportEnabled = z16;
            this.livePrepareTutorialEnabled = z17;
            this.offerWallOnly = z18;
            this.coinChallengeEnabled = z19;
            this.demographicEnabled = z20;
            this.homeRewardAdButtonEnabled = z21;
            this.androidLargerVirtualdisplay = z22;
            this.androidSameAspectRatioAsScreen = z23;
            this.speedtestEnabled = z24;
            this.mediaCodecAsyncModeEnabled = z25;
            this.isInviteCollabSupported = z26;
            this.isLlstreamV1Subscribe = z27;
            this.liveGameListingIconEnabled = z28;
            this.onboardingSurveyEnabled = z29;
        }

        public final List<String> getAb_emomo_tab_female_default_names() {
            return this.ab_emomo_tab_female_default_names;
        }

        public final List<String> getAb_emomo_tab_male_default_names() {
            return this.ab_emomo_tab_male_default_names;
        }

        public final boolean getAndroidLargerVirtualdisplay() {
            return this.androidLargerVirtualdisplay;
        }

        public final boolean getAndroidSameAspectRatioAsScreen() {
            return this.androidSameAspectRatioAsScreen;
        }

        public final boolean getAppUserDetailEnabled() {
            return this.appUserDetailEnabled;
        }

        public final String getApp_add_request_form_url() {
            return this.app_add_request_form_url;
        }

        public final String getAvatar_asset_bundle_url() {
            return this.avatar_asset_bundle_url;
        }

        public final int getAvatar_compatible() {
            return this.avatar_compatible;
        }

        public final boolean getCoinChallengeEnabled() {
            return this.coinChallengeEnabled;
        }

        public final int getCollab_alpha() {
            return this.collab_alpha;
        }

        public final boolean getCollaboEmomoEnabled() {
            return this.collaboEmomoEnabled;
        }

        public final boolean getDemographicEnabled() {
            return this.demographicEnabled;
        }

        public final int getDemographicLastShownTime() {
            return this.demographicLastShownTime;
        }

        public final boolean getDisabledAlpha() {
            return this.disabledAlpha;
        }

        public final String getEncourageLivePopupImageUrl() {
            return this.encourageLivePopupImageUrl;
        }

        public final boolean getGameAppIconEnabled() {
            return this.gameAppIconEnabled;
        }

        public final int getGiftRankingEnabled() {
            return this.giftRankingEnabled;
        }

        public final boolean getHandoverCodeSupported() {
            return this.handoverCodeSupported;
        }

        public final boolean getHomeRewardAdButtonEnabled() {
            return this.homeRewardAdButtonEnabled;
        }

        public final int getKaraokeEnabled() {
            return this.karaokeEnabled;
        }

        public final boolean getLiveGameListingIconEnabled() {
            return this.liveGameListingIconEnabled;
        }

        public final boolean getLivePrepareTutorialEnabled() {
            return this.livePrepareTutorialEnabled;
        }

        public final boolean getMailSupportEnabled() {
            return this.mailSupportEnabled;
        }

        public final int getMax_group_user_num() {
            return this.max_group_user_num;
        }

        public final boolean getMediaCodecAsyncModeEnabled() {
            return this.mediaCodecAsyncModeEnabled;
        }

        public final int getNoticeCountsCacheExpire() {
            return this.noticeCountsCacheExpire;
        }

        public final boolean getOfferWallOnly() {
            return this.offerWallOnly;
        }

        public final String getOfferWallUrl() {
            return this.offerWallUrl;
        }

        public final boolean getOnboardingSurveyEnabled() {
            return this.onboardingSurveyEnabled;
        }

        public final int getPackageUsageStatsInterval() {
            return this.packageUsageStatsInterval;
        }

        public final String getRecommend_text_to_speech_app_id() {
            return this.recommend_text_to_speech_app_id;
        }

        public final List<Category> getReport_categories() {
            return this.report_categories;
        }

        public final String getSeasonRatingInfoUrl() {
            return this.seasonRatingInfoUrl;
        }

        public final Share getShare() {
            return this.share;
        }

        public final String getSignature_verify_nonce() {
            return this.signature_verify_nonce;
        }

        public final boolean getSpeedtestEnabled() {
            return this.speedtestEnabled;
        }

        public final Strings getStrings() {
            return this.strings;
        }

        public final TimeMachine getTimeMachine() {
            return this.timeMachine;
        }

        public final TweetHashTags getTweetHashTags() {
            return this.tweetHashTags;
        }

        public final int getUserMeCacheExpire() {
            return this.userMeCacheExpire;
        }

        public final boolean isDefaultBroadcastQualityHigh() {
            return this.isDefaultBroadcastQualityHigh;
        }

        public final boolean isInviteCollabSupported() {
            return this.isInviteCollabSupported;
        }

        public final boolean isLlstreamV1Subscribe() {
            return this.isLlstreamV1Subscribe;
        }

        public final int is_avatar_candidate() {
            return this.is_avatar_candidate;
        }

        public /* synthetic */ Capabilities(int i10, int i11, Strings strings, String str, List list, String str2, String str3, Share share, int i12, int i13, String str4, List list2, List list3, int i14, int i15, String str5, String str6, int i16, int i17, int i18, int i19, TweetHashTags tweetHashTags, TimeMachine timeMachine, String str7, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z20, boolean z21, boolean z22, boolean z23, boolean z24, boolean z25, boolean z26, boolean z27, boolean z28, boolean z29, int i20, int i21, h hVar) {
            this(i10, i11, strings, str, list, str2, str3, share, i12, i13, str4, list2, list3, i14, i15, str5, str6, i16, i17, i18, (i20 & 1048576) != 0 ? 2000 : i19, tweetHashTags, timeMachine, str7, z10, z11, z12, z13, z14, z15, z16, z17, z18, z19, z20, z21, z22, z23, z24, z25, z26, z27, z28, z29);
        }
    }
}
