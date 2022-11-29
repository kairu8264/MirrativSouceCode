package mp;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import jo.p;
import mp.c;
import rp.h0;
import rp.i0;

/* loaded from: classes4.dex */
public final class g implements Closeable {
    public static final Logger A;
    public static final a B = new a(null);

    /* renamed from: w  reason: collision with root package name */
    public final b f41353w;

    /* renamed from: x  reason: collision with root package name */
    public final c.a f41354x;

    /* renamed from: y  reason: collision with root package name */
    public final rp.e f41355y;

    /* renamed from: z  reason: collision with root package name */
    public final boolean f41356z;

    /* loaded from: classes4.dex */
    public static final class a {
        public a() {
        }

        public final Logger a() {
            return g.A;
        }

        public final int b(int i10, int i11, int i12) throws IOException {
            if ((i11 & 8) != 0) {
                i10--;
            }
            if (i12 <= i10) {
                return i10 - i12;
            }
            throw new IOException("PROTOCOL_ERROR padding " + i12 + " > remaining length " + i10);
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class b implements h0 {
        public int A;
        public final rp.e B;

        /* renamed from: w  reason: collision with root package name */
        public int f41357w;

        /* renamed from: x  reason: collision with root package name */
        public int f41358x;

        /* renamed from: y  reason: collision with root package name */
        public int f41359y;

        /* renamed from: z  reason: collision with root package name */
        public int f41360z;

        public b(rp.e eVar) {
            p.h(eVar, "source");
            this.B = eVar;
        }

        public final int a() {
            return this.f41360z;
        }

        public final void c() throws IOException {
            int i10 = this.f41359y;
            int G = fp.b.G(this.B);
            this.f41360z = G;
            this.f41357w = G;
            int b10 = fp.b.b(this.B.readByte(), 255);
            this.f41358x = fp.b.b(this.B.readByte(), 255);
            a aVar = g.B;
            if (aVar.a().isLoggable(Level.FINE)) {
                aVar.a().fine(d.f41261e.c(true, this.f41359y, this.f41357w, b10, this.f41358x));
            }
            int readInt = this.B.readInt() & Integer.MAX_VALUE;
            this.f41359y = readInt;
            if (b10 == 9) {
                if (readInt != i10) {
                    throw new IOException("TYPE_CONTINUATION streamId changed");
                }
                return;
            }
            throw new IOException(b10 + " != TYPE_CONTINUATION");
        }

        @Override // rp.h0, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
        }

        public final void d(int i10) {
            this.f41358x = i10;
        }

        public final void e(int i10) {
            this.f41360z = i10;
        }

        @Override // rp.h0
        public long f1(rp.c cVar, long j10) throws IOException {
            p.h(cVar, "sink");
            while (true) {
                int i10 = this.f41360z;
                if (i10 == 0) {
                    this.B.k(this.A);
                    this.A = 0;
                    if ((this.f41358x & 4) != 0) {
                        return -1L;
                    }
                    c();
                } else {
                    long f12 = this.B.f1(cVar, Math.min(j10, i10));
                    if (f12 == -1) {
                        return -1L;
                    }
                    this.f41360z -= (int) f12;
                    return f12;
                }
            }
        }

        public final void h(int i10) {
            this.f41357w = i10;
        }

        public final void i(int i10) {
            this.A = i10;
        }

        public final void j(int i10) {
            this.f41359y = i10;
        }

        @Override // rp.h0
        public i0 m() {
            return this.B.m();
        }
    }

    /* loaded from: classes4.dex */
    public interface c {
        void a(int i10, mp.a aVar);

        void b(boolean z10, int i10, int i11, List<mp.b> list);

        void c(int i10, long j10);

        void d(int i10, int i11, List<mp.b> list) throws IOException;

        void e();

        void f(boolean z10, int i10, rp.e eVar, int i11) throws IOException;

        void g(int i10, mp.a aVar, rp.f fVar);

        void h(boolean z10, l lVar);

        void i(boolean z10, int i10, int i11);

        void j(int i10, int i11, int i12, boolean z10);
    }

    static {
        Logger logger = Logger.getLogger(d.class.getName());
        p.g(logger, "Logger.getLogger(Http2::class.java.name)");
        A = logger;
    }

    public g(rp.e eVar, boolean z10) {
        p.h(eVar, "source");
        this.f41355y = eVar;
        this.f41356z = z10;
        b bVar = new b(eVar);
        this.f41353w = bVar;
        this.f41354x = new c.a(bVar, 4096, 0, 4, null);
    }

    public final void C(c cVar, int i10, int i11, int i12) throws IOException {
        if (i10 == 4) {
            long d10 = fp.b.d(this.f41355y.readInt(), 2147483647L);
            if (d10 != 0) {
                cVar.c(i12, d10);
                return;
            }
            throw new IOException("windowSizeIncrement was 0");
        }
        throw new IOException("TYPE_WINDOW_UPDATE length !=4: " + i10);
    }

