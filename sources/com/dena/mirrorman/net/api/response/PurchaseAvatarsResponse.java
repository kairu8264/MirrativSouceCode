package com.dena.mirrorman.net.api.response;

import com.dena.mirrativ.mirrativapi.core.Status;
import java.util.List;
import jo.p;

/* loaded from: classes2.dex */
public final class PurchaseAvatarsResponse {
    public static final int $stable = 8;
    private final List<AvatarPart> avatarParts;
    private final int remainingKandumes;
    private final String resultImageUrl;
    private final String resultMessage;
    private final Status status;

    public PurchaseAvatarsResponse(List<AvatarPart> list, int i10, String str, String str2, Status status) {
        p.h(list, "avatarParts");
        p.h(str, "resultImageUrl");
        p.h(str2, "resultMessage");
        p.h(status, "status");
        this.avatarParts = list;
        this.remainingKandumes = i10;
        this.resultImageUrl = str;
        this.resultMessage = str2;
        this.status = status;
    }

    public static /* synthetic */ PurchaseAvatarsResponse copy$default(PurchaseAvatarsResponse purchaseAvatarsResponse, List list, int i10, String str, String str2, Status status, int i11, Object obj) {
        List<AvatarPart> list2 = list;
        if ((i11 & 1) != 0) {
            list2 = purchaseAvatarsResponse.avatarParts;
        }
        if ((i11 & 2) != 0) {
            i10 = purchaseAvatarsResponse.remainingKandumes;
        }
        int i12 = i10;
        if ((i11 & 4) != 0) {
            str = purchaseAvatarsResponse.resultImageUrl;
        }
        String str3 = str;
        if ((i11 & 8) != 0) {
            str2 = purchaseAvatarsResponse.resultMessage;
        }
        String str4 = str2;
        if ((i11 & 16) != 0) {
            status = purchaseAvatarsResponse.status;
        }
        return purchaseAvatarsResponse.copy(list2, i12, str3, str4, status);
    }

    public final List<AvatarPart> component1() {
        return this.avatarParts;
    }

    public final int component2() {
        return this.remainingKandumes;
    }

    public final String component3() {
        return this.resultImageUrl;
    }

    public final String component4() {
        return this.resultMessage;
    }

    public final Status component5() {
        return this.status;
    }

    public final PurchaseAvatarsResponse copy(List<AvatarPart> list, int i10, String str, String str2, Status status) {
        p.h(list, "avatarParts");
        p.h(str, "resultImageUrl");
        p.h(str2, "resultMessage");
        p.h(status, "status");
        return new PurchaseAvatarsResponse(list, i10, str, str2, status);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PurchaseAvatarsResponse) {
            PurchaseAvatarsResponse purchaseAvatarsResponse = (PurchaseAvatarsResponse) obj;
            return p.c(this.avatarParts, purchaseAvatarsResponse.avatarParts) && this.remainingKandumes == purchaseAvatarsResponse.remainingKandumes && p.c(this.resultImageUrl, purchaseAvatarsResponse.resultImageUrl) && p.c(this.resultMessage, purchaseAvatarsResponse.resultMessage) && p.c(this.status, purchaseAvatarsResponse.status);
        }
        return false;
    }

    public final List<AvatarPart> getAvatarParts() {
        return this.avatarParts;
    }

    public final int getRemainingKandumes() {
        return this.remainingKandumes;
    }

    public final String getResultImageUrl() {
        return this.resultImageUrl;
    }

    public final String getResultMessage() {
        return this.resultMessage;
    }

    public final Status getStatus() {
        return this.status;
    }

    public int hashCode() {
        return (((((((this.avatarParts.hashCode() * 31) + Integer.hashCode(this.remainingKandumes)) * 31) + this.resultImageUrl.hashCode()) * 31) + this.resultMessage.hashCode()) * 31) + this.status.hashCode();
    }

    public String toString() {
        return "PurchaseAvatarsResponse(avatarParts=" + this.avatarParts + ", remainingKandumes=" + this.remainingKandumes + ", resultImageUrl=" + this.resultImageUrl + ", resultMessage=" + this.resultMessage + ", status=" + this.status + ')';
    }
}
