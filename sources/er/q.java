package er;

import com.google.android.exoplayer2.util.FileTypes;
import com.mirrativ.llstream.protocol.v1.tag.TagConstant;
import ep.b0;
import ep.c0;
import ep.s;
import ep.u;
import ep.v;
import ep.y;
import java.io.IOException;
import java.util.regex.Pattern;

/* loaded from: classes4.dex */
public final class q {

    /* renamed from: l  reason: collision with root package name */
    public static final char[] f31207l = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: m  reason: collision with root package name */
    public static final Pattern f31208m = Pattern.compile("(.*/)?(\\.|%2e|%2E){1,2}(/.*)?");

    /* renamed from: a  reason: collision with root package name */
    public final String f31209a;

    /* renamed from: b  reason: collision with root package name */
    public final ep.v f31210b;

    /* renamed from: c  reason: collision with root package name */
    public String f31211c;

    /* renamed from: d  reason: collision with root package name */
    public v.a f31212d;

    /* renamed from: e  reason: collision with root package name */
    public final b0.a f31213e = new b0.a();

    /* renamed from: f  reason: collision with root package name */
    public final u.a f31214f;

    /* renamed from: g  reason: collision with root package name */
    public ep.x f31215g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f31216h;

    /* renamed from: i  reason: collision with root package name */
    public y.a f31217i;

    /* renamed from: j  reason: collision with root package name */
    public s.a f31218j;

    /* renamed from: k  reason: collision with root package name */
    public c0 f31219k;

    /* loaded from: classes4.dex */
    public static class a extends c0 {

        /* renamed from: b  reason: collision with root package name */
        public final c0 f31220b;

        /* renamed from: c  reason: collision with root package name */
        public final ep.x f31221c;

        public a(c0 c0Var, ep.x xVar) {
            this.f31220b = c0Var;
            this.f31221c = xVar;
        }

        @Override // ep.c0
        public long a() throws IOException {
            return this.f31220b.a();
        }

        @Override // ep.c0
        public ep.x b() {
            return this.f31221c;
        }

        @Override // ep.c0
        public void g(rp.d dVar) throws IOException {
            this.f31220b.g(dVar);
        }
    }

    public q(String str, ep.v vVar, String str2, ep.u uVar, ep.x xVar, boolean z10, boolean z11, boolean z12) {
        this.f31209a = str;
        this.f31210b = vVar;
        this.f31211c = str2;
        this.f31215g = xVar;
        this.f31216h = z10;
        if (uVar != null) {
            this.f31214f = uVar.j();
        } else {
            this.f31214f = new u.a();
        }
        if (z11) {
            this.f31218j = new s.a();
        } else if (z12) {
            y.a aVar = new y.a();
            this.f31217i = aVar;
            aVar.f(y.f31045k);
        }
    }

    public static String i(String str, boolean z10) {
        int length = str.length();
        int i10 = 0;
        while (i10 < length) {
            int codePointAt = str.codePointAt(i10);
            if (codePointAt >= 32 && codePointAt < 127 && " \"<>^`{}|\\?#".indexOf(codePointAt) == -1 && (z10 || (codePointAt != 47 && codePointAt != 37))) {
                i10 += Character.charCount(codePointAt);
            } else {
                rp.c cVar = new rp.c();
                cVar.g0(str, 0, i10);
                j(cVar, str, i10, length, z10);
                return cVar.N();
            }
        }
        return str;
    }

