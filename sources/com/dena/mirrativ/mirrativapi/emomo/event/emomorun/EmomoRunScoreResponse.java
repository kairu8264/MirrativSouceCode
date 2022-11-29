package com.dena.mirrativ.mirrativapi.emomo.event.emomorun;

import com.dena.mirrativ.mirrativapi.core.Status;
import java.io.Serializable;
import java.util.List;
import jo.p;

/* loaded from: classes2.dex */
public final class EmomoRunScoreResponse implements Serializable {
    private final List<EmomoRunGameEffect> gameEffects;
    private final List<EmomoRunGameGift> gameGifts;
    private final int giftEventId;
    private final EmomoRunUserDetail scoreReward;
    private final String shareText;
    private final Status status;

    public EmomoRunScoreResponse(int i10, EmomoRunUserDetail emomoRunUserDetail, List<EmomoRunGameGift> list, List<EmomoRunGameEffect> list2, String str, Status status) {
        p.h(emomoRunUserDetail, "scoreReward");
        p.h(list, "gameGifts");
        p.h(list2, "gameEffects");
        p.h(str, "shareText");
        p.h(status, "status");
        this.giftEventId = i10;
        this.scoreReward = emomoRunUserDetail;
        this.gameGifts = list;
        this.gameEffects = list2;
        this.shareText = str;
        this.status = status;
    }

    public static /* synthetic */ EmomoRunScoreResponse copy$default(EmomoRunScoreResponse emomoRunScoreResponse, int i10, EmomoRunUserDetail emomoRunUserDetail, List list, List list2, String str, Status status, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = emomoRunScoreResponse.giftEventId;
        }
        if ((i11 & 2) != 0) {
            emomoRunUserDetail = emomoRunScoreResponse.scoreReward;
        }
        EmomoRunUserDetail emomoRunUserDetail2 = emomoRunUserDetail;
        List<EmomoRunGameGift> list3 = list;
        if ((i11 & 4) != 0) {
            list3 = emomoRunScoreResponse.gameGifts;
        }
        List list4 = list3;
        List<EmomoRunGameEffect> list5 = list2;
        if ((i11 & 8) != 0) {
            list5 = emomoRunScoreResponse.gameEffects;
        }
        List list6 = list5;
        if ((i11 & 16) != 0) {
            str = emomoRunScoreResponse.shareText;
        }
        String str2 = str;
        if ((i11 & 32) != 0) {
            status = emomoRunScoreResponse.status;
        }
        return emomoRunScoreResponse.copy(i10, emomoRunUserDetail2, list4, list6, str2, status);
    }

    public final int component1() {
        return this.giftEventId;
    }

    public final EmomoRunUserDetail component2() {
        return this.scoreReward;
    }

    public final List<EmomoRunGameGift> component3() {
        return this.gameGifts;
    }

    public final List<EmomoRunGameEffect> component4() {
        return this.gameEffects;
    }

    public final String component5() {
        return this.shareText;
    }

    public final Status component6() {
        return this.status;
    }

    public final EmomoRunScoreResponse copy(int i10, EmomoRunUserDetail emomoRunUserDetail, List<EmomoRunGameGift> list, List<EmomoRunGameEffect> list2, String str, Status status) {
        p.h(emomoRunUserDetail, "scoreReward");
        p.h(list, "gameGifts");
        p.h(list2, "gameEffects");
        p.h(str, "shareText");
        p.h(status, "status");
        return new EmomoRunScoreResponse(i10, emomoRunUserDetail, list, list2, str, status);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof EmomoRunScoreResponse) {
            EmomoRunScoreResponse emomoRunScoreResponse = (EmomoRunScoreResponse) obj;
            return this.giftEventId == emomoRunScoreResponse.giftEventId && p.c(this.scoreReward, emomoRunScoreResponse.scoreReward) && p.c(this.gameGifts, emomoRunScoreResponse.gameGifts) && p.c(this.gameEffects, emomoRunScoreResponse.gameEffects) && p.c(this.shareText, emomoRunScoreResponse.shareText) && p.c(this.status, emomoRunScoreResponse.status);
        }
        return false;
    }

    public final List<EmomoRunGameEffect> getGameEffects() {
        return this.gameEffects;
    }

    public final List<EmomoRunGameGift> getGameGifts() {
        return this.gameGifts;
    }

    public final int getGiftEventId() {
        return this.giftEventId;
    }

    public final EmomoRunUserDetail getScoreReward() {
        return this.scoreReward;
    }

    public final String getShareText() {
        return this.shareText;
    }

    public final Status getStatus() {
        return this.status;
    }

    public int hashCode() {
        return (((((((((Integer.hashCode(this.giftEventId) * 31) + this.scoreReward.hashCode()) * 31) + this.gameGifts.hashCode()) * 31) + this.gameEffects.hashCode()) * 31) + this.shareText.hashCode()) * 31) + this.status.hashCode();
    }

    public String toString() {
        return "EmomoRunScoreResponse(giftEventId=" + this.giftEventId + ", scoreReward=" + this.scoreReward + ", gameGifts=" + this.gameGifts + ", gameEffects=" + this.gameEffects + ", shareText=" + this.shareText + ", status=" + this.status + ')';
    }
}
