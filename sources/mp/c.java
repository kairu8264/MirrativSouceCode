package mp;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import jo.p;
import rp.h0;
import rp.t;
import xn.a0;
import xn.n;

/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final mp.b[] f41236a;

    /* renamed from: b  reason: collision with root package name */
    public static final Map<rp.f, Integer> f41237b;

    /* renamed from: c  reason: collision with root package name */
    public static final c f41238c;

    static {
        c cVar = new c();
        f41238c = cVar;
        rp.f fVar = mp.b.f41228f;
        rp.f fVar2 = mp.b.f41229g;
        rp.f fVar3 = mp.b.f41230h;
        rp.f fVar4 = mp.b.f41227e;
        f41236a = new mp.b[]{new mp.b(mp.b.f41231i, ""), new mp.b(fVar, "GET"), new mp.b(fVar, "POST"), new mp.b(fVar2, "/"), new mp.b(fVar2, "/index.html"), new mp.b(fVar3, "http"), new mp.b(fVar3, "https"), new mp.b(fVar4, "200"), new mp.b(fVar4, "204"), new mp.b(fVar4, "206"), new mp.b(fVar4, "304"), new mp.b(fVar4, "400"), new mp.b(fVar4, "404"), new mp.b(fVar4, "500"), new mp.b("accept-charset", ""), new mp.b("accept-encoding", "gzip, deflate"), new mp.b("accept-language", ""), new mp.b("accept-ranges", ""), new mp.b("accept", ""), new mp.b("access-control-allow-origin", ""), new mp.b("age", ""), new mp.b("allow", ""), new mp.b("authorization", ""), new mp.b("cache-control", ""), new mp.b("content-disposition", ""), new mp.b("content-encoding", ""), new mp.b("content-language", ""), new mp.b("content-length", ""), new mp.b("content-location", ""), new mp.b("content-range", ""), new mp.b("content-type", ""), new mp.b("cookie", ""), new mp.b("date", ""), new mp.b("etag", ""), new mp.b("expect", ""), new mp.b("expires", ""), new mp.b("from", ""), new mp.b("host", ""), new mp.b("if-match", ""), new mp.b("if-modified-since", ""), new mp.b("if-none-match", ""), new mp.b("if-range", ""), new mp.b("if-unmodified-since", ""), new mp.b("last-modified", ""), new mp.b("link", ""), new mp.b("location", ""), new mp.b("max-forwards", ""), new mp.b("proxy-authenticate", ""), new mp.b("proxy-authorization", ""), new mp.b("range", ""), new mp.b("referer", ""), new mp.b("refresh", ""), new mp.b("retry-after", ""), new mp.b("server", ""), new mp.b("set-cookie", ""), new mp.b("strict-transport-security", ""), new mp.b("transfer-encoding", ""), new mp.b("user-agent", ""), new mp.b("vary", ""), new mp.b("via", ""), new mp.b("www-authenticate", "")};
        f41237b = cVar.d();
    }

    public final rp.f a(rp.f fVar) throws IOException {
        p.h(fVar, "name");
        int G = fVar.G();
        for (int i10 = 0; i10 < G; i10++) {
            byte b10 = (byte) 65;
            byte b11 = (byte) 90;
            byte l10 = fVar.l(i10);
            if (b10 <= l10 && b11 >= l10) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: " + fVar.L());
            }
        }
        return fVar;
    }

    public final Map<rp.f, Integer> b() {
        return f41237b;
    }

    public final mp.b[] c() {
        return f41236a;
    }

    public final Map<rp.f, Integer> d() {
        mp.b[] bVarArr = f41236a;
        LinkedHashMap linkedHashMap = new LinkedHashMap(bVarArr.length);
        int length = bVarArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            mp.b[] bVarArr2 = f41236a;
            if (!linkedHashMap.containsKey(bVarArr2[i10].f41234b)) {
                linkedHashMap.put(bVarArr2[i10].f41234b, Integer.valueOf(i10));
            }
        }
        Map<rp.f, Integer> unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        p.g(unmodifiableMap, "Collections.unmodifiableMap(result)");
        return unmodifiableMap;
    }

    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final List<mp.b> f41239a;

        /* renamed from: b  reason: collision with root package name */
        public final rp.e f41240b;

        /* renamed from: c  reason: collision with root package name */
        public mp.b[] f41241c;

        /* renamed from: d  reason: collision with root package name */
        public int f41242d;

        /* renamed from: e  reason: collision with root package name */
        public int f41243e;

        /* renamed from: f  reason: collision with root package name */
        public int f41244f;

        /* renamed from: g  reason: collision with root package name */
        public final int f41245g;

        /* renamed from: h  reason: collision with root package name */
        public int f41246h;

        public a(h0 h0Var, int i10, int i11) {
            p.h(h0Var, "source");
            this.f41245g = i10;
            this.f41246h = i11;
            this.f41239a = new ArrayList();
            this.f41240b = t.c(h0Var);
            mp.b[] bVarArr = new mp.b[8];
            this.f41241c = bVarArr;
            this.f41242d = bVarArr.length - 1;
        }

        public final void a() {
            int i10 = this.f41246h;
            int i11 = this.f41244f;
            if (i10 < i11) {
                if (i10 == 0) {
                    b();
                } else {
                    d(i11 - i10);
                }
            }
        }

        public final void b() {
            n.t(this.f41241c, null, 0, 0, 6, null);
            this.f41242d = this.f41241c.length - 1;
            this.f41243e = 0;
            this.f41244f = 0;
        }

        public final int c(int i10) {
            return this.f41242d + 1 + i10;
        }

        public final int d(int i10) {
            int i11;
            int i12 = 0;
            if (i10 > 0) {
                int length = this.f41241c.length;
                while (true) {
                    length--;
                    i11 = this.f41242d;
                    if (length < i11 || i10 <= 0) {
                        break;
                    }
                    mp.b bVar = this.f41241c[length];
                    p.e(bVar);
                    int i13 = bVar.f41233a;
                    i10 -= i13;
                    this.f41244f -= i13;
                    this.f41243e--;
                    i12++;
                }
                mp.b[] bVarArr = this.f41241c;
                System.arraycopy(bVarArr, i11 + 1, bVarArr, i11 + 1 + i12, this.f41243e);
                this.f41242d += i12;
            }
            return i12;
        }

        public final List<mp.b> e() {
            List<mp.b> B0 = a0.B0(this.f41239a);
            this.f41239a.clear();
            return B0;
        }

        public final rp.f f(int i10) throws IOException {
            if (h(i10)) {
                return c.f41238c.c()[i10].f41234b;
            }
            int c10 = c(i10 - c.f41238c.c().length);
            if (c10 >= 0) {
                mp.b[] bVarArr = this.f41241c;
                if (c10 < bVarArr.length) {
                    mp.b bVar = bVarArr[c10];
                    p.e(bVar);
                    return bVar.f41234b;
                }
            }
            throw new IOException("Header index too large " + (i10 + 1));
        }

        public final void g(int i10, mp.b bVar) {
            this.f41239a.add(bVar);
            int i11 = bVar.f41233a;
            if (i10 != -1) {
                mp.b bVar2 = this.f41241c[c(i10)];
                p.e(bVar2);
                i11 -= bVar2.f41233a;
            }
            int i12 = this.f41246h;
            if (i11 > i12) {
                b();
                return;
            }
            int d10 = d((this.f41244f + i11) - i12);
            if (i10 == -1) {
                int i13 = this.f41243e + 1;
                mp.b[] bVarArr = this.f41241c;
                if (i13 > bVarArr.length) {
                    mp.b[] bVarArr2 = new mp.b[bVarArr.length * 2];
                    System.arraycopy(bVarArr, 0, bVarArr2, bVarArr.length, bVarArr.length);
                    this.f41242d = this.f41241c.length - 1;
                    this.f41241c = bVarArr2;
                }
                int i14 = this.f41242d;
                this.f41242d = i14 - 1;
                this.f41241c[i14] = bVar;
                this.f41243e++;
            } else {
                this.f41241c[i10 + c(i10) + d10] = bVar;
            }
            this.f41244f += i11;
        }

        public final boolean h(int i10) {
            return i10 >= 0 && i10 <= c.f41238c.c().length - 1;
        }

        public final int i() throws IOException {
            return fp.b.b(this.f41240b.readByte(), 255);
        }

        public final rp.f j() throws IOException {
            int i10 = i();
            boolean z10 = (i10 & 128) == 128;
            long m10 = m(i10, 127);
            if (z10) {
                rp.c cVar = new rp.c();
                j.f41392d.b(this.f41240b, m10, cVar);
                return cVar.G();
            }
            return this.f41240b.R0(m10);
        }

        public final void k() throws IOException {
            while (!this.f41240b.a1()) {
                int b10 = fp.b.b(this.f41240b.readByte(), 255);
                if (b10 == 128) {
                    throw new IOException("index == 0");
                }
                if ((b10 & 128) == 128) {
                    l(m(b10, 127) - 1);
                } else if (b10 == 64) {
                    o();
                } else if ((b10 & 64) == 64) {
                    n(m(b10, 63) - 1);
                } else if ((b10 & 32) == 32) {
                    int m10 = m(b10, 31);
                    this.f41246h = m10;
                    if (m10 >= 0 && m10 <= this.f41245g) {
                        a();
                    } else {
                        throw new IOException("Invalid dynamic table size update " + this.f41246h);
                    }
                } else if (b10 != 16 && b10 != 0) {
                    p(m(b10, 15) - 1);
                } else {
                    q();
                }
            }
        }

        public final void l(int i10) throws IOException {
            if (h(i10)) {
                this.f41239a.add(c.f41238c.c()[i10]);
                return;
            }
            int c10 = c(i10 - c.f41238c.c().length);
            if (c10 >= 0) {
                mp.b[] bVarArr = this.f41241c;
                if (c10 < bVarArr.length) {
                    List<mp.b> list = this.f41239a;
                    mp.b bVar = bVarArr[c10];
                    p.e(bVar);
                    list.add(bVar);
                    return;
                }
            }
            throw new IOException("Header index too large " + (i10 + 1));
        }

        public final int m(int i10, int i11) throws IOException {
            int i12 = i10 & i11;
            if (i12 < i11) {
                return i12;
            }
            int i13 = 0;
            while (true) {
                int i14 = i();
                if ((i14 & 128) == 0) {
                    return i11 + (i14 << i13);
                }
                i11 += (i14 & 127) << i13;
                i13 += 7;
            }
        }

        public final void n(int i10) throws IOException {
            g(-1, new mp.b(f(i10), j()));
        }

        public final void o() throws IOException {
            g(-1, new mp.b(c.f41238c.a(j()), j()));
        }

        public final void p(int i10) throws IOException {
            this.f41239a.add(new mp.b(f(i10), j()));
        }

        public final void q() throws IOException {
            this.f41239a.add(new mp.b(c.f41238c.a(j()), j()));
        }

        public /* synthetic */ a(h0 h0Var, int i10, int i11, int i12, jo.h hVar) {
            this(h0Var, i10, (i12 & 4) != 0 ? i10 : i11);
        }
    }

    /* loaded from: classes4.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public int f41247a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f41248b;

        /* renamed from: c  reason: collision with root package name */
        public int f41249c;

        /* renamed from: d  reason: collision with root package name */
        public mp.b[] f41250d;

        /* renamed from: e  reason: collision with root package name */
        public int f41251e;

        /* renamed from: f  reason: collision with root package name */
        public int f41252f;

        /* renamed from: g  reason: collision with root package name */
        public int f41253g;

        /* renamed from: h  reason: collision with root package name */
        public int f41254h;

        /* renamed from: i  reason: collision with root package name */
        public final boolean f41255i;

        /* renamed from: j  reason: collision with root package name */
        public final rp.c f41256j;

        public b(int i10, boolean z10, rp.c cVar) {
            p.h(cVar, "out");
            this.f41254h = i10;
            this.f41255i = z10;
            this.f41256j = cVar;
            this.f41247a = Integer.MAX_VALUE;
            this.f41249c = i10;
            mp.b[] bVarArr = new mp.b[8];
            this.f41250d = bVarArr;
            this.f41251e = bVarArr.length - 1;
        }

        public final void a() {
            int i10 = this.f41249c;
            int i11 = this.f41253g;
            if (i10 < i11) {
                if (i10 == 0) {
                    b();
                } else {
                    c(i11 - i10);
                }
            }
        }

        public final void b() {
            n.t(this.f41250d, null, 0, 0, 6, null);
            this.f41251e = this.f41250d.length - 1;
            this.f41252f = 0;
            this.f41253g = 0;
        }

        public final int c(int i10) {
            int i11;
            int i12 = 0;
            if (i10 > 0) {
                int length = this.f41250d.length;
                while (true) {
                    length--;
                    i11 = this.f41251e;
                    if (length < i11 || i10 <= 0) {
                        break;
                    }
                    mp.b bVar = this.f41250d[length];
                    p.e(bVar);
                    i10 -= bVar.f41233a;
                    int i13 = this.f41253g;
                    mp.b bVar2 = this.f41250d[length];
                    p.e(bVar2);
                    this.f41253g = i13 - bVar2.f41233a;
                    this.f41252f--;
                    i12++;
                }
                mp.b[] bVarArr = this.f41250d;
                System.arraycopy(bVarArr, i11 + 1, bVarArr, i11 + 1 + i12, this.f41252f);
                mp.b[] bVarArr2 = this.f41250d;
                int i14 = this.f41251e;
                Arrays.fill(bVarArr2, i14 + 1, i14 + 1 + i12, (Object) null);
                this.f41251e += i12;
            }
            return i12;
        }

        public final void d(mp.b bVar) {
            int i10 = bVar.f41233a;
            int i11 = this.f41249c;
            if (i10 > i11) {
                b();
                return;
            }
            c((this.f41253g + i10) - i11);
            int i12 = this.f41252f + 1;
            mp.b[] bVarArr = this.f41250d;
            if (i12 > bVarArr.length) {
                mp.b[] bVarArr2 = new mp.b[bVarArr.length * 2];
                System.arraycopy(bVarArr, 0, bVarArr2, bVarArr.length, bVarArr.length);
                this.f41251e = this.f41250d.length - 1;
                this.f41250d = bVarArr2;
            }
            int i13 = this.f41251e;
            this.f41251e = i13 - 1;
            this.f41250d[i13] = bVar;
            this.f41252f++;
            this.f41253g += i10;
        }

        public final void e(int i10) {
            this.f41254h = i10;
            int min = Math.min(i10, 16384);
            int i11 = this.f41249c;
            if (i11 == min) {
                return;
            }
            if (min < i11) {
                this.f41247a = Math.min(this.f41247a, min);
            }
            this.f41248b = true;
            this.f41249c = min;
            a();
        }

        public final void f(rp.f fVar) throws IOException {
            p.h(fVar, "data");
            if (this.f41255i) {
                j jVar = j.f41392d;
                if (jVar.d(fVar) < fVar.G()) {
                    rp.c cVar = new rp.c();
                    jVar.c(fVar, cVar);
                    rp.f G = cVar.G();
                    h(G.G(), 127, 128);
                    this.f41256j.o0(G);
                    return;
                }
            }
            h(fVar.G(), 127, 0);
            this.f41256j.o0(fVar);
        }

        public final void g(List<mp.b> list) throws IOException {
            int i10;
            int i11;
            p.h(list, "headerBlock");
            if (this.f41248b) {
                int i12 = this.f41247a;
                if (i12 < this.f41249c) {
                    h(i12, 31, 32);
                }
                this.f41248b = false;
                this.f41247a = Integer.MAX_VALUE;
                h(this.f41249c, 31, 32);
            }
            int size = list.size();
            for (int i13 = 0; i13 < size; i13++) {
                mp.b bVar = list.get(i13);
                rp.f K = bVar.f41234b.K();
                rp.f fVar = bVar.f41235c;
                c cVar = c.f41238c;
                Integer num = cVar.b().get(K);
                if (num != null) {
                    i11 = num.intValue() + 1;
                    if (2 <= i11 && 7 >= i11) {
                        if (p.c(cVar.c()[i11 - 1].f41235c, fVar)) {
                            i10 = i11;
                        } else if (p.c(cVar.c()[i11].f41235c, fVar)) {
                            i11++;
                            i10 = i11;
                        }
                    }
                    i10 = i11;
                    i11 = -1;
                } else {
                    i10 = -1;
                    i11 = -1;
                }
                if (i11 == -1) {
                    int i14 = this.f41251e + 1;
                    int length = this.f41250d.length;
                    while (true) {
                        if (i14 >= length) {
                            break;
                        }
                        mp.b bVar2 = this.f41250d[i14];
                        p.e(bVar2);
                        if (p.c(bVar2.f41234b, K)) {
                            mp.b bVar3 = this.f41250d[i14];
                            p.e(bVar3);
                            if (p.c(bVar3.f41235c, fVar)) {
                                i11 = c.f41238c.c().length + (i14 - this.f41251e);
                                break;
                            } else if (i10 == -1) {
                                i10 = (i14 - this.f41251e) + c.f41238c.c().length;
                            }
                        }
                        i14++;
                    }
                }
                if (i11 != -1) {
                    h(i11, 127, 128);
                } else if (i10 == -1) {
                    this.f41256j.b1(64);
                    f(K);
                    f(fVar);
                    d(bVar);
                } else if (K.H(mp.b.f41226d) && (!p.c(mp.b.f41231i, K))) {
                    h(i10, 15, 0);
                    f(fVar);
                } else {
                    h(i10, 63, 64);
                    f(fVar);
                    d(bVar);
                }
            }
        }

        public final void h(int i10, int i11, int i12) {
            if (i10 < i11) {
                this.f41256j.b1(i10 | i12);
                return;
            }
            this.f41256j.b1(i12 | i11);
            int i13 = i10 - i11;
            while (i13 >= 128) {
                this.f41256j.b1(128 | (i13 & 127));
                i13 >>>= 7;
            }
            this.f41256j.b1(i13);
        }

        public /* synthetic */ b(int i10, boolean z10, rp.c cVar, int i11, jo.h hVar) {
            this((i11 & 1) != 0 ? 4096 : i10, (i11 & 2) != 0 ? true : z10, cVar);
        }
    }
}
