package com.dena.mirrorman.net.api.response;

import com.dena.mirrativ.mirrativapi.core.Status;
import com.dena.mirrorman.net.api.response.Gift;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.List;
import jo.p;

/* loaded from: classes2.dex */
public final class GiftPanelsResponse {
    public static final int $stable = 8;
    private final int defaultIndex;
    private final List<PanelParams> panels;
    private Status status;

    /* loaded from: classes2.dex */
    public static final class PanelParams {
        public static final int $stable = 8;
        private final GiftPanelBanner banner;
        private final String bonusImageUrl;
        private final String eventIconUrl;
        private final List<Gift.GiftParams> gifts;
        private final String iconUrl;

        /* renamed from: id  reason: collision with root package name */
        private final String f26151id;
        private final boolean isFocus;
        private final String liveGameId;
        private final int reasonId;
        private final String title;
        private final int type;

        public PanelParams(String str, int i10, int i11, String str2, String str3, String str4, String str5, GiftPanelBanner giftPanelBanner, List<Gift.GiftParams> list, String str6, boolean z10) {
            p.h(str, TtmlNode.ATTR_ID);
            p.h(str2, "title");
            p.h(str3, "iconUrl");
            p.h(str4, "bonusImageUrl");
            p.h(str5, "eventIconUrl");
            p.h(list, "gifts");
            p.h(str6, "liveGameId");
            this.f26151id = str;
            this.type = i10;
            this.reasonId = i11;
            this.title = str2;
            this.iconUrl = str3;
            this.bonusImageUrl = str4;
            this.eventIconUrl = str5;
            this.banner = giftPanelBanner;
            this.gifts = list;
            this.liveGameId = str6;
            this.isFocus = z10;
        }

        public final String component1() {
            return this.f26151id;
        }

        public final String component10() {
            return this.liveGameId;
        }

        public final boolean component11() {
            return this.isFocus;
        }

        public final int component2() {
            return this.type;
        }

        public final int component3() {
            return this.reasonId;
        }

        public final String component4() {
            return this.title;
        }

        public final String component5() {
            return this.iconUrl;
        }

        public final String component6() {
            return this.bonusImageUrl;
        }

        public final String component7() {
            return this.eventIconUrl;
        }

        public final GiftPanelBanner component8() {
            return this.banner;
        }

        public final List<Gift.GiftParams> component9() {
            return this.gifts;
        }

        public final PanelParams copy(String str, int i10, int i11, String str2, String str3, String str4, String str5, GiftPanelBanner giftPanelBanner, List<Gift.GiftParams> list, String str6, boolean z10) {
            p.h(str, TtmlNode.ATTR_ID);
            p.h(str2, "title");
            p.h(str3, "iconUrl");
            p.h(str4, "bonusImageUrl");
            p.h(str5, "eventIconUrl");
            p.h(list, "gifts");
            p.h(str6, "liveGameId");
            return new PanelParams(str, i10, i11, str2, str3, str4, str5, giftPanelBanner, list, str6, z10);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof PanelParams) {
                PanelParams panelParams = (PanelParams) obj;
                return p.c(this.f26151id, panelParams.f26151id) && this.type == panelParams.type && this.reasonId == panelParams.reasonId && p.c(this.title, panelParams.title) && p.c(this.iconUrl, panelParams.iconUrl) && p.c(this.bonusImageUrl, panelParams.bonusImageUrl) && p.c(this.eventIconUrl, panelParams.eventIconUrl) && p.c(this.banner, panelParams.banner) && p.c(this.gifts, panelParams.gifts) && p.c(this.liveGameId, panelParams.liveGameId) && this.isFocus == panelParams.isFocus;
            }
            return false;
        }

        public final GiftPanelBanner getBanner() {
            return this.banner;
        }

        public final String getBonusImageUrl() {
            return this.bonusImageUrl;
        }

