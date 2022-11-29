package com.dena.mirrorman.clientlog.logs.detail;

import java.util.List;
import jo.p;
import xm.c;
import xm.f;

/* loaded from: classes2.dex */
public final class LveAnnotationTargetDetail {
    public static final int $stable = 8;
    private final List<LveAnnotationStat> lveAnnotationStats;

    public LveAnnotationTargetDetail(List<LveAnnotationStat> list) {
        p.h(list, "lveAnnotationStats");
        this.lveAnnotationStats = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LveAnnotationTargetDetail copy$default(LveAnnotationTargetDetail lveAnnotationTargetDetail, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = lveAnnotationTargetDetail.lveAnnotationStats;
        }
        return lveAnnotationTargetDetail.copy(list);
    }

    public final List<LveAnnotationStat> component1() {
        return this.lveAnnotationStats;
    }

    public final LveAnnotationTargetDetail copy(List<LveAnnotationStat> list) {
        p.h(list, "lveAnnotationStats");
        return new LveAnnotationTargetDetail(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LveAnnotationTargetDetail) && p.c(this.lveAnnotationStats, ((LveAnnotationTargetDetail) obj).lveAnnotationStats);
    }

    public final List<LveAnnotationStat> getLveAnnotationStats() {
        return this.lveAnnotationStats;
    }

    public int hashCode() {
        return this.lveAnnotationStats.hashCode();
    }

    public final String toJson() {
        String s10 = new f().e(c.LOWER_CASE_WITH_UNDERSCORES).b().s(this);
        p.g(s10, "GsonBuilder()\n        .s…   .create().toJson(this)");
        return s10;
    }

    public String toString() {
        return "LveAnnotationTargetDetail(lveAnnotationStats=" + this.lveAnnotationStats + ')';
    }
}
