package com.dena.mirrorman.net.api.response;

import com.dena.mirrativ.mirrativapi.core.Status;
import java.util.List;
import jo.p;

/* loaded from: classes2.dex */
public final class UniqueEmomoGiftSlotsResponse {
    public static final int $stable = 8;
    private final List<UniqueEmomoGiftSlot> slots;
    private final Status status;

    public UniqueEmomoGiftSlotsResponse(List<UniqueEmomoGiftSlot> list, Status status) {
        p.h(list, "slots");
        p.h(status, "status");
        this.slots = list;
        this.status = status;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UniqueEmomoGiftSlotsResponse copy$default(UniqueEmomoGiftSlotsResponse uniqueEmomoGiftSlotsResponse, List list, Status status, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = uniqueEmomoGiftSlotsResponse.slots;
        }
        if ((i10 & 2) != 0) {
            status = uniqueEmomoGiftSlotsResponse.status;
        }
        return uniqueEmomoGiftSlotsResponse.copy(list, status);
    }

    public final List<UniqueEmomoGiftSlot> component1() {
        return this.slots;
    }

    public final Status component2() {
        return this.status;
    }

    public final UniqueEmomoGiftSlotsResponse copy(List<UniqueEmomoGiftSlot> list, Status status) {
        p.h(list, "slots");
        p.h(status, "status");
        return new UniqueEmomoGiftSlotsResponse(list, status);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof UniqueEmomoGiftSlotsResponse) {
            UniqueEmomoGiftSlotsResponse uniqueEmomoGiftSlotsResponse = (UniqueEmomoGiftSlotsResponse) obj;
            return p.c(this.slots, uniqueEmomoGiftSlotsResponse.slots) && p.c(this.status, uniqueEmomoGiftSlotsResponse.status);
        }
        return false;
    }

    public final List<UniqueEmomoGiftSlot> getSlots() {
        return this.slots;
    }

    public final Status getStatus() {
        return this.status;
    }

    public int hashCode() {
        return (this.slots.hashCode() * 31) + this.status.hashCode();
    }

    public String toString() {
        return "UniqueEmomoGiftSlotsResponse(slots=" + this.slots + ", status=" + this.status + ')';
    }
}
