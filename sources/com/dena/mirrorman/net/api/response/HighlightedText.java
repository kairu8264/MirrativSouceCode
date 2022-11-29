package com.dena.mirrorman.net.api.response;

import com.dena.mirrativ.mirrativapi.core.BooleanTypeAdapter;
import jo.p;
import ym.b;

/* loaded from: classes2.dex */
public final class HighlightedText {
    public static final int $stable = 0;
    @b(BooleanTypeAdapter.class)
    private final boolean isHighlight;
    private final String text;

    public HighlightedText(String str, boolean z10) {
        p.h(str, "text");
        this.text = str;
        this.isHighlight = z10;
    }

    public static /* synthetic */ HighlightedText copy$default(HighlightedText highlightedText, String str, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = highlightedText.text;
        }
        if ((i10 & 2) != 0) {
            z10 = highlightedText.isHighlight;
        }
        return highlightedText.copy(str, z10);
    }

    public final String component1() {
        return this.text;
    }

    public final boolean component2() {
        return this.isHighlight;
    }

    public final HighlightedText copy(String str, boolean z10) {
        p.h(str, "text");
        return new HighlightedText(str, z10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof HighlightedText) {
            HighlightedText highlightedText = (HighlightedText) obj;
            return p.c(this.text, highlightedText.text) && this.isHighlight == highlightedText.isHighlight;
        }
        return false;
    }

    public final String getText() {
        return this.text;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.text.hashCode() * 31;
        boolean z10 = this.isHighlight;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        return hashCode + i10;
    }

    public final boolean isHighlight() {
        return this.isHighlight;
    }

    public String toString() {
        return "HighlightedText(text=" + this.text + ", isHighlight=" + this.isHighlight + ')';
    }
}
