package com.dena.mirrorman.net.api.response.live;

import com.dena.mirrativ.mirrativapi.core.BooleanTypeAdapter;
import com.dena.mirrorman.net.api.response.LiveArchiveStatus;
import com.dena.mirrorman.net.api.response.LiveArchiveStatusTypeAdapter;
import com.dena.mirrorman.net.api.response.MirroringResponse;
import com.dena.mirrorman.net.api.response.ThumbnailFrame;
import com.dena.mirrorman.net.api.response.user.UserBasicParams;
import com.dena.mirrorman.net.api.response.user.UserProfile;
import java.io.Serializable;
import java.util.List;
import jo.p;
import ym.b;
import ym.c;

/* loaded from: classes2.dex */
public class LiveBasicParams implements Serializable {
    public static final int $stable = 8;
    private final List<String> appIconUrls;
    private final String appId;
    private final int appNum;
    private int archiveDownloadStatus;
    private Integer archiveHidden;
    @b(LiveArchiveStatusTypeAdapter.class)
    private LiveArchiveStatus archiveStatus;
    private final String avatarBodyImageUrl;
    private final String blur_image_url;
    @b(BooleanTypeAdapter.class)
    private boolean collabEnabled;
    @b(BooleanTypeAdapter.class)
    private boolean collabHasVacancy;
    private final int collabOnlineUserNum;
    private final List<String> collabUserProfileImageUrls;
    private final long createdAt;
    private String description;
    private long endedAt;
    @c("followee_following_streamer")
    private final LiveFollowee followee;
    private final List<String> followingViewerImageUrls;
    private final int followingViewerNum;
    private final Integer giftCoins;
    private int giftPoint;
    private int gifterNum;
    private String image_url;
    @b(BooleanTypeAdapter.class)
    private boolean isArchive;
    private final int isArchiveExpired;
    @b(BooleanTypeAdapter.class)
    private final boolean isFollowing;
    @b(BooleanTypeAdapter.class)
    private boolean isGiftSupported;
    @b(BooleanTypeAdapter.class)
    private boolean isLive;
    private boolean isNew;
    private boolean isNuuWelcome;
    private boolean isOmotenashi;
    @b(BooleanTypeAdapter.class)
    private boolean isPrivate;
    private final String joinedLiveThumbnailImageUrl;
    private final LiveGame liveGame;
    private String liveId;
    private final List<LiveTag> liveTags;
    private int maxCollabUserNum;
    private final int maxOnlineViewerNum;
    private MirroringResponse mirroring;
    private int onlineUserNum;
    private String orientationV2;
    private UserProfile owner;
    private final LivePreview preview;
    private final List<String> privateInvitedUserImageUrls;
    private final int privateInvitedUserNum;
    private final List<String> privateViewerImageUrls;
    private final int privateViewerNum;
    private final String reason;
    private final ReceivedDiamonds receivedDiamonds;
    private final CatalogRecommend recommend;
    private String shareUrl;
    private long startedAt;
    private ThumbnailFrame thumbnailFrame;
    private String title;
    private List<? extends UserBasicParams> topGifters;
    private int totalViewerNum;
    private final List<UserAppStatus> userAppStatus;
    private final String userLabelImageUrl;

    public LiveBasicParams() {
        this(null, null, null, null, null, null, 0, 0, 0L, 0L, false, false, null, 0, false, 0, null, null, null, null, 0, null, 0, null, null, null, 0, null, false, 0, null, 0, null, false, false, 0, 0, null, false, null, null, null, null, null, null, 0L, null, false, null, null, 0, 0, null, null, false, null, false, -1, 33554431, null);
    }

