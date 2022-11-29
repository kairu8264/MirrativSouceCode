package com.dena.mirrorman.net.api.response.notice;

import com.dena.mirrativ.mirrativapi.core.BooleanTypeAdapter;
import jo.p;
import ym.b;

/* loaded from: classes2.dex */
public final class AttributedText {
    public static final int $stable = 0;
    @b(BooleanTypeAdapter.class)
    private final boolean isHighlight;
    private final String text;

    public AttributedText(boolean z10, String str) {
        p.h(str, "text");
        this.isHighlight = z10;
        this.text = str;
    }

    public static /* synthetic */ AttributedText copy$default(AttributedText attributedText, boolean z10, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = attributedText.isHighlight;
        }
        if ((i10 & 2) != 0) {
            str = attributedText.text;
        }
        return attributedText.copy(z10, str);
    }

    public final boolean component1() {
        return this.isHighlight;
    }

    public final String component2() {
        return this.text;
    }

    public final AttributedText copy(boolean z10, String str) {
        p.h(str, "text");
        return new AttributedText(z10, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AttributedText) {
            AttributedText attributedText = (AttributedText) obj;
            return this.isHighlight == attributedText.isHighlight && p.c(this.text, attributedText.text);
        }
        return false;
    }

    public final String getText() {
        return this.text;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    public int hashCode() {
        boolean z10 = this.isHighlight;
        ?? r02 = z10;
        if (z10) {
            r02 = 1;
        }
        return (r02 * 31) + this.text.hashCode();
    }

    public final boolean isHighlight() {
        return this.isHighlight;
    }

    public String toString() {
        return "AttributedText(isHighlight=" + this.isHighlight + ", text=" + this.text + ')';
    }
}
