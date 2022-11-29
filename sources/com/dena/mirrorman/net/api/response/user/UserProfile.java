package com.dena.mirrorman.net.api.response.user;

import com.dena.mirrativ.mirrativapi.core.BooleanTypeAdapter;
import com.dena.mirrativ.mirrativapi.core.Status;
import com.dena.mirrativ.mirrativapi.user.UserProfileSeasonYell;
import com.dena.mirrorman.net.api.response.AnnouncementUrls;
import com.dena.mirrorman.net.api.response.UserLevel;
import com.dena.mirrorman.net.api.response.live.LiveAnnouncement;
import jo.p;
import ym.b;

/* loaded from: classes2.dex */
public class UserProfile extends UserBasicWithGraphParams {
    public static final int $stable = 8;
    private final Anniversary anniversary;
    private final AnnouncementUrls announcementUrls;
    private final String avatarBackgroundImageUrl;
    private final String avatarBodyImageUrl;
    private final int chatOnlyFollowings;
    private final String continuousStreamHolidayPeriod;
    private final int continuousStreamHolidaysNum;
    private final int currentContinuousRecord;
    private final String customThanksMessage;
    private final int followerNum;
    private final int followingNum;
    @b(BooleanTypeAdapter.class)
    private final boolean hasStartedFirstLive;
    @b(BooleanTypeAdapter.class)
    private final boolean isCheerleader;
    @b(BooleanTypeAdapter.class)
    private final boolean isContinuousLiveUserAfterNextLive;
    private final boolean isVisibleBirthday;
    private LiveAnnouncement liveAnnouncement;
    private final int maxContinuousRecord;
    private final MutualFollowee mutualFollowees;
    private final int myAppNum;
    private final String nextContinuousStreamerBadgeUrl;
    private final String nextContinuousStreamerText;
    private final int remainingDaysForContinuousStreamer;
    private final SeasonRating seasonRating;
    private final UserProfileSeasonYell seasonYell;
    private final String shareUrl;
    private Status status;
    private final int totalViewerNum;
    private final String twitterScreenName;
    private final UserLevel userLevel;

