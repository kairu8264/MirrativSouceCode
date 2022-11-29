package to;

import jo.p;
import po.l;
import so.o;

/* loaded from: classes4.dex */
public final class a implements Comparable<a> {
    public static final long A;

    /* renamed from: x  reason: collision with root package name */
    public static final C0842a f53887x = new C0842a(null);

    /* renamed from: y  reason: collision with root package name */
    public static final long f53888y = h(0);

    /* renamed from: z  reason: collision with root package name */
    public static final long f53889z;

    /* renamed from: w  reason: collision with root package name */
    public final long f53890w;

    /* renamed from: to.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0842a {
        public C0842a() {
        }

        public /* synthetic */ C0842a(jo.h hVar) {
            this();
        }
    }

    static {
        long e10;
        long e11;
        e10 = c.e(4611686018427387903L);
        f53889z = e10;
        e11 = c.e(-4611686018427387903L);
        A = e11;
    }

    public static final boolean A(long j10) {
        return j10 == f53889z || j10 == A;
    }

    public static final boolean B(long j10) {
        return j10 < 0;
    }

    public static final long C(long j10, d dVar) {
        p.h(dVar, "unit");
        if (j10 == f53889z) {
            return Long.MAX_VALUE;
        }
        if (j10 == A) {
            return Long.MIN_VALUE;
        }
        return e.a(w(j10), v(j10), dVar);
    }

    public static String D(long j10) {
        if (j10 == 0) {
            return "0s";
        }
        if (j10 == f53889z) {
            return "Infinity";
        }
        if (j10 == A) {
            return "-Infinity";
        }
        boolean B = B(j10);
        StringBuilder sb2 = new StringBuilder();
        if (B) {
            sb2.append('-');
        }
        long m10 = m(j10);
        long o10 = o(m10);
        int n10 = n(m10);
        int s10 = s(m10);
        int u10 = u(m10);
        int t10 = t(m10);
        int i10 = 0;
        boolean z10 = o10 != 0;
        boolean z11 = n10 != 0;
        boolean z12 = s10 != 0;
        boolean z13 = (u10 == 0 && t10 == 0) ? false : true;
        if (z10) {
            sb2.append(o10);
            sb2.append('d');
            i10 = 1;
        }
        if (z11 || (z10 && (z12 || z13))) {
            int i11 = i10 + 1;
            if (i10 > 0) {
                sb2.append(' ');
            }
            sb2.append(n10);
            sb2.append('h');
            i10 = i11;
        }
        if (z12 || (z13 && (z11 || z10))) {
            int i12 = i10 + 1;
            if (i10 > 0) {
                sb2.append(' ');
            }
            sb2.append(s10);
            sb2.append('m');
            i10 = i12;
        }
        if (z13) {
            int i13 = i10 + 1;
            if (i10 > 0) {
                sb2.append(' ');
            }
            if (u10 != 0 || z10 || z11 || z12) {
                a(j10, sb2, u10, t10, 9, "s", false);
            } else if (t10 >= 1000000) {
                a(j10, sb2, t10 / 1000000, t10 % 1000000, 6, "ms", false);
            } else if (t10 >= 1000) {
                a(j10, sb2, t10 / 1000, t10 % 1000, 3, "us", false);
            } else {
                sb2.append(t10);
                sb2.append("ns");
            }
            i10 = i13;
        }
        if (B && i10 > 1) {
            sb2.insert(1, '(').append(')');
        }
        String sb3 = sb2.toString();
        p.g(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }

    public static final long E(long j10) {
        long d10;
        d10 = c.d(-w(j10), ((int) j10) & 1);
        return d10;
    }

    public static final void a(long j10, StringBuilder sb2, int i10, int i11, int i12, String str, boolean z10) {
        sb2.append(i10);
        if (i11 != 0) {
            sb2.append('.');
            String e02 = o.e0(String.valueOf(i11), i12, '0');
            int i13 = -1;
            int length = e02.length() - 1;
            if (length >= 0) {
                while (true) {
                    int i14 = length - 1;
                    if (e02.charAt(length) != '0') {
                        i13 = length;
                        break;
                    } else if (i14 < 0) {
                        break;
                    } else {
                        length = i14;
                    }
                }
            }
            int i15 = i13 + 1;
            if (!z10 && i15 < 3) {
                sb2.append((CharSequence) e02, 0, i15);
                p.g(sb2, "this.append(value, startIndex, endIndex)");
            } else {
                sb2.append((CharSequence) e02, 0, ((i15 + 2) / 3) * 3);
                p.g(sb2, "this.append(value, startIndex, endIndex)");
            }
        }
        sb2.append(str);
    }

    public static int e(long j10, long j11) {
        long j12 = j10 ^ j11;
        if (j12 < 0 || (((int) j12) & 1) == 0) {
            return p.k(j10, j11);
        }
        int i10 = (((int) j10) & 1) - (((int) j11) & 1);
        return B(j10) ? -i10 : i10;
    }

    public static long h(long j10) {
        if (b.a()) {
            if (z(j10)) {
                if (!new l(-4611686018426999999L, 4611686018426999999L).r(w(j10))) {
                    throw new AssertionError(w(j10) + " ns is out of nanoseconds range");
                }
            } else if (new l(-4611686018427387903L, 4611686018427387903L).r(w(j10))) {
                if (new l(-4611686018426L, 4611686018426L).r(w(j10))) {
                    throw new AssertionError(w(j10) + " ms is denormalized");
                }
            } else {
                throw new AssertionError(w(j10) + " ms is out of milliseconds range");
            }
        }
        return j10;
    }

    public static boolean i(long j10, Object obj) {
        return (obj instanceof a) && j10 == ((a) obj).F();
    }

    public static final boolean l(long j10, long j11) {
        return j10 == j11;
    }

    public static final long m(long j10) {
        return B(j10) ? E(j10) : j10;
    }

    public static final int n(long j10) {
        if (A(j10)) {
            return 0;
        }
        return (int) (p(j10) % 24);
    }

    public static final long o(long j10) {
        return C(j10, d.DAYS);
    }

    public static final long p(long j10) {
        return C(j10, d.HOURS);
    }

    public static final long q(long j10) {
        return C(j10, d.MINUTES);
    }

    public static final long r(long j10) {
        return C(j10, d.SECONDS);
    }

    public static final int s(long j10) {
        if (A(j10)) {
            return 0;
        }
        return (int) (q(j10) % 60);
    }

    public static final int t(long j10) {
        long w10;
        if (A(j10)) {
            return 0;
        }
        if (y(j10)) {
            w10 = c.f(w(j10) % 1000);
        } else {
            w10 = w(j10) % 1000000000;
        }
        return (int) w10;
    }

    public static final int u(long j10) {
        if (A(j10)) {
            return 0;
        }
        return (int) (r(j10) % 60);
    }

    public static final d v(long j10) {
        return z(j10) ? d.NANOSECONDS : d.MILLISECONDS;
    }

    public static final long w(long j10) {
        return j10 >> 1;
    }

    public static int x(long j10) {
        return (int) (j10 ^ (j10 >>> 32));
    }

    public static final boolean y(long j10) {
        return (((int) j10) & 1) == 1;
    }

    public static final boolean z(long j10) {
        return (((int) j10) & 1) == 0;
    }

    public final /* synthetic */ long F() {
        return this.f53890w;
    }

    public int c(long j10) {
        return e(this.f53890w, j10);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(a aVar) {
        return c(aVar.F());
    }

    public boolean equals(Object obj) {
        return i(this.f53890w, obj);
    }

    public int hashCode() {
        return x(this.f53890w);
    }

    public String toString() {
        return D(this.f53890w);
    }
}
