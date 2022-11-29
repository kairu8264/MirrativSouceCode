package com.dena.mirrativ.mirrativapi.emomo.event.giftranking;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.io.Serializable;
import jo.p;

/* loaded from: classes2.dex */
public final class GiftRankingButtonStyle implements Serializable {
    private final String backgroundColor;
    private final String frameColor;
    private final String textColor;

    public GiftRankingButtonStyle(String str, String str2, String str3) {
        p.h(str, TtmlNode.ATTR_TTS_BACKGROUND_COLOR);
        p.h(str2, "frameColor");
        p.h(str3, "textColor");
        this.backgroundColor = str;
        this.frameColor = str2;
        this.textColor = str3;
    }

    public static /* synthetic */ GiftRankingButtonStyle copy$default(GiftRankingButtonStyle giftRankingButtonStyle, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = giftRankingButtonStyle.backgroundColor;
        }
        if ((i10 & 2) != 0) {
            str2 = giftRankingButtonStyle.frameColor;
        }
        if ((i10 & 4) != 0) {
            str3 = giftRankingButtonStyle.textColor;
        }
        return giftRankingButtonStyle.copy(str, str2, str3);
    }

    public final String component1() {
        return this.backgroundColor;
    }

    public final String component2() {
        return this.frameColor;
    }

    public final String component3() {
        return this.textColor;
    }

    public final GiftRankingButtonStyle copy(String str, String str2, String str3) {
        p.h(str, TtmlNode.ATTR_TTS_BACKGROUND_COLOR);
        p.h(str2, "frameColor");
        p.h(str3, "textColor");
        return new GiftRankingButtonStyle(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GiftRankingButtonStyle) {
            GiftRankingButtonStyle giftRankingButtonStyle = (GiftRankingButtonStyle) obj;
            return p.c(this.backgroundColor, giftRankingButtonStyle.backgroundColor) && p.c(this.frameColor, giftRankingButtonStyle.frameColor) && p.c(this.textColor, giftRankingButtonStyle.textColor);
        }
        return false;
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final String getFrameColor() {
        return this.frameColor;
    }

    public final String getTextColor() {
        return this.textColor;
    }

    public int hashCode() {
        return (((this.backgroundColor.hashCode() * 31) + this.frameColor.hashCode()) * 31) + this.textColor.hashCode();
    }

    public String toString() {
        return "GiftRankingButtonStyle(backgroundColor=" + this.backgroundColor + ", frameColor=" + this.frameColor + ", textColor=" + this.textColor + ')';
    }
}