    public UserProfile() {
        this(null, 0, null, null, 0, 0, 0, null, null, 0, null, null, 0, 0, null, false, null, 0, false, null, 0, null, null, null, null, false, null, null, false, 536870911, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ UserProfile(com.dena.mirrativ.mirrativapi.core.Status r39, int r40, java.lang.String r41, java.lang.String r42, int r43, int r44, int r45, java.lang.String r46, com.dena.mirrorman.net.api.response.live.LiveAnnouncement r47, int r48, java.lang.String r49, com.dena.mirrorman.net.api.response.AnnouncementUrls r50, int r51, int r52, java.lang.String r53, boolean r54, java.lang.String r55, int r56, boolean r57, com.dena.mirrorman.net.api.response.user.Anniversary r58, int r59, java.lang.String r60, java.lang.String r61, com.dena.mirrorman.net.api.response.user.MutualFollowee r62, com.dena.mirrorman.net.api.response.UserLevel r63, boolean r64, com.dena.mirrorman.net.api.response.user.SeasonRating r65, com.dena.mirrativ.mirrativapi.user.UserProfileSeasonYell r66, boolean r67, int r68, jo.h r69) {
        /*
            Method dump skipped, instructions count: 442
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dena.mirrorman.net.api.response.user.UserProfile.<init>(com.dena.mirrativ.mirrativapi.core.Status, int, java.lang.String, java.lang.String, int, int, int, java.lang.String, com.dena.mirrorman.net.api.response.live.LiveAnnouncement, int, java.lang.String, com.dena.mirrorman.net.api.response.AnnouncementUrls, int, int, java.lang.String, boolean, java.lang.String, int, boolean, com.dena.mirrorman.net.api.response.user.Anniversary, int, java.lang.String, java.lang.String, com.dena.mirrorman.net.api.response.user.MutualFollowee, com.dena.mirrorman.net.api.response.UserLevel, boolean, com.dena.mirrorman.net.api.response.user.SeasonRating, com.dena.mirrativ.mirrativapi.user.UserProfileSeasonYell, boolean, int, jo.h):void");
    }

    public final Anniversary getAnniversary() {
        return this.anniversary;
    }

    public final AnnouncementUrls getAnnouncementUrls() {
        return this.announcementUrls;
    }

    public final String getAvatarBackgroundImageUrl() {
        return this.avatarBackgroundImageUrl;
    }

    public final String getAvatarBodyImageUrl() {
        return this.avatarBodyImageUrl;
    }

    public final int getChatOnlyFollowings() {
        return this.chatOnlyFollowings;
    }

    public final String getContinuousStreamHolidayPeriod() {
        return this.continuousStreamHolidayPeriod;
    }

    public final int getContinuousStreamHolidaysNum() {
        return this.continuousStreamHolidaysNum;
    }

    public final int getCurrentContinuousRecord() {
        return this.currentContinuousRecord;
    }

    public final String getCustomThanksMessage() {
        return this.customThanksMessage;
    }

    public final int getFollowerNum() {
        return this.followerNum;
    }

    public final int getFollowingNum() {
        return this.followingNum;
    }

    public final boolean getHasStartedFirstLive() {
        return this.hasStartedFirstLive;
    }

    public final LiveAnnouncement getLiveAnnouncement() {
        return this.liveAnnouncement;
    }

    public final int getMaxContinuousRecord() {
        return this.maxContinuousRecord;
    }

    public final MutualFollowee getMutualFollowees() {
        return this.mutualFollowees;
    }

    public final int getMyAppNum() {
        return this.myAppNum;
    }

    public final String getNextContinuousStreamerBadgeUrl() {
        return this.nextContinuousStreamerBadgeUrl;
    }

    public final String getNextContinuousStreamerText() {
        return this.nextContinuousStreamerText;
    }

    public final int getRemainingDaysForContinuousStreamer() {
        return this.remainingDaysForContinuousStreamer;
    }

    public final SeasonRating getSeasonRating() {
        return this.seasonRating;
    }

    public final UserProfileSeasonYell getSeasonYell() {
        return this.seasonYell;
    }

    public final String getShareUrl() {
        return this.shareUrl;
    }

    public final Status getStatus() {
        return this.status;
    }

    public final int getTotalViewerNum() {
        return this.totalViewerNum;
    }

    public final String getTwitterScreenName() {
        return this.twitterScreenName;
    }

    public final UserLevel getUserLevel() {
        return this.userLevel;
    }

    public final boolean isCheerleader() {
        return this.isCheerleader;
    }

    public final boolean isContinuousLiveUserAfterNextLive() {
        return this.isContinuousLiveUserAfterNextLive;
    }

    public final boolean isVisibleBirthday() {
        return this.isVisibleBirthday;
    }

    public final void setLiveAnnouncement(LiveAnnouncement liveAnnouncement) {
        this.liveAnnouncement = liveAnnouncement;
    }

    public final void setStatus(Status status) {
        p.h(status, "<set-?>");
        this.status = status;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserProfile(Status status, int i10, String str, String str2, int i11, int i12, int i13, String str3, LiveAnnouncement liveAnnouncement, int i14, String str4, AnnouncementUrls announcementUrls, int i15, int i16, String str5, boolean z10, String str6, int i17, boolean z11, Anniversary anniversary, int i18, String str7, String str8, MutualFollowee mutualFollowee, UserLevel userLevel, boolean z12, SeasonRating seasonRating, UserProfileSeasonYell userProfileSeasonYell, boolean z13) {
        super(false, false, false, false, false, 0, null, 0, 0, 0, 0, null, 0L, false, null, null, false, false, null, 0, 1048575, null);
        p.h(status, "status");
        p.h(str, "avatarBodyImageUrl");
        p.h(str2, "avatarBackgroundImageUrl");
        p.h(str4, "shareUrl");
        p.h(str5, "customThanksMessage");
        p.h(str7, "nextContinuousStreamerBadgeUrl");
        p.h(str8, "nextContinuousStreamerText");
        p.h(userLevel, "userLevel");
        p.h(seasonRating, "seasonRating");
        p.h(userProfileSeasonYell, "seasonYell");
        this.status = status;
        this.chatOnlyFollowings = i10;
        this.avatarBodyImageUrl = str;
        this.avatarBackgroundImageUrl = str2;
        this.followerNum = i11;
        this.followingNum = i12;
        this.totalViewerNum = i13;
        this.twitterScreenName = str3;
        this.liveAnnouncement = liveAnnouncement;
        this.myAppNum = i14;
        this.shareUrl = str4;
        this.announcementUrls = announcementUrls;
        this.currentContinuousRecord = i15;
        this.maxContinuousRecord = i16;
        this.customThanksMessage = str5;
        this.isContinuousLiveUserAfterNextLive = z10;
        this.continuousStreamHolidayPeriod = str6;
        this.continuousStreamHolidaysNum = i17;
        this.hasStartedFirstLive = z11;
        this.anniversary = anniversary;
        this.remainingDaysForContinuousStreamer = i18;
        this.nextContinuousStreamerBadgeUrl = str7;
        this.nextContinuousStreamerText = str8;
        this.mutualFollowees = mutualFollowee;
        this.userLevel = userLevel;
        this.isCheerleader = z12;
        this.seasonRating = seasonRating;
        this.seasonYell = userProfileSeasonYell;
        this.isVisibleBirthday = z13;
    }
}
