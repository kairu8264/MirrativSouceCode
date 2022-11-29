package jp;

import com.google.android.exoplayer2.util.FileTypes;
import ep.b0;
import ep.c0;
import ep.d0;
import ep.e0;
import ep.r;
import java.io.IOException;
import java.net.ProtocolException;
import jo.p;
import rp.f0;
import rp.h0;
import rp.k;
import rp.l;
import rp.t;

/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public boolean f38158a;

    /* renamed from: b  reason: collision with root package name */
    public final f f38159b;

    /* renamed from: c  reason: collision with root package name */
    public final e f38160c;

    /* renamed from: d  reason: collision with root package name */
    public final r f38161d;

    /* renamed from: e  reason: collision with root package name */
    public final d f38162e;

    /* renamed from: f  reason: collision with root package name */
    public final kp.d f38163f;

    /* loaded from: classes4.dex */
    public final class a extends k {
        public final long A;
        public final /* synthetic */ c B;

        /* renamed from: x  reason: collision with root package name */
        public boolean f38164x;

        /* renamed from: y  reason: collision with root package name */
        public long f38165y;

        /* renamed from: z  reason: collision with root package name */
        public boolean f38166z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(c cVar, f0 f0Var, long j10) {
            super(f0Var);
            p.h(f0Var, "delegate");
            this.B = cVar;
            this.A = j10;
        }

        @Override // rp.k, rp.f0
        public void O0(rp.c cVar, long j10) throws IOException {
            p.h(cVar, "source");
            if (!this.f38166z) {
                long j11 = this.A;
                if (j11 != -1 && this.f38165y + j10 > j11) {
                    throw new ProtocolException("expected " + this.A + " bytes but received " + (this.f38165y + j10));
                }
                try {
                    super.O0(cVar, j10);
                    this.f38165y += j10;
                    return;
                } catch (IOException e10) {
                    throw a(e10);
                }
            }
            throw new IllegalStateException("closed".toString());
        }

        public final <E extends IOException> E a(E e10) {
            if (this.f38164x) {
                return e10;
            }
            this.f38164x = true;
            return (E) this.B.a(this.f38165y, false, true, e10);
        }

        @Override // rp.k, rp.f0, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.f38166z) {
                return;
            }
            this.f38166z = true;
            long j10 = this.A;
            if (j10 != -1 && this.f38165y != j10) {
                throw new ProtocolException("unexpected end of stream");
            }
            try {
                super.close();
                a(null);
            } catch (IOException e10) {
                throw a(e10);
            }
        }

        @Override // rp.k, rp.f0, java.io.Flushable
        public void flush() throws IOException {
            try {
                super.flush();
            } catch (IOException e10) {
                throw a(e10);
            }
        }
    }

    /* loaded from: classes4.dex */
    public final class b extends l {
        public boolean A;
        public final long B;
        public final /* synthetic */ c C;

        /* renamed from: x  reason: collision with root package name */
        public long f38167x;

        /* renamed from: y  reason: collision with root package name */
        public boolean f38168y;

        /* renamed from: z  reason: collision with root package name */
        public boolean f38169z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(c cVar, h0 h0Var, long j10) {
            super(h0Var);
            p.h(h0Var, "delegate");
            this.C = cVar;
            this.B = j10;
            this.f38168y = true;
            if (j10 == 0) {
                c(null);
            }
        }

        public final <E extends IOException> E c(E e10) {
            if (this.f38169z) {
                return e10;
            }
            this.f38169z = true;
            if (e10 == null && this.f38168y) {
                this.f38168y = false;
                this.C.i().v(this.C.g());
            }
            return (E) this.C.a(this.f38167x, true, false, e10);
        }

        @Override // rp.l, rp.h0, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.A) {
                return;
            }
            this.A = true;
            try {
                super.close();
                c(null);
            } catch (IOException e10) {
                throw c(e10);
            }
        }

        @Override // rp.l, rp.h0
        public long f1(rp.c cVar, long j10) throws IOException {
            p.h(cVar, "sink");
            if (!this.A) {
                try {
                    long f12 = a().f1(cVar, j10);
                    if (this.f38168y) {
                        this.f38168y = false;
                        this.C.i().v(this.C.g());
                    }
                    if (f12 == -1) {
                        c(null);
                        return -1L;
                    }
                    long j11 = this.f38167x + f12;
                    long j12 = this.B;
                    if (j12 != -1 && j11 > j12) {
                        throw new ProtocolException("expected " + this.B + " bytes but received " + j11);
                    }
                    this.f38167x = j11;
                    if (j11 == j12) {
                        c(null);
                    }
                    return f12;
                } catch (IOException e10) {
                    throw c(e10);
                }
            }
            throw new IllegalStateException("closed".toString());
        }
    }

    public c(e eVar, r rVar, d dVar, kp.d dVar2) {
        p.h(eVar, "call");
        p.h(rVar, "eventListener");
        p.h(dVar, "finder");
        p.h(dVar2, "codec");
        this.f38160c = eVar;
        this.f38161d = rVar;
        this.f38162e = dVar;
        this.f38163f = dVar2;
        this.f38159b = dVar2.c();
    }

    public final <E extends IOException> E a(long j10, boolean z10, boolean z11, E e10) {
        if (e10 != null) {
            s(e10);
        }
        if (z11) {
            if (e10 != null) {
                this.f38161d.r(this.f38160c, e10);
            } else {
                this.f38161d.p(this.f38160c, j10);
            }
        }
        if (z10) {
            if (e10 != null) {
                this.f38161d.w(this.f38160c, e10);
            } else {
                this.f38161d.u(this.f38160c, j10);
            }
        }
        return (E) this.f38160c.v(this, z11, z10, e10);
    }

    public final void b() {
        this.f38163f.cancel();
    }

    public final f0 c(b0 b0Var, boolean z10) throws IOException {
        p.h(b0Var, "request");
        this.f38158a = z10;
        c0 a10 = b0Var.a();
        p.e(a10);
        long a11 = a10.a();
        this.f38161d.q(this.f38160c);
        return new a(this, this.f38163f.b(b0Var, a11), a11);
    }

    public final void d() {
        this.f38163f.cancel();
        this.f38160c.v(this, true, true, null);
    }

    public final void e() throws IOException {
        try {
            this.f38163f.a();
        } catch (IOException e10) {
            this.f38161d.r(this.f38160c, e10);
            s(e10);
            throw e10;
        }
    }

    public final void f() throws IOException {
        try {
            this.f38163f.f();
        } catch (IOException e10) {
            this.f38161d.r(this.f38160c, e10);
            s(e10);
            throw e10;
        }
    }

    public final e g() {
        return this.f38160c;
    }

    public final f h() {
        return this.f38159b;
    }

    public final r i() {
        return this.f38161d;
    }

    public final d j() {
        return this.f38162e;
    }

    public final boolean k() {
        return !p.c(this.f38162e.d().l().i(), this.f38159b.z().a().l().i());
    }

    public final boolean l() {
        return this.f38158a;
    }

    public final void m() {
        this.f38163f.c().y();
    }

    public final void n() {
        this.f38160c.v(this, true, false, null);
    }

    public final e0 o(d0 d0Var) throws IOException {
        p.h(d0Var, "response");
        try {
            String o10 = d0.o(d0Var, FileTypes.HEADER_CONTENT_TYPE, null, 2, null);
            long d10 = this.f38163f.d(d0Var);
            return new kp.h(o10, d10, t.c(new b(this, this.f38163f.g(d0Var), d10)));
        } catch (IOException e10) {
            this.f38161d.w(this.f38160c, e10);
            s(e10);
            throw e10;
        }
    }

    public final d0.a p(boolean z10) throws IOException {
        try {
            d0.a e10 = this.f38163f.e(z10);
            if (e10 != null) {
                e10.l(this);
            }
            return e10;
        } catch (IOException e11) {
            this.f38161d.w(this.f38160c, e11);
            s(e11);
            throw e11;
        }
    }

    public final void q(d0 d0Var) {
        p.h(d0Var, "response");
        this.f38161d.x(this.f38160c, d0Var);
    }

    public final void r() {
        this.f38161d.y(this.f38160c);
    }

    public final void s(IOException iOException) {
        this.f38162e.h(iOException);
        this.f38163f.c().G(this.f38160c, iOException);
    }

    public final void t(b0 b0Var) throws IOException {
        p.h(b0Var, "request");
        try {
            this.f38161d.t(this.f38160c);
            this.f38163f.h(b0Var);
            this.f38161d.s(this.f38160c, b0Var);
        } catch (IOException e10) {
            this.f38161d.r(this.f38160c, e10);
            s(e10);
            throw e10;
        }
    }
}
