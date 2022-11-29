package ad;

/* loaded from: classes2.dex */
public final class s {

    /* renamed from: s  reason: collision with root package name */
    public static final a f1303s = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final int f1304a;

    /* renamed from: b  reason: collision with root package name */
    public final int f1305b;

    /* renamed from: c  reason: collision with root package name */
    public final int f1306c;

    /* renamed from: d  reason: collision with root package name */
    public final String f1307d;

    /* renamed from: e  reason: collision with root package name */
    public final df.c f1308e;

    /* renamed from: f  reason: collision with root package name */
    public final String f1309f;

    /* renamed from: g  reason: collision with root package name */
    public final String f1310g;

    /* renamed from: h  reason: collision with root package name */
    public final String f1311h;

    /* renamed from: i  reason: collision with root package name */
    public final int f1312i;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f1313j;

    /* renamed from: k  reason: collision with root package name */
    public final l2 f1314k;

    /* renamed from: l  reason: collision with root package name */
    public final String f1315l;

    /* renamed from: m  reason: collision with root package name */
    public final String f1316m;

    /* renamed from: n  reason: collision with root package name */
    public final String f1317n;

    /* renamed from: o  reason: collision with root package name */
    public final String f1318o;

    /* renamed from: p  reason: collision with root package name */
    public final String f1319p;

    /* renamed from: q  reason: collision with root package name */
    public final boolean f1320q;

