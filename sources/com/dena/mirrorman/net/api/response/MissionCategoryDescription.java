package com.dena.mirrorman.net.api.response;

import com.dena.mirrativ.mirrativapi.core.BooleanTypeAdapter;
import jo.p;
import ym.b;

/* loaded from: classes2.dex */
public final class MissionCategoryDescription {
    public static final int $stable = 0;
    @b(BooleanTypeAdapter.class)
    private final boolean isBold;
    @b(BooleanTypeAdapter.class)
    private final boolean isHighlighted;
    private final String text;

    public MissionCategoryDescription(boolean z10, boolean z11, String str) {
        p.h(str, "text");
        this.isBold = z10;
        this.isHighlighted = z11;
        this.text = str;
    }

    public static /* synthetic */ MissionCategoryDescription copy$default(MissionCategoryDescription missionCategoryDescription, boolean z10, boolean z11, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = missionCategoryDescription.isBold;
        }
        if ((i10 & 2) != 0) {
            z11 = missionCategoryDescription.isHighlighted;
        }
        if ((i10 & 4) != 0) {
            str = missionCategoryDescription.text;
        }
        return missionCategoryDescription.copy(z10, z11, str);
    }

    public final boolean component1() {
        return this.isBold;
    }

    public final boolean component2() {
        return this.isHighlighted;
    }

    public final String component3() {
        return this.text;
    }

    public final MissionCategoryDescription copy(boolean z10, boolean z11, String str) {
        p.h(str, "text");
        return new MissionCategoryDescription(z10, z11, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MissionCategoryDescription) {
            MissionCategoryDescription missionCategoryDescription = (MissionCategoryDescription) obj;
            return this.isBold == missionCategoryDescription.isBold && this.isHighlighted == missionCategoryDescription.isHighlighted && p.c(this.text, missionCategoryDescription.text);
        }
        return false;
    }

    public final String getText() {
        return this.text;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    public int hashCode() {
        boolean z10 = this.isBold;
        ?? r02 = z10;
        if (z10) {
            r02 = 1;
        }
        int i10 = r02 * 31;
        boolean z11 = this.isHighlighted;
        return ((i10 + (z11 ? 1 : z11 ? 1 : 0)) * 31) + this.text.hashCode();
    }

    public final boolean isBold() {
        return this.isBold;
    }

    public final boolean isHighlighted() {
        return this.isHighlighted;
    }

    public String toString() {
        return "MissionCategoryDescription(isBold=" + this.isBold + ", isHighlighted=" + this.isHighlighted + ", text=" + this.text + ')';
    }
}
