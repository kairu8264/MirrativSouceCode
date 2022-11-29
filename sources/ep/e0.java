package ep;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;

/* loaded from: classes4.dex */
public abstract class e0 implements Closeable {

    /* renamed from: x  reason: collision with root package name */
    public static final b f30848x = new b(null);

    /* renamed from: w  reason: collision with root package name */
    public Reader f30849w;

    /* loaded from: classes4.dex */
    public static final class a extends Reader {

        /* renamed from: w  reason: collision with root package name */
        public boolean f30850w;

        /* renamed from: x  reason: collision with root package name */
        public Reader f30851x;

        /* renamed from: y  reason: collision with root package name */
        public final rp.e f30852y;

        /* renamed from: z  reason: collision with root package name */
        public final Charset f30853z;

        public a(rp.e eVar, Charset charset) {
            jo.p.h(eVar, "source");
            jo.p.h(charset, "charset");
            this.f30852y = eVar;
            this.f30853z = charset;
        }

        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.f30850w = true;
            Reader reader = this.f30851x;
            if (reader != null) {
                reader.close();
            } else {
                this.f30852y.close();
            }
        }

        @Override // java.io.Reader
        public int read(char[] cArr, int i10, int i11) throws IOException {
            jo.p.h(cArr, "cbuf");
            if (!this.f30850w) {
                Reader reader = this.f30851x;
                if (reader == null) {
                    reader = new InputStreamReader(this.f30852y.P1(), fp.b.F(this.f30852y, this.f30853z));
                    this.f30851x = reader;
                }
                return reader.read(cArr, i10, i11);
            }
            throw new IOException("Stream closed");
        }
    }

    /* loaded from: classes4.dex */
    public static final class b {

        /* loaded from: classes4.dex */
        public static final class a extends e0 {
            public final /* synthetic */ long A;

            /* renamed from: y  reason: collision with root package name */
            public final /* synthetic */ rp.e f30854y;

            /* renamed from: z  reason: collision with root package name */
            public final /* synthetic */ x f30855z;

            public a(rp.e eVar, x xVar, long j10) {
                this.f30854y = eVar;
                this.f30855z = xVar;
                this.A = j10;
            }

            @Override // ep.e0
            public long h() {
                return this.A;
            }

            @Override // ep.e0
            public x i() {
                return this.f30855z;
            }

            @Override // ep.e0
            public rp.e n() {
                return this.f30854y;
            }
        }

        public b() {
        }

        public static /* synthetic */ e0 d(b bVar, byte[] bArr, x xVar, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                xVar = null;
            }
            return bVar.c(bArr, xVar);
        }

        public final e0 a(x xVar, long j10, rp.e eVar) {
            jo.p.h(eVar, "content");
            return b(eVar, xVar, j10);
        }

        public final e0 b(rp.e eVar, x xVar, long j10) {
            jo.p.h(eVar, "$this$asResponseBody");
            return new a(eVar, xVar, j10);
        }

        public final e0 c(byte[] bArr, x xVar) {
            jo.p.h(bArr, "$this$toResponseBody");
            return b(new rp.c().v0(bArr), xVar, bArr.length);
        }

        public /* synthetic */ b(jo.h hVar) {
            this();
        }
    }

    public static final e0 j(x xVar, long j10, rp.e eVar) {
        return f30848x.a(xVar, j10, eVar);
    }

    public final InputStream a() {
        return n().P1();
    }

    public final byte[] c() throws IOException {
        long h10 = h();
        if (h10 <= Integer.MAX_VALUE) {
            rp.e n10 = n();
            try {
                byte[] Z0 = n10.Z0();
                go.a.a(n10, null);
                int length = Z0.length;
                if (h10 == -1 || h10 == length) {
                    return Z0;
                }
                throw new IOException("Content-Length (" + h10 + ") and stream length (" + length + ") disagree");
            } finally {
            }
        } else {
            throw new IOException("Cannot buffer entire body for content length: " + h10);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        fp.b.j(n());
    }

    public final Reader d() {
        Reader reader = this.f30849w;
        if (reader != null) {
            return reader;
        }
        a aVar = new a(n(), e());
        this.f30849w = aVar;
        return aVar;
    }

    public final Charset e() {
        Charset c10;
        x i10 = i();
        return (i10 == null || (c10 = i10.c(so.c.f52772b)) == null) ? so.c.f52772b : c10;
    }

    public abstract long h();

    public abstract x i();

    public abstract rp.e n();

    public final String o() throws IOException {
        rp.e n10 = n();
        try {
            String q12 = n10.q1(fp.b.F(n10, e()));
            go.a.a(n10, null);
            return q12;
        } finally {
        }
    }
}
