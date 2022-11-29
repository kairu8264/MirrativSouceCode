package com.dena.mirrativ.mirrativapi.emomo.event.emomorun;

import com.dena.mirrativ.mirrativapi.core.BooleanTypeAdapter;
import com.dena.mirrativ.mirrativapi.core.Status;
import com.dena.mirrativ.mirrativapi.emomo.event.EmomoGameStatusType;
import com.dena.mirrativ.mirrativapi.emomo.event.EmomoGameStatusTypeAdapter;
import java.io.Serializable;
import jo.p;
import ym.b;

/* loaded from: classes2.dex */
public final class EmomoRunGameResponse implements Serializable {
    private final int gameNo;
    @b(EmomoGameStatusTypeAdapter.class)
    private final EmomoGameStatusType gameStatus;
    private final int giftEventId;
    @b(BooleanTypeAdapter.class)
    private final boolean hasNewScore;
    private final int highScore;
    private final int rank;
    private final int remainingGachaCount;
    private final int score;
    private final Status status;
    private final int totalScore;

    public EmomoRunGameResponse(int i10, int i11, EmomoGameStatusType emomoGameStatusType, int i12, int i13, int i14, boolean z10, int i15, int i16, Status status) {
        p.h(emomoGameStatusType, "gameStatus");
        p.h(status, "status");
        this.giftEventId = i10;
        this.gameNo = i11;
        this.gameStatus = emomoGameStatusType;
        this.score = i12;
        this.totalScore = i13;
        this.highScore = i14;
        this.hasNewScore = z10;
        this.rank = i15;
        this.remainingGachaCount = i16;
        this.status = status;
    }

    public final int component1() {
        return this.giftEventId;
    }

    public final Status component10() {
        return this.status;
    }

    public final int component2() {
        return this.gameNo;
    }

    public final EmomoGameStatusType component3() {
        return this.gameStatus;
    }

    public final int component4() {
        return this.score;
    }

    public final int component5() {
        return this.totalScore;
    }

    public final int component6() {
        return this.highScore;
    }

    public final boolean component7() {
        return this.hasNewScore;
    }

    public final int component8() {
        return this.rank;
    }

    public final int component9() {
        return this.remainingGachaCount;
    }

    public final EmomoRunGameResponse copy(int i10, int i11, EmomoGameStatusType emomoGameStatusType, int i12, int i13, int i14, boolean z10, int i15, int i16, Status status) {
        p.h(emomoGameStatusType, "gameStatus");
        p.h(status, "status");
        return new EmomoRunGameResponse(i10, i11, emomoGameStatusType, i12, i13, i14, z10, i15, i16, status);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof EmomoRunGameResponse) {
            EmomoRunGameResponse emomoRunGameResponse = (EmomoRunGameResponse) obj;
            return this.giftEventId == emomoRunGameResponse.giftEventId && this.gameNo == emomoRunGameResponse.gameNo && this.gameStatus == emomoRunGameResponse.gameStatus && this.score == emomoRunGameResponse.score && this.totalScore == emomoRunGameResponse.totalScore && this.highScore == emomoRunGameResponse.highScore && this.hasNewScore == emomoRunGameResponse.hasNewScore && this.rank == emomoRunGameResponse.rank && this.remainingGachaCount == emomoRunGameResponse.remainingGachaCount && p.c(this.status, emomoRunGameResponse.status);
        }
        return false;
    }

    public final int getGameNo() {
        return this.gameNo;
    }

    public final EmomoGameStatusType getGameStatus() {
        return this.gameStatus;
    }

    public final int getGiftEventId() {
        return this.giftEventId;
    }

    public final boolean getHasNewScore() {
        return this.hasNewScore;
    }

    public final int getHighScore() {
        return this.highScore;
    }

    public final int getRank() {
        return this.rank;
    }

    public final int getRemainingGachaCount() {
        return this.remainingGachaCount;
    }

    public final int getScore() {
        return this.score;
    }

    public final Status getStatus() {
        return this.status;
    }

    public final int getTotalScore() {
        return this.totalScore;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((((((((Integer.hashCode(this.giftEventId) * 31) + Integer.hashCode(this.gameNo)) * 31) + this.gameStatus.hashCode()) * 31) + Integer.hashCode(this.score)) * 31) + Integer.hashCode(this.totalScore)) * 31) + Integer.hashCode(this.highScore)) * 31;
        boolean z10 = this.hasNewScore;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        return ((((((hashCode + i10) * 31) + Integer.hashCode(this.rank)) * 31) + Integer.hashCode(this.remainingGachaCount)) * 31) + this.status.hashCode();
    }

    public String toString() {
        return "EmomoRunGameResponse(giftEventId=" + this.giftEventId + ", gameNo=" + this.gameNo + ", gameStatus=" + this.gameStatus + ", score=" + this.score + ", totalScore=" + this.totalScore + ", highScore=" + this.highScore + ", hasNewScore=" + this.hasNewScore + ", rank=" + this.rank + ", remainingGachaCount=" + this.remainingGachaCount + ", status=" + this.status + ')';
    }
}
