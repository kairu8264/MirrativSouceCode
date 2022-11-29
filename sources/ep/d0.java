package ep;

import ep.u;
import java.io.Closeable;
import java.util.List;

/* loaded from: classes4.dex */
public final class d0 implements Closeable {
    public final int A;
    public final t B;
    public final u C;
    public final e0 D;
    public final d0 E;
    public final d0 F;
    public final d0 G;
    public final long H;
    public final long I;
    public final jp.c J;

    /* renamed from: w  reason: collision with root package name */
    public d f30831w;

    /* renamed from: x  reason: collision with root package name */
    public final b0 f30832x;

    /* renamed from: y  reason: collision with root package name */
    public final a0 f30833y;

    /* renamed from: z  reason: collision with root package name */
    public final String f30834z;

    public d0(b0 b0Var, a0 a0Var, String str, int i10, t tVar, u uVar, e0 e0Var, d0 d0Var, d0 d0Var2, d0 d0Var3, long j10, long j11, jp.c cVar) {
        jo.p.h(b0Var, "request");
        jo.p.h(a0Var, "protocol");
        jo.p.h(str, "message");
        jo.p.h(uVar, "headers");
        this.f30832x = b0Var;
        this.f30833y = a0Var;
        this.f30834z = str;
        this.A = i10;
        this.B = tVar;
        this.C = uVar;
        this.D = e0Var;
        this.E = d0Var;
        this.F = d0Var2;
        this.G = d0Var3;
        this.H = j10;
        this.I = j11;
        this.J = cVar;
    }

