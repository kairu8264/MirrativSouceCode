package hi;

import com.google.android.gms.internal.measurement.zzkh;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import sun.misc.Unsafe;

/* loaded from: classes3.dex */
public final class z9<T> implements ha<T> {

    /* renamed from: p  reason: collision with root package name */
    public static final int[] f36089p = new int[0];

    /* renamed from: q  reason: collision with root package name */
    public static final Unsafe f36090q = fb.l();

    /* renamed from: a  reason: collision with root package name */
    public final int[] f36091a;

    /* renamed from: b  reason: collision with root package name */
    public final Object[] f36092b;

    /* renamed from: c  reason: collision with root package name */
    public final int f36093c;

    /* renamed from: d  reason: collision with root package name */
    public final int f36094d;

    /* renamed from: e  reason: collision with root package name */
    public final w9 f36095e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f36096f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f36097g;

    /* renamed from: h  reason: collision with root package name */
    public final int[] f36098h;

    /* renamed from: i  reason: collision with root package name */
    public final int f36099i;

    /* renamed from: j  reason: collision with root package name */
    public final int f36100j;

    /* renamed from: k  reason: collision with root package name */
    public final j9 f36101k;

    /* renamed from: l  reason: collision with root package name */
    public final va<?, ?> f36102l;

    /* renamed from: m  reason: collision with root package name */
    public final h8<?> f36103m;

    /* renamed from: n  reason: collision with root package name */
    public final ba f36104n;

    /* renamed from: o  reason: collision with root package name */
    public final q9 f36105o;

    /* JADX WARN: Multi-variable type inference failed */
    public z9(int[] iArr, int[] iArr2, Object[] objArr, int i10, int i11, w9 w9Var, boolean z10, boolean z11, int[] iArr3, int i12, int i13, ba baVar, j9 j9Var, va<?, ?> vaVar, h8<?> h8Var, q9 q9Var) {
        this.f36091a = iArr;
        this.f36092b = iArr2;
        this.f36093c = objArr;
        this.f36094d = i10;
        this.f36097g = w9Var;
        boolean z12 = false;
        if (vaVar != 0 && vaVar.c((w9) i11)) {
            z12 = true;
        }
        this.f36096f = z12;
        this.f36098h = z11;
        this.f36099i = iArr3;
        this.f36100j = i12;
        this.f36104n = i13;
        this.f36101k = baVar;
        this.f36102l = j9Var;
        this.f36103m = vaVar;
        this.f36095e = i11;
        this.f36105o = h8Var;
    }

    public static final void C(int i10, Object obj, c8 c8Var) throws IOException {
        if (obj instanceof String) {
            c8Var.f(i10, (String) obj);
        } else {
            c8Var.o(i10, (u7) obj);
        }
    }

    public static wa E(Object obj) {
        t8 t8Var = (t8) obj;
        wa waVar = t8Var.zzc;
        if (waVar == wa.c()) {
            wa e10 = wa.e();
            t8Var.zzc = e10;
            return e10;
        }
        return waVar;
    }

