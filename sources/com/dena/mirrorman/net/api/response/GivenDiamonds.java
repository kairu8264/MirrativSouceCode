package com.dena.mirrorman.net.api.response;

import jo.p;
import ym.c;

/* loaded from: classes2.dex */
public final class GivenDiamonds {
    public static final int $stable = 0;
    @c("received_diamonds")
    private final Long receivedDiamonds;

    public GivenDiamonds(Long l10) {
        this.receivedDiamonds = l10;
    }

    public static /* synthetic */ GivenDiamonds copy$default(GivenDiamonds givenDiamonds, Long l10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            l10 = givenDiamonds.receivedDiamonds;
        }
        return givenDiamonds.copy(l10);
    }

    public final Long component1() {
        return this.receivedDiamonds;
    }

    public final GivenDiamonds copy(Long l10) {
        return new GivenDiamonds(l10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GivenDiamonds) && p.c(this.receivedDiamonds, ((GivenDiamonds) obj).receivedDiamonds);
    }

    public final Long getReceivedDiamonds() {
        return this.receivedDiamonds;
    }

    public int hashCode() {
        Long l10 = this.receivedDiamonds;
        if (l10 == null) {
            return 0;
        }
        return l10.hashCode();
    }

    public String toString() {
        return "GivenDiamonds(receivedDiamonds=" + this.receivedDiamonds + ')';
    }
}