    public static /* synthetic */ String o(d0 d0Var, String str, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = null;
        }
        return d0Var.n(str, str2);
    }

    public final d0 C() {
        return this.G;
    }

    public final a0 E() {
        return this.f30833y;
    }

    public final long F() {
        return this.I;
    }

    public final b0 G() {
        return this.f30832x;
    }

    public final long I() {
        return this.H;
    }

    public final e0 a() {
        return this.D;
    }

    public final d c() {
        d dVar = this.f30831w;
        if (dVar == null) {
            d b10 = d.f30809p.b(this.C);
            this.f30831w = b10;
            return b10;
        }
        return dVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        e0 e0Var = this.D;
        if (e0Var == null) {
            throw new IllegalStateException("response is not eligible for a body and must not be closed".toString());
        }
        e0Var.close();
    }

    public final d0 d() {
        return this.F;
    }

    public final List<h> e() {
        String str;
        u uVar = this.C;
        int i10 = this.A;
        if (i10 == 401) {
            str = "WWW-Authenticate";
        } else if (i10 != 407) {
            return xn.s.k();
        } else {
            str = "Proxy-Authenticate";
        }
        return kp.e.a(uVar, str);
    }

    public final int h() {
        return this.A;
    }

    public final jp.c i() {
        return this.J;
    }

    public final t j() {
        return this.B;
    }

    public final String n(String str, String str2) {
        jo.p.h(str, "name");
        String d10 = this.C.d(str);
        return d10 != null ? d10 : str2;
    }

    public final u p() {
        return this.C;
    }

    public final String q() {
        return this.f30834z;
    }

    public String toString() {
        return "Response{protocol=" + this.f30833y + ", code=" + this.A + ", message=" + this.f30834z + ", url=" + this.f30832x.j() + '}';
    }

    public final boolean u0() {
        int i10 = this.A;
        return 200 <= i10 && 299 >= i10;
    }

    public final d0 v() {
        return this.E;
    }

    public final a z() {
        return new a(this);
    }

    /* loaded from: classes4.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public b0 f30835a;

        /* renamed from: b  reason: collision with root package name */
        public a0 f30836b;

        /* renamed from: c  reason: collision with root package name */
        public int f30837c;

        /* renamed from: d  reason: collision with root package name */
        public String f30838d;

        /* renamed from: e  reason: collision with root package name */
        public t f30839e;

        /* renamed from: f  reason: collision with root package name */
        public u.a f30840f;

        /* renamed from: g  reason: collision with root package name */
        public e0 f30841g;

        /* renamed from: h  reason: collision with root package name */
        public d0 f30842h;

        /* renamed from: i  reason: collision with root package name */
        public d0 f30843i;

        /* renamed from: j  reason: collision with root package name */
        public d0 f30844j;

        /* renamed from: k  reason: collision with root package name */
        public long f30845k;

        /* renamed from: l  reason: collision with root package name */
        public long f30846l;

        /* renamed from: m  reason: collision with root package name */
        public jp.c f30847m;

        public a() {
            this.f30837c = -1;
            this.f30840f = new u.a();
        }

        public a a(String str, String str2) {
            jo.p.h(str, "name");
            jo.p.h(str2, "value");
            this.f30840f.b(str, str2);
            return this;
        }

        public a b(e0 e0Var) {
            this.f30841g = e0Var;
            return this;
        }

        public d0 c() {
            int i10 = this.f30837c;
            if (i10 >= 0) {
                b0 b0Var = this.f30835a;
                if (b0Var != null) {
                    a0 a0Var = this.f30836b;
                    if (a0Var != null) {
                        String str = this.f30838d;
                        if (str != null) {
                            return new d0(b0Var, a0Var, str, i10, this.f30839e, this.f30840f.g(), this.f30841g, this.f30842h, this.f30843i, this.f30844j, this.f30845k, this.f30846l, this.f30847m);
                        }
                        throw new IllegalStateException("message == null".toString());
                    }
                    throw new IllegalStateException("protocol == null".toString());
                }
                throw new IllegalStateException("request == null".toString());
            }
            throw new IllegalStateException(("code < 0: " + this.f30837c).toString());
        }

        public a d(d0 d0Var) {
            f("cacheResponse", d0Var);
            this.f30843i = d0Var;
            return this;
        }

        public final void e(d0 d0Var) {
            if (d0Var != null) {
                if (!(d0Var.a() == null)) {
                    throw new IllegalArgumentException("priorResponse.body != null".toString());
                }
            }
        }

        public final void f(String str, d0 d0Var) {
            if (d0Var != null) {
                if (d0Var.a() == null) {
                    if (d0Var.v() == null) {
                        if (d0Var.d() == null) {
                            if (d0Var.C() == null) {
                                return;
                            }
                            throw new IllegalArgumentException((str + ".priorResponse != null").toString());
                        }
                        throw new IllegalArgumentException((str + ".cacheResponse != null").toString());
                    }
                    throw new IllegalArgumentException((str + ".networkResponse != null").toString());
                }
                throw new IllegalArgumentException((str + ".body != null").toString());
            }
        }

        public a g(int i10) {
            this.f30837c = i10;
            return this;
        }

        public final int h() {
            return this.f30837c;
        }

        public a i(t tVar) {
            this.f30839e = tVar;
            return this;
        }

        public a j(String str, String str2) {
            jo.p.h(str, "name");
            jo.p.h(str2, "value");
            this.f30840f.j(str, str2);
            return this;
        }

        public a k(u uVar) {
            jo.p.h(uVar, "headers");
            this.f30840f = uVar.j();
            return this;
        }

        public final void l(jp.c cVar) {
            jo.p.h(cVar, "deferredTrailers");
            this.f30847m = cVar;
        }

        public a m(String str) {
            jo.p.h(str, "message");
            this.f30838d = str;
            return this;
        }

        public a n(d0 d0Var) {
            f("networkResponse", d0Var);
            this.f30842h = d0Var;
            return this;
        }

        public a o(d0 d0Var) {
            e(d0Var);
            this.f30844j = d0Var;
            return this;
        }

        public a p(a0 a0Var) {
            jo.p.h(a0Var, "protocol");
            this.f30836b = a0Var;
            return this;
        }

        public a q(long j10) {
            this.f30846l = j10;
            return this;
        }

        public a r(b0 b0Var) {
            jo.p.h(b0Var, "request");
            this.f30835a = b0Var;
            return this;
        }

        public a s(long j10) {
            this.f30845k = j10;
            return this;
        }

        public a(d0 d0Var) {
            jo.p.h(d0Var, "response");
            this.f30837c = -1;
            this.f30835a = d0Var.G();
            this.f30836b = d0Var.E();
            this.f30837c = d0Var.h();
            this.f30838d = d0Var.q();
            this.f30839e = d0Var.j();
            this.f30840f = d0Var.p().j();
            this.f30841g = d0Var.a();
            this.f30842h = d0Var.v();
            this.f30843i = d0Var.d();
            this.f30844j = d0Var.C();
            this.f30845k = d0Var.I();
            this.f30846l = d0Var.F();
            this.f30847m = d0Var.i();
        }
    }
}
