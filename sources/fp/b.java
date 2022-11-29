package fp;

import ep.c0;
import ep.d0;
import ep.e0;
import ep.r;
import ep.u;
import ep.v;
import ep.z;
import java.io.Closeable;
import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.TimeZone;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import jo.p;
import po.i;
import rp.d;
import rp.f;
import rp.h0;
import rp.w;
import so.c;
import so.e;
import so.n;
import so.o;
import xn.a0;
import xn.i0;
import xn.n0;
import xn.s;
import xn.t;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a */
    public static final byte[] f32113a;

    /* renamed from: b */
    public static final u f32114b = u.f31010x.g(new String[0]);

    /* renamed from: c */
    public static final e0 f32115c;

    /* renamed from: d */
    public static final c0 f32116d;

    /* renamed from: e */
    public static final w f32117e;

    /* renamed from: f */
    public static final TimeZone f32118f;

    /* renamed from: g */
    public static final e f32119g;

    /* renamed from: h */
    public static final boolean f32120h;

    /* renamed from: i */
    public static final String f32121i;

    /* loaded from: classes4.dex */
    public static final class a implements r.c {

        /* renamed from: a */
        public final /* synthetic */ r f32122a;

        public a(r rVar) {
            this.f32122a = rVar;
        }

        @Override // ep.r.c
        public final r a(ep.e eVar) {
            p.h(eVar, "it");
            return this.f32122a;
        }
    }

    /* renamed from: fp.b$b */
    /* loaded from: classes4.dex */
    public static final class ThreadFactoryC0357b implements ThreadFactory {

        /* renamed from: a */
        public final /* synthetic */ String f32123a;

        /* renamed from: b */
        public final /* synthetic */ boolean f32124b;

        public ThreadFactoryC0357b(String str, boolean z10) {
            this.f32123a = str;
            this.f32124b = z10;
        }

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable, this.f32123a);
            thread.setDaemon(this.f32124b);
            return thread;
        }
    }

    static {
        byte[] bArr = new byte[0];
        f32113a = bArr;
        f32115c = e0.b.d(e0.f30848x, bArr, null, 1, null);
        f32116d = c0.a.i(c0.f30798a, bArr, null, 0, 0, 7, null);
        w.a aVar = w.f51731z;
        f.a aVar2 = f.f51677z;
        f32117e = aVar.d(aVar2.b("efbbbf"), aVar2.b("feff"), aVar2.b("fffe"), aVar2.b("0000ffff"), aVar2.b("ffff0000"));
        TimeZone timeZone = TimeZone.getTimeZone("GMT");
        p.e(timeZone);
        f32118f = timeZone;
        f32119g = new e("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
        f32120h = false;
        String name = z.class.getName();
        p.g(name, "OkHttpClient::class.java.name");
        f32121i = o.l0(o.k0(name, "okhttp3."), "Client");
    }

    public static final int A(String str, int i10) {
        p.h(str, "$this$indexOfNonWhitespace");
        int length = str.length();
        while (i10 < length) {
            char charAt = str.charAt(i10);
            if (charAt != ' ' && charAt != '\t') {
                return i10;
            }
            i10++;
        }
        return str.length();
    }

    public static final String[] B(String[] strArr, String[] strArr2, Comparator<? super String> comparator) {
        p.h(strArr, "$this$intersect");
        p.h(strArr2, "other");
        p.h(comparator, "comparator");
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            int length = strArr2.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    break;
                } else if (comparator.compare(str, strArr2[i10]) == 0) {
                    arrayList.add(str);
                    break;
                } else {
                    i10++;
                }
            }
        }
        Object[] array = arrayList.toArray(new String[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
        return (String[]) array;
    }

    public static final boolean C(Socket socket, rp.e eVar) {
        p.h(socket, "$this$isHealthy");
        p.h(eVar, "source");
        try {
            int soTimeout = socket.getSoTimeout();
            try {
                socket.setSoTimeout(1);
                boolean z10 = !eVar.a1();
                socket.setSoTimeout(soTimeout);
                return z10;
            } catch (Throwable th2) {
                socket.setSoTimeout(soTimeout);
                throw th2;
            }
        } catch (SocketTimeoutException unused) {
            return true;
        } catch (IOException unused2) {
            return false;
        }
    }

    public static final boolean D(String str) {
        p.h(str, "name");
        return n.q(str, "Authorization", true) || n.q(str, "Cookie", true) || n.q(str, "Proxy-Authorization", true) || n.q(str, "Set-Cookie", true);
    }

    public static final int E(char c10) {
        if ('0' <= c10 && '9' >= c10) {
            return c10 - '0';
        }
        char c11 = 'a';
        if ('a' > c10 || 'f' < c10) {
            c11 = 'A';
            if ('A' > c10 || 'F' < c10) {
                return -1;
            }
        }
        return (c10 - c11) + 10;
    }

    public static final Charset F(rp.e eVar, Charset charset) throws IOException {
        p.h(eVar, "$this$readBomAsCharset");
        p.h(charset, "default");
        int x12 = eVar.x1(f32117e);
        if (x12 != -1) {
            if (x12 == 0) {
                Charset charset2 = StandardCharsets.UTF_8;
                p.g(charset2, "UTF_8");
                return charset2;
            } else if (x12 == 1) {
                Charset charset3 = StandardCharsets.UTF_16BE;
                p.g(charset3, "UTF_16BE");
                return charset3;
            } else if (x12 == 2) {
                Charset charset4 = StandardCharsets.UTF_16LE;
                p.g(charset4, "UTF_16LE");
                return charset4;
            } else if (x12 != 3) {
                if (x12 == 4) {
                    return c.f52771a.b();
                }
                throw new AssertionError();
            } else {
                return c.f52771a.a();
            }
        }
        return charset;
    }

    public static final int G(rp.e eVar) throws IOException {
        p.h(eVar, "$this$readMedium");
        return b(eVar.readByte(), 255) | (b(eVar.readByte(), 255) << 16) | (b(eVar.readByte(), 255) << 8);
    }

    public static final int H(rp.c cVar, byte b10) {
        p.h(cVar, "$this$skipAll");
        int i10 = 0;
        while (!cVar.a1() && cVar.n(0L) == b10) {
            i10++;
            cVar.readByte();
        }
        return i10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0051, code lost:
        if (r5 == Long.MAX_VALUE) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0053, code lost:
        r11.m().a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x005b, code lost:
        r11.m().d(r0 + r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x007d, code lost:
        if (r5 != Long.MAX_VALUE) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0080, code lost:
        return r12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean I(rp.h0 r11, int r12, java.util.concurrent.TimeUnit r13) throws java.io.IOException {
        /*
            java.lang.String r0 = "$this$skipAll"
            jo.p.h(r11, r0)
            java.lang.String r0 = "timeUnit"
            jo.p.h(r13, r0)
            long r0 = java.lang.System.nanoTime()
            rp.i0 r2 = r11.m()
            boolean r2 = r2.e()
            r3 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r2 == 0) goto L27
            rp.i0 r2 = r11.m()
            long r5 = r2.c()
            long r5 = r5 - r0
            goto L28
        L27:
            r5 = r3
        L28:
            rp.i0 r2 = r11.m()
            long r7 = (long) r12
            long r12 = r13.toNanos(r7)
            long r12 = java.lang.Math.min(r5, r12)
            long r12 = r12 + r0
            r2.d(r12)
            rp.c r12 = new rp.c     // Catch: java.lang.Throwable -> L64 java.io.InterruptedIOException -> L7a
            r12.<init>()     // Catch: java.lang.Throwable -> L64 java.io.InterruptedIOException -> L7a
        L3e:
            r7 = 8192(0x2000, double:4.0474E-320)
            long r7 = r11.f1(r12, r7)     // Catch: java.lang.Throwable -> L64 java.io.InterruptedIOException -> L7a
            r9 = -1
            int r13 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r13 == 0) goto L4e
            r12.clear()     // Catch: java.lang.Throwable -> L64 java.io.InterruptedIOException -> L7a
            goto L3e
        L4e:
            r12 = 1
            int r13 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r13 != 0) goto L5b
        L53:
            rp.i0 r11 = r11.m()
            r11.a()
            goto L80
        L5b:
            rp.i0 r11 = r11.m()
            long r0 = r0 + r5
            r11.d(r0)
            goto L80
        L64:
            r12 = move-exception
            int r13 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r13 != 0) goto L71
            rp.i0 r11 = r11.m()
            r11.a()
            goto L79
        L71:
            rp.i0 r11 = r11.m()
            long r0 = r0 + r5
            r11.d(r0)
        L79:
            throw r12
        L7a:
            r12 = 0
            int r13 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r13 != 0) goto L5b
            goto L53
        L80:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: fp.b.I(rp.h0, int, java.util.concurrent.TimeUnit):boolean");
    }

    public static final ThreadFactory J(String str, boolean z10) {
        p.h(str, "name");
        return new ThreadFactoryC0357b(str, z10);
    }

    public static final List<mp.b> K(u uVar) {
        p.h(uVar, "$this$toHeaderList");
        i t10 = po.n.t(0, uVar.size());
        ArrayList arrayList = new ArrayList(t.u(t10, 10));
        Iterator<Integer> it = t10.iterator();
        while (it.hasNext()) {
            int b10 = ((i0) it).b();
            arrayList.add(new mp.b(uVar.g(b10), uVar.m(b10)));
        }
        return arrayList;
    }

    public static final u L(List<mp.b> list) {
        p.h(list, "$this$toHeaders");
        u.a aVar = new u.a();
        for (mp.b bVar : list) {
            aVar.e(bVar.a().L(), bVar.b().L());
        }
        return aVar.g();
    }

    public static final String M(v vVar, boolean z10) {
        String i10;
        p.h(vVar, "$this$toHostHeader");
        if (o.H(vVar.i(), ":", false, 2, null)) {
            i10 = '[' + vVar.i() + ']';
        } else {
            i10 = vVar.i();
        }
        if (z10 || vVar.o() != v.f31014l.c(vVar.v())) {
            return i10 + ':' + vVar.o();
        }
        return i10;
    }

    public static /* synthetic */ String N(v vVar, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return M(vVar, z10);
    }

    public static final <T> List<T> O(List<? extends T> list) {
        p.h(list, "$this$toImmutableList");
        List<T> unmodifiableList = Collections.unmodifiableList(a0.D0(list));
        p.g(unmodifiableList, "Collections.unmodifiableList(toMutableList())");
        return unmodifiableList;
    }

    public static final <K, V> Map<K, V> P(Map<K, ? extends V> map) {
        p.h(map, "$this$toImmutableMap");
        if (map.isEmpty()) {
            return n0.e();
        }
        Map<K, V> unmodifiableMap = Collections.unmodifiableMap(new LinkedHashMap(map));
        p.g(unmodifiableMap, "Collections.unmodifiableMap(LinkedHashMap(this))");
        return unmodifiableMap;
    }

    public static final long Q(String str, long j10) {
        p.h(str, "$this$toLongOrDefault");
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return j10;
        }
    }

    public static final int R(String str, int i10) {
        if (str != null) {
            try {
                long parseLong = Long.parseLong(str);
                if (parseLong > Integer.MAX_VALUE) {
                    return Integer.MAX_VALUE;
                }
                if (parseLong < 0) {
                    return 0;
                }
                return (int) parseLong;
            } catch (NumberFormatException unused) {
            }
        }
        return i10;
    }

    public static final String S(String str, int i10, int i11) {
        p.h(str, "$this$trimSubstring");
        int w10 = w(str, i10, i11);
        String substring = str.substring(w10, y(str, w10, i11));
        p.g(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    public static /* synthetic */ String T(String str, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = str.length();
        }
        return S(str, i10, i11);
    }

    public static final Throwable U(Exception exc, List<? extends Exception> list) {
        p.h(exc, "$this$withSuppressed");
        p.h(list, "suppressed");
        if (list.size() > 1) {
            System.out.println(list);
        }
        for (Exception exc2 : list) {
            wn.a.a(exc, exc2);
        }
        return exc;
    }

    public static final void V(d dVar, int i10) throws IOException {
        p.h(dVar, "$this$writeMedium");
        dVar.b1((i10 >>> 16) & 255);
        dVar.b1((i10 >>> 8) & 255);
        dVar.b1(i10 & 255);
    }

    public static final <E> void a(List<E> list, E e10) {
        p.h(list, "$this$addIfAbsent");
        if (list.contains(e10)) {
            return;
        }
        list.add(e10);
    }

    public static final int b(byte b10, int i10) {
        return b10 & i10;
    }

    public static final int c(short s10, int i10) {
        return s10 & i10;
    }

    public static final long d(int i10, long j10) {
        return i10 & j10;
    }

    public static final r.c e(r rVar) {
        p.h(rVar, "$this$asFactory");
        return new a(rVar);
    }

    public static final boolean f(String str) {
        p.h(str, "$this$canParseAsIpAddress");
        return f32119g.a(str);
    }

    public static final boolean g(v vVar, v vVar2) {
        p.h(vVar, "$this$canReuseConnectionFor");
        p.h(vVar2, "other");
        return p.c(vVar.i(), vVar2.i()) && vVar.o() == vVar2.o() && p.c(vVar.v(), vVar2.v());
    }

    public static final int h(String str, long j10, TimeUnit timeUnit) {
        p.h(str, "name");
        int i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        boolean z10 = true;
        if (!(i10 >= 0)) {
            throw new IllegalStateException((str + " < 0").toString());
        }
        if (timeUnit != null) {
            long millis = timeUnit.toMillis(j10);
            if (!(millis <= ((long) Integer.MAX_VALUE))) {
                throw new IllegalArgumentException((str + " too large.").toString());
            }
            if (millis == 0 && i10 > 0) {
                z10 = false;
            }
            if (z10) {
                return (int) millis;
            }
            throw new IllegalArgumentException((str + " too small.").toString());
        }
        throw new IllegalStateException("unit == null".toString());
    }

    public static final void i(long j10, long j11, long j12) {
        if ((j11 | j12) < 0 || j11 > j10 || j10 - j11 < j12) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public static final void j(Closeable closeable) {
        p.h(closeable, "$this$closeQuietly");
        try {
            closeable.close();
        } catch (RuntimeException e10) {
            throw e10;
        } catch (Exception unused) {
        }
    }

    public static final void k(Socket socket) {
        p.h(socket, "$this$closeQuietly");
        try {
            socket.close();
        } catch (AssertionError e10) {
            throw e10;
        } catch (RuntimeException e11) {
            if (!p.c(e11.getMessage(), "bio == null")) {
                throw e11;
            }
        } catch (Exception unused) {
        }
    }

    public static final String[] l(String[] strArr, String str) {
        p.h(strArr, "$this$concat");
        p.h(str, "value");
        Object[] copyOf = Arrays.copyOf(strArr, strArr.length + 1);
        p.g(copyOf, "java.util.Arrays.copyOf(this, newSize)");
        String[] strArr2 = (String[]) copyOf;
        strArr2[xn.o.L(strArr2)] = str;
        return strArr2;
    }

    public static final int m(String str, char c10, int i10, int i11) {
        p.h(str, "$this$delimiterOffset");
        while (i10 < i11) {
            if (str.charAt(i10) == c10) {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    public static final int n(String str, String str2, int i10, int i11) {
        p.h(str, "$this$delimiterOffset");
        p.h(str2, "delimiters");
        while (i10 < i11) {
            if (o.G(str2, str.charAt(i10), false, 2, null)) {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    public static /* synthetic */ int o(String str, char c10, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = str.length();
        }
        return m(str, c10, i10, i11);
    }

    public static final boolean p(h0 h0Var, int i10, TimeUnit timeUnit) {
        p.h(h0Var, "$this$discard");
        p.h(timeUnit, "timeUnit");
        try {
            return I(h0Var, i10, timeUnit);
        } catch (IOException unused) {
            return false;
        }
    }

    public static final String q(String str, Object... objArr) {
        p.h(str, "format");
        p.h(objArr, "args");
        jo.i0 i0Var = jo.i0.f38149a;
        Locale locale = Locale.US;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        String format = String.format(locale, str, Arrays.copyOf(copyOf, copyOf.length));
        p.g(format, "java.lang.String.format(locale, format, *args)");
        return format;
    }

    public static final boolean r(String[] strArr, String[] strArr2, Comparator<? super String> comparator) {
        p.h(strArr, "$this$hasIntersection");
        p.h(comparator, "comparator");
        if (!(strArr.length == 0) && strArr2 != null) {
            if (!(strArr2.length == 0)) {
                for (String str : strArr) {
                    for (String str2 : strArr2) {
                        if (comparator.compare(str, str2) == 0) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public static final long s(d0 d0Var) {
        p.h(d0Var, "$this$headersContentLength");
        String d10 = d0Var.p().d("Content-Length");
        if (d10 != null) {
            return Q(d10, -1L);
        }
        return -1L;
    }

    @SafeVarargs
    public static final <T> List<T> t(T... tArr) {
        p.h(tArr, "elements");
        Object[] objArr = (Object[]) tArr.clone();
        List<T> unmodifiableList = Collections.unmodifiableList(s.m(Arrays.copyOf(objArr, objArr.length)));
        p.g(unmodifiableList, "Collections.unmodifiable…istOf(*elements.clone()))");
        return unmodifiableList;
    }

    public static final int u(String[] strArr, String str, Comparator<String> comparator) {
        p.h(strArr, "$this$indexOf");
        p.h(str, "value");
        p.h(comparator, "comparator");
        int length = strArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (comparator.compare(strArr[i10], str) == 0) {
                return i10;
            }
        }
        return -1;
    }

    public static final int v(String str) {
        p.h(str, "$this$indexOfControlOrNonAscii");
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char charAt = str.charAt(i10);
            if (p.j(charAt, 31) <= 0 || p.j(charAt, 127) >= 0) {
                return i10;
            }
        }
        return -1;
    }

    public static final int w(String str, int i10, int i11) {
        p.h(str, "$this$indexOfFirstNonAsciiWhitespace");
        while (i10 < i11) {
            char charAt = str.charAt(i10);
            if (charAt != '\t' && charAt != '\n' && charAt != '\f' && charAt != '\r' && charAt != ' ') {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    public static /* synthetic */ int x(String str, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = str.length();
        }
        return w(str, i10, i11);
    }

    public static final int y(String str, int i10, int i11) {
        p.h(str, "$this$indexOfLastNonAsciiWhitespace");
        int i12 = i11 - 1;
        if (i12 >= i10) {
            while (true) {
                char charAt = str.charAt(i12);
                if (charAt != '\t' && charAt != '\n' && charAt != '\f' && charAt != '\r' && charAt != ' ') {
                    return i12 + 1;
                }
                if (i12 == i10) {
                    break;
                }
                i12--;
            }
        }
        return i10;
    }

    public static /* synthetic */ int z(String str, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = str.length();
        }
        return y(str, i10, i11);
    }
}
