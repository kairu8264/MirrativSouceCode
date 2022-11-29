package fm;

import gi.q;
import gi.s;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: p  reason: collision with root package name */
    public static final a f32018p = new C0355a().a();

    /* renamed from: a  reason: collision with root package name */
    public final long f32019a;

    /* renamed from: b  reason: collision with root package name */
    public final String f32020b;

    /* renamed from: c  reason: collision with root package name */
    public final String f32021c;

    /* renamed from: d  reason: collision with root package name */
    public final c f32022d;

    /* renamed from: e  reason: collision with root package name */
    public final d f32023e;

    /* renamed from: f  reason: collision with root package name */
    public final String f32024f;

    /* renamed from: g  reason: collision with root package name */
    public final String f32025g;

    /* renamed from: h  reason: collision with root package name */
    public final int f32026h;

    /* renamed from: i  reason: collision with root package name */
    public final int f32027i;

    /* renamed from: j  reason: collision with root package name */
    public final String f32028j;

    /* renamed from: k  reason: collision with root package name */
    public final long f32029k;

    /* renamed from: l  reason: collision with root package name */
    public final b f32030l;

    /* renamed from: m  reason: collision with root package name */
    public final String f32031m;

    /* renamed from: n  reason: collision with root package name */
    public final long f32032n;

    /* renamed from: o  reason: collision with root package name */
    public final String f32033o;

    /* renamed from: fm.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0355a {

        /* renamed from: a  reason: collision with root package name */
        public long f32034a = 0;

        /* renamed from: b  reason: collision with root package name */
        public String f32035b = "";

        /* renamed from: c  reason: collision with root package name */
        public String f32036c = "";

        /* renamed from: d  reason: collision with root package name */
        public c f32037d = c.UNKNOWN;

        /* renamed from: e  reason: collision with root package name */
        public d f32038e = d.UNKNOWN_OS;

        /* renamed from: f  reason: collision with root package name */
        public String f32039f = "";

        /* renamed from: g  reason: collision with root package name */
        public String f32040g = "";

        /* renamed from: h  reason: collision with root package name */
        public int f32041h = 0;

        /* renamed from: i  reason: collision with root package name */
        public int f32042i = 0;

        /* renamed from: j  reason: collision with root package name */
        public String f32043j = "";

        /* renamed from: k  reason: collision with root package name */
        public long f32044k = 0;

        /* renamed from: l  reason: collision with root package name */
        public b f32045l = b.UNKNOWN_EVENT;

        /* renamed from: m  reason: collision with root package name */
        public String f32046m = "";

        /* renamed from: n  reason: collision with root package name */
        public long f32047n = 0;

        /* renamed from: o  reason: collision with root package name */
        public String f32048o = "";

        public a a() {
            return new a(this.f32034a, this.f32035b, this.f32036c, this.f32037d, this.f32038e, this.f32039f, this.f32040g, this.f32041h, this.f32042i, this.f32043j, this.f32044k, this.f32045l, this.f32046m, this.f32047n, this.f32048o);
        }

        public C0355a b(String str) {
            this.f32046m = str;
            return this;
        }

        public C0355a c(String str) {
            this.f32040g = str;
            return this;
        }

        public C0355a d(String str) {
            this.f32048o = str;
            return this;
        }

        public C0355a e(b bVar) {
            this.f32045l = bVar;
            return this;
        }

        public C0355a f(String str) {
            this.f32036c = str;
            return this;
        }

        public C0355a g(String str) {
            this.f32035b = str;
            return this;
        }

        public C0355a h(c cVar) {
            this.f32037d = cVar;
            return this;
        }

        public C0355a i(String str) {
            this.f32039f = str;
            return this;
        }

        public C0355a j(long j10) {
            this.f32034a = j10;
            return this;
        }

        public C0355a k(d dVar) {
            this.f32038e = dVar;
            return this;
        }

        public C0355a l(String str) {
            this.f32043j = str;
            return this;
        }

        public C0355a m(int i10) {
            this.f32042i = i10;
            return this;
        }
    }

    /* loaded from: classes4.dex */
    public enum b implements q {
        UNKNOWN_EVENT(0),
        MESSAGE_DELIVERED(1),
        MESSAGE_OPEN(2);
        
        private final int number_;

        b(int i10) {
            this.number_ = i10;
        }

        @Override // gi.q
        public int getNumber() {
            return this.number_;
        }
    }

    /* loaded from: classes4.dex */
    public enum c implements q {
        UNKNOWN(0),
        DATA_MESSAGE(1),
        TOPIC(2),
        DISPLAY_NOTIFICATION(3);
        
        private final int number_;

        c(int i10) {
            this.number_ = i10;
        }

        @Override // gi.q
        public int getNumber() {
            return this.number_;
        }
    }

    /* loaded from: classes4.dex */
    public enum d implements q {
        UNKNOWN_OS(0),
        ANDROID(1),
        IOS(2),
        WEB(3);
        
        private final int number_;

        d(int i10) {
            this.number_ = i10;
        }

        @Override // gi.q
        public int getNumber() {
            return this.number_;
        }
    }

    public a(long j10, String str, String str2, c cVar, d dVar, String str3, String str4, int i10, int i11, String str5, long j11, b bVar, String str6, long j12, String str7) {
        this.f32019a = j10;
        this.f32020b = str;
        this.f32021c = str2;
        this.f32022d = cVar;
        this.f32023e = dVar;
        this.f32024f = str3;
        this.f32025g = str4;
        this.f32026h = i10;
        this.f32027i = i11;
        this.f32028j = str5;
        this.f32029k = j11;
        this.f32030l = bVar;
        this.f32031m = str6;
        this.f32032n = j12;
        this.f32033o = str7;
    }

    public static C0355a p() {
        return new C0355a();
    }

    @s(zza = 13)
    public String a() {
        return this.f32031m;
    }

    @s(zza = 11)
    public long b() {
        return this.f32029k;
    }

    @s(zza = 14)
    public long c() {
        return this.f32032n;
    }

    @s(zza = 7)
    public String d() {
        return this.f32025g;
    }

    @s(zza = 15)
    public String e() {
        return this.f32033o;
    }

    @s(zza = 12)
    public b f() {
        return this.f32030l;
    }

    @s(zza = 3)
    public String g() {
        return this.f32021c;
    }

    @s(zza = 2)
    public String h() {
        return this.f32020b;
    }

    @s(zza = 4)
    public c i() {
        return this.f32022d;
    }

    @s(zza = 6)
    public String j() {
        return this.f32024f;
    }

    @s(zza = 8)
    public int k() {
        return this.f32026h;
    }

    @s(zza = 1)
    public long l() {
        return this.f32019a;
    }

    @s(zza = 5)
    public d m() {
        return this.f32023e;
    }

    @s(zza = 10)
    public String n() {
        return this.f32028j;
    }

    @s(zza = 9)
    public int o() {
        return this.f32027i;
    }
}
