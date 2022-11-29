package com.dena.mirrorman.unity;

/* loaded from: classes3.dex */
public final class UnityMiniGameOutputEmomoRunConsumeGift {
    public static final int $stable = 0;
    private final int gameGiftId;
    private final int gameNo;

    public UnityMiniGameOutputEmomoRunConsumeGift(int i10, int i11) {
        this.gameGiftId = i10;
        this.gameNo = i11;
    }

    public static /* synthetic */ UnityMiniGameOutputEmomoRunConsumeGift copy$default(UnityMiniGameOutputEmomoRunConsumeGift unityMiniGameOutputEmomoRunConsumeGift, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = unityMiniGameOutputEmomoRunConsumeGift.gameGiftId;
        }
        if ((i12 & 2) != 0) {
            i11 = unityMiniGameOutputEmomoRunConsumeGift.gameNo;
        }
        return unityMiniGameOutputEmomoRunConsumeGift.copy(i10, i11);
    }

    public final int component1() {
        return this.gameGiftId;
    }

    public final int component2() {
        return this.gameNo;
    }

    public final UnityMiniGameOutputEmomoRunConsumeGift copy(int i10, int i11) {
        return new UnityMiniGameOutputEmomoRunConsumeGift(i10, i11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof UnityMiniGameOutputEmomoRunConsumeGift) {
            UnityMiniGameOutputEmomoRunConsumeGift unityMiniGameOutputEmomoRunConsumeGift = (UnityMiniGameOutputEmomoRunConsumeGift) obj;
            return this.gameGiftId == unityMiniGameOutputEmomoRunConsumeGift.gameGiftId && this.gameNo == unityMiniGameOutputEmomoRunConsumeGift.gameNo;
        }
        return false;
    }

    public final int getGameGiftId() {
        return this.gameGiftId;
    }

    public final int getGameNo() {
        return this.gameNo;
    }

    public int hashCode() {
        return (Integer.hashCode(this.gameGiftId) * 31) + Integer.hashCode(this.gameNo);
    }

    public String toString() {
        return "UnityMiniGameOutputEmomoRunConsumeGift(gameGiftId=" + this.gameGiftId + ", gameNo=" + this.gameNo + ')';
    }
}
