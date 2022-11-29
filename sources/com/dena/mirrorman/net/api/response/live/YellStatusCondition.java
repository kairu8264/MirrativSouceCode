package com.dena.mirrorman.net.api.response.live;

/* loaded from: classes2.dex */
public final class YellStatusCondition {
    public static final int $stable = 0;
    private final int commentCount;
    private final int giftScore;
    private final int totalViewDays;
    private final int totalViewingTime;

    public YellStatusCondition(int i10, int i11, int i12, int i13) {
        this.giftScore = i10;
        this.commentCount = i11;
        this.totalViewingTime = i12;
        this.totalViewDays = i13;
    }

    public static /* synthetic */ YellStatusCondition copy$default(YellStatusCondition yellStatusCondition, int i10, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i10 = yellStatusCondition.giftScore;
        }
        if ((i14 & 2) != 0) {
            i11 = yellStatusCondition.commentCount;
        }
        if ((i14 & 4) != 0) {
            i12 = yellStatusCondition.totalViewingTime;
        }
        if ((i14 & 8) != 0) {
            i13 = yellStatusCondition.totalViewDays;
        }
        return yellStatusCondition.copy(i10, i11, i12, i13);
    }

    public final int component1() {
        return this.giftScore;
    }

    public final int component2() {
        return this.commentCount;
    }

    public final int component3() {
        return this.totalViewingTime;
    }

    public final int component4() {
        return this.totalViewDays;
    }

    public final YellStatusCondition copy(int i10, int i11, int i12, int i13) {
        return new YellStatusCondition(i10, i11, i12, i13);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof YellStatusCondition) {
            YellStatusCondition yellStatusCondition = (YellStatusCondition) obj;
            return this.giftScore == yellStatusCondition.giftScore && this.commentCount == yellStatusCondition.commentCount && this.totalViewingTime == yellStatusCondition.totalViewingTime && this.totalViewDays == yellStatusCondition.totalViewDays;
        }
        return false;
    }

    public final int getCommentCount() {
        return this.commentCount;
    }

    public final int getGiftScore() {
        return this.giftScore;
    }

    public final int getTotalViewDays() {
        return this.totalViewDays;
    }

    public final int getTotalViewingTime() {
        return this.totalViewingTime;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.giftScore) * 31) + Integer.hashCode(this.commentCount)) * 31) + Integer.hashCode(this.totalViewingTime)) * 31) + Integer.hashCode(this.totalViewDays);
    }

    public String toString() {
        return "YellStatusCondition(giftScore=" + this.giftScore + ", commentCount=" + this.commentCount + ", totalViewingTime=" + this.totalViewingTime + ", totalViewDays=" + this.totalViewDays + ')';
    }
}
