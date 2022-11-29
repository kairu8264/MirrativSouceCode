package com.dena.mirrorman.net.api.response.notice;

import com.dena.mirrativ.mirrativapi.core.BooleanTypeAdapter;
import jf.f0;
import jo.h;
import jo.p;
import ym.b;

/* loaded from: classes2.dex */
public final class CampaignNotice {
    public static final int $stable = 8;
    private f0 category;
    private int column;
    private int columnsNum;
    private final long createdAt;
    private final String eventPeriod;
    @b(BooleanTypeAdapter.class)
    private boolean hasReceivableReward;

    /* renamed from: id  reason: collision with root package name */
    private int f26174id;
    private final String imageUrl;
    private boolean isNew;
    @b(BooleanTypeAdapter.class)
    private final boolean isNow;
    @b(BooleanTypeAdapter.class)
    private final boolean isUpcoming;
    private int row;
    private final String text;
    private final String url;

    public CampaignNotice(int i10, String str, String str2, boolean z10, boolean z11, String str3, String str4, long j10, boolean z12, f0 f0Var, int i11, int i12, int i13, boolean z13) {
        p.h(str, "text");
        p.h(str2, "eventPeriod");
        p.h(str3, "imageUrl");
        p.h(str4, "url");
        p.h(f0Var, "category");
        this.f26174id = i10;
        this.text = str;
        this.eventPeriod = str2;
        this.isNow = z10;
        this.isUpcoming = z11;
        this.imageUrl = str3;
        this.url = str4;
        this.createdAt = j10;
        this.hasReceivableReward = z12;
        this.category = f0Var;
        this.row = i11;
        this.column = i12;
        this.columnsNum = i13;
        this.isNew = z13;
    }

    public final int component1() {
        return this.f26174id;
    }

    public final f0 component10() {
        return this.category;
    }

    public final int component11() {
        return this.row;
    }

    public final int component12() {
        return this.column;
    }

    public final int component13() {
        return this.columnsNum;
    }

    public final boolean component14() {
        return this.isNew;
    }

    public final String component2() {
        return this.text;
    }

    public final String component3() {
        return this.eventPeriod;
    }

    public final boolean component4() {
        return this.isNow;
    }

    public final boolean component5() {
        return this.isUpcoming;
    }

    public final String component6() {
        return this.imageUrl;
    }

    public final String component7() {
        return this.url;
    }

    public final long component8() {
        return this.createdAt;
    }

    public final boolean component9() {
        return this.hasReceivableReward;
    }

    public final CampaignNotice copy(int i10, String str, String str2, boolean z10, boolean z11, String str3, String str4, long j10, boolean z12, f0 f0Var, int i11, int i12, int i13, boolean z13) {
        p.h(str, "text");
        p.h(str2, "eventPeriod");
        p.h(str3, "imageUrl");
        p.h(str4, "url");
        p.h(f0Var, "category");
        return new CampaignNotice(i10, str, str2, z10, z11, str3, str4, j10, z12, f0Var, i11, i12, i13, z13);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CampaignNotice) {
            CampaignNotice campaignNotice = (CampaignNotice) obj;
            return this.f26174id == campaignNotice.f26174id && p.c(this.text, campaignNotice.text) && p.c(this.eventPeriod, campaignNotice.eventPeriod) && this.isNow == campaignNotice.isNow && this.isUpcoming == campaignNotice.isUpcoming && p.c(this.imageUrl, campaignNotice.imageUrl) && p.c(this.url, campaignNotice.url) && this.createdAt == campaignNotice.createdAt && this.hasReceivableReward == campaignNotice.hasReceivableReward && this.category == campaignNotice.category && this.row == campaignNotice.row && this.column == campaignNotice.column && this.columnsNum == campaignNotice.columnsNum && this.isNew == campaignNotice.isNew;
        }
        return false;
    }

    public final f0 getCategory() {
        return this.category;
    }

    public final int getColumn() {
        return this.column;
    }

    public final int getColumnsNum() {
        return this.columnsNum;
    }

    public final long getCreatedAt() {
        return this.createdAt;
    }

    public final String getEventPeriod() {
        return this.eventPeriod;
    }

    public final boolean getHasReceivableReward() {
        return this.hasReceivableReward;
    }

    public final int getId() {
        return this.f26174id;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final int getRow() {
        return this.row;
    }

    public final String getText() {
        return this.text;
    }

    public final String getUrl() {
        return this.url;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((Integer.hashCode(this.f26174id) * 31) + this.text.hashCode()) * 31) + this.eventPeriod.hashCode()) * 31;
        boolean z10 = this.isNow;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        int i11 = (hashCode + i10) * 31;
        boolean z11 = this.isUpcoming;
        int i12 = z11;
        if (z11 != 0) {
            i12 = 1;
        }
        int hashCode2 = (((((((i11 + i12) * 31) + this.imageUrl.hashCode()) * 31) + this.url.hashCode()) * 31) + Long.hashCode(this.createdAt)) * 31;
        boolean z12 = this.hasReceivableReward;
        int i13 = z12;
        if (z12 != 0) {
            i13 = 1;
        }
        int hashCode3 = (((((((((hashCode2 + i13) * 31) + this.category.hashCode()) * 31) + Integer.hashCode(this.row)) * 31) + Integer.hashCode(this.column)) * 31) + Integer.hashCode(this.columnsNum)) * 31;
        boolean z13 = this.isNew;
        return hashCode3 + (z13 ? 1 : z13 ? 1 : 0);
    }

    public final boolean isNew() {
        return this.isNew;
    }

    public final boolean isNow() {
        return this.isNow;
    }

    public final boolean isUpcoming() {
        return this.isUpcoming;
    }

    public final void setCategory(f0 f0Var) {
        p.h(f0Var, "<set-?>");
        this.category = f0Var;
    }

    public final void setColumn(int i10) {
        this.column = i10;
    }

    public final void setColumnsNum(int i10) {
        this.columnsNum = i10;
    }

    public final void setHasReceivableReward(boolean z10) {
        this.hasReceivableReward = z10;
    }

    public final void setId(int i10) {
        this.f26174id = i10;
    }

    public final void setNew(boolean z10) {
        this.isNew = z10;
    }

    public final void setRow(int i10) {
        this.row = i10;
    }

    public String toString() {
        return "CampaignNotice(id=" + this.f26174id + ", text=" + this.text + ", eventPeriod=" + this.eventPeriod + ", isNow=" + this.isNow + ", isUpcoming=" + this.isUpcoming + ", imageUrl=" + this.imageUrl + ", url=" + this.url + ", createdAt=" + this.createdAt + ", hasReceivableReward=" + this.hasReceivableReward + ", category=" + this.category + ", row=" + this.row + ", column=" + this.column + ", columnsNum=" + this.columnsNum + ", isNew=" + this.isNew + ')';
    }

    public /* synthetic */ CampaignNotice(int i10, String str, String str2, boolean z10, boolean z11, String str3, String str4, long j10, boolean z12, f0 f0Var, int i11, int i12, int i13, boolean z13, int i14, h hVar) {
        this((i14 & 1) != 0 ? 0 : i10, str, str2, z10, z11, str3, str4, j10, z12, (i14 & 512) != 0 ? f0.NONE : f0Var, (i14 & 1024) != 0 ? 0 : i11, (i14 & 2048) != 0 ? 0 : i12, (i14 & 4096) != 0 ? 0 : i13, (i14 & 8192) != 0 ? false : z13);
    }
}
