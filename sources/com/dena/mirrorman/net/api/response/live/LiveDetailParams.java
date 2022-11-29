package com.dena.mirrorman.net.api.response.live;

import com.dena.mirrativ.mirrativapi.core.BooleanTypeAdapter;
import com.dena.mirrorman.net.api.response.AnnouncementUrls;
import com.dena.mirrorman.net.api.response.App;
import com.dena.mirrorman.net.api.response.CollabInvitation;
import com.dena.mirrorman.net.api.response.Gift;
import com.dena.mirrorman.net.api.response.UserLevel;
import com.dena.mirrorman.net.bcsvr.response.RankingUser;
import com.google.android.exoplayer2.C;
import java.util.List;
import jo.h;
import jo.p;
import xn.s;
import ym.b;

/* loaded from: classes2.dex */
public class LiveDetailParams extends LiveBasicParams {
    public static final int $stable = 8;

    /* renamed from: ad  reason: collision with root package name */
    private LiveAd f26168ad;
    private String anniversaryBotComment;
    private String announcementUrl;
    private AnnouncementUrls announcementUrls;
    private App.AppParams app;
    private String archiveUrlHls;
    private String broadcastHost;
    private String broadcastKey;
    private int broadcastPort;
    private CollabInvitation collabInvitation;
    private int diamonds;
    private GiftAppealPopupImage giftAppealPopupImage;
    @b(BooleanTypeAdapter.class)
    private boolean isConnectedStreamingCollab;
    private boolean isEmomoVisible;
    @b(BooleanTypeAdapter.class)
    private boolean isStreamingCollabEnabled;
    private LinkedLive linkedLive;
    private LiveGamePlaying liveGamePlaying;
    private String liveUserKey;
    private LiveQuiz quiz;
    private List<RankingUser> rankingUsers;
    private List<Gift.GiftParams> recommendedGifts;
    private int remainingFreeCoins;
    private int remainingPaidCoins;
    private LiveShares shares;
    private String streamingUrlEdge;
    private String streamingUrlHls;
    private String streamingUrlLlstreamAudio;
    private String streamingUrlLlstreamVideo;
    private List<LiveTimeline> timeline;
    private UserLevel userLevel;

    public LiveDetailParams() {
        this(null, null, null, null, null, 0, null, null, null, null, null, null, null, 0, 0, 0, null, null, null, null, null, null, null, null, false, false, null, null, false, null, 1073741823, null);
    }

