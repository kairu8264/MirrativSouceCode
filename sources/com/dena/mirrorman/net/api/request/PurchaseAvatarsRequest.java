package com.dena.mirrorman.net.api.request;

import java.util.List;
import jo.p;
import ym.c;

/* loaded from: classes2.dex */
public final class PurchaseAvatarsRequest {
    public static final int $stable = 8;
    @c("avatar_part_ids")
    private final List<Integer> avatarPartIds;

    public PurchaseAvatarsRequest(List<Integer> list) {
        p.h(list, "avatarPartIds");
        this.avatarPartIds = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PurchaseAvatarsRequest copy$default(PurchaseAvatarsRequest purchaseAvatarsRequest, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = purchaseAvatarsRequest.avatarPartIds;
        }
        return purchaseAvatarsRequest.copy(list);
    }

    public final List<Integer> component1() {
        return this.avatarPartIds;
    }

    public final PurchaseAvatarsRequest copy(List<Integer> list) {
        p.h(list, "avatarPartIds");
        return new PurchaseAvatarsRequest(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PurchaseAvatarsRequest) && p.c(this.avatarPartIds, ((PurchaseAvatarsRequest) obj).avatarPartIds);
    }

    public final List<Integer> getAvatarPartIds() {
        return this.avatarPartIds;
    }

    public int hashCode() {
        return this.avatarPartIds.hashCode();
    }

    public String toString() {
        return "PurchaseAvatarsRequest(avatarPartIds=" + this.avatarPartIds + ')';
    }
}
