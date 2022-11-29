package okhttp3.internal.publicsuffix;

import com.mirrativ.llstream.protocol.v1.topic.TopicConstant;
import fp.b;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.IDN;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import jo.h;
import jo.p;
import ro.n;
import rp.e;
import rp.t;
import so.o;
import wn.v;
import xn.a0;
import xn.r;
import xn.s;

/* loaded from: classes4.dex */
public final class PublicSuffixDatabase {

    /* renamed from: a  reason: collision with root package name */
    public final AtomicBoolean f45439a = new AtomicBoolean(false);

    /* renamed from: b  reason: collision with root package name */
    public final CountDownLatch f45440b = new CountDownLatch(1);

    /* renamed from: c  reason: collision with root package name */
    public byte[] f45441c;

    /* renamed from: d  reason: collision with root package name */
    public byte[] f45442d;

    /* renamed from: h  reason: collision with root package name */
    public static final a f45438h = new a(null);

    /* renamed from: e  reason: collision with root package name */
    public static final byte[] f45435e = {(byte) 42};

    /* renamed from: f  reason: collision with root package name */
    public static final List<String> f45436f = r.d(TopicConstant.MATCH_SINGLE);

    /* renamed from: g  reason: collision with root package name */
    public static final PublicSuffixDatabase f45437g = new PublicSuffixDatabase();

    /* loaded from: classes4.dex */
    public static final class a {
        public a() {
        }

        public final String b(byte[] bArr, byte[][] bArr2, int i10) {
            int i11;
            boolean z10;
            int b10;
            int b11;
            int length = bArr.length;
            int i12 = 0;
            while (i12 < length) {
                int i13 = (i12 + length) / 2;
                while (i13 > -1 && bArr[i13] != ((byte) 10)) {
                    i13--;
                }
                int i14 = i13 + 1;
                int i15 = 1;
                while (true) {
                    i11 = i14 + i15;
                    if (bArr[i11] == ((byte) 10)) {
                        break;
                    }
                    i15++;
                }
                int i16 = i11 - i14;
                int i17 = i10;
                boolean z11 = false;
                int i18 = 0;
                int i19 = 0;
                while (true) {
                    if (z11) {
                        b10 = 46;
                        z10 = false;
                    } else {
                        z10 = z11;
                        b10 = b.b(bArr2[i17][i18], 255);
                    }
                    b11 = b10 - b.b(bArr[i14 + i19], 255);
                    if (b11 != 0) {
                        break;
                    }
                    i19++;
                    i18++;
                    if (i19 == i16) {
                        break;
                    } else if (bArr2[i17].length != i18) {
                        z11 = z10;
                    } else if (i17 == bArr2.length - 1) {
                        break;
                    } else {
                        i17++;
                        i18 = -1;
                        z11 = true;
                    }
                }
                if (b11 >= 0) {
                    if (b11 <= 0) {
                        int i20 = i16 - i19;
                        int length2 = bArr2[i17].length - i18;
                        int length3 = bArr2.length;
                        for (int i21 = i17 + 1; i21 < length3; i21++) {
                            length2 += bArr2[i21].length;
                        }
                        if (length2 >= i20) {
                            if (length2 <= i20) {
                                Charset charset = StandardCharsets.UTF_8;
                                p.g(charset, "UTF_8");
                                return new String(bArr, i14, i16, charset);
                            }
                        }
                    }
                    i12 = i11 + 1;
                }
                length = i14 - 1;
            }
            return null;
        }

        public final PublicSuffixDatabase c() {
            return PublicSuffixDatabase.f45437g;
        }

        public /* synthetic */ a(h hVar) {
            this();
        }
    }

