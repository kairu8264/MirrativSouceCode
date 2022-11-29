package com.dena.mirrativ.mirrativapi.user;

import com.dena.mirrativ.mirrativapi.core.Status;
import java.util.List;
import jo.p;

/* loaded from: classes2.dex */
public final class RewardHistoryResponse {
    private final String nextCursor;
    private final List<Reward> rewards;
    private final Status status;

    public RewardHistoryResponse(List<Reward> list, String str, Status status) {
        p.h(list, "rewards");
        p.h(str, "nextCursor");
        p.h(status, "status");
        this.rewards = list;
        this.nextCursor = str;
        this.status = status;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RewardHistoryResponse copy$default(RewardHistoryResponse rewardHistoryResponse, List list, String str, Status status, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = rewardHistoryResponse.rewards;
        }
        if ((i10 & 2) != 0) {
            str = rewardHistoryResponse.nextCursor;
        }
        if ((i10 & 4) != 0) {
            status = rewardHistoryResponse.status;
        }
        return rewardHistoryResponse.copy(list, str, status);
    }

    public final List<Reward> component1() {
        return this.rewards;
    }

    public final String component2() {
        return this.nextCursor;
    }

    public final Status component3() {
        return this.status;
    }

    public final RewardHistoryResponse copy(List<Reward> list, String str, Status status) {
        p.h(list, "rewards");
        p.h(str, "nextCursor");
        p.h(status, "status");
        return new RewardHistoryResponse(list, str, status);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RewardHistoryResponse) {
            RewardHistoryResponse rewardHistoryResponse = (RewardHistoryResponse) obj;
            return p.c(this.rewards, rewardHistoryResponse.rewards) && p.c(this.nextCursor, rewardHistoryResponse.nextCursor) && p.c(this.status, rewardHistoryResponse.status);
        }
        return false;
    }

    public final String getNextCursor() {
        return this.nextCursor;
    }

    public final List<Reward> getRewards() {
        return this.rewards;
    }

    public final Status getStatus() {
        return this.status;
    }

    public int hashCode() {
        return (((this.rewards.hashCode() * 31) + this.nextCursor.hashCode()) * 31) + this.status.hashCode();
    }

    public String toString() {
        return "RewardHistoryResponse(rewards=" + this.rewards + ", nextCursor=" + this.nextCursor + ", status=" + this.status + ')';
    }
}
