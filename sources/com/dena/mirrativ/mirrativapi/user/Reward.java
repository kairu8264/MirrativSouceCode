package com.dena.mirrativ.mirrativapi.user;

import jo.p;

/* loaded from: classes2.dex */
public final class Reward {
    private final int amount;
    private final int givenAt;
    private final int rewardType;
    private final String text;

    public Reward(int i10, int i11, int i12, String str) {
        p.h(str, "text");
        this.rewardType = i10;
        this.amount = i11;
        this.givenAt = i12;
        this.text = str;
    }

    public static /* synthetic */ Reward copy$default(Reward reward, int i10, int i11, int i12, String str, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i10 = reward.rewardType;
        }
        if ((i13 & 2) != 0) {
            i11 = reward.amount;
        }
        if ((i13 & 4) != 0) {
            i12 = reward.givenAt;
        }
        if ((i13 & 8) != 0) {
            str = reward.text;
        }
        return reward.copy(i10, i11, i12, str);
    }

    public final int component1() {
        return this.rewardType;
    }

    public final int component2() {
        return this.amount;
    }

    public final int component3() {
        return this.givenAt;
    }

    public final String component4() {
        return this.text;
    }

    public final Reward copy(int i10, int i11, int i12, String str) {
        p.h(str, "text");
        return new Reward(i10, i11, i12, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Reward) {
            Reward reward = (Reward) obj;
            return this.rewardType == reward.rewardType && this.amount == reward.amount && this.givenAt == reward.givenAt && p.c(this.text, reward.text);
        }
        return false;
    }

    public final int getAmount() {
        return this.amount;
    }

    public final int getGivenAt() {
        return this.givenAt;
    }

    public final int getRewardType() {
        return this.rewardType;
    }

    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.rewardType) * 31) + Integer.hashCode(this.amount)) * 31) + Integer.hashCode(this.givenAt)) * 31) + this.text.hashCode();
    }

    public String toString() {
        return "Reward(rewardType=" + this.rewardType + ", amount=" + this.amount + ", givenAt=" + this.givenAt + ", text=" + this.text + ')';
    }
}
