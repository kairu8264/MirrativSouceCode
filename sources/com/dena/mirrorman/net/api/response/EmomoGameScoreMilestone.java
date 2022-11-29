package com.dena.mirrorman.net.api.response;

/* loaded from: classes2.dex */
public final class EmomoGameScoreMilestone {
    public static final int $stable = 0;
    private final int enabledCoin;
    private final int thresholdScore;

    public EmomoGameScoreMilestone(int i10, int i11) {
        this.thresholdScore = i10;
        this.enabledCoin = i11;
    }

    public static /* synthetic */ EmomoGameScoreMilestone copy$default(EmomoGameScoreMilestone emomoGameScoreMilestone, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = emomoGameScoreMilestone.thresholdScore;
        }
        if ((i12 & 2) != 0) {
            i11 = emomoGameScoreMilestone.enabledCoin;
        }
        return emomoGameScoreMilestone.copy(i10, i11);
    }

    public final int component1() {
        return this.thresholdScore;
    }

    public final int component2() {
        return this.enabledCoin;
    }

    public final EmomoGameScoreMilestone copy(int i10, int i11) {
        return new EmomoGameScoreMilestone(i10, i11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof EmomoGameScoreMilestone) {
            EmomoGameScoreMilestone emomoGameScoreMilestone = (EmomoGameScoreMilestone) obj;
            return this.thresholdScore == emomoGameScoreMilestone.thresholdScore && this.enabledCoin == emomoGameScoreMilestone.enabledCoin;
        }
        return false;
    }

    public final int getEnabledCoin() {
        return this.enabledCoin;
    }

    public final int getThresholdScore() {
        return this.thresholdScore;
    }

    public int hashCode() {
        return (Integer.hashCode(this.thresholdScore) * 31) + Integer.hashCode(this.enabledCoin);
    }

    public String toString() {
        return "EmomoGameScoreMilestone(thresholdScore=" + this.thresholdScore + ", enabledCoin=" + this.enabledCoin + ')';
    }
}
