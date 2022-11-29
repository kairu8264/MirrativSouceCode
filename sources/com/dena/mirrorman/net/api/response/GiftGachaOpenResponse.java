package com.dena.mirrorman.net.api.response;

import com.dena.mirrativ.mirrativapi.core.Status;
import com.dena.mirrativ.mirrativapi.emomo.event.GiftGachaUser;
import com.dena.mirrativ.mirrativapi.emomo.event.GiftGachaUserBasic;
import java.util.List;
import jo.p;

/* loaded from: classes2.dex */
public final class GiftGachaOpenResponse {
    public static final int $stable = 8;
    private final GiftGachaUser collabUser;
    private final String duplicatedExplainImageUrl;
    private final String elementImageUrl;
    private final String headlineImageUrl;
    private final List<GiftGachaUserBasic> rouletteUsers;
    private final Status status;
    private final GiftGachaUser streamer;
    private final GiftGachaUser viewer;

    public GiftGachaOpenResponse(GiftGachaUser giftGachaUser, GiftGachaUser giftGachaUser2, GiftGachaUser giftGachaUser3, List<GiftGachaUserBasic> list, String str, String str2, String str3, Status status) {
        p.h(giftGachaUser, "streamer");
        p.h(list, "rouletteUsers");
        p.h(str, "duplicatedExplainImageUrl");
        p.h(str2, "headlineImageUrl");
        p.h(str3, "elementImageUrl");
        p.h(status, "status");
        this.streamer = giftGachaUser;
        this.viewer = giftGachaUser2;
        this.collabUser = giftGachaUser3;
        this.rouletteUsers = list;
        this.duplicatedExplainImageUrl = str;
        this.headlineImageUrl = str2;
        this.elementImageUrl = str3;
        this.status = status;
    }

    public final GiftGachaUser component1() {
        return this.streamer;
    }

    public final GiftGachaUser component2() {
        return this.viewer;
    }

    public final GiftGachaUser component3() {
        return this.collabUser;
    }

    public final List<GiftGachaUserBasic> component4() {
        return this.rouletteUsers;
    }

    public final String component5() {
        return this.duplicatedExplainImageUrl;
    }

    public final String component6() {
        return this.headlineImageUrl;
    }

    public final String component7() {
        return this.elementImageUrl;
    }

    public final Status component8() {
        return this.status;
    }

    public final GiftGachaOpenResponse copy(GiftGachaUser giftGachaUser, GiftGachaUser giftGachaUser2, GiftGachaUser giftGachaUser3, List<GiftGachaUserBasic> list, String str, String str2, String str3, Status status) {
        p.h(giftGachaUser, "streamer");
        p.h(list, "rouletteUsers");
        p.h(str, "duplicatedExplainImageUrl");
        p.h(str2, "headlineImageUrl");
        p.h(str3, "elementImageUrl");
        p.h(status, "status");
        return new GiftGachaOpenResponse(giftGachaUser, giftGachaUser2, giftGachaUser3, list, str, str2, str3, status);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GiftGachaOpenResponse) {
            GiftGachaOpenResponse giftGachaOpenResponse = (GiftGachaOpenResponse) obj;
            return p.c(this.streamer, giftGachaOpenResponse.streamer) && p.c(this.viewer, giftGachaOpenResponse.viewer) && p.c(this.collabUser, giftGachaOpenResponse.collabUser) && p.c(this.rouletteUsers, giftGachaOpenResponse.rouletteUsers) && p.c(this.duplicatedExplainImageUrl, giftGachaOpenResponse.duplicatedExplainImageUrl) && p.c(this.headlineImageUrl, giftGachaOpenResponse.headlineImageUrl) && p.c(this.elementImageUrl, giftGachaOpenResponse.elementImageUrl) && p.c(this.status, giftGachaOpenResponse.status);
        }
        return false;
    }

    public final GiftGachaUser getCollabUser() {
        return this.collabUser;
    }

    public final String getDuplicatedExplainImageUrl() {
        return this.duplicatedExplainImageUrl;
    }

    public final String getElementImageUrl() {
        return this.elementImageUrl;
    }

    public final String getHeadlineImageUrl() {
        return this.headlineImageUrl;
    }

    public final List<GiftGachaUserBasic> getRouletteUsers() {
        return this.rouletteUsers;
    }

    public final Status getStatus() {
        return this.status;
    }

    public final GiftGachaUser getStreamer() {
        return this.streamer;
    }

    public final GiftGachaUser getViewer() {
        return this.viewer;
    }

    public int hashCode() {
        int hashCode = this.streamer.hashCode() * 31;
        GiftGachaUser giftGachaUser = this.viewer;
        int hashCode2 = (hashCode + (giftGachaUser == null ? 0 : giftGachaUser.hashCode())) * 31;
        GiftGachaUser giftGachaUser2 = this.collabUser;
        return ((((((((((hashCode2 + (giftGachaUser2 != null ? giftGachaUser2.hashCode() : 0)) * 31) + this.rouletteUsers.hashCode()) * 31) + this.duplicatedExplainImageUrl.hashCode()) * 31) + this.headlineImageUrl.hashCode()) * 31) + this.elementImageUrl.hashCode()) * 31) + this.status.hashCode();
    }

    public String toString() {
        return "GiftGachaOpenResponse(streamer=" + this.streamer + ", viewer=" + this.viewer + ", collabUser=" + this.collabUser + ", rouletteUsers=" + this.rouletteUsers + ", duplicatedExplainImageUrl=" + this.duplicatedExplainImageUrl + ", headlineImageUrl=" + this.headlineImageUrl + ", elementImageUrl=" + this.elementImageUrl + ", status=" + this.status + ')';
    }
}
