package mp;

import com.dena.mirrorman.net.api.Referer;
import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import jo.p;
import mp.c;

/* loaded from: classes4.dex */
public final class i implements Closeable {
    public final rp.d A;
    public final boolean B;

    /* renamed from: w  reason: collision with root package name */
    public final rp.c f41385w;

    /* renamed from: x  reason: collision with root package name */
    public int f41386x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f41387y;

    /* renamed from: z  reason: collision with root package name */
    public final c.b f41388z;
    public static final a D = new a(null);
    public static final Logger C = Logger.getLogger(d.class.getName());

    /* loaded from: classes4.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }
    }

    public i(rp.d dVar, boolean z10) {
        p.h(dVar, "sink");
        this.A = dVar;
        this.B = z10;
        rp.c cVar = new rp.c();
        this.f41385w = cVar;
        this.f41386x = 16384;
        this.f41388z = new c.b(0, false, cVar, 3, null);
    }

    public final void C(int i10, long j10) throws IOException {
        while (j10 > 0) {
            long min = Math.min(this.f41386x, j10);
            j10 -= min;
            h(i10, (int) min, 9, j10 == 0 ? 4 : 0);
            this.A.O0(this.f41385w, min);
        }
    }

    public final synchronized void a(l lVar) throws IOException {
        p.h(lVar, "peerSettings");
        if (!this.f41387y) {
            this.f41386x = lVar.e(this.f41386x);
            if (lVar.b() != -1) {
                this.f41388z.e(lVar.b());
            }
            h(0, 0, 4, 1);
            this.A.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void c() throws IOException {
        if (!this.f41387y) {
            if (this.B) {
                Logger logger = C;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(fp.b.q(">> CONNECTION " + d.f41257a.q(), new Object[0]));
                }
                this.A.o0(d.f41257a);
                this.A.flush();
                return;
            }
            return;
        }
        throw new IOException("closed");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        this.f41387y = true;
        this.A.close();
    }

    public final synchronized void d(boolean z10, int i10, rp.c cVar, int i11) throws IOException {
        if (!this.f41387y) {
            e(i10, z10 ? 1 : 0, cVar, i11);
        } else {
            throw new IOException("closed");
        }
    }

    public final void e(int i10, int i11, rp.c cVar, int i12) throws IOException {
        h(i10, i12, 0, i11);
        if (i12 > 0) {
            rp.d dVar = this.A;
            p.e(cVar);
            dVar.O0(cVar, i12);
        }
    }

    public final synchronized void flush() throws IOException {
        if (!this.f41387y) {
            this.A.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public final void h(int i10, int i11, int i12, int i13) throws IOException {
        Logger logger = C;
        if (logger.isLoggable(Level.FINE)) {
            logger.fine(d.f41261e.c(false, i10, i11, i12, i13));
        }
        if (!(i11 <= this.f41386x)) {
            throw new IllegalArgumentException(("FRAME_SIZE_ERROR length > " + this.f41386x + ": " + i11).toString());
        }
        if ((((int) 2147483648L) & i10) == 0) {
            fp.b.V(this.A, i11);
            this.A.b1(i12 & 255);
            this.A.b1(i13 & 255);
            this.A.H(i10 & Integer.MAX_VALUE);
            return;
        }
        throw new IllegalArgumentException(("reserved bit set: " + i10).toString());
    }

    public final synchronized void i(int i10, mp.a aVar, byte[] bArr) throws IOException {
        p.h(aVar, "errorCode");
        p.h(bArr, "debugData");
        if (!this.f41387y) {
            if (aVar.a() != -1) {
                h(0, bArr.length + 8, 7, 0);
                this.A.H(i10);
                this.A.H(aVar.a());
                if (!(bArr.length == 0)) {
                    this.A.v0(bArr);
                }
                this.A.flush();
            } else {
                throw new IllegalArgumentException("errorCode.httpCode == -1".toString());
            }
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void j(boolean z10, int i10, List<b> list) throws IOException {
        p.h(list, "headerBlock");
        if (!this.f41387y) {
            this.f41388z.g(list);
            long X = this.f41385w.X();
            long min = Math.min(this.f41386x, X);
            int i11 = (X > min ? 1 : (X == min ? 0 : -1));
            int i12 = i11 == 0 ? 4 : 0;
            if (z10) {
                i12 |= 1;
            }
            h(i10, (int) min, 1, i12);
            this.A.O0(this.f41385w, min);
            if (i11 > 0) {
                C(i10, X - min);
            }
        } else {
            throw new IOException("closed");
        }
    }

    public final int n() {
        return this.f41386x;
    }

    public final synchronized void o(boolean z10, int i10, int i11) throws IOException {
        if (!this.f41387y) {
            h(0, 8, 6, z10 ? 1 : 0);
            this.A.H(i10);
            this.A.H(i11);
            this.A.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void p(int i10, int i11, List<b> list) throws IOException {
        p.h(list, "requestHeaders");
        if (!this.f41387y) {
            this.f41388z.g(list);
            long X = this.f41385w.X();
            int min = (int) Math.min(this.f41386x - 4, X);
            int i12 = min + 4;
            long j10 = min;
            int i13 = (X > j10 ? 1 : (X == j10 ? 0 : -1));
            h(i10, i12, 5, i13 == 0 ? 4 : 0);
            this.A.H(i11 & Integer.MAX_VALUE);
            this.A.O0(this.f41385w, j10);
            if (i13 > 0) {
                C(i10, X - j10);
            }
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void q(int i10, mp.a aVar) throws IOException {
        p.h(aVar, "errorCode");
        if (!this.f41387y) {
            if (aVar.a() != -1) {
                h(i10, 4, 3, 0);
                this.A.H(aVar.a());
                this.A.flush();
            } else {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void v(l lVar) throws IOException {
        p.h(lVar, Referer.SETTINGS);
        if (!this.f41387y) {
            int i10 = 0;
            h(0, lVar.i() * 6, 4, 0);
            while (i10 < 10) {
                if (lVar.f(i10)) {
                    this.A.U0(i10 != 4 ? i10 != 7 ? i10 : 4 : 3);
                    this.A.H(lVar.a(i10));
                }
                i10++;
            }
            this.A.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void z(int i10, long j10) throws IOException {
        if (this.f41387y) {
            throw new IOException("closed");
        }
        if (j10 != 0 && j10 <= 2147483647L) {
            h(i10, 4, 8, 0);
            this.A.H((int) j10);
            this.A.flush();
        } else {
            throw new IllegalArgumentException(("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: " + j10).toString());
        }
    }
}
