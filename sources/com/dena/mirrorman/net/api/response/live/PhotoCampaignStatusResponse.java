package com.dena.mirrorman.net.api.response.live;

import com.dena.mirrativ.mirrativapi.core.Status;
import jo.p;

/* loaded from: classes2.dex */
public final class PhotoCampaignStatusResponse {
    public static final int $stable = 8;
    private final PhotoCampaign photoCampaign;
    private final Status status;

    public PhotoCampaignStatusResponse(PhotoCampaign photoCampaign, Status status) {
        p.h(status, "status");
        this.photoCampaign = photoCampaign;
        this.status = status;
    }

    public static /* synthetic */ PhotoCampaignStatusResponse copy$default(PhotoCampaignStatusResponse photoCampaignStatusResponse, PhotoCampaign photoCampaign, Status status, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            photoCampaign = photoCampaignStatusResponse.photoCampaign;
        }
        if ((i10 & 2) != 0) {
            status = photoCampaignStatusResponse.status;
        }
        return photoCampaignStatusResponse.copy(photoCampaign, status);
    }

    public final PhotoCampaign component1() {
        return this.photoCampaign;
    }

    public final Status component2() {
        return this.status;
    }

    public final PhotoCampaignStatusResponse copy(PhotoCampaign photoCampaign, Status status) {
        p.h(status, "status");
        return new PhotoCampaignStatusResponse(photoCampaign, status);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PhotoCampaignStatusResponse) {
            PhotoCampaignStatusResponse photoCampaignStatusResponse = (PhotoCampaignStatusResponse) obj;
            return p.c(this.photoCampaign, photoCampaignStatusResponse.photoCampaign) && p.c(this.status, photoCampaignStatusResponse.status);
        }
        return false;
    }

    public final PhotoCampaign getPhotoCampaign() {
        return this.photoCampaign;
    }

    public final Status getStatus() {
        return this.status;
    }

    public int hashCode() {
        PhotoCampaign photoCampaign = this.photoCampaign;
        return ((photoCampaign == null ? 0 : photoCampaign.hashCode()) * 31) + this.status.hashCode();
    }

    public String toString() {
        return "PhotoCampaignStatusResponse(photoCampaign=" + this.photoCampaign + ", status=" + this.status + ')';
    }
}
