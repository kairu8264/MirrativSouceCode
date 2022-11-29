package com.dena.mirrativ.mirrativapi.closet;

import com.dena.mirrativ.mirrativapi.core.Status;
import java.util.List;
import jo.p;
import xn.o;

/* loaded from: classes2.dex */
public final class ClosetsResponse {
    private final int closetSlotNum;
    private final List<Closet> closets;
    private final Status status;

    public ClosetsResponse(List<Closet> list, int i10, Status status) {
        p.h(list, "closets");
        p.h(status, "status");
        this.closets = list;
        this.closetSlotNum = i10;
        this.status = status;
    }

    private final List<Closet> component1() {
        return this.closets;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ClosetsResponse copy$default(ClosetsResponse closetsResponse, List list, int i10, Status status, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = closetsResponse.closets;
        }
        if ((i11 & 2) != 0) {
            i10 = closetsResponse.closetSlotNum;
        }
        if ((i11 & 4) != 0) {
            status = closetsResponse.status;
        }
        return closetsResponse.copy(list, i10, status);
    }

    public final int component2() {
        return this.closetSlotNum;
    }

    public final Status component3() {
        return this.status;
    }

    public final ClosetsResponse copy(List<Closet> list, int i10, Status status) {
        p.h(list, "closets");
        p.h(status, "status");
        return new ClosetsResponse(list, i10, status);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ClosetsResponse) {
            ClosetsResponse closetsResponse = (ClosetsResponse) obj;
            return p.c(this.closets, closetsResponse.closets) && this.closetSlotNum == closetsResponse.closetSlotNum && p.c(this.status, closetsResponse.status);
        }
        return false;
    }

    public final int getClosetSlotNum() {
        return this.closetSlotNum;
    }

    public final List<Closet> getClosets() {
        int i10 = this.closetSlotNum;
        Closet[] closetArr = new Closet[i10];
        int i11 = 0;
        while (i11 < i10) {
            int i12 = i11 + 1;
            closetArr[i11] = new Closet(i12, null, null, null, null, null, false, false, 254, null);
            i11 = i12;
        }
        for (Closet closet : this.closets) {
            closetArr[closet.getClosetId() - 1] = closet;
        }
        return o.d0(closetArr);
    }

    public final Status getStatus() {
        return this.status;
    }

    public int hashCode() {
        return (((this.closets.hashCode() * 31) + Integer.hashCode(this.closetSlotNum)) * 31) + this.status.hashCode();
    }

    public String toString() {
        return "ClosetsResponse(closets=" + this.closets + ", closetSlotNum=" + this.closetSlotNum + ", status=" + this.status + ')';
    }
}
