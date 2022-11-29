package com.dena.mirrorman.net.api.response.live;

import com.dena.mirrativ.mirrativapi.core.Status;
import jo.p;

/* loaded from: classes2.dex */
public final class PhotoCampaignPostStatusResponse {
    public static final int $stable = 8;
    private final int coinNum;
    private final Status status;

    public PhotoCampaignPostStatusResponse(int i10, Status status) {
        p.h(status, "status");
        this.coinNum = i10;
        this.status = status;
    }

    public static /* synthetic */ PhotoCampaignPostStatusResponse copy$default(PhotoCampaignPostStatusResponse photoCampaignPostStatusResponse, int i10, Status status, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = photoCampaignPostStatusResponse.coinNum;
        }
        if ((i11 & 2) != 0) {
            status = photoCampaignPostStatusResponse.status;
        }
        return photoCampaignPostStatusResponse.copy(i10, status);
    }

    public final int component1() {
        return this.coinNum;
    }

    public final Status component2() {
        return this.status;
    }

    public final PhotoCampaignPostStatusResponse copy(int i10, Status status) {
        p.h(status, "status");
        return new PhotoCampaignPostStatusResponse(i10, status);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PhotoCampaignPostStatusResponse) {
            PhotoCampaignPostStatusResponse photoCampaignPostStatusResponse = (PhotoCampaignPostStatusResponse) obj;
            return this.coinNum == photoCampaignPostStatusResponse.coinNum && p.c(this.status, photoCampaignPostStatusResponse.status);
        }
        return false;
    }

    public final int getCoinNum() {
        return this.coinNum;
    }

    public final Status getStatus() {
        return this.status;
    }

    public int hashCode() {
        return (Integer.hashCode(this.coinNum) * 31) + this.status.hashCode();
    }

    public String toString() {
        return "PhotoCampaignPostStatusResponse(coinNum=" + this.coinNum + ", status=" + this.status + ')';
    }
}
