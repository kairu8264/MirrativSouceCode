package com.dena.mirrorman.net.bcsvr.response;

import com.dena.mirrativ.mirrativapi.core.BooleanTypeAdapter;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.mirrativ.llstream.protocol.v1.topic.TopicConstant;
import java.io.Serializable;
import java.util.List;
import jo.h;
import jo.p;
import ve.d;
import ym.b;
import ym.c;

/* loaded from: classes2.dex */
public final class GiftItem implements Serializable {
    public static final int $stable = 8;
    private final String avatarBodyImageUrl;
    private final String avatarUserIds;
    @c("burl")
    private final String badgeImageUrl;
    @b(BooleanTypeAdapter.class)
    private final boolean becameCheerleader;
    private final int coins;
    @c("collab_streamer_ac")
    private final String collabStreamerUserName;
    private final int count;
    private final String effectId;
    private final String giftId;
    private final String giftLargeImageUrl;
    private final String giftSmallImageUrl;
    private final String giftTitle;
    private final int giftType;
    @b(BooleanTypeAdapter.class)
    private final boolean isCheerleader;
    @c("ils")
    @b(BooleanTypeAdapter.class)
    private final Boolean isLastSent;
    @b(BooleanTypeAdapter.class)
    private final boolean isModerator;
    private final String liveSentGiftId;
    private final String message;
    private final int nameplateEnabled;
    private final int orientations;
    private final float pauseDuration;
    @c(TtmlNode.TAG_P)
    private final int point;
    private final String poseId;
    @c("iurl")
    private final String profileImageUrl;
    private final List<GiftRankingBcsvrResponse> rankings;
    private final String shareText;
    @b(BooleanTypeAdapter.class)
    private final boolean shouldPlayAnimation;
    private final String slotId;
    private final String speech;
    private final Integer totalGiftCoins;
    @c("u")
    private final String userId;
    @c(TopicConstant.PACKET_TYPE_AUDIO_AAC)
    private final String userName;
    private final int yellLevel;
    private final int yellRank;

    /* loaded from: classes2.dex */
    public enum Level {
        GREEN,
        BLUE,
        RED,
        SILVER,
        GOLD,
        RAINBOW
    }

    public GiftItem(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i10, String str8, String str9, int i11, int i12, String str10, float f10, int i13, int i14, String str11, String str12, String str13, String str14, String str15, String str16, String str17, boolean z10, boolean z11, boolean z12, String str18, Integer num, int i15, List<GiftRankingBcsvrResponse> list, Boolean bool, boolean z13, int i16, int i17) {
        p.h(str, "userId");
        p.h(str2, "userName");
        p.h(str3, "profileImageUrl");
        p.h(str4, "badgeImageUrl");
        p.h(str5, "giftId");
        p.h(str7, "giftTitle");
        p.h(str8, "giftSmallImageUrl");
        p.h(str9, "giftLargeImageUrl");
        p.h(str17, "collabStreamerUserName");
        p.h(list, "rankings");
        this.userId = str;
        this.userName = str2;
        this.profileImageUrl = str3;
        this.badgeImageUrl = str4;
        this.giftId = str5;
        this.liveSentGiftId = str6;
        this.giftTitle = str7;
        this.giftType = i10;
        this.giftSmallImageUrl = str8;
        this.giftLargeImageUrl = str9;
        this.coins = i11;
        this.count = i12;
        this.speech = str10;
        this.pauseDuration = f10;
        this.nameplateEnabled = i13;
        this.orientations = i14;
        this.poseId = str11;
        this.shareText = str12;
        this.avatarUserIds = str13;
        this.effectId = str14;
        this.avatarBodyImageUrl = str15;
        this.message = str16;
        this.collabStreamerUserName = str17;
        this.isCheerleader = z10;
        this.isModerator = z11;
        this.shouldPlayAnimation = z12;
        this.slotId = str18;
        this.totalGiftCoins = num;
        this.point = i15;
        this.rankings = list;
        this.isLastSent = bool;
        this.becameCheerleader = z13;
        this.yellRank = i16;
        this.yellLevel = i17;
    }

    public final String component1() {
        return this.userId;
    }

    public final String component10() {
        return this.giftLargeImageUrl;
    }

    public final int component11() {
        return this.coins;
    }

    public final int component12() {
        return this.count;
    }

    public final String component13() {
        return this.speech;
    }

    public final float component14() {
        return this.pauseDuration;
    }

    public final int component15() {
        return this.nameplateEnabled;
    }

