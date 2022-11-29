package com.dena.mirrativ.mirrativapi.user;

import com.dena.mirrativ.mirrativapi.core.BooleanTypeAdapter;
import java.io.Serializable;
import jo.p;
import ym.b;

/* loaded from: classes2.dex */
public final class LabelRemainingPeriod implements Serializable {
    @b(BooleanTypeAdapter.class)
    private final boolean isHighlight;
    private final long remainSeconds;
    private final String text;

    public LabelRemainingPeriod(boolean z10, String str, long j10) {
        p.h(str, "text");
        this.isHighlight = z10;
        this.text = str;
        this.remainSeconds = j10;
    }

    public static /* synthetic */ LabelRemainingPeriod copy$default(LabelRemainingPeriod labelRemainingPeriod, boolean z10, String str, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = labelRemainingPeriod.isHighlight;
        }
        if ((i10 & 2) != 0) {
            str = labelRemainingPeriod.text;
        }
        if ((i10 & 4) != 0) {
            j10 = labelRemainingPeriod.remainSeconds;
        }
        return labelRemainingPeriod.copy(z10, str, j10);
    }

    public final boolean component1() {
        return this.isHighlight;
    }

    public final String component2() {
        return this.text;
    }

    public final long component3() {
        return this.remainSeconds;
    }

    public final LabelRemainingPeriod copy(boolean z10, String str, long j10) {
        p.h(str, "text");
        return new LabelRemainingPeriod(z10, str, j10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LabelRemainingPeriod) {
            LabelRemainingPeriod labelRemainingPeriod = (LabelRemainingPeriod) obj;
            return this.isHighlight == labelRemainingPeriod.isHighlight && p.c(this.text, labelRemainingPeriod.text) && this.remainSeconds == labelRemainingPeriod.remainSeconds;
        }
        return false;
    }

    public final long getRemainSeconds() {
        return this.remainSeconds;
    }

    public final String getText() {
        return this.text;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    public int hashCode() {
        boolean z10 = this.isHighlight;
        ?? r02 = z10;
        if (z10) {
            r02 = 1;
        }
        return (((r02 * 31) + this.text.hashCode()) * 31) + Long.hashCode(this.remainSeconds);
    }

    public final boolean isHighlight() {
        return this.isHighlight;
    }

    public String toString() {
        return "LabelRemainingPeriod(isHighlight=" + this.isHighlight + ", text=" + this.text + ", remainSeconds=" + this.remainSeconds + ')';
    }
}