    public static void j(rp.c cVar, String str, int i10, int i11, boolean z10) {
        rp.c cVar2 = null;
        while (i10 < i11) {
            int codePointAt = str.codePointAt(i10);
            if (!z10 || (codePointAt != 9 && codePointAt != 10 && codePointAt != 12 && codePointAt != 13)) {
                if (codePointAt >= 32 && codePointAt < 127 && " \"<>^`{}|\\?#".indexOf(codePointAt) == -1 && (z10 || (codePointAt != 47 && codePointAt != 37))) {
                    cVar.T0(codePointAt);
                } else {
                    if (cVar2 == null) {
                        cVar2 = new rp.c();
                    }
                    cVar2.T0(codePointAt);
                    while (!cVar2.a1()) {
                        int readByte = cVar2.readByte() & TagConstant.TAG_CAT_RESERVED;
                        cVar.b1(37);
                        char[] cArr = f31207l;
                        cVar.b1(cArr[(readByte >> 4) & 15]);
                        cVar.b1(cArr[readByte & 15]);
                    }
                }
            }
            i10 += Character.charCount(codePointAt);
        }
    }

    public void a(String str, String str2, boolean z10) {
        if (z10) {
            this.f31218j.b(str, str2);
        } else {
            this.f31218j.a(str, str2);
        }
    }

    public void b(String str, String str2) {
        if (FileTypes.HEADER_CONTENT_TYPE.equalsIgnoreCase(str)) {
            try {
                this.f31215g = ep.x.e(str2);
                return;
            } catch (IllegalArgumentException e10) {
                throw new IllegalArgumentException("Malformed content type: " + str2, e10);
            }
        }
        this.f31214f.b(str, str2);
    }

    public void c(ep.u uVar) {
        this.f31214f.c(uVar);
    }

    public void d(ep.u uVar, c0 c0Var) {
        this.f31217i.c(uVar, c0Var);
    }

    public void e(y.c cVar) {
        this.f31217i.d(cVar);
    }

    public void f(String str, String str2, boolean z10) {
        if (this.f31211c != null) {
            String i10 = i(str2, z10);
            String str3 = this.f31211c;
            String replace = str3.replace("{" + str + "}", i10);
            if (!f31208m.matcher(replace).matches()) {
                this.f31211c = replace;
                return;
            }
            throw new IllegalArgumentException("@Path parameters shouldn't perform path traversal ('.' or '..'): " + str2);
        }
        throw new AssertionError();
    }

    public void g(String str, String str2, boolean z10) {
        String str3 = this.f31211c;
        if (str3 != null) {
            v.a l10 = this.f31210b.l(str3);
            this.f31212d = l10;
            if (l10 != null) {
                this.f31211c = null;
            } else {
                throw new IllegalArgumentException("Malformed URL. Base: " + this.f31210b + ", Relative: " + this.f31211c);
            }
        }
        if (z10) {
            this.f31212d.a(str, str2);
        } else {
            this.f31212d.b(str, str2);
        }
    }

    public <T> void h(Class<T> cls, T t10) {
        this.f31213e.h(cls, t10);
    }

    public b0.a k() {
        ep.v u10;
        v.a aVar = this.f31212d;
        if (aVar != null) {
            u10 = aVar.c();
        } else {
            u10 = this.f31210b.u(this.f31211c);
            if (u10 == null) {
                throw new IllegalArgumentException("Malformed URL. Base: " + this.f31210b + ", Relative: " + this.f31211c);
            }
        }
        a aVar2 = this.f31219k;
        if (aVar2 == null) {
            s.a aVar3 = this.f31218j;
            if (aVar3 != null) {
                aVar2 = aVar3.c();
            } else {
                y.a aVar4 = this.f31217i;
                if (aVar4 != null) {
                    aVar2 = aVar4.e();
                } else if (this.f31216h) {
                    aVar2 = c0.d(null, new byte[0]);
                }
            }
        }
        ep.x xVar = this.f31215g;
        if (xVar != null) {
            if (aVar2 != null) {
                aVar2 = new a(aVar2, xVar);
            } else {
                this.f31214f.b(FileTypes.HEADER_CONTENT_TYPE, xVar.toString());
            }
        }
        return this.f31213e.i(u10).e(this.f31214f.g()).f(this.f31209a, aVar2);
    }

    public void l(c0 c0Var) {
        this.f31219k = c0Var;
    }

    public void m(Object obj) {
        this.f31211c = obj.toString();
    }
}
