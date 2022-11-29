package ai;

import com.google.android.gms.internal.ads.zzggl;
import com.google.android.gms.internal.ads.zzggm;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import sun.misc.Unsafe;

/* loaded from: classes3.dex */
public final class ak3<T> implements ok3<T> {

    /* renamed from: q  reason: collision with root package name */
    public static final int[] f1891q = new int[0];

    /* renamed from: r  reason: collision with root package name */
    public static final Unsafe f1892r = nl3.B();

    /* renamed from: a  reason: collision with root package name */
    public final int[] f1893a;

    /* renamed from: b  reason: collision with root package name */
    public final Object[] f1894b;

    /* renamed from: c  reason: collision with root package name */
    public final int f1895c;

    /* renamed from: d  reason: collision with root package name */
    public final int f1896d;

    /* renamed from: e  reason: collision with root package name */
    public final xj3 f1897e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f1898f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f1899g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f1900h;

    /* renamed from: i  reason: collision with root package name */
    public final int[] f1901i;

    /* renamed from: j  reason: collision with root package name */
    public final int f1902j;

    /* renamed from: k  reason: collision with root package name */
    public final int f1903k;

    /* renamed from: l  reason: collision with root package name */
    public final kj3 f1904l;

    /* renamed from: m  reason: collision with root package name */
    public final dl3<?, ?> f1905m;

    /* renamed from: n  reason: collision with root package name */
    public final ei3<?> f1906n;

    /* renamed from: o  reason: collision with root package name */
    public final ck3 f1907o;

    /* renamed from: p  reason: collision with root package name */
    public final sj3 f1908p;

    /* JADX WARN: Multi-variable type inference failed */
    public ak3(int[] iArr, int[] iArr2, Object[] objArr, int i10, int i11, xj3 xj3Var, boolean z10, boolean z11, int[] iArr3, int i12, int i13, ck3 ck3Var, kj3 kj3Var, dl3<?, ?> dl3Var, ei3<?> ei3Var, sj3 sj3Var) {
        this.f1893a = iArr;
        this.f1894b = iArr2;
        this.f1895c = objArr;
        this.f1896d = i10;
        this.f1899g = i11 instanceof ri3;
        this.f1900h = xj3Var;
        boolean z12 = false;
        if (dl3Var != 0 && dl3Var.a((xj3) i11)) {
            z12 = true;
        }
        this.f1898f = z12;
        this.f1901i = z11;
        this.f1902j = iArr3;
        this.f1903k = i12;
        this.f1907o = i13;
        this.f1904l = ck3Var;
        this.f1905m = kj3Var;
        this.f1906n = dl3Var;
        this.f1897e = i11;
        this.f1908p = ei3Var;
    }

    public static final void G(int i10, Object obj, zh3 zh3Var) throws IOException {
        if (obj instanceof String) {
            zh3Var.x(i10, (String) obj);
        } else {
            zh3Var.y(i10, (oh3) obj);
        }
    }

    public static el3 H(Object obj) {
        ri3 ri3Var = (ri3) obj;
        el3 el3Var = ri3Var.zzc;
        if (el3Var == el3.a()) {
            el3 b10 = el3.b();
            ri3Var.zzc = b10;
            return b10;
        }
        return el3Var;
    }