    /* renamed from: r  reason: collision with root package name */
    public final boolean f1321r;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        /* JADX WARN: Removed duplicated region for block: B:46:0x017f  */
        /* JADX WARN: Removed duplicated region for block: B:59:0x01a0  */
        /* JADX WARN: Removed duplicated region for block: B:60:0x01a2  */
        /* JADX WARN: Removed duplicated region for block: B:63:0x01a9  */
        /* JADX WARN: Removed duplicated region for block: B:64:0x01ac  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final ad.s a(com.dena.mirrativ.mirrativapi.user.ContractLiveResultResponse r24, android.content.res.Resources r25) {
            /*
                Method dump skipped, instructions count: 469
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: ad.s.a.a(com.dena.mirrativ.mirrativapi.user.ContractLiveResultResponse, android.content.res.Resources):ad.s");
        }
    }

    public s(int i10, int i11, int i12, String str, df.c cVar, String str2, String str3, String str4, int i13, boolean z10, l2 l2Var, String str5, String str6, String str7, String str8, String str9, boolean z11, boolean z12) {
        jo.p.h(str, "broadCastTime");
        jo.p.h(cVar, "seasonRatingRank");
        jo.p.h(str2, "cashBonusQuarterOfHourText");
        jo.p.h(str3, "broadCastCountQuarterOfHourText");
        jo.p.h(str4, "broadCastBonusAmountText");
        jo.p.h(str5, "coinGiftAmountText");
        jo.p.h(str6, "coinGiftRate");
        jo.p.h(str7, "coinGiftCashBonusAmountText");
        jo.p.h(str8, "coinAnimationAssetName");
        jo.p.h(str9, "coinAnimationAssetImageFolder");
        this.f1304a = i10;
        this.f1305b = i11;
        this.f1306c = i12;
        this.f1307d = str;
        this.f1308e = cVar;
        this.f1309f = str2;
        this.f1310g = str3;
        this.f1311h = str4;
        this.f1312i = i13;
        this.f1313j = z10;
        this.f1314k = l2Var;
        this.f1315l = str5;
        this.f1316m = str6;
        this.f1317n = str7;
        this.f1318o = str8;
        this.f1319p = str9;
        this.f1320q = z11;
        this.f1321r = z12;
    }

    public final int a() {
        return this.f1304a;
    }

    public final int b() {
        return this.f1306c;
    }

    public final String c() {
        return this.f1311h;
    }

    public final int d() {
        return this.f1312i;
    }

    public final String e() {
        return this.f1310g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof s) {
            s sVar = (s) obj;
            return this.f1304a == sVar.f1304a && this.f1305b == sVar.f1305b && this.f1306c == sVar.f1306c && jo.p.c(this.f1307d, sVar.f1307d) && this.f1308e == sVar.f1308e && jo.p.c(this.f1309f, sVar.f1309f) && jo.p.c(this.f1310g, sVar.f1310g) && jo.p.c(this.f1311h, sVar.f1311h) && this.f1312i == sVar.f1312i && this.f1313j == sVar.f1313j && this.f1314k == sVar.f1314k && jo.p.c(this.f1315l, sVar.f1315l) && jo.p.c(this.f1316m, sVar.f1316m) && jo.p.c(this.f1317n, sVar.f1317n) && jo.p.c(this.f1318o, sVar.f1318o) && jo.p.c(this.f1319p, sVar.f1319p) && this.f1320q == sVar.f1320q && this.f1321r == sVar.f1321r;
        }
        return false;
    }

    public final String f() {
        return this.f1307d;
    }

    public final String g() {
        return this.f1309f;
    }

    public final String h() {
        return this.f1319p;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((((((((((((((Integer.hashCode(this.f1304a) * 31) + Integer.hashCode(this.f1305b)) * 31) + Integer.hashCode(this.f1306c)) * 31) + this.f1307d.hashCode()) * 31) + this.f1308e.hashCode()) * 31) + this.f1309f.hashCode()) * 31) + this.f1310g.hashCode()) * 31) + this.f1311h.hashCode()) * 31) + Integer.hashCode(this.f1312i)) * 31;
        boolean z10 = this.f1313j;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        int i11 = (hashCode + i10) * 31;
        l2 l2Var = this.f1314k;
        int hashCode2 = (((((((((((i11 + (l2Var == null ? 0 : l2Var.hashCode())) * 31) + this.f1315l.hashCode()) * 31) + this.f1316m.hashCode()) * 31) + this.f1317n.hashCode()) * 31) + this.f1318o.hashCode()) * 31) + this.f1319p.hashCode()) * 31;
        boolean z11 = this.f1320q;
        int i12 = z11;
        if (z11 != 0) {
            i12 = 1;
        }
        int i13 = (hashCode2 + i12) * 31;
        boolean z12 = this.f1321r;
        return i13 + (z12 ? 1 : z12 ? 1 : 0);
    }

    public final String i() {
        return this.f1318o;
    }

    public final String j() {
        return this.f1315l;
    }

    public final String k() {
        return this.f1317n;
    }

    public final String l() {
        return this.f1316m;
    }

    public final int m() {
        return this.f1305b;
    }

    public final l2 n() {
        return this.f1314k;
    }

    public final df.c o() {
        return this.f1308e;
    }

    public final boolean p() {
        return this.f1321r;
    }

    public final boolean q() {
        return this.f1320q;
    }

    public final boolean r() {
        return this.f1313j;
    }

    public String toString() {
        return "BroadCastResultCashBonusBindModel(amount=" + this.f1304a + ", currentMonthAmount=" + this.f1305b + ", beforeCurrentMonthAmount=" + this.f1306c + ", broadCastTime=" + this.f1307d + ", seasonRatingRank=" + this.f1308e + ", cashBonusQuarterOfHourText=" + this.f1309f + ", broadCastCountQuarterOfHourText=" + this.f1310g + ", broadCastBonusAmountText=" + this.f1311h + ", broadCastBonusAmountTextColor=" + this.f1312i + ", isVisibleMax=" + this.f1313j + ", rankingGrade=" + this.f1314k + ", coinGiftAmountText=" + this.f1315l + ", coinGiftRate=" + this.f1316m + ", coinGiftCashBonusAmountText=" + this.f1317n + ", coinAnimationAssetName=" + this.f1318o + ", coinAnimationAssetImageFolder=" + this.f1319p + ", isVisibleCoinGift=" + this.f1320q + ", isVisibleCoinAnimation=" + this.f1321r + ')';
    }
}
