package com.dena.mirrorman.net.api.response.notice;

import com.dena.mirrativ.mirrativapi.core.BooleanTypeAdapter;
import jo.p;
import ym.b;

/* loaded from: classes2.dex */
public final class YourNoticeAttributedText {
    public static final int $stable = 0;
    @b(BooleanTypeAdapter.class)
    private final boolean isBold;
    private final String text;

    public YourNoticeAttributedText(boolean z10, String str) {
        p.h(str, "text");
        this.isBold = z10;
        this.text = str;
    }

    public static /* synthetic */ YourNoticeAttributedText copy$default(YourNoticeAttributedText yourNoticeAttributedText, boolean z10, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = yourNoticeAttributedText.isBold;
        }
        if ((i10 & 2) != 0) {
            str = yourNoticeAttributedText.text;
        }
        return yourNoticeAttributedText.copy(z10, str);
    }

    public final boolean component1() {
        return this.isBold;
    }

    public final String component2() {
        return this.text;
    }

    public final YourNoticeAttributedText copy(boolean z10, String str) {
        p.h(str, "text");
        return new YourNoticeAttributedText(z10, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof YourNoticeAttributedText) {
            YourNoticeAttributedText yourNoticeAttributedText = (YourNoticeAttributedText) obj;
            return this.isBold == yourNoticeAttributedText.isBold && p.c(this.text, yourNoticeAttributedText.text);
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
        boolean z10 = this.isBold;
        ?? r02 = z10;
        if (z10) {
            r02 = 1;
        }
        return (r02 * 31) + this.text.hashCode();
    }

    public final boolean isBold() {
        return this.isBold;
    }

    public String toString() {
        return "YourNoticeAttributedText(isBold=" + this.isBold + ", text=" + this.text + ')';
    }
}
