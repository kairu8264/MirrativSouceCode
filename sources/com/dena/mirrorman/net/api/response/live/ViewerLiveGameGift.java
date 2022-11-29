package com.dena.mirrorman.net.api.response.live;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import jo.p;

/* loaded from: classes2.dex */
public final class ViewerLiveGameGift {
    public static final int $stable = 0;
    private final int coins;
    private final int effectType;
    private final String iconUrl;

    /* renamed from: id  reason: collision with root package name */
    private final String f26173id;

    public ViewerLiveGameGift(String str, String str2, int i10, int i11) {
        p.h(str, TtmlNode.ATTR_ID);
        p.h(str2, "iconUrl");
        this.f26173id = str;
        this.iconUrl = str2;
        this.coins = i10;
        this.effectType = i11;
    }

    public static /* synthetic */ ViewerLiveGameGift copy$default(ViewerLiveGameGift viewerLiveGameGift, String str, String str2, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = viewerLiveGameGift.f26173id;
        }
        if ((i12 & 2) != 0) {
            str2 = viewerLiveGameGift.iconUrl;
        }
        if ((i12 & 4) != 0) {
            i10 = viewerLiveGameGift.coins;
        }
        if ((i12 & 8) != 0) {
            i11 = viewerLiveGameGift.effectType;
        }
        return viewerLiveGameGift.copy(str, str2, i10, i11);
    }

    public final String component1() {
        return this.f26173id;
    }

    public final String component2() {
        return this.iconUrl;
    }

    public final int component3() {
        return this.coins;
    }

    public final int component4() {
        return this.effectType;
    }

    public final ViewerLiveGameGift copy(String str, String str2, int i10, int i11) {
        p.h(str, TtmlNode.ATTR_ID);
        p.h(str2, "iconUrl");
        return new ViewerLiveGameGift(str, str2, i10, i11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ViewerLiveGameGift) {
            ViewerLiveGameGift viewerLiveGameGift = (ViewerLiveGameGift) obj;
            return p.c(this.f26173id, viewerLiveGameGift.f26173id) && p.c(this.iconUrl, viewerLiveGameGift.iconUrl) && this.coins == viewerLiveGameGift.coins && this.effectType == viewerLiveGameGift.effectType;
        }
        return false;
    }

    public final int getCoins() {
        return this.coins;
    }

    public final int getEffectType() {
        return this.effectType;
    }

    public final String getIconUrl() {
        return this.iconUrl;
    }

    public final String getId() {
        return this.f26173id;
    }

    public int hashCode() {
        return (((((this.f26173id.hashCode() * 31) + this.iconUrl.hashCode()) * 31) + Integer.hashCode(this.coins)) * 31) + Integer.hashCode(this.effectType);
    }

    public final boolean isFeatureGift() {
        return this.effectType == 1;
    }

    public String toString() {
        return "ViewerLiveGameGift(id=" + this.f26173id + ", iconUrl=" + this.iconUrl + ", coins=" + this.coins + ", effectType=" + this.effectType + ')';
    }
}