    public LiveBasicParams(String str, String str2, String str3, String str4, String str5, String str6, int i10, int i11, long j10, long j11, boolean z10, boolean z11, UserProfile userProfile, int i12, boolean z12, int i13, LiveArchiveStatus liveArchiveStatus, Integer num, String str7, LiveFollowee liveFollowee, int i14, String str8, int i15, List<String> list, String str9, LivePreview livePreview, int i16, List<String> list2, boolean z13, int i17, List<String> list3, int i18, List<String> list4, boolean z14, boolean z15, int i19, int i20, MirroringResponse mirroringResponse, boolean z16, Integer num2, ReceivedDiamonds receivedDiamonds, List<LiveTag> list5, List<UserAppStatus> list6, CatalogRecommend catalogRecommend, String str10, long j12, List<String> list7, boolean z17, ThumbnailFrame thumbnailFrame, List<? extends UserBasicParams> list8, int i21, int i22, String str11, String str12, boolean z18, LiveGame liveGame, boolean z19) {
        p.h(str, "liveId");
        p.h(str4, "image_url");
        p.h(str5, "blur_image_url");
        p.h(str6, "joinedLiveThumbnailImageUrl");
        p.h(userProfile, "owner");
        p.h(str7, "shareUrl");
        p.h(liveFollowee, "followee");
        p.h(list2, "followingViewerImageUrls");
        p.h(list3, "privateViewerImageUrls");
        p.h(list4, "privateInvitedUserImageUrls");
        p.h(list7, "collabUserProfileImageUrls");
        p.h(list8, "topGifters");
        p.h(str11, "avatarBodyImageUrl");
        p.h(str12, "userLabelImageUrl");
        p.h(liveGame, "liveGame");
        this.liveId = str;
        this.title = str2;
        this.description = str3;
        this.image_url = str4;
        this.blur_image_url = str5;
        this.joinedLiveThumbnailImageUrl = str6;
        this.onlineUserNum = i10;
        this.totalViewerNum = i11;
        this.startedAt = j10;
        this.endedAt = j11;
        this.isLive = z10;
        this.isPrivate = z11;
        this.owner = userProfile;
        this.maxOnlineViewerNum = i12;
        this.isArchive = z12;
        this.isArchiveExpired = i13;
        this.archiveStatus = liveArchiveStatus;
        this.archiveHidden = num;
        this.shareUrl = str7;
        this.followee = liveFollowee;
        this.archiveDownloadStatus = i14;
        this.appId = str8;
        this.appNum = i15;
        this.appIconUrls = list;
        this.orientationV2 = str9;
        this.preview = livePreview;
        this.followingViewerNum = i16;
        this.followingViewerImageUrls = list2;
        this.isFollowing = z13;
        this.privateViewerNum = i17;
        this.privateViewerImageUrls = list3;
        this.privateInvitedUserNum = i18;
        this.privateInvitedUserImageUrls = list4;
        this.collabEnabled = z14;
        this.collabHasVacancy = z15;
        this.collabOnlineUserNum = i19;
        this.maxCollabUserNum = i20;
        this.mirroring = mirroringResponse;
        this.isGiftSupported = z16;
        this.giftCoins = num2;
        this.receivedDiamonds = receivedDiamonds;
        this.liveTags = list5;
        this.userAppStatus = list6;
        this.recommend = catalogRecommend;
        this.reason = str10;
        this.createdAt = j12;
        this.collabUserProfileImageUrls = list7;
        this.isNew = z17;
        this.thumbnailFrame = thumbnailFrame;
        this.topGifters = list8;
        this.giftPoint = i21;
        this.gifterNum = i22;
        this.avatarBodyImageUrl = str11;
        this.userLabelImageUrl = str12;
        this.isOmotenashi = z18;
        this.liveGame = liveGame;
        this.isNuuWelcome = z19;
    }

    public final List<String> getAppIconUrls() {
        return this.appIconUrls;
    }

    public final String getAppId() {
        return this.appId;
    }

    public final int getAppNum() {
        return this.appNum;
    }

    public final int getArchiveDownloadStatus() {
        return this.archiveDownloadStatus;
    }

    public final Integer getArchiveHidden() {
        return this.archiveHidden;
    }

    public final LiveArchiveStatus getArchiveStatus() {
        return this.archiveStatus;
    }

    public final String getAvatarBodyImageUrl() {
        return this.avatarBodyImageUrl;
    }

    public final String getBlur_image_url() {
        return this.blur_image_url;
    }

    public final boolean getCollabEnabled() {
        return this.collabEnabled;
    }

    public final boolean getCollabHasVacancy() {
        return this.collabHasVacancy;
    }

    public final int getCollabOnlineUserNum() {
        return this.collabOnlineUserNum;
    }

    public final List<String> getCollabUserProfileImageUrls() {
        return this.collabUserProfileImageUrls;
    }

    public final long getCreatedAt() {
        return this.createdAt;
    }

    public final String getDescription() {
        return this.description;
    }

    public final long getEndedAt() {
        return this.endedAt;
    }

    public final LiveFollowee getFollowee() {
        return this.followee;
    }

    public final List<String> getFollowingViewerImageUrls() {
        return this.followingViewerImageUrls;
    }

