package com.dena.mirrorman.net.bcsvr.response;

import java.util.List;
import jo.p;

/* loaded from: classes2.dex */
public final class MutualGiftReceivableRewardsBcsvrResponse {
    public static final int $stable = 8;
    private final List<MutualGiftAchievedBcsvrResponse> receivableRewards;

    public MutualGiftReceivableRewardsBcsvrResponse(List<MutualGiftAchievedBcsvrResponse> list) {
        p.h(list, "receivableRewards");
        this.receivableRewards = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MutualGiftReceivableRewardsBcsvrResponse copy$default(MutualGiftReceivableRewardsBcsvrResponse mutualGiftReceivableRewardsBcsvrResponse, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = mutualGiftReceivableRewardsBcsvrResponse.receivableRewards;
        }
        return mutualGiftReceivableRewardsBcsvrResponse.copy(list);
    }

    public final List<MutualGiftAchievedBcsvrResponse> component1() {
        return this.receivableRewards;
    }

    public final MutualGiftReceivableRewardsBcsvrResponse copy(List<MutualGiftAchievedBcsvrResponse> list) {
        p.h(list, "receivableRewards");
        return new MutualGiftReceivableRewardsBcsvrResponse(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MutualGiftReceivableRewardsBcsvrResponse) && p.c(this.receivableRewards, ((MutualGiftReceivableRewardsBcsvrResponse) obj).receivableRewards);
    }

    public final List<MutualGiftAchievedBcsvrResponse> getReceivableRewards() {
        return this.receivableRewards;
    }

    public int hashCode() {
        return this.receivableRewards.hashCode();
    }

    public String toString() {
        return "MutualGiftReceivableRewardsBcsvrResponse(receivableRewards=" + this.receivableRewards + ')';
    }
}