    public final int component16() {
        return this.orientations;
    }

    public final String component17() {
        return this.poseId;
    }

    public final String component18() {
        return this.shareText;
    }

    public final String component19() {
        return this.avatarUserIds;
    }

    public final String component2() {
        return this.userName;
    }

    public final String component20() {
        return this.effectId;
    }

    public final String component21() {
        return this.avatarBodyImageUrl;
    }

    public final String component22() {
        return this.message;
    }

    public final String component23() {
        return this.collabStreamerUserName;
    }

    public final boolean component24() {
        return this.isCheerleader;
    }

    public final boolean component25() {
        return this.isModerator;
    }

    public final boolean component26() {
        return this.shouldPlayAnimation;
    }

    public final String component27() {
        return this.slotId;
    }

    public final Integer component28() {
        return this.totalGiftCoins;
    }

    public final int component29() {
        return this.point;
    }

    public final String component3() {
        return this.profileImageUrl;
    }

    public final List<GiftRankingBcsvrResponse> component30() {
        return this.rankings;
    }

    public final Boolean component31() {
        return this.isLastSent;
    }

    public final boolean component32() {
        return this.becameCheerleader;
    }

    public final int component33() {
        return this.yellRank;
    }

    public final int component34() {
        return this.yellLevel;
    }

    public final String component4() {
        return this.badgeImageUrl;
    }

    public final String component5() {
        return this.giftId;
    }

    public final String component6() {
        return this.liveSentGiftId;
    }

    public final String component7() {
        return this.giftTitle;
    }

    public final int component8() {
        return this.giftType;
    }

    public final String component9() {
        return this.giftSmallImageUrl;
    }