    public final boolean c(boolean z10, c cVar) throws IOException {
        p.h(cVar, "handler");
        try {
            this.f41355y.I0(9L);
            int G = fp.b.G(this.f41355y);
            if (G <= 16384) {
                int b10 = fp.b.b(this.f41355y.readByte(), 255);
                int b11 = fp.b.b(this.f41355y.readByte(), 255);
                int readInt = this.f41355y.readInt() & Integer.MAX_VALUE;
                Logger logger = A;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(d.f41261e.c(true, readInt, G, b10, b11));
                }
                if (z10 && b10 != 4) {
                    throw new IOException("Expected a SETTINGS frame but was " + d.f41261e.b(b10));
                }
                switch (b10) {
                    case 0:
                        e(cVar, G, b11, readInt);
                        return true;
                    case 1:
                        j(cVar, G, b11, readInt);
                        return true;
                    case 2:
                        p(cVar, G, b11, readInt);
                        return true;
                    case 3:
                        v(cVar, G, b11, readInt);
                        return true;
                    case 4:
                        z(cVar, G, b11, readInt);
                        return true;
                    case 5:
                        q(cVar, G, b11, readInt);
                        return true;
                    case 6:
                        n(cVar, G, b11, readInt);
                        return true;
                    case 7:
                        h(cVar, G, b11, readInt);
                        return true;
                    case 8:
                        C(cVar, G, b11, readInt);
                        return true;
                    default:
                        this.f41355y.k(G);
                        return true;
                }
            }
            throw new IOException("FRAME_SIZE_ERROR: " + G);
        } catch (EOFException unused) {
            return false;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f41355y.close();
    }

    public final void d(c cVar) throws IOException {
        p.h(cVar, "handler");
        if (this.f41356z) {
            if (!c(true, cVar)) {
                throw new IOException("Required SETTINGS preface not received");
            }
            return;
        }
        rp.e eVar = this.f41355y;
        rp.f fVar = d.f41257a;
        rp.f R0 = eVar.R0(fVar.G());
        Logger logger = A;
        if (logger.isLoggable(Level.FINE)) {
            logger.fine(fp.b.q("<< CONNECTION " + R0.q(), new Object[0]));
        }
        if (!p.c(fVar, R0)) {
            throw new IOException("Expected a connection header but was " + R0.L());
        }
    }

    public final void e(c cVar, int i10, int i11, int i12) throws IOException {
        if (i12 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_DATA streamId == 0");
        }
        boolean z10 = (i11 & 1) != 0;
        if (!((i11 & 32) != 0)) {
            int b10 = (i11 & 8) != 0 ? fp.b.b(this.f41355y.readByte(), 255) : 0;
            cVar.f(z10, i12, this.f41355y, B.b(i10, i11, b10));
            this.f41355y.k(b10);
            return;
        }
        throw new IOException("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA");
    }

    public final void h(c cVar, int i10, int i11, int i12) throws IOException {
        if (i10 < 8) {
            throw new IOException("TYPE_GOAWAY length < 8: " + i10);
        } else if (i12 == 0) {
            int readInt = this.f41355y.readInt();
            int readInt2 = this.f41355y.readInt();
            int i13 = i10 - 8;
            mp.a a10 = mp.a.Companion.a(readInt2);
            if (a10 != null) {
                rp.f fVar = rp.f.A;
                if (i13 > 0) {
                    fVar = this.f41355y.R0(i13);
                }
                cVar.g(readInt, a10, fVar);
                return;
            }
            throw new IOException("TYPE_GOAWAY unexpected error code: " + readInt2);
        } else {
            throw new IOException("TYPE_GOAWAY streamId != 0");
        }
    }

    public final List<mp.b> i(int i10, int i11, int i12, int i13) throws IOException {
        this.f41353w.e(i10);
        b bVar = this.f41353w;
        bVar.h(bVar.a());
        this.f41353w.i(i11);
        this.f41353w.d(i12);
        this.f41353w.j(i13);
        this.f41354x.k();
        return this.f41354x.e();
    }

