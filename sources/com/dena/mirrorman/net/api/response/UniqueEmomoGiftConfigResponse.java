package com.dena.mirrorman.net.api.response;

import com.dena.mirrativ.mirrativapi.core.Status;
import java.util.List;
import jo.p;

/* loaded from: classes2.dex */
public final class UniqueEmomoGiftConfigResponse {
    public static final int $stable = 8;
    private final List<UniqueEmomoGiftColorConfig> colors;
    private final String headerImageUrl;
    private final List<UniqueEmomoGiftPreset> presets;
    private final UniqueEmomoGiftTypeConfig richGift;
    private final UniqueEmomoGiftTypeConfig stampGift;
    private final Status status;

    public UniqueEmomoGiftConfigResponse(List<UniqueEmomoGiftPreset> list, List<UniqueEmomoGiftColorConfig> list2, String str, UniqueEmomoGiftTypeConfig uniqueEmomoGiftTypeConfig, UniqueEmomoGiftTypeConfig uniqueEmomoGiftTypeConfig2, Status status) {
        p.h(list, "presets");
        p.h(list2, "colors");
        p.h(str, "headerImageUrl");
        p.h(uniqueEmomoGiftTypeConfig, "stampGift");
        p.h(uniqueEmomoGiftTypeConfig2, "richGift");
        p.h(status, "status");
        this.presets = list;
        this.colors = list2;
        this.headerImageUrl = str;
        this.stampGift = uniqueEmomoGiftTypeConfig;
        this.richGift = uniqueEmomoGiftTypeConfig2;
        this.status = status;
    }

    public static /* synthetic */ UniqueEmomoGiftConfigResponse copy$default(UniqueEmomoGiftConfigResponse uniqueEmomoGiftConfigResponse, List list, List list2, String str, UniqueEmomoGiftTypeConfig uniqueEmomoGiftTypeConfig, UniqueEmomoGiftTypeConfig uniqueEmomoGiftTypeConfig2, Status status, int i10, Object obj) {
        List<UniqueEmomoGiftPreset> list3 = list;
        if ((i10 & 1) != 0) {
            list3 = uniqueEmomoGiftConfigResponse.presets;
        }
        List<UniqueEmomoGiftColorConfig> list4 = list2;
        if ((i10 & 2) != 0) {
            list4 = uniqueEmomoGiftConfigResponse.colors;
        }
        List list5 = list4;
        if ((i10 & 4) != 0) {
            str = uniqueEmomoGiftConfigResponse.headerImageUrl;
        }
        String str2 = str;
        if ((i10 & 8) != 0) {
            uniqueEmomoGiftTypeConfig = uniqueEmomoGiftConfigResponse.stampGift;
        }
        UniqueEmomoGiftTypeConfig uniqueEmomoGiftTypeConfig3 = uniqueEmomoGiftTypeConfig;
        if ((i10 & 16) != 0) {
            uniqueEmomoGiftTypeConfig2 = uniqueEmomoGiftConfigResponse.richGift;
        }
        UniqueEmomoGiftTypeConfig uniqueEmomoGiftTypeConfig4 = uniqueEmomoGiftTypeConfig2;
        if ((i10 & 32) != 0) {
            status = uniqueEmomoGiftConfigResponse.status;
        }
        return uniqueEmomoGiftConfigResponse.copy(list3, list5, str2, uniqueEmomoGiftTypeConfig3, uniqueEmomoGiftTypeConfig4, status);
    }

    public final List<UniqueEmomoGiftPreset> component1() {
        return this.presets;
    }

    public final List<UniqueEmomoGiftColorConfig> component2() {
        return this.colors;
    }

    public final String component3() {
        return this.headerImageUrl;
    }

    public final UniqueEmomoGiftTypeConfig component4() {
        return this.stampGift;
    }

    public final UniqueEmomoGiftTypeConfig component5() {
        return this.richGift;
    }

    public final Status component6() {
        return this.status;
    }

    public final UniqueEmomoGiftConfigResponse copy(List<UniqueEmomoGiftPreset> list, List<UniqueEmomoGiftColorConfig> list2, String str, UniqueEmomoGiftTypeConfig uniqueEmomoGiftTypeConfig, UniqueEmomoGiftTypeConfig uniqueEmomoGiftTypeConfig2, Status status) {
        p.h(list, "presets");
        p.h(list2, "colors");
        p.h(str, "headerImageUrl");
        p.h(uniqueEmomoGiftTypeConfig, "stampGift");
        p.h(uniqueEmomoGiftTypeConfig2, "richGift");
        p.h(status, "status");
        return new UniqueEmomoGiftConfigResponse(list, list2, str, uniqueEmomoGiftTypeConfig, uniqueEmomoGiftTypeConfig2, status);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof UniqueEmomoGiftConfigResponse) {
            UniqueEmomoGiftConfigResponse uniqueEmomoGiftConfigResponse = (UniqueEmomoGiftConfigResponse) obj;
            return p.c(this.presets, uniqueEmomoGiftConfigResponse.presets) && p.c(this.colors, uniqueEmomoGiftConfigResponse.colors) && p.c(this.headerImageUrl, uniqueEmomoGiftConfigResponse.headerImageUrl) && p.c(this.stampGift, uniqueEmomoGiftConfigResponse.stampGift) && p.c(this.richGift, uniqueEmomoGiftConfigResponse.richGift) && p.c(this.status, uniqueEmomoGiftConfigResponse.status);
        }
        return false;
    }

    public final List<UniqueEmomoGiftColorConfig> getColors() {
        return this.colors;
    }

    public final String getHeaderImageUrl() {
        return this.headerImageUrl;
    }

    public final List<UniqueEmomoGiftPreset> getPresets() {
        return this.presets;
    }

    public final UniqueEmomoGiftTypeConfig getRichGift() {
        return this.richGift;
    }

    public final UniqueEmomoGiftTypeConfig getStampGift() {
        return this.stampGift;
    }

    public final Status getStatus() {
        return this.status;
    }

    public int hashCode() {
        return (((((((((this.presets.hashCode() * 31) + this.colors.hashCode()) * 31) + this.headerImageUrl.hashCode()) * 31) + this.stampGift.hashCode()) * 31) + this.richGift.hashCode()) * 31) + this.status.hashCode();
    }

    public String toString() {
        return "UniqueEmomoGiftConfigResponse(presets=" + this.presets + ", colors=" + this.colors + ", headerImageUrl=" + this.headerImageUrl + ", stampGift=" + this.stampGift + ", richGift=" + this.richGift + ", status=" + this.status + ')';
    }
}