    public static <T> ak3<T> J(Class<T> cls, uj3 uj3Var, ck3 ck3Var, kj3 kj3Var, dl3<?, ?> dl3Var, ei3<?> ei3Var, sj3 sj3Var) {
        if (uj3Var instanceof hk3) {
            return K((hk3) uj3Var, ck3Var, kj3Var, dl3Var, ei3Var, sj3Var);
        }
        bl3 bl3Var = (bl3) uj3Var;
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:123:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0385  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static <T> ai.ak3<T> K(ai.hk3 r34, ai.ck3 r35, ai.kj3 r36, ai.dl3<?, ?> r37, ai.ei3<?> r38, ai.sj3 r39) {
        /*
            Method dump skipped, instructions count: 1016
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.ak3.K(ai.hk3, ai.ck3, ai.kj3, ai.dl3, ai.ei3, ai.sj3):ai.ak3");
    }

    public static Field L(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String arrays = Arrays.toString(declaredFields);
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 40 + name.length() + String.valueOf(arrays).length());
            sb2.append("Field ");
            sb2.append(str);
            sb2.append(" for ");
            sb2.append(name);
            sb2.append(" not found. Known fields are ");
            sb2.append(arrays);
            throw new RuntimeException(sb2.toString());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean b(Object obj, int i10, ok3 ok3Var) {
        return ok3Var.l(nl3.v(obj, i10 & 1048575));
    }

    public static int o(int i10) {
        return (i10 >>> 20) & 255;
    }

    public static boolean p(int i10) {
        return (i10 & 536870912) != 0;
    }

    public static <T> double q(T t10, long j10) {
        return ((Double) nl3.v(t10, j10)).doubleValue();
    }

    public static <T> float r(T t10, long j10) {
        return ((Float) nl3.v(t10, j10)).floatValue();
    }

    public static <T> int s(T t10, long j10) {
        return ((Integer) nl3.v(t10, j10)).intValue();
    }

    public static <T> long t(T t10, long j10) {
        return ((Long) nl3.v(t10, j10)).longValue();
    }

    public static <T> boolean u(T t10, long j10) {
        return ((Boolean) nl3.v(t10, j10)).booleanValue();
    }

    public final void A(T t10, int i10, int i11) {
        nl3.m(t10, n(i11) & 1048575, i10);
    }

    public final int B(int i10) {
        if (i10 < this.f1895c || i10 > this.f1896d) {
            return -1;
        }
        return D(i10, 0);
    }

    public final int C(int i10, int i11) {
        if (i10 < this.f1895c || i10 > this.f1896d) {
            return -1;
        }
        return D(i10, i11);
    }

    public final int D(int i10, int i11) {
        int length = (this.f1893a.length / 3) - 1;
        while (i11 <= length) {
            int i12 = (length + i11) >>> 1;
            int i13 = i12 * 3;
            int i14 = this.f1893a[i13];
            if (i10 == i14) {
                return i13;
            }
            if (i10 < i14) {
                length = i12 - 1;
            } else {
                i11 = i12 + 1;
            }
        }
        return -1;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void E(T t10, zh3 zh3Var) throws IOException {
        int i10;
        boolean z10;
        if (!this.f1898f) {
            int length = this.f1893a.length;
            Unsafe unsafe = f1892r;
            int i11 = 1048575;
            int i12 = 1048575;
            int i13 = 0;
            int i14 = 0;
            while (i13 < length) {
                int d10 = d(i13);
                int i15 = this.f1893a[i13];
                int o10 = o(d10);
                if (o10 <= 17) {
                    int i16 = this.f1893a[i13 + 2];
                    int i17 = i16 & i11;
                    if (i17 != i12) {
                        i14 = unsafe.getInt(t10, i17);
                        i12 = i17;
                    }
                    i10 = 1 << (i16 >>> 20);
                } else {
                    i10 = 0;
                }
                long j10 = d10 & i11;
                switch (o10) {
                    case 0:
                        if ((i14 & i10) == 0) {
                            break;
                        } else {
                            zh3Var.q(i15, nl3.t(t10, j10));
                            break;
                        }
                    case 1:
                        if ((i14 & i10) == 0) {
                            break;
                        } else {
                            zh3Var.p(i15, nl3.r(t10, j10));
                            break;
                        }
                    case 2:
                        if ((i14 & i10) == 0) {
                            break;
                        } else {
                            zh3Var.n(i15, unsafe.getLong(t10, j10));
                            break;
                        }
                    case 3:
                        if ((i14 & i10) == 0) {
                            break;
                        } else {
                            zh3Var.s(i15, unsafe.getLong(t10, j10));
                            break;
                        }
                    case 4:
                        if ((i14 & i10) == 0) {
                            break;
                        } else {
                            zh3Var.t(i15, unsafe.getInt(t10, j10));
                            break;
                        }
                    case 5:
                        if ((i14 & i10) == 0) {
                            break;
                        } else {
                            zh3Var.u(i15, unsafe.getLong(t10, j10));
                            break;
                        }
                    case 6:
                        if ((i14 & i10) == 0) {
                            break;
                        } else {
                            zh3Var.v(i15, unsafe.getInt(t10, j10));
                            break;
                        }
                    case 7:
                        if ((i14 & i10) == 0) {
                            break;
                        } else {
                            zh3Var.w(i15, nl3.p(t10, j10));
                            break;
                        }
                    case 8:
                        if ((i14 & i10) == 0) {
                            break;
                        } else {
                            G(i15, unsafe.getObject(t10, j10), zh3Var);
                            break;
                        }
                    case 9:
                        if ((i14 & i10) == 0) {
                            break;
                        } else {
                            zh3Var.C(i15, unsafe.getObject(t10, j10), T(i13));
                            break;
                        }
                    case 10:
                        if ((i14 & i10) == 0) {
                            break;
                        } else {
                            zh3Var.y(i15, (oh3) unsafe.getObject(t10, j10));
                            break;
                        }
                    case 11:
                        if ((i14 & i10) == 0) {
                            break;
                        } else {
                            zh3Var.z(i15, unsafe.getInt(t10, j10));
                            break;
                        }
                    case 12:
                        if ((i14 & i10) == 0) {
                            break;
                        } else {
                            zh3Var.r(i15, unsafe.getInt(t10, j10));
                            break;
                        }
                    case 13:
                        if ((i14 & i10) == 0) {
                            break;
                        } else {
                            zh3Var.m(i15, unsafe.getInt(t10, j10));
                            break;
                        }
                    case 14:
                        if ((i14 & i10) == 0) {
                            break;
                        } else {
                            zh3Var.o(i15, unsafe.getLong(t10, j10));
                            break;
                        }
                    case 15:
                        if ((i14 & i10) == 0) {
                            break;
                        } else {
                            zh3Var.A(i15, unsafe.getInt(t10, j10));
                            break;
                        }
                    case 16:
                        if ((i14 & i10) == 0) {
                            break;
                        } else {
                            zh3Var.B(i15, unsafe.getLong(t10, j10));
                            break;
                        }
                    case 17:
                        if ((i14 & i10) == 0) {
                            break;
                        } else {
                            zh3Var.D(i15, unsafe.getObject(t10, j10), T(i13));
                            break;
                        }
                    case 18:
                        rk3.j(this.f1893a[i13], (List) unsafe.getObject(t10, j10), zh3Var, false);
                        break;
                    case 19:
                        rk3.k(this.f1893a[i13], (List) unsafe.getObject(t10, j10), zh3Var, false);
                        break;
                    case 20:
                        rk3.l(this.f1893a[i13], (List) unsafe.getObject(t10, j10), zh3Var, false);
                        break;
                    case 21:
                        rk3.m(this.f1893a[i13], (List) unsafe.getObject(t10, j10), zh3Var, false);
                        break;
                    case 22:
                        rk3.q(this.f1893a[i13], (List) unsafe.getObject(t10, j10), zh3Var, false);
                        break;
                    case 23:
                        rk3.o(this.f1893a[i13], (List) unsafe.getObject(t10, j10), zh3Var, false);
                        break;
                    case 24:
                        rk3.t(this.f1893a[i13], (List) unsafe.getObject(t10, j10), zh3Var, false);
                        break;
                    case 25:
                        rk3.w(this.f1893a[i13], (List) unsafe.getObject(t10, j10), zh3Var, false);
                        break;
                    case 26:
                        rk3.x(this.f1893a[i13], (List) unsafe.getObject(t10, j10), zh3Var);
                        break;
                    case 27:
                        rk3.z(this.f1893a[i13], (List) unsafe.getObject(t10, j10), zh3Var, T(i13));
                        break;
                    case 28:
                        rk3.y(this.f1893a[i13], (List) unsafe.getObject(t10, j10), zh3Var);
                        break;
                    case 29:
                        z10 = false;
                        rk3.r(this.f1893a[i13], (List) unsafe.getObject(t10, j10), zh3Var, false);
                        break;
                    case 30:
                        z10 = false;
                        rk3.v(this.f1893a[i13], (List) unsafe.getObject(t10, j10), zh3Var, false);
                        break;
                    case 31:
                        z10 = false;
                        rk3.u(this.f1893a[i13], (List) unsafe.getObject(t10, j10), zh3Var, false);
                        break;
                    case 32:
                        z10 = false;
                        rk3.p(this.f1893a[i13], (List) unsafe.getObject(t10, j10), zh3Var, false);
                        break;
                    case 33:
                        z10 = false;
                        rk3.s(this.f1893a[i13], (List) unsafe.getObject(t10, j10), zh3Var, false);
                        break;
                    case 34:
                        z10 = false;
                        rk3.n(this.f1893a[i13], (List) unsafe.getObject(t10, j10), zh3Var, false);
                        break;
                    case 35:
                        rk3.j(this.f1893a[i13], (List) unsafe.getObject(t10, j10), zh3Var, true);
                        break;
                    case 36:
                        rk3.k(this.f1893a[i13], (List) unsafe.getObject(t10, j10), zh3Var, true);
                        break;
                    case 37:
                        rk3.l(this.f1893a[i13], (List) unsafe.getObject(t10, j10), zh3Var, true);
                        break;
                    case 38:
                        rk3.m(this.f1893a[i13], (List) unsafe.getObject(t10, j10), zh3Var, true);
                        break;
                    case 39:
                        rk3.q(this.f1893a[i13], (List) unsafe.getObject(t10, j10), zh3Var, true);
                        break;
                    case 40:
                        rk3.o(this.f1893a[i13], (List) unsafe.getObject(t10, j10), zh3Var, true);
                        break;
                    case 41:
                        rk3.t(this.f1893a[i13], (List) unsafe.getObject(t10, j10), zh3Var, true);
                        break;
                    case 42:
                        rk3.w(this.f1893a[i13], (List) unsafe.getObject(t10, j10), zh3Var, true);
                        break;
                    case 43:
                        rk3.r(this.f1893a[i13], (List) unsafe.getObject(t10, j10), zh3Var, true);
                        break;
                    case 44:
                        rk3.v(this.f1893a[i13], (List) unsafe.getObject(t10, j10), zh3Var, true);
                        break;
                    case 45:
                        rk3.u(this.f1893a[i13], (List) unsafe.getObject(t10, j10), zh3Var, true);
                        break;
                    case 46:
                        rk3.p(this.f1893a[i13], (List) unsafe.getObject(t10, j10), zh3Var, true);
                        break;
                    case 47:
                        rk3.s(this.f1893a[i13], (List) unsafe.getObject(t10, j10), zh3Var, true);
                        break;
                    case 48:
                        rk3.n(this.f1893a[i13], (List) unsafe.getObject(t10, j10), zh3Var, true);
                        break;
                    case 49:
                        rk3.B(this.f1893a[i13], (List) unsafe.getObject(t10, j10), zh3Var, T(i13));
                        break;
                    case 50:
                        F(zh3Var, i15, unsafe.getObject(t10, j10), i13);
                        break;
                    case 51:
                        if (z(t10, i15, i13)) {
                            zh3Var.q(i15, q(t10, j10));
                        }
                        break;
                    case 52:
                        if (z(t10, i15, i13)) {
                            zh3Var.p(i15, r(t10, j10));
                        }
                        break;
                    case 53:
                        if (z(t10, i15, i13)) {
                            zh3Var.n(i15, t(t10, j10));
                        }
                        break;
                    case 54:
                        if (z(t10, i15, i13)) {
                            zh3Var.s(i15, t(t10, j10));
                        }
                        break;
                    case 55:
                        if (z(t10, i15, i13)) {
                            zh3Var.t(i15, s(t10, j10));
                        }
                        break;
                    case 56:
                        if (z(t10, i15, i13)) {
                            zh3Var.u(i15, t(t10, j10));
                        }
                        break;
                    case 57:
                        if (z(t10, i15, i13)) {
                            zh3Var.v(i15, s(t10, j10));
                        }
                        break;
                    case 58:
                        if (z(t10, i15, i13)) {
                            zh3Var.w(i15, u(t10, j10));
                        }
                        break;
                    case 59:
                        if (z(t10, i15, i13)) {
                            G(i15, unsafe.getObject(t10, j10), zh3Var);
                        }
                        break;
                    case 60:
                        if (z(t10, i15, i13)) {
                            zh3Var.C(i15, unsafe.getObject(t10, j10), T(i13));
                        }
                        break;
                    case 61:
                        if (z(t10, i15, i13)) {
                            zh3Var.y(i15, (oh3) unsafe.getObject(t10, j10));
                        }
                        break;
                    case 62:
                        if (z(t10, i15, i13)) {
                            zh3Var.z(i15, s(t10, j10));
                        }
                        break;
                    case 63:
                        if (z(t10, i15, i13)) {
                            zh3Var.r(i15, s(t10, j10));
                        }
                        break;
                    case 64:
                        if (z(t10, i15, i13)) {
                            zh3Var.m(i15, s(t10, j10));
                        }
                        break;
                    case 65:
                        if (z(t10, i15, i13)) {
                            zh3Var.o(i15, t(t10, j10));
                        }
                        break;
                    case 66:
                        if (z(t10, i15, i13)) {
                            zh3Var.A(i15, s(t10, j10));
                        }
                        break;
                    case 67:
                        if (z(t10, i15, i13)) {
                            zh3Var.B(i15, t(t10, j10));
                        }
                        break;
                    case 68:
                        if (z(t10, i15, i13)) {
                            zh3Var.D(i15, unsafe.getObject(t10, j10), T(i13));
                        }
                        break;
                }
                i13 += 3;
                i11 = 1048575;
            }
            dl3<?, ?> dl3Var = this.f1905m;
            dl3Var.r(dl3Var.j(t10), zh3Var);
            return;
        }
        this.f1906n.b(t10);
        throw null;
    }

    public final <K, V> void F(zh3 zh3Var, int i10, Object obj, int i11) throws IOException {
        if (obj == null) {
            return;
        }
        qj3 qj3Var = (qj3) U(i11);
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:144:0x042d, code lost:
        if (r6 == r3) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x042f, code lost:
        r26.putInt(r12, r6, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0435, code lost:
        r3 = r9.f1902j;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x0439, code lost:
        if (r3 >= r9.f1903k) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x043b, code lost:
        r9.a(r12, r9.f1901i[r3], r2, r9.f1905m);
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x0447, code lost:
        if (r7 != 0) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x044b, code lost:
        if (r0 != r32) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x0452, code lost:
        throw com.google.android.gms.internal.ads.zzggm.k();
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0455, code lost:
        if (r0 > r32) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x0457, code lost:
        if (r1 != r7) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x0459, code lost:
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x045e, code lost:
        throw com.google.android.gms.internal.ads.zzggm.k();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int I(T r29, byte[] r30, int r31, int r32, int r33, ai.ah3 r34) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1158
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.ak3.I(java.lang.Object, byte[], int, int, int, ai.ah3):int");
    }

    public final void M(T t10, T t11, int i10) {
        long d10 = d(i10) & 1048575;
        if (x(t11, i10)) {
            Object v10 = nl3.v(t10, d10);
            Object v11 = nl3.v(t11, d10);
            if (v10 != null && v11 != null) {
                nl3.w(t10, d10, bj3.i(v10, v11));
                y(t10, i10);
            } else if (v11 != null) {
                nl3.w(t10, d10, v11);
                y(t10, i10);
            }
        }
    }

    public final void N(T t10, T t11, int i10) {
        int d10 = d(i10);
        int i11 = this.f1893a[i10];
        long j10 = d10 & 1048575;
        if (z(t11, i11, i10)) {
            Object v10 = z(t10, i11, i10) ? nl3.v(t10, j10) : null;
            Object v11 = nl3.v(t11, j10);
            if (v10 != null && v11 != null) {
                nl3.w(t10, j10, bj3.i(v10, v11));
                A(t10, i11, i10);
            } else if (v11 != null) {
                nl3.w(t10, j10, v11);
                A(t10, i11, i10);
            }
        }
    }

    public final int O(T t10) {
        int i10;
        int B;
        int B2;
        int B3;
        int C;
        int B4;
        int A;
        int B5;
        int B6;
        int p10;
        int B7;
        int Y;
        int z10;
        int B8;
        int i11;
        Unsafe unsafe = f1892r;
        int i12 = 1048575;
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 0; i15 < this.f1893a.length; i15 += 3) {
            int d10 = d(i15);
            int i16 = this.f1893a[i15];
            int o10 = o(d10);
            if (o10 <= 17) {
                int i17 = this.f1893a[i15 + 2];
                int i18 = i17 & 1048575;
                i10 = 1 << (i17 >>> 20);
                if (i18 != i12) {
                    i14 = unsafe.getInt(t10, i18);
                    i12 = i18;
                }
            } else {
                i10 = 0;
            }
            long j10 = d10 & 1048575;
            switch (o10) {
                case 0:
                    if ((i14 & i10) != 0) {
                        B = yh3.B(i16 << 3);
                        Y = B + 8;
                        break;
                    } else {
                        continue;
                    }
                case 1:
                    if ((i14 & i10) != 0) {
                        B2 = yh3.B(i16 << 3);
                        Y = B2 + 4;
                        break;
                    } else {
                        continue;
                    }
                case 2:
                    if ((i14 & i10) != 0) {
                        long j11 = unsafe.getLong(t10, j10);
                        B3 = yh3.B(i16 << 3);
                        C = yh3.C(j11);
                        Y = B3 + C;
                        break;
                    } else {
                        continue;
                    }
                case 3:
                    if ((i14 & i10) != 0) {
                        long j12 = unsafe.getLong(t10, j10);
                        B3 = yh3.B(i16 << 3);
                        C = yh3.C(j12);
                        Y = B3 + C;
                        break;
                    } else {
                        continue;
                    }
                case 4:
                    if ((i14 & i10) != 0) {
                        int i19 = unsafe.getInt(t10, j10);
                        B4 = yh3.B(i16 << 3);
                        A = yh3.A(i19);
                        i11 = B4 + A;
                        i13 += i11;
                    } else {
                        continue;
                    }
                case 5:
                    if ((i14 & i10) != 0) {
                        B = yh3.B(i16 << 3);
                        Y = B + 8;
                        break;
                    } else {
                        continue;
                    }
                case 6:
                    if ((i14 & i10) != 0) {
                        B2 = yh3.B(i16 << 3);
                        Y = B2 + 4;
                        break;
                    } else {
                        continue;
                    }
                case 7:
                    if ((i14 & i10) != 0) {
                        B5 = yh3.B(i16 << 3);
                        Y = B5 + 1;
                        break;
                    } else {
                        continue;
                    }
                case 8:
                    if ((i14 & i10) != 0) {
                        Object object = unsafe.getObject(t10, j10);
                        if (object instanceof oh3) {
                            B6 = yh3.B(i16 << 3);
                            p10 = ((oh3) object).p();
                            B7 = yh3.B(p10);
                            i11 = B6 + B7 + p10;
                            i13 += i11;
                        } else {
                            B4 = yh3.B(i16 << 3);
                            A = yh3.D((String) object);
                            i11 = B4 + A;
                            i13 += i11;
                        }
                    } else {
                        continue;
                    }
                case 9:
                    if ((i14 & i10) != 0) {
                        Y = rk3.Y(i16, unsafe.getObject(t10, j10), T(i15));
                        break;
                    } else {
                        continue;
                    }
                case 10:
                    if ((i14 & i10) != 0) {
                        B6 = yh3.B(i16 << 3);
                        p10 = ((oh3) unsafe.getObject(t10, j10)).p();
                        B7 = yh3.B(p10);
                        i11 = B6 + B7 + p10;
                        i13 += i11;
                    } else {
                        continue;
                    }
                case 11:
                    if ((i14 & i10) != 0) {
                        int i20 = unsafe.getInt(t10, j10);
                        B4 = yh3.B(i16 << 3);
                        A = yh3.B(i20);
                        i11 = B4 + A;
                        i13 += i11;
                    } else {
                        continue;
                    }
                case 12:
                    if ((i14 & i10) != 0) {
                        int i21 = unsafe.getInt(t10, j10);
                        B4 = yh3.B(i16 << 3);
                        A = yh3.A(i21);
                        i11 = B4 + A;
                        i13 += i11;
                    } else {
                        continue;
                    }
                case 13:
                    if ((i14 & i10) != 0) {
                        B2 = yh3.B(i16 << 3);
                        Y = B2 + 4;
                        break;
                    } else {
                        continue;
                    }
                case 14:
                    if ((i14 & i10) != 0) {
                        B = yh3.B(i16 << 3);
                        Y = B + 8;
                        break;
                    } else {
                        continue;
                    }
                case 15:
                    if ((i14 & i10) != 0) {
                        int i22 = unsafe.getInt(t10, j10);
                        B4 = yh3.B(i16 << 3);
                        A = yh3.B((i22 >> 31) ^ (i22 + i22));
                        i11 = B4 + A;
                        i13 += i11;
                    } else {
                        continue;
                    }
                case 16:
                    if ((i14 & i10) != 0) {
                        long j13 = unsafe.getLong(t10, j10);
                        B4 = yh3.B(i16 << 3);
                        A = yh3.C((j13 >> 63) ^ (j13 + j13));
                        i11 = B4 + A;
                        i13 += i11;
                    } else {
                        continue;
                    }
                case 17:
                    if ((i14 & i10) != 0) {
                        Y = yh3.f(i16, (xj3) unsafe.getObject(t10, j10), T(i15));
                        break;
                    } else {
                        continue;
                    }
                case 18:
                    Y = rk3.U(i16, (List) unsafe.getObject(t10, j10), false);
                    break;
                case 19:
                    Y = rk3.S(i16, (List) unsafe.getObject(t10, j10), false);
                    break;
                case 20:
                    Y = rk3.E(i16, (List) unsafe.getObject(t10, j10), false);
                    break;
                case 21:
                    Y = rk3.G(i16, (List) unsafe.getObject(t10, j10), false);
                    break;
                case 22:
                    Y = rk3.M(i16, (List) unsafe.getObject(t10, j10), false);
                    break;
                case 23:
                    Y = rk3.U(i16, (List) unsafe.getObject(t10, j10), false);
                    break;
                case 24:
                    Y = rk3.S(i16, (List) unsafe.getObject(t10, j10), false);
                    break;
                case 25:
                    Y = rk3.W(i16, (List) unsafe.getObject(t10, j10), false);
                    break;
                case 26:
                    Y = rk3.X(i16, (List) unsafe.getObject(t10, j10));
                    break;
                case 27:
                    Y = rk3.Z(i16, (List) unsafe.getObject(t10, j10), T(i15));
                    break;
                case 28:
                    Y = rk3.a0(i16, (List) unsafe.getObject(t10, j10));
                    break;
                case 29:
                    Y = rk3.O(i16, (List) unsafe.getObject(t10, j10), false);
                    break;
                case 30:
                    Y = rk3.K(i16, (List) unsafe.getObject(t10, j10), false);
                    break;
                case 31:
                    Y = rk3.S(i16, (List) unsafe.getObject(t10, j10), false);
                    break;
                case 32:
                    Y = rk3.U(i16, (List) unsafe.getObject(t10, j10), false);
                    break;
                case 33:
                    Y = rk3.Q(i16, (List) unsafe.getObject(t10, j10), false);
                    break;
                case 34:
                    Y = rk3.I(i16, (List) unsafe.getObject(t10, j10), false);
                    break;
                case 35:
                    A = rk3.T((List) unsafe.getObject(t10, j10));
                    if (A > 0) {
                        z10 = yh3.z(i16);
                        B8 = yh3.B(A);
                        B4 = z10 + B8;
                        i11 = B4 + A;
                        i13 += i11;
                    } else {
                        continue;
                    }
                case 36:
                    A = rk3.R((List) unsafe.getObject(t10, j10));
                    if (A > 0) {
                        z10 = yh3.z(i16);
                        B8 = yh3.B(A);
                        B4 = z10 + B8;
                        i11 = B4 + A;
                        i13 += i11;
                    } else {
                        continue;
                    }
                case 37:
                    A = rk3.D((List) unsafe.getObject(t10, j10));
                    if (A > 0) {
                        z10 = yh3.z(i16);
                        B8 = yh3.B(A);
                        B4 = z10 + B8;
                        i11 = B4 + A;
                        i13 += i11;
                    } else {
                        continue;
                    }
                case 38:
                    A = rk3.F((List) unsafe.getObject(t10, j10));
                    if (A > 0) {
                        z10 = yh3.z(i16);
                        B8 = yh3.B(A);
                        B4 = z10 + B8;
                        i11 = B4 + A;
                        i13 += i11;
                    } else {
                        continue;
                    }
                case 39:
                    A = rk3.L((List) unsafe.getObject(t10, j10));
                    if (A > 0) {
                        z10 = yh3.z(i16);
                        B8 = yh3.B(A);
                        B4 = z10 + B8;
                        i11 = B4 + A;
                        i13 += i11;
                    } else {
                        continue;
                    }
                case 40:
                    A = rk3.T((List) unsafe.getObject(t10, j10));
                    if (A > 0) {
                        z10 = yh3.z(i16);
                        B8 = yh3.B(A);
                        B4 = z10 + B8;
                        i11 = B4 + A;
                        i13 += i11;
                    } else {
                        continue;
                    }
                case 41:
                    A = rk3.R((List) unsafe.getObject(t10, j10));
                    if (A > 0) {
                        z10 = yh3.z(i16);
                        B8 = yh3.B(A);
                        B4 = z10 + B8;
                        i11 = B4 + A;
                        i13 += i11;
                    } else {
                        continue;
                    }
                case 42:
                    A = rk3.V((List) unsafe.getObject(t10, j10));
                    if (A > 0) {
                        z10 = yh3.z(i16);
                        B8 = yh3.B(A);
                        B4 = z10 + B8;
                        i11 = B4 + A;
                        i13 += i11;
                    } else {
                        continue;
                    }
                case 43:
                    A = rk3.N((List) unsafe.getObject(t10, j10));
                    if (A > 0) {
                        z10 = yh3.z(i16);
                        B8 = yh3.B(A);
                        B4 = z10 + B8;
                        i11 = B4 + A;
                        i13 += i11;
                    } else {
                        continue;
                    }
                case 44:
                    A = rk3.J((List) unsafe.getObject(t10, j10));
                    if (A > 0) {
                        z10 = yh3.z(i16);
                        B8 = yh3.B(A);
                        B4 = z10 + B8;
                        i11 = B4 + A;
                        i13 += i11;
                    } else {
                        continue;
                    }
                case 45:
                    A = rk3.R((List) unsafe.getObject(t10, j10));
                    if (A > 0) {
                        z10 = yh3.z(i16);
                        B8 = yh3.B(A);
                        B4 = z10 + B8;
                        i11 = B4 + A;
                        i13 += i11;
                    } else {
                        continue;
                    }
                case 46:
                    A = rk3.T((List) unsafe.getObject(t10, j10));
                    if (A > 0) {
                        z10 = yh3.z(i16);
                        B8 = yh3.B(A);
                        B4 = z10 + B8;
                        i11 = B4 + A;
                        i13 += i11;
                    } else {
                        continue;
                    }
                case 47:
                    A = rk3.P((List) unsafe.getObject(t10, j10));
                    if (A > 0) {
                        z10 = yh3.z(i16);
                        B8 = yh3.B(A);
                        B4 = z10 + B8;
                        i11 = B4 + A;
                        i13 += i11;
                    } else {
                        continue;
                    }
                case 48:
                    A = rk3.H((List) unsafe.getObject(t10, j10));
                    if (A > 0) {
                        z10 = yh3.z(i16);
                        B8 = yh3.B(A);
                        B4 = z10 + B8;
                        i11 = B4 + A;
                        i13 += i11;
                    } else {
                        continue;
                    }
                case 49:
                    Y = rk3.b0(i16, (List) unsafe.getObject(t10, j10), T(i15));
                    break;
                case 50:
                    sj3.a(i16, unsafe.getObject(t10, j10), U(i15));
                    continue;
                case 51:
                    if (z(t10, i16, i15)) {
                        B = yh3.B(i16 << 3);
                        Y = B + 8;
                        break;
                    } else {
                        continue;
                    }
                case 52:
                    if (z(t10, i16, i15)) {
                        B2 = yh3.B(i16 << 3);
                        Y = B2 + 4;
                        break;
                    } else {
                        continue;
                    }
                case 53:
                    if (z(t10, i16, i15)) {
                        long t11 = t(t10, j10);
                        B3 = yh3.B(i16 << 3);
                        C = yh3.C(t11);
                        Y = B3 + C;
                        break;
                    } else {
                        continue;
                    }
                case 54:
                    if (z(t10, i16, i15)) {
                        long t12 = t(t10, j10);
                        B3 = yh3.B(i16 << 3);
                        C = yh3.C(t12);
                        Y = B3 + C;
                        break;
                    } else {
                        continue;
                    }
                case 55:
                    if (z(t10, i16, i15)) {
                        int s10 = s(t10, j10);
                        B4 = yh3.B(i16 << 3);
                        A = yh3.A(s10);
                        i11 = B4 + A;
                        i13 += i11;
                    } else {
                        continue;
                    }
                case 56:
                    if (z(t10, i16, i15)) {
                        B = yh3.B(i16 << 3);
                        Y = B + 8;
                        break;
                    } else {
                        continue;
                    }
                case 57:
                    if (z(t10, i16, i15)) {
                        B2 = yh3.B(i16 << 3);
                        Y = B2 + 4;
                        break;
                    } else {
                        continue;
                    }
                case 58:
                    if (z(t10, i16, i15)) {
                        B5 = yh3.B(i16 << 3);
                        Y = B5 + 1;
                        break;
                    } else {
                        continue;
                    }
                case 59:
                    if (z(t10, i16, i15)) {
                        Object object2 = unsafe.getObject(t10, j10);
                        if (object2 instanceof oh3) {
                            B6 = yh3.B(i16 << 3);
                            p10 = ((oh3) object2).p();
                            B7 = yh3.B(p10);
                            i11 = B6 + B7 + p10;
                            i13 += i11;
                        } else {
                            B4 = yh3.B(i16 << 3);
                            A = yh3.D((String) object2);
                            i11 = B4 + A;
                            i13 += i11;
                        }
                    } else {
                        continue;
                    }
                case 60:
                    if (z(t10, i16, i15)) {
                        Y = rk3.Y(i16, unsafe.getObject(t10, j10), T(i15));
                        break;
                    } else {
                        continue;
                    }
                case 61:
                    if (z(t10, i16, i15)) {
                        B6 = yh3.B(i16 << 3);
                        p10 = ((oh3) unsafe.getObject(t10, j10)).p();
                        B7 = yh3.B(p10);
                        i11 = B6 + B7 + p10;
                        i13 += i11;
                    } else {
                        continue;
                    }
                case 62:
                    if (z(t10, i16, i15)) {
                        int s11 = s(t10, j10);
                        B4 = yh3.B(i16 << 3);
                        A = yh3.B(s11);
                        i11 = B4 + A;
                        i13 += i11;
                    } else {
                        continue;
                    }
                case 63:
                    if (z(t10, i16, i15)) {
                        int s12 = s(t10, j10);
                        B4 = yh3.B(i16 << 3);
                        A = yh3.A(s12);
                        i11 = B4 + A;
                        i13 += i11;
                    } else {
                        continue;
                    }
                case 64:
                    if (z(t10, i16, i15)) {
                        B2 = yh3.B(i16 << 3);
                        Y = B2 + 4;
                        break;
                    } else {
                        continue;
                    }
                case 65:
                    if (z(t10, i16, i15)) {
                        B = yh3.B(i16 << 3);
                        Y = B + 8;
                        break;
                    } else {
                        continue;
                    }
                case 66:
                    if (z(t10, i16, i15)) {
                        int s13 = s(t10, j10);
                        B4 = yh3.B(i16 << 3);
                        A = yh3.B((s13 >> 31) ^ (s13 + s13));
                        i11 = B4 + A;
                        i13 += i11;
                    } else {
                        continue;
                    }
                case 67:
                    if (z(t10, i16, i15)) {
                        long t13 = t(t10, j10);
                        B4 = yh3.B(i16 << 3);
                        A = yh3.C((t13 >> 63) ^ (t13 + t13));
                        i11 = B4 + A;
                        i13 += i11;
                    } else {
                        continue;
                    }
                case 68:
                    if (z(t10, i16, i15)) {
                        Y = yh3.f(i16, (xj3) unsafe.getObject(t10, j10), T(i15));
                        break;
                    } else {
                        continue;
                    }
                default:
            }
            i13 += Y;
        }
        dl3<?, ?> dl3Var = this.f1905m;
        int q10 = i13 + dl3Var.q(dl3Var.j(t10));
        if (this.f1898f) {
            this.f1906n.b(t10);
            throw null;
        }
        return q10;
    }

    public final int P(T t10) {
        int B;
        int B2;
        int B3;
        int C;
        int B4;
        int A;
        int B5;
        int B6;
        int p10;
        int B7;
        int Y;
        int z10;
        int B8;
        int i10;
        Unsafe unsafe = f1892r;
        int i11 = 0;
        for (int i12 = 0; i12 < this.f1893a.length; i12 += 3) {
            int d10 = d(i12);
            int o10 = o(d10);
            int i13 = this.f1893a[i12];
            long j10 = d10 & 1048575;
            if (o10 >= ji3.zzJ.zza() && o10 <= ji3.zzW.zza()) {
                int i14 = this.f1893a[i12 + 2];
            }
            switch (o10) {
                case 0:
                    if (x(t10, i12)) {
                        B = yh3.B(i13 << 3);
                        Y = B + 8;
                        i11 += Y;
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (x(t10, i12)) {
                        B2 = yh3.B(i13 << 3);
                        Y = B2 + 4;
                        i11 += Y;
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (x(t10, i12)) {
                        long n10 = nl3.n(t10, j10);
                        B3 = yh3.B(i13 << 3);
                        C = yh3.C(n10);
                        i11 += B3 + C;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (x(t10, i12)) {
                        long n11 = nl3.n(t10, j10);
                        B3 = yh3.B(i13 << 3);
                        C = yh3.C(n11);
                        i11 += B3 + C;
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (x(t10, i12)) {
                        int l10 = nl3.l(t10, j10);
                        B4 = yh3.B(i13 << 3);
                        A = yh3.A(l10);
                        i10 = B4 + A;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (x(t10, i12)) {
                        B = yh3.B(i13 << 3);
                        Y = B + 8;
                        i11 += Y;
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (x(t10, i12)) {
                        B2 = yh3.B(i13 << 3);
                        Y = B2 + 4;
                        i11 += Y;
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (x(t10, i12)) {
                        B5 = yh3.B(i13 << 3);
                        Y = B5 + 1;
                        i11 += Y;
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (!x(t10, i12)) {
                        break;
                    } else {
                        Object v10 = nl3.v(t10, j10);
                        if (v10 instanceof oh3) {
                            B6 = yh3.B(i13 << 3);
                            p10 = ((oh3) v10).p();
                            B7 = yh3.B(p10);
                            i10 = B6 + B7 + p10;
                            i11 += i10;
                            break;
                        } else {
                            B4 = yh3.B(i13 << 3);
                            A = yh3.D((String) v10);
                            i10 = B4 + A;
                            i11 += i10;
                        }
                    }
                case 9:
                    if (x(t10, i12)) {
                        Y = rk3.Y(i13, nl3.v(t10, j10), T(i12));
                        i11 += Y;
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (x(t10, i12)) {
                        B6 = yh3.B(i13 << 3);
                        p10 = ((oh3) nl3.v(t10, j10)).p();
                        B7 = yh3.B(p10);
                        i10 = B6 + B7 + p10;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (x(t10, i12)) {
                        int l11 = nl3.l(t10, j10);
                        B4 = yh3.B(i13 << 3);
                        A = yh3.B(l11);
                        i10 = B4 + A;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (x(t10, i12)) {
                        int l12 = nl3.l(t10, j10);
                        B4 = yh3.B(i13 << 3);
                        A = yh3.A(l12);
                        i10 = B4 + A;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (x(t10, i12)) {
                        B2 = yh3.B(i13 << 3);
                        Y = B2 + 4;
                        i11 += Y;
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (x(t10, i12)) {
                        B = yh3.B(i13 << 3);
                        Y = B + 8;
                        i11 += Y;
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (x(t10, i12)) {
                        int l13 = nl3.l(t10, j10);
                        B4 = yh3.B(i13 << 3);
                        A = yh3.B((l13 >> 31) ^ (l13 + l13));
                        i10 = B4 + A;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (x(t10, i12)) {
                        long n12 = nl3.n(t10, j10);
                        B4 = yh3.B(i13 << 3);
                        A = yh3.C((n12 >> 63) ^ (n12 + n12));
                        i10 = B4 + A;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if (x(t10, i12)) {
                        Y = yh3.f(i13, (xj3) nl3.v(t10, j10), T(i12));
                        i11 += Y;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    Y = rk3.U(i13, (List) nl3.v(t10, j10), false);
                    i11 += Y;
                    break;
                case 19:
                    Y = rk3.S(i13, (List) nl3.v(t10, j10), false);
                    i11 += Y;
                    break;
                case 20:
                    Y = rk3.E(i13, (List) nl3.v(t10, j10), false);
                    i11 += Y;
                    break;
                case 21:
                    Y = rk3.G(i13, (List) nl3.v(t10, j10), false);
                    i11 += Y;
                    break;
                case 22:
                    Y = rk3.M(i13, (List) nl3.v(t10, j10), false);
                    i11 += Y;
                    break;
                case 23:
                    Y = rk3.U(i13, (List) nl3.v(t10, j10), false);
                    i11 += Y;
                    break;
                case 24:
                    Y = rk3.S(i13, (List) nl3.v(t10, j10), false);
                    i11 += Y;
                    break;
                case 25:
                    Y = rk3.W(i13, (List) nl3.v(t10, j10), false);
                    i11 += Y;
                    break;
                case 26:
                    Y = rk3.X(i13, (List) nl3.v(t10, j10));
                    i11 += Y;
                    break;
                case 27:
                    Y = rk3.Z(i13, (List) nl3.v(t10, j10), T(i12));
                    i11 += Y;
                    break;
                case 28:
                    Y = rk3.a0(i13, (List) nl3.v(t10, j10));
                    i11 += Y;
                    break;
                case 29:
                    Y = rk3.O(i13, (List) nl3.v(t10, j10), false);
                    i11 += Y;
                    break;
                case 30:
                    Y = rk3.K(i13, (List) nl3.v(t10, j10), false);
                    i11 += Y;
                    break;
                case 31:
                    Y = rk3.S(i13, (List) nl3.v(t10, j10), false);
                    i11 += Y;
                    break;
                case 32:
                    Y = rk3.U(i13, (List) nl3.v(t10, j10), false);
                    i11 += Y;
                    break;
                case 33:
                    Y = rk3.Q(i13, (List) nl3.v(t10, j10), false);
                    i11 += Y;
                    break;
                case 34:
                    Y = rk3.I(i13, (List) nl3.v(t10, j10), false);
                    i11 += Y;
                    break;
                case 35:
                    A = rk3.T((List) unsafe.getObject(t10, j10));
                    if (A > 0) {
                        z10 = yh3.z(i13);
                        B8 = yh3.B(A);
                        B4 = z10 + B8;
                        i10 = B4 + A;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 36:
                    A = rk3.R((List) unsafe.getObject(t10, j10));
                    if (A > 0) {
                        z10 = yh3.z(i13);
                        B8 = yh3.B(A);
                        B4 = z10 + B8;
                        i10 = B4 + A;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 37:
                    A = rk3.D((List) unsafe.getObject(t10, j10));
                    if (A > 0) {
                        z10 = yh3.z(i13);
                        B8 = yh3.B(A);
                        B4 = z10 + B8;
                        i10 = B4 + A;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 38:
                    A = rk3.F((List) unsafe.getObject(t10, j10));
                    if (A > 0) {
                        z10 = yh3.z(i13);
                        B8 = yh3.B(A);
                        B4 = z10 + B8;
                        i10 = B4 + A;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 39:
                    A = rk3.L((List) unsafe.getObject(t10, j10));
                    if (A > 0) {
                        z10 = yh3.z(i13);
                        B8 = yh3.B(A);
                        B4 = z10 + B8;
                        i10 = B4 + A;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 40:
                    A = rk3.T((List) unsafe.getObject(t10, j10));
                    if (A > 0) {
                        z10 = yh3.z(i13);
                        B8 = yh3.B(A);
                        B4 = z10 + B8;
                        i10 = B4 + A;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 41:
                    A = rk3.R((List) unsafe.getObject(t10, j10));
                    if (A > 0) {
                        z10 = yh3.z(i13);
                        B8 = yh3.B(A);
                        B4 = z10 + B8;
                        i10 = B4 + A;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 42:
                    A = rk3.V((List) unsafe.getObject(t10, j10));
                    if (A > 0) {
                        z10 = yh3.z(i13);
                        B8 = yh3.B(A);
                        B4 = z10 + B8;
                        i10 = B4 + A;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 43:
                    A = rk3.N((List) unsafe.getObject(t10, j10));
                    if (A > 0) {
                        z10 = yh3.z(i13);
                        B8 = yh3.B(A);
                        B4 = z10 + B8;
                        i10 = B4 + A;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 44:
                    A = rk3.J((List) unsafe.getObject(t10, j10));
                    if (A > 0) {
                        z10 = yh3.z(i13);
                        B8 = yh3.B(A);
                        B4 = z10 + B8;
                        i10 = B4 + A;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 45:
                    A = rk3.R((List) unsafe.getObject(t10, j10));
                    if (A > 0) {
                        z10 = yh3.z(i13);
                        B8 = yh3.B(A);
                        B4 = z10 + B8;
                        i10 = B4 + A;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 46:
                    A = rk3.T((List) unsafe.getObject(t10, j10));
                    if (A > 0) {
                        z10 = yh3.z(i13);
                        B8 = yh3.B(A);
                        B4 = z10 + B8;
                        i10 = B4 + A;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 47:
                    A = rk3.P((List) unsafe.getObject(t10, j10));
                    if (A > 0) {
                        z10 = yh3.z(i13);
                        B8 = yh3.B(A);
                        B4 = z10 + B8;
                        i10 = B4 + A;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 48:
                    A = rk3.H((List) unsafe.getObject(t10, j10));
                    if (A > 0) {
                        z10 = yh3.z(i13);
                        B8 = yh3.B(A);
                        B4 = z10 + B8;
                        i10 = B4 + A;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 49:
                    Y = rk3.b0(i13, (List) nl3.v(t10, j10), T(i12));
                    i11 += Y;
                    break;
                case 50:
                    sj3.a(i13, nl3.v(t10, j10), U(i12));
                    break;
                case 51:
                    if (z(t10, i13, i12)) {
                        B = yh3.B(i13 << 3);
                        Y = B + 8;
                        i11 += Y;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (z(t10, i13, i12)) {
                        B2 = yh3.B(i13 << 3);
                        Y = B2 + 4;
                        i11 += Y;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (z(t10, i13, i12)) {
                        long t11 = t(t10, j10);
                        B3 = yh3.B(i13 << 3);
                        C = yh3.C(t11);
                        i11 += B3 + C;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (z(t10, i13, i12)) {
                        long t12 = t(t10, j10);
                        B3 = yh3.B(i13 << 3);
                        C = yh3.C(t12);
                        i11 += B3 + C;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (z(t10, i13, i12)) {
                        int s10 = s(t10, j10);
                        B4 = yh3.B(i13 << 3);
                        A = yh3.A(s10);
                        i10 = B4 + A;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (z(t10, i13, i12)) {
                        B = yh3.B(i13 << 3);
                        Y = B + 8;
                        i11 += Y;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (z(t10, i13, i12)) {
                        B2 = yh3.B(i13 << 3);
                        Y = B2 + 4;
                        i11 += Y;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (z(t10, i13, i12)) {
                        B5 = yh3.B(i13 << 3);
                        Y = B5 + 1;
                        i11 += Y;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (!z(t10, i13, i12)) {
                        break;
                    } else {
                        Object v11 = nl3.v(t10, j10);
                        if (v11 instanceof oh3) {
                            B6 = yh3.B(i13 << 3);
                            p10 = ((oh3) v11).p();
                            B7 = yh3.B(p10);
                            i10 = B6 + B7 + p10;
                            i11 += i10;
                            break;
                        } else {
                            B4 = yh3.B(i13 << 3);
                            A = yh3.D((String) v11);
                            i10 = B4 + A;
                            i11 += i10;
                        }
                    }
                case 60:
                    if (z(t10, i13, i12)) {
                        Y = rk3.Y(i13, nl3.v(t10, j10), T(i12));
                        i11 += Y;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (z(t10, i13, i12)) {
                        B6 = yh3.B(i13 << 3);
                        p10 = ((oh3) nl3.v(t10, j10)).p();
                        B7 = yh3.B(p10);
                        i10 = B6 + B7 + p10;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (z(t10, i13, i12)) {
                        int s11 = s(t10, j10);
                        B4 = yh3.B(i13 << 3);
                        A = yh3.B(s11);
                        i10 = B4 + A;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (z(t10, i13, i12)) {
                        int s12 = s(t10, j10);
                        B4 = yh3.B(i13 << 3);
                        A = yh3.A(s12);
                        i10 = B4 + A;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (z(t10, i13, i12)) {
                        B2 = yh3.B(i13 << 3);
                        Y = B2 + 4;
                        i11 += Y;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (z(t10, i13, i12)) {
                        B = yh3.B(i13 << 3);
                        Y = B + 8;
                        i11 += Y;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (z(t10, i13, i12)) {
                        int s13 = s(t10, j10);
                        B4 = yh3.B(i13 << 3);
                        A = yh3.B((s13 >> 31) ^ (s13 + s13));
                        i10 = B4 + A;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (z(t10, i13, i12)) {
                        long t13 = t(t10, j10);
                        B4 = yh3.B(i13 << 3);
                        A = yh3.C((t13 >> 63) ^ (t13 + t13));
                        i10 = B4 + A;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (z(t10, i13, i12)) {
                        Y = yh3.f(i13, (xj3) nl3.v(t10, j10), T(i12));
                        i11 += Y;
                        break;
                    } else {
                        break;
                    }
            }
        }
        dl3<?, ?> dl3Var = this.f1905m;
        return i11 + dl3Var.q(dl3Var.j(t10));
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0152  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:119:0x021a -> B:120:0x021b). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:66:0x014f -> B:67:0x0150). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:99:0x01cc -> B:100:0x01cd). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int Q(T r16, byte[] r17, int r18, int r19, int r20, int r21, int r22, int r23, long r24, int r26, long r27, ai.ah3 r29) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1172
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.ak3.Q(java.lang.Object, byte[], int, int, int, int, int, int, long, int, long, ai.ah3):int");
    }

    public final <K, V> int R(T t10, byte[] bArr, int i10, int i11, int i12, long j10, ah3 ah3Var) throws IOException {
        Unsafe unsafe = f1892r;
        Object U = U(i12);
        Object object = unsafe.getObject(t10, j10);
        if (sj3.b(object)) {
            rj3<K, V> g10 = rj3.e().g();
            sj3.c(g10, object);
            unsafe.putObject(t10, j10, g10);
        }
        qj3 qj3Var = (qj3) U;
        throw null;
    }

    public final int S(T t10, byte[] bArr, int i10, int i11, int i12, int i13, int i14, int i15, int i16, long j10, int i17, ah3 ah3Var) throws IOException {
        Unsafe unsafe = f1892r;
        long j11 = this.f1893a[i17 + 2] & 1048575;
        switch (i16) {
            case 51:
                if (i14 == 1) {
                    unsafe.putObject(t10, j10, Double.valueOf(Double.longBitsToDouble(bh3.e(bArr, i10))));
                    unsafe.putInt(t10, j11, i13);
                    return i10 + 8;
                }
                break;
            case 52:
                if (i14 == 5) {
                    unsafe.putObject(t10, j10, Float.valueOf(Float.intBitsToFloat(bh3.d(bArr, i10))));
                    unsafe.putInt(t10, j11, i13);
                    return i10 + 4;
                }
                break;
            case 53:
            case 54:
                if (i14 == 0) {
                    int c10 = bh3.c(bArr, i10, ah3Var);
                    unsafe.putObject(t10, j10, Long.valueOf(ah3Var.f1854b));
                    unsafe.putInt(t10, j11, i13);
                    return c10;
                }
                break;
            case 55:
            case 62:
                if (i14 == 0) {
                    int a10 = bh3.a(bArr, i10, ah3Var);
                    unsafe.putObject(t10, j10, Integer.valueOf(ah3Var.f1853a));
                    unsafe.putInt(t10, j11, i13);
                    return a10;
                }
                break;
            case 56:
            case 65:
                if (i14 == 1) {
                    unsafe.putObject(t10, j10, Long.valueOf(bh3.e(bArr, i10)));
                    unsafe.putInt(t10, j11, i13);
                    return i10 + 8;
                }
                break;
            case 57:
            case 64:
                if (i14 == 5) {
                    unsafe.putObject(t10, j10, Integer.valueOf(bh3.d(bArr, i10)));
                    unsafe.putInt(t10, j11, i13);
                    return i10 + 4;
                }
                break;
            case 58:
                if (i14 == 0) {
                    int c11 = bh3.c(bArr, i10, ah3Var);
                    unsafe.putObject(t10, j10, Boolean.valueOf(ah3Var.f1854b != 0));
                    unsafe.putInt(t10, j11, i13);
                    return c11;
                }
                break;
            case 59:
                if (i14 == 2) {
                    int a11 = bh3.a(bArr, i10, ah3Var);
                    int i18 = ah3Var.f1853a;
                    if (i18 == 0) {
                        unsafe.putObject(t10, j10, "");
                    } else if ((i15 & 536870912) != 0 && !sl3.b(bArr, a11, a11 + i18)) {
                        throw zzggm.l();
                    } else {
                        unsafe.putObject(t10, j10, new String(bArr, a11, i18, bj3.f2374a));
                        a11 += i18;
                    }
                    unsafe.putInt(t10, j11, i13);
                    return a11;
                }
                break;
            case 60:
                if (i14 == 2) {
                    int i19 = bh3.i(T(i17), bArr, i10, i11, ah3Var);
                    Object object = unsafe.getInt(t10, j11) == i13 ? unsafe.getObject(t10, j10) : null;
                    if (object == null) {
                        unsafe.putObject(t10, j10, ah3Var.f1855c);
                    } else {
                        unsafe.putObject(t10, j10, bj3.i(object, ah3Var.f1855c));
                    }
                    unsafe.putInt(t10, j11, i13);
                    return i19;
                }
                break;
            case 61:
                if (i14 == 2) {
                    int h10 = bh3.h(bArr, i10, ah3Var);
                    unsafe.putObject(t10, j10, ah3Var.f1855c);
                    unsafe.putInt(t10, j11, i13);
                    return h10;
                }
                break;
            case 63:
                if (i14 == 0) {
                    int a12 = bh3.a(bArr, i10, ah3Var);
                    int i20 = ah3Var.f1853a;
                    vi3 V = V(i17);
                    if (V != null && !V.G(i20)) {
                        H(t10).h(i12, Long.valueOf(i20));
                    } else {
                        unsafe.putObject(t10, j10, Integer.valueOf(i20));
                        unsafe.putInt(t10, j11, i13);
                    }
                    return a12;
                }
                break;
            case 66:
                if (i14 == 0) {
                    int a13 = bh3.a(bArr, i10, ah3Var);
                    unsafe.putObject(t10, j10, Integer.valueOf(uh3.e(ah3Var.f1853a)));
                    unsafe.putInt(t10, j11, i13);
                    return a13;
                }
                break;
            case 67:
                if (i14 == 0) {
                    int c12 = bh3.c(bArr, i10, ah3Var);
                    unsafe.putObject(t10, j10, Long.valueOf(uh3.f(ah3Var.f1854b)));
                    unsafe.putInt(t10, j11, i13);
                    return c12;
                }
                break;
            case 68:
                if (i14 == 3) {
                    int j12 = bh3.j(T(i17), bArr, i10, i11, (i12 & (-8)) | 4, ah3Var);
                    Object object2 = unsafe.getInt(t10, j11) == i13 ? unsafe.getObject(t10, j10) : null;
                    if (object2 == null) {
                        unsafe.putObject(t10, j10, ah3Var.f1855c);
                    } else {
                        unsafe.putObject(t10, j10, bj3.i(object2, ah3Var.f1855c));
                    }
                    unsafe.putInt(t10, j11, i13);
                    return j12;
                }
                break;
        }
        return i10;
    }

    public final ok3 T(int i10) {
        int i11 = i10 / 3;
        int i12 = i11 + i11;
        ok3 ok3Var = (ok3) this.f1894b[i12];
        if (ok3Var != null) {
            return ok3Var;
        }
        ok3<T> b10 = fk3.a().b((Class) this.f1894b[i12 + 1]);
        this.f1894b[i12] = b10;
        return b10;
    }

    public final Object U(int i10) {
        int i11 = i10 / 3;
        return this.f1894b[i11 + i11];
    }

    public final vi3 V(int i10) {
        int i11 = i10 / 3;
        return (vi3) this.f1894b[i11 + i11 + 1];
    }

    /* JADX WARN: Code restructure failed: missing block: B:106:0x02a9, code lost:
        if (r0 != r15) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x02ab, code lost:
        r15 = r30;
        r14 = r31;
        r12 = r32;
        r13 = r34;
        r11 = r35;
        r10 = r18;
        r2 = r19;
        r1 = r20;
        r6 = r24;
        r7 = r25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x02c1, code lost:
        r2 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x02f4, code lost:
        if (r0 != r15) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0317, code lost:
        if (r0 != r15) goto L154;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int W(T r31, byte[] r32, int r33, int r34, ai.ah3 r35) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 898
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.ak3.W(java.lang.Object, byte[], int, int, ai.ah3):int");
    }

    public final <UT, UB> UB a(Object obj, int i10, UB ub2, dl3<UT, UB> dl3Var) {
        int i11 = this.f1893a[i10];
        Object v10 = nl3.v(obj, d(i10) & 1048575);
        if (v10 == null || V(i10) == null) {
            return ub2;
        }
        rj3 rj3Var = (rj3) v10;
        qj3 qj3Var = (qj3) U(i10);
        throw null;
    }

    public final void c(Object obj, int i10, ik3 ik3Var) throws IOException {
        if (p(i10)) {
            nl3.w(obj, i10 & 1048575, ik3Var.n());
        } else if (this.f1899g) {
            nl3.w(obj, i10 & 1048575, ik3Var.k());
        } else {
            nl3.w(obj, i10 & 1048575, ik3Var.l());
        }
    }

    public final int d(int i10) {
        return this.f1893a[i10 + 1];
    }

    @Override // ai.ok3
    public final void e(T t10) {
        int i10;
        int i11 = this.f1902j;
        while (true) {
            i10 = this.f1903k;
            if (i11 >= i10) {
                break;
            }
            long d10 = d(this.f1901i[i11]) & 1048575;
            Object v10 = nl3.v(t10, d10);
            if (v10 != null) {
                ((rj3) v10).h();
                nl3.w(t10, d10, v10);
            }
            i11++;
        }
        int length = this.f1901i.length;
        while (i10 < length) {
            this.f1904l.b(t10, this.f1901i[i10]);
            i10++;
        }
        this.f1905m.m(t10);
        if (this.f1898f) {
            this.f1906n.d(t10);
        }
    }

    @Override // ai.ok3
    public final void f(T t10, zh3 zh3Var) throws IOException {
        if (!this.f1900h) {
            E(t10, zh3Var);
        } else if (!this.f1898f) {
            int length = this.f1893a.length;
            for (int i10 = 0; i10 < length; i10 += 3) {
                int d10 = d(i10);
                int i11 = this.f1893a[i10];
                switch (o(d10)) {
                    case 0:
                        if (x(t10, i10)) {
                            zh3Var.q(i11, nl3.t(t10, d10 & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 1:
                        if (x(t10, i10)) {
                            zh3Var.p(i11, nl3.r(t10, d10 & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 2:
                        if (x(t10, i10)) {
                            zh3Var.n(i11, nl3.n(t10, d10 & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        if (x(t10, i10)) {
                            zh3Var.s(i11, nl3.n(t10, d10 & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 4:
                        if (x(t10, i10)) {
                            zh3Var.t(i11, nl3.l(t10, d10 & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        if (x(t10, i10)) {
                            zh3Var.u(i11, nl3.n(t10, d10 & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 6:
                        if (x(t10, i10)) {
                            zh3Var.v(i11, nl3.l(t10, d10 & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 7:
                        if (x(t10, i10)) {
                            zh3Var.w(i11, nl3.p(t10, d10 & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 8:
                        if (x(t10, i10)) {
                            G(i11, nl3.v(t10, d10 & 1048575), zh3Var);
                            break;
                        } else {
                            break;
                        }
                    case 9:
                        if (x(t10, i10)) {
                            zh3Var.C(i11, nl3.v(t10, d10 & 1048575), T(i10));
                            break;
                        } else {
                            break;
                        }
                    case 10:
                        if (x(t10, i10)) {
                            zh3Var.y(i11, (oh3) nl3.v(t10, d10 & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 11:
                        if (x(t10, i10)) {
                            zh3Var.z(i11, nl3.l(t10, d10 & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 12:
                        if (x(t10, i10)) {
                            zh3Var.r(i11, nl3.l(t10, d10 & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 13:
                        if (x(t10, i10)) {
                            zh3Var.m(i11, nl3.l(t10, d10 & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 14:
                        if (x(t10, i10)) {
                            zh3Var.o(i11, nl3.n(t10, d10 & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 15:
                        if (x(t10, i10)) {
                            zh3Var.A(i11, nl3.l(t10, d10 & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 16:
                        if (x(t10, i10)) {
                            zh3Var.B(i11, nl3.n(t10, d10 & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 17:
                        if (x(t10, i10)) {
                            zh3Var.D(i11, nl3.v(t10, d10 & 1048575), T(i10));
                            break;
                        } else {
                            break;
                        }
                    case 18:
                        rk3.j(this.f1893a[i10], (List) nl3.v(t10, d10 & 1048575), zh3Var, false);
                        break;
                    case 19:
                        rk3.k(this.f1893a[i10], (List) nl3.v(t10, d10 & 1048575), zh3Var, false);
                        break;
                    case 20:
                        rk3.l(this.f1893a[i10], (List) nl3.v(t10, d10 & 1048575), zh3Var, false);
                        break;
                    case 21:
                        rk3.m(this.f1893a[i10], (List) nl3.v(t10, d10 & 1048575), zh3Var, false);
                        break;
                    case 22:
                        rk3.q(this.f1893a[i10], (List) nl3.v(t10, d10 & 1048575), zh3Var, false);
                        break;
                    case 23:
                        rk3.o(this.f1893a[i10], (List) nl3.v(t10, d10 & 1048575), zh3Var, false);
                        break;
                    case 24:
                        rk3.t(this.f1893a[i10], (List) nl3.v(t10, d10 & 1048575), zh3Var, false);
                        break;
                    case 25:
                        rk3.w(this.f1893a[i10], (List) nl3.v(t10, d10 & 1048575), zh3Var, false);
                        break;
                    case 26:
                        rk3.x(this.f1893a[i10], (List) nl3.v(t10, d10 & 1048575), zh3Var);
                        break;
                    case 27:
                        rk3.z(this.f1893a[i10], (List) nl3.v(t10, d10 & 1048575), zh3Var, T(i10));
                        break;
                    case 28:
                        rk3.y(this.f1893a[i10], (List) nl3.v(t10, d10 & 1048575), zh3Var);
                        break;
                    case 29:
                        rk3.r(this.f1893a[i10], (List) nl3.v(t10, d10 & 1048575), zh3Var, false);
                        break;
                    case 30:
                        rk3.v(this.f1893a[i10], (List) nl3.v(t10, d10 & 1048575), zh3Var, false);
                        break;
                    case 31:
                        rk3.u(this.f1893a[i10], (List) nl3.v(t10, d10 & 1048575), zh3Var, false);
                        break;
                    case 32:
                        rk3.p(this.f1893a[i10], (List) nl3.v(t10, d10 & 1048575), zh3Var, false);
                        break;
                    case 33:
                        rk3.s(this.f1893a[i10], (List) nl3.v(t10, d10 & 1048575), zh3Var, false);
                        break;
                    case 34:
                        rk3.n(this.f1893a[i10], (List) nl3.v(t10, d10 & 1048575), zh3Var, false);
                        break;
                    case 35:
                        rk3.j(this.f1893a[i10], (List) nl3.v(t10, d10 & 1048575), zh3Var, true);
                        break;
                    case 36:
                        rk3.k(this.f1893a[i10], (List) nl3.v(t10, d10 & 1048575), zh3Var, true);
                        break;
                    case 37:
                        rk3.l(this.f1893a[i10], (List) nl3.v(t10, d10 & 1048575), zh3Var, true);
                        break;
                    case 38:
                        rk3.m(this.f1893a[i10], (List) nl3.v(t10, d10 & 1048575), zh3Var, true);
                        break;
                    case 39:
                        rk3.q(this.f1893a[i10], (List) nl3.v(t10, d10 & 1048575), zh3Var, true);
                        break;
                    case 40:
                        rk3.o(this.f1893a[i10], (List) nl3.v(t10, d10 & 1048575), zh3Var, true);
                        break;
                    case 41:
                        rk3.t(this.f1893a[i10], (List) nl3.v(t10, d10 & 1048575), zh3Var, true);
                        break;
                    case 42:
                        rk3.w(this.f1893a[i10], (List) nl3.v(t10, d10 & 1048575), zh3Var, true);
                        break;
                    case 43:
                        rk3.r(this.f1893a[i10], (List) nl3.v(t10, d10 & 1048575), zh3Var, true);
                        break;
                    case 44:
                        rk3.v(this.f1893a[i10], (List) nl3.v(t10, d10 & 1048575), zh3Var, true);
                        break;
                    case 45:
                        rk3.u(this.f1893a[i10], (List) nl3.v(t10, d10 & 1048575), zh3Var, true);
                        break;
                    case 46:
                        rk3.p(this.f1893a[i10], (List) nl3.v(t10, d10 & 1048575), zh3Var, true);
                        break;
                    case 47:
                        rk3.s(this.f1893a[i10], (List) nl3.v(t10, d10 & 1048575), zh3Var, true);
                        break;
                    case 48:
                        rk3.n(this.f1893a[i10], (List) nl3.v(t10, d10 & 1048575), zh3Var, true);
                        break;
                    case 49:
                        rk3.B(this.f1893a[i10], (List) nl3.v(t10, d10 & 1048575), zh3Var, T(i10));
                        break;
                    case 50:
                        F(zh3Var, i11, nl3.v(t10, d10 & 1048575), i10);
                        break;
                    case 51:
                        if (z(t10, i11, i10)) {
                            zh3Var.q(i11, q(t10, d10 & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 52:
                        if (z(t10, i11, i10)) {
                            zh3Var.p(i11, r(t10, d10 & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 53:
                        if (z(t10, i11, i10)) {
                            zh3Var.n(i11, t(t10, d10 & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 54:
                        if (z(t10, i11, i10)) {
                            zh3Var.s(i11, t(t10, d10 & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 55:
                        if (z(t10, i11, i10)) {
                            zh3Var.t(i11, s(t10, d10 & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 56:
                        if (z(t10, i11, i10)) {
                            zh3Var.u(i11, t(t10, d10 & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 57:
                        if (z(t10, i11, i10)) {
                            zh3Var.v(i11, s(t10, d10 & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 58:
                        if (z(t10, i11, i10)) {
                            zh3Var.w(i11, u(t10, d10 & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 59:
                        if (z(t10, i11, i10)) {
                            G(i11, nl3.v(t10, d10 & 1048575), zh3Var);
                            break;
                        } else {
                            break;
                        }
                    case 60:
                        if (z(t10, i11, i10)) {
                            zh3Var.C(i11, nl3.v(t10, d10 & 1048575), T(i10));
                            break;
                        } else {
                            break;
                        }
                    case 61:
                        if (z(t10, i11, i10)) {
                            zh3Var.y(i11, (oh3) nl3.v(t10, d10 & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 62:
                        if (z(t10, i11, i10)) {
                            zh3Var.z(i11, s(t10, d10 & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 63:
                        if (z(t10, i11, i10)) {
                            zh3Var.r(i11, s(t10, d10 & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 64:
                        if (z(t10, i11, i10)) {
                            zh3Var.m(i11, s(t10, d10 & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 65:
                        if (z(t10, i11, i10)) {
                            zh3Var.o(i11, t(t10, d10 & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 66:
                        if (z(t10, i11, i10)) {
                            zh3Var.A(i11, s(t10, d10 & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 67:
                        if (z(t10, i11, i10)) {
                            zh3Var.B(i11, t(t10, d10 & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 68:
                        if (z(t10, i11, i10)) {
                            zh3Var.D(i11, nl3.v(t10, d10 & 1048575), T(i10));
                            break;
                        } else {
                            break;
                        }
                }
            }
            dl3<?, ?> dl3Var = this.f1905m;
            dl3Var.r(dl3Var.j(t10), zh3Var);
        } else {
            this.f1906n.b(t10);
            throw null;
        }
    }

    @Override // ai.ok3
    public final int g(T t10) {
        return this.f1900h ? P(t10) : O(t10);
    }

    @Override // ai.ok3
    public final int h(T t10) {
        int i10;
        int e10;
        int length = this.f1893a.length;
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12 += 3) {
            int d10 = d(i12);
            int i13 = this.f1893a[i12];
            long j10 = 1048575 & d10;
            int i14 = 37;
            switch (o(d10)) {
                case 0:
                    i10 = i11 * 53;
                    e10 = bj3.e(Double.doubleToLongBits(nl3.t(t10, j10)));
                    i11 = i10 + e10;
                    break;
                case 1:
                    i10 = i11 * 53;
                    e10 = Float.floatToIntBits(nl3.r(t10, j10));
                    i11 = i10 + e10;
                    break;
                case 2:
                    i10 = i11 * 53;
                    e10 = bj3.e(nl3.n(t10, j10));
                    i11 = i10 + e10;
                    break;
                case 3:
                    i10 = i11 * 53;
                    e10 = bj3.e(nl3.n(t10, j10));
                    i11 = i10 + e10;
                    break;
                case 4:
                    i10 = i11 * 53;
                    e10 = nl3.l(t10, j10);
                    i11 = i10 + e10;
                    break;
                case 5:
                    i10 = i11 * 53;
                    e10 = bj3.e(nl3.n(t10, j10));
                    i11 = i10 + e10;
                    break;
                case 6:
                    i10 = i11 * 53;
                    e10 = nl3.l(t10, j10);
                    i11 = i10 + e10;
                    break;
                case 7:
                    i10 = i11 * 53;
                    e10 = bj3.f(nl3.p(t10, j10));
                    i11 = i10 + e10;
                    break;
                case 8:
                    i10 = i11 * 53;
                    e10 = ((String) nl3.v(t10, j10)).hashCode();
                    i11 = i10 + e10;
                    break;
                case 9:
                    Object v10 = nl3.v(t10, j10);
                    if (v10 != null) {
                        i14 = v10.hashCode();
                    }
                    i11 = (i11 * 53) + i14;
                    break;
                case 10:
                    i10 = i11 * 53;
                    e10 = nl3.v(t10, j10).hashCode();
                    i11 = i10 + e10;
                    break;
                case 11:
                    i10 = i11 * 53;
                    e10 = nl3.l(t10, j10);
                    i11 = i10 + e10;
                    break;
                case 12:
                    i10 = i11 * 53;
                    e10 = nl3.l(t10, j10);
                    i11 = i10 + e10;
                    break;
                case 13:
                    i10 = i11 * 53;
                    e10 = nl3.l(t10, j10);
                    i11 = i10 + e10;
                    break;
                case 14:
                    i10 = i11 * 53;
                    e10 = bj3.e(nl3.n(t10, j10));
                    i11 = i10 + e10;
                    break;
                case 15:
                    i10 = i11 * 53;
                    e10 = nl3.l(t10, j10);
                    i11 = i10 + e10;
                    break;
                case 16:
                    i10 = i11 * 53;
                    e10 = bj3.e(nl3.n(t10, j10));
                    i11 = i10 + e10;
                    break;
                case 17:
                    Object v11 = nl3.v(t10, j10);
                    if (v11 != null) {
                        i14 = v11.hashCode();
                    }
                    i11 = (i11 * 53) + i14;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    i10 = i11 * 53;
                    e10 = nl3.v(t10, j10).hashCode();
                    i11 = i10 + e10;
                    break;
                case 50:
                    i10 = i11 * 53;
                    e10 = nl3.v(t10, j10).hashCode();
                    i11 = i10 + e10;
                    break;
                case 51:
                    if (z(t10, i13, i12)) {
                        i10 = i11 * 53;
                        e10 = bj3.e(Double.doubleToLongBits(q(t10, j10)));
                        i11 = i10 + e10;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (z(t10, i13, i12)) {
                        i10 = i11 * 53;
                        e10 = Float.floatToIntBits(r(t10, j10));
                        i11 = i10 + e10;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (z(t10, i13, i12)) {
                        i10 = i11 * 53;
                        e10 = bj3.e(t(t10, j10));
                        i11 = i10 + e10;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (z(t10, i13, i12)) {
                        i10 = i11 * 53;
                        e10 = bj3.e(t(t10, j10));
                        i11 = i10 + e10;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (z(t10, i13, i12)) {
                        i10 = i11 * 53;
                        e10 = s(t10, j10);
                        i11 = i10 + e10;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (z(t10, i13, i12)) {
                        i10 = i11 * 53;
                        e10 = bj3.e(t(t10, j10));
                        i11 = i10 + e10;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (z(t10, i13, i12)) {
                        i10 = i11 * 53;
                        e10 = s(t10, j10);
                        i11 = i10 + e10;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (z(t10, i13, i12)) {
                        i10 = i11 * 53;
                        e10 = bj3.f(u(t10, j10));
                        i11 = i10 + e10;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (z(t10, i13, i12)) {
                        i10 = i11 * 53;
                        e10 = ((String) nl3.v(t10, j10)).hashCode();
                        i11 = i10 + e10;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (z(t10, i13, i12)) {
                        i10 = i11 * 53;
                        e10 = nl3.v(t10, j10).hashCode();
                        i11 = i10 + e10;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (z(t10, i13, i12)) {
                        i10 = i11 * 53;
                        e10 = nl3.v(t10, j10).hashCode();
                        i11 = i10 + e10;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (z(t10, i13, i12)) {
                        i10 = i11 * 53;
                        e10 = s(t10, j10);
                        i11 = i10 + e10;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (z(t10, i13, i12)) {
                        i10 = i11 * 53;
                        e10 = s(t10, j10);
                        i11 = i10 + e10;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (z(t10, i13, i12)) {
                        i10 = i11 * 53;
                        e10 = s(t10, j10);
                        i11 = i10 + e10;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (z(t10, i13, i12)) {
                        i10 = i11 * 53;
                        e10 = bj3.e(t(t10, j10));
                        i11 = i10 + e10;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (z(t10, i13, i12)) {
                        i10 = i11 * 53;
                        e10 = s(t10, j10);
                        i11 = i10 + e10;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (z(t10, i13, i12)) {
                        i10 = i11 * 53;
                        e10 = bj3.e(t(t10, j10));
                        i11 = i10 + e10;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (z(t10, i13, i12)) {
                        i10 = i11 * 53;
                        e10 = nl3.v(t10, j10).hashCode();
                        i11 = i10 + e10;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int hashCode = (i11 * 53) + this.f1905m.j(t10).hashCode();
        if (this.f1898f) {
            this.f1906n.b(t10);
            throw null;
        }
        return hashCode;
    }

    @Override // ai.ok3
    public final void i(T t10, byte[] bArr, int i10, int i11, ah3 ah3Var) throws IOException {
        if (this.f1900h) {
            W(t10, bArr, i10, i11, ah3Var);
        } else {
            I(t10, bArr, i10, i11, 0, ah3Var);
        }
    }

    @Override // ai.ok3
    public final void j(T t10, T t11) {
        Objects.requireNonNull(t11);
        for (int i10 = 0; i10 < this.f1893a.length; i10 += 3) {
            int d10 = d(i10);
            long j10 = 1048575 & d10;
            int i11 = this.f1893a[i10];
            switch (o(d10)) {
                case 0:
                    if (x(t11, i10)) {
                        nl3.u(t10, j10, nl3.t(t11, j10));
                        y(t10, i10);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (x(t11, i10)) {
                        nl3.s(t10, j10, nl3.r(t11, j10));
                        y(t10, i10);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (x(t11, i10)) {
                        nl3.o(t10, j10, nl3.n(t11, j10));
                        y(t10, i10);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (x(t11, i10)) {
                        nl3.o(t10, j10, nl3.n(t11, j10));
                        y(t10, i10);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (x(t11, i10)) {
                        nl3.m(t10, j10, nl3.l(t11, j10));
                        y(t10, i10);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (x(t11, i10)) {
                        nl3.o(t10, j10, nl3.n(t11, j10));
                        y(t10, i10);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (x(t11, i10)) {
                        nl3.m(t10, j10, nl3.l(t11, j10));
                        y(t10, i10);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (x(t11, i10)) {
                        nl3.q(t10, j10, nl3.p(t11, j10));
                        y(t10, i10);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (x(t11, i10)) {
                        nl3.w(t10, j10, nl3.v(t11, j10));
                        y(t10, i10);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    M(t10, t11, i10);
                    break;
                case 10:
                    if (x(t11, i10)) {
                        nl3.w(t10, j10, nl3.v(t11, j10));
                        y(t10, i10);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (x(t11, i10)) {
                        nl3.m(t10, j10, nl3.l(t11, j10));
                        y(t10, i10);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (x(t11, i10)) {
                        nl3.m(t10, j10, nl3.l(t11, j10));
                        y(t10, i10);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (x(t11, i10)) {
                        nl3.m(t10, j10, nl3.l(t11, j10));
                        y(t10, i10);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (x(t11, i10)) {
                        nl3.o(t10, j10, nl3.n(t11, j10));
                        y(t10, i10);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (x(t11, i10)) {
                        nl3.m(t10, j10, nl3.l(t11, j10));
                        y(t10, i10);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (x(t11, i10)) {
                        nl3.o(t10, j10, nl3.n(t11, j10));
                        y(t10, i10);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    M(t10, t11, i10);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    this.f1904l.c(t10, t11, j10);
                    break;
                case 50:
                    rk3.i(this.f1908p, t10, t11, j10);
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (z(t11, i11, i10)) {
                        nl3.w(t10, j10, nl3.v(t11, j10));
                        A(t10, i11, i10);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    N(t10, t11, i10);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (z(t11, i11, i10)) {
                        nl3.w(t10, j10, nl3.v(t11, j10));
                        A(t10, i11, i10);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    N(t10, t11, i10);
                    break;
            }
        }
        rk3.f(this.f1905m, t10, t11);
        if (this.f1898f) {
            rk3.e(this.f1906n, t10, t11);
        }
    }

    @Override // ai.ok3
    public final void k(T t10, ik3 ik3Var, di3 di3Var) throws IOException {
        Objects.requireNonNull(di3Var);
        dl3 dl3Var = this.f1905m;
        ei3<?> ei3Var = this.f1906n;
        ii3<?> ii3Var = null;
        Object obj = null;
        while (true) {
            try {
                int zzb = ik3Var.zzb();
                int B = B(zzb);
                if (B >= 0) {
                    int d10 = d(B);
                    try {
                        switch (o(d10)) {
                            case 0:
                                nl3.u(t10, d10 & 1048575, ik3Var.c());
                                y(t10, B);
                                break;
                            case 1:
                                nl3.s(t10, d10 & 1048575, ik3Var.a());
                                y(t10, B);
                                break;
                            case 2:
                                nl3.o(t10, d10 & 1048575, ik3Var.e());
                                y(t10, B);
                                break;
                            case 3:
                                nl3.o(t10, d10 & 1048575, ik3Var.f());
                                y(t10, B);
                                break;
                            case 4:
                                nl3.m(t10, d10 & 1048575, ik3Var.h());
                                y(t10, B);
                                break;
                            case 5:
                                nl3.o(t10, d10 & 1048575, ik3Var.g());
                                y(t10, B);
                                break;
                            case 6:
                                nl3.m(t10, d10 & 1048575, ik3Var.i());
                                y(t10, B);
                                break;
                            case 7:
                                nl3.q(t10, d10 & 1048575, ik3Var.j());
                                y(t10, B);
                                break;
                            case 8:
                                c(t10, d10, ik3Var);
                                y(t10, B);
                                break;
                            case 9:
                                if (x(t10, B)) {
                                    long j10 = d10 & 1048575;
                                    nl3.w(t10, j10, bj3.i(nl3.v(t10, j10), ik3Var.o(T(B), di3Var)));
                                    break;
                                } else {
                                    nl3.w(t10, d10 & 1048575, ik3Var.o(T(B), di3Var));
                                    y(t10, B);
                                    break;
                                }
                            case 10:
                                nl3.w(t10, d10 & 1048575, ik3Var.l());
                                y(t10, B);
                                break;
                            case 11:
                                nl3.m(t10, d10 & 1048575, ik3Var.w());
                                y(t10, B);
                                break;
                            case 12:
                                int q10 = ik3Var.q();
                                vi3 V = V(B);
                                if (V != null && !V.G(q10)) {
                                    obj = rk3.h(zzb, q10, obj, dl3Var);
                                    break;
                                }
                                nl3.m(t10, d10 & 1048575, q10);
                                y(t10, B);
                                break;
                            case 13:
                                nl3.m(t10, d10 & 1048575, ik3Var.m());
                                y(t10, B);
                                break;
                            case 14:
                                nl3.o(t10, d10 & 1048575, ik3Var.r());
                                y(t10, B);
                                break;
                            case 15:
                                nl3.m(t10, d10 & 1048575, ik3Var.C());
                                y(t10, B);
                                break;
                            case 16:
                                nl3.o(t10, d10 & 1048575, ik3Var.J());
                                y(t10, B);
                                break;
                            case 17:
                                if (x(t10, B)) {
                                    long j11 = d10 & 1048575;
                                    nl3.w(t10, j11, bj3.i(nl3.v(t10, j11), ik3Var.t(T(B), di3Var)));
                                    break;
                                } else {
                                    nl3.w(t10, d10 & 1048575, ik3Var.t(T(B), di3Var));
                                    y(t10, B);
                                    break;
                                }
                            case 18:
                                ik3Var.u(this.f1904l.a(t10, d10 & 1048575));
                                break;
                            case 19:
                                ik3Var.p(this.f1904l.a(t10, d10 & 1048575));
                                break;
                            case 20:
                                ik3Var.z(this.f1904l.a(t10, d10 & 1048575));
                                break;
                            case 21:
                                ik3Var.x(this.f1904l.a(t10, d10 & 1048575));
                                break;
                            case 22:
                                ik3Var.B(this.f1904l.a(t10, d10 & 1048575));
                                break;
                            case 23:
                                ik3Var.A(this.f1904l.a(t10, d10 & 1048575));
                                break;
                            case 24:
                                ik3Var.v(this.f1904l.a(t10, d10 & 1048575));
                                break;
                            case 25:
                                ik3Var.s(this.f1904l.a(t10, d10 & 1048575));
                                break;
                            case 26:
                                if (p(d10)) {
                                    ((vh3) ik3Var).M(this.f1904l.a(t10, d10 & 1048575), true);
                                    break;
                                } else {
                                    ((vh3) ik3Var).M(this.f1904l.a(t10, d10 & 1048575), false);
                                    break;
                                }
                            case 27:
                                ik3Var.y(this.f1904l.a(t10, d10 & 1048575), T(B), di3Var);
                                break;
                            case 28:
                                ik3Var.I(this.f1904l.a(t10, d10 & 1048575));
                                break;
                            case 29:
                                ik3Var.H(this.f1904l.a(t10, d10 & 1048575));
                                break;
                            case 30:
                                List<Integer> a10 = this.f1904l.a(t10, d10 & 1048575);
                                ik3Var.L(a10);
                                obj = rk3.g(zzb, a10, V(B), obj, dl3Var);
                                break;
                            case 31:
                                ik3Var.K(this.f1904l.a(t10, d10 & 1048575));
                                break;
                            case 32:
                                ik3Var.E(this.f1904l.a(t10, d10 & 1048575));
                                break;
                            case 33:
                                ik3Var.D(this.f1904l.a(t10, d10 & 1048575));
                                break;
                            case 34:
                                ik3Var.F(this.f1904l.a(t10, d10 & 1048575));
                                break;
                            case 35:
                                ik3Var.u(this.f1904l.a(t10, d10 & 1048575));
                                break;
                            case 36:
                                ik3Var.p(this.f1904l.a(t10, d10 & 1048575));
                                break;
                            case 37:
                                ik3Var.z(this.f1904l.a(t10, d10 & 1048575));
                                break;
                            case 38:
                                ik3Var.x(this.f1904l.a(t10, d10 & 1048575));
                                break;
                            case 39:
                                ik3Var.B(this.f1904l.a(t10, d10 & 1048575));
                                break;
                            case 40:
                                ik3Var.A(this.f1904l.a(t10, d10 & 1048575));
                                break;
                            case 41:
                                ik3Var.v(this.f1904l.a(t10, d10 & 1048575));
                                break;
                            case 42:
                                ik3Var.s(this.f1904l.a(t10, d10 & 1048575));
                                break;
                            case 43:
                                ik3Var.H(this.f1904l.a(t10, d10 & 1048575));
                                break;
                            case 44:
                                List<Integer> a11 = this.f1904l.a(t10, d10 & 1048575);
                                ik3Var.L(a11);
                                obj = rk3.g(zzb, a11, V(B), obj, dl3Var);
                                break;
                            case 45:
                                ik3Var.K(this.f1904l.a(t10, d10 & 1048575));
                                break;
                            case 46:
                                ik3Var.E(this.f1904l.a(t10, d10 & 1048575));
                                break;
                            case 47:
                                ik3Var.D(this.f1904l.a(t10, d10 & 1048575));
                                break;
                            case 48:
                                ik3Var.F(this.f1904l.a(t10, d10 & 1048575));
                                break;
                            case 49:
                                ik3Var.G(this.f1904l.a(t10, d10 & 1048575), T(B), di3Var);
                                break;
                            case 50:
                                Object U = U(B);
                                long d11 = d(B) & 1048575;
                                Object v10 = nl3.v(t10, d11);
                                if (v10 != null) {
                                    if (sj3.b(v10)) {
                                        Object g10 = rj3.e().g();
                                        sj3.c(g10, v10);
                                        nl3.w(t10, d11, g10);
                                        v10 = g10;
                                    }
                                } else {
                                    v10 = rj3.e().g();
                                    nl3.w(t10, d11, v10);
                                }
                                rj3 rj3Var = (rj3) v10;
                                qj3 qj3Var = (qj3) U;
                                throw null;
                                break;
                            case 51:
                                nl3.w(t10, d10 & 1048575, Double.valueOf(ik3Var.c()));
                                A(t10, zzb, B);
                                break;
                            case 52:
                                nl3.w(t10, d10 & 1048575, Float.valueOf(ik3Var.a()));
                                A(t10, zzb, B);
                                break;
                            case 53:
                                nl3.w(t10, d10 & 1048575, Long.valueOf(ik3Var.e()));
                                A(t10, zzb, B);
                                break;
                            case 54:
                                nl3.w(t10, d10 & 1048575, Long.valueOf(ik3Var.f()));
                                A(t10, zzb, B);
                                break;
                            case 55:
                                nl3.w(t10, d10 & 1048575, Integer.valueOf(ik3Var.h()));
                                A(t10, zzb, B);
                                break;
                            case 56:
                                nl3.w(t10, d10 & 1048575, Long.valueOf(ik3Var.g()));
                                A(t10, zzb, B);
                                break;
                            case 57:
                                nl3.w(t10, d10 & 1048575, Integer.valueOf(ik3Var.i()));
                                A(t10, zzb, B);
                                break;
                            case 58:
                                nl3.w(t10, d10 & 1048575, Boolean.valueOf(ik3Var.j()));
                                A(t10, zzb, B);
                                break;
                            case 59:
                                c(t10, d10, ik3Var);
                                A(t10, zzb, B);
                                break;
                            case 60:
                                if (z(t10, zzb, B)) {
                                    long j12 = d10 & 1048575;
                                    nl3.w(t10, j12, bj3.i(nl3.v(t10, j12), ik3Var.o(T(B), di3Var)));
                                } else {
                                    nl3.w(t10, d10 & 1048575, ik3Var.o(T(B), di3Var));
                                    y(t10, B);
                                }
                                A(t10, zzb, B);
                                break;
                            case 61:
                                nl3.w(t10, d10 & 1048575, ik3Var.l());
                                A(t10, zzb, B);
                                break;
                            case 62:
                                nl3.w(t10, d10 & 1048575, Integer.valueOf(ik3Var.w()));
                                A(t10, zzb, B);
                                break;
                            case 63:
                                int q11 = ik3Var.q();
                                vi3 V2 = V(B);
                                if (V2 != null && !V2.G(q11)) {
                                    obj = rk3.h(zzb, q11, obj, dl3Var);
                                    break;
                                }
                                nl3.w(t10, d10 & 1048575, Integer.valueOf(q11));
                                A(t10, zzb, B);
                                break;
                            case 64:
                                nl3.w(t10, d10 & 1048575, Integer.valueOf(ik3Var.m()));
                                A(t10, zzb, B);
                                break;
                            case 65:
                                nl3.w(t10, d10 & 1048575, Long.valueOf(ik3Var.r()));
                                A(t10, zzb, B);
                                break;
                            case 66:
                                nl3.w(t10, d10 & 1048575, Integer.valueOf(ik3Var.C()));
                                A(t10, zzb, B);
                                break;
                            case 67:
                                nl3.w(t10, d10 & 1048575, Long.valueOf(ik3Var.J()));
                                A(t10, zzb, B);
                                break;
                            case 68:
                                nl3.w(t10, d10 & 1048575, ik3Var.t(T(B), di3Var));
                                A(t10, zzb, B);
                                break;
                            default:
                                if (obj == null) {
                                    obj = dl3Var.g();
                                }
                                if (!dl3Var.n(obj, ik3Var)) {
                                    for (int i10 = this.f1902j; i10 < this.f1903k; i10++) {
                                        obj = a(t10, this.f1901i[i10], obj, dl3Var);
                                    }
                                    if (obj != null) {
                                        dl3Var.l(t10, obj);
                                        return;
                                    }
                                    return;
                                }
                                break;
                        }
                    } catch (zzggl unused) {
                        dl3Var.a(ik3Var);
                        if (obj == null) {
                            obj = dl3Var.k(t10);
                        }
                        if (!dl3Var.n(obj, ik3Var)) {
                            for (int i11 = this.f1902j; i11 < this.f1903k; i11++) {
                                obj = a(t10, this.f1901i[i11], obj, dl3Var);
                            }
                            if (obj != null) {
                                dl3Var.l(t10, obj);
                                return;
                            }
                            return;
                        }
                    }
                } else if (zzb == Integer.MAX_VALUE) {
                    for (int i12 = this.f1902j; i12 < this.f1903k; i12++) {
                        obj = a(t10, this.f1901i[i12], obj, dl3Var);
                    }
                    if (obj != null) {
                        dl3Var.l(t10, obj);
                        return;
                    }
                    return;
                } else {
                    Object f10 = !this.f1898f ? null : ei3Var.f(di3Var, this.f1897e, zzb);
                    if (f10 != null) {
                        if (ii3Var == null) {
                            ii3Var = ei3Var.c(t10);
                        }
                        ii3<?> ii3Var2 = ii3Var;
                        obj = ei3Var.e(ik3Var, f10, di3Var, ii3Var2, obj, dl3Var);
                        ii3Var = ii3Var2;
                    } else {
                        dl3Var.a(ik3Var);
                        if (obj == null) {
                            obj = dl3Var.k(t10);
                        }
                        if (!dl3Var.n(obj, ik3Var)) {
                            for (int i13 = this.f1902j; i13 < this.f1903k; i13++) {
                                obj = a(t10, this.f1901i[i13], obj, dl3Var);
                            }
                            if (obj != null) {
                                dl3Var.l(t10, obj);
                                return;
                            }
                            return;
                        }
                    }
                }
            } catch (Throwable th2) {
                for (int i14 = this.f1902j; i14 < this.f1903k; i14++) {
                    obj = a(t10, this.f1901i[i14], obj, dl3Var);
                }
                if (obj != null) {
                    dl3Var.l(t10, obj);
                }
                throw th2;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ai.ok3
    public final boolean l(T t10) {
        int i10;
        int i11;
        int i12 = 1048575;
        int i13 = 0;
        int i14 = 0;
        while (i14 < this.f1902j) {
            int i15 = this.f1901i[i14];
            int i16 = this.f1893a[i15];
            int d10 = d(i15);
            int i17 = this.f1893a[i15 + 2];
            int i18 = i17 & 1048575;
            int i19 = 1 << (i17 >>> 20);
            if (i18 != i12) {
                if (i18 != 1048575) {
                    i13 = f1892r.getInt(t10, i18);
                }
                i11 = i13;
                i10 = i18;
            } else {
                i10 = i12;
                i11 = i13;
            }
            if ((268435456 & d10) != 0 && !w(t10, i15, i10, i11, i19)) {
                return false;
            }
            int o10 = o(d10);
            if (o10 != 9 && o10 != 17) {
                if (o10 != 27) {
                    if (o10 == 60 || o10 == 68) {
                        if (z(t10, i16, i15) && !b(t10, d10, T(i15))) {
                            return false;
                        }
                    } else if (o10 != 49) {
                        if (o10 == 50 && !((rj3) nl3.v(t10, d10 & 1048575)).isEmpty()) {
                            qj3 qj3Var = (qj3) U(i15);
                            throw null;
                        }
                    }
                }
                List list = (List) nl3.v(t10, d10 & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    ok3 T = T(i15);
                    for (int i20 = 0; i20 < list.size(); i20++) {
                        if (!T.l(list.get(i20))) {
                            return false;
                        }
                    }
                    continue;
                }
            } else if (w(t10, i15, i10, i11, i19) && !b(t10, d10, T(i15))) {
                return false;
            }
            i14++;
            i12 = i10;
            i13 = i11;
        }
        if (this.f1898f) {
            this.f1906n.b(t10);
            throw null;
        }
        return true;
    }

    @Override // ai.ok3
    public final boolean m(T t10, T t11) {
        boolean d10;
        int length = this.f1893a.length;
        for (int i10 = 0; i10 < length; i10 += 3) {
            int d11 = d(i10);
            long j10 = d11 & 1048575;
            switch (o(d11)) {
                case 0:
                    if (v(t10, t11, i10) && Double.doubleToLongBits(nl3.t(t10, j10)) == Double.doubleToLongBits(nl3.t(t11, j10))) {
                        continue;
                    }
                    return false;
                case 1:
                    if (v(t10, t11, i10) && Float.floatToIntBits(nl3.r(t10, j10)) == Float.floatToIntBits(nl3.r(t11, j10))) {
                        continue;
                    }
                    return false;
                case 2:
                    if (v(t10, t11, i10) && nl3.n(t10, j10) == nl3.n(t11, j10)) {
                        continue;
                    }
                    return false;
                case 3:
                    if (v(t10, t11, i10) && nl3.n(t10, j10) == nl3.n(t11, j10)) {
                        continue;
                    }
                    return false;
                case 4:
                    if (v(t10, t11, i10) && nl3.l(t10, j10) == nl3.l(t11, j10)) {
                        continue;
                    }
                    return false;
                case 5:
                    if (v(t10, t11, i10) && nl3.n(t10, j10) == nl3.n(t11, j10)) {
                        continue;
                    }
                    return false;
                case 6:
                    if (v(t10, t11, i10) && nl3.l(t10, j10) == nl3.l(t11, j10)) {
                        continue;
                    }
                    return false;
                case 7:
                    if (v(t10, t11, i10) && nl3.p(t10, j10) == nl3.p(t11, j10)) {
                        continue;
                    }
                    return false;
                case 8:
                    if (v(t10, t11, i10) && rk3.d(nl3.v(t10, j10), nl3.v(t11, j10))) {
                        continue;
                    }
                    return false;
                case 9:
                    if (v(t10, t11, i10) && rk3.d(nl3.v(t10, j10), nl3.v(t11, j10))) {
                        continue;
                    }
                    return false;
                case 10:
                    if (v(t10, t11, i10) && rk3.d(nl3.v(t10, j10), nl3.v(t11, j10))) {
                        continue;
                    }
                    return false;
                case 11:
                    if (v(t10, t11, i10) && nl3.l(t10, j10) == nl3.l(t11, j10)) {
                        continue;
                    }
                    return false;
                case 12:
                    if (v(t10, t11, i10) && nl3.l(t10, j10) == nl3.l(t11, j10)) {
                        continue;
                    }
                    return false;
                case 13:
                    if (v(t10, t11, i10) && nl3.l(t10, j10) == nl3.l(t11, j10)) {
                        continue;
                    }
                    return false;
                case 14:
                    if (v(t10, t11, i10) && nl3.n(t10, j10) == nl3.n(t11, j10)) {
                        continue;
                    }
                    return false;
                case 15:
                    if (v(t10, t11, i10) && nl3.l(t10, j10) == nl3.l(t11, j10)) {
                        continue;
                    }
                    return false;
                case 16:
                    if (v(t10, t11, i10) && nl3.n(t10, j10) == nl3.n(t11, j10)) {
                        continue;
                    }
                    return false;
                case 17:
                    if (v(t10, t11, i10) && rk3.d(nl3.v(t10, j10), nl3.v(t11, j10))) {
                        continue;
                    }
                    return false;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    d10 = rk3.d(nl3.v(t10, j10), nl3.v(t11, j10));
                    break;
                case 50:
                    d10 = rk3.d(nl3.v(t10, j10), nl3.v(t11, j10));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                case 60:
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                case 68:
                    long n10 = n(i10) & 1048575;
                    if (nl3.l(t10, n10) == nl3.l(t11, n10) && rk3.d(nl3.v(t10, j10), nl3.v(t11, j10))) {
                        continue;
                    }
                    return false;
                default:
            }
            if (!d10) {
                return false;
            }
        }
        if (this.f1905m.j(t10).equals(this.f1905m.j(t11))) {
            if (this.f1898f) {
                this.f1906n.b(t10);
                this.f1906n.b(t11);
                throw null;
            }
            return true;
        }
        return false;
    }

    public final int n(int i10) {
        return this.f1893a[i10 + 2];
    }

    public final boolean v(T t10, T t11, int i10) {
        return x(t10, i10) == x(t11, i10);
    }

    public final boolean w(T t10, int i10, int i11, int i12, int i13) {
        if (i11 == 1048575) {
            return x(t10, i10);
        }
        return (i12 & i13) != 0;
    }

    public final boolean x(T t10, int i10) {
        int n10 = n(i10);
        long j10 = n10 & 1048575;
        if (j10 != 1048575) {
            return (nl3.l(t10, j10) & (1 << (n10 >>> 20))) != 0;
        }
        int d10 = d(i10);
        long j11 = d10 & 1048575;
        switch (o(d10)) {
            case 0:
                return nl3.t(t10, j11) != 0.0d;
            case 1:
                return nl3.r(t10, j11) != 0.0f;
            case 2:
                return nl3.n(t10, j11) != 0;
            case 3:
                return nl3.n(t10, j11) != 0;
            case 4:
                return nl3.l(t10, j11) != 0;
            case 5:
                return nl3.n(t10, j11) != 0;
            case 6:
                return nl3.l(t10, j11) != 0;
            case 7:
                return nl3.p(t10, j11);
            case 8:
                Object v10 = nl3.v(t10, j11);
                if (v10 instanceof String) {
                    return !((String) v10).isEmpty();
                } else if (v10 instanceof oh3) {
                    return !oh3.f7807x.equals(v10);
                } else {
                    throw new IllegalArgumentException();
                }
            case 9:
                return nl3.v(t10, j11) != null;
            case 10:
                return !oh3.f7807x.equals(nl3.v(t10, j11));
            case 11:
                return nl3.l(t10, j11) != 0;
            case 12:
                return nl3.l(t10, j11) != 0;
            case 13:
                return nl3.l(t10, j11) != 0;
            case 14:
                return nl3.n(t10, j11) != 0;
            case 15:
                return nl3.l(t10, j11) != 0;
            case 16:
                return nl3.n(t10, j11) != 0;
            case 17:
                return nl3.v(t10, j11) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    public final void y(T t10, int i10) {
        int n10 = n(i10);
        long j10 = 1048575 & n10;
        if (j10 == 1048575) {
            return;
        }
        nl3.m(t10, j10, (1 << (n10 >>> 20)) | nl3.l(t10, j10));
    }

    public final boolean z(T t10, int i10, int i11) {
        return nl3.l(t10, (long) (n(i11) & 1048575)) == i10;
    }

    @Override // ai.ok3
    public final T zza() {
        return (T) ((ri3) this.f1897e).A(4, null, null);
    }
}
