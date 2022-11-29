package com.dena.mirrativ.mirrativapi.emomo.event.emomoquest;

import com.dena.mirrativ.mirrativapi.core.Status;
import jo.p;

/* loaded from: classes2.dex */
public final class EmomoQuestOpenGiftEventResponse {
    private final int giftEventId;
    private final boolean isOpenEvent;
    private final Status status;

    public EmomoQuestOpenGiftEventResponse(int i10, boolean z10, Status status) {
        p.h(status, "status");
        this.giftEventId = i10;
        this.isOpenEvent = z10;
        this.status = status;
    }

    public static /* synthetic */ EmomoQuestOpenGiftEventResponse copy$default(EmomoQuestOpenGiftEventResponse emomoQuestOpenGiftEventResponse, int i10, boolean z10, Status status, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = emomoQuestOpenGiftEventResponse.giftEventId;
        }
        if ((i11 & 2) != 0) {
            z10 = emomoQuestOpenGiftEventResponse.isOpenEvent;
        }
        if ((i11 & 4) != 0) {
            status = emomoQuestOpenGiftEventResponse.status;
        }
        return emomoQuestOpenGiftEventResponse.copy(i10, z10, status);
    }

    public final int component1() {
        return this.giftEventId;
    }

    public final boolean component2() {
        return this.isOpenEvent;
    }

    public final Status component3() {
        return this.status;
    }

    public final EmomoQuestOpenGiftEventResponse copy(int i10, boolean z10, Status status) {
        p.h(status, "status");
        return new EmomoQuestOpenGiftEventResponse(i10, z10, status);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof EmomoQuestOpenGiftEventResponse) {
            EmomoQuestOpenGiftEventResponse emomoQuestOpenGiftEventResponse = (EmomoQuestOpenGiftEventResponse) obj;
            return this.giftEventId == emomoQuestOpenGiftEventResponse.giftEventId && this.isOpenEvent == emomoQuestOpenGiftEventResponse.isOpenEvent && p.c(this.status, emomoQuestOpenGiftEventResponse.status);
        }
        return false;
    }

    public final int getGiftEventId() {
        return this.giftEventId;
    }

    public final Status getStatus() {
        return this.status;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = Integer.hashCode(this.giftEventId) * 31;
        boolean z10 = this.isOpenEvent;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        return ((hashCode + i10) * 31) + this.status.hashCode();
    }

    public final boolean isOpenEvent() {
        return this.isOpenEvent;
    }

    public String toString() {
        return "EmomoQuestOpenGiftEventResponse(giftEventId=" + this.giftEventId + ", isOpenEvent=" + this.isOpenEvent + ", status=" + this.status + ')';
    }
}