    public final void j(c cVar, int i10, int i11, int i12) throws IOException {
        if (i12 != 0) {
            boolean z10 = (i11 & 1) != 0;
            int b10 = (i11 & 8) != 0 ? fp.b.b(this.f41355y.readByte(), 255) : 0;
            if ((i11 & 32) != 0) {
                o(cVar, i12);
                i10 -= 5;
            }
            cVar.b(z10, i12, -1, i(B.b(i10, i11, b10), b10, i11, i12));
            return;
        }
        throw new IOException("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
    }

    public final void n(c cVar, int i10, int i11, int i12) throws IOException {
        if (i10 != 8) {
            throw new IOException("TYPE_PING length != 8: " + i10);
        } else if (i12 == 0) {
            cVar.i((i11 & 1) != 0, this.f41355y.readInt(), this.f41355y.readInt());
        } else {
            throw new IOException("TYPE_PING streamId != 0");
        }
    }

    public final void o(c cVar, int i10) throws IOException {
        int readInt = this.f41355y.readInt();
        cVar.j(i10, readInt & Integer.MAX_VALUE, fp.b.b(this.f41355y.readByte(), 255) + 1, (((int) 2147483648L) & readInt) != 0);
    }

    public final void p(c cVar, int i10, int i11, int i12) throws IOException {
        if (i10 == 5) {
            if (i12 != 0) {
                o(cVar, i12);
                return;
            }
            throw new IOException("TYPE_PRIORITY streamId == 0");
        }
        throw new IOException("TYPE_PRIORITY length: " + i10 + " != 5");
    }

    public final void q(c cVar, int i10, int i11, int i12) throws IOException {
        if (i12 != 0) {
            int b10 = (i11 & 8) != 0 ? fp.b.b(this.f41355y.readByte(), 255) : 0;
            cVar.d(i12, this.f41355y.readInt() & Integer.MAX_VALUE, i(B.b(i10 - 4, i11, b10), b10, i11, i12));
            return;
        }
        throw new IOException("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
    }

    public final void v(c cVar, int i10, int i11, int i12) throws IOException {
        if (i10 != 4) {
            throw new IOException("TYPE_RST_STREAM length: " + i10 + " != 4");
        } else if (i12 != 0) {
            int readInt = this.f41355y.readInt();
            mp.a a10 = mp.a.Companion.a(readInt);
            if (a10 != null) {
                cVar.a(i12, a10);
                return;
            }
            throw new IOException("TYPE_RST_STREAM unexpected error code: " + readInt);
        } else {
            throw new IOException("TYPE_RST_STREAM streamId == 0");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x007a, code lost:
        throw new java.io.IOException("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: " + r4);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void z(mp.g.c r8, int r9, int r10, int r11) throws java.io.IOException {
        /*
            r7 = this;
            if (r11 != 0) goto Lb8
            r11 = 1
            r10 = r10 & r11
            if (r10 == 0) goto L14
            if (r9 != 0) goto Lc
            r8.e()
            return
        Lc:
            java.io.IOException r8 = new java.io.IOException
            java.lang.String r9 = "FRAME_SIZE_ERROR ack frame should be empty!"
            r8.<init>(r9)
            throw r8
        L14:
            int r10 = r9 % 6
            if (r10 != 0) goto La1
            mp.l r10 = new mp.l
            r10.<init>()
            r0 = 0
            po.i r9 = po.n.t(r0, r9)
            r1 = 6
            po.g r9 = po.n.s(r9, r1)
            int r1 = r9.k()
            int r2 = r9.m()
            int r9 = r9.p()
            if (r9 < 0) goto L38
            if (r1 > r2) goto L9d
            goto L3a
        L38:
            if (r1 < r2) goto L9d
        L3a:
            rp.e r3 = r7.f41355y
            short r3 = r3.readShort()
            r4 = 65535(0xffff, float:9.1834E-41)
            int r3 = fp.b.c(r3, r4)
            rp.e r4 = r7.f41355y
            int r4 = r4.readInt()
            r5 = 2
            r6 = 4
            if (r3 == r5) goto L89
            r5 = 3
            if (r3 == r5) goto L87
            if (r3 == r6) goto L7b
            r5 = 5
            if (r3 == r5) goto L5a
            goto L96
        L5a:
            r5 = 16384(0x4000, float:2.2959E-41)
            if (r4 < r5) goto L64
            r5 = 16777215(0xffffff, float:2.3509886E-38)
            if (r4 > r5) goto L64
            goto L96
        L64:
            java.io.IOException r8 = new java.io.IOException
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: "
            r9.append(r10)
            r9.append(r4)
            java.lang.String r9 = r9.toString()
            r8.<init>(r9)
            throw r8
        L7b:
            r3 = 7
            if (r4 < 0) goto L7f
            goto L96
        L7f:
            java.io.IOException r8 = new java.io.IOException
            java.lang.String r9 = "PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1"
            r8.<init>(r9)
            throw r8
        L87:
            r3 = r6
            goto L96
        L89:
            if (r4 == 0) goto L96
            if (r4 != r11) goto L8e
            goto L96
        L8e:
            java.io.IOException r8 = new java.io.IOException
            java.lang.String r9 = "PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1"
            r8.<init>(r9)
            throw r8
        L96:
            r10.h(r3, r4)
            if (r1 == r2) goto L9d
            int r1 = r1 + r9
            goto L3a
        L9d:
            r8.h(r0, r10)
            return
        La1:
            java.io.IOException r8 = new java.io.IOException
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "TYPE_SETTINGS length % 6 != 0: "
            r10.append(r11)
            r10.append(r9)
            java.lang.String r9 = r10.toString()
            r8.<init>(r9)
            throw r8
        Lb8:
            java.io.IOException r8 = new java.io.IOException
            java.lang.String r9 = "TYPE_SETTINGS streamId != 0"
            r8.<init>(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: mp.g.z(mp.g$c, int, int, int):void");
    }
}