        public final String getEventIconUrl() {
            return this.eventIconUrl;
        }

        public final List<Gift.GiftParams> getGifts() {
            return this.gifts;
        }

        public final String getIconUrl() {
            return this.iconUrl;
        }

        public final String getId() {
            return this.f26151id;
        }

        public final String getLiveGameId() {
            return this.liveGameId;
        }

        public final int getReasonId() {
            return this.reasonId;
        }

        public final String getTitle() {
            return this.title;
        }

        public final int getType() {
            return this.type;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int hashCode = ((((((((((((this.f26151id.hashCode() * 31) + Integer.hashCode(this.type)) * 31) + Integer.hashCode(this.reasonId)) * 31) + this.title.hashCode()) * 31) + this.iconUrl.hashCode()) * 31) + this.bonusImageUrl.hashCode()) * 31) + this.eventIconUrl.hashCode()) * 31;
            GiftPanelBanner giftPanelBanner = this.banner;
            int hashCode2 = (((((hashCode + (giftPanelBanner == null ? 0 : giftPanelBanner.hashCode())) * 31) + this.gifts.hashCode()) * 31) + this.liveGameId.hashCode()) * 31;
            boolean z10 = this.isFocus;
            int i10 = z10;
            if (z10 != 0) {
                i10 = 1;
            }
            return hashCode2 + i10;
        }

        public final boolean isFocus() {
            return this.isFocus;
        }

        public String toString() {
            return "PanelParams(id=" + this.f26151id + ", type=" + this.type + ", reasonId=" + this.reasonId + ", title=" + this.title + ", iconUrl=" + this.iconUrl + ", bonusImageUrl=" + this.bonusImageUrl + ", eventIconUrl=" + this.eventIconUrl + ", banner=" + this.banner + ", gifts=" + this.gifts + ", liveGameId=" + this.liveGameId + ", isFocus=" + this.isFocus + ')';
        }
    }

    public GiftPanelsResponse(Status status, int i10, List<PanelParams> list) {
        p.h(status, "status");
        p.h(list, "panels");
        this.status = status;
        this.defaultIndex = i10;
        this.panels = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GiftPanelsResponse copy$default(GiftPanelsResponse giftPanelsResponse, Status status, int i10, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            status = giftPanelsResponse.status;
        }
        if ((i11 & 2) != 0) {
            i10 = giftPanelsResponse.defaultIndex;
        }
        if ((i11 & 4) != 0) {
            list = giftPanelsResponse.panels;
        }
        return giftPanelsResponse.copy(status, i10, list);
    }

    public final Status component1() {
        return this.status;
    }

    public final int component2() {
        return this.defaultIndex;
    }

    public final List<PanelParams> component3() {
        return this.panels;
    }

    public final GiftPanelsResponse copy(Status status, int i10, List<PanelParams> list) {
        p.h(status, "status");
        p.h(list, "panels");
        return new GiftPanelsResponse(status, i10, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GiftPanelsResponse) {
            GiftPanelsResponse giftPanelsResponse = (GiftPanelsResponse) obj;
            return p.c(this.status, giftPanelsResponse.status) && this.defaultIndex == giftPanelsResponse.defaultIndex && p.c(this.panels, giftPanelsResponse.panels);
        }
        return false;
    }

    public final int getDefaultIndex() {
        return this.defaultIndex;
    }

    public final List<PanelParams> getPanels() {
        return this.panels;
    }

    public final Status getStatus() {
        return this.status;
    }

    public int hashCode() {
        return (((this.status.hashCode() * 31) + Integer.hashCode(this.defaultIndex)) * 31) + this.panels.hashCode();
    }

    public final void setStatus(Status status) {
        p.h(status, "<set-?>");
        this.status = status;
    }

    public String toString() {
        return "GiftPanelsResponse(status=" + this.status + ", defaultIndex=" + this.defaultIndex + ", panels=" + this.panels + ')';
    }
}
