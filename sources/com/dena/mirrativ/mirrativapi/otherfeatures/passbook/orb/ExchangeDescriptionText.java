package com.dena.mirrativ.mirrativapi.otherfeatures.passbook.orb;

import com.dena.mirrativ.mirrativapi.core.BooleanTypeAdapter;
import jo.p;
import ym.b;

/* loaded from: classes2.dex */
public final class ExchangeDescriptionText {
    @b(BooleanTypeAdapter.class)
    private final boolean highlighted;
    private final String text;

    public ExchangeDescriptionText(boolean z10, String str) {
        p.h(str, "text");
        this.highlighted = z10;
        this.text = str;
    }

    public static /* synthetic */ ExchangeDescriptionText copy$default(ExchangeDescriptionText exchangeDescriptionText, boolean z10, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = exchangeDescriptionText.highlighted;
        }
        if ((i10 & 2) != 0) {
            str = exchangeDescriptionText.text;
        }
        return exchangeDescriptionText.copy(z10, str);
    }

    public final boolean component1() {
        return this.highlighted;
    }

    public final String component2() {
        return this.text;
    }

    public final ExchangeDescriptionText copy(boolean z10, String str) {
        p.h(str, "text");
        return new ExchangeDescriptionText(z10, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ExchangeDescriptionText) {
            ExchangeDescriptionText exchangeDescriptionText = (ExchangeDescriptionText) obj;
            return this.highlighted == exchangeDescriptionText.highlighted && p.c(this.text, exchangeDescriptionText.text);
        }
        return false;
    }

    public final boolean getHighlighted() {
        return this.highlighted;
    }

    public final String getText() {
        return this.text;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    public int hashCode() {
        boolean z10 = this.highlighted;
        ?? r02 = z10;
        if (z10) {
            r02 = 1;
        }
        return (r02 * 31) + this.text.hashCode();
    }

    public String toString() {
        return "ExchangeDescriptionText(highlighted=" + this.highlighted + ", text=" + this.text + ')';
    }
}
