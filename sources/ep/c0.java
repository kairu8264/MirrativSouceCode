package ep;

import ep.x;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import rp.h0;

/* loaded from: classes4.dex */
public abstract class c0 {

    /* renamed from: a */
    public static final a f30798a = new a(null);

    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: ep.c0$a$a */
        /* loaded from: classes4.dex */
        public static final class C0310a extends c0 {

            /* renamed from: b */
            public final /* synthetic */ File f30799b;

            /* renamed from: c */
            public final /* synthetic */ x f30800c;

            public C0310a(File file, x xVar) {
                this.f30799b = file;
                this.f30800c = xVar;
            }

            @Override // ep.c0
            public long a() {
                return this.f30799b.length();
            }

            @Override // ep.c0
            public x b() {
                return this.f30800c;
            }

            @Override // ep.c0
            public void g(rp.d dVar) {
                jo.p.h(dVar, "sink");
                h0 i10 = rp.t.i(this.f30799b);
                try {
                    dVar.H0(i10);
                    go.a.a(i10, null);
                } finally {
                }
            }
        }

        /* loaded from: classes4.dex */
        public static final class b extends c0 {

            /* renamed from: b */
            public final /* synthetic */ rp.f f30801b;

            /* renamed from: c */
            public final /* synthetic */ x f30802c;

            public b(rp.f fVar, x xVar) {
                this.f30801b = fVar;
                this.f30802c = xVar;
            }

            @Override // ep.c0
            public long a() {
                return this.f30801b.G();
            }

            @Override // ep.c0
            public x b() {
                return this.f30802c;
            }

            @Override // ep.c0
            public void g(rp.d dVar) {
                jo.p.h(dVar, "sink");
                dVar.o0(this.f30801b);
            }
        }

        /* loaded from: classes4.dex */
        public static final class c extends c0 {

            /* renamed from: b */
            public final /* synthetic */ byte[] f30803b;

            /* renamed from: c */
            public final /* synthetic */ x f30804c;

            /* renamed from: d */
            public final /* synthetic */ int f30805d;

            /* renamed from: e */
            public final /* synthetic */ int f30806e;

            public c(byte[] bArr, x xVar, int i10, int i11) {
                this.f30803b = bArr;
                this.f30804c = xVar;
                this.f30805d = i10;
                this.f30806e = i11;
            }

            @Override // ep.c0
            public long a() {
                return this.f30805d;
            }

            @Override // ep.c0
            public x b() {
                return this.f30804c;
            }

            @Override // ep.c0
            public void g(rp.d dVar) {
                jo.p.h(dVar, "sink");
                dVar.write(this.f30803b, this.f30806e, this.f30805d);
            }
        }

        public a() {
        }

        public static /* synthetic */ c0 g(a aVar, x xVar, byte[] bArr, int i10, int i11, int i12, Object obj) {
            if ((i12 & 4) != 0) {
                i10 = 0;
            }
            if ((i12 & 8) != 0) {
                i11 = bArr.length;
            }
            return aVar.b(xVar, bArr, i10, i11);
        }

        public static /* synthetic */ c0 h(a aVar, String str, x xVar, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                xVar = null;
            }
            return aVar.d(str, xVar);
        }

        public static /* synthetic */ c0 i(a aVar, byte[] bArr, x xVar, int i10, int i11, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                xVar = null;
            }
            if ((i12 & 2) != 0) {
                i10 = 0;
            }
            if ((i12 & 4) != 0) {
                i11 = bArr.length;
            }
            return aVar.f(bArr, xVar, i10, i11);
        }

        public final c0 a(x xVar, rp.f fVar) {
            jo.p.h(fVar, "content");
            return e(fVar, xVar);
        }

        public final c0 b(x xVar, byte[] bArr, int i10, int i11) {
            jo.p.h(bArr, "content");
            return f(bArr, xVar, i10, i11);
        }

        public final c0 c(File file, x xVar) {
            jo.p.h(file, "$this$asRequestBody");
            return new C0310a(file, xVar);
        }

        public final c0 d(String str, x xVar) {
            jo.p.h(str, "$this$toRequestBody");
            Charset charset = so.c.f52772b;
            if (xVar != null) {
                Charset d10 = x.d(xVar, null, 1, null);
                if (d10 == null) {
                    x.a aVar = x.f31036g;
                    xVar = aVar.b(xVar + "; charset=utf-8");
                } else {
                    charset = d10;
                }
            }
            byte[] bytes = str.getBytes(charset);
            jo.p.g(bytes, "(this as java.lang.String).getBytes(charset)");
            return f(bytes, xVar, 0, bytes.length);
        }

        public final c0 e(rp.f fVar, x xVar) {
            jo.p.h(fVar, "$this$toRequestBody");
            return new b(fVar, xVar);
        }

        public final c0 f(byte[] bArr, x xVar, int i10, int i11) {
            jo.p.h(bArr, "$this$toRequestBody");
            fp.b.i(bArr.length, i10, i11);
            return new c(bArr, xVar, i11, i10);
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }
    }

    public static final c0 c(x xVar, rp.f fVar) {
        return f30798a.a(xVar, fVar);
    }

    public static final c0 d(x xVar, byte[] bArr) {
        return a.g(f30798a, xVar, bArr, 0, 0, 12, null);
    }

    public long a() throws IOException {
        return -1L;
    }

    public abstract x b();

    public boolean e() {
        return false;
    }

    public boolean f() {
        return false;
    }

    public abstract void g(rp.d dVar) throws IOException;
}
