package ep;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.exoplayer2.util.FileTypes;
import ep.c0;
import ep.u;
import ep.x;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public final class y extends c0 {

    /* renamed from: g  reason: collision with root package name */
    public static final x f31041g;

    /* renamed from: h  reason: collision with root package name */
    public static final x f31042h;

    /* renamed from: i  reason: collision with root package name */
    public static final x f31043i;

    /* renamed from: j  reason: collision with root package name */
    public static final x f31044j;

    /* renamed from: k  reason: collision with root package name */
    public static final x f31045k;

    /* renamed from: l  reason: collision with root package name */
    public static final byte[] f31046l;

    /* renamed from: m  reason: collision with root package name */
    public static final byte[] f31047m;

    /* renamed from: n  reason: collision with root package name */
    public static final byte[] f31048n;

    /* renamed from: o  reason: collision with root package name */
    public static final b f31049o = new b(null);

    /* renamed from: b  reason: collision with root package name */
    public final x f31050b;

    /* renamed from: c  reason: collision with root package name */
    public long f31051c;

    /* renamed from: d  reason: collision with root package name */
    public final rp.f f31052d;

    /* renamed from: e  reason: collision with root package name */
    public final x f31053e;

    /* renamed from: f  reason: collision with root package name */
    public final List<c> f31054f;

    /* loaded from: classes4.dex */
    public static final class b {
        public b() {
        }

        public final void a(StringBuilder sb2, String str) {
            jo.p.h(sb2, "$this$appendQuotedString");
            jo.p.h(str, "key");
            sb2.append('\"');
            int length = str.length();
            for (int i10 = 0; i10 < length; i10++) {
                char charAt = str.charAt(i10);
                if (charAt == '\n') {
                    sb2.append("%0A");
                } else if (charAt == '\r') {
                    sb2.append("%0D");
                } else if (charAt != '\"') {
                    sb2.append(charAt);
                } else {
                    sb2.append("%22");
                }
            }
            sb2.append('\"');
        }

        public /* synthetic */ b(jo.h hVar) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class c {

        /* renamed from: c  reason: collision with root package name */
        public static final a f31058c = new a(null);

        /* renamed from: a  reason: collision with root package name */
        public final u f31059a;

        /* renamed from: b  reason: collision with root package name */
        public final c0 f31060b;

        /* loaded from: classes4.dex */
        public static final class a {
            public a() {
            }

            public final c a(u uVar, c0 c0Var) {
                jo.p.h(c0Var, TtmlNode.TAG_BODY);
                if ((uVar != null ? uVar.d(FileTypes.HEADER_CONTENT_TYPE) : null) == null) {
                    if ((uVar != null ? uVar.d("Content-Length") : null) == null) {
                        return new c(uVar, c0Var, null);
                    }
                    throw new IllegalArgumentException("Unexpected header: Content-Length".toString());
                }
                throw new IllegalArgumentException("Unexpected header: Content-Type".toString());
            }

            public final c b(String str, String str2) {
                jo.p.h(str, "name");
                jo.p.h(str2, "value");
                return c(str, null, c0.a.h(c0.f30798a, str2, null, 1, null));
            }

            public final c c(String str, String str2, c0 c0Var) {
                jo.p.h(str, "name");
                jo.p.h(c0Var, TtmlNode.TAG_BODY);
                StringBuilder sb2 = new StringBuilder();
                sb2.append("form-data; name=");
                b bVar = y.f31049o;
                bVar.a(sb2, str);
                if (str2 != null) {
                    sb2.append("; filename=");
                    bVar.a(sb2, str2);
                }
                String sb3 = sb2.toString();
                jo.p.g(sb3, "StringBuilder().apply(builderAction).toString()");
                return a(new u.a().f("Content-Disposition", sb3).g(), c0Var);
            }

            public /* synthetic */ a(jo.h hVar) {
                this();
            }
        }

        public c(u uVar, c0 c0Var) {
            this.f31059a = uVar;
            this.f31060b = c0Var;
        }

        public final c0 a() {
            return this.f31060b;
        }

        public final u b() {
            return this.f31059a;
        }

        public /* synthetic */ c(u uVar, c0 c0Var, jo.h hVar) {
            this(uVar, c0Var);
        }
    }

    static {
        x.a aVar = x.f31036g;
        f31041g = aVar.a("multipart/mixed");
        f31042h = aVar.a("multipart/alternative");
        f31043i = aVar.a("multipart/digest");
        f31044j = aVar.a("multipart/parallel");
        f31045k = aVar.a("multipart/form-data");
        f31046l = new byte[]{(byte) 58, (byte) 32};
        f31047m = new byte[]{(byte) 13, (byte) 10};
        byte b10 = (byte) 45;
        f31048n = new byte[]{b10, b10};
    }

    public y(rp.f fVar, x xVar, List<c> list) {
        jo.p.h(fVar, "boundaryByteString");
        jo.p.h(xVar, "type");
        jo.p.h(list, "parts");
        this.f31052d = fVar;
        this.f31053e = xVar;
        this.f31054f = list;
        x.a aVar = x.f31036g;
        this.f31050b = aVar.a(xVar + "; boundary=" + h());
        this.f31051c = -1L;
    }

    @Override // ep.c0
    public long a() throws IOException {
        long j10 = this.f31051c;
        if (j10 == -1) {
            long i10 = i(null, true);
            this.f31051c = i10;
            return i10;
        }
        return j10;
    }

    @Override // ep.c0
    public x b() {
        return this.f31050b;
    }

    @Override // ep.c0
    public void g(rp.d dVar) throws IOException {
        jo.p.h(dVar, "sink");
        i(dVar, false);
    }

    public final String h() {
        return this.f31052d.L();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long i(rp.d dVar, boolean z10) throws IOException {
        rp.c cVar;
        if (z10) {
            dVar = new rp.c();
            cVar = dVar;
        } else {
            cVar = 0;
        }
        int size = this.f31054f.size();
        long j10 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            c cVar2 = this.f31054f.get(i10);
            u b10 = cVar2.b();
            c0 a10 = cVar2.a();
            jo.p.e(dVar);
            dVar.v0(f31048n);
            dVar.o0(this.f31052d);
            dVar.v0(f31047m);
            if (b10 != null) {
                int size2 = b10.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    dVar.a0(b10.g(i11)).v0(f31046l).a0(b10.m(i11)).v0(f31047m);
                }
            }
            x b11 = a10.b();
            if (b11 != null) {
                dVar.a0("Content-Type: ").a0(b11.toString()).v0(f31047m);
            }
            long a11 = a10.a();
            if (a11 != -1) {
                dVar.a0("Content-Length: ").J0(a11).v0(f31047m);
            } else if (z10) {
                jo.p.e(cVar);
                cVar.clear();
                return -1L;
            }
            byte[] bArr = f31047m;
            dVar.v0(bArr);
            if (z10) {
                j10 += a11;
            } else {
                a10.g(dVar);
            }
            dVar.v0(bArr);
        }
        jo.p.e(dVar);
        byte[] bArr2 = f31048n;
        dVar.v0(bArr2);
        dVar.o0(this.f31052d);
        dVar.v0(bArr2);
        dVar.v0(f31047m);
        if (z10) {
            jo.p.e(cVar);
            long X = j10 + cVar.X();
            cVar.clear();
            return X;
        }
        return j10;
    }

    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final rp.f f31055a;

        /* renamed from: b  reason: collision with root package name */
        public x f31056b;

        /* renamed from: c  reason: collision with root package name */
        public final List<c> f31057c;

        public a() {
            this(null, 1, null);
        }

        public a(String str) {
            jo.p.h(str, "boundary");
            this.f31055a = rp.f.f51677z.d(str);
            this.f31056b = y.f31041g;
            this.f31057c = new ArrayList();
        }

        public final a a(String str, String str2) {
            jo.p.h(str, "name");
            jo.p.h(str2, "value");
            d(c.f31058c.b(str, str2));
            return this;
        }

        public final a b(String str, String str2, c0 c0Var) {
            jo.p.h(str, "name");
            jo.p.h(c0Var, TtmlNode.TAG_BODY);
            d(c.f31058c.c(str, str2, c0Var));
            return this;
        }

        public final a c(u uVar, c0 c0Var) {
            jo.p.h(c0Var, TtmlNode.TAG_BODY);
            d(c.f31058c.a(uVar, c0Var));
            return this;
        }

        public final a d(c cVar) {
            jo.p.h(cVar, "part");
            this.f31057c.add(cVar);
            return this;
        }

        public final y e() {
            if (!this.f31057c.isEmpty()) {
                return new y(this.f31055a, this.f31056b, fp.b.O(this.f31057c));
            }
            throw new IllegalStateException("Multipart body must have at least one part.".toString());
        }

        public final a f(x xVar) {
            jo.p.h(xVar, "type");
            if (jo.p.c(xVar.h(), "multipart")) {
                this.f31056b = xVar;
                return this;
            }
            throw new IllegalArgumentException(("multipart != " + xVar).toString());
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public /* synthetic */ a(java.lang.String r1, int r2, jo.h r3) {
            /*
                r0 = this;
                r2 = r2 & 1
                if (r2 == 0) goto L11
                java.util.UUID r1 = java.util.UUID.randomUUID()
                java.lang.String r1 = r1.toString()
                java.lang.String r2 = "UUID.randomUUID().toString()"
                jo.p.g(r1, r2)
            L11:
                r0.<init>(r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ep.y.a.<init>(java.lang.String, int, jo.h):void");
        }
    }
}
