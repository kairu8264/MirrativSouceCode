package ai;

import com.google.android.gms.internal.ads.zzggm;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class el3 {

    /* renamed from: f  reason: collision with root package name */
    public static final el3 f3717f = new el3(0, new int[0], new Object[0], false);

    /* renamed from: a  reason: collision with root package name */
    public int f3718a;

    /* renamed from: b  reason: collision with root package name */
    public int[] f3719b;

    /* renamed from: c  reason: collision with root package name */
    public Object[] f3720c;

    /* renamed from: d  reason: collision with root package name */
    public int f3721d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f3722e;

    public el3() {
        this(0, new int[8], new Object[8], true);
    }

    public el3(int i10, int[] iArr, Object[] objArr, boolean z10) {
        this.f3721d = -1;
        this.f3718a = i10;
        this.f3719b = iArr;
        this.f3720c = objArr;
        this.f3722e = z10;
    }

    public static el3 a() {
        return f3717f;
    }

    public static el3 b() {
        return new el3(0, new int[8], new Object[8], true);
    }

    public static el3 c(el3 el3Var, el3 el3Var2) {
        int i10 = el3Var.f3718a + el3Var2.f3718a;
        int[] copyOf = Arrays.copyOf(el3Var.f3719b, i10);
        System.arraycopy(el3Var2.f3719b, 0, copyOf, el3Var.f3718a, el3Var2.f3718a);
        Object[] copyOf2 = Arrays.copyOf(el3Var.f3720c, i10);
        System.arraycopy(el3Var2.f3720c, 0, copyOf2, el3Var.f3718a, el3Var2.f3718a);
        return new el3(i10, copyOf, copyOf2, true);
    }

    public final void d() {
        this.f3722e = false;
    }

    public final int e() {
        int i10 = this.f3721d;
        if (i10 == -1) {
            int i11 = 0;
            for (int i12 = 0; i12 < this.f3718a; i12++) {
                int i13 = this.f3719b[i12];
                int B = yh3.B(8);
                int p10 = ((oh3) this.f3720c[i12]).p();
                i11 += B + B + yh3.B(16) + yh3.B(i13 >>> 3) + yh3.B(24) + yh3.B(p10) + p10;
            }
            this.f3721d = i11;
            return i11;
        }
        return i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof el3)) {
            el3 el3Var = (el3) obj;
            int i10 = this.f3718a;
            if (i10 == el3Var.f3718a) {
                int[] iArr = this.f3719b;
                int[] iArr2 = el3Var.f3719b;
                int i11 = 0;
                while (true) {
                    if (i11 >= i10) {
                        Object[] objArr = this.f3720c;
                        Object[] objArr2 = el3Var.f3720c;
                        int i12 = this.f3718a;
                        for (int i13 = 0; i13 < i12; i13++) {
                            if (objArr[i13].equals(objArr2[i13])) {
                            }
                        }
                        return true;
                    } else if (iArr[i11] != iArr2[i11]) {
                        break;
                    } else {
                        i11++;
                    }
                }
            }
            return false;
        }
        return false;
    }

    public final int f() {
        int B;
        int C;
        int i10;
        int i11 = this.f3721d;
        if (i11 == -1) {
            int i12 = 0;
            for (int i13 = 0; i13 < this.f3718a; i13++) {
                int i14 = this.f3719b[i13];
                int i15 = i14 >>> 3;
                int i16 = i14 & 7;
                if (i16 != 0) {
                    if (i16 == 1) {
                        ((Long) this.f3720c[i13]).longValue();
                        i10 = yh3.B(i15 << 3) + 8;
                    } else if (i16 == 2) {
                        int B2 = yh3.B(i15 << 3);
                        int p10 = ((oh3) this.f3720c[i13]).p();
                        i12 += B2 + yh3.B(p10) + p10;
                    } else if (i16 == 3) {
                        int z10 = yh3.z(i15);
                        B = z10 + z10;
                        C = ((el3) this.f3720c[i13]).f();
                    } else if (i16 == 5) {
                        ((Integer) this.f3720c[i13]).intValue();
                        i10 = yh3.B(i15 << 3) + 4;
                    } else {
                        throw new IllegalStateException(zzggm.i());
                    }
                    i12 += i10;
                } else {
                    long longValue = ((Long) this.f3720c[i13]).longValue();
                    B = yh3.B(i15 << 3);
                    C = yh3.C(longValue);
                }
                i10 = B + C;
                i12 += i10;
            }
            this.f3721d = i12;
            return i12;
        }
        return i11;
    }

    public final void g(StringBuilder sb2, int i10) {
        for (int i11 = 0; i11 < this.f3718a; i11++) {
            zj3.b(sb2, i10, String.valueOf(this.f3719b[i11] >>> 3), this.f3720c[i11]);
        }
    }

    public final void h(int i10, Object obj) {
        if (this.f3722e) {
            int i11 = this.f3718a;
            int[] iArr = this.f3719b;
            if (i11 == iArr.length) {
                int i12 = i11 + (i11 < 4 ? 8 : i11 >> 1);
                this.f3719b = Arrays.copyOf(iArr, i12);
                this.f3720c = Arrays.copyOf(this.f3720c, i12);
            }
            int[] iArr2 = this.f3719b;
            int i13 = this.f3718a;
            iArr2[i13] = i10;
            this.f3720c[i13] = obj;
            this.f3718a = i13 + 1;
            return;
        }
        throw new UnsupportedOperationException();
    }

    public final int hashCode() {
        int i10 = this.f3718a;
        int i11 = (i10 + 527) * 31;
        int[] iArr = this.f3719b;
        int i12 = 17;
        int i13 = 17;
        for (int i14 = 0; i14 < i10; i14++) {
            i13 = (i13 * 31) + iArr[i14];
        }
        int i15 = (i11 + i13) * 31;
        Object[] objArr = this.f3720c;
        int i16 = this.f3718a;
        for (int i17 = 0; i17 < i16; i17++) {
            i12 = (i12 * 31) + objArr[i17].hashCode();
        }
        return i15 + i12;
    }

    public final void i(zh3 zh3Var) throws IOException {
        if (this.f3718a != 0) {
            for (int i10 = 0; i10 < this.f3718a; i10++) {
                int i11 = this.f3719b[i10];
                Object obj = this.f3720c[i10];
                int i12 = i11 >>> 3;
                int i13 = i11 & 7;
                if (i13 == 0) {
                    zh3Var.n(i12, ((Long) obj).longValue());
                } else if (i13 == 1) {
                    zh3Var.u(i12, ((Long) obj).longValue());
                } else if (i13 == 2) {
                    zh3Var.y(i12, (oh3) obj);
                } else if (i13 == 3) {
                    zh3Var.E(i12);
                    ((el3) obj).i(zh3Var);
                    zh3Var.F(i12);
                } else if (i13 == 5) {
                    zh3Var.v(i12, ((Integer) obj).intValue());
                } else {
                    throw new RuntimeException(zzggm.i());
                }
            }
        }
    }
}
