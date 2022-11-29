package com.dena.mirrorman.net.api.response.live;

import java.io.Serializable;
import jo.p;

/* loaded from: classes2.dex */
public final class LinkedLive implements Serializable {
    public static final int $stable = 8;
    private String liveId;
    private String ownerBadgeImageUrl;
    private String ownerId;
    private String ownerImageUrl;
    private String ownerName;

    public LinkedLive(String str, String str2, String str3, String str4, String str5) {
        p.h(str, "liveId");
        p.h(str4, "ownerName");
        this.liveId = str;
        this.ownerImageUrl = str2;
        this.ownerBadgeImageUrl = str3;
        this.ownerName = str4;
        this.ownerId = str5;
    }

    public static /* synthetic */ LinkedLive copy$default(LinkedLive linkedLive, String str, String str2, String str3, String str4, String str5, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = linkedLive.liveId;
        }
        if ((i10 & 2) != 0) {
            str2 = linkedLive.ownerImageUrl;
        }
        String str6 = str2;
        if ((i10 & 4) != 0) {
            str3 = linkedLive.ownerBadgeImageUrl;
        }
        String str7 = str3;
        if ((i10 & 8) != 0) {
            str4 = linkedLive.ownerName;
        }
        String str8 = str4;
        if ((i10 & 16) != 0) {
            str5 = linkedLive.ownerId;
        }
        return linkedLive.copy(str, str6, str7, str8, str5);
    }

    public final String component1() {
        return this.liveId;
    }

    public final String component2() {
        return this.ownerImageUrl;
    }

    public final String component3() {
        return this.ownerBadgeImageUrl;
    }

    public final String component4() {
        return this.ownerName;
    }

    public final String component5() {
        return this.ownerId;
    }

    public final LinkedLive copy(String str, String str2, String str3, String str4, String str5) {
        p.h(str, "liveId");
        p.h(str4, "ownerName");
        return new LinkedLive(str, str2, str3, str4, str5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LinkedLive) {
            LinkedLive linkedLive = (LinkedLive) obj;
            return p.c(this.liveId, linkedLive.liveId) && p.c(this.ownerImageUrl, linkedLive.ownerImageUrl) && p.c(this.ownerBadgeImageUrl, linkedLive.ownerBadgeImageUrl) && p.c(this.ownerName, linkedLive.ownerName) && p.c(this.ownerId, linkedLive.ownerId);
        }
        return false;
    }

    public final String getLiveId() {
        return this.liveId;
    }

    public final String getOwnerBadgeImageUrl() {
        return this.ownerBadgeImageUrl;
    }

    public final String getOwnerId() {
        return this.ownerId;
    }

    public final String getOwnerImageUrl() {
        return this.ownerImageUrl;
    }

    public final String getOwnerName() {
        return this.ownerName;
    }

    public int hashCode() {
        int hashCode = this.liveId.hashCode() * 31;
        String str = this.ownerImageUrl;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.ownerBadgeImageUrl;
        int hashCode3 = (((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.ownerName.hashCode()) * 31;
        String str3 = this.ownerId;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final void setLiveId(String str) {
        p.h(str, "<set-?>");
        this.liveId = str;
    }

    public final void setOwnerBadgeImageUrl(String str) {
        this.ownerBadgeImageUrl = str;
    }

    public final void setOwnerId(String str) {
        this.ownerId = str;
    }

    public final void setOwnerImageUrl(String str) {
        this.ownerImageUrl = str;
    }

    public final void setOwnerName(String str) {
        p.h(str, "<set-?>");
        this.ownerName = str;
    }

    public String toString() {
        return "LinkedLive(liveId=" + this.liveId + ", ownerImageUrl=" + this.ownerImageUrl + ", ownerBadgeImageUrl=" + this.ownerBadgeImageUrl + ", ownerName=" + this.ownerName + ", ownerId=" + this.ownerId + ')';
    }
}