    public final GiftItem copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i10, String str8, String str9, int i11, int i12, String str10, float f10, int i13, int i14, String str11, String str12, String str13, String str14, String str15, String str16, String str17, boolean z10, boolean z11, boolean z12, String str18, Integer num, int i15, List<GiftRankingBcsvrResponse> list, Boolean bool, boolean z13, int i16, int i17) {
        p.h(str, "userId");
        p.h(str2, "userName");
        p.h(str3, "profileImageUrl");
        p.h(str4, "badgeImageUrl");
        p.h(str5, "giftId");
        p.h(str7, "giftTitle");
        p.h(str8, "giftSmallImageUrl");
        p.h(str9, "giftLargeImageUrl");
        p.h(str17, "collabStreamerUserName");
        p.h(list, "rankings");
        return new GiftItem(str, str2, str3, str4, str5, str6, str7, i10, str8, str9, i11, i12, str10, f10, i13, i14, str11, str12, str13, str14, str15, str16, str17, z10, z11, z12, str18, num, i15, list, bool, z13, i16, i17);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GiftItem) {
            GiftItem giftItem = (GiftItem) obj;
            return p.c(this.userId, giftItem.userId) && p.c(this.userName, giftItem.userName) && p.c(this.profileImageUrl, giftItem.profileImageUrl) && p.c(this.badgeImageUrl, giftItem.badgeImageUrl) && p.c(this.giftId, giftItem.giftId) && p.c(this.liveSentGiftId, giftItem.liveSentGiftId) && p.c(this.giftTitle, giftItem.giftTitle) && this.giftType == giftItem.giftType && p.c(this.giftSmallImageUrl, giftItem.giftSmallImageUrl) && p.c(this.giftLargeImageUrl, giftItem.giftLargeImageUrl) && this.coins == giftItem.coins && this.count == giftItem.count && p.c(this.speech, giftItem.speech) && p.c(Float.valueOf(this.pauseDuration), Float.valueOf(giftItem.pauseDuration)) && this.nameplateEnabled == giftItem.nameplateEnabled && this.orientations == giftItem.orientations && p.c(this.poseId, giftItem.poseId) && p.c(this.shareText, giftItem.shareText) && p.c(this.avatarUserIds, giftItem.avatarUserIds) && p.c(this.effectId, giftItem.effectId) && p.c(this.avatarBodyImageUrl, giftItem.avatarBodyImageUrl) && p.c(this.message, giftItem.message) && p.c(this.collabStreamerUserName, giftItem.collabStreamerUserName) && this.isCheerleader == giftItem.isCheerleader && this.isModerator == giftItem.isModerator && this.shouldPlayAnimation == giftItem.shouldPlayAnimation && p.c(this.slotId, giftItem.slotId) && p.c(this.totalGiftCoins, giftItem.totalGiftCoins) && this.point == giftItem.point && p.c(this.rankings, giftItem.rankings) && p.c(this.isLastSent, giftItem.isLastSent) && this.becameCheerleader == giftItem.becameCheerleader && this.yellRank == giftItem.yellRank && this.yellLevel == giftItem.yellLevel;
        }
        return false;
    }

    public final String getAvatarBodyImageUrl() {
        return this.avatarBodyImageUrl;
    }

    public final String getAvatarUserIds() {
        return this.avatarUserIds;
    }

    public final String getBadgeImageUrl() {
        return this.badgeImageUrl;
    }

    public final boolean getBecameCheerleader() {
        return this.becameCheerleader;
    }

    public final int getCoins() {
        return this.coins;
    }

    public final String getCollabStreamerUserName() {
        return this.collabStreamerUserName;
    }

    public final int getCount() {
        return this.count;
    }

    public final String getEffectId() {
        return this.effectId;
    }

    public final String getGiftId() {
        return this.giftId;
    }

    public final String getGiftLargeImageUrl() {
        return this.giftLargeImageUrl;
    }

    public final String getGiftSmallImageUrl() {
        return this.giftSmallImageUrl;
    }

    public final String getGiftTitle() {
        return this.giftTitle;
    }

    public final int getGiftType() {
        return this.giftType;
    }

    public final Level getLevel() {
        int unitPoint = getUnitPoint();
        boolean z10 = true;
        if (unitPoint >= 0 && unitPoint < 100) {
            return Level.GREEN;
        }
        if (100 <= unitPoint && unitPoint < 300) {
            return Level.BLUE;
        }
        if (300 <= unitPoint && unitPoint < 1000) {
            return Level.RED;
        }
        if (1000 <= unitPoint && unitPoint < 3000) {
            return Level.SILVER;
        }
        if (3000 > unitPoint || unitPoint >= 10000) {
            z10 = false;
        }
        if (z10) {
            return Level.GOLD;
        }
        return Level.RAINBOW;
    }

    public final String getLiveSentGiftId() {
        return this.liveSentGiftId;
    }

    public final String getMessage() {
        return this.message;
    }

    public final int getNameplateEnabled() {
        return this.nameplateEnabled;
    }

    public final int getOrientations() {
        return this.orientations;
    }

    public final float getPauseDuration() {
        return this.pauseDuration;
    }

    public final int getPoint() {
        return this.point;
    }

    public final String getPoseId() {
        return this.poseId;
    }

    public final String getProfileImageUrl() {
        return this.profileImageUrl;
    }

    public final List<GiftRankingBcsvrResponse> getRankings() {
        return this.rankings;
    }

    public final String getShareText() {
        return this.shareText;
    }

    public final boolean getShouldPlayAnimation() {
        return this.shouldPlayAnimation;
    }

    public final String getSlotId() {
        return this.slotId;
    }

    public final String getSpeech() {
        return this.speech;
    }

    public final int getTotalCoin() {
        return this.coins * this.count;
    }

    public final Integer getTotalGiftCoins() {
        return this.totalGiftCoins;
    }

    public final int getUnitPoint() {
        return this.point / this.count;
    }

    public final String getUserId() {
        return this.userId;
    }

    public final String getUserName() {
        return this.userName;
    }

    public final int getYellLevel() {
        return this.yellLevel;
    }

    public final int getYellRank() {
        return this.yellRank;
    }

    public final boolean hasNameplate() {
        return this.nameplateEnabled > 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((((((this.userId.hashCode() * 31) + this.userName.hashCode()) * 31) + this.profileImageUrl.hashCode()) * 31) + this.badgeImageUrl.hashCode()) * 31) + this.giftId.hashCode()) * 31;
        String str = this.liveSentGiftId;
        int hashCode2 = (((((((((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.giftTitle.hashCode()) * 31) + Integer.hashCode(this.giftType)) * 31) + this.giftSmallImageUrl.hashCode()) * 31) + this.giftLargeImageUrl.hashCode()) * 31) + Integer.hashCode(this.coins)) * 31) + Integer.hashCode(this.count)) * 31;
        String str2 = this.speech;
        int hashCode3 = (((((((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + Float.hashCode(this.pauseDuration)) * 31) + Integer.hashCode(this.nameplateEnabled)) * 31) + Integer.hashCode(this.orientations)) * 31;
        String str3 = this.poseId;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.shareText;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.avatarUserIds;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.effectId;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.avatarBodyImageUrl;
        int hashCode8 = (hashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.message;
        int hashCode9 = (((hashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31) + this.collabStreamerUserName.hashCode()) * 31;
        boolean z10 = this.isCheerleader;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        int i11 = (hashCode9 + i10) * 31;
        boolean z11 = this.isModerator;
        int i12 = z11;
        if (z11 != 0) {
            i12 = 1;
        }
        int i13 = (i11 + i12) * 31;
        boolean z12 = this.shouldPlayAnimation;
        int i14 = z12;
        if (z12 != 0) {
            i14 = 1;
        }
        int i15 = (i13 + i14) * 31;
        String str9 = this.slotId;
        int hashCode10 = (i15 + (str9 == null ? 0 : str9.hashCode())) * 31;
        Integer num = this.totalGiftCoins;
        int hashCode11 = (((((hashCode10 + (num == null ? 0 : num.hashCode())) * 31) + Integer.hashCode(this.point)) * 31) + this.rankings.hashCode()) * 31;
        Boolean bool = this.isLastSent;
        int hashCode12 = (hashCode11 + (bool != null ? bool.hashCode() : 0)) * 31;
        boolean z13 = this.becameCheerleader;
        return ((((hashCode12 + (z13 ? 1 : z13 ? 1 : 0)) * 31) + Integer.hashCode(this.yellRank)) * 31) + Integer.hashCode(this.yellLevel);
    }

    public final boolean isCheerleader() {
        return this.isCheerleader;
    }

    public final Boolean isLastSent() {
        return this.isLastSent;
    }

    public final boolean isModerator() {
        return this.isModerator;
    }

    public final boolean isOtherLiveGift() {
        return this.collabStreamerUserName.length() > 0;
    }

    public String toString() {
        return "GiftItem(userId=" + this.userId + ", userName=" + this.userName + ", profileImageUrl=" + this.profileImageUrl + ", badgeImageUrl=" + this.badgeImageUrl + ", giftId=" + this.giftId + ", liveSentGiftId=" + this.liveSentGiftId + ", giftTitle=" + this.giftTitle + ", giftType=" + this.giftType + ", giftSmallImageUrl=" + this.giftSmallImageUrl + ", giftLargeImageUrl=" + this.giftLargeImageUrl + ", coins=" + this.coins + ", count=" + this.count + ", speech=" + this.speech + ", pauseDuration=" + this.pauseDuration + ", nameplateEnabled=" + this.nameplateEnabled + ", orientations=" + this.orientations + ", poseId=" + this.poseId + ", shareText=" + this.shareText + ", avatarUserIds=" + this.avatarUserIds + ", effectId=" + this.effectId + ", avatarBodyImageUrl=" + this.avatarBodyImageUrl + ", message=" + this.message + ", collabStreamerUserName=" + this.collabStreamerUserName + ", isCheerleader=" + this.isCheerleader + ", isModerator=" + this.isModerator + ", shouldPlayAnimation=" + this.shouldPlayAnimation + ", slotId=" + this.slotId + ", totalGiftCoins=" + this.totalGiftCoins + ", point=" + this.point + ", rankings=" + this.rankings + ", isLastSent=" + this.isLastSent + ", becameCheerleader=" + this.becameCheerleader + ", yellRank=" + this.yellRank + ", yellLevel=" + this.yellLevel + ')';
    }

    /* renamed from: getGiftType  reason: collision with other method in class */
    public final d m19getGiftType() {
        return d.Companion.a(this.giftType);
    }

    public /* synthetic */ GiftItem(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i10, String str8, String str9, int i11, int i12, String str10, float f10, int i13, int i14, String str11, String str12, String str13, String str14, String str15, String str16, String str17, boolean z10, boolean z11, boolean z12, String str18, Integer num, int i15, List list, Boolean bool, boolean z13, int i16, int i17, int i18, int i19, h hVar) {
        this(str, str2, str3, str4, str5, str6, str7, i10, str8, str9, i11, i12, str10, f10, i13, (i18 & 32768) != 0 ? 0 : i14, str11, str12, str13, str14, (i18 & 1048576) != 0 ? null : str15, str16, str17, (i18 & 8388608) != 0 ? false : z10, (i18 & 16777216) != 0 ? false : z11, (i18 & 33554432) != 0 ? false : z12, str18, num, i15, list, bool, (i18 & Integer.MIN_VALUE) != 0 ? false : z13, (i19 & 1) != 0 ? 0 : i16, (i19 & 2) != 0 ? 0 : i17);
    }
}
