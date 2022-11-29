package com.dena.mirrativ.mirrativapi.emomo.event.giftranking;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.io.Serializable;
import jo.p;

/* loaded from: classes2.dex */
public final class GiftRankingAttributedText implements Serializable {
    private final String color;
    private final String value;

    public GiftRankingAttributedText(String str, String str2) {
        p.h(str, "value");
        p.h(str2, TtmlNode.ATTR_TTS_COLOR);
        this.value = str;
        this.color = str2;
    }

    public static /* synthetic */ GiftRankingAttributedText copy$default(GiftRankingAttributedText giftRankingAttributedText, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = giftRankingAttributedText.value;
        }
        if ((i10 & 2) != 0) {
            str2 = giftRankingAttributedText.color;
        }
        return giftRankingAttributedText.copy(str, str2);
    }

    public final String component1() {
        return this.value;
    }

    public final String component2() {
        return this.color;
    }

    public final GiftRankingAttributedText copy(String str, String str2) {
        p.h(str, "value");
        p.h(str2, TtmlNode.ATTR_TTS_COLOR);
        return new GiftRankingAttributedText(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GiftRankingAttributedText) {
            GiftRankingAttributedText giftRankingAttributedText = (GiftRankingAttributedText) obj;
            return p.c(this.value, giftRankingAttributedText.value) && p.c(this.color, giftRankingAttributedText.color);
        }
        return false;
    }

    public final String getColor() {
        return this.color;
    }

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        return (this.value.hashCode() * 31) + this.color.hashCode();
    }

    public String toString() {
        return "GiftRankingAttributedText(value=" + this.value + ", color=" + this.color + ')';
    }
}
