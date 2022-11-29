package com.dena.mirrativ.mirrativapi.emomo.event.emomoquest;

import jo.p;

/* loaded from: classes2.dex */
public final class EmomoQuestGachaTicket {
    private final int gachaTicketCount;
    private final int giftEventId;
    private final String giftId;

    public EmomoQuestGachaTicket(String str, int i10, int i11) {
        p.h(str, "giftId");
        this.giftId = str;
        this.gachaTicketCount = i10;
        this.giftEventId = i11;
    }

    public static /* synthetic */ EmomoQuestGachaTicket copy$default(EmomoQuestGachaTicket emomoQuestGachaTicket, String str, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = emomoQuestGachaTicket.giftId;
        }
        if ((i12 & 2) != 0) {
            i10 = emomoQuestGachaTicket.gachaTicketCount;
        }
        if ((i12 & 4) != 0) {
            i11 = emomoQuestGachaTicket.giftEventId;
        }
        return emomoQuestGachaTicket.copy(str, i10, i11);
    }

    public final String component1() {
        return this.giftId;
    }

    public final int component2() {
        return this.gachaTicketCount;
    }

    public final int component3() {
        return this.giftEventId;
    }

    public final EmomoQuestGachaTicket copy(String str, int i10, int i11) {
        p.h(str, "giftId");
        return new EmomoQuestGachaTicket(str, i10, i11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof EmomoQuestGachaTicket) {
            EmomoQuestGachaTicket emomoQuestGachaTicket = (EmomoQuestGachaTicket) obj;
            return p.c(this.giftId, emomoQuestGachaTicket.giftId) && this.gachaTicketCount == emomoQuestGachaTicket.gachaTicketCount && this.giftEventId == emomoQuestGachaTicket.giftEventId;
        }
        return false;
    }

    public final int getGachaTicketCount() {
        return this.gachaTicketCount;
    }

    public final int getGiftEventId() {
        return this.giftEventId;
    }

    public final String getGiftId() {
        return this.giftId;
    }

    public int hashCode() {
        return (((this.giftId.hashCode() * 31) + Integer.hashCode(this.gachaTicketCount)) * 31) + Integer.hashCode(this.giftEventId);
    }

    public String toString() {
        return "EmomoQuestGachaTicket(giftId=" + this.giftId + ", gachaTicketCount=" + this.gachaTicketCount + ", giftEventId=" + this.giftEventId + ')';
    }
}
