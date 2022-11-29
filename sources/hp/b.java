package hp;

import ep.b0;
import ep.d;
import ep.d0;
import ep.u;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import jo.h;
import jo.p;
import kp.c;
import so.n;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: c  reason: collision with root package name */
    public static final a f36296c = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final b0 f36297a;

    /* renamed from: b  reason: collision with root package name */
    public final d0 f36298b;

    /* loaded from: classes4.dex */
    public static final class a {
        public a() {
        }

        public final boolean a(d0 d0Var, b0 b0Var) {
            p.h(d0Var, "response");
            p.h(b0Var, "request");
            int h10 = d0Var.h();
            if (h10 != 200 && h10 != 410 && h10 != 414 && h10 != 501 && h10 != 203 && h10 != 204) {
                if (h10 != 307) {
                    if (h10 != 308 && h10 != 404 && h10 != 405) {
                        switch (h10) {
                            case 300:
                            case 301:
                                break;
                            case 302:
                                break;
                            default:
                                return false;
                        }
                    }
                }
                if (d0.o(d0Var, "Expires", null, 2, null) == null && d0Var.c().c() == -1 && !d0Var.c().b() && !d0Var.c().a()) {
                    return false;
                }
            }
            return (d0Var.c().h() || b0Var.b().h()) ? false : true;
        }

        public /* synthetic */ a(h hVar) {
            this();
        }
    }

    /* renamed from: hp.b$b  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0460b {

        /* renamed from: a  reason: collision with root package name */
        public Date f36299a;

        /* renamed from: b  reason: collision with root package name */
        public String f36300b;

        /* renamed from: c  reason: collision with root package name */
        public Date f36301c;

        /* renamed from: d  reason: collision with root package name */
        public String f36302d;

        /* renamed from: e  reason: collision with root package name */
        public Date f36303e;

        /* renamed from: f  reason: collision with root package name */
        public long f36304f;

        /* renamed from: g  reason: collision with root package name */
        public long f36305g;

        /* renamed from: h  reason: collision with root package name */
        public String f36306h;

        /* renamed from: i  reason: collision with root package name */
        public int f36307i;

        /* renamed from: j  reason: collision with root package name */
        public final long f36308j;

        /* renamed from: k  reason: collision with root package name */
        public final b0 f36309k;

        /* renamed from: l  reason: collision with root package name */
        public final d0 f36310l;

        public C0460b(long j10, b0 b0Var, d0 d0Var) {
            p.h(b0Var, "request");
            this.f36308j = j10;
            this.f36309k = b0Var;
            this.f36310l = d0Var;
            this.f36307i = -1;
            if (d0Var != null) {
                this.f36304f = d0Var.I();
                this.f36305g = d0Var.F();
                u p10 = d0Var.p();
                int size = p10.size();
                for (int i10 = 0; i10 < size; i10++) {
                    String g10 = p10.g(i10);
                    String m10 = p10.m(i10);
                    if (n.q(g10, "Date", true)) {
                        this.f36299a = c.a(m10);
                        this.f36300b = m10;
                    } else if (n.q(g10, "Expires", true)) {
                        this.f36303e = c.a(m10);
                    } else if (n.q(g10, "Last-Modified", true)) {
                        this.f36301c = c.a(m10);
                        this.f36302d = m10;
                    } else if (n.q(g10, "ETag", true)) {
                        this.f36306h = m10;
                    } else if (n.q(g10, "Age", true)) {
                        this.f36307i = fp.b.R(m10, -1);
                    }
                }
            }
        }

        public final long a() {
            Date date = this.f36299a;
            long max = date != null ? Math.max(0L, this.f36305g - date.getTime()) : 0L;
            int i10 = this.f36307i;
            if (i10 != -1) {
                max = Math.max(max, TimeUnit.SECONDS.toMillis(i10));
            }
            long j10 = this.f36305g;
            return max + (j10 - this.f36304f) + (this.f36308j - j10);
        }

        public final b b() {
            b c10 = c();
            return (c10.b() == null || !this.f36309k.b().i()) ? c10 : new b(null, null);
        }

        public final b c() {
            if (this.f36310l == null) {
                return new b(this.f36309k, null);
            }
            if (this.f36309k.f() && this.f36310l.j() == null) {
                return new b(this.f36309k, null);
            }
            if (!b.f36296c.a(this.f36310l, this.f36309k)) {
                return new b(this.f36309k, null);
            }
            d b10 = this.f36309k.b();
            if (!b10.g() && !e(this.f36309k)) {
                d c10 = this.f36310l.c();
                long a10 = a();
                long d10 = d();
                if (b10.c() != -1) {
                    d10 = Math.min(d10, TimeUnit.SECONDS.toMillis(b10.c()));
                }
                long j10 = 0;
                long millis = b10.e() != -1 ? TimeUnit.SECONDS.toMillis(b10.e()) : 0L;
                if (!c10.f() && b10.d() != -1) {
                    j10 = TimeUnit.SECONDS.toMillis(b10.d());
                }
                if (!c10.g()) {
                    long j11 = millis + a10;
                    if (j11 < j10 + d10) {
                        d0.a z10 = this.f36310l.z();
                        if (j11 >= d10) {
                            z10.a("Warning", "110 HttpURLConnection \"Response is stale\"");
                        }
                        if (a10 > 86400000 && f()) {
                            z10.a("Warning", "113 HttpURLConnection \"Heuristic expiration\"");
                        }
                        return new b(null, z10.c());
                    }
                }
                String str = this.f36306h;
                String str2 = "If-Modified-Since";
                if (str != null) {
                    str2 = "If-None-Match";
                } else if (this.f36301c != null) {
                    str = this.f36302d;
                } else if (this.f36299a != null) {
                    str = this.f36300b;
                } else {
                    return new b(this.f36309k, null);
                }
                u.a j12 = this.f36309k.e().j();
                p.e(str);
                j12.e(str2, str);
                return new b(this.f36309k.h().e(j12.g()).b(), this.f36310l);
            }
            return new b(this.f36309k, null);
        }

        public final long d() {
            d0 d0Var = this.f36310l;
            p.e(d0Var);
            d c10 = d0Var.c();
            if (c10.c() != -1) {
                return TimeUnit.SECONDS.toMillis(c10.c());
            }
            Date date = this.f36303e;
            if (date != null) {
                Date date2 = this.f36299a;
                long time = date.getTime() - (date2 != null ? date2.getTime() : this.f36305g);
                if (time > 0) {
                    return time;
                }
                return 0L;
            } else if (this.f36301c == null || this.f36310l.G().j().p() != null) {
                return 0L;
            } else {
                Date date3 = this.f36299a;
                long time2 = date3 != null ? date3.getTime() : this.f36304f;
                Date date4 = this.f36301c;
                p.e(date4);
                long time3 = time2 - date4.getTime();
                if (time3 > 0) {
                    return time3 / 10;
                }
                return 0L;
            }
        }

        public final boolean e(b0 b0Var) {
            return (b0Var.d("If-Modified-Since") == null && b0Var.d("If-None-Match") == null) ? false : true;
        }

        public final boolean f() {
            d0 d0Var = this.f36310l;
            p.e(d0Var);
            return d0Var.c().c() == -1 && this.f36303e == null;
        }
    }

    public b(b0 b0Var, d0 d0Var) {
        this.f36297a = b0Var;
        this.f36298b = d0Var;
    }

    public final d0 a() {
        return this.f36298b;
    }

    public final b0 b() {
        return this.f36297a;
    }
}
