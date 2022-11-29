package ud;

/* loaded from: classes2.dex */
public final class y1 {

    /* renamed from: n  reason: collision with root package name */
    public static final a f55735n = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final String f55736a;

    /* renamed from: b  reason: collision with root package name */
    public final String f55737b;

    /* renamed from: c  reason: collision with root package name */
    public final String f55738c;

    /* renamed from: d  reason: collision with root package name */
    public final String f55739d;

    /* renamed from: e  reason: collision with root package name */
    public final int f55740e;

    /* renamed from: f  reason: collision with root package name */
    public final int f55741f;

    /* renamed from: g  reason: collision with root package name */
    public final int f55742g;

    /* renamed from: h  reason: collision with root package name */
    public final int f55743h;

    /* renamed from: i  reason: collision with root package name */
    public final int f55744i;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f55745j;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f55746k;

    /* renamed from: l  reason: collision with root package name */
    public final we.g f55747l;

    /* renamed from: m  reason: collision with root package name */
    public final Integer f55748m;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x005b  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x007c  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x007f  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0083  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0086  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final ud.y1 a(android.content.Context r24, int r25, com.dena.mirrorman.net.api.response.live.LiveGiftRankingUser r26) {
            /*
                r23 = this;
                r0 = r24
                r1 = r25
                java.lang.String r2 = "context"
                jo.p.h(r0, r2)
                java.lang.String r2 = "liveGiftRankingUser"
                r3 = r26
                jo.p.h(r3, r2)
                r2 = 3
                r4 = 0
                r5 = 48
                r6 = 14
                r7 = 1
                if (r1 == r7) goto L42
                r8 = 2
                if (r1 == r8) goto L39
                if (r1 == r2) goto L30
                int r5 = nd.w0.Y
                int r0 = c3.a.d(r0, r5)
                r6 = 12
                r5 = 40
                r15 = r0
                r18 = r4
                r17 = r5
                r16 = r6
                goto L51
            L30:
                java.lang.String r0 = "#bf8048"
                int r0 = android.graphics.Color.parseColor(r0)
                int r8 = nd.y0.Z
                goto L4a
            L39:
                int r8 = nd.w0.f42234j
                int r0 = c3.a.d(r0, r8)
                int r8 = nd.y0.Y
                goto L4a
            L42:
                java.lang.String r0 = "#f8cf1c"
                int r0 = android.graphics.Color.parseColor(r0)
                int r8 = nd.y0.X
            L4a:
                r15 = r0
                r17 = r5
                r16 = r6
                r18 = r8
            L51:
                com.dena.mirrorman.net.api.response.user.UserBasicParams r0 = r26.getUser()
                java.lang.String r0 = r0.getCatalogLabelImageUrl()
                if (r0 != 0) goto L5d
                java.lang.String r0 = ""
            L5d:
                r12 = r0
                java.lang.String r10 = java.lang.String.valueOf(r25)
                com.dena.mirrorman.net.api.response.user.UserBasicParams r0 = r26.getUser()
                java.lang.String r11 = r0.getProfileImageUrl()
                com.dena.mirrorman.net.api.response.user.UserBasicParams r0 = r26.getUser()
                java.lang.String r13 = r0.getName()
                int r14 = r26.getPoint()
                int r0 = r12.length()
                if (r0 <= 0) goto L7f
                r19 = r7
                goto L81
            L7f:
                r19 = r4
            L81:
                if (r1 > r2) goto L86
                r20 = r7
                goto L88
            L86:
                r20 = r4
            L88:
                int r0 = r26.getYellRank()
                we.g$a r1 = we.g.Companion
                we.g r21 = r1.a(r0)
                int r0 = r26.getYellLevel()
                java.lang.Integer r22 = java.lang.Integer.valueOf(r0)
                ud.y1 r0 = new ud.y1
                r9 = r0
                r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: ud.y1.a.a(android.content.Context, int, com.dena.mirrorman.net.api.response.live.LiveGiftRankingUser):ud.y1");
        }
    }

    public y1(String str, String str2, String str3, String str4, int i10, int i11, int i12, int i13, int i14, boolean z10, boolean z11, we.g gVar, Integer num) {
        jo.p.h(str, "rank");
        jo.p.h(str2, "profileImageUrl");
        jo.p.h(str3, "continuousStreamerLabelImageUrl");
        jo.p.h(str4, "userName");
        jo.p.h(gVar, "yellRank");
        this.f55736a = str;
        this.f55737b = str2;
        this.f55738c = str3;
        this.f55739d = str4;
        this.f55740e = i10;
        this.f55741f = i11;
        this.f55742g = i12;
        this.f55743h = i13;
        this.f55744i = i14;
        this.f55745j = z10;
        this.f55746k = z11;
        this.f55747l = gVar;
        this.f55748m = num;
    }

    public final String a() {
        return this.f55738c;
    }

    public final int b() {
        return this.f55740e;
    }

    public final int c() {
        return this.f55743h;
    }

    public final String d() {
        return this.f55737b;
    }

    public final String e() {
        return this.f55736a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof y1) {
            y1 y1Var = (y1) obj;
            return jo.p.c(this.f55736a, y1Var.f55736a) && jo.p.c(this.f55737b, y1Var.f55737b) && jo.p.c(this.f55738c, y1Var.f55738c) && jo.p.c(this.f55739d, y1Var.f55739d) && this.f55740e == y1Var.f55740e && this.f55741f == y1Var.f55741f && this.f55742g == y1Var.f55742g && this.f55743h == y1Var.f55743h && this.f55744i == y1Var.f55744i && this.f55745j == y1Var.f55745j && this.f55746k == y1Var.f55746k && this.f55747l == y1Var.f55747l && jo.p.c(this.f55748m, y1Var.f55748m);
        }
        return false;
    }

    public final int f() {
        return this.f55741f;
    }

    public final int g() {
        return this.f55742g;
    }

    public final int h() {
        return this.f55744i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((((((((((((((this.f55736a.hashCode() * 31) + this.f55737b.hashCode()) * 31) + this.f55738c.hashCode()) * 31) + this.f55739d.hashCode()) * 31) + Integer.hashCode(this.f55740e)) * 31) + Integer.hashCode(this.f55741f)) * 31) + Integer.hashCode(this.f55742g)) * 31) + Integer.hashCode(this.f55743h)) * 31) + Integer.hashCode(this.f55744i)) * 31;
        boolean z10 = this.f55745j;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        int i11 = (hashCode + i10) * 31;
        boolean z11 = this.f55746k;
        int hashCode2 = (((i11 + (z11 ? 1 : z11 ? 1 : 0)) * 31) + this.f55747l.hashCode()) * 31;
        Integer num = this.f55748m;
        return hashCode2 + (num == null ? 0 : num.hashCode());
    }

    public final String i() {
        return this.f55739d;
    }

    public final Integer j() {
        return this.f55748m;
    }

    public final we.g k() {
        return this.f55747l;
    }

    public final boolean l() {
        return this.f55745j;
    }

    public final boolean m() {
        return this.f55746k;
    }

    public String toString() {
        return "LiveGiftRankingUserBindModel(rank=" + this.f55736a + ", profileImageUrl=" + this.f55737b + ", continuousStreamerLabelImageUrl=" + this.f55738c + ", userName=" + this.f55739d + ", giftPoint=" + this.f55740e + ", rankTextColor=" + this.f55741f + ", rankTextSize=" + this.f55742g + ", profileImageSize=" + this.f55743h + ", rankingFrameImageResourceId=" + this.f55744i + ", isVisibleContinuousStreamerLabelImage=" + this.f55745j + ", isVisibleGiftPoint=" + this.f55746k + ", yellRank=" + this.f55747l + ", yellLevel=" + this.f55748m + ')';
    }
}
