package com.dena.mirrorman.net.api.response;

import com.dena.mirrativ.mirrativapi.core.BooleanTypeAdapter;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import jo.p;
import ym.b;

/* loaded from: classes2.dex */
public final class ToolTipStartLiveButtonAttributedText {
    public static final int $stable = 0;
    private final String fontSize;
    @b(BooleanTypeAdapter.class)
    private final boolean isBold;
    @b(BooleanTypeAdapter.class)
    private final boolean isHighlighted;
    private final String text;

    public ToolTipStartLiveButtonAttributedText(String str, String str2, boolean z10, boolean z11) {
        p.h(str, TtmlNode.ATTR_TTS_FONT_SIZE);
        p.h(str2, "text");
        this.fontSize = str;
        this.text = str2;
        this.isBold = z10;
        this.isHighlighted = z11;
    }

    public static /* synthetic */ ToolTipStartLiveButtonAttributedText copy$default(ToolTipStartLiveButtonAttributedText toolTipStartLiveButtonAttributedText, String str, String str2, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = toolTipStartLiveButtonAttributedText.fontSize;
        }
        if ((i10 & 2) != 0) {
            str2 = toolTipStartLiveButtonAttributedText.text;
        }
        if ((i10 & 4) != 0) {
            z10 = toolTipStartLiveButtonAttributedText.isBold;
        }
        if ((i10 & 8) != 0) {
            z11 = toolTipStartLiveButtonAttributedText.isHighlighted;
        }
        return toolTipStartLiveButtonAttributedText.copy(str, str2, z10, z11);
    }

    public final String component1() {
        return this.fontSize;
    }

    public final String component2() {
        return this.text;
    }

    public final boolean component3() {
        return this.isBold;
    }

    public final boolean component4() {
        return this.isHighlighted;
    }

    public final ToolTipStartLiveButtonAttributedText copy(String str, String str2, boolean z10, boolean z11) {
        p.h(str, TtmlNode.ATTR_TTS_FONT_SIZE);
        p.h(str2, "text");
        return new ToolTipStartLiveButtonAttributedText(str, str2, z10, z11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ToolTipStartLiveButtonAttributedText) {
            ToolTipStartLiveButtonAttributedText toolTipStartLiveButtonAttributedText = (ToolTipStartLiveButtonAttributedText) obj;
            return p.c(this.fontSize, toolTipStartLiveButtonAttributedText.fontSize) && p.c(this.text, toolTipStartLiveButtonAttributedText.text) && this.isBold == toolTipStartLiveButtonAttributedText.isBold && this.isHighlighted == toolTipStartLiveButtonAttributedText.isHighlighted;
        }
        return false;
    }

    public final String getFontSize() {
        return this.fontSize;
    }

    public final String getText() {
        return this.text;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((this.fontSize.hashCode() * 31) + this.text.hashCode()) * 31;
        boolean z10 = this.isBold;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        int i11 = (hashCode + i10) * 31;
        boolean z11 = this.isHighlighted;
        return i11 + (z11 ? 1 : z11 ? 1 : 0);
    }

    public final boolean isBold() {
        return this.isBold;
    }

    public final boolean isHighlighted() {
        return this.isHighlighted;
    }

    public String toString() {
        return "ToolTipStartLiveButtonAttributedText(fontSize=" + this.fontSize + ", text=" + this.text + ", isBold=" + this.isBold + ", isHighlighted=" + this.isHighlighted + ')';
    }
}
