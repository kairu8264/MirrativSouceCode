package com.dena.mirrorman.net.api.response;

import com.dena.mirrativ.mirrativapi.core.Status;
import jo.p;

/* loaded from: classes2.dex */
public final class GiftCodeSelectionResponse {
    public static final int $stable = 8;
    private final int amount;
    private final String reasonText;
    private final Status status;
    private final int userGiftCodePresentId;

    public GiftCodeSelectionResponse(int i10, Status status, int i11, String str) {
        p.h(status, "status");
        p.h(str, "reasonText");
        this.userGiftCodePresentId = i10;
        this.status = status;
        this.amount = i11;
        this.reasonText = str;
    }

    public static /* synthetic */ GiftCodeSelectionResponse copy$default(GiftCodeSelectionResponse giftCodeSelectionResponse, int i10, Status status, int i11, String str, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = giftCodeSelectionResponse.userGiftCodePresentId;
        }
        if ((i12 & 2) != 0) {
            status = giftCodeSelectionResponse.status;
        }
        if ((i12 & 4) != 0) {
            i11 = giftCodeSelectionResponse.amount;
        }
        if ((i12 & 8) != 0) {
            str = giftCodeSelectionResponse.reasonText;
        }
        return giftCodeSelectionResponse.copy(i10, status, i11, str);
    }

    public final int component1() {
        return this.userGiftCodePresentId;
    }

    public final Status component2() {
        return this.status;
    }

    public final int component3() {
        return this.amount;
    }

    public final String component4() {
        return this.reasonText;
    }

    public final GiftCodeSelectionResponse copy(int i10, Status status, int i11, String str) {
        p.h(status, "status");
        p.h(str, "reasonText");
        return new GiftCodeSelectionResponse(i10, status, i11, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GiftCodeSelectionResponse) {
            GiftCodeSelectionResponse giftCodeSelectionResponse = (GiftCodeSelectionResponse) obj;
            return this.userGiftCodePresentId == giftCodeSelectionResponse.userGiftCodePresentId && p.c(this.status, giftCodeSelectionResponse.status) && this.amount == giftCodeSelectionResponse.amount && p.c(this.reasonText, giftCodeSelectionResponse.reasonText);
        }
        return false;
    }

    public final int getAmount() {
        return this.amount;
    }

    public final String getReasonText() {
        return this.reasonText;
    }

    public final Status getStatus() {
        return this.status;
    }

    public final int getUserGiftCodePresentId() {
        return this.userGiftCodePresentId;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.userGiftCodePresentId) * 31) + this.status.hashCode()) * 31) + Integer.hashCode(this.amount)) * 31) + this.reasonText.hashCode();
    }

    public String toString() {
        return "GiftCodeSelectionResponse(userGiftCodePresentId=" + this.userGiftCodePresentId + ", status=" + this.status + ", amount=" + this.amount + ", reasonText=" + this.reasonText + ')';
    }
}
