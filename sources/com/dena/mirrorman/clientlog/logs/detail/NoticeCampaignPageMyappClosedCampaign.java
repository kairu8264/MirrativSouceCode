package com.dena.mirrorman.clientlog.logs.detail;

/* loaded from: classes2.dex */
public final class NoticeCampaignPageMyappClosedCampaign {
    public static final int $stable = 0;
    private final int isNew;
    private final int isVisible;

    public NoticeCampaignPageMyappClosedCampaign(int i10, int i11) {
        this.isVisible = i10;
        this.isNew = i11;
    }

    public static /* synthetic */ NoticeCampaignPageMyappClosedCampaign copy$default(NoticeCampaignPageMyappClosedCampaign noticeCampaignPageMyappClosedCampaign, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = noticeCampaignPageMyappClosedCampaign.isVisible;
        }
        if ((i12 & 2) != 0) {
            i11 = noticeCampaignPageMyappClosedCampaign.isNew;
        }
        return noticeCampaignPageMyappClosedCampaign.copy(i10, i11);
    }

    public final int component1() {
        return this.isVisible;
    }

    public final int component2() {
        return this.isNew;
    }

    public final NoticeCampaignPageMyappClosedCampaign copy(int i10, int i11) {
        return new NoticeCampaignPageMyappClosedCampaign(i10, i11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof NoticeCampaignPageMyappClosedCampaign) {
            NoticeCampaignPageMyappClosedCampaign noticeCampaignPageMyappClosedCampaign = (NoticeCampaignPageMyappClosedCampaign) obj;
            return this.isVisible == noticeCampaignPageMyappClosedCampaign.isVisible && this.isNew == noticeCampaignPageMyappClosedCampaign.isNew;
        }
        return false;
    }

    public int hashCode() {
        return (Integer.hashCode(this.isVisible) * 31) + Integer.hashCode(this.isNew);
    }

    public final int isNew() {
        return this.isNew;
    }

    public final int isVisible() {
        return this.isVisible;
    }

    public String toString() {
        return "NoticeCampaignPageMyappClosedCampaign(isVisible=" + this.isVisible + ", isNew=" + this.isNew + ')';
    }

    public NoticeCampaignPageMyappClosedCampaign(boolean z10, boolean z11) {
        this(z10 ? 1 : 0, z11 ? 1 : 0);
    }
}
