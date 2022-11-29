package rp;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes4.dex */
public class f implements Serializable, Comparable<f> {

    /* renamed from: w */
    public final byte[] f51678w;

    /* renamed from: x */
    public transient int f51679x;

    /* renamed from: y */
    public transient String f51680y;

    /* renamed from: z */
    public static final a f51677z = new a(null);
    public static final f A = new f(new byte[0]);

    /* loaded from: classes4.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public static /* synthetic */ f f(a aVar, byte[] bArr, int i10, int i11, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i10 = 0;
            }
            if ((i12 & 2) != 0) {
                i11 = bArr.length;
            }
            return aVar.e(bArr, i10, i11);
        }

        public final f a(String str) {
            jo.p.h(str, "<this>");
            byte[] a10 = l0.a(str);
            if (a10 != null) {
                return new f(a10);
            }
            return null;
        }

        public final f b(String str) {
            int e10;
            int e11;
            jo.p.h(str, "<this>");
            int i10 = 0;
            if (str.length() % 2 == 0) {
                int length = str.length() / 2;
                byte[] bArr = new byte[length];
                int i11 = length - 1;
                if (i11 >= 0) {
                    while (true) {
                        int i12 = i10 + 1;
                        int i13 = i10 * 2;
                        e10 = sp.g.e(str.charAt(i13));
                        e11 = sp.g.e(str.charAt(i13 + 1));
                        bArr[i10] = (byte) ((e10 << 4) + e11);
                        if (i12 > i11) {
                            break;
                        }
                        i10 = i12;
                    }
                }
                return new f(bArr);
            }
            throw new IllegalArgumentException(jo.p.o("Unexpected hex string: ", str).toString());
        }

        public final f c(String str, Charset charset) {
            jo.p.h(str, "<this>");
            jo.p.h(charset, "charset");
            byte[] bytes = str.getBytes(charset);
            jo.p.g(bytes, "(this as java.lang.String).getBytes(charset)");
            return new f(bytes);
        }

        public final f d(String str) {
            jo.p.h(str, "<this>");
            f fVar = new f(m0.a(str));
            fVar.D(str);
            return fVar;
        }

        public final f e(byte[] bArr, int i10, int i11) {
            jo.p.h(bArr, "<this>");
            n0.b(bArr.length, i10, i11);
            return new f(xn.n.n(bArr, i10, i11 + i10));
        }
    }

    public f(byte[] bArr) {
        jo.p.h(bArr, "data");
        this.f51678w = bArr;
    }

    public static /* synthetic */ f J(f fVar, int i10, int i11, int i12, Object obj) {
        if (obj == null) {
            if ((i12 & 1) != 0) {
                i10 = 0;
            }
            if ((i12 & 2) != 0) {
                i11 = n0.c();
            }
            return fVar.I(i10, i11);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: substring");
    }

    public static final f h(String str) {
        return f51677z.d(str);
    }

    public static /* synthetic */ int t(f fVar, f fVar2, int i10, int i11, Object obj) {
        if (obj == null) {
            if ((i11 & 2) != 0) {
                i10 = 0;
            }
            return fVar.r(fVar2, i10);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: indexOf");
    }

    public static /* synthetic */ int y(f fVar, f fVar2, int i10, int i11, Object obj) {
        if (obj == null) {
            if ((i11 & 2) != 0) {
                i10 = n0.c();
            }
            return fVar.w(fVar2, i10);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: lastIndexOf");
    }

    public static final f z(byte[] bArr, int i10, int i11) {
        return f51677z.e(bArr, i10, i11);
    }

    public boolean A(int i10, f fVar, int i11, int i12) {
        jo.p.h(fVar, "other");
        return fVar.B(i11, m(), i10, i12);
    }

    public boolean B(int i10, byte[] bArr, int i11, int i12) {
        jo.p.h(bArr, "other");
        return i10 >= 0 && i10 <= m().length - i12 && i11 >= 0 && i11 <= bArr.length - i12 && n0.a(m(), i10, bArr, i11, i12);
    }

    public final void C(int i10) {
        this.f51679x = i10;
    }

    public final void D(String str) {
        this.f51680y = str;
    }

    public final f E() {
        return e("SHA-1");
    }

    public final f F() {
        return e("SHA-256");
    }

    public final int G() {
        return o();
    }

    public final boolean H(f fVar) {
        jo.p.h(fVar, "prefix");
        return A(0, fVar, 0, fVar.G());
    }

    public f I(int i10, int i11) {
        int d10 = n0.d(this, i11);
        if (i10 >= 0) {
            if (d10 <= m().length) {
                if (d10 - i10 >= 0) {
                    return (i10 == 0 && d10 == m().length) ? this : new f(xn.n.n(m(), i10, d10));
                }
                throw new IllegalArgumentException("endIndex < beginIndex".toString());
            }
            throw new IllegalArgumentException(("endIndex > length(" + m().length + ')').toString());
        }
        throw new IllegalArgumentException("beginIndex < 0".toString());
    }

    public f K() {
        byte b10;
        for (int i10 = 0; i10 < m().length; i10++) {
            byte b11 = m()[i10];
            byte b12 = (byte) 65;
            if (b11 >= b12 && b11 <= (b10 = (byte) 90)) {
                byte[] m10 = m();
                byte[] copyOf = Arrays.copyOf(m10, m10.length);
                jo.p.g(copyOf, "java.util.Arrays.copyOf(this, size)");
                copyOf[i10] = (byte) (b11 + 32);
                for (int i11 = i10 + 1; i11 < copyOf.length; i11++) {
                    byte b13 = copyOf[i11];
                    if (b13 >= b12 && b13 <= b10) {
                        copyOf[i11] = (byte) (b13 + 32);
                    }
                }
                return new f(copyOf);
            }
        }
        return this;
    }

    public String L() {
        String p10 = p();
        if (p10 == null) {
            String b10 = m0.b(u());
            D(b10);
            return b10;
        }
        return p10;
    }

    public void M(c cVar, int i10, int i11) {
        jo.p.h(cVar, "buffer");
        sp.g.d(this, cVar, i10, i11);
    }

    public String a() {
        return l0.c(m(), null, 1, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0028, code lost:
        if (r7 < r8) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x002e, code lost:
        if (r0 < r1) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0033, code lost:
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:?, code lost:
        return -1;
     */
    @Override // java.lang.Comparable
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int compareTo(rp.f r10) {
        /*
            r9 = this;
            java.lang.String r0 = "other"
            jo.p.h(r10, r0)
            int r0 = r9.G()
            int r1 = r10.G()
            int r2 = java.lang.Math.min(r0, r1)
            r3 = 0
            r4 = r3
        L13:
            r5 = -1
            r6 = 1
            if (r4 >= r2) goto L2b
            byte r7 = r9.l(r4)
            r7 = r7 & 255(0xff, float:3.57E-43)
            byte r8 = r10.l(r4)
            r8 = r8 & 255(0xff, float:3.57E-43)
            if (r7 != r8) goto L28
            int r4 = r4 + 1
            goto L13
        L28:
            if (r7 >= r8) goto L32
            goto L30
        L2b:
            if (r0 != r1) goto L2e
            goto L33
        L2e:
            if (r0 >= r1) goto L32
        L30:
            r3 = r5
            goto L33
        L32:
            r3 = r6
        L33:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: rp.f.compareTo(rp.f):int");
    }

    public f e(String str) {
        jo.p.h(str, "algorithm");
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        messageDigest.update(m(), 0, G());
        byte[] digest = messageDigest.digest();
        jo.p.g(digest, "digestBytes");
        return new f(digest);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (fVar.G() == m().length && fVar.B(0, m(), 0, m().length)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int n10 = n();
        if (n10 != 0) {
            return n10;
        }
        int hashCode = Arrays.hashCode(m());
        C(hashCode);
        return hashCode;
    }

    public final boolean i(f fVar) {
        jo.p.h(fVar, "suffix");
        return A(G() - fVar.G(), fVar, 0, fVar.G());
    }

    public final byte l(int i10) {
        return v(i10);
    }

    public final byte[] m() {
        return this.f51678w;
    }

    public final int n() {
        return this.f51679x;
    }

    public int o() {
        return m().length;
    }

    public final String p() {
        return this.f51680y;
    }

    public String q() {
        char[] cArr = new char[m().length * 2];
        byte[] m10 = m();
        int length = m10.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            byte b10 = m10[i10];
            i10++;
            int i12 = i11 + 1;
            cArr[i11] = sp.g.f()[(b10 >> 4) & 15];
            i11 = i12 + 1;
            cArr[i12] = sp.g.f()[b10 & 15];
        }
        return so.n.m(cArr);
    }

    public final int r(f fVar, int i10) {
        jo.p.h(fVar, "other");
        return s(fVar.u(), i10);
    }

    public int s(byte[] bArr, int i10) {
        jo.p.h(bArr, "other");
        int length = m().length - bArr.length;
        int max = Math.max(i10, 0);
        if (max <= length) {
            while (true) {
                int i11 = max + 1;
                if (n0.a(m(), max, bArr, 0, bArr.length)) {
                    return max;
                }
                if (max == length) {
                    break;
                }
                max = i11;
            }
        }
        return -1;
    }

    public String toString() {
        int c10;
        String str;
        if (m().length == 0) {
            str = "[size=0]";
        } else {
            c10 = sp.g.c(m(), 64);
            if (c10 == -1) {
                if (m().length <= 64) {
                    str = "[hex=" + q() + ']';
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("[size=");
                    sb2.append(m().length);
                    sb2.append(" hex=");
                    int d10 = n0.d(this, 64);
                    if (d10 <= m().length) {
                        if (d10 + 0 >= 0) {
                            sb2.append((d10 == m().length ? this : new f(xn.n.n(m(), 0, d10))).q());
                            sb2.append("…]");
                            return sb2.toString();
                        }
                        throw new IllegalArgumentException("endIndex < beginIndex".toString());
                    }
                    throw new IllegalArgumentException(("endIndex > length(" + m().length + ')').toString());
                }
            } else {
                String L = L();
                Objects.requireNonNull(L, "null cannot be cast to non-null type java.lang.String");
                String substring = L.substring(0, c10);
                jo.p.g(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                String y10 = so.n.y(so.n.y(so.n.y(substring, "\\", "\\\\", false, 4, null), "\n", "\\n", false, 4, null), "\r", "\\r", false, 4, null);
                if (c10 < L.length()) {
                    return "[size=" + m().length + " text=" + y10 + "…]";
                }
                return "[text=" + y10 + ']';
            }
        }
        return str;
    }

    public byte[] u() {
        return m();
    }

    public byte v(int i10) {
        return m()[i10];
    }

    public final int w(f fVar, int i10) {
        jo.p.h(fVar, "other");
        return x(fVar.u(), i10);
    }

    public int x(byte[] bArr, int i10) {
        jo.p.h(bArr, "other");
        int min = Math.min(n0.d(this, i10), m().length - bArr.length);
        if (min >= 0) {
            while (true) {
                int i11 = min - 1;
                if (n0.a(m(), min, bArr, 0, bArr.length)) {
                    return min;
                }
                if (i11 < 0) {
                    break;
                }
                min = i11;
            }
        }
        return -1;
    }
}
