package com.dena.mirrorman.net.api.response.live;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.List;
import jo.p;

/* loaded from: classes2.dex */
public final class CatalogRecommend {
    public static final int $stable = 8;
    private final List<String> backgroundColor;
    private final String iconUrl;
    private final String text;
    private final String textColor;

    public CatalogRecommend(String str, String str2, String str3, List<String> list) {
        p.h(str, "text");
        p.h(str2, "iconUrl");
        p.h(str3, "textColor");
        p.h(list, TtmlNode.ATTR_TTS_BACKGROUND_COLOR);
        this.text = str;
        this.iconUrl = str2;
        this.textColor = str3;
        this.backgroundColor = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CatalogRecommend copy$default(CatalogRecommend catalogRecommend, String str, String str2, String str3, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = catalogRecommend.text;
        }
        if ((i10 & 2) != 0) {
            str2 = catalogRecommend.iconUrl;
        }
        if ((i10 & 4) != 0) {
            str3 = catalogRecommend.textColor;
        }
        if ((i10 & 8) != 0) {
            list = catalogRecommend.backgroundColor;
        }
        return catalogRecommend.copy(str, str2, str3, list);
    }

    public final String component1() {
        return this.text;
    }

    public final String component2() {
        return this.iconUrl;
    }

    public final String component3() {
        return this.textColor;
    }

    public final List<String> component4() {
        return this.backgroundColor;
    }

    public final CatalogRecommend copy(String str, String str2, String str3, List<String> list) {
        p.h(str, "text");
        p.h(str2, "iconUrl");
        p.h(str3, "textColor");
        p.h(list, TtmlNode.ATTR_TTS_BACKGROUND_COLOR);
        return new CatalogRecommend(str, str2, str3, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CatalogRecommend) {
            CatalogRecommend catalogRecommend = (CatalogRecommend) obj;
            return p.c(this.text, catalogRecommend.text) && p.c(this.iconUrl, catalogRecommend.iconUrl) && p.c(this.textColor, catalogRecommend.textColor) && p.c(this.backgroundColor, catalogRecommend.backgroundColor);
        }
        return false;
    }

    public final List<String> getBackgroundColor() {
        return this.backgroundColor;
    }

    public final String getIconUrl() {
        return this.iconUrl;
    }

    public final String getText() {
        return this.text;
    }

    public final String getTextColor() {
        return this.textColor;
    }

    public int hashCode() {
        return (((((this.text.hashCode() * 31) + this.iconUrl.hashCode()) * 31) + this.textColor.hashCode()) * 31) + this.backgroundColor.hashCode();
    }

    public String toString() {
        return "CatalogRecommend(text=" + this.text + ", iconUrl=" + this.iconUrl + ", textColor=" + this.textColor + ", backgroundColor=" + this.backgroundColor + ')';
    }
}
