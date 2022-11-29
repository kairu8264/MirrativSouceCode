package com.dena.mirrorman.net.api.response.event;

import com.dena.mirrativ.mirrativapi.core.BooleanTypeAdapter;
import jo.p;
import ym.b;

/* loaded from: classes2.dex */
public final class HighlightedText {
    public static final int $stable = 0;
    @b(BooleanTypeAdapter.class)
    private final boolean isHighlighted;
    private final String value;

    public HighlightedText(String str, boolean z10) {
        p.h(str, "value");
        this.value = str;
        this.isHighlighted = z10;
    }

    public static /* synthetic */ HighlightedText copy$default(HighlightedText highlightedText, String str, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = highlightedText.value;
        }
        if ((i10 & 2) != 0) {
            z10 = highlightedText.isHighlighted;
        }
        return highlightedText.copy(str, z10);
    }

    public final String component1() {
        return this.value;
    }

    public final boolean component2() {
        return this.isHighlighted;
    }

    public final HighlightedText copy(String str, boolean z10) {
        p.h(str, "value");
        return new HighlightedText(str, z10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof HighlightedText) {
            HighlightedText highlightedText = (HighlightedText) obj;
            return p.c(this.value, highlightedText.value) && this.isHighlighted == highlightedText.isHighlighted;
        }
        return false;
    }

    public final String getValue() {
        return this.value;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.value.hashCode() * 31;
        boolean z10 = this.isHighlighted;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        return hashCode + i10;
    }

    public final boolean isHighlighted() {
        return this.isHighlighted;
    }

    public String toString() {
        return "HighlightedText(value=" + this.value + ", isHighlighted=" + this.isHighlighted + ')';
    }
}
