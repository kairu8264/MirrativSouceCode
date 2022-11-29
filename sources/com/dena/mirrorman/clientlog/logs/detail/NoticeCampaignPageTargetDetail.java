package com.dena.mirrorman.clientlog.logs.detail;

import jo.h;
import jo.p;
import xm.c;
import xm.f;
import xn.r;

/* loaded from: classes2.dex */
public final class NoticeCampaignPageTargetDetail {
    public static final int $stable = 0;
    private final String category;
    private final int column;
    private final int columnsNum;

    /* renamed from: id  reason: collision with root package name */
    private final int f25297id;
    private final int isEnded;
    private final int isNew;
    private final int row;
    private final int section;

    public NoticeCampaignPageTargetDetail(String str, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        p.h(str, "category");
        this.category = str;
        this.f25297id = i10;
        this.row = i11;
        this.column = i12;
        this.columnsNum = i13;
        this.isNew = i14;
        this.isEnded = i15;
        this.section = i16;
    }

    public final String getCategory() {
        return this.category;
    }

    public final int getColumn() {
        return this.column;
    }

    public final int getColumnsNum() {
        return this.columnsNum;
    }

    public final int getId() {
        return this.f25297id;
    }

    public final int getRow() {
        return this.row;
    }

    public final int getSection() {
        return this.section;
    }

    public final int isEnded() {
        return this.isEnded;
    }

    public final int isNew() {
        return this.isNew;
    }

    public final String toArrayJson() {
        String s10 = new f().e(c.LOWER_CASE_WITH_UNDERSCORES).b().s(r.d(this));
        p.g(s10, "GsonBuilder()\n        .s…    .toJson(listOf(this))");
        return s10;
    }

    public final String toJson() {
        String s10 = new f().e(c.LOWER_CASE_WITH_UNDERSCORES).b().s(this);
        p.g(s10, "GsonBuilder()\n        .s…e()\n        .toJson(this)");
        return s10;
    }

    public /* synthetic */ NoticeCampaignPageTargetDetail(String str, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, h hVar) {
        this(str, i10, i11, i12, i13, i14, i15, (i17 & 128) != 0 ? 0 : i16);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public NoticeCampaignPageTargetDetail(com.dena.mirrorman.net.api.response.notice.CampaignNotice r13) {
        /*
            r12 = this;
            java.lang.String r0 = "campaignNotice"
            jo.p.h(r13, r0)
            jf.f0 r0 = r13.getCategory()
            java.lang.String r2 = r0.c()
            int r3 = r13.getId()
            int r4 = r13.getRow()
            int r5 = r13.getColumn()
            int r6 = r13.getColumnsNum()
            boolean r7 = r13.isNew()
            boolean r0 = r13.isNow()
            boolean r13 = r13.isUpcoming()
            r13 = r13 | r0
            r8 = r13 ^ 1
            r9 = 0
            r10 = 128(0x80, float:1.794E-43)
            r11 = 0
            r1 = r12
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dena.mirrorman.clientlog.logs.detail.NoticeCampaignPageTargetDetail.<init>(com.dena.mirrorman.net.api.response.notice.CampaignNotice):void");
    }
}
