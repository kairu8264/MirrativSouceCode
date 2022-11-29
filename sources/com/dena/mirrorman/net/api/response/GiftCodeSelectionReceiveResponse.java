package com.dena.mirrorman.net.api.response;

import com.dena.mirrativ.mirrativapi.core.Status;
import jo.p;

/* loaded from: classes2.dex */
public final class GiftCodeSelectionReceiveResponse {
    public static final int $stable = 8;
    private final int codeType;
    private final Status status;
    private final int userGiftCodePresentId;

    public GiftCodeSelectionReceiveResponse(Status status, int i10, int i11) {
        p.h(status, "status");
        this.status = status;
        this.userGiftCodePresentId = i10;
        this.codeType = i11;
    }

    public static /* synthetic */ GiftCodeSelectionReceiveResponse copy$default(GiftCodeSelectionReceiveResponse giftCodeSelectionReceiveResponse, Status status, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            status = giftCodeSelectionReceiveResponse.status;
        }
        if ((i12 & 2) != 0) {
            i10 = giftCodeSelectionReceiveResponse.userGiftCodePresentId;
        }
        if ((i12 & 4) != 0) {
            i11 = giftCodeSelectionReceiveResponse.codeType;
        }
        return giftCodeSelectionReceiveResponse.copy(status, i10, i11);
    }

    public final Status component1() {
        return this.status;
    }

    public final int component2() {
        return this.userGiftCodePresentId;
    }

    public final int component3() {
        return this.codeType;
    }

    public final GiftCodeSelectionReceiveResponse copy(Status status, int i10, int i11) {
        p.h(status, "status");
        return new GiftCodeSelectionReceiveResponse(status, i10, i11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GiftCodeSelectionReceiveResponse) {
            GiftCodeSelectionReceiveResponse giftCodeSelectionReceiveResponse = (GiftCodeSelectionReceiveResponse) obj;
            return p.c(this.status, giftCodeSelectionReceiveResponse.status) && this.userGiftCodePresentId == giftCodeSelectionReceiveResponse.userGiftCodePresentId && this.codeType == giftCodeSelectionReceiveResponse.codeType;
        }
        return false;
    }

    public final int getCodeType() {
        return this.codeType;
    }

    public final Status getStatus() {
        return this.status;
    }

    public final int getUserGiftCodePresentId() {
        return this.userGiftCodePresentId;
    }

    public int hashCode() {
        return (((this.status.hashCode() * 31) + Integer.hashCode(this.userGiftCodePresentId)) * 31) + Integer.hashCode(this.codeType);
    }

    public String toString() {
        return "GiftCodeSelectionReceiveResponse(status=" + this.status + ", userGiftCodePresentId=" + this.userGiftCodePresentId + ", codeType=" + this.codeType + ')';
    }
}
