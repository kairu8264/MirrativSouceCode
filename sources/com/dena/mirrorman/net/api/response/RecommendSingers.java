package com.dena.mirrorman.net.api.response;

import com.dena.mirrativ.mirrativapi.core.Status;
import java.util.List;
import jo.p;

/* loaded from: classes2.dex */
public final class RecommendSingers {
    public static final int $stable = 8;
    private final List<Singer> recommendSingers;
    private final Status status;

    public RecommendSingers(List<Singer> list, Status status) {
        p.h(list, "recommendSingers");
        p.h(status, "status");
        this.recommendSingers = list;
        this.status = status;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RecommendSingers copy$default(RecommendSingers recommendSingers, List list, Status status, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = recommendSingers.recommendSingers;
        }
        if ((i10 & 2) != 0) {
            status = recommendSingers.status;
        }
        return recommendSingers.copy(list, status);
    }

    public final List<Singer> component1() {
        return this.recommendSingers;
    }

    public final Status component2() {
        return this.status;
    }

    public final RecommendSingers copy(List<Singer> list, Status status) {
        p.h(list, "recommendSingers");
        p.h(status, "status");
        return new RecommendSingers(list, status);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RecommendSingers) {
            RecommendSingers recommendSingers = (RecommendSingers) obj;
            return p.c(this.recommendSingers, recommendSingers.recommendSingers) && p.c(this.status, recommendSingers.status);
        }
        return false;
    }

    public final List<Singer> getRecommendSingers() {
        return this.recommendSingers;
    }

    public final Status getStatus() {
        return this.status;
    }

    public int hashCode() {
        return (this.recommendSingers.hashCode() * 31) + this.status.hashCode();
    }

    public String toString() {
        return "RecommendSingers(recommendSingers=" + this.recommendSingers + ", status=" + this.status + ')';
    }
}
