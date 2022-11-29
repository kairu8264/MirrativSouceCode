package i6;

import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.google.android.exoplayer2.util.FileTypes;
import com.mirrativ.llstream.protocol.v1.topic.TopicConstant;
import ep.b0;
import ep.d0;
import ep.u;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import jo.h;
import jo.p;
import o6.k;
import o6.v;
import so.n;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: c  reason: collision with root package name */
    public static final a f36341c = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final b0 f36342a;

    /* renamed from: b  reason: collision with root package name */
    public final i6.a f36343b;

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(h hVar) {
            this();
        }

        public final u a(u uVar, u uVar2) {
            u.a aVar = new u.a();
            int size = uVar.size();
            int i10 = 0;
            int i11 = 0;
            while (i11 < size) {
                int i12 = i11 + 1;
                String g10 = uVar.g(i11);
                String m10 = uVar.m(i11);
                if ((!n.q("Warning", g10, true) || !n.C(m10, IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE, false, 2, null)) && (d(g10) || !e(g10) || uVar2.d(g10) == null)) {
                    aVar.b(g10, m10);
                }
                i11 = i12;
            }
            int size2 = uVar2.size();
            while (i10 < size2) {
                int i13 = i10 + 1;
                String g11 = uVar2.g(i10);
                if (!d(g11) && e(g11)) {
                    aVar.b(g11, uVar2.m(i10));
                }
                i10 = i13;
            }
            return aVar.g();
        }

        public final boolean b(b0 b0Var, d0 d0Var) {
            return (b0Var.b().h() || d0Var.c().h() || p.c(d0Var.p().d("Vary"), TopicConstant.MATCH_SINGLE)) ? false : true;
        }

        public final boolean c(b0 b0Var, i6.a aVar) {
            return (b0Var.b().h() || aVar.a().h() || p.c(aVar.d().d("Vary"), TopicConstant.MATCH_SINGLE)) ? false : true;
        }

        public final boolean d(String str) {
            return n.q("Content-Length", str, true) || n.q("Content-Encoding", str, true) || n.q(FileTypes.HEADER_CONTENT_TYPE, str, true);
        }

        public final boolean e(String str) {
            return (n.q("Connection", str, true) || n.q("Keep-Alive", str, true) || n.q("Proxy-Authenticate", str, true) || n.q("Proxy-Authorization", str, true) || n.q("TE", str, true) || n.q("Trailers", str, true) || n.q("Transfer-Encoding", str, true) || n.q("Upgrade", str, true)) ? false : true;
        }
    }

    /* renamed from: i6.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0462b {

        /* renamed from: a  reason: collision with root package name */
        public final b0 f36344a;

        /* renamed from: b  reason: collision with root package name */
        public final i6.a f36345b;

        /* renamed from: c  reason: collision with root package name */
        public Date f36346c;

        /* renamed from: d  reason: collision with root package name */
        public String f36347d;

        /* renamed from: e  reason: collision with root package name */
        public Date f36348e;

        /* renamed from: f  reason: collision with root package name */
        public String f36349f;

        /* renamed from: g  reason: collision with root package name */
        public Date f36350g;

        /* renamed from: h  reason: collision with root package name */
        public long f36351h;

        /* renamed from: i  reason: collision with root package name */
        public long f36352i;

        /* renamed from: j  reason: collision with root package name */
        public String f36353j;

        /* renamed from: k  reason: collision with root package name */
        public int f36354k;

        public C0462b(b0 b0Var, i6.a aVar) {
            this.f36344a = b0Var;
            this.f36345b = aVar;
            this.f36354k = -1;
            if (aVar != null) {
                this.f36351h = aVar.e();
                this.f36352i = aVar.c();
                u d10 = aVar.d();
                int i10 = 0;
                int size = d10.size();
                while (i10 < size) {
                    int i11 = i10 + 1;
                    String g10 = d10.g(i10);
                    String m10 = d10.m(i10);
                    if (n.q(g10, "Date", true)) {
                        this.f36346c = d10.f("Date");
                        this.f36347d = m10;
                    } else if (n.q(g10, "Expires", true)) {
                        this.f36350g = d10.f("Expires");
                    } else if (n.q(g10, "Last-Modified", true)) {
                        this.f36348e = d10.f("Last-Modified");
                        this.f36349f = m10;
                    } else if (n.q(g10, "ETag", true)) {
                        this.f36353j = m10;
                    } else if (n.q(g10, "Age", true)) {
                        this.f36354k = k.y(m10, -1);
                    }
                    i10 = i11;
                }
            }
        }

        public final long a() {
            Date date = this.f36346c;
            long max = date != null ? Math.max(0L, this.f36352i - date.getTime()) : 0L;
            int i10 = this.f36354k;
            if (i10 != -1) {
                max = Math.max(max, TimeUnit.SECONDS.toMillis(i10));
            }
            return max + (this.f36352i - this.f36351h) + (v.f44121a.a() - this.f36352i);
        }

        public final b b() {
            if (this.f36345b == null) {
                return new b(this.f36344a, null, null);
            }
            if (this.f36344a.f() && !this.f36345b.f()) {
                return new b(this.f36344a, null, null);
            }
            ep.d a10 = this.f36345b.a();
            if (!b.f36341c.c(this.f36344a, this.f36345b)) {
                return new b(this.f36344a, null, null);
            }
            ep.d b10 = this.f36344a.b();
            if (!b10.g() && !d(this.f36344a)) {
                long a11 = a();
                long c10 = c();
                if (b10.c() != -1) {
                    c10 = Math.min(c10, TimeUnit.SECONDS.toMillis(b10.c()));
                }
                long j10 = 0;
                long millis = b10.e() != -1 ? TimeUnit.SECONDS.toMillis(b10.e()) : 0L;
                if (!a10.f() && b10.d() != -1) {
                    j10 = TimeUnit.SECONDS.toMillis(b10.d());
                }
                if (!a10.g() && a11 + millis < c10 + j10) {
                    return new b(null, this.f36345b, null);
                }
                String str = this.f36353j;
                String str2 = "If-Modified-Since";
                if (str != null) {
                    str2 = "If-None-Match";
                } else if (this.f36348e != null) {
                    str = this.f36349f;
                } else if (this.f36346c != null) {
                    str = this.f36347d;
                } else {
                    return new b(this.f36344a, null, null);
                }
                u.a j11 = this.f36344a.e().j();
                p.e(str);
                j11.b(str2, str);
                return new b(this.f36344a.h().e(j11.g()).b(), this.f36345b, null);
            }
            return new b(this.f36344a, null, null);
        }

        public final long c() {
            Long valueOf;
            i6.a aVar = this.f36345b;
            p.e(aVar);
            ep.d a10 = aVar.a();
            if (a10.c() != -1) {
                return TimeUnit.SECONDS.toMillis(a10.c());
            }
            Date date = this.f36350g;
            if (date != null) {
                Date date2 = this.f36346c;
                valueOf = date2 != null ? Long.valueOf(date2.getTime()) : null;
                long time = date.getTime() - (valueOf == null ? this.f36352i : valueOf.longValue());
                if (time > 0) {
                    return time;
                }
                return 0L;
            } else if (this.f36348e == null || this.f36344a.j().p() != null) {
                return 0L;
            } else {
                Date date3 = this.f36346c;
                valueOf = date3 != null ? Long.valueOf(date3.getTime()) : null;
                long longValue = valueOf == null ? this.f36351h : valueOf.longValue();
                Date date4 = this.f36348e;
                p.e(date4);
                long time2 = longValue - date4.getTime();
                if (time2 > 0) {
                    return time2 / 10;
                }
                return 0L;
            }
        }

        public final boolean d(b0 b0Var) {
            return (b0Var.d("If-Modified-Since") == null && b0Var.d("If-None-Match") == null) ? false : true;
        }
    }

    public b(b0 b0Var, i6.a aVar) {
        this.f36342a = b0Var;
        this.f36343b = aVar;
    }

    public /* synthetic */ b(b0 b0Var, i6.a aVar, h hVar) {
        this(b0Var, aVar);
    }

    public final i6.a a() {
        return this.f36343b;
    }

    public final b0 b() {
        return this.f36342a;
    }
}
