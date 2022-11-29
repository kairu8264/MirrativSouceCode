package com.dena.mirrorman.net.api.response;

import com.dena.mirrativ.mirrativapi.core.Status;
import jo.p;

/* loaded from: classes2.dex */
public final class RewardAdCompleteResponse {
    public static final int $stable = 8;
    private final String iconImageUrl;
    private final int rewardId;
    private final Status status;
    private final String title;

    public RewardAdCompleteResponse(Status status, int i10, String str, String str2) {
        p.h(status, "status");
        p.h(str, "iconImageUrl");
        p.h(str2, "title");
        this.status = status;
        this.rewardId = i10;
        this.iconImageUrl = str;
        this.title = str2;
    }

    public static /* synthetic */ RewardAdCompleteResponse copy$default(RewardAdCompleteResponse rewardAdCompleteResponse, Status status, int i10, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            status = rewardAdCompleteResponse.status;
        }
        if ((i11 & 2) != 0) {
            i10 = rewardAdCompleteResponse.rewardId;
        }
        if ((i11 & 4) != 0) {
            str = rewardAdCompleteResponse.iconImageUrl;
        }
        if ((i11 & 8) != 0) {
            str2 = rewardAdCompleteResponse.title;
        }
        return rewardAdCompleteResponse.copy(status, i10, str, str2);
    }

    public final Status component1() {
        return this.status;
    }

    public final int component2() {
        return this.rewardId;
    }

    public final String component3() {
        return this.iconImageUrl;
    }

    public final String component4() {
        return this.title;
    }

    public final RewardAdCompleteResponse copy(Status status, int i10, String str, String str2) {
        p.h(status, "status");
        p.h(str, "iconImageUrl");
        p.h(str2, "title");
        return new RewardAdCompleteResponse(status, i10, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RewardAdCompleteResponse) {
            RewardAdCompleteResponse rewardAdCompleteResponse = (RewardAdCompleteResponse) obj;
            return p.c(this.status, rewardAdCompleteResponse.status) && this.rewardId == rewardAdCompleteResponse.rewardId && p.c(this.iconImageUrl, rewardAdCompleteResponse.iconImageUrl) && p.c(this.title, rewardAdCompleteResponse.title);
        }
        return false;
    }

    public final String getIconImageUrl() {
        return this.iconImageUrl;
    }

    public final int getRewardId() {
        return this.rewardId;
    }

    public final Status getStatus() {
        return this.status;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return (((((this.status.hashCode() * 31) + Integer.hashCode(this.rewardId)) * 31) + this.iconImageUrl.hashCode()) * 31) + this.title.hashCode();
    }

    public String toString() {
        return "RewardAdCompleteResponse(status=" + this.status + ", rewardId=" + this.rewardId + ", iconImageUrl=" + this.iconImageUrl + ", title=" + this.title + ')';
    }
}
