package com.dena.mirrativ.mirrativapi.emomo.event.emomoquest;

import com.dena.mirrativ.mirrativapi.core.Status;
import java.io.Serializable;
import java.util.List;
import jo.p;

/* loaded from: classes2.dex */
public final class EmomoQuestGiftGachaResultsResponse implements Serializable {
    private final String elementImageUrl;
    private final int giftGachaCount;
    private final String headlineImageUrl;
    private final List<EmomoQuestGiftGachaResult> results;
    private final String specialEffectSpan;
    private final Status status;

    public EmomoQuestGiftGachaResultsResponse(String str, String str2, String str3, int i10, List<EmomoQuestGiftGachaResult> list, Status status) {
        p.h(str, "headlineImageUrl");
        p.h(str2, "elementImageUrl");
        p.h(list, "results");
        p.h(status, "status");
        this.headlineImageUrl = str;
        this.elementImageUrl = str2;
        this.specialEffectSpan = str3;
        this.giftGachaCount = i10;
        this.results = list;
        this.status = status;
    }

    public static /* synthetic */ EmomoQuestGiftGachaResultsResponse copy$default(EmomoQuestGiftGachaResultsResponse emomoQuestGiftGachaResultsResponse, String str, String str2, String str3, int i10, List list, Status status, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = emomoQuestGiftGachaResultsResponse.headlineImageUrl;
        }
        if ((i11 & 2) != 0) {
            str2 = emomoQuestGiftGachaResultsResponse.elementImageUrl;
        }
        String str4 = str2;
        if ((i11 & 4) != 0) {
            str3 = emomoQuestGiftGachaResultsResponse.specialEffectSpan;
        }
        String str5 = str3;
        if ((i11 & 8) != 0) {
            i10 = emomoQuestGiftGachaResultsResponse.giftGachaCount;
        }
        int i12 = i10;
        List<EmomoQuestGiftGachaResult> list2 = list;
        if ((i11 & 16) != 0) {
            list2 = emomoQuestGiftGachaResultsResponse.results;
        }
        List list3 = list2;
        if ((i11 & 32) != 0) {
            status = emomoQuestGiftGachaResultsResponse.status;
        }
        return emomoQuestGiftGachaResultsResponse.copy(str, str4, str5, i12, list3, status);
    }

    public final String component1() {
        return this.headlineImageUrl;
    }

    public final String component2() {
        return this.elementImageUrl;
    }

    public final String component3() {
        return this.specialEffectSpan;
    }

    public final int component4() {
        return this.giftGachaCount;
    }

    public final List<EmomoQuestGiftGachaResult> component5() {
        return this.results;
    }

    public final Status component6() {
        return this.status;
    }

    public final EmomoQuestGiftGachaResultsResponse copy(String str, String str2, String str3, int i10, List<EmomoQuestGiftGachaResult> list, Status status) {
        p.h(str, "headlineImageUrl");
        p.h(str2, "elementImageUrl");
        p.h(list, "results");
        p.h(status, "status");
        return new EmomoQuestGiftGachaResultsResponse(str, str2, str3, i10, list, status);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof EmomoQuestGiftGachaResultsResponse) {
            EmomoQuestGiftGachaResultsResponse emomoQuestGiftGachaResultsResponse = (EmomoQuestGiftGachaResultsResponse) obj;
            return p.c(this.headlineImageUrl, emomoQuestGiftGachaResultsResponse.headlineImageUrl) && p.c(this.elementImageUrl, emomoQuestGiftGachaResultsResponse.elementImageUrl) && p.c(this.specialEffectSpan, emomoQuestGiftGachaResultsResponse.specialEffectSpan) && this.giftGachaCount == emomoQuestGiftGachaResultsResponse.giftGachaCount && p.c(this.results, emomoQuestGiftGachaResultsResponse.results) && p.c(this.status, emomoQuestGiftGachaResultsResponse.status);
        }
        return false;
    }

    public final String getElementImageUrl() {
        return this.elementImageUrl;
    }

    public final int getGiftGachaCount() {
        return this.giftGachaCount;
    }

    public final String getHeadlineImageUrl() {
        return this.headlineImageUrl;
    }

    public final List<EmomoQuestGiftGachaResult> getResults() {
        return this.results;
    }

    public final String getSpecialEffectSpan() {
        return this.specialEffectSpan;
    }

    public final Status getStatus() {
        return this.status;
    }

    public int hashCode() {
        int hashCode = ((this.headlineImageUrl.hashCode() * 31) + this.elementImageUrl.hashCode()) * 31;
        String str = this.specialEffectSpan;
        return ((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + Integer.hashCode(this.giftGachaCount)) * 31) + this.results.hashCode()) * 31) + this.status.hashCode();
    }

    public String toString() {
        return "EmomoQuestGiftGachaResultsResponse(headlineImageUrl=" + this.headlineImageUrl + ", elementImageUrl=" + this.elementImageUrl + ", specialEffectSpan=" + this.specialEffectSpan + ", giftGachaCount=" + this.giftGachaCount + ", results=" + this.results + ", status=" + this.status + ')';
    }
}