    public final int getFollowingViewerNum() {
        return this.followingViewerNum;
    }

    public final Integer getGiftCoins() {
        return this.giftCoins;
    }

    public final int getGiftPoint() {
        return this.giftPoint;
    }

    public final int getGifterNum() {
        return this.gifterNum;
    }

    public final String getImage_url() {
        return this.image_url;
    }

    public final String getJoinedLiveThumbnailImageUrl() {
        return this.joinedLiveThumbnailImageUrl;
    }

    public final LiveGame getLiveGame() {
        return this.liveGame;
    }

    public final String getLiveId() {
        return this.liveId;
    }

    public final List<LiveTag> getLiveTags() {
        return this.liveTags;
    }

    public final int getMaxCollabUserNum() {
        return this.maxCollabUserNum;
    }

    public final int getMaxOnlineViewerNum() {
        return this.maxOnlineViewerNum;
    }

    public final MirroringResponse getMirroring() {
        return this.mirroring;
    }

    public final int getOnlineUserNum() {
        return this.onlineUserNum;
    }

    public final String getOrientationV2() {
        return this.orientationV2;
    }

    public final UserProfile getOwner() {
        return this.owner;
    }

    public final LivePreview getPreview() {
        return this.preview;
    }

    public final List<String> getPrivateInvitedUserImageUrls() {
        return this.privateInvitedUserImageUrls;
    }

    public final int getPrivateInvitedUserNum() {
        return this.privateInvitedUserNum;
    }

    public final List<String> getPrivateViewerImageUrls() {
        return this.privateViewerImageUrls;
    }

    public final int getPrivateViewerNum() {
        return this.privateViewerNum;
    }

    public final String getReason() {
        return this.reason;
    }

    public final ReceivedDiamonds getReceivedDiamonds() {
        return this.receivedDiamonds;
    }

    public final CatalogRecommend getRecommend() {
        return this.recommend;
    }

    public final String getShareUrl() {
        return this.shareUrl;
    }

    public final long getStartedAt() {
        return this.startedAt;
    }

    public final ThumbnailFrame getThumbnailFrame() {
        return this.thumbnailFrame;
    }

    public final String getTitle() {
        return this.title;
    }

    public final List<UserBasicParams> getTopGifters() {
        return this.topGifters;
    }

    public final int getTotalViewerNum() {
        return this.totalViewerNum;
    }

    public final List<UserAppStatus> getUserAppStatus() {
        return this.userAppStatus;
    }

    public final String getUserLabelImageUrl() {
        return this.userLabelImageUrl;
    }

    public final boolean isArchive() {
        return this.isArchive;
    }

    public final int isArchiveExpired() {
        return this.isArchiveExpired;
    }

    public final boolean isFollowing() {
        return this.isFollowing;
    }

    public final boolean isGiftSupported() {
        return this.isGiftSupported;
    }

    public final boolean isLive() {
        return this.isLive;
    }

    public final boolean isNew() {
        return this.isNew;
    }

    public final boolean isNuuWelcome() {
        return this.isNuuWelcome;
    }

    public final boolean isOmotenashi() {
        return this.isOmotenashi;
    }

    public final boolean isPrivate() {
        return this.isPrivate;
    }

    public final void setArchive(boolean z10) {
        this.isArchive = z10;
    }

    public final void setArchiveDownloadStatus(int i10) {
        this.archiveDownloadStatus = i10;
    }

    public final void setArchiveHidden(Integer num) {
        this.archiveHidden = num;
    }

    public final void setArchiveStatus(LiveArchiveStatus liveArchiveStatus) {
        this.archiveStatus = liveArchiveStatus;
    }

    public final void setCollabEnabled(boolean z10) {
        this.collabEnabled = z10;
    }

    public final void setCollabHasVacancy(boolean z10) {
        this.collabHasVacancy = z10;
    }

    public final void setDescription(String str) {
        this.description = str;
    }

    public final void setEndedAt(long j10) {
        this.endedAt = j10;
    }

    public final void setGiftPoint(int i10) {
        this.giftPoint = i10;
    }

    public final void setGiftSupported(boolean z10) {
        this.isGiftSupported = z10;
    }

    public final void setGifterNum(int i10) {
        this.gifterNum = i10;
    }

    public final void setImage_url(String str) {
        p.h(str, "<set-?>");
        this.image_url = str;
    }

    public final void setLive(boolean z10) {
        this.isLive = z10;
    }

