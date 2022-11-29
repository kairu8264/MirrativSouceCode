package com.dena.mirrorman.net.api.response;

import com.mirrativ.llstream.protocol.v1.topic.TopicConstant;
import jo.p;
import ym.c;

/* loaded from: classes2.dex */
public final class EmomoRunGameGift {
    public static final int $stable = 0;
    private final int consumedScore;
    private final String gameGiftCommand;
    private final int gameGiftId;
    private final int gameGiftType;
    private final int giftEventId;
    @c(TopicConstant.PACKET_TYPE_AUDIO_AAC)
    private final String name;
    @c("iurl")
    private final String profileImageUrl;
    @c("u")
    private final String userId;

    public EmomoRunGameGift(int i10, int i11, int i12, String str, int i13, String str2, String str3, String str4) {
        p.h(str, "gameGiftCommand");
        p.h(str2, "userId");
        p.h(str3, "name");
        p.h(str4, "profileImageUrl");
        this.giftEventId = i10;
        this.gameGiftId = i11;
        this.gameGiftType = i12;
        this.gameGiftCommand = str;
        this.consumedScore = i13;
        this.userId = str2;
        this.name = str3;
        this.profileImageUrl = str4;
    }

    public final int component1() {
        return this.giftEventId;
    }

    public final int component2() {
        return this.gameGiftId;
    }

    public final int component3() {
        return this.gameGiftType;
    }

    public final String component4() {
        return this.gameGiftCommand;
    }

    public final int component5() {
        return this.consumedScore;
    }

    public final String component6() {
        return this.userId;
    }

    public final String component7() {
        return this.name;
    }

    public final String component8() {
        return this.profileImageUrl;
    }

    public final EmomoRunGameGift copy(int i10, int i11, int i12, String str, int i13, String str2, String str3, String str4) {
        p.h(str, "gameGiftCommand");
        p.h(str2, "userId");
        p.h(str3, "name");
        p.h(str4, "profileImageUrl");
        return new EmomoRunGameGift(i10, i11, i12, str, i13, str2, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof EmomoRunGameGift) {
            EmomoRunGameGift emomoRunGameGift = (EmomoRunGameGift) obj;
            return this.giftEventId == emomoRunGameGift.giftEventId && this.gameGiftId == emomoRunGameGift.gameGiftId && this.gameGiftType == emomoRunGameGift.gameGiftType && p.c(this.gameGiftCommand, emomoRunGameGift.gameGiftCommand) && this.consumedScore == emomoRunGameGift.consumedScore && p.c(this.userId, emomoRunGameGift.userId) && p.c(this.name, emomoRunGameGift.name) && p.c(this.profileImageUrl, emomoRunGameGift.profileImageUrl);
        }
        return false;
    }

    public final int getConsumedScore() {
        return this.consumedScore;
    }

    public final String getGameGiftCommand() {
        return this.gameGiftCommand;
    }

    public final int getGameGiftId() {
        return this.gameGiftId;
    }

    public final int getGameGiftType() {
        return this.gameGiftType;
    }

    public final int getGiftEventId() {
        return this.giftEventId;
    }

    public final String getName() {
        return this.name;
    }

    public final String getProfileImageUrl() {
        return this.profileImageUrl;
    }

    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        return (((((((((((((Integer.hashCode(this.giftEventId) * 31) + Integer.hashCode(this.gameGiftId)) * 31) + Integer.hashCode(this.gameGiftType)) * 31) + this.gameGiftCommand.hashCode()) * 31) + Integer.hashCode(this.consumedScore)) * 31) + this.userId.hashCode()) * 31) + this.name.hashCode()) * 31) + this.profileImageUrl.hashCode();
    }

    public String toString() {
        return "EmomoRunGameGift(giftEventId=" + this.giftEventId + ", gameGiftId=" + this.gameGiftId + ", gameGiftType=" + this.gameGiftType + ", gameGiftCommand=" + this.gameGiftCommand + ", consumedScore=" + this.consumedScore + ", userId=" + this.userId + ", name=" + this.name + ", profileImageUrl=" + this.profileImageUrl + ')';
    }
}
