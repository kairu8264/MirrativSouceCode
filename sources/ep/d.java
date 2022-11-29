package ep;

import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f30810a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f30811b;

    /* renamed from: c  reason: collision with root package name */
    public final int f30812c;

    /* renamed from: d  reason: collision with root package name */
    public final int f30813d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f30814e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f30815f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f30816g;

    /* renamed from: h  reason: collision with root package name */
    public final int f30817h;

    /* renamed from: i  reason: collision with root package name */
    public final int f30818i;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f30819j;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f30820k;

    /* renamed from: l  reason: collision with root package name */
    public final boolean f30821l;

    /* renamed from: m  reason: collision with root package name */
    public String f30822m;

    /* renamed from: p  reason: collision with root package name */
    public static final b f30809p = new b(null);

    /* renamed from: n  reason: collision with root package name */
    public static final d f30807n = new a().d().a();

    /* renamed from: o  reason: collision with root package name */
    public static final d f30808o = new a().f().c(Integer.MAX_VALUE, TimeUnit.SECONDS).a();

    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public boolean f30823a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f30824b;

        /* renamed from: c  reason: collision with root package name */
        public int f30825c = -1;

        /* renamed from: d  reason: collision with root package name */
        public int f30826d = -1;

        /* renamed from: e  reason: collision with root package name */
        public int f30827e = -1;

        /* renamed from: f  reason: collision with root package name */
        public boolean f30828f;

        /* renamed from: g  reason: collision with root package name */
        public boolean f30829g;

        /* renamed from: h  reason: collision with root package name */
        public boolean f30830h;

        public final d a() {
            return new d(this.f30823a, this.f30824b, this.f30825c, -1, false, false, false, this.f30826d, this.f30827e, this.f30828f, this.f30829g, this.f30830h, null, null);
        }

        public final int b(long j10) {
            if (j10 > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }
            return (int) j10;
        }

        public final a c(int i10, TimeUnit timeUnit) {
            jo.p.h(timeUnit, "timeUnit");
            if (i10 >= 0) {
                this.f30826d = b(timeUnit.toSeconds(i10));
                return this;
            }
            throw new IllegalArgumentException(("maxStale < 0: " + i10).toString());
        }

        public final a d() {
            this.f30823a = true;
            return this;
        }

        public final a e() {
            this.f30824b = true;
            return this;
        }

        public final a f() {
            this.f30828f = true;
            return this;
        }
    }

    /* loaded from: classes4.dex */
    public static final class b {
        public b() {
        }

        public final int a(String str, String str2, int i10) {
            int length = str.length();
            while (i10 < length) {
                if (so.o.G(str2, str.charAt(i10), false, 2, null)) {
                    return i10;
                }
                i10++;
            }
            return str.length();
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x004a  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00d9  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00dd  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final ep.d b(ep.u r32) {
            /*
                Method dump skipped, instructions count: 395
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: ep.d.b.b(ep.u):ep.d");
        }

        public /* synthetic */ b(jo.h hVar) {
            this();
        }
    }

    public d(boolean z10, boolean z11, int i10, int i11, boolean z12, boolean z13, boolean z14, int i12, int i13, boolean z15, boolean z16, boolean z17, String str) {
        this.f30810a = z10;
        this.f30811b = z11;
        this.f30812c = i10;
        this.f30813d = i11;
        this.f30814e = z12;
        this.f30815f = z13;
        this.f30816g = z14;
        this.f30817h = i12;
        this.f30818i = i13;
        this.f30819j = z15;
        this.f30820k = z16;
        this.f30821l = z17;
        this.f30822m = str;
    }

    public final boolean a() {
        return this.f30814e;
    }

    public final boolean b() {
        return this.f30815f;
    }

    public final int c() {
        return this.f30812c;
    }

    public final int d() {
        return this.f30817h;
    }

    public final int e() {
        return this.f30818i;
    }

    public final boolean f() {
        return this.f30816g;
    }

    public final boolean g() {
        return this.f30810a;
    }

    public final boolean h() {
        return this.f30811b;
    }

    public final boolean i() {
        return this.f30819j;
    }

    public String toString() {
        String str = this.f30822m;
        if (str == null) {
            StringBuilder sb2 = new StringBuilder();
            if (this.f30810a) {
                sb2.append("no-cache, ");
            }
            if (this.f30811b) {
                sb2.append("no-store, ");
            }
            if (this.f30812c != -1) {
                sb2.append("max-age=");
                sb2.append(this.f30812c);
                sb2.append(", ");
            }
            if (this.f30813d != -1) {
                sb2.append("s-maxage=");
                sb2.append(this.f30813d);
                sb2.append(", ");
            }
            if (this.f30814e) {
                sb2.append("private, ");
            }
            if (this.f30815f) {
                sb2.append("public, ");
            }
            if (this.f30816g) {
                sb2.append("must-revalidate, ");
            }
            if (this.f30817h != -1) {
                sb2.append("max-stale=");
                sb2.append(this.f30817h);
                sb2.append(", ");
            }
            if (this.f30818i != -1) {
                sb2.append("min-fresh=");
                sb2.append(this.f30818i);
                sb2.append(", ");
            }
            if (this.f30819j) {
                sb2.append("only-if-cached, ");
            }
            if (this.f30820k) {
                sb2.append("no-transform, ");
            }
            if (this.f30821l) {
                sb2.append("immutable, ");
            }
            if (sb2.length() == 0) {
                return "";
            }
            sb2.delete(sb2.length() - 2, sb2.length());
            String sb3 = sb2.toString();
            jo.p.g(sb3, "StringBuilder().apply(builderAction).toString()");
            this.f30822m = sb3;
            return sb3;
        }
        return str;
    }

    public /* synthetic */ d(boolean z10, boolean z11, int i10, int i11, boolean z12, boolean z13, boolean z14, int i12, int i13, boolean z15, boolean z16, boolean z17, String str, jo.h hVar) {
        this(z10, z11, i10, i11, z12, z13, z14, i12, i13, z15, z16, z17, str);
    }
}