    public final void setLiveId(String str) {
        p.h(str, "<set-?>");
        this.liveId = str;
    }

    public final void setMaxCollabUserNum(int i10) {
        this.maxCollabUserNum = i10;
    }

    public final void setMirroring(MirroringResponse mirroringResponse) {
        this.mirroring = mirroringResponse;
    }

    public final void setNew(boolean z10) {
        this.isNew = z10;
    }

    public final void setNuuWelcome(boolean z10) {
        this.isNuuWelcome = z10;
    }

    public final void setOmotenashi(boolean z10) {
        this.isOmotenashi = z10;
    }

    public final void setOnlineUserNum(int i10) {
        this.onlineUserNum = i10;
    }

    public final void setOrientationV2(String str) {
        this.orientationV2 = str;
    }

    public final void setOwner(UserProfile userProfile) {
        p.h(userProfile, "<set-?>");
        this.owner = userProfile;
    }

    public final void setPrivate(boolean z10) {
        this.isPrivate = z10;
    }

    public final void setShareUrl(String str) {
        p.h(str, "<set-?>");
        this.shareUrl = str;
    }

    public final void setStartedAt(long j10) {
        this.startedAt = j10;
    }

    public final void setThumbnailFrame(ThumbnailFrame thumbnailFrame) {
        this.thumbnailFrame = thumbnailFrame;
    }

    public final void setTitle(String str) {
        this.title = str;
    }

    public final void setTopGifters(List<? extends UserBasicParams> list) {
        p.h(list, "<set-?>");
        this.topGifters = list;
    }

    public final void setTotalViewerNum(int i10) {
        this.totalViewerNum = i10;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ LiveBasicParams(java.lang.String r62, java.lang.String r63, java.lang.String r64, java.lang.String r65, java.lang.String r66, java.lang.String r67, int r68, int r69, long r70, long r72, boolean r74, boolean r75, com.dena.mirrorman.net.api.response.user.UserProfile r76, int r77, boolean r78, int r79, com.dena.mirrorman.net.api.response.LiveArchiveStatus r80, java.lang.Integer r81, java.lang.String r82, com.dena.mirrorman.net.api.response.live.LiveFollowee r83, int r84, java.lang.String r85, int r86, java.util.List r87, java.lang.String r88, com.dena.mirrorman.net.api.response.live.LivePreview r89, int r90, java.util.List r91, boolean r92, int r93, java.util.List r94, int r95, java.util.List r96, boolean r97, boolean r98, int r99, int r100, com.dena.mirrorman.net.api.response.MirroringResponse r101, boolean r102, java.lang.Integer r103, com.dena.mirrorman.net.api.response.live.ReceivedDiamonds r104, java.util.List r105, java.util.List r106, com.dena.mirrorman.net.api.response.live.CatalogRecommend r107, java.lang.String r108, long r109, java.util.List r111, boolean r112, com.dena.mirrorman.net.api.response.ThumbnailFrame r113, java.util.List r114, int r115, int r116, java.lang.String r117, java.lang.String r118, boolean r119, com.dena.mirrorman.net.api.response.live.LiveGame r120, boolean r121, int r122, int r123, jo.h r124) {
        /*
            Method dump skipped, instructions count: 792
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dena.mirrorman.net.api.response.live.LiveBasicParams.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, int, long, long, boolean, boolean, com.dena.mirrorman.net.api.response.user.UserProfile, int, boolean, int, com.dena.mirrorman.net.api.response.LiveArchiveStatus, java.lang.Integer, java.lang.String, com.dena.mirrorman.net.api.response.live.LiveFollowee, int, java.lang.String, int, java.util.List, java.lang.String, com.dena.mirrorman.net.api.response.live.LivePreview, int, java.util.List, boolean, int, java.util.List, int, java.util.List, boolean, boolean, int, int, com.dena.mirrorman.net.api.response.MirroringResponse, boolean, java.lang.Integer, com.dena.mirrorman.net.api.response.live.ReceivedDiamonds, java.util.List, java.util.List, com.dena.mirrorman.net.api.response.live.CatalogRecommend, java.lang.String, long, java.util.List, boolean, com.dena.mirrorman.net.api.response.ThumbnailFrame, java.util.List, int, int, java.lang.String, java.lang.String, boolean, com.dena.mirrorman.net.api.response.live.LiveGame, boolean, int, int, jo.h):void");
    }
}
