package com.dena.mirrorman.net.api.response.live;

import com.dena.mirrativ.mirrativapi.core.Status;
import java.util.List;
import jo.p;

/* loaded from: classes2.dex */
public final class RecommendLivesResponse {
    public static final int $stable = 8;
    private final List<LiveBasicParams> lives;
    private final Status status;

    /* JADX WARN: Multi-variable type inference failed */
    public RecommendLivesResponse(Status status, List<? extends LiveBasicParams> list) {
        p.h(status, "status");
        p.h(list, "lives");
        this.status = status;
        this.lives = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RecommendLivesResponse copy$default(RecommendLivesResponse recommendLivesResponse, Status status, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            status = recommendLivesResponse.status;
        }
        if ((i10 & 2) != 0) {
            list = recommendLivesResponse.lives;
        }
        return recommendLivesResponse.copy(status, list);
    }

    public final Status component1() {
        return this.status;
    }

    public final List<LiveBasicParams> component2() {
        return this.lives;
    }

    public final RecommendLivesResponse copy(Status status, List<? extends LiveBasicParams> list) {
        p.h(status, "status");
        p.h(list, "lives");
        return new RecommendLivesResponse(status, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RecommendLivesResponse) {
            RecommendLivesResponse recommendLivesResponse = (RecommendLivesResponse) obj;
            return p.c(this.status, recommendLivesResponse.status) && p.c(this.lives, recommendLivesResponse.lives);
        }
        return false;
    }

    public final List<LiveBasicParams> getLives() {
        return this.lives;
    }

    public final Status getStatus() {
        return this.status;
    }

    public int hashCode() {
        return (this.status.hashCode() * 31) + this.lives.hashCode();
    }

    public String toString() {
        return "RecommendLivesResponse(status=" + this.status + ", lives=" + this.lives + ')';
    }
}
