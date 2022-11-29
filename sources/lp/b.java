package lp;

import ep.b0;
import ep.d0;
import ep.u;
import ep.v;
import ep.z;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.util.concurrent.TimeUnit;
import jo.h;
import jo.p;
import kp.i;
import kp.k;
import rp.f0;
import rp.h0;
import rp.i0;
import rp.m;
import so.n;
import so.o;

/* loaded from: classes4.dex */
public final class b implements kp.d {

    /* renamed from: h  reason: collision with root package name */
    public static final d f40418h = new d(null);

    /* renamed from: a  reason: collision with root package name */
    public int f40419a;

    /* renamed from: b  reason: collision with root package name */
    public final lp.a f40420b;

    /* renamed from: c  reason: collision with root package name */
    public u f40421c;

    /* renamed from: d  reason: collision with root package name */
    public final z f40422d;

    /* renamed from: e  reason: collision with root package name */
    public final jp.f f40423e;

    /* renamed from: f  reason: collision with root package name */
    public final rp.e f40424f;

    /* renamed from: g  reason: collision with root package name */
    public final rp.d f40425g;

    /* loaded from: classes4.dex */
    public abstract class a implements h0 {

        /* renamed from: w  reason: collision with root package name */
        public final m f40426w;

        /* renamed from: x  reason: collision with root package name */
        public boolean f40427x;

        public a() {
            this.f40426w = new m(b.this.f40424f.m());
        }

        public final boolean a() {
            return this.f40427x;
        }

        public final void c() {
            if (b.this.f40419a == 6) {
                return;
            }
            if (b.this.f40419a == 5) {
                b.this.r(this.f40426w);
                b.this.f40419a = 6;
                return;
            }
            throw new IllegalStateException("state: " + b.this.f40419a);
        }

        public final void d(boolean z10) {
            this.f40427x = z10;
        }

        @Override // rp.h0
        public long f1(rp.c cVar, long j10) {
            p.h(cVar, "sink");
            try {
                return b.this.f40424f.f1(cVar, j10);
            } catch (IOException e10) {
                b.this.c().y();
                c();
                throw e10;
            }
        }

        @Override // rp.h0
        public i0 m() {
            return this.f40426w;
        }
    }

    /* renamed from: lp.b$b  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public final class C0585b implements f0 {

        /* renamed from: w  reason: collision with root package name */
        public final m f40429w;

        /* renamed from: x  reason: collision with root package name */
        public boolean f40430x;

        public C0585b() {
            this.f40429w = new m(b.this.f40425g.m());
        }

        @Override // rp.f0
        public void O0(rp.c cVar, long j10) {
            p.h(cVar, "source");
            if (!(!this.f40430x)) {
                throw new IllegalStateException("closed".toString());
            }
            if (j10 == 0) {
                return;
            }
            b.this.f40425g.t1(j10);
            b.this.f40425g.a0("\r\n");
            b.this.f40425g.O0(cVar, j10);
            b.this.f40425g.a0("\r\n");
        }

        @Override // rp.f0, java.io.Closeable, java.lang.AutoCloseable
        public synchronized void close() {
            if (this.f40430x) {
                return;
            }
            this.f40430x = true;
            b.this.f40425g.a0("0\r\n\r\n");
            b.this.r(this.f40429w);
            b.this.f40419a = 3;
        }

        @Override // rp.f0, java.io.Flushable
        public synchronized void flush() {
            if (this.f40430x) {
                return;
            }
            b.this.f40425g.flush();
        }

