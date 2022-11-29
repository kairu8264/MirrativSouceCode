package ud;

import com.dena.mirrorman.net.api.response.YelledUser;

/* loaded from: classes2.dex */
public abstract class x1 {

    /* loaded from: classes2.dex */
    public static final class a extends x1 {

        /* renamed from: c  reason: collision with root package name */
        public static final C0869a f55668c = new C0869a(null);

        /* renamed from: a  reason: collision with root package name */
        public final String f55669a;

        /* renamed from: b  reason: collision with root package name */
        public final String f55670b;

        /* renamed from: ud.x1$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0869a {
            public C0869a() {
            }

            public /* synthetic */ C0869a(jo.h hVar) {
                this();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, String str2) {
            super(null);
            jo.p.h(str, "bannerUrl");
            jo.p.h(str2, "yellLpUrl");
            this.f55669a = str;
            this.f55670b = str2;
        }

        public final String a() {
            return this.f55669a;
        }

        public final String b() {
            return this.f55670b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return jo.p.c(this.f55669a, aVar.f55669a) && jo.p.c(this.f55670b, aVar.f55670b);
            }
            return false;
        }

        public int hashCode() {
            return (this.f55669a.hashCode() * 31) + this.f55670b.hashCode();
        }

        public String toString() {
            return "Banner(bannerUrl=" + this.f55669a + ", yellLpUrl=" + this.f55670b + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends x1 {

        /* renamed from: a  reason: collision with root package name */
        public static final b f55671a = new b();

        public b() {
            super(null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends x1 {

        /* renamed from: a  reason: collision with root package name */
        public static final c f55672a = new c();

        public c() {
            super(null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends x1 {

        /* renamed from: c  reason: collision with root package name */
        public static final a f55673c = new a(null);

        /* renamed from: a  reason: collision with root package name */
        public final we.g f55674a;

        /* renamed from: b  reason: collision with root package name */
        public final String f55675b;

        /* loaded from: classes2.dex */
        public static final class a {
            public a() {
            }

            public /* synthetic */ a(jo.h hVar) {
                this();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(we.g gVar, String str) {
            super(null);
            jo.p.h(gVar, "rank");
            jo.p.h(str, "yellBonusDescription");
            this.f55674a = gVar;
            this.f55675b = str;
        }

        public final we.g a() {
            return this.f55674a;
        }

        public final String b() {
            return this.f55675b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof d) {
                d dVar = (d) obj;
                return this.f55674a == dVar.f55674a && jo.p.c(this.f55675b, dVar.f55675b);
            }
            return false;
        }

        public int hashCode() {
            return (this.f55674a.hashCode() * 31) + this.f55675b.hashCode();
        }

        public String toString() {
            return "Rank(rank=" + this.f55674a + ", yellBonusDescription=" + this.f55675b + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends x1 {

        /* renamed from: h  reason: collision with root package name */
        public static final a f55676h = new a(null);

        /* renamed from: a  reason: collision with root package name */
        public final String f55677a;

        /* renamed from: b  reason: collision with root package name */
        public final String f55678b;

        /* renamed from: c  reason: collision with root package name */
        public final String f55679c;

        /* renamed from: d  reason: collision with root package name */
        public final String f55680d;

        /* renamed from: e  reason: collision with root package name */
        public final boolean f55681e;

        /* renamed from: f  reason: collision with root package name */
        public final we.g f55682f;

        /* renamed from: g  reason: collision with root package name */
        public final int f55683g;

        /* loaded from: classes2.dex */
        public static final class a {
            public a() {
            }

            public /* synthetic */ a(jo.h hVar) {
                this();
            }

            public final e a(YelledUser yelledUser) {
                jo.p.h(yelledUser, "yelledUser");
                String userId = yelledUser.getUserId();
                String profileImageUrl = yelledUser.getProfileImageUrl();
                String name = yelledUser.getName();
                String catalogLabelImageUrl = yelledUser.getCatalogLabelImageUrl();
                if (catalogLabelImageUrl == null) {
                    catalogLabelImageUrl = "";
                }
                String str = catalogLabelImageUrl;
                String catalogLabelImageUrl2 = yelledUser.getCatalogLabelImageUrl();
                return new e(userId, profileImageUrl, str, name, !(catalogLabelImageUrl2 == null || catalogLabelImageUrl2.length() == 0), we.g.Companion.a(yelledUser.getYellRank().getRawValue()), yelledUser.getYellLevel());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str, String str2, String str3, String str4, boolean z10, we.g gVar, int i10) {
            super(null);
            jo.p.h(str, "userId");
            jo.p.h(str2, "profileImageUrl");
            jo.p.h(str3, "continuousStreamerLabelImageUrl");
            jo.p.h(str4, "userName");
            jo.p.h(gVar, "yellRank");
            this.f55677a = str;
            this.f55678b = str2;
            this.f55679c = str3;
            this.f55680d = str4;
            this.f55681e = z10;
            this.f55682f = gVar;
            this.f55683g = i10;
        }

        public final String a() {
            return this.f55679c;
        }

        public final String b() {
            return this.f55678b;
        }

        public final String c() {
            return this.f55677a;
        }

        public final String d() {
            return this.f55680d;
        }

        public final int e() {
            return this.f55683g;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof e) {
                e eVar = (e) obj;
                return jo.p.c(this.f55677a, eVar.f55677a) && jo.p.c(this.f55678b, eVar.f55678b) && jo.p.c(this.f55679c, eVar.f55679c) && jo.p.c(this.f55680d, eVar.f55680d) && this.f55681e == eVar.f55681e && this.f55682f == eVar.f55682f && this.f55683g == eVar.f55683g;
            }
            return false;
        }

        public final we.g f() {
            return this.f55682f;
        }

        public final boolean g() {
            return this.f55681e;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int hashCode = ((((((this.f55677a.hashCode() * 31) + this.f55678b.hashCode()) * 31) + this.f55679c.hashCode()) * 31) + this.f55680d.hashCode()) * 31;
            boolean z10 = this.f55681e;
            int i10 = z10;
            if (z10 != 0) {
                i10 = 1;
            }
            return ((((hashCode + i10) * 31) + this.f55682f.hashCode()) * 31) + Integer.hashCode(this.f55683g);
        }

        public String toString() {
            return "User(userId=" + this.f55677a + ", profileImageUrl=" + this.f55678b + ", continuousStreamerLabelImageUrl=" + this.f55679c + ", userName=" + this.f55680d + ", isVisibleContinuousStreamerLabelImage=" + this.f55681e + ", yellRank=" + this.f55682f + ", yellLevel=" + this.f55683g + ')';
        }
    }

    public x1() {
    }

    public /* synthetic */ x1(jo.h hVar) {
        this();
    }
}