    public /* synthetic */ LiveDetailParams(String str, String str2, String str3, String str4, String str5, int i10, String str6, String str7, String str8, List list, String str9, AnnouncementUrls announcementUrls, LiveShares liveShares, int i11, int i12, int i13, LiveAd liveAd, LinkedLive linkedLive, LiveQuiz liveQuiz, List list2, List list3, App.AppParams appParams, String str10, UserLevel userLevel, boolean z10, boolean z11, CollabInvitation collabInvitation, GiftAppealPopupImage giftAppealPopupImage, boolean z12, LiveGamePlaying liveGamePlaying, int i14, h hVar) {
        this((i14 & 1) != 0 ? null : str, (i14 & 2) != 0 ? null : str2, (i14 & 4) != 0 ? null : str3, (i14 & 8) != 0 ? null : str4, (i14 & 16) != 0 ? "" : str5, (i14 & 32) != 0 ? 0 : i10, (i14 & 64) != 0 ? "" : str6, (i14 & 128) == 0 ? str7 : "", (i14 & 256) != 0 ? null : str8, (i14 & 512) != 0 ? s.k() : list, (i14 & 1024) != 0 ? null : str9, (i14 & 2048) != 0 ? null : announcementUrls, (i14 & 4096) != 0 ? null : liveShares, (i14 & 8192) != 0 ? 0 : i11, (i14 & 16384) != 0 ? 0 : i12, (i14 & 32768) != 0 ? 0 : i13, (i14 & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0 ? null : liveAd, (i14 & 131072) != 0 ? null : linkedLive, (i14 & 262144) != 0 ? null : liveQuiz, (i14 & 524288) != 0 ? null : list2, (i14 & 1048576) != 0 ? null : list3, (i14 & 2097152) != 0 ? null : appParams, (i14 & 4194304) != 0 ? null : str10, (i14 & 8388608) != 0 ? null : userLevel, (i14 & 16777216) != 0 ? false : z10, (i14 & 33554432) != 0 ? false : z11, (i14 & 67108864) != 0 ? null : collabInvitation, (i14 & 134217728) != 0 ? null : giftAppealPopupImage, (i14 & 268435456) != 0 ? false : z12, (i14 & 536870912) != 0 ? null : liveGamePlaying);
    }

    public final LiveAd getAd() {
        return this.f26168ad;
    }

    public final String getAnniversaryBotComment() {
        return this.anniversaryBotComment;
    }

    public final String getAnnouncementUrl() {
        return this.announcementUrl;
    }

    public final AnnouncementUrls getAnnouncementUrls() {
        return this.announcementUrls;
    }

    public final App.AppParams getApp() {
        return this.app;
    }

    public final String getArchiveUrlHls() {
        return this.archiveUrlHls;
    }

    public final String getBroadcastHost() {
        return this.broadcastHost;
    }

    public final String getBroadcastKey() {
        return this.broadcastKey;
    }

    public final int getBroadcastPort() {
        return this.broadcastPort;
    }

    public final CollabInvitation getCollabInvitation() {
        return this.collabInvitation;
    }

    public final int getDiamonds() {
        return this.diamonds;
    }

    public final GiftAppealPopupImage getGiftAppealPopupImage() {
        return this.giftAppealPopupImage;
    }

    public final LinkedLive getLinkedLive() {
        return this.linkedLive;
    }

    public final LiveGamePlaying getLiveGamePlaying() {
        return this.liveGamePlaying;
    }

    public final String getLiveUserKey() {
        return this.liveUserKey;
    }

    public final LiveQuiz getQuiz() {
        return this.quiz;
    }

    public final List<RankingUser> getRankingUsers() {
        return this.rankingUsers;
    }

    public final List<Gift.GiftParams> getRecommendedGifts() {
        return this.recommendedGifts;
    }

    public final int getRemainingFreeCoins() {
        return this.remainingFreeCoins;
    }

    public final int getRemainingPaidCoins() {
        return this.remainingPaidCoins;
    }

    public final LiveShares getShares() {
        return this.shares;
    }

    public final String getStreamingUrlEdge() {
        return this.streamingUrlEdge;
    }

    public final String getStreamingUrlHls() {
        return this.streamingUrlHls;
    }

    public final String getStreamingUrlLlstreamAudio() {
        return this.streamingUrlLlstreamAudio;
    }

    public final String getStreamingUrlLlstreamVideo() {
        return this.streamingUrlLlstreamVideo;
    }

    public final List<LiveTimeline> getTimeline() {
        return this.timeline;
    }

    public final UserLevel getUserLevel() {
        return this.userLevel;
    }

    public final boolean isConnectedStreamingCollab() {
        return this.isConnectedStreamingCollab;
    }

    public final boolean isEmomoVisible() {
        return this.isEmomoVisible;
    }

    public final boolean isStreamingCollabEnabled() {
        return this.isStreamingCollabEnabled;
    }

    public final void setAd(LiveAd liveAd) {
        this.f26168ad = liveAd;
    }

    public final void setAnniversaryBotComment(String str) {
        this.anniversaryBotComment = str;
    }

    public final void setAnnouncementUrl(String str) {
        this.announcementUrl = str;
    }

    public final void setAnnouncementUrls(AnnouncementUrls announcementUrls) {
        this.announcementUrls = announcementUrls;
    }

    public final void setApp(App.AppParams appParams) {
        this.app = appParams;
    }

    public final void setArchiveUrlHls(String str) {
        this.archiveUrlHls = str;
    }

    public final void setBroadcastHost(String str) {
        p.h(str, "<set-?>");
        this.broadcastHost = str;
    }

    public final void setBroadcastKey(String str) {
        p.h(str, "<set-?>");
        this.broadcastKey = str;
    }

    public final void setBroadcastPort(int i10) {
        this.broadcastPort = i10;
    }

    public final void setCollabInvitation(CollabInvitation collabInvitation) {
        this.collabInvitation = collabInvitation;
    }

    public final void setConnectedStreamingCollab(boolean z10) {
        this.isConnectedStreamingCollab = z10;
    }

    public final void setDiamonds(int i10) {
        this.diamonds = i10;
    }

    public final void setEmomoVisible(boolean z10) {
        this.isEmomoVisible = z10;
    }

    public final void setGiftAppealPopupImage(GiftAppealPopupImage giftAppealPopupImage) {
        this.giftAppealPopupImage = giftAppealPopupImage;
    }

    public final void setLinkedLive(LinkedLive linkedLive) {
        this.linkedLive = linkedLive;
    }

    public final void setLiveGamePlaying(LiveGamePlaying liveGamePlaying) {
        this.liveGamePlaying = liveGamePlaying;
    }

    public final void setLiveUserKey(String str) {
        p.h(str, "<set-?>");
        this.liveUserKey = str;
    }

    public final void setQuiz(LiveQuiz liveQuiz) {
        this.quiz = liveQuiz;
    }

    public final void setRankingUsers(List<RankingUser> list) {
        this.rankingUsers = list;
    }

    public final void setRecommendedGifts(List<Gift.GiftParams> list) {
        this.recommendedGifts = list;
    }

    public final void setRemainingFreeCoins(int i10) {
        this.remainingFreeCoins = i10;
    }

    public final void setRemainingPaidCoins(int i10) {
        this.remainingPaidCoins = i10;
    }

    public final void setShares(LiveShares liveShares) {
        this.shares = liveShares;
    }

    public final void setStreamingCollabEnabled(boolean z10) {
        this.isStreamingCollabEnabled = z10;
    }

    public final void setStreamingUrlEdge(String str) {
        this.streamingUrlEdge = str;
    }

    public final void setStreamingUrlHls(String str) {
        this.streamingUrlHls = str;
    }

    public final void setStreamingUrlLlstreamAudio(String str) {
        this.streamingUrlLlstreamAudio = str;
    }

    public final void setStreamingUrlLlstreamVideo(String str) {
        this.streamingUrlLlstreamVideo = str;
    }

    public final void setTimeline(List<LiveTimeline> list) {
        p.h(list, "<set-?>");
        this.timeline = list;
    }

    public final void setUserLevel(UserLevel userLevel) {
        this.userLevel = userLevel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiveDetailParams(String str, String str2, String str3, String str4, String str5, int i10, String str6, String str7, String str8, List<LiveTimeline> list, String str9, AnnouncementUrls announcementUrls, LiveShares liveShares, int i11, int i12, int i13, LiveAd liveAd, LinkedLive linkedLive, LiveQuiz liveQuiz, List<RankingUser> list2, List<Gift.GiftParams> list3, App.AppParams appParams, String str10, UserLevel userLevel, boolean z10, boolean z11, CollabInvitation collabInvitation, GiftAppealPopupImage giftAppealPopupImage, boolean z12, LiveGamePlaying liveGamePlaying) {
        super(null, null, null, null, null, null, 0, 0, 0L, 0L, false, false, null, 0, false, 0, null, null, null, null, 0, null, 0, null, null, null, 0, null, false, 0, null, 0, null, false, false, 0, 0, null, false, null, null, null, null, null, null, 0L, null, false, null, null, 0, 0, null, null, false, null, false, -1, 33554431, null);
        p.h(str5, "broadcastHost");
        p.h(str6, "broadcastKey");
        p.h(str7, "liveUserKey");
        p.h(list, "timeline");
        this.streamingUrlHls = str;
        this.streamingUrlEdge = str2;
        this.streamingUrlLlstreamVideo = str3;
        this.streamingUrlLlstreamAudio = str4;
        this.broadcastHost = str5;
        this.broadcastPort = i10;
        this.broadcastKey = str6;
        this.liveUserKey = str7;
        this.archiveUrlHls = str8;
        this.timeline = list;
        this.announcementUrl = str9;
        this.announcementUrls = announcementUrls;
        this.shares = liveShares;
        this.remainingFreeCoins = i11;
        this.remainingPaidCoins = i12;
        this.diamonds = i13;
        this.f26168ad = liveAd;
        this.linkedLive = linkedLive;
        this.quiz = liveQuiz;
        this.rankingUsers = list2;
        this.recommendedGifts = list3;
        this.app = appParams;
        this.anniversaryBotComment = str10;
        this.userLevel = userLevel;
        this.isConnectedStreamingCollab = z10;
        this.isStreamingCollabEnabled = z11;
        this.collabInvitation = collabInvitation;
        this.giftAppealPopupImage = giftAppealPopupImage;
        this.isEmomoVisible = z12;
        this.liveGamePlaying = liveGamePlaying;
    }
}
