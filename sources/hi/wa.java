package hi;

import com.google.android.gms.internal.measurement.zzkh;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class wa {

    /* renamed from: f  reason: collision with root package name */
    public static final wa f36045f = new wa(0, new int[0], new Object[0], false);

    /* renamed from: a  reason: collision with root package name */
    public int f36046a;

    /* renamed from: b  reason: collision with root package name */
    public int[] f36047b;

    /* renamed from: c  reason: collision with root package name */
    public Object[] f36048c;

    /* renamed from: d  reason: collision with root package name */
    public int f36049d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f36050e;

    public wa() {
        this(0, new int[8], new Object[8], true);
    }

    public wa(int i10, int[] iArr, Object[] objArr, boolean z10) {
        this.f36049d = -1;
        this.f36046a = i10;
        this.f36047b = iArr;
        this.f36048c = objArr;
        this.f36050e = z10;
    }

    public static wa c() {
        return f36045f;
    }

    public static wa d(wa waVar, wa waVar2) {
        int i10 = waVar.f36046a + waVar2.f36046a;
        int[] copyOf = Arrays.copyOf(waVar.f36047b, i10);
        System.arraycopy(waVar2.f36047b, 0, copyOf, waVar.f36046a, waVar2.f36046a);
        Object[] copyOf2 = Arrays.copyOf(waVar.f36048c, i10);
        System.arraycopy(waVar2.f36048c, 0, copyOf2, waVar.f36046a, waVar2.f36046a);
        return new wa(i10, copyOf, copyOf2, true);
    }

    public static wa e() {
        return new wa(0, new int[8], new Object[8], true);
    }

    public final int a() {
        int a10;
        int b10;
        int i10;
        int i11 = this.f36049d;
        if (i11 == -1) {
            int i12 = 0;
            for (int i13 = 0; i13 < this.f36046a; i13++) {
                int i14 = this.f36047b[i13];
                int i15 = i14 >>> 3;
                int i16 = i14 & 7;
                if (i16 != 0) {
                    if (i16 == 1) {
                        ((Long) this.f36048c[i13]).longValue();
                        i10 = b8.a(i15 << 3) + 8;
                    } else if (i16 == 2) {
                        int a11 = b8.a(i15 << 3);
                        int g10 = ((u7) this.f36048c[i13]).g();
                        i12 += a11 + b8.a(g10) + g10;
                    } else if (i16 == 3) {
                        int D = b8.D(i15);
                        a10 = D + D;
                        b10 = ((wa) this.f36048c[i13]).a();
                    } else if (i16 == 5) {
                        ((Integer) this.f36048c[i13]).intValue();
                        i10 = b8.a(i15 << 3) + 4;
                    } else {
                        throw new IllegalStateException(zzkh.a());
                    }
                    i12 += i10;
                } else {
                    long longValue = ((Long) this.f36048c[i13]).longValue();
                    a10 = b8.a(i15 << 3);
                    b10 = b8.b(longValue);
                }
                i10 = a10 + b10;
                i12 += i10;
            }
            this.f36049d = i12;
            return i12;
        }
        return i11;
    }

    public final int b() {
        int i10 = this.f36049d;
        if (i10 == -1) {
            int i11 = 0;
            for (int i12 = 0; i12 < this.f36046a; i12++) {
                int i13 = this.f36047b[i12];
                int a10 = b8.a(8);
                int g10 = ((u7) this.f36048c[i12]).g();
                i11 += a10 + a10 + b8.a(16) + b8.a(i13 >>> 3) + b8.a(24) + b8.a(g10) + g10;
            }
            this.f36049d = i11;
            return i11;
        }
        return i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof wa)) {
            wa waVar = (wa) obj;
            int i10 = this.f36046a;
            if (i10 == waVar.f36046a) {
                int[] iArr = this.f36047b;
                int[] iArr2 = waVar.f36047b;
                int i11 = 0;
                while (true) {
                    if (i11 >= i10) {
                        Object[] objArr = this.f36048c;
                        Object[] objArr2 = waVar.f36048c;
                        int i12 = this.f36046a;
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

    public final void f() {
        this.f36050e = false;
    }

    public final void g(StringBuilder sb2, int i10) {
        for (int i11 = 0; i11 < this.f36046a; i11++) {
            y9.b(sb2, i10, String.valueOf(this.f36047b[i11] >>> 3), this.f36048c[i11]);
        }
    }

    public final void h(int i10, Object obj) {
        if (this.f36050e) {
            int i11 = this.f36046a;
            int[] iArr = this.f36047b;
            if (i11 == iArr.length) {
                int i12 = i11 + (i11 < 4 ? 8 : i11 >> 1);
                this.f36047b = Arrays.copyOf(iArr, i12);
                this.f36048c = Arrays.copyOf(this.f36048c, i12);
            }
            int[] iArr2 = this.f36047b;
            int i13 = this.f36046a;
            iArr2[i13] = i10;
            this.f36048c[i13] = obj;
            this.f36046a = i13 + 1;
            return;
        }
        throw new UnsupportedOperationException();
    }

    public final int hashCode() {
        int i10 = this.f36046a;
        int i11 = (i10 + 527) * 31;
        int[] iArr = this.f36047b;
        int i12 = 17;
        int i13 = 17;
        for (int i14 = 0; i14 < i10; i14++) {
            i13 = (i13 * 31) + iArr[i14];
        }
        int i15 = (i11 + i13) * 31;
        Object[] objArr = this.f36048c;
        int i16 = this.f36046a;
        for (int i17 = 0; i17 < i16; i17++) {
            i12 = (i12 * 31) + objArr[i17].hashCode();
        }
        return i15 + i12;
    }

    public final void i(c8 c8Var) throws IOException {
        if (this.f36046a != 0) {
            for (int i10 = 0; i10 < this.f36046a; i10++) {
                int i11 = this.f36047b[i10];
                Object obj = this.f36048c[i10];
                int i12 = i11 >>> 3;
                int i13 = i11 & 7;
                if (i13 == 0) {
                    c8Var.E(i12, ((Long) obj).longValue());
                } else if (i13 == 1) {
                    c8Var.x(i12, ((Long) obj).longValue());
                } else if (i13 == 2) {
                    c8Var.o(i12, (u7) obj);
                } else if (i13 == 3) {
                    c8Var.e(i12);
                    ((wa) obj).i(c8Var);
                    c8Var.s(i12);
                } else if (i13 == 5) {
                    c8Var.v(i12, ((Integer) obj).intValue());
                } else {
                    throw new RuntimeException(zzkh.a());
                }
            }
        }
    }
}
