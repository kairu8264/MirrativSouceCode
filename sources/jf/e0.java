package jf;

import com.dena.mirrorman.net.api.response.notice.NoticeCountsParams;

/* loaded from: classes2.dex */
public final class e0 {

    /* renamed from: i  reason: collision with root package name */
    public static final a f37915i = new a(null);

    /* renamed from: j  reason: collision with root package name */
    public static final int f37916j = 8;

    /* renamed from: a  reason: collision with root package name */
    public boolean f37917a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f37918b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f37919c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f37920d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f37921e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f37922f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f37923g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f37924h;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final e0 a(NoticeCountsParams noticeCountsParams) {
            jo.p.h(noticeCountsParams, "noticeCountsParams");
            return new e0(!jo.p.c(noticeCountsParams.getFolloweeLives(), "0"), !jo.p.c(noticeCountsParams.getChats(), "0"), !jo.p.c(noticeCountsParams.getPresentBoxes(), "0"), !jo.p.c(noticeCountsParams.getYours(), "0"), !jo.p.c(noticeCountsParams.getNews(), "0"), !jo.p.c(noticeCountsParams.getRecommendCampaigns(), "0"), !jo.p.c(noticeCountsParams.getEmomoCampaigns(), "0"), !jo.p.c(noticeCountsParams.getAppCampaigns(), "0"));
        }
    }

    public e0() {
        this(false, false, false, false, false, false, false, false, 255, null);
    }

    public e0(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17) {
        this.f37917a = z10;
        this.f37918b = z11;
        this.f37919c = z12;
        this.f37920d = z13;
        this.f37921e = z14;
        this.f37922f = z15;
        this.f37923g = z16;
        this.f37924h = z17;
    }

    public final boolean a() {
        return this.f37924h;
    }

    public final boolean b() {
        return this.f37922f || this.f37923g || this.f37924h;
    }

    public final boolean c() {
        return this.f37918b;
    }

    public final boolean d() {
        return this.f37923g;
    }

    public final boolean e() {
        return this.f37917a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e0) {
            e0 e0Var = (e0) obj;
            return this.f37917a == e0Var.f37917a && this.f37918b == e0Var.f37918b && this.f37919c == e0Var.f37919c && this.f37920d == e0Var.f37920d && this.f37921e == e0Var.f37921e && this.f37922f == e0Var.f37922f && this.f37923g == e0Var.f37923g && this.f37924h == e0Var.f37924h;
        }
        return false;
    }

    public final boolean f() {
        return this.f37921e;
    }

    public final boolean g() {
        return this.f37919c || this.f37920d || b() || this.f37921e;
    }

    public final boolean h() {
        return this.f37919c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r2v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v8, types: [boolean] */
    public int hashCode() {
        boolean z10 = this.f37917a;
        ?? r02 = z10;
        if (z10) {
            r02 = 1;
        }
        int i10 = r02 * 31;
        ?? r22 = this.f37918b;
        int i11 = r22;
        if (r22 != 0) {
            i11 = 1;
        }
        int i12 = (i10 + i11) * 31;
        ?? r23 = this.f37919c;
        int i13 = r23;
        if (r23 != 0) {
            i13 = 1;
        }
        int i14 = (i12 + i13) * 31;
        ?? r24 = this.f37920d;
        int i15 = r24;
        if (r24 != 0) {
            i15 = 1;
        }
        int i16 = (i14 + i15) * 31;
        ?? r25 = this.f37921e;
        int i17 = r25;
        if (r25 != 0) {
            i17 = 1;
        }
        int i18 = (i16 + i17) * 31;
        ?? r26 = this.f37922f;
        int i19 = r26;
        if (r26 != 0) {
            i19 = 1;
        }
        int i20 = (i18 + i19) * 31;
        ?? r27 = this.f37923g;
        int i21 = r27;
        if (r27 != 0) {
            i21 = 1;
        }
        int i22 = (i20 + i21) * 31;
        boolean z11 = this.f37924h;
        return i22 + (z11 ? 1 : z11 ? 1 : 0);
    }

    public final boolean i() {
        return this.f37922f;
    }

    public final boolean j() {
        return this.f37920d;
    }

    public final void k(boolean z10) {
        this.f37924h = z10;
    }

    public final void l(boolean z10) {
        this.f37918b = z10;
    }

    public final void m(boolean z10) {
        this.f37923g = z10;
    }

    public final void n(boolean z10) {
        this.f37917a = z10;
    }

    public final void o(boolean z10) {
        this.f37921e = z10;
    }

    public final void p(boolean z10) {
        this.f37919c = z10;
    }

    public final void q(boolean z10) {
        this.f37922f = z10;
    }

    public final void r(boolean z10) {
        this.f37920d = z10;
    }

    public String toString() {
        return "NewNotice(isNewFolloweeLives=" + this.f37917a + ", isNewChats=" + this.f37918b + ", isNewPresentBoxNotices=" + this.f37919c + ", isNewYourNotices=" + this.f37920d + ", isNewNewsNotices=" + this.f37921e + ", isNewRecommendCampaigns=" + this.f37922f + ", isNewEmomoCampaigns=" + this.f37923g + ", isNewAppCampaigns=" + this.f37924h + ')';
    }

    public /* synthetic */ e0(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, int i10, jo.h hVar) {
        this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? false : z11, (i10 & 4) != 0 ? false : z12, (i10 & 8) != 0 ? false : z13, (i10 & 16) != 0 ? false : z14, (i10 & 32) != 0 ? false : z15, (i10 & 64) != 0 ? false : z16, (i10 & 128) == 0 ? z17 : false);
    }
}
