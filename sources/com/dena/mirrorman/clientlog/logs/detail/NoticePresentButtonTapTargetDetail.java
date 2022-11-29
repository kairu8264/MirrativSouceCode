package com.dena.mirrorman.clientlog.logs.detail;

import jo.p;
import xm.c;
import xm.f;

/* loaded from: classes2.dex */
public final class NoticePresentButtonTapTargetDetail {
    public static final int $stable = 0;
    private final String status;
    private final String title;

    public NoticePresentButtonTapTargetDetail(String str, String str2) {
        p.h(str, "title");
        p.h(str2, "status");
        this.title = str;
        this.status = str2;
    }

    public static /* synthetic */ NoticePresentButtonTapTargetDetail copy$default(NoticePresentButtonTapTargetDetail noticePresentButtonTapTargetDetail, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = noticePresentButtonTapTargetDetail.title;
        }
        if ((i10 & 2) != 0) {
            str2 = noticePresentButtonTapTargetDetail.status;
        }
        return noticePresentButtonTapTargetDetail.copy(str, str2);
    }

    public final String component1() {
        return this.title;
    }

    public final String component2() {
        return this.status;
    }

    public final NoticePresentButtonTapTargetDetail copy(String str, String str2) {
        p.h(str, "title");
        p.h(str2, "status");
        return new NoticePresentButtonTapTargetDetail(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof NoticePresentButtonTapTargetDetail) {
            NoticePresentButtonTapTargetDetail noticePresentButtonTapTargetDetail = (NoticePresentButtonTapTargetDetail) obj;
            return p.c(this.title, noticePresentButtonTapTargetDetail.title) && p.c(this.status, noticePresentButtonTapTargetDetail.status);
        }
        return false;
    }

    public final String getStatus() {
        return this.status;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return (this.title.hashCode() * 31) + this.status.hashCode();
    }

    public final String toJson() {
        String s10 = new f().e(c.LOWER_CASE_WITH_UNDERSCORES).b().s(this);
        p.g(s10, "GsonBuilder()\n        .s…e()\n        .toJson(this)");
        return s10;
    }

    public String toString() {
        return "NoticePresentButtonTapTargetDetail(title=" + this.title + ", status=" + this.status + ')';
    }
}