    public static <T> z9<T> F(Class<T> cls, s9 s9Var, ba baVar, j9 j9Var, va<?, ?> vaVar, h8<?> h8Var, q9 q9Var) {
        if (s9Var instanceof ga) {
            return G((ga) s9Var, baVar, j9Var, vaVar, h8Var, q9Var);
        }
        sa saVar = (sa) s9Var;
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
    public static <T> hi.z9<T> G(hi.ga r34, hi.ba r35, hi.j9 r36, hi.va<?, ?> r37, hi.h8<?> r38, hi.q9 r39) {
        /*
            Method dump skipped, instructions count: 1016
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: hi.z9.G(hi.ga, hi.ba, hi.j9, hi.va, hi.h8, hi.q9):hi.z9");
    }

    public static <T> double H(T t10, long j10) {
        return ((Double) fb.k(t10, j10)).doubleValue();
    }

    public static <T> float I(T t10, long j10) {
        return ((Float) fb.k(t10, j10)).floatValue();
    }

    public static <T> int L(T t10, long j10) {
        return ((Integer) fb.k(t10, j10)).intValue();
    }

    public static int j(int i10) {
        return (i10 >>> 20) & 255;
    }

    public static <T> long l(T t10, long j10) {
        return ((Long) fb.k(t10, j10)).longValue();
    }

    public static Field p(Class<?> cls, String str) {
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
    public static boolean x(Object obj, int i10, ha haVar) {
        return haVar.e(fb.k(obj, i10 & 1048575));
    }

    public static <T> boolean z(T t10, long j10) {
        return ((Boolean) fb.k(t10, j10)).booleanValue();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void A(T t10, c8 c8Var) throws IOException {
        int i10;
        boolean z10;
        if (!this.f36096f) {
            int length = this.f36091a.length;
            Unsafe unsafe = f36090q;
            int i11 = 1048575;
            int i12 = 1048575;
            int i13 = 0;
            int i14 = 0;
            while (i13 < length) {
                int k10 = k(i13);
                int i15 = this.f36091a[i13];
                int j10 = j(k10);
                if (j10 <= 17) {
                    int i16 = this.f36091a[i13 + 2];
                    int i17 = i16 & i11;
                    if (i17 != i12) {
                        i14 = unsafe.getInt(t10, i17);
                        i12 = i17;
                    }
                    i10 = 1 << (i16 >>> 20);
                } else {
                    i10 = 0;
                }
                long j11 = k10 & i11;
                switch (j10) {
                    case 0:
                        if ((i14 & i10) == 0) {
                            break;
                        } else {
                            c8Var.q(i15, fb.f(t10, j11));
                            break;
                        }
                    case 1:
                        if ((i14 & i10) == 0) {
                            break;
                        } else {
                            c8Var.z(i15, fb.g(t10, j11));
                            break;
                        }
                    case 2:
                        if ((i14 & i10) == 0) {
                            break;
                        } else {
                            c8Var.E(i15, unsafe.getLong(t10, j11));
                            break;
                        }
                    case 3:
                        if ((i14 & i10) == 0) {
                            break;
                        } else {
                            c8Var.j(i15, unsafe.getLong(t10, j11));
                            break;
                        }
                    case 4:
                        if ((i14 & i10) == 0) {
                            break;
                        } else {
                            c8Var.C(i15, unsafe.getInt(t10, j11));
                            break;
                        }
                    case 5:
                        if ((i14 & i10) == 0) {
                            break;
                        } else {
                            c8Var.x(i15, unsafe.getLong(t10, j11));
                            break;
                        }
                    case 6:
                        if ((i14 & i10) == 0) {
                            break;
                        } else {
                            c8Var.v(i15, unsafe.getInt(t10, j11));
                            break;
                        }
                    case 7:
                        if ((i14 & i10) == 0) {
                            break;
                        } else {
                            c8Var.m(i15, fb.B(t10, j11));
                            break;
                        }
                    case 8:
                        if ((i14 & i10) == 0) {
                            break;
                        } else {
                            C(i15, unsafe.getObject(t10, j11), c8Var);
                            break;
                        }
                    case 9:
                        if ((i14 & i10) == 0) {
                            break;
                        } else {
                            c8Var.G(i15, unsafe.getObject(t10, j11), n(i13));
                            break;
                        }
                    case 10:
                        if ((i14 & i10) == 0) {
                            break;
                        } else {
                            c8Var.o(i15, (u7) unsafe.getObject(t10, j11));
                            break;
                        }
                    case 11:
                        if ((i14 & i10) == 0) {
                            break;
                        } else {
                            c8Var.h(i15, unsafe.getInt(t10, j11));
                            break;
                        }
                    case 12:
                        if ((i14 & i10) == 0) {
                            break;
                        } else {
                            c8Var.t(i15, unsafe.getInt(t10, j11));
                            break;
                        }
                    case 13:
                        if ((i14 & i10) == 0) {
                            break;
                        } else {
                            c8Var.H(i15, unsafe.getInt(t10, j11));
                            break;
                        }
                    case 14:
                        if ((i14 & i10) == 0) {
                            break;
                        } else {
                            c8Var.J(i15, unsafe.getLong(t10, j11));
                            break;
                        }
                    case 15:
                        if ((i14 & i10) == 0) {
                            break;
                        } else {
                            c8Var.a(i15, unsafe.getInt(t10, j11));
                            break;
                        }
                    case 16:
                        if ((i14 & i10) == 0) {
                            break;
                        } else {
                            c8Var.c(i15, unsafe.getLong(t10, j11));
                            break;
                        }
                    case 17:
                        if ((i14 & i10) == 0) {
                            break;
                        } else {
                            c8Var.B(i15, unsafe.getObject(t10, j11), n(i13));
                            break;
                        }
                    case 18:
                        ja.l(this.f36091a[i13], (List) unsafe.getObject(t10, j11), c8Var, false);
                        break;
                    case 19:
                        ja.p(this.f36091a[i13], (List) unsafe.getObject(t10, j11), c8Var, false);
                        break;
                    case 20:
                        ja.s(this.f36091a[i13], (List) unsafe.getObject(t10, j11), c8Var, false);
                        break;
                    case 21:
                        ja.B(this.f36091a[i13], (List) unsafe.getObject(t10, j11), c8Var, false);
                        break;
                    case 22:
                        ja.r(this.f36091a[i13], (List) unsafe.getObject(t10, j11), c8Var, false);
                        break;
                    case 23:
                        ja.o(this.f36091a[i13], (List) unsafe.getObject(t10, j11), c8Var, false);
                        break;
                    case 24:
                        ja.n(this.f36091a[i13], (List) unsafe.getObject(t10, j11), c8Var, false);
                        break;
                    case 25:
                        ja.j(this.f36091a[i13], (List) unsafe.getObject(t10, j11), c8Var, false);
                        break;
                    case 26:
                        ja.y(this.f36091a[i13], (List) unsafe.getObject(t10, j11), c8Var);
                        break;
                    case 27:
                        ja.t(this.f36091a[i13], (List) unsafe.getObject(t10, j11), c8Var, n(i13));
                        break;
                    case 28:
                        ja.k(this.f36091a[i13], (List) unsafe.getObject(t10, j11), c8Var);
                        break;
                    case 29:
                        z10 = false;
                        ja.z(this.f36091a[i13], (List) unsafe.getObject(t10, j11), c8Var, false);
                        break;
                    case 30:
                        z10 = false;
                        ja.m(this.f36091a[i13], (List) unsafe.getObject(t10, j11), c8Var, false);
                        break;
                    case 31:
                        z10 = false;
                        ja.u(this.f36091a[i13], (List) unsafe.getObject(t10, j11), c8Var, false);
                        break;
                    case 32:
                        z10 = false;
                        ja.v(this.f36091a[i13], (List) unsafe.getObject(t10, j11), c8Var, false);
                        break;
                    case 33:
                        z10 = false;
                        ja.w(this.f36091a[i13], (List) unsafe.getObject(t10, j11), c8Var, false);
                        break;
                    case 34:
                        z10 = false;
                        ja.x(this.f36091a[i13], (List) unsafe.getObject(t10, j11), c8Var, false);
                        break;
                    case 35:
                        ja.l(this.f36091a[i13], (List) unsafe.getObject(t10, j11), c8Var, true);
                        break;
                    case 36:
                        ja.p(this.f36091a[i13], (List) unsafe.getObject(t10, j11), c8Var, true);
                        break;
                    case 37:
                        ja.s(this.f36091a[i13], (List) unsafe.getObject(t10, j11), c8Var, true);
                        break;
                    case 38:
                        ja.B(this.f36091a[i13], (List) unsafe.getObject(t10, j11), c8Var, true);
                        break;
                    case 39:
                        ja.r(this.f36091a[i13], (List) unsafe.getObject(t10, j11), c8Var, true);
                        break;
                    case 40:
                        ja.o(this.f36091a[i13], (List) unsafe.getObject(t10, j11), c8Var, true);
                        break;
                    case 41:
                        ja.n(this.f36091a[i13], (List) unsafe.getObject(t10, j11), c8Var, true);
                        break;
                    case 42:
                        ja.j(this.f36091a[i13], (List) unsafe.getObject(t10, j11), c8Var, true);
                        break;
                    case 43:
                        ja.z(this.f36091a[i13], (List) unsafe.getObject(t10, j11), c8Var, true);
                        break;
                    case 44:
                        ja.m(this.f36091a[i13], (List) unsafe.getObject(t10, j11), c8Var, true);
                        break;
                    case 45:
                        ja.u(this.f36091a[i13], (List) unsafe.getObject(t10, j11), c8Var, true);
                        break;
                    case 46:
                        ja.v(this.f36091a[i13], (List) unsafe.getObject(t10, j11), c8Var, true);
                        break;
                    case 47:
                        ja.w(this.f36091a[i13], (List) unsafe.getObject(t10, j11), c8Var, true);
                        break;
                    case 48:
                        ja.x(this.f36091a[i13], (List) unsafe.getObject(t10, j11), c8Var, true);
                        break;
                    case 49:
                        ja.q(this.f36091a[i13], (List) unsafe.getObject(t10, j11), c8Var, n(i13));
                        break;
                    case 50:
                        B(c8Var, i15, unsafe.getObject(t10, j11), i13);
                        break;
                    case 51:
                        if (y(t10, i15, i13)) {
                            c8Var.q(i15, H(t10, j11));
                        }
                        break;
                    case 52:
                        if (y(t10, i15, i13)) {
                            c8Var.z(i15, I(t10, j11));
                        }
                        break;
                    case 53:
                        if (y(t10, i15, i13)) {
                            c8Var.E(i15, l(t10, j11));
                        }
                        break;
                    case 54:
                        if (y(t10, i15, i13)) {
                            c8Var.j(i15, l(t10, j11));
                        }
                        break;
                    case 55:
                        if (y(t10, i15, i13)) {
                            c8Var.C(i15, L(t10, j11));
                        }
                        break;
                    case 56:
                        if (y(t10, i15, i13)) {
                            c8Var.x(i15, l(t10, j11));
                        }
                        break;
                    case 57:
                        if (y(t10, i15, i13)) {
                            c8Var.v(i15, L(t10, j11));
                        }
                        break;
                    case 58:
                        if (y(t10, i15, i13)) {
                            c8Var.m(i15, z(t10, j11));
                        }
                        break;
                    case 59:
                        if (y(t10, i15, i13)) {
                            C(i15, unsafe.getObject(t10, j11), c8Var);
                        }
                        break;
                    case 60:
                        if (y(t10, i15, i13)) {
                            c8Var.G(i15, unsafe.getObject(t10, j11), n(i13));
                        }
                        break;
                    case 61:
                        if (y(t10, i15, i13)) {
                            c8Var.o(i15, (u7) unsafe.getObject(t10, j11));
                        }
                        break;
                    case 62:
                        if (y(t10, i15, i13)) {
                            c8Var.h(i15, L(t10, j11));
                        }
                        break;
                    case 63:
                        if (y(t10, i15, i13)) {
                            c8Var.t(i15, L(t10, j11));
                        }
                        break;
                    case 64:
                        if (y(t10, i15, i13)) {
                            c8Var.H(i15, L(t10, j11));
                        }
                        break;
                    case 65:
                        if (y(t10, i15, i13)) {
                            c8Var.J(i15, l(t10, j11));
                        }
                        break;
                    case 66:
                        if (y(t10, i15, i13)) {
                            c8Var.a(i15, L(t10, j11));
                        }
                        break;
                    case 67:
                        if (y(t10, i15, i13)) {
                            c8Var.c(i15, l(t10, j11));
                        }
                        break;
                    case 68:
                        if (y(t10, i15, i13)) {
                            c8Var.B(i15, unsafe.getObject(t10, j11), n(i13));
                        }
                        break;
                }
                i13 += 3;
                i11 = 1048575;
            }
            va<?, ?> vaVar = this.f36102l;
            vaVar.i(vaVar.c(t10), c8Var);
            return;
        }
        this.f36103m.a(t10);
        throw null;
    }

    public final <K, V> void B(c8 c8Var, int i10, Object obj, int i11) throws IOException {
        if (obj == null) {
            return;
        }
        o9 o9Var = (o9) o(i11);
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:144:0x0419, code lost:
        if (r6 == 1048575) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x041b, code lost:
        r26.putInt(r12, r6, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0421, code lost:
        r3 = r9.f36099i;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x0425, code lost:
        if (r3 >= r9.f36100j) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x0427, code lost:
        r4 = r9.f36098h[r3];
        r5 = r9.f36091a[r4];
        r5 = hi.fb.k(r12, r9.k(r4) & 1048575);
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x0439, code lost:
        if (r5 != null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x0440, code lost:
        if (r9.m(r4) != null) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x0442, code lost:
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x0445, code lost:
        r5 = (hi.p9) r5;
        r0 = (hi.o9) r9.o(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x044d, code lost:
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x044e, code lost:
        if (r7 != 0) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x0452, code lost:
        if (r0 != r32) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x0459, code lost:
        throw com.google.android.gms.internal.measurement.zzkh.e();
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x045c, code lost:
        if (r0 > r32) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x045e, code lost:
        if (r1 != r7) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x0460, code lost:
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x0465, code lost:
        throw com.google.android.gms.internal.measurement.zzkh.e();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int D(T r29, byte[] r30, int r31, int r32, int r33, hi.h7 r34) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1164
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: hi.z9.D(java.lang.Object, byte[], int, int, int, hi.h7):int");
    }

    public final int J(T t10) {
        int i10;
        int a10;
        int a11;
        int a12;
        int b10;
        int a13;
        int z10;
        int a14;
        int a15;
        int g10;
        int a16;
        int Q;
        int D;
        int a17;
        int i11;
        Unsafe unsafe = f36090q;
        int i12 = 1048575;
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 0; i15 < this.f36091a.length; i15 += 3) {
            int k10 = k(i15);
            int i16 = this.f36091a[i15];
            int j10 = j(k10);
            if (j10 <= 17) {
                int i17 = this.f36091a[i15 + 2];
                int i18 = i17 & 1048575;
                i10 = 1 << (i17 >>> 20);
                if (i18 != i12) {
                    i14 = unsafe.getInt(t10, i18);
                    i12 = i18;
                }
            } else {
                i10 = 0;
            }
            long j11 = k10 & 1048575;
            switch (j10) {
                case 0:
                    if ((i14 & i10) != 0) {
                        a10 = b8.a(i16 << 3);
                        Q = a10 + 8;
                        break;
                    } else {
                        continue;
                    }
                case 1:
                    if ((i14 & i10) != 0) {
                        a11 = b8.a(i16 << 3);
                        Q = a11 + 4;
                        break;
                    } else {
                        continue;
                    }
                case 2:
                    if ((i14 & i10) != 0) {
                        long j12 = unsafe.getLong(t10, j11);
                        a12 = b8.a(i16 << 3);
                        b10 = b8.b(j12);
                        Q = a12 + b10;
                        break;
                    } else {
                        continue;
                    }
                case 3:
                    if ((i14 & i10) != 0) {
                        long j13 = unsafe.getLong(t10, j11);
                        a12 = b8.a(i16 << 3);
                        b10 = b8.b(j13);
                        Q = a12 + b10;
                        break;
                    } else {
                        continue;
                    }
                case 4:
                    if ((i14 & i10) != 0) {
                        int i19 = unsafe.getInt(t10, j11);
                        a13 = b8.a(i16 << 3);
                        z10 = b8.z(i19);
                        i11 = a13 + z10;
                        i13 += i11;
                    } else {
                        continue;
                    }
                case 5:
                    if ((i14 & i10) != 0) {
                        a10 = b8.a(i16 << 3);
                        Q = a10 + 8;
                        break;
                    } else {
                        continue;
                    }
                case 6:
                    if ((i14 & i10) != 0) {
                        a11 = b8.a(i16 << 3);
                        Q = a11 + 4;
                        break;
                    } else {
                        continue;
                    }
                case 7:
                    if ((i14 & i10) != 0) {
                        a14 = b8.a(i16 << 3);
                        Q = a14 + 1;
                        break;
                    } else {
                        continue;
                    }
                case 8:
                    if ((i14 & i10) != 0) {
                        Object object = unsafe.getObject(t10, j11);
                        if (object instanceof u7) {
                            a15 = b8.a(i16 << 3);
                            g10 = ((u7) object).g();
                            a16 = b8.a(g10);
                            i11 = a15 + a16 + g10;
                            i13 += i11;
                        } else {
                            a13 = b8.a(i16 << 3);
                            z10 = b8.C((String) object);
                            i11 = a13 + z10;
                            i13 += i11;
                        }
                    } else {
                        continue;
                    }
                case 9:
                    if ((i14 & i10) != 0) {
                        Q = ja.Q(i16, unsafe.getObject(t10, j11), n(i15));
                        break;
                    } else {
                        continue;
                    }
                case 10:
                    if ((i14 & i10) != 0) {
                        a15 = b8.a(i16 << 3);
                        g10 = ((u7) unsafe.getObject(t10, j11)).g();
                        a16 = b8.a(g10);
                        i11 = a15 + a16 + g10;
                        i13 += i11;
                    } else {
                        continue;
                    }
                case 11:
                    if ((i14 & i10) != 0) {
                        int i20 = unsafe.getInt(t10, j11);
                        a13 = b8.a(i16 << 3);
                        z10 = b8.a(i20);
                        i11 = a13 + z10;
                        i13 += i11;
                    } else {
                        continue;
                    }
                case 12:
                    if ((i14 & i10) != 0) {
                        int i21 = unsafe.getInt(t10, j11);
                        a13 = b8.a(i16 << 3);
                        z10 = b8.z(i21);
                        i11 = a13 + z10;
                        i13 += i11;
                    } else {
                        continue;
                    }
                case 13:
                    if ((i14 & i10) != 0) {
                        a11 = b8.a(i16 << 3);
                        Q = a11 + 4;
                        break;
                    } else {
                        continue;
                    }
                case 14:
                    if ((i14 & i10) != 0) {
                        a10 = b8.a(i16 << 3);
                        Q = a10 + 8;
                        break;
                    } else {
                        continue;
                    }
                case 15:
                    if ((i14 & i10) != 0) {
                        int i22 = unsafe.getInt(t10, j11);
                        a13 = b8.a(i16 << 3);
                        z10 = b8.a((i22 >> 31) ^ (i22 + i22));
                        i11 = a13 + z10;
                        i13 += i11;
                    } else {
                        continue;
                    }
                case 16:
                    if ((i14 & i10) != 0) {
                        long j14 = unsafe.getLong(t10, j11);
                        a13 = b8.a(i16 << 3);
                        z10 = b8.b((j14 >> 63) ^ (j14 + j14));
                        i11 = a13 + z10;
                        i13 += i11;
                    } else {
                        continue;
                    }
                case 17:
                    if ((i14 & i10) != 0) {
                        Q = b8.y(i16, (w9) unsafe.getObject(t10, j11), n(i15));
                        break;
                    } else {
                        continue;
                    }
                case 18:
                    Q = ja.J(i16, (List) unsafe.getObject(t10, j11), false);
                    break;
                case 19:
                    Q = ja.H(i16, (List) unsafe.getObject(t10, j11), false);
                    break;
                case 20:
                    Q = ja.O(i16, (List) unsafe.getObject(t10, j11), false);
                    break;
                case 21:
                    Q = ja.Z(i16, (List) unsafe.getObject(t10, j11), false);
                    break;
                case 22:
                    Q = ja.M(i16, (List) unsafe.getObject(t10, j11), false);
                    break;
                case 23:
                    Q = ja.J(i16, (List) unsafe.getObject(t10, j11), false);
                    break;
                case 24:
                    Q = ja.H(i16, (List) unsafe.getObject(t10, j11), false);
                    break;
                case 25:
                    Q = ja.A(i16, (List) unsafe.getObject(t10, j11), false);
                    break;
                case 26:
                    Q = ja.W(i16, (List) unsafe.getObject(t10, j11));
                    break;
                case 27:
                    Q = ja.R(i16, (List) unsafe.getObject(t10, j11), n(i15));
                    break;
                case 28:
                    Q = ja.E(i16, (List) unsafe.getObject(t10, j11));
                    break;
                case 29:
                    Q = ja.X(i16, (List) unsafe.getObject(t10, j11), false);
                    break;
                case 30:
                    Q = ja.F(i16, (List) unsafe.getObject(t10, j11), false);
                    break;
                case 31:
                    Q = ja.H(i16, (List) unsafe.getObject(t10, j11), false);
                    break;
                case 32:
                    Q = ja.J(i16, (List) unsafe.getObject(t10, j11), false);
                    break;
                case 33:
                    Q = ja.S(i16, (List) unsafe.getObject(t10, j11), false);
                    break;
                case 34:
                    Q = ja.U(i16, (List) unsafe.getObject(t10, j11), false);
                    break;
                case 35:
                    z10 = ja.K((List) unsafe.getObject(t10, j11));
                    if (z10 > 0) {
                        D = b8.D(i16);
                        a17 = b8.a(z10);
                        a13 = D + a17;
                        i11 = a13 + z10;
                        i13 += i11;
                    } else {
                        continue;
                    }
                case 36:
                    z10 = ja.I((List) unsafe.getObject(t10, j11));
                    if (z10 > 0) {
                        D = b8.D(i16);
                        a17 = b8.a(z10);
                        a13 = D + a17;
                        i11 = a13 + z10;
                        i13 += i11;
                    } else {
                        continue;
                    }
                case 37:
                    z10 = ja.P((List) unsafe.getObject(t10, j11));
                    if (z10 > 0) {
                        D = b8.D(i16);
                        a17 = b8.a(z10);
                        a13 = D + a17;
                        i11 = a13 + z10;
                        i13 += i11;
                    } else {
                        continue;
                    }
                case 38:
                    z10 = ja.a0((List) unsafe.getObject(t10, j11));
                    if (z10 > 0) {
                        D = b8.D(i16);
                        a17 = b8.a(z10);
                        a13 = D + a17;
                        i11 = a13 + z10;
                        i13 += i11;
                    } else {
                        continue;
                    }
                case 39:
                    z10 = ja.N((List) unsafe.getObject(t10, j11));
                    if (z10 > 0) {
                        D = b8.D(i16);
                        a17 = b8.a(z10);
                        a13 = D + a17;
                        i11 = a13 + z10;
                        i13 += i11;
                    } else {
                        continue;
                    }
                case 40:
                    z10 = ja.K((List) unsafe.getObject(t10, j11));
                    if (z10 > 0) {
                        D = b8.D(i16);
                        a17 = b8.a(z10);
                        a13 = D + a17;
                        i11 = a13 + z10;
                        i13 += i11;
                    } else {
                        continue;
                    }
                case 41:
                    z10 = ja.I((List) unsafe.getObject(t10, j11));
                    if (z10 > 0) {
                        D = b8.D(i16);
                        a17 = b8.a(z10);
                        a13 = D + a17;
                        i11 = a13 + z10;
                        i13 += i11;
                    } else {
                        continue;
                    }
                case 42:
                    z10 = ja.D((List) unsafe.getObject(t10, j11));
                    if (z10 > 0) {
                        D = b8.D(i16);
                        a17 = b8.a(z10);
                        a13 = D + a17;
                        i11 = a13 + z10;
                        i13 += i11;
                    } else {
                        continue;
                    }
                case 43:
                    z10 = ja.Y((List) unsafe.getObject(t10, j11));
                    if (z10 > 0) {
                        D = b8.D(i16);
                        a17 = b8.a(z10);
                        a13 = D + a17;
                        i11 = a13 + z10;
                        i13 += i11;
                    } else {
                        continue;
                    }
                case 44:
                    z10 = ja.G((List) unsafe.getObject(t10, j11));
                    if (z10 > 0) {
                        D = b8.D(i16);
                        a17 = b8.a(z10);
                        a13 = D + a17;
                        i11 = a13 + z10;
                        i13 += i11;
                    } else {
                        continue;
                    }
                case 45:
                    z10 = ja.I((List) unsafe.getObject(t10, j11));
                    if (z10 > 0) {
                        D = b8.D(i16);
                        a17 = b8.a(z10);
                        a13 = D + a17;
                        i11 = a13 + z10;
                        i13 += i11;
                    } else {
                        continue;
                    }
                case 46:
                    z10 = ja.K((List) unsafe.getObject(t10, j11));
                    if (z10 > 0) {
                        D = b8.D(i16);
                        a17 = b8.a(z10);
                        a13 = D + a17;
                        i11 = a13 + z10;
                        i13 += i11;
                    } else {
                        continue;
                    }
                case 47:
                    z10 = ja.T((List) unsafe.getObject(t10, j11));
                    if (z10 > 0) {
                        D = b8.D(i16);
                        a17 = b8.a(z10);
                        a13 = D + a17;
                        i11 = a13 + z10;
                        i13 += i11;
                    } else {
                        continue;
                    }
                case 48:
                    z10 = ja.V((List) unsafe.getObject(t10, j11));
                    if (z10 > 0) {
                        D = b8.D(i16);
                        a17 = b8.a(z10);
                        a13 = D + a17;
                        i11 = a13 + z10;
                        i13 += i11;
                    } else {
                        continue;
                    }
                case 49:
                    Q = ja.L(i16, (List) unsafe.getObject(t10, j11), n(i15));
                    break;
                case 50:
                    q9.a(i16, unsafe.getObject(t10, j11), o(i15));
                    continue;
                case 51:
                    if (y(t10, i16, i15)) {
                        a10 = b8.a(i16 << 3);
                        Q = a10 + 8;
                        break;
                    } else {
                        continue;
                    }
                case 52:
                    if (y(t10, i16, i15)) {
                        a11 = b8.a(i16 << 3);
                        Q = a11 + 4;
                        break;
                    } else {
                        continue;
                    }
                case 53:
                    if (y(t10, i16, i15)) {
                        long l10 = l(t10, j11);
                        a12 = b8.a(i16 << 3);
                        b10 = b8.b(l10);
                        Q = a12 + b10;
                        break;
                    } else {
                        continue;
                    }
                case 54:
                    if (y(t10, i16, i15)) {
                        long l11 = l(t10, j11);
                        a12 = b8.a(i16 << 3);
                        b10 = b8.b(l11);
                        Q = a12 + b10;
                        break;
                    } else {
                        continue;
                    }
                case 55:
                    if (y(t10, i16, i15)) {
                        int L = L(t10, j11);
                        a13 = b8.a(i16 << 3);
                        z10 = b8.z(L);
                        i11 = a13 + z10;
                        i13 += i11;
                    } else {
                        continue;
                    }
                case 56:
                    if (y(t10, i16, i15)) {
                        a10 = b8.a(i16 << 3);
                        Q = a10 + 8;
                        break;
                    } else {
                        continue;
                    }
                case 57:
                    if (y(t10, i16, i15)) {
                        a11 = b8.a(i16 << 3);
                        Q = a11 + 4;
                        break;
                    } else {
                        continue;
                    }
                case 58:
                    if (y(t10, i16, i15)) {
                        a14 = b8.a(i16 << 3);
                        Q = a14 + 1;
                        break;
                    } else {
                        continue;
                    }
                case 59:
                    if (y(t10, i16, i15)) {
                        Object object2 = unsafe.getObject(t10, j11);
                        if (object2 instanceof u7) {
                            a15 = b8.a(i16 << 3);
                            g10 = ((u7) object2).g();
                            a16 = b8.a(g10);
                            i11 = a15 + a16 + g10;
                            i13 += i11;
                        } else {
                            a13 = b8.a(i16 << 3);
                            z10 = b8.C((String) object2);
                            i11 = a13 + z10;
                            i13 += i11;
                        }
                    } else {
                        continue;
                    }
                case 60:
                    if (y(t10, i16, i15)) {
                        Q = ja.Q(i16, unsafe.getObject(t10, j11), n(i15));
                        break;
                    } else {
                        continue;
                    }
                case 61:
                    if (y(t10, i16, i15)) {
                        a15 = b8.a(i16 << 3);
                        g10 = ((u7) unsafe.getObject(t10, j11)).g();
                        a16 = b8.a(g10);
                        i11 = a15 + a16 + g10;
                        i13 += i11;
                    } else {
                        continue;
                    }
                case 62:
                    if (y(t10, i16, i15)) {
                        int L2 = L(t10, j11);
                        a13 = b8.a(i16 << 3);
                        z10 = b8.a(L2);
                        i11 = a13 + z10;
                        i13 += i11;
                    } else {
                        continue;
                    }
                case 63:
                    if (y(t10, i16, i15)) {
                        int L3 = L(t10, j11);
                        a13 = b8.a(i16 << 3);
                        z10 = b8.z(L3);
                        i11 = a13 + z10;
                        i13 += i11;
                    } else {
                        continue;
                    }
                case 64:
                    if (y(t10, i16, i15)) {
                        a11 = b8.a(i16 << 3);
                        Q = a11 + 4;
                        break;
                    } else {
                        continue;
                    }
                case 65:
                    if (y(t10, i16, i15)) {
                        a10 = b8.a(i16 << 3);
                        Q = a10 + 8;
                        break;
                    } else {
                        continue;
                    }
                case 66:
                    if (y(t10, i16, i15)) {
                        int L4 = L(t10, j11);
                        a13 = b8.a(i16 << 3);
                        z10 = b8.a((L4 >> 31) ^ (L4 + L4));
                        i11 = a13 + z10;
                        i13 += i11;
                    } else {
                        continue;
                    }
                case 67:
                    if (y(t10, i16, i15)) {
                        long l12 = l(t10, j11);
                        a13 = b8.a(i16 << 3);
                        z10 = b8.b((l12 >> 63) ^ (l12 + l12));
                        i11 = a13 + z10;
                        i13 += i11;
                    } else {
                        continue;
                    }
                case 68:
                    if (y(t10, i16, i15)) {
                        Q = b8.y(i16, (w9) unsafe.getObject(t10, j11), n(i15));
                        break;
                    } else {
                        continue;
                    }
                default:
            }
            i13 += Q;
        }
        va<?, ?> vaVar = this.f36102l;
        int a18 = i13 + vaVar.a(vaVar.c(t10));
        if (this.f36096f) {
            this.f36103m.a(t10);
            throw null;
        }
        return a18;
    }

    public final int K(T t10) {
        int a10;
        int a11;
        int a12;
        int b10;
        int a13;
        int z10;
        int a14;
        int a15;
        int g10;
        int a16;
        int Q;
        int D;
        int a17;
        int i10;
        Unsafe unsafe = f36090q;
        int i11 = 0;
        for (int i12 = 0; i12 < this.f36091a.length; i12 += 3) {
            int k10 = k(i12);
            int j10 = j(k10);
            int i13 = this.f36091a[i12];
            long j11 = k10 & 1048575;
            if (j10 >= m8.zzJ.zza() && j10 <= m8.zzW.zza()) {
                int i14 = this.f36091a[i12 + 2];
            }
            switch (j10) {
                case 0:
                    if (v(t10, i12)) {
                        a10 = b8.a(i13 << 3);
                        Q = a10 + 8;
                        i11 += Q;
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (v(t10, i12)) {
                        a11 = b8.a(i13 << 3);
                        Q = a11 + 4;
                        i11 += Q;
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (v(t10, i12)) {
                        long i15 = fb.i(t10, j11);
                        a12 = b8.a(i13 << 3);
                        b10 = b8.b(i15);
                        i11 += a12 + b10;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (v(t10, i12)) {
                        long i16 = fb.i(t10, j11);
                        a12 = b8.a(i13 << 3);
                        b10 = b8.b(i16);
                        i11 += a12 + b10;
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (v(t10, i12)) {
                        int h10 = fb.h(t10, j11);
                        a13 = b8.a(i13 << 3);
                        z10 = b8.z(h10);
                        i10 = a13 + z10;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (v(t10, i12)) {
                        a10 = b8.a(i13 << 3);
                        Q = a10 + 8;
                        i11 += Q;
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (v(t10, i12)) {
                        a11 = b8.a(i13 << 3);
                        Q = a11 + 4;
                        i11 += Q;
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (v(t10, i12)) {
                        a14 = b8.a(i13 << 3);
                        Q = a14 + 1;
                        i11 += Q;
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (!v(t10, i12)) {
                        break;
                    } else {
                        Object k11 = fb.k(t10, j11);
                        if (k11 instanceof u7) {
                            a15 = b8.a(i13 << 3);
                            g10 = ((u7) k11).g();
                            a16 = b8.a(g10);
                            i10 = a15 + a16 + g10;
                            i11 += i10;
                            break;
                        } else {
                            a13 = b8.a(i13 << 3);
                            z10 = b8.C((String) k11);
                            i10 = a13 + z10;
                            i11 += i10;
                        }
                    }
                case 9:
                    if (v(t10, i12)) {
                        Q = ja.Q(i13, fb.k(t10, j11), n(i12));
                        i11 += Q;
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (v(t10, i12)) {
                        a15 = b8.a(i13 << 3);
                        g10 = ((u7) fb.k(t10, j11)).g();
                        a16 = b8.a(g10);
                        i10 = a15 + a16 + g10;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (v(t10, i12)) {
                        int h11 = fb.h(t10, j11);
                        a13 = b8.a(i13 << 3);
                        z10 = b8.a(h11);
                        i10 = a13 + z10;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (v(t10, i12)) {
                        int h12 = fb.h(t10, j11);
                        a13 = b8.a(i13 << 3);
                        z10 = b8.z(h12);
                        i10 = a13 + z10;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (v(t10, i12)) {
                        a11 = b8.a(i13 << 3);
                        Q = a11 + 4;
                        i11 += Q;
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (v(t10, i12)) {
                        a10 = b8.a(i13 << 3);
                        Q = a10 + 8;
                        i11 += Q;
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (v(t10, i12)) {
                        int h13 = fb.h(t10, j11);
                        a13 = b8.a(i13 << 3);
                        z10 = b8.a((h13 >> 31) ^ (h13 + h13));
                        i10 = a13 + z10;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (v(t10, i12)) {
                        long i17 = fb.i(t10, j11);
                        a13 = b8.a(i13 << 3);
                        z10 = b8.b((i17 >> 63) ^ (i17 + i17));
                        i10 = a13 + z10;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if (v(t10, i12)) {
                        Q = b8.y(i13, (w9) fb.k(t10, j11), n(i12));
                        i11 += Q;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    Q = ja.J(i13, (List) fb.k(t10, j11), false);
                    i11 += Q;
                    break;
                case 19:
                    Q = ja.H(i13, (List) fb.k(t10, j11), false);
                    i11 += Q;
                    break;
                case 20:
                    Q = ja.O(i13, (List) fb.k(t10, j11), false);
                    i11 += Q;
                    break;
                case 21:
                    Q = ja.Z(i13, (List) fb.k(t10, j11), false);
                    i11 += Q;
                    break;
                case 22:
                    Q = ja.M(i13, (List) fb.k(t10, j11), false);
                    i11 += Q;
                    break;
                case 23:
                    Q = ja.J(i13, (List) fb.k(t10, j11), false);
                    i11 += Q;
                    break;
                case 24:
                    Q = ja.H(i13, (List) fb.k(t10, j11), false);
                    i11 += Q;
                    break;
                case 25:
                    Q = ja.A(i13, (List) fb.k(t10, j11), false);
                    i11 += Q;
                    break;
                case 26:
                    Q = ja.W(i13, (List) fb.k(t10, j11));
                    i11 += Q;
                    break;
                case 27:
                    Q = ja.R(i13, (List) fb.k(t10, j11), n(i12));
                    i11 += Q;
                    break;
                case 28:
                    Q = ja.E(i13, (List) fb.k(t10, j11));
                    i11 += Q;
                    break;
                case 29:
                    Q = ja.X(i13, (List) fb.k(t10, j11), false);
                    i11 += Q;
                    break;
                case 30:
                    Q = ja.F(i13, (List) fb.k(t10, j11), false);
                    i11 += Q;
                    break;
                case 31:
                    Q = ja.H(i13, (List) fb.k(t10, j11), false);
                    i11 += Q;
                    break;
                case 32:
                    Q = ja.J(i13, (List) fb.k(t10, j11), false);
                    i11 += Q;
                    break;
                case 33:
                    Q = ja.S(i13, (List) fb.k(t10, j11), false);
                    i11 += Q;
                    break;
                case 34:
                    Q = ja.U(i13, (List) fb.k(t10, j11), false);
                    i11 += Q;
                    break;
                case 35:
                    z10 = ja.K((List) unsafe.getObject(t10, j11));
                    if (z10 > 0) {
                        D = b8.D(i13);
                        a17 = b8.a(z10);
                        a13 = D + a17;
                        i10 = a13 + z10;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 36:
                    z10 = ja.I((List) unsafe.getObject(t10, j11));
                    if (z10 > 0) {
                        D = b8.D(i13);
                        a17 = b8.a(z10);
                        a13 = D + a17;
                        i10 = a13 + z10;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 37:
                    z10 = ja.P((List) unsafe.getObject(t10, j11));
                    if (z10 > 0) {
                        D = b8.D(i13);
                        a17 = b8.a(z10);
                        a13 = D + a17;
                        i10 = a13 + z10;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 38:
                    z10 = ja.a0((List) unsafe.getObject(t10, j11));
                    if (z10 > 0) {
                        D = b8.D(i13);
                        a17 = b8.a(z10);
                        a13 = D + a17;
                        i10 = a13 + z10;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 39:
                    z10 = ja.N((List) unsafe.getObject(t10, j11));
                    if (z10 > 0) {
                        D = b8.D(i13);
                        a17 = b8.a(z10);
                        a13 = D + a17;
                        i10 = a13 + z10;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 40:
                    z10 = ja.K((List) unsafe.getObject(t10, j11));
                    if (z10 > 0) {
                        D = b8.D(i13);
                        a17 = b8.a(z10);
                        a13 = D + a17;
                        i10 = a13 + z10;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 41:
                    z10 = ja.I((List) unsafe.getObject(t10, j11));
                    if (z10 > 0) {
                        D = b8.D(i13);
                        a17 = b8.a(z10);
                        a13 = D + a17;
                        i10 = a13 + z10;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 42:
                    z10 = ja.D((List) unsafe.getObject(t10, j11));
                    if (z10 > 0) {
                        D = b8.D(i13);
                        a17 = b8.a(z10);
                        a13 = D + a17;
                        i10 = a13 + z10;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 43:
                    z10 = ja.Y((List) unsafe.getObject(t10, j11));
                    if (z10 > 0) {
                        D = b8.D(i13);
                        a17 = b8.a(z10);
                        a13 = D + a17;
                        i10 = a13 + z10;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 44:
                    z10 = ja.G((List) unsafe.getObject(t10, j11));
                    if (z10 > 0) {
                        D = b8.D(i13);
                        a17 = b8.a(z10);
                        a13 = D + a17;
                        i10 = a13 + z10;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 45:
                    z10 = ja.I((List) unsafe.getObject(t10, j11));
                    if (z10 > 0) {
                        D = b8.D(i13);
                        a17 = b8.a(z10);
                        a13 = D + a17;
                        i10 = a13 + z10;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 46:
                    z10 = ja.K((List) unsafe.getObject(t10, j11));
                    if (z10 > 0) {
                        D = b8.D(i13);
                        a17 = b8.a(z10);
                        a13 = D + a17;
                        i10 = a13 + z10;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 47:
                    z10 = ja.T((List) unsafe.getObject(t10, j11));
                    if (z10 > 0) {
                        D = b8.D(i13);
                        a17 = b8.a(z10);
                        a13 = D + a17;
                        i10 = a13 + z10;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 48:
                    z10 = ja.V((List) unsafe.getObject(t10, j11));
                    if (z10 > 0) {
                        D = b8.D(i13);
                        a17 = b8.a(z10);
                        a13 = D + a17;
                        i10 = a13 + z10;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 49:
                    Q = ja.L(i13, (List) fb.k(t10, j11), n(i12));
                    i11 += Q;
                    break;
                case 50:
                    q9.a(i13, fb.k(t10, j11), o(i12));
                    break;
                case 51:
                    if (y(t10, i13, i12)) {
                        a10 = b8.a(i13 << 3);
                        Q = a10 + 8;
                        i11 += Q;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (y(t10, i13, i12)) {
                        a11 = b8.a(i13 << 3);
                        Q = a11 + 4;
                        i11 += Q;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (y(t10, i13, i12)) {
                        long l10 = l(t10, j11);
                        a12 = b8.a(i13 << 3);
                        b10 = b8.b(l10);
                        i11 += a12 + b10;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (y(t10, i13, i12)) {
                        long l11 = l(t10, j11);
                        a12 = b8.a(i13 << 3);
                        b10 = b8.b(l11);
                        i11 += a12 + b10;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (y(t10, i13, i12)) {
                        int L = L(t10, j11);
                        a13 = b8.a(i13 << 3);
                        z10 = b8.z(L);
                        i10 = a13 + z10;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (y(t10, i13, i12)) {
                        a10 = b8.a(i13 << 3);
                        Q = a10 + 8;
                        i11 += Q;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (y(t10, i13, i12)) {
                        a11 = b8.a(i13 << 3);
                        Q = a11 + 4;
                        i11 += Q;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (y(t10, i13, i12)) {
                        a14 = b8.a(i13 << 3);
                        Q = a14 + 1;
                        i11 += Q;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (!y(t10, i13, i12)) {
                        break;
                    } else {
                        Object k12 = fb.k(t10, j11);
                        if (k12 instanceof u7) {
                            a15 = b8.a(i13 << 3);
                            g10 = ((u7) k12).g();
                            a16 = b8.a(g10);
                            i10 = a15 + a16 + g10;
                            i11 += i10;
                            break;
                        } else {
                            a13 = b8.a(i13 << 3);
                            z10 = b8.C((String) k12);
                            i10 = a13 + z10;
                            i11 += i10;
                        }
                    }
                case 60:
                    if (y(t10, i13, i12)) {
                        Q = ja.Q(i13, fb.k(t10, j11), n(i12));
                        i11 += Q;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (y(t10, i13, i12)) {
                        a15 = b8.a(i13 << 3);
                        g10 = ((u7) fb.k(t10, j11)).g();
                        a16 = b8.a(g10);
                        i10 = a15 + a16 + g10;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (y(t10, i13, i12)) {
                        int L2 = L(t10, j11);
                        a13 = b8.a(i13 << 3);
                        z10 = b8.a(L2);
                        i10 = a13 + z10;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (y(t10, i13, i12)) {
                        int L3 = L(t10, j11);
                        a13 = b8.a(i13 << 3);
                        z10 = b8.z(L3);
                        i10 = a13 + z10;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (y(t10, i13, i12)) {
                        a11 = b8.a(i13 << 3);
                        Q = a11 + 4;
                        i11 += Q;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (y(t10, i13, i12)) {
                        a10 = b8.a(i13 << 3);
                        Q = a10 + 8;
                        i11 += Q;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (y(t10, i13, i12)) {
                        int L4 = L(t10, j11);
                        a13 = b8.a(i13 << 3);
                        z10 = b8.a((L4 >> 31) ^ (L4 + L4));
                        i10 = a13 + z10;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (y(t10, i13, i12)) {
                        long l12 = l(t10, j11);
                        a13 = b8.a(i13 << 3);
                        z10 = b8.b((l12 >> 63) ^ (l12 + l12));
                        i10 = a13 + z10;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (y(t10, i13, i12)) {
                        Q = b8.y(i13, (w9) fb.k(t10, j11), n(i12));
                        i11 += Q;
                        break;
                    } else {
                        break;
                    }
            }
        }
        va<?, ?> vaVar = this.f36102l;
        return i11 + vaVar.a(vaVar.c(t10));
    }

    public final <K, V> int M(T t10, byte[] bArr, int i10, int i11, int i12, long j10, h7 h7Var) throws IOException {
        Unsafe unsafe = f36090q;
        Object o10 = o(i12);
        Object object = unsafe.getObject(t10, j10);
        if (!((p9) object).i()) {
            p9<K, V> f10 = p9.e().f();
            q9.b(f10, object);
            unsafe.putObject(t10, j10, f10);
        }
        o9 o9Var = (o9) o10;
        throw null;
    }

    public final int N(T t10, byte[] bArr, int i10, int i11, int i12, int i13, int i14, int i15, int i16, long j10, int i17, h7 h7Var) throws IOException {
        Unsafe unsafe = f36090q;
        long j11 = this.f36091a[i17 + 2] & 1048575;
        switch (i16) {
            case 51:
                if (i14 == 1) {
                    unsafe.putObject(t10, j10, Double.valueOf(Double.longBitsToDouble(i7.n(bArr, i10))));
                    unsafe.putInt(t10, j11, i13);
                    return i10 + 8;
                }
                break;
            case 52:
                if (i14 == 5) {
                    unsafe.putObject(t10, j10, Float.valueOf(Float.intBitsToFloat(i7.b(bArr, i10))));
                    unsafe.putInt(t10, j11, i13);
                    return i10 + 4;
                }
                break;
            case 53:
            case 54:
                if (i14 == 0) {
                    int m10 = i7.m(bArr, i10, h7Var);
                    unsafe.putObject(t10, j10, Long.valueOf(h7Var.f35800b));
                    unsafe.putInt(t10, j11, i13);
                    return m10;
                }
                break;
            case 55:
            case 62:
                if (i14 == 0) {
                    int j12 = i7.j(bArr, i10, h7Var);
                    unsafe.putObject(t10, j10, Integer.valueOf(h7Var.f35799a));
                    unsafe.putInt(t10, j11, i13);
                    return j12;
                }
                break;
            case 56:
            case 65:
                if (i14 == 1) {
                    unsafe.putObject(t10, j10, Long.valueOf(i7.n(bArr, i10)));
                    unsafe.putInt(t10, j11, i13);
                    return i10 + 8;
                }
                break;
            case 57:
            case 64:
                if (i14 == 5) {
                    unsafe.putObject(t10, j10, Integer.valueOf(i7.b(bArr, i10)));
                    unsafe.putInt(t10, j11, i13);
                    return i10 + 4;
                }
                break;
            case 58:
                if (i14 == 0) {
                    int m11 = i7.m(bArr, i10, h7Var);
                    unsafe.putObject(t10, j10, Boolean.valueOf(h7Var.f35800b != 0));
                    unsafe.putInt(t10, j11, i13);
                    return m11;
                }
                break;
            case 59:
                if (i14 == 2) {
                    int j13 = i7.j(bArr, i10, h7Var);
                    int i18 = h7Var.f35799a;
                    if (i18 == 0) {
                        unsafe.putObject(t10, j10, "");
                    } else if ((i15 & 536870912) != 0 && !kb.f(bArr, j13, j13 + i18)) {
                        throw zzkh.c();
                    } else {
                        unsafe.putObject(t10, j10, new String(bArr, j13, i18, b9.f35664b));
                        j13 += i18;
                    }
                    unsafe.putInt(t10, j11, i13);
                    return j13;
                }
                break;
            case 60:
                if (i14 == 2) {
                    int d10 = i7.d(n(i17), bArr, i10, i11, h7Var);
                    Object object = unsafe.getInt(t10, j11) == i13 ? unsafe.getObject(t10, j10) : null;
                    if (object == null) {
                        unsafe.putObject(t10, j10, h7Var.f35801c);
                    } else {
                        unsafe.putObject(t10, j10, b9.g(object, h7Var.f35801c));
                    }
                    unsafe.putInt(t10, j11, i13);
                    return d10;
                }
                break;
            case 61:
                if (i14 == 2) {
                    int a10 = i7.a(bArr, i10, h7Var);
                    unsafe.putObject(t10, j10, h7Var.f35801c);
                    unsafe.putInt(t10, j11, i13);
                    return a10;
                }
                break;
            case 63:
                if (i14 == 0) {
                    int j14 = i7.j(bArr, i10, h7Var);
                    int i19 = h7Var.f35799a;
                    x8 m12 = m(i17);
                    if (m12 != null && !m12.G(i19)) {
                        E(t10).h(i12, Long.valueOf(i19));
                    } else {
                        unsafe.putObject(t10, j10, Integer.valueOf(i19));
                        unsafe.putInt(t10, j11, i13);
                    }
                    return j14;
                }
                break;
            case 66:
                if (i14 == 0) {
                    int j15 = i7.j(bArr, i10, h7Var);
                    unsafe.putObject(t10, j10, Integer.valueOf(y7.a(h7Var.f35799a)));
                    unsafe.putInt(t10, j11, i13);
                    return j15;
                }
                break;
            case 67:
                if (i14 == 0) {
                    int m13 = i7.m(bArr, i10, h7Var);
                    unsafe.putObject(t10, j10, Long.valueOf(y7.b(h7Var.f35800b)));
                    unsafe.putInt(t10, j11, i13);
                    return m13;
                }
                break;
            case 68:
                if (i14 == 3) {
                    int c10 = i7.c(n(i17), bArr, i10, i11, (i12 & (-8)) | 4, h7Var);
                    Object object2 = unsafe.getInt(t10, j11) == i13 ? unsafe.getObject(t10, j10) : null;
                    if (object2 == null) {
                        unsafe.putObject(t10, j10, h7Var.f35801c);
                    } else {
                        unsafe.putObject(t10, j10, b9.g(object2, h7Var.f35801c));
                    }
                    unsafe.putInt(t10, j11, i13);
                    return c10;
                }
                break;
        }
        return i10;
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
    public final int O(T r31, byte[] r32, int r33, int r34, hi.h7 r35) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 898
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: hi.z9.O(java.lang.Object, byte[], int, int, hi.h7):int");
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
    public final int P(T r16, byte[] r17, int r18, int r19, int r20, int r21, int r22, int r23, long r24, int r26, long r27, hi.h7 r29) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1172
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: hi.z9.P(java.lang.Object, byte[], int, int, int, int, int, int, long, int, long, hi.h7):int");
    }

    public final int Q(int i10) {
        if (i10 < this.f36093c || i10 > this.f36094d) {
            return -1;
        }
        return T(i10, 0);
    }

    public final int R(int i10, int i11) {
        if (i10 < this.f36093c || i10 > this.f36094d) {
            return -1;
        }
        return T(i10, i11);
    }

    public final int S(int i10) {
        return this.f36091a[i10 + 2];
    }

    public final int T(int i10, int i11) {
        int length = (this.f36091a.length / 3) - 1;
        while (i11 <= length) {
            int i12 = (length + i11) >>> 1;
            int i13 = i12 * 3;
            int i14 = this.f36091a[i13];
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

    @Override // hi.ha
    public final int a(T t10) {
        return this.f36097g ? K(t10) : J(t10);
    }

    @Override // hi.ha
    public final int b(T t10) {
        int i10;
        int c10;
        int length = this.f36091a.length;
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12 += 3) {
            int k10 = k(i12);
            int i13 = this.f36091a[i12];
            long j10 = 1048575 & k10;
            int i14 = 37;
            switch (j(k10)) {
                case 0:
                    i10 = i11 * 53;
                    c10 = b9.c(Double.doubleToLongBits(fb.f(t10, j10)));
                    i11 = i10 + c10;
                    break;
                case 1:
                    i10 = i11 * 53;
                    c10 = Float.floatToIntBits(fb.g(t10, j10));
                    i11 = i10 + c10;
                    break;
                case 2:
                    i10 = i11 * 53;
                    c10 = b9.c(fb.i(t10, j10));
                    i11 = i10 + c10;
                    break;
                case 3:
                    i10 = i11 * 53;
                    c10 = b9.c(fb.i(t10, j10));
                    i11 = i10 + c10;
                    break;
                case 4:
                    i10 = i11 * 53;
                    c10 = fb.h(t10, j10);
                    i11 = i10 + c10;
                    break;
                case 5:
                    i10 = i11 * 53;
                    c10 = b9.c(fb.i(t10, j10));
                    i11 = i10 + c10;
                    break;
                case 6:
                    i10 = i11 * 53;
                    c10 = fb.h(t10, j10);
                    i11 = i10 + c10;
                    break;
                case 7:
                    i10 = i11 * 53;
                    c10 = b9.a(fb.B(t10, j10));
                    i11 = i10 + c10;
                    break;
                case 8:
                    i10 = i11 * 53;
                    c10 = ((String) fb.k(t10, j10)).hashCode();
                    i11 = i10 + c10;
                    break;
                case 9:
                    Object k11 = fb.k(t10, j10);
                    if (k11 != null) {
                        i14 = k11.hashCode();
                    }
                    i11 = (i11 * 53) + i14;
                    break;
                case 10:
                    i10 = i11 * 53;
                    c10 = fb.k(t10, j10).hashCode();
                    i11 = i10 + c10;
                    break;
                case 11:
                    i10 = i11 * 53;
                    c10 = fb.h(t10, j10);
                    i11 = i10 + c10;
                    break;
                case 12:
                    i10 = i11 * 53;
                    c10 = fb.h(t10, j10);
                    i11 = i10 + c10;
                    break;
                case 13:
                    i10 = i11 * 53;
                    c10 = fb.h(t10, j10);
                    i11 = i10 + c10;
                    break;
                case 14:
                    i10 = i11 * 53;
                    c10 = b9.c(fb.i(t10, j10));
                    i11 = i10 + c10;
                    break;
                case 15:
                    i10 = i11 * 53;
                    c10 = fb.h(t10, j10);
                    i11 = i10 + c10;
                    break;
                case 16:
                    i10 = i11 * 53;
                    c10 = b9.c(fb.i(t10, j10));
                    i11 = i10 + c10;
                    break;
                case 17:
                    Object k12 = fb.k(t10, j10);
                    if (k12 != null) {
                        i14 = k12.hashCode();
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
                    c10 = fb.k(t10, j10).hashCode();
                    i11 = i10 + c10;
                    break;
                case 50:
                    i10 = i11 * 53;
                    c10 = fb.k(t10, j10).hashCode();
                    i11 = i10 + c10;
                    break;
                case 51:
                    if (y(t10, i13, i12)) {
                        i10 = i11 * 53;
                        c10 = b9.c(Double.doubleToLongBits(H(t10, j10)));
                        i11 = i10 + c10;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (y(t10, i13, i12)) {
                        i10 = i11 * 53;
                        c10 = Float.floatToIntBits(I(t10, j10));
                        i11 = i10 + c10;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (y(t10, i13, i12)) {
                        i10 = i11 * 53;
                        c10 = b9.c(l(t10, j10));
                        i11 = i10 + c10;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (y(t10, i13, i12)) {
                        i10 = i11 * 53;
                        c10 = b9.c(l(t10, j10));
                        i11 = i10 + c10;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (y(t10, i13, i12)) {
                        i10 = i11 * 53;
                        c10 = L(t10, j10);
                        i11 = i10 + c10;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (y(t10, i13, i12)) {
                        i10 = i11 * 53;
                        c10 = b9.c(l(t10, j10));
                        i11 = i10 + c10;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (y(t10, i13, i12)) {
                        i10 = i11 * 53;
                        c10 = L(t10, j10);
                        i11 = i10 + c10;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (y(t10, i13, i12)) {
                        i10 = i11 * 53;
                        c10 = b9.a(z(t10, j10));
                        i11 = i10 + c10;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (y(t10, i13, i12)) {
                        i10 = i11 * 53;
                        c10 = ((String) fb.k(t10, j10)).hashCode();
                        i11 = i10 + c10;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (y(t10, i13, i12)) {
                        i10 = i11 * 53;
                        c10 = fb.k(t10, j10).hashCode();
                        i11 = i10 + c10;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (y(t10, i13, i12)) {
                        i10 = i11 * 53;
                        c10 = fb.k(t10, j10).hashCode();
                        i11 = i10 + c10;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (y(t10, i13, i12)) {
                        i10 = i11 * 53;
                        c10 = L(t10, j10);
                        i11 = i10 + c10;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (y(t10, i13, i12)) {
                        i10 = i11 * 53;
                        c10 = L(t10, j10);
                        i11 = i10 + c10;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (y(t10, i13, i12)) {
                        i10 = i11 * 53;
                        c10 = L(t10, j10);
                        i11 = i10 + c10;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (y(t10, i13, i12)) {
                        i10 = i11 * 53;
                        c10 = b9.c(l(t10, j10));
                        i11 = i10 + c10;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (y(t10, i13, i12)) {
                        i10 = i11 * 53;
                        c10 = L(t10, j10);
                        i11 = i10 + c10;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (y(t10, i13, i12)) {
                        i10 = i11 * 53;
                        c10 = b9.c(l(t10, j10));
                        i11 = i10 + c10;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (y(t10, i13, i12)) {
                        i10 = i11 * 53;
                        c10 = fb.k(t10, j10).hashCode();
                        i11 = i10 + c10;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int hashCode = (i11 * 53) + this.f36102l.c(t10).hashCode();
        if (this.f36096f) {
            this.f36103m.a(t10);
            throw null;
        }
        return hashCode;
    }

    @Override // hi.ha
    public final T c() {
        return (T) ((t8) this.f36095e).q(4, null, null);
    }

    @Override // hi.ha
    public final void d(T t10) {
        int i10;
        int i11 = this.f36099i;
        while (true) {
            i10 = this.f36100j;
            if (i11 >= i10) {
                break;
            }
            long k10 = k(this.f36098h[i11]) & 1048575;
            Object k11 = fb.k(t10, k10);
            if (k11 != null) {
                ((p9) k11).g();
                fb.x(t10, k10, k11);
            }
            i11++;
        }
        int length = this.f36098h.length;
        while (i10 < length) {
            this.f36101k.a(t10, this.f36098h[i10]);
            i10++;
        }
        this.f36102l.g(t10);
        if (this.f36096f) {
            this.f36103m.b(t10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // hi.ha
    public final boolean e(T t10) {
        int i10;
        int i11;
        int i12 = 1048575;
        int i13 = 0;
        int i14 = 0;
        while (i14 < this.f36099i) {
            int i15 = this.f36098h[i14];
            int i16 = this.f36091a[i15];
            int k10 = k(i15);
            int i17 = this.f36091a[i15 + 2];
            int i18 = i17 & 1048575;
            int i19 = 1 << (i17 >>> 20);
            if (i18 != i12) {
                if (i18 != 1048575) {
                    i13 = f36090q.getInt(t10, i18);
                }
                i11 = i13;
                i10 = i18;
            } else {
                i10 = i12;
                i11 = i13;
            }
            if ((268435456 & k10) != 0 && !w(t10, i15, i10, i11, i19)) {
                return false;
            }
            int j10 = j(k10);
            if (j10 != 9 && j10 != 17) {
                if (j10 != 27) {
                    if (j10 == 60 || j10 == 68) {
                        if (y(t10, i16, i15) && !x(t10, k10, n(i15))) {
                            return false;
                        }
                    } else if (j10 != 49) {
                        if (j10 == 50 && !((p9) fb.k(t10, k10 & 1048575)).isEmpty()) {
                            o9 o9Var = (o9) o(i15);
                            throw null;
                        }
                    }
                }
                List list = (List) fb.k(t10, k10 & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    ha n10 = n(i15);
                    for (int i20 = 0; i20 < list.size(); i20++) {
                        if (!n10.e(list.get(i20))) {
                            return false;
                        }
                    }
                    continue;
                }
            } else if (w(t10, i15, i10, i11, i19) && !x(t10, k10, n(i15))) {
                return false;
            }
            i14++;
            i12 = i10;
            i13 = i11;
        }
        if (this.f36096f) {
            this.f36103m.a(t10);
            throw null;
        }
        return true;
    }

    @Override // hi.ha
    public final void f(T t10, T t11) {
        Objects.requireNonNull(t11);
        for (int i10 = 0; i10 < this.f36091a.length; i10 += 3) {
            int k10 = k(i10);
            long j10 = 1048575 & k10;
            int i11 = this.f36091a[i10];
            switch (j(k10)) {
                case 0:
                    if (v(t11, i10)) {
                        fb.t(t10, j10, fb.f(t11, j10));
                        s(t10, i10);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (v(t11, i10)) {
                        fb.u(t10, j10, fb.g(t11, j10));
                        s(t10, i10);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (v(t11, i10)) {
                        fb.w(t10, j10, fb.i(t11, j10));
                        s(t10, i10);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (v(t11, i10)) {
                        fb.w(t10, j10, fb.i(t11, j10));
                        s(t10, i10);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (v(t11, i10)) {
                        fb.v(t10, j10, fb.h(t11, j10));
                        s(t10, i10);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (v(t11, i10)) {
                        fb.w(t10, j10, fb.i(t11, j10));
                        s(t10, i10);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (v(t11, i10)) {
                        fb.v(t10, j10, fb.h(t11, j10));
                        s(t10, i10);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (v(t11, i10)) {
                        fb.r(t10, j10, fb.B(t11, j10));
                        s(t10, i10);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (v(t11, i10)) {
                        fb.x(t10, j10, fb.k(t11, j10));
                        s(t10, i10);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    q(t10, t11, i10);
                    break;
                case 10:
                    if (v(t11, i10)) {
                        fb.x(t10, j10, fb.k(t11, j10));
                        s(t10, i10);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (v(t11, i10)) {
                        fb.v(t10, j10, fb.h(t11, j10));
                        s(t10, i10);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (v(t11, i10)) {
                        fb.v(t10, j10, fb.h(t11, j10));
                        s(t10, i10);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (v(t11, i10)) {
                        fb.v(t10, j10, fb.h(t11, j10));
                        s(t10, i10);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (v(t11, i10)) {
                        fb.w(t10, j10, fb.i(t11, j10));
                        s(t10, i10);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (v(t11, i10)) {
                        fb.v(t10, j10, fb.h(t11, j10));
                        s(t10, i10);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (v(t11, i10)) {
                        fb.w(t10, j10, fb.i(t11, j10));
                        s(t10, i10);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    q(t10, t11, i10);
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
                    this.f36101k.b(t10, t11, j10);
                    break;
                case 50:
                    ja.i(this.f36105o, t10, t11, j10);
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
                    if (y(t11, i11, i10)) {
                        fb.x(t10, j10, fb.k(t11, j10));
                        t(t10, i11, i10);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    r(t10, t11, i10);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (y(t11, i11, i10)) {
                        fb.x(t10, j10, fb.k(t11, j10));
                        t(t10, i11, i10);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    r(t10, t11, i10);
                    break;
            }
        }
        ja.f(this.f36102l, t10, t11);
        if (this.f36096f) {
            ja.e(this.f36103m, t10, t11);
        }
    }

    @Override // hi.ha
    public final boolean g(T t10, T t11) {
        boolean h10;
        int length = this.f36091a.length;
        for (int i10 = 0; i10 < length; i10 += 3) {
            int k10 = k(i10);
            long j10 = k10 & 1048575;
            switch (j(k10)) {
                case 0:
                    if (u(t10, t11, i10) && Double.doubleToLongBits(fb.f(t10, j10)) == Double.doubleToLongBits(fb.f(t11, j10))) {
                        continue;
                    }
                    return false;
                case 1:
                    if (u(t10, t11, i10) && Float.floatToIntBits(fb.g(t10, j10)) == Float.floatToIntBits(fb.g(t11, j10))) {
                        continue;
                    }
                    return false;
                case 2:
                    if (u(t10, t11, i10) && fb.i(t10, j10) == fb.i(t11, j10)) {
                        continue;
                    }
                    return false;
                case 3:
                    if (u(t10, t11, i10) && fb.i(t10, j10) == fb.i(t11, j10)) {
                        continue;
                    }
                    return false;
                case 4:
                    if (u(t10, t11, i10) && fb.h(t10, j10) == fb.h(t11, j10)) {
                        continue;
                    }
                    return false;
                case 5:
                    if (u(t10, t11, i10) && fb.i(t10, j10) == fb.i(t11, j10)) {
                        continue;
                    }
                    return false;
                case 6:
                    if (u(t10, t11, i10) && fb.h(t10, j10) == fb.h(t11, j10)) {
                        continue;
                    }
                    return false;
                case 7:
                    if (u(t10, t11, i10) && fb.B(t10, j10) == fb.B(t11, j10)) {
                        continue;
                    }
                    return false;
                case 8:
                    if (u(t10, t11, i10) && ja.h(fb.k(t10, j10), fb.k(t11, j10))) {
                        continue;
                    }
                    return false;
                case 9:
                    if (u(t10, t11, i10) && ja.h(fb.k(t10, j10), fb.k(t11, j10))) {
                        continue;
                    }
                    return false;
                case 10:
                    if (u(t10, t11, i10) && ja.h(fb.k(t10, j10), fb.k(t11, j10))) {
                        continue;
                    }
                    return false;
                case 11:
                    if (u(t10, t11, i10) && fb.h(t10, j10) == fb.h(t11, j10)) {
                        continue;
                    }
                    return false;
                case 12:
                    if (u(t10, t11, i10) && fb.h(t10, j10) == fb.h(t11, j10)) {
                        continue;
                    }
                    return false;
                case 13:
                    if (u(t10, t11, i10) && fb.h(t10, j10) == fb.h(t11, j10)) {
                        continue;
                    }
                    return false;
                case 14:
                    if (u(t10, t11, i10) && fb.i(t10, j10) == fb.i(t11, j10)) {
                        continue;
                    }
                    return false;
                case 15:
                    if (u(t10, t11, i10) && fb.h(t10, j10) == fb.h(t11, j10)) {
                        continue;
                    }
                    return false;
                case 16:
                    if (u(t10, t11, i10) && fb.i(t10, j10) == fb.i(t11, j10)) {
                        continue;
                    }
                    return false;
                case 17:
                    if (u(t10, t11, i10) && ja.h(fb.k(t10, j10), fb.k(t11, j10))) {
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
                    h10 = ja.h(fb.k(t10, j10), fb.k(t11, j10));
                    break;
                case 50:
                    h10 = ja.h(fb.k(t10, j10), fb.k(t11, j10));
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
                    long S = S(i10) & 1048575;
                    if (fb.h(t10, S) == fb.h(t11, S) && ja.h(fb.k(t10, j10), fb.k(t11, j10))) {
                        continue;
                    }
                    return false;
                default:
            }
            if (!h10) {
                return false;
            }
        }
        if (this.f36102l.c(t10).equals(this.f36102l.c(t11))) {
            if (this.f36096f) {
                this.f36103m.a(t10);
                this.f36103m.a(t11);
                throw null;
            }
            return true;
        }
        return false;
    }

    @Override // hi.ha
    public final void h(T t10, byte[] bArr, int i10, int i11, h7 h7Var) throws IOException {
        if (this.f36097g) {
            O(t10, bArr, i10, i11, h7Var);
        } else {
            D(t10, bArr, i10, i11, 0, h7Var);
        }
    }

    @Override // hi.ha
    public final void i(T t10, c8 c8Var) throws IOException {
        if (!this.f36097g) {
            A(t10, c8Var);
        } else if (!this.f36096f) {
            int length = this.f36091a.length;
            for (int i10 = 0; i10 < length; i10 += 3) {
                int k10 = k(i10);
                int i11 = this.f36091a[i10];
                switch (j(k10)) {
                    case 0:
                        if (v(t10, i10)) {
                            c8Var.q(i11, fb.f(t10, k10 & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 1:
                        if (v(t10, i10)) {
                            c8Var.z(i11, fb.g(t10, k10 & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 2:
                        if (v(t10, i10)) {
                            c8Var.E(i11, fb.i(t10, k10 & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        if (v(t10, i10)) {
                            c8Var.j(i11, fb.i(t10, k10 & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 4:
                        if (v(t10, i10)) {
                            c8Var.C(i11, fb.h(t10, k10 & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        if (v(t10, i10)) {
                            c8Var.x(i11, fb.i(t10, k10 & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 6:
                        if (v(t10, i10)) {
                            c8Var.v(i11, fb.h(t10, k10 & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 7:
                        if (v(t10, i10)) {
                            c8Var.m(i11, fb.B(t10, k10 & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 8:
                        if (v(t10, i10)) {
                            C(i11, fb.k(t10, k10 & 1048575), c8Var);
                            break;
                        } else {
                            break;
                        }
                    case 9:
                        if (v(t10, i10)) {
                            c8Var.G(i11, fb.k(t10, k10 & 1048575), n(i10));
                            break;
                        } else {
                            break;
                        }
                    case 10:
                        if (v(t10, i10)) {
                            c8Var.o(i11, (u7) fb.k(t10, k10 & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 11:
                        if (v(t10, i10)) {
                            c8Var.h(i11, fb.h(t10, k10 & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 12:
                        if (v(t10, i10)) {
                            c8Var.t(i11, fb.h(t10, k10 & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 13:
                        if (v(t10, i10)) {
                            c8Var.H(i11, fb.h(t10, k10 & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 14:
                        if (v(t10, i10)) {
                            c8Var.J(i11, fb.i(t10, k10 & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 15:
                        if (v(t10, i10)) {
                            c8Var.a(i11, fb.h(t10, k10 & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 16:
                        if (v(t10, i10)) {
                            c8Var.c(i11, fb.i(t10, k10 & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 17:
                        if (v(t10, i10)) {
                            c8Var.B(i11, fb.k(t10, k10 & 1048575), n(i10));
                            break;
                        } else {
                            break;
                        }
                    case 18:
                        ja.l(this.f36091a[i10], (List) fb.k(t10, k10 & 1048575), c8Var, false);
                        break;
                    case 19:
                        ja.p(this.f36091a[i10], (List) fb.k(t10, k10 & 1048575), c8Var, false);
                        break;
                    case 20:
                        ja.s(this.f36091a[i10], (List) fb.k(t10, k10 & 1048575), c8Var, false);
                        break;
                    case 21:
                        ja.B(this.f36091a[i10], (List) fb.k(t10, k10 & 1048575), c8Var, false);
                        break;
                    case 22:
                        ja.r(this.f36091a[i10], (List) fb.k(t10, k10 & 1048575), c8Var, false);
                        break;
                    case 23:
                        ja.o(this.f36091a[i10], (List) fb.k(t10, k10 & 1048575), c8Var, false);
                        break;
                    case 24:
                        ja.n(this.f36091a[i10], (List) fb.k(t10, k10 & 1048575), c8Var, false);
                        break;
                    case 25:
                        ja.j(this.f36091a[i10], (List) fb.k(t10, k10 & 1048575), c8Var, false);
                        break;
                    case 26:
                        ja.y(this.f36091a[i10], (List) fb.k(t10, k10 & 1048575), c8Var);
                        break;
                    case 27:
                        ja.t(this.f36091a[i10], (List) fb.k(t10, k10 & 1048575), c8Var, n(i10));
                        break;
                    case 28:
                        ja.k(this.f36091a[i10], (List) fb.k(t10, k10 & 1048575), c8Var);
                        break;
                    case 29:
                        ja.z(this.f36091a[i10], (List) fb.k(t10, k10 & 1048575), c8Var, false);
                        break;
                    case 30:
                        ja.m(this.f36091a[i10], (List) fb.k(t10, k10 & 1048575), c8Var, false);
                        break;
                    case 31:
                        ja.u(this.f36091a[i10], (List) fb.k(t10, k10 & 1048575), c8Var, false);
                        break;
                    case 32:
                        ja.v(this.f36091a[i10], (List) fb.k(t10, k10 & 1048575), c8Var, false);
                        break;
                    case 33:
                        ja.w(this.f36091a[i10], (List) fb.k(t10, k10 & 1048575), c8Var, false);
                        break;
                    case 34:
                        ja.x(this.f36091a[i10], (List) fb.k(t10, k10 & 1048575), c8Var, false);
                        break;
                    case 35:
                        ja.l(this.f36091a[i10], (List) fb.k(t10, k10 & 1048575), c8Var, true);
                        break;
                    case 36:
                        ja.p(this.f36091a[i10], (List) fb.k(t10, k10 & 1048575), c8Var, true);
                        break;
                    case 37:
                        ja.s(this.f36091a[i10], (List) fb.k(t10, k10 & 1048575), c8Var, true);
                        break;
                    case 38:
                        ja.B(this.f36091a[i10], (List) fb.k(t10, k10 & 1048575), c8Var, true);
                        break;
                    case 39:
                        ja.r(this.f36091a[i10], (List) fb.k(t10, k10 & 1048575), c8Var, true);
                        break;
                    case 40:
                        ja.o(this.f36091a[i10], (List) fb.k(t10, k10 & 1048575), c8Var, true);
                        break;
                    case 41:
                        ja.n(this.f36091a[i10], (List) fb.k(t10, k10 & 1048575), c8Var, true);
                        break;
                    case 42:
                        ja.j(this.f36091a[i10], (List) fb.k(t10, k10 & 1048575), c8Var, true);
                        break;
                    case 43:
                        ja.z(this.f36091a[i10], (List) fb.k(t10, k10 & 1048575), c8Var, true);
                        break;
                    case 44:
                        ja.m(this.f36091a[i10], (List) fb.k(t10, k10 & 1048575), c8Var, true);
                        break;
                    case 45:
                        ja.u(this.f36091a[i10], (List) fb.k(t10, k10 & 1048575), c8Var, true);
                        break;
                    case 46:
                        ja.v(this.f36091a[i10], (List) fb.k(t10, k10 & 1048575), c8Var, true);
                        break;
                    case 47:
                        ja.w(this.f36091a[i10], (List) fb.k(t10, k10 & 1048575), c8Var, true);
                        break;
                    case 48:
                        ja.x(this.f36091a[i10], (List) fb.k(t10, k10 & 1048575), c8Var, true);
                        break;
                    case 49:
                        ja.q(this.f36091a[i10], (List) fb.k(t10, k10 & 1048575), c8Var, n(i10));
                        break;
                    case 50:
                        B(c8Var, i11, fb.k(t10, k10 & 1048575), i10);
                        break;
                    case 51:
                        if (y(t10, i11, i10)) {
                            c8Var.q(i11, H(t10, k10 & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 52:
                        if (y(t10, i11, i10)) {
                            c8Var.z(i11, I(t10, k10 & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 53:
                        if (y(t10, i11, i10)) {
                            c8Var.E(i11, l(t10, k10 & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 54:
                        if (y(t10, i11, i10)) {
                            c8Var.j(i11, l(t10, k10 & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 55:
                        if (y(t10, i11, i10)) {
                            c8Var.C(i11, L(t10, k10 & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 56:
                        if (y(t10, i11, i10)) {
                            c8Var.x(i11, l(t10, k10 & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 57:
                        if (y(t10, i11, i10)) {
                            c8Var.v(i11, L(t10, k10 & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 58:
                        if (y(t10, i11, i10)) {
                            c8Var.m(i11, z(t10, k10 & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 59:
                        if (y(t10, i11, i10)) {
                            C(i11, fb.k(t10, k10 & 1048575), c8Var);
                            break;
                        } else {
                            break;
                        }
                    case 60:
                        if (y(t10, i11, i10)) {
                            c8Var.G(i11, fb.k(t10, k10 & 1048575), n(i10));
                            break;
                        } else {
                            break;
                        }
                    case 61:
                        if (y(t10, i11, i10)) {
                            c8Var.o(i11, (u7) fb.k(t10, k10 & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 62:
                        if (y(t10, i11, i10)) {
                            c8Var.h(i11, L(t10, k10 & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 63:
                        if (y(t10, i11, i10)) {
                            c8Var.t(i11, L(t10, k10 & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 64:
                        if (y(t10, i11, i10)) {
                            c8Var.H(i11, L(t10, k10 & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 65:
                        if (y(t10, i11, i10)) {
                            c8Var.J(i11, l(t10, k10 & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 66:
                        if (y(t10, i11, i10)) {
                            c8Var.a(i11, L(t10, k10 & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 67:
                        if (y(t10, i11, i10)) {
                            c8Var.c(i11, l(t10, k10 & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 68:
                        if (y(t10, i11, i10)) {
                            c8Var.B(i11, fb.k(t10, k10 & 1048575), n(i10));
                            break;
                        } else {
                            break;
                        }
                }
            }
            va<?, ?> vaVar = this.f36102l;
            vaVar.i(vaVar.c(t10), c8Var);
        } else {
            this.f36103m.a(t10);
            throw null;
        }
    }

    public final int k(int i10) {
        return this.f36091a[i10 + 1];
    }

    public final x8 m(int i10) {
        int i11 = i10 / 3;
        return (x8) this.f36092b[i11 + i11 + 1];
    }

    public final ha n(int i10) {
        int i11 = i10 / 3;
        int i12 = i11 + i11;
        ha haVar = (ha) this.f36092b[i12];
        if (haVar != null) {
            return haVar;
        }
        ha<T> b10 = ea.a().b((Class) this.f36092b[i12 + 1]);
        this.f36092b[i12] = b10;
        return b10;
    }

    public final Object o(int i10) {
        int i11 = i10 / 3;
        return this.f36092b[i11 + i11];
    }

    public final void q(T t10, T t11, int i10) {
        long k10 = k(i10) & 1048575;
        if (v(t11, i10)) {
            Object k11 = fb.k(t10, k10);
            Object k12 = fb.k(t11, k10);
            if (k11 != null && k12 != null) {
                fb.x(t10, k10, b9.g(k11, k12));
                s(t10, i10);
            } else if (k12 != null) {
                fb.x(t10, k10, k12);
                s(t10, i10);
            }
        }
    }

    public final void r(T t10, T t11, int i10) {
        int k10 = k(i10);
        int i11 = this.f36091a[i10];
        long j10 = k10 & 1048575;
        if (y(t11, i11, i10)) {
            Object k11 = y(t10, i11, i10) ? fb.k(t10, j10) : null;
            Object k12 = fb.k(t11, j10);
            if (k11 != null && k12 != null) {
                fb.x(t10, j10, b9.g(k11, k12));
                t(t10, i11, i10);
            } else if (k12 != null) {
                fb.x(t10, j10, k12);
                t(t10, i11, i10);
            }
        }
    }

    public final void s(T t10, int i10) {
        int S = S(i10);
        long j10 = 1048575 & S;
        if (j10 == 1048575) {
            return;
        }
        fb.v(t10, j10, (1 << (S >>> 20)) | fb.h(t10, j10));
    }

    public final void t(T t10, int i10, int i11) {
        fb.v(t10, S(i11) & 1048575, i10);
    }

    public final boolean u(T t10, T t11, int i10) {
        return v(t10, i10) == v(t11, i10);
    }

    public final boolean v(T t10, int i10) {
        int S = S(i10);
        long j10 = S & 1048575;
        if (j10 != 1048575) {
            return (fb.h(t10, j10) & (1 << (S >>> 20))) != 0;
        }
        int k10 = k(i10);
        long j11 = k10 & 1048575;
        switch (j(k10)) {
            case 0:
                return Double.doubleToRawLongBits(fb.f(t10, j11)) != 0;
            case 1:
                return Float.floatToRawIntBits(fb.g(t10, j11)) != 0;
            case 2:
                return fb.i(t10, j11) != 0;
            case 3:
                return fb.i(t10, j11) != 0;
            case 4:
                return fb.h(t10, j11) != 0;
            case 5:
                return fb.i(t10, j11) != 0;
            case 6:
                return fb.h(t10, j11) != 0;
            case 7:
                return fb.B(t10, j11);
            case 8:
                Object k11 = fb.k(t10, j11);
                if (k11 instanceof String) {
                    return !((String) k11).isEmpty();
                } else if (k11 instanceof u7) {
                    return !u7.f36014x.equals(k11);
                } else {
                    throw new IllegalArgumentException();
                }
            case 9:
                return fb.k(t10, j11) != null;
            case 10:
                return !u7.f36014x.equals(fb.k(t10, j11));
            case 11:
                return fb.h(t10, j11) != 0;
            case 12:
                return fb.h(t10, j11) != 0;
            case 13:
                return fb.h(t10, j11) != 0;
            case 14:
                return fb.i(t10, j11) != 0;
            case 15:
                return fb.h(t10, j11) != 0;
            case 16:
                return fb.i(t10, j11) != 0;
            case 17:
                return fb.k(t10, j11) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    public final boolean w(T t10, int i10, int i11, int i12, int i13) {
        if (i11 == 1048575) {
            return v(t10, i10);
        }
        return (i12 & i13) != 0;
    }

    public final boolean y(T t10, int i10, int i11) {
        return fb.h(t10, (long) (S(i11) & 1048575)) == i10;
    }
}
