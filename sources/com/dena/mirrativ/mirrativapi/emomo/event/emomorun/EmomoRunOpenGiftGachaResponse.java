package com.dena.mirrativ.mirrativapi.emomo.event.emomorun;

import com.dena.mirrativ.mirrativapi.core.Status;
import java.io.Serializable;
import java.util.List;
import jo.p;

/* loaded from: classes2.dex */
public final class EmomoRunOpenGiftGachaResponse implements Serializable {
    private final String duplicatedExplainImageUrl;
    private final String giftGachaImageUrl;
    private final int remainingGachaCount;
    private final List<EmomoRunGiftGachaResult> results;
    private final Status status;

    public EmomoRunOpenGiftGachaResponse(String str, String str2, int i10, List<EmomoRunGiftGachaResult> list, Status status) {
        p.h(str, "giftGachaImageUrl");
        p.h(str2, "duplicatedExplainImageUrl");
        p.h(list, "results");
        p.h(status, "status");
        this.giftGachaImageUrl = str;
        this.duplicatedExplainImageUrl = str2;
        this.remainingGachaCount = i10;
        this.results = list;
        this.status = status;
    }

    public static /* synthetic */ EmomoRunOpenGiftGachaResponse copy$default(EmomoRunOpenGiftGachaResponse emomoRunOpenGiftGachaResponse, String str, String str2, int i10, List list, Status status, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = emomoRunOpenGiftGachaResponse.giftGachaImageUrl;
        }
        if ((i11 & 2) != 0) {
            str2 = emomoRunOpenGiftGachaResponse.duplicatedExplainImageUrl;
        }
        String str3 = str2;
        if ((i11 & 4) != 0) {
            i10 = emomoRunOpenGiftGachaResponse.remainingGachaCount;
        }
        int i12 = i10;
        List<EmomoRunGiftGachaResult> list2 = list;
        if ((i11 & 8) != 0) {
            list2 = emomoRunOpenGiftGachaResponse.results;
        }
        List list3 = list2;
        if ((i11 & 16) != 0) {
            status = emomoRunOpenGiftGachaResponse.status;
        }
        return emomoRunOpenGiftGachaResponse.copy(str, str3, i12, list3, status);
    }

    public final String component1() {
        return this.giftGachaImageUrl;
    }

    public final String component2() {
        return this.duplicatedExplainImageUrl;
    }

    public final int component3() {
        return this.remainingGachaCount;
    }

    public final List<EmomoRunGiftGachaResult> component4() {
        return this.results;
    }

    public final Status component5() {
        return this.status;
    }

    public final EmomoRunOpenGiftGachaResponse copy(String str, String str2, int i10, List<EmomoRunGiftGachaResult> list, Status status) {
        p.h(str, "giftGachaImageUrl");
        p.h(str2, "duplicatedExplainImageUrl");
        p.h(list, "results");
        p.h(status, "status");
        return new EmomoRunOpenGiftGachaResponse(str, str2, i10, list, status);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof EmomoRunOpenGiftGachaResponse) {
            EmomoRunOpenGiftGachaResponse emomoRunOpenGiftGachaResponse = (EmomoRunOpenGiftGachaResponse) obj;
            return p.c(this.giftGachaImageUrl, emomoRunOpenGiftGachaResponse.giftGachaImageUrl) && p.c(this.duplicatedExplainImageUrl, emomoRunOpenGiftGachaResponse.duplicatedExplainImageUrl) && this.remainingGachaCount == emomoRunOpenGiftGachaResponse.remainingGachaCount && p.c(this.results, emomoRunOpenGiftGachaResponse.results) && p.c(this.status, emomoRunOpenGiftGachaResponse.status);
        }
        return false;
    }

    public final String getDuplicatedExplainImageUrl() {
        return this.duplicatedExplainImageUrl;
    }

    public final String getGiftGachaImageUrl() {
        return this.giftGachaImageUrl;
    }

    public final int getRemainingGachaCount() {
        return this.remainingGachaCount;
    }

    public final List<EmomoRunGiftGachaResult> getResults() {
        return this.results;
    }

    public final Status getStatus() {
        return this.status;
    }

    public int hashCode() {
        return (((((((this.giftGachaImageUrl.hashCode() * 31) + this.duplicatedExplainImageUrl.hashCode()) * 31) + Integer.hashCode(this.remainingGachaCount)) * 31) + this.results.hashCode()) * 31) + this.status.hashCode();
    }

    public String toString() {
        return "EmomoRunOpenGiftGachaResponse(giftGachaImageUrl=" + this.giftGachaImageUrl + ", duplicatedExplainImageUrl=" + this.duplicatedExplainImageUrl + ", remainingGachaCount=" + this.remainingGachaCount + ", results=" + this.results + ", status=" + this.status + ')';
    }
}