        @Override // rp.f0
        public i0 m() {
            return this.f40429w;
        }
    }

    /* loaded from: classes4.dex */
    public final class c extends a {
        public boolean A;
        public final v B;
        public final /* synthetic */ b C;

        /* renamed from: z  reason: collision with root package name */
        public long f40432z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(b bVar, v vVar) {
            super();
            p.h(vVar, "url");
            this.C = bVar;
            this.B = vVar;
            this.f40432z = -1L;
            this.A = true;
        }

        @Override // rp.h0, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (a()) {
                return;
            }
            if (this.A && !fp.b.p(this, 100, TimeUnit.MILLISECONDS)) {
                this.C.c().y();
                c();
            }
            d(true);
        }

        public final void e() {
            if (this.f40432z != -1) {
                this.C.f40424f.s0();
            }
            try {
                this.f40432z = this.C.f40424f.O1();
                String s02 = this.C.f40424f.s0();
                if (s02 != null) {
                    String obj = o.L0(s02).toString();
                    if (this.f40432z >= 0) {
                        if (!(obj.length() > 0) || n.C(obj, ";", false, 2, null)) {
                            if (this.f40432z == 0) {
                                this.A = false;
                                b bVar = this.C;
                                bVar.f40421c = bVar.f40420b.a();
                                z zVar = this.C.f40422d;
                                p.e(zVar);
                                ep.n n10 = zVar.n();
                                v vVar = this.B;
                                u uVar = this.C.f40421c;
                                p.e(uVar);
                                kp.e.f(n10, vVar, uVar);
                                c();
                                return;
                            }
                            return;
                        }
                    }
                    throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.f40432z + obj + '\"');
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
            } catch (NumberFormatException e10) {
                throw new ProtocolException(e10.getMessage());
            }
        }

        @Override // lp.b.a, rp.h0
        public long f1(rp.c cVar, long j10) {
            p.h(cVar, "sink");
            if (j10 >= 0) {
                if (!a()) {
                    if (this.A) {
                        long j11 = this.f40432z;
                        if (j11 == 0 || j11 == -1) {
                            e();
                            if (!this.A) {
                                return -1L;
                            }
                        }
                        long f12 = super.f1(cVar, Math.min(j10, this.f40432z));
                        if (f12 != -1) {
                            this.f40432z -= f12;
                            return f12;
                        }
                        this.C.c().y();
                        ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                        c();
                        throw protocolException;
                    }
                    return -1L;
                }
                throw new IllegalStateException("closed".toString());
            }
            throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
        }
    }

    /* loaded from: classes4.dex */
    public static final class d {
        public d() {
        }

        public /* synthetic */ d(h hVar) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public final class e extends a {

        /* renamed from: z  reason: collision with root package name */
        public long f40433z;

        public e(long j10) {
            super();
            this.f40433z = j10;
            if (j10 == 0) {
                c();
            }
        }

        @Override // rp.h0, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (a()) {
                return;
            }
            if (this.f40433z != 0 && !fp.b.p(this, 100, TimeUnit.MILLISECONDS)) {
                b.this.c().y();
                c();
            }
            d(true);
        }

        @Override // lp.b.a, rp.h0
        public long f1(rp.c cVar, long j10) {
            p.h(cVar, "sink");
            if (j10 >= 0) {
                if (!a()) {
                    long j11 = this.f40433z;
                    if (j11 == 0) {
                        return -1L;
                    }
                    long f12 = super.f1(cVar, Math.min(j11, j10));
                    if (f12 != -1) {
                        long j12 = this.f40433z - f12;
                        this.f40433z = j12;
                        if (j12 == 0) {
                            c();
                        }
                        return f12;
                    }
                    b.this.c().y();
                    ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                    c();
                    throw protocolException;
                }
                throw new IllegalStateException("closed".toString());
            }
            throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
        }
    }

    /* loaded from: classes4.dex */
    public final class f implements f0 {

        /* renamed from: w  reason: collision with root package name */
        public final m f40434w;

        /* renamed from: x  reason: collision with root package name */
        public boolean f40435x;

        public f() {
            this.f40434w = new m(b.this.f40425g.m());
        }

        @Override // rp.f0
        public void O0(rp.c cVar, long j10) {
            p.h(cVar, "source");
            if (!this.f40435x) {
                fp.b.i(cVar.X(), 0L, j10);
                b.this.f40425g.O0(cVar, j10);
                return;
            }
            throw new IllegalStateException("closed".toString());
        }

        @Override // rp.f0, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f40435x) {
                return;
            }
            this.f40435x = true;
            b.this.r(this.f40434w);
            b.this.f40419a = 3;
        }

        @Override // rp.f0, java.io.Flushable
        public void flush() {
            if (this.f40435x) {
                return;
            }
            b.this.f40425g.flush();
        }

        @Override // rp.f0
        public i0 m() {
            return this.f40434w;
        }
    }

    /* loaded from: classes4.dex */
    public final class g extends a {

        /* renamed from: z  reason: collision with root package name */
        public boolean f40437z;

        public g() {
            super();
        }

        @Override // rp.h0, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (a()) {
                return;
            }
            if (!this.f40437z) {
                c();
            }
            d(true);
        }

        @Override // lp.b.a, rp.h0
        public long f1(rp.c cVar, long j10) {
            p.h(cVar, "sink");
            if (j10 >= 0) {
                if (!a()) {
                    if (this.f40437z) {
                        return -1L;
                    }
                    long f12 = super.f1(cVar, j10);
                    if (f12 == -1) {
                        this.f40437z = true;
                        c();
                        return -1L;
                    }
                    return f12;
                }
                throw new IllegalStateException("closed".toString());
            }
            throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
        }
    }

    public b(z zVar, jp.f fVar, rp.e eVar, rp.d dVar) {
        p.h(fVar, "connection");
        p.h(eVar, "source");
        p.h(dVar, "sink");
        this.f40422d = zVar;
        this.f40423e = fVar;
        this.f40424f = eVar;
        this.f40425g = dVar;
        this.f40420b = new lp.a(eVar);
    }

    public final void A(u uVar, String str) {
        p.h(uVar, "headers");
        p.h(str, "requestLine");
        if (this.f40419a == 0) {
            this.f40425g.a0(str).a0("\r\n");
            int size = uVar.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.f40425g.a0(uVar.g(i10)).a0(": ").a0(uVar.m(i10)).a0("\r\n");
            }
            this.f40425g.a0("\r\n");
            this.f40419a = 1;
            return;
        }
        throw new IllegalStateException(("state: " + this.f40419a).toString());
    }

    @Override // kp.d
    public void a() {
        this.f40425g.flush();
    }

    @Override // kp.d
    public f0 b(b0 b0Var, long j10) {
        p.h(b0Var, "request");
        if (b0Var.a() == null || !b0Var.a().e()) {
            if (s(b0Var)) {
                return u();
            }
            if (j10 != -1) {
                return x();
            }
            throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
        }
        throw new ProtocolException("Duplex connections are not supported for HTTP/1");
    }

    @Override // kp.d
    public jp.f c() {
        return this.f40423e;
    }

    @Override // kp.d
    public void cancel() {
        c().d();
    }

    @Override // kp.d
    public long d(d0 d0Var) {
        p.h(d0Var, "response");
        if (kp.e.b(d0Var)) {
            if (t(d0Var)) {
                return -1L;
            }
            return fp.b.s(d0Var);
        }
        return 0L;
    }

    @Override // kp.d
    public d0.a e(boolean z10) {
        int i10 = this.f40419a;
        boolean z11 = true;
        if (i10 != 1 && i10 != 3) {
            z11 = false;
        }
        if (z11) {
            try {
                k a10 = k.f38933d.a(this.f40420b.b());
                d0.a k10 = new d0.a().p(a10.f38934a).g(a10.f38935b).m(a10.f38936c).k(this.f40420b.a());
                if (z10 && a10.f38935b == 100) {
                    return null;
                }
                if (a10.f38935b == 100) {
                    this.f40419a = 3;
                    return k10;
                }
                this.f40419a = 4;
                return k10;
            } catch (EOFException e10) {
                String t10 = c().z().a().l().t();
                throw new IOException("unexpected end of stream on " + t10, e10);
            }
        }
        throw new IllegalStateException(("state: " + this.f40419a).toString());
    }

    @Override // kp.d
    public void f() {
        this.f40425g.flush();
    }

    @Override // kp.d
    public h0 g(d0 d0Var) {
        p.h(d0Var, "response");
        if (kp.e.b(d0Var)) {
            if (t(d0Var)) {
                return v(d0Var.G().j());
            }
            long s10 = fp.b.s(d0Var);
            if (s10 != -1) {
                return w(s10);
            }
            return y();
        }
        return w(0L);
    }

    @Override // kp.d
    public void h(b0 b0Var) {
        p.h(b0Var, "request");
        i iVar = i.f38930a;
        Proxy.Type type = c().z().b().type();
        p.g(type, "connection.route().proxy.type()");
        A(b0Var.e(), iVar.a(b0Var, type));
    }

    public final void r(m mVar) {
        i0 i10 = mVar.i();
        mVar.j(i0.f51701e);
        i10.a();
        i10.b();
    }

    public final boolean s(b0 b0Var) {
        return n.q("chunked", b0Var.d("Transfer-Encoding"), true);
    }

    public final boolean t(d0 d0Var) {
        return n.q("chunked", d0.o(d0Var, "Transfer-Encoding", null, 2, null), true);
    }

    public final f0 u() {
        if (this.f40419a == 1) {
            this.f40419a = 2;
            return new C0585b();
        }
        throw new IllegalStateException(("state: " + this.f40419a).toString());
    }

    public final h0 v(v vVar) {
        if (this.f40419a == 4) {
            this.f40419a = 5;
            return new c(this, vVar);
        }
        throw new IllegalStateException(("state: " + this.f40419a).toString());
    }

    public final h0 w(long j10) {
        if (this.f40419a == 4) {
            this.f40419a = 5;
            return new e(j10);
        }
        throw new IllegalStateException(("state: " + this.f40419a).toString());
    }

    public final f0 x() {
        if (this.f40419a == 1) {
            this.f40419a = 2;
            return new f();
        }
        throw new IllegalStateException(("state: " + this.f40419a).toString());
    }

    public final h0 y() {
        if (this.f40419a == 4) {
            this.f40419a = 5;
            c().y();
            return new g();
        }
        throw new IllegalStateException(("state: " + this.f40419a).toString());
    }

    public final void z(d0 d0Var) {
        p.h(d0Var, "response");
        long s10 = fp.b.s(d0Var);
        if (s10 == -1) {
            return;
        }
        h0 w10 = w(s10);
        fp.b.I(w10, Integer.MAX_VALUE, TimeUnit.MILLISECONDS);
        w10.close();
    }
}
