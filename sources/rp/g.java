package rp;

import java.io.Closeable;
import java.io.IOException;

/* loaded from: classes4.dex */
public abstract class g implements Closeable {

    /* renamed from: w  reason: collision with root package name */
    public final boolean f51681w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f51682x;

    /* renamed from: y  reason: collision with root package name */
    public int f51683y;

    /* loaded from: classes4.dex */
    public static final class a implements h0 {

        /* renamed from: w  reason: collision with root package name */
        public final g f51684w;

        /* renamed from: x  reason: collision with root package name */
        public long f51685x;

        /* renamed from: y  reason: collision with root package name */
        public boolean f51686y;

        public a(g gVar, long j10) {
            jo.p.h(gVar, "fileHandle");
            this.f51684w = gVar;
            this.f51685x = j10;
        }

        public final g a() {
            return this.f51684w;
        }

        @Override // rp.h0, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f51686y) {
                return;
            }
            this.f51686y = true;
            synchronized (this.f51684w) {
                g a10 = a();
                a10.f51683y--;
                if (a().f51683y == 0 && a().f51682x) {
                    wn.v vVar = wn.v.f59242a;
                    this.f51684w.h();
                }
            }
        }

        @Override // rp.h0
        public long f1(c cVar, long j10) {
            jo.p.h(cVar, "sink");
            if (!this.f51686y) {
                long n10 = this.f51684w.n(this.f51685x, cVar, j10);
                if (n10 != -1) {
                    this.f51685x += n10;
                }
                return n10;
            }
            throw new IllegalStateException("closed".toString());
        }

        @Override // rp.h0
        public i0 m() {
            return i0.f51701e;
        }
    }

    public g(boolean z10) {
        this.f51681w = z10;
    }

    public static /* synthetic */ h0 q(g gVar, long j10, int i10, Object obj) throws IOException {
        if (obj == null) {
            if ((i10 & 1) != 0) {
                j10 = 0;
            }
            return gVar.p(j10);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: source");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        synchronized (this) {
            if (this.f51682x) {
                return;
            }
            this.f51682x = true;
            if (this.f51683y != 0) {
                return;
            }
            wn.v vVar = wn.v.f59242a;
            h();
        }
    }

    public abstract void h() throws IOException;

    public abstract int i(long j10, byte[] bArr, int i10, int i11) throws IOException;

    public abstract long j() throws IOException;

    public final long n(long j10, c cVar, long j11) {
        int i10;
        if (j11 >= 0) {
            long j12 = j10 + j11;
            long j13 = j10;
            while (true) {
                if (j13 >= j12) {
                    break;
                }
                c0 d02 = cVar.d0(1);
                int i11 = i(j13, d02.f51665a, d02.f51667c, (int) Math.min(j12 - j13, 8192 - i10));
                if (i11 == -1) {
                    if (d02.f51666b == d02.f51667c) {
                        cVar.f51656w = d02.b();
                        d0.b(d02);
                    }
                    if (j10 == j13) {
                        return -1L;
                    }
                } else {
                    d02.f51667c += i11;
                    long j14 = i11;
                    j13 += j14;
                    cVar.O(cVar.X() + j14);
                }
            }
            return j13 - j10;
        }
        throw new IllegalArgumentException(jo.p.o("byteCount < 0: ", Long.valueOf(j11)).toString());
    }

    public final long o() throws IOException {
        synchronized (this) {
            if (!this.f51682x) {
                wn.v vVar = wn.v.f59242a;
            } else {
                throw new IllegalStateException("closed".toString());
            }
        }
        return j();
    }

    public final h0 p(long j10) throws IOException {
        synchronized (this) {
            if (!this.f51682x) {
                this.f51683y++;
            } else {
                throw new IllegalStateException("closed".toString());
            }
        }
        return new a(this, j10);
    }
}
