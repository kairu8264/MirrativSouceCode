package com.dena.mirrativ.mirrativapi;

import com.dena.mirrativ.mirrativapi.core.Status;
import java.io.Serializable;
import java.util.List;
import jo.p;

/* loaded from: classes.dex */
public final class RankingFocusableResponse implements Serializable {
    private final List<RankingFocusable> rankings;
    private final Status status;

    /* loaded from: classes.dex */
    public static final class RankingFocusable implements Serializable {
        private final String eventId;
        private final int eventType;
        private final String imageUrl;
        private boolean isFocus;
        private final String period;
        private final String title;

        public RankingFocusable(String str, int i10, String str2, String str3, String str4, boolean z10) {
            p.h(str, "eventId");
            p.h(str2, "title");
            p.h(str3, "period");
            p.h(str4, "imageUrl");
            this.eventId = str;
            this.eventType = i10;
            this.title = str2;
            this.period = str3;
            this.imageUrl = str4;
            this.isFocus = z10;
        }

        public static /* synthetic */ RankingFocusable copy$default(RankingFocusable rankingFocusable, String str, int i10, String str2, String str3, String str4, boolean z10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = rankingFocusable.eventId;
            }
            if ((i11 & 2) != 0) {
                i10 = rankingFocusable.eventType;
            }
            int i12 = i10;
            if ((i11 & 4) != 0) {
                str2 = rankingFocusable.title;
            }
            String str5 = str2;
            if ((i11 & 8) != 0) {
                str3 = rankingFocusable.period;
            }
            String str6 = str3;
            if ((i11 & 16) != 0) {
                str4 = rankingFocusable.imageUrl;
            }
            String str7 = str4;
            if ((i11 & 32) != 0) {
                z10 = rankingFocusable.isFocus;
            }
            return rankingFocusable.copy(str, i12, str5, str6, str7, z10);
        }

        public final String component1() {
            return this.eventId;
        }

        public final int component2() {
            return this.eventType;
        }

        public final String component3() {
            return this.title;
        }

        public final String component4() {
            return this.period;
        }

        public final String component5() {
            return this.imageUrl;
        }

        public final boolean component6() {
            return this.isFocus;
        }

        public final RankingFocusable copy(String str, int i10, String str2, String str3, String str4, boolean z10) {
            p.h(str, "eventId");
            p.h(str2, "title");
            p.h(str3, "period");
            p.h(str4, "imageUrl");
            return new RankingFocusable(str, i10, str2, str3, str4, z10);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof RankingFocusable) {
                RankingFocusable rankingFocusable = (RankingFocusable) obj;
                return p.c(this.eventId, rankingFocusable.eventId) && this.eventType == rankingFocusable.eventType && p.c(this.title, rankingFocusable.title) && p.c(this.period, rankingFocusable.period) && p.c(this.imageUrl, rankingFocusable.imageUrl) && this.isFocus == rankingFocusable.isFocus;
            }
            return false;
        }

        public final String getEventId() {
            return this.eventId;
        }

        public final int getEventType() {
            return this.eventType;
        }

        public final String getImageUrl() {
            return this.imageUrl;
        }

        public final String getPeriod() {
            return this.period;
        }

        public final String getTitle() {
            return this.title;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int hashCode = ((((((((this.eventId.hashCode() * 31) + Integer.hashCode(this.eventType)) * 31) + this.title.hashCode()) * 31) + this.period.hashCode()) * 31) + this.imageUrl.hashCode()) * 31;
            boolean z10 = this.isFocus;
            int i10 = z10;
            if (z10 != 0) {
                i10 = 1;
            }
            return hashCode + i10;
        }

        public final boolean isFocus() {
            return this.isFocus;
        }

        public final void setFocus(boolean z10) {
            this.isFocus = z10;
        }

        public String toString() {
            return "RankingFocusable(eventId=" + this.eventId + ", eventType=" + this.eventType + ", title=" + this.title + ", period=" + this.period + ", imageUrl=" + this.imageUrl + ", isFocus=" + this.isFocus + ')';
        }
    }

    public RankingFocusableResponse(List<RankingFocusable> list, Status status) {
        p.h(list, "rankings");
        p.h(status, "status");
        this.rankings = list;
        this.status = status;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RankingFocusableResponse copy$default(RankingFocusableResponse rankingFocusableResponse, List list, Status status, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = rankingFocusableResponse.rankings;
        }
        if ((i10 & 2) != 0) {
            status = rankingFocusableResponse.status;
        }
        return rankingFocusableResponse.copy(list, status);
    }

    public final List<RankingFocusable> component1() {
        return this.rankings;
    }

    public final Status component2() {
        return this.status;
    }

    public final RankingFocusableResponse copy(List<RankingFocusable> list, Status status) {
        p.h(list, "rankings");
        p.h(status, "status");
        return new RankingFocusableResponse(list, status);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RankingFocusableResponse) {
            RankingFocusableResponse rankingFocusableResponse = (RankingFocusableResponse) obj;
            return p.c(this.rankings, rankingFocusableResponse.rankings) && p.c(this.status, rankingFocusableResponse.status);
        }
        return false;
    }

    public final List<RankingFocusable> getRankings() {
        return this.rankings;
    }

    public final Status getStatus() {
        return this.status;
    }

    public int hashCode() {
        return (this.rankings.hashCode() * 31) + this.status.hashCode();
    }

    public String toString() {
        return "RankingFocusableResponse(rankings=" + this.rankings + ", status=" + this.status + ')';
    }
}
