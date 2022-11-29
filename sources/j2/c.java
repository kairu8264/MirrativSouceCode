package j2;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: c  reason: collision with root package name */
    public static final b f37061c = new b(null);

    /* renamed from: d  reason: collision with root package name */
    public static final c f37062d = new c(a.f37065a.a(), C0492c.f37070a.a(), null);

    /* renamed from: a  reason: collision with root package name */
    public final int f37063a;

    /* renamed from: b  reason: collision with root package name */
    public final int f37064b;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static final C0491a f37065a = new C0491a(null);

        /* renamed from: b  reason: collision with root package name */
        public static final int f37066b = b(0);

        /* renamed from: c  reason: collision with root package name */
        public static final int f37067c = b(50);

        /* renamed from: d  reason: collision with root package name */
        public static final int f37068d = b(-1);

        /* renamed from: e  reason: collision with root package name */
        public static final int f37069e = b(100);

        /* renamed from: j2.c$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0491a {
            public C0491a() {
            }

            public /* synthetic */ C0491a(jo.h hVar) {
                this();
            }

            public final int a() {
                return a.f37068d;
            }
        }

        public static int b(int i10) {
            boolean z10 = true;
            if (!(i10 >= 0 && i10 < 101) && i10 != -1) {
                z10 = false;
            }
            if (z10) {
                return i10;
            }
            throw new IllegalStateException("topRatio should be in [0..100] range or -1".toString());
        }

        public static final boolean c(int i10, int i11) {
            return i10 == i11;
        }

        public static int d(int i10) {
            return Integer.hashCode(i10);
        }

        public static String e(int i10) {
            if (i10 == f37066b) {
                return "LineHeightStyle.Alignment.Top";
            }
            if (i10 == f37067c) {
                return "LineHeightStyle.Alignment.Center";
            }
            if (i10 == f37068d) {
                return "LineHeightStyle.Alignment.Proportional";
            }
            if (i10 == f37069e) {
                return "LineHeightStyle.Alignment.Bottom";
            }
            return "LineHeightStyle.Alignment(topPercentage = " + i10 + ')';
        }
    }

    /* loaded from: classes.dex */
    public static final class b {
        public b() {
        }

        public /* synthetic */ b(jo.h hVar) {
            this();
        }

        public final c a() {
            return c.f37062d;
        }
    }

    /* renamed from: j2.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0492c {

        /* renamed from: a  reason: collision with root package name */
        public static final a f37070a = new a(null);

        /* renamed from: b  reason: collision with root package name */
        public static final int f37071b = b(1);

        /* renamed from: c  reason: collision with root package name */
        public static final int f37072c = b(16);

        /* renamed from: d  reason: collision with root package name */
        public static final int f37073d = b(17);

        /* renamed from: e  reason: collision with root package name */
        public static final int f37074e = b(0);

        /* renamed from: j2.c$c$a */
        /* loaded from: classes.dex */
        public static final class a {
            public a() {
            }

            public /* synthetic */ a(jo.h hVar) {
                this();
            }

            public final int a() {
                return C0492c.f37073d;
            }
        }

        public static int b(int i10) {
            return i10;
        }

        public static final boolean c(int i10, int i11) {
            return i10 == i11;
        }

        public static int d(int i10) {
            return Integer.hashCode(i10);
        }

        public static final boolean e(int i10) {
            return (i10 & 1) > 0;
        }

        public static final boolean f(int i10) {
            return (i10 & 16) > 0;
        }

        public static String g(int i10) {
            return i10 == f37071b ? "LineHeightStyle.Trim.FirstLineTop" : i10 == f37072c ? "LineHeightStyle.Trim.LastLineBottom" : i10 == f37073d ? "LineHeightStyle.Trim.Both" : i10 == f37074e ? "LineHeightStyle.Trim.None" : "Invalid";
        }
    }

    public c(int i10, int i11) {
        this.f37063a = i10;
        this.f37064b = i11;
    }

    public /* synthetic */ c(int i10, int i11, jo.h hVar) {
        this(i10, i11);
    }

    public final int b() {
        return this.f37063a;
    }

    public final int c() {
        return this.f37064b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            return a.c(this.f37063a, cVar.f37063a) && C0492c.c(this.f37064b, cVar.f37064b);
        }
        return false;
    }

    public int hashCode() {
        return (a.d(this.f37063a) * 31) + C0492c.d(this.f37064b);
    }

    public String toString() {
        return "LineHeightStyle(alignment=" + ((Object) a.e(this.f37063a)) + ", trim=" + ((Object) C0492c.g(this.f37064b)) + ')';
    }
}
