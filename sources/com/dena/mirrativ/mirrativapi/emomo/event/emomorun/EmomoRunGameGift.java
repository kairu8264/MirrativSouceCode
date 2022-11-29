package com.dena.mirrativ.mirrativapi.emomo.event.emomorun;

import java.io.Serializable;
import jo.h;
import jo.p;

/* loaded from: classes2.dex */
public final class EmomoRunGameGift implements Serializable {
    public static final Companion Companion = new Companion(null);
    private static final int GIFT_TYPE_TREASURE_GIFT_GACHA = 5;
    private final int consumedScore;
    private final String gameGiftCommand;
    private final int gameGiftId;
    private final int gameGiftType;
    private final String name;
    private final String profileImageUrl;
    private final String userId;

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(h hVar) {
            this();
        }
    }

    public EmomoRunGameGift(String str, String str2, String str3, int i10, int i11, String str4, int i12) {
        p.h(str, "userId");
        p.h(str2, "name");
        p.h(str3, "profileImageUrl");
        p.h(str4, "gameGiftCommand");
        this.userId = str;
        this.name = str2;
        this.profileImageUrl = str3;
        this.gameGiftId = i10;
        this.gameGiftType = i11;
        this.gameGiftCommand = str4;
        this.consumedScore = i12;
    }

    public static /* synthetic */ EmomoRunGameGift copy$default(EmomoRunGameGift emomoRunGameGift, String str, String str2, String str3, int i10, int i11, String str4, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = emomoRunGameGift.userId;
        }
        if ((i13 & 2) != 0) {
            str2 = emomoRunGameGift.name;
        }
        String str5 = str2;
        if ((i13 & 4) != 0) {
            str3 = emomoRunGameGift.profileImageUrl;
        }
        String str6 = str3;
        if ((i13 & 8) != 0) {
            i10 = emomoRunGameGift.gameGiftId;
        }
        int i14 = i10;
        if ((i13 & 16) != 0) {
            i11 = emomoRunGameGift.gameGiftType;
        }
        int i15 = i11;
        if ((i13 & 32) != 0) {
            str4 = emomoRunGameGift.gameGiftCommand;
        }
        String str7 = str4;
        if ((i13 & 64) != 0) {
            i12 = emomoRunGameGift.consumedScore;
        }
        return emomoRunGameGift.copy(str, str5, str6, i14, i15, str7, i12);
    }

    public final String component1() {
        return this.userId;
    }

    public final String component2() {
        return this.name;
    }

    public final String component3() {
        return this.profileImageUrl;
    }

    public final int component4() {
        return this.gameGiftId;
    }

    public final int component5() {
        return this.gameGiftType;
    }

    public final String component6() {
        return this.gameGiftCommand;
    }

    public final int component7() {
        return this.consumedScore;
    }

    public final EmomoRunGameGift copy(String str, String str2, String str3, int i10, int i11, String str4, int i12) {
        p.h(str, "userId");
        p.h(str2, "name");
        p.h(str3, "profileImageUrl");
        p.h(str4, "gameGiftCommand");
        return new EmomoRunGameGift(str, str2, str3, i10, i11, str4, i12);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof EmomoRunGameGift) {
            EmomoRunGameGift emomoRunGameGift = (EmomoRunGameGift) obj;
            return p.c(this.userId, emomoRunGameGift.userId) && p.c(this.name, emomoRunGameGift.name) && p.c(this.profileImageUrl, emomoRunGameGift.profileImageUrl) && this.gameGiftId == emomoRunGameGift.gameGiftId && this.gameGiftType == emomoRunGameGift.gameGiftType && p.c(this.gameGiftCommand, emomoRunGameGift.gameGiftCommand) && this.consumedScore == emomoRunGameGift.consumedScore;
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
        return (((((((((((this.userId.hashCode() * 31) + this.name.hashCode()) * 31) + this.profileImageUrl.hashCode()) * 31) + Integer.hashCode(this.gameGiftId)) * 31) + Integer.hashCode(this.gameGiftType)) * 31) + this.gameGiftCommand.hashCode()) * 31) + Integer.hashCode(this.consumedScore);
    }

    public final boolean isGiftGacha() {
        return this.gameGiftType == 5;
    }

    public String toString() {
        return "EmomoRunGameGift(userId=" + this.userId + ", name=" + this.name + ", profileImageUrl=" + this.profileImageUrl + ", gameGiftId=" + this.gameGiftId + ", gameGiftType=" + this.gameGiftType + ", gameGiftCommand=" + this.gameGiftCommand + ", consumedScore=" + this.consumedScore + ')';
    }
}