    public final List<String> b(List<String> list) {
        String str;
        String str2;
        String str3;
        List<String> k10;
        List<String> k11;
        if (!this.f45439a.get() && this.f45439a.compareAndSet(false, true)) {
            e();
        } else {
            try {
                this.f45440b.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
        if (this.f45441c != null) {
            int size = list.size();
            byte[][] bArr = new byte[size];
            for (int i10 = 0; i10 < size; i10++) {
                String str4 = list.get(i10);
                Charset charset = StandardCharsets.UTF_8;
                p.g(charset, "UTF_8");
                Objects.requireNonNull(str4, "null cannot be cast to non-null type java.lang.String");
                byte[] bytes = str4.getBytes(charset);
                p.g(bytes, "(this as java.lang.String).getBytes(charset)");
                bArr[i10] = bytes;
            }
            int i11 = 0;
            while (true) {
                str = null;
                if (i11 >= size) {
                    str2 = null;
                    break;
                }
                a aVar = f45438h;
                byte[] bArr2 = this.f45441c;
                if (bArr2 == null) {
                    p.v("publicSuffixListBytes");
                }
                str2 = aVar.b(bArr2, bArr, i11);
                if (str2 != null) {
                    break;
                }
                i11++;
            }
            if (size > 1) {
                byte[][] bArr3 = (byte[][]) bArr.clone();
                int length = bArr3.length - 1;
                for (int i12 = 0; i12 < length; i12++) {
                    bArr3[i12] = f45435e;
                    a aVar2 = f45438h;
                    byte[] bArr4 = this.f45441c;
                    if (bArr4 == null) {
                        p.v("publicSuffixListBytes");
                    }
                    String b10 = aVar2.b(bArr4, bArr3, i12);
                    if (b10 != null) {
                        str3 = b10;
                        break;
                    }
                }
            }
            str3 = null;
            if (str3 != null) {
                int i13 = size - 1;
                int i14 = 0;
                while (true) {
                    if (i14 >= i13) {
                        break;
                    }
                    a aVar3 = f45438h;
                    byte[] bArr5 = this.f45442d;
                    if (bArr5 == null) {
                        p.v("publicSuffixExceptionListBytes");
                    }
                    String b11 = aVar3.b(bArr5, bArr, i14);
                    if (b11 != null) {
                        str = b11;
                        break;
                    }
                    i14++;
                }
            }
            if (str != null) {
                return o.q0('!' + str, new char[]{'.'}, false, 0, 6, null);
            } else if (str2 == null && str3 == null) {
                return f45436f;
            } else {
                if (str2 == null || (k10 = o.q0(str2, new char[]{'.'}, false, 0, 6, null)) == null) {
                    k10 = s.k();
                }
                if (str3 == null || (k11 = o.q0(str3, new char[]{'.'}, false, 0, 6, null)) == null) {
                    k11 = s.k();
                }
                return k10.size() > k11.size() ? k10 : k11;
            }
        }
        throw new IllegalStateException("Unable to load publicsuffixes.gz resource from the classpath.".toString());
    }

    public final String c(String str) {
        int size;
        int size2;
        p.h(str, "domain");
        String unicode = IDN.toUnicode(str);
        p.g(unicode, "unicodeDomain");
        List<String> f10 = f(unicode);
        List<String> b10 = b(f10);
        if (f10.size() != b10.size() || b10.get(0).charAt(0) == '!') {
            if (b10.get(0).charAt(0) == '!') {
                size = f10.size();
                size2 = b10.size();
            } else {
                size = f10.size();
                size2 = b10.size() + 1;
            }
            return n.p(n.h(a0.M(f(str)), size - size2), TopicConstant.SEPARATOR, null, null, 0, null, null, 62, null);
        }
        return null;
    }

    public final void d() throws IOException {
        InputStream resourceAsStream = PublicSuffixDatabase.class.getResourceAsStream("publicsuffixes.gz");
        if (resourceAsStream == null) {
            return;
        }
        e c10 = t.c(new rp.n(t.j(resourceAsStream)));
        try {
            byte[] t02 = c10.t0(c10.readInt());
            byte[] t03 = c10.t0(c10.readInt());
            v vVar = v.f59242a;
            go.a.a(c10, null);
            synchronized (this) {
                p.e(t02);
                this.f45441c = t02;
                p.e(t03);
                this.f45442d = t03;
            }
            this.f45440b.countDown();
        } finally {
        }
    }

    public final void e() {
        boolean z10 = false;
        while (true) {
            try {
                try {
                    d();
                    break;
                } catch (InterruptedIOException unused) {
                    Thread.interrupted();
                    z10 = true;
                } catch (IOException e10) {
                    np.h.f43761c.g().j("Failed to read public suffix list", 5, e10);
                    if (z10) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                    return;
                }
            } catch (Throwable th2) {
                if (z10) {
                    Thread.currentThread().interrupt();
                }
                throw th2;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
    }

    public final List<String> f(String str) {
        List<String> q02 = o.q0(str, new char[]{'.'}, false, 0, 6, null);
        return p.c((String) a0.i0(q02), "") ? a0.R(q02, 1) : q02;
    }
}
