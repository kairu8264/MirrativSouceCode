package com.dena.mirrorman.net.api.response.live;

import com.dena.mirrativ.mirrativapi.emomo.event.giftranking.GiftRankingAttributedText;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.List;
import jo.p;

/* loaded from: classes2.dex */
public final class PhotoCampaign {
    public static final int $stable = 8;

    /* renamed from: id  reason: collision with root package name */
    private final String f26172id;
    private final String lockedMessage;
    private final List<GiftRankingAttributedText> popupTexts;
    private final boolean tweet;
    private final String url;

    public PhotoCampaign(String str, String str2, String str3, List<GiftRankingAttributedText> list, boolean z10) {
        p.h(str, TtmlNode.ATTR_ID);
        p.h(str2, "url");
        p.h(str3, "lockedMessage");
        p.h(list, "popupTexts");
        this.f26172id = str;
        this.url = str2;
        this.lockedMessage = str3;
        this.popupTexts = list;
        this.tweet = z10;
    }

    public static /* synthetic */ PhotoCampaign copy$default(PhotoCampaign photoCampaign, String str, String str2, String str3, List list, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = photoCampaign.f26172id;
        }
        if ((i10 & 2) != 0) {
            str2 = photoCampaign.url;
        }
        String str4 = str2;
        if ((i10 & 4) != 0) {
            str3 = photoCampaign.lockedMessage;
        }
        String str5 = str3;
        List<GiftRankingAttributedText> list2 = list;
        if ((i10 & 8) != 0) {
            list2 = photoCampaign.popupTexts;
        }
        List list3 = list2;
        if ((i10 & 16) != 0) {
            z10 = photoCampaign.tweet;
        }
        return photoCampaign.copy(str, str4, str5, list3, z10);
    }

    public final String component1() {
        return this.f26172id;
    }

    public final String component2() {
        return this.url;
    }

    public final String component3() {
        return this.lockedMessage;
    }

    public final List<GiftRankingAttributedText> component4() {
        return this.popupTexts;
    }

    public final boolean component5() {
        return this.tweet;
    }

    public final PhotoCampaign copy(String str, String str2, String str3, List<GiftRankingAttributedText> list, boolean z10) {
        p.h(str, TtmlNode.ATTR_ID);
        p.h(str2, "url");
        p.h(str3, "lockedMessage");
        p.h(list, "popupTexts");
        return new PhotoCampaign(str, str2, str3, list, z10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PhotoCampaign) {
            PhotoCampaign photoCampaign = (PhotoCampaign) obj;
            return p.c(this.f26172id, photoCampaign.f26172id) && p.c(this.url, photoCampaign.url) && p.c(this.lockedMessage, photoCampaign.lockedMessage) && p.c(this.popupTexts, photoCampaign.popupTexts) && this.tweet == photoCampaign.tweet;
        }
        return false;
    }

    public final String getId() {
        return this.f26172id;
    }

    public final String getLockedMessage() {
        return this.lockedMessage;
    }

    public final List<GiftRankingAttributedText> getPopupTexts() {
        return this.popupTexts;
    }

    public final boolean getTweet() {
        return this.tweet;
    }

    public final String getUrl() {
        return this.url;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((((this.f26172id.hashCode() * 31) + this.url.hashCode()) * 31) + this.lockedMessage.hashCode()) * 31) + this.popupTexts.hashCode()) * 31;
        boolean z10 = this.tweet;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        return hashCode + i10;
    }

    public String toString() {
        return "PhotoCampaign(id=" + this.f26172id + ", url=" + this.url + ", lockedMessage=" + this.lockedMessage + ", popupTexts=" + this.popupTexts + ", tweet=" + this.tweet + ')';
    }
}
