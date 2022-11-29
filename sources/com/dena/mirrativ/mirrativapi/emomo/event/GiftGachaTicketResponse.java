package com.dena.mirrativ.mirrativapi.emomo.event;

import com.dena.mirrativ.mirrativapi.core.Status;
import jo.p;

/* loaded from: classes2.dex */
public final class GiftGachaTicketResponse {
    private final int gachaTicketCount;
    private final Status status;

    public GiftGachaTicketResponse(int i10, Status status) {
        p.h(status, "status");
        this.gachaTicketCount = i10;
        this.status = status;
    }

    public static /* synthetic */ GiftGachaTicketResponse copy$default(GiftGachaTicketResponse giftGachaTicketResponse, int i10, Status status, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = giftGachaTicketResponse.gachaTicketCount;
        }
        if ((i11 & 2) != 0) {
            status = giftGachaTicketResponse.status;
        }
        return giftGachaTicketResponse.copy(i10, status);
    }

    public final int component1() {
        return this.gachaTicketCount;
    }

    public final Status component2() {
        return this.status;
    }

    public final GiftGachaTicketResponse copy(int i10, Status status) {
        p.h(status, "status");
        return new GiftGachaTicketResponse(i10, status);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GiftGachaTicketResponse) {
            GiftGachaTicketResponse giftGachaTicketResponse = (GiftGachaTicketResponse) obj;
            return this.gachaTicketCount == giftGachaTicketResponse.gachaTicketCount && p.c(this.status, giftGachaTicketResponse.status);
        }
        return false;
    }

    public final int getGachaTicketCount() {
        return this.gachaTicketCount;
    }

    public final Status getStatus() {
        return this.status;
    }

    public int hashCode() {
        return (Integer.hashCode(this.gachaTicketCount) * 31) + this.status.hashCode();
    }

    public String toString() {
        return "GiftGachaTicketResponse(gachaTicketCount=" + this.gachaTicketCount + ", status=" + this.status + ')';
    }
}
