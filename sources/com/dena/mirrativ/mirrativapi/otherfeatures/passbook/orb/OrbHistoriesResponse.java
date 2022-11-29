package com.dena.mirrativ.mirrativapi.otherfeatures.passbook.orb;

import com.dena.mirrativ.mirrativapi.core.BooleanTypeAdapter;
import com.dena.mirrativ.mirrativapi.core.Status;
import com.dena.mirrorman.clientlog.logs.MRLog;
import java.util.List;
import jo.p;
import ym.b;
import ym.c;

/* loaded from: classes2.dex */
public final class OrbHistoriesResponse {
    private final int currentPage;
    private final String description;
    private final List<ExchangeDescriptionText> exchangeDescriptionText;
    private final String expireMessage;
    private final int expireMessageStyle;
    @b(BooleanTypeAdapter.class)
    private final boolean hasRightExchangeToGiftCode;
    @b(BooleanTypeAdapter.class)
    private final boolean hasRightExchangeToMoney;
    private final int nextPage;
    @c("diamond")
    private final long orb;
    @c("history")
    private final List<OrbHistory> orbHistories;
    private final Status status;

    public OrbHistoriesResponse(long j10, int i10, boolean z10, boolean z11, String str, List<OrbHistory> list, int i11, int i12, String str2, List<ExchangeDescriptionText> list2, Status status) {
        p.h(list, "orbHistories");
        p.h(str2, MRLog.PAYLOAD_KEY_DESCRIPTION);
        p.h(list2, "exchangeDescriptionText");
        p.h(status, "status");
        this.orb = j10;
        this.expireMessageStyle = i10;
        this.hasRightExchangeToMoney = z10;
        this.hasRightExchangeToGiftCode = z11;
        this.expireMessage = str;
        this.orbHistories = list;
        this.nextPage = i11;
        this.currentPage = i12;
        this.description = str2;
        this.exchangeDescriptionText = list2;
        this.status = status;
    }

    public final long component1() {
        return this.orb;
    }

    public final List<ExchangeDescriptionText> component10() {
        return this.exchangeDescriptionText;
    }

    public final Status component11() {
        return this.status;
    }

    public final int component2() {
        return this.expireMessageStyle;
    }

    public final boolean component3() {
        return this.hasRightExchangeToMoney;
    }

    public final boolean component4() {
        return this.hasRightExchangeToGiftCode;
    }

    public final String component5() {
        return this.expireMessage;
    }

    public final List<OrbHistory> component6() {
        return this.orbHistories;
    }

    public final int component7() {
        return this.nextPage;
    }

    public final int component8() {
        return this.currentPage;
    }

    public final String component9() {
        return this.description;
    }

    public final OrbHistoriesResponse copy(long j10, int i10, boolean z10, boolean z11, String str, List<OrbHistory> list, int i11, int i12, String str2, List<ExchangeDescriptionText> list2, Status status) {
        p.h(list, "orbHistories");
        p.h(str2, MRLog.PAYLOAD_KEY_DESCRIPTION);
        p.h(list2, "exchangeDescriptionText");
        p.h(status, "status");
        return new OrbHistoriesResponse(j10, i10, z10, z11, str, list, i11, i12, str2, list2, status);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OrbHistoriesResponse) {
            OrbHistoriesResponse orbHistoriesResponse = (OrbHistoriesResponse) obj;
            return this.orb == orbHistoriesResponse.orb && this.expireMessageStyle == orbHistoriesResponse.expireMessageStyle && this.hasRightExchangeToMoney == orbHistoriesResponse.hasRightExchangeToMoney && this.hasRightExchangeToGiftCode == orbHistoriesResponse.hasRightExchangeToGiftCode && p.c(this.expireMessage, orbHistoriesResponse.expireMessage) && p.c(this.orbHistories, orbHistoriesResponse.orbHistories) && this.nextPage == orbHistoriesResponse.nextPage && this.currentPage == orbHistoriesResponse.currentPage && p.c(this.description, orbHistoriesResponse.description) && p.c(this.exchangeDescriptionText, orbHistoriesResponse.exchangeDescriptionText) && p.c(this.status, orbHistoriesResponse.status);
        }
        return false;
    }

    public final int getCurrentPage() {
        return this.currentPage;
    }

    public final String getDescription() {
        return this.description;
    }

    public final List<ExchangeDescriptionText> getExchangeDescriptionText() {
        return this.exchangeDescriptionText;
    }

    public final String getExpireMessage() {
        return this.expireMessage;
    }

    public final int getExpireMessageStyle() {
        return this.expireMessageStyle;
    }

    public final boolean getHasRightExchangeToGiftCode() {
        return this.hasRightExchangeToGiftCode;
    }

    public final boolean getHasRightExchangeToMoney() {
        return this.hasRightExchangeToMoney;
    }

    public final int getNextPage() {
        return this.nextPage;
    }

    public final long getOrb() {
        return this.orb;
    }

    public final List<OrbHistory> getOrbHistories() {
        return this.orbHistories;
    }

    public final Status getStatus() {
        return this.status;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((Long.hashCode(this.orb) * 31) + Integer.hashCode(this.expireMessageStyle)) * 31;
        boolean z10 = this.hasRightExchangeToMoney;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        int i11 = (hashCode + i10) * 31;
        boolean z11 = this.hasRightExchangeToGiftCode;
        int i12 = (i11 + (z11 ? 1 : z11 ? 1 : 0)) * 31;
        String str = this.expireMessage;
        return ((((((((((((i12 + (str == null ? 0 : str.hashCode())) * 31) + this.orbHistories.hashCode()) * 31) + Integer.hashCode(this.nextPage)) * 31) + Integer.hashCode(this.currentPage)) * 31) + this.description.hashCode()) * 31) + this.exchangeDescriptionText.hashCode()) * 31) + this.status.hashCode();
    }

    public String toString() {
        return "OrbHistoriesResponse(orb=" + this.orb + ", expireMessageStyle=" + this.expireMessageStyle + ", hasRightExchangeToMoney=" + this.hasRightExchangeToMoney + ", hasRightExchangeToGiftCode=" + this.hasRightExchangeToGiftCode + ", expireMessage=" + this.expireMessage + ", orbHistories=" + this.orbHistories + ", nextPage=" + this.nextPage + ", currentPage=" + this.currentPage + ", description=" + this.description + ", exchangeDescriptionText=" + this.exchangeDescriptionText + ", status=" + this.status + ')';
    }
}
