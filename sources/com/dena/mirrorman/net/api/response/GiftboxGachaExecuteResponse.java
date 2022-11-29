package com.dena.mirrorman.net.api.response;

import com.dena.mirrativ.mirrativapi.core.Status;
import java.util.List;
import jo.p;

/* loaded from: classes2.dex */
public final class GiftboxGachaExecuteResponse {
    public static final int $stable = 8;
    private final int appealShare;
    private final String invitePromoImageUrl;
    private final GiftboxGachaResult result;
    private final String shareText;
    private final ShareTwitter shareTwitter;
    private final List<GiftboxGachaResultSpecialGachaItem> specialGachaItems;
    private final Status status;

    public GiftboxGachaExecuteResponse(GiftboxGachaResult giftboxGachaResult, String str, Status status, ShareTwitter shareTwitter, int i10, List<GiftboxGachaResultSpecialGachaItem> list, String str2) {
        p.h(giftboxGachaResult, "result");
        p.h(str, "shareText");
        p.h(status, "status");
        p.h(shareTwitter, "shareTwitter");
        p.h(list, "specialGachaItems");
        p.h(str2, "invitePromoImageUrl");
        this.result = giftboxGachaResult;
        this.shareText = str;
        this.status = status;
        this.shareTwitter = shareTwitter;
        this.appealShare = i10;
        this.specialGachaItems = list;
        this.invitePromoImageUrl = str2;
    }

    public static /* synthetic */ GiftboxGachaExecuteResponse copy$default(GiftboxGachaExecuteResponse giftboxGachaExecuteResponse, GiftboxGachaResult giftboxGachaResult, String str, Status status, ShareTwitter shareTwitter, int i10, List list, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            giftboxGachaResult = giftboxGachaExecuteResponse.result;
        }
        if ((i11 & 2) != 0) {
            str = giftboxGachaExecuteResponse.shareText;
        }
        String str3 = str;
        if ((i11 & 4) != 0) {
            status = giftboxGachaExecuteResponse.status;
        }
        Status status2 = status;
        if ((i11 & 8) != 0) {
            shareTwitter = giftboxGachaExecuteResponse.shareTwitter;
        }
        ShareTwitter shareTwitter2 = shareTwitter;
        if ((i11 & 16) != 0) {
            i10 = giftboxGachaExecuteResponse.appealShare;
        }
        int i12 = i10;
        List<GiftboxGachaResultSpecialGachaItem> list2 = list;
        if ((i11 & 32) != 0) {
            list2 = giftboxGachaExecuteResponse.specialGachaItems;
        }
        List list3 = list2;
        if ((i11 & 64) != 0) {
            str2 = giftboxGachaExecuteResponse.invitePromoImageUrl;
        }
        return giftboxGachaExecuteResponse.copy(giftboxGachaResult, str3, status2, shareTwitter2, i12, list3, str2);
    }

    public final GiftboxGachaResult component1() {
        return this.result;
    }

    public final String component2() {
        return this.shareText;
    }

    public final Status component3() {
        return this.status;
    }

    public final ShareTwitter component4() {
        return this.shareTwitter;
    }

    public final int component5() {
        return this.appealShare;
    }

    public final List<GiftboxGachaResultSpecialGachaItem> component6() {
        return this.specialGachaItems;
    }

    public final String component7() {
        return this.invitePromoImageUrl;
    }

    public final GiftboxGachaExecuteResponse copy(GiftboxGachaResult giftboxGachaResult, String str, Status status, ShareTwitter shareTwitter, int i10, List<GiftboxGachaResultSpecialGachaItem> list, String str2) {
        p.h(giftboxGachaResult, "result");
        p.h(str, "shareText");
        p.h(status, "status");
        p.h(shareTwitter, "shareTwitter");
        p.h(list, "specialGachaItems");
        p.h(str2, "invitePromoImageUrl");
        return new GiftboxGachaExecuteResponse(giftboxGachaResult, str, status, shareTwitter, i10, list, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GiftboxGachaExecuteResponse) {
            GiftboxGachaExecuteResponse giftboxGachaExecuteResponse = (GiftboxGachaExecuteResponse) obj;
            return p.c(this.result, giftboxGachaExecuteResponse.result) && p.c(this.shareText, giftboxGachaExecuteResponse.shareText) && p.c(this.status, giftboxGachaExecuteResponse.status) && p.c(this.shareTwitter, giftboxGachaExecuteResponse.shareTwitter) && this.appealShare == giftboxGachaExecuteResponse.appealShare && p.c(this.specialGachaItems, giftboxGachaExecuteResponse.specialGachaItems) && p.c(this.invitePromoImageUrl, giftboxGachaExecuteResponse.invitePromoImageUrl);
        }
        return false;
    }

    public final int getAppealShare() {
        return this.appealShare;
    }

    public final String getInvitePromoImageUrl() {
        return this.invitePromoImageUrl;
    }

    public final GiftboxGachaResult getResult() {
        return this.result;
    }

    public final String getShareText() {
        return this.shareText;
    }

    public final ShareTwitter getShareTwitter() {
        return this.shareTwitter;
    }

    public final List<GiftboxGachaResultSpecialGachaItem> getSpecialGachaItems() {
        return this.specialGachaItems;
    }

    public final Status getStatus() {
        return this.status;
    }

    public int hashCode() {
        return (((((((((((this.result.hashCode() * 31) + this.shareText.hashCode()) * 31) + this.status.hashCode()) * 31) + this.shareTwitter.hashCode()) * 31) + Integer.hashCode(this.appealShare)) * 31) + this.specialGachaItems.hashCode()) * 31) + this.invitePromoImageUrl.hashCode();
    }

    public String toString() {
        return "GiftboxGachaExecuteResponse(result=" + this.result + ", shareText=" + this.shareText + ", status=" + this.status + ", shareTwitter=" + this.shareTwitter + ", appealShare=" + this.appealShare + ", specialGachaItems=" + this.specialGachaItems + ", invitePromoImageUrl=" + this.invitePromoImageUrl + ')';
    }
}
