package com.dena.mirrorman.net.api.response;

import com.dena.mirrativ.mirrativapi.core.BooleanTypeAdapter;
import com.dena.mirrativ.mirrativapi.user.LabelRemainingPeriod;
import java.io.Serializable;
import jo.p;
import ym.b;

/* loaded from: classes2.dex */
public final class RibbonResponse implements Serializable {
    public static final int $stable = 8;
    private final String imageUrl;
    @b(BooleanTypeAdapter.class)
    private final boolean isContinuousRibbon;
    @b(BooleanTypeAdapter.class)
    private final boolean isLabel;
    private final LabelRemainingPeriod labelRemainingPeriod;
    private final int ribbonId;

    public RibbonResponse(boolean z10, String str, boolean z11, LabelRemainingPeriod labelRemainingPeriod, int i10) {
        p.h(str, "imageUrl");
        this.isContinuousRibbon = z10;
        this.imageUrl = str;
        this.isLabel = z11;
        this.labelRemainingPeriod = labelRemainingPeriod;
        this.ribbonId = i10;
    }

    public static /* synthetic */ RibbonResponse copy$default(RibbonResponse ribbonResponse, boolean z10, String str, boolean z11, LabelRemainingPeriod labelRemainingPeriod, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z10 = ribbonResponse.isContinuousRibbon;
        }
        if ((i11 & 2) != 0) {
            str = ribbonResponse.imageUrl;
        }
        String str2 = str;
        if ((i11 & 4) != 0) {
            z11 = ribbonResponse.isLabel;
        }
        boolean z12 = z11;
        if ((i11 & 8) != 0) {
            labelRemainingPeriod = ribbonResponse.labelRemainingPeriod;
        }
        LabelRemainingPeriod labelRemainingPeriod2 = labelRemainingPeriod;
        if ((i11 & 16) != 0) {
            i10 = ribbonResponse.ribbonId;
        }
        return ribbonResponse.copy(z10, str2, z12, labelRemainingPeriod2, i10);
    }

    public final boolean component1() {
        return this.isContinuousRibbon;
    }

    public final String component2() {
        return this.imageUrl;
    }

    public final boolean component3() {
        return this.isLabel;
    }

    public final LabelRemainingPeriod component4() {
        return this.labelRemainingPeriod;
    }

    public final int component5() {
        return this.ribbonId;
    }

    public final RibbonResponse copy(boolean z10, String str, boolean z11, LabelRemainingPeriod labelRemainingPeriod, int i10) {
        p.h(str, "imageUrl");
        return new RibbonResponse(z10, str, z11, labelRemainingPeriod, i10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RibbonResponse) {
            RibbonResponse ribbonResponse = (RibbonResponse) obj;
            return this.isContinuousRibbon == ribbonResponse.isContinuousRibbon && p.c(this.imageUrl, ribbonResponse.imageUrl) && this.isLabel == ribbonResponse.isLabel && p.c(this.labelRemainingPeriod, ribbonResponse.labelRemainingPeriod) && this.ribbonId == ribbonResponse.ribbonId;
        }
        return false;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final LabelRemainingPeriod getLabelRemainingPeriod() {
        return this.labelRemainingPeriod;
    }

    public final int getRibbonId() {
        return this.ribbonId;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    public int hashCode() {
        boolean z10 = this.isContinuousRibbon;
        ?? r02 = z10;
        if (z10) {
            r02 = 1;
        }
        int hashCode = ((r02 * 31) + this.imageUrl.hashCode()) * 31;
        boolean z11 = this.isLabel;
        int i10 = (hashCode + (z11 ? 1 : z11 ? 1 : 0)) * 31;
        LabelRemainingPeriod labelRemainingPeriod = this.labelRemainingPeriod;
        return ((i10 + (labelRemainingPeriod == null ? 0 : labelRemainingPeriod.hashCode())) * 31) + Integer.hashCode(this.ribbonId);
    }

    public final boolean isContinuousRibbon() {
        return this.isContinuousRibbon;
    }

    public final boolean isLabel() {
        return this.isLabel;
    }

    public String toString() {
        return "RibbonResponse(isContinuousRibbon=" + this.isContinuousRibbon + ", imageUrl=" + this.imageUrl + ", isLabel=" + this.isLabel + ", labelRemainingPeriod=" + this.labelRemainingPeriod + ", ribbonId=" + this.ribbonId + ')';
    }
}
