package com.google.protobuf;

import com.google.protobuf.q0;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes4.dex */
public final class n0 {

    /* renamed from: f  reason: collision with root package name */
    public static final n0 f28182f = new n0(0, new int[0], new Object[0], false);

    /* renamed from: a  reason: collision with root package name */
    public int f28183a;

    /* renamed from: b  reason: collision with root package name */
    public int[] f28184b;

    /* renamed from: c  reason: collision with root package name */
    public Object[] f28185c;

    /* renamed from: d  reason: collision with root package name */
    public int f28186d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f28187e;

    public n0() {
        this(0, new int[8], new Object[8], true);
    }

    public static n0 c() {
        return f28182f;
    }

    public static int f(int[] iArr, int i10) {
        int i11 = 17;
        for (int i12 = 0; i12 < i10; i12++) {
            i11 = (i11 * 31) + iArr[i12];
        }
        return i11;
    }

    public static int g(Object[] objArr, int i10) {
        int i11 = 17;
        for (int i12 = 0; i12 < i10; i12++) {
            i11 = (i11 * 31) + objArr[i12].hashCode();
        }
        return i11;
    }

    public static n0 i(n0 n0Var, n0 n0Var2) {
        int i10 = n0Var.f28183a + n0Var2.f28183a;
        int[] copyOf = Arrays.copyOf(n0Var.f28184b, i10);
        System.arraycopy(n0Var2.f28184b, 0, copyOf, n0Var.f28183a, n0Var2.f28183a);
        Object[] copyOf2 = Arrays.copyOf(n0Var.f28185c, i10);
        System.arraycopy(n0Var2.f28185c, 0, copyOf2, n0Var.f28183a, n0Var2.f28183a);
        return new n0(i10, copyOf, copyOf2, true);
    }

    public static n0 j() {
        return new n0();
    }

    public static boolean k(Object[] objArr, Object[] objArr2, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            if (!objArr[i11].equals(objArr2[i11])) {
                return false;
            }
        }
        return true;
    }

    public static boolean n(int[] iArr, int[] iArr2, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            if (iArr[i11] != iArr2[i11]) {
                return false;
            }
        }
        return true;
    }

    public static void p(int i10, Object obj, q0 q0Var) throws IOException {
        int a10 = p0.a(i10);
        int b10 = p0.b(i10);
        if (b10 == 0) {
            q0Var.x(a10, ((Long) obj).longValue());
        } else if (b10 == 1) {
            q0Var.v(a10, ((Long) obj).longValue());
        } else if (b10 == 2) {
            q0Var.i(a10, (f) obj);
        } else if (b10 != 3) {
            if (b10 == 5) {
                q0Var.c(a10, ((Integer) obj).intValue());
                return;
            }
            throw new RuntimeException(InvalidProtocolBufferException.d());
        } else if (q0Var.w() == q0.a.ASCENDING) {
            q0Var.B(a10);
            ((n0) obj).q(q0Var);
            q0Var.I(a10);
        } else {
            q0Var.I(a10);
            ((n0) obj).q(q0Var);
            q0Var.B(a10);
        }
    }

    public void a() {
        if (!this.f28187e) {
            throw new UnsupportedOperationException();
        }
    }

    public final void b() {
        int i10 = this.f28183a;
        int[] iArr = this.f28184b;
        if (i10 == iArr.length) {
            int i11 = i10 + (i10 < 4 ? 8 : i10 >> 1);
            this.f28184b = Arrays.copyOf(iArr, i11);
            this.f28185c = Arrays.copyOf(this.f28185c, i11);
        }
    }

    public int d() {
        int X;
        int i10 = this.f28186d;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.f28183a; i12++) {
            int i13 = this.f28184b[i12];
            int a10 = p0.a(i13);
            int b10 = p0.b(i13);
            if (b10 == 0) {
                X = CodedOutputStream.X(a10, ((Long) this.f28185c[i12]).longValue());
            } else if (b10 == 1) {
                X = CodedOutputStream.o(a10, ((Long) this.f28185c[i12]).longValue());
            } else if (b10 == 2) {
                X = CodedOutputStream.g(a10, (f) this.f28185c[i12]);
            } else if (b10 == 3) {
                X = (CodedOutputStream.U(a10) * 2) + ((n0) this.f28185c[i12]).d();
            } else if (b10 == 5) {
                X = CodedOutputStream.m(a10, ((Integer) this.f28185c[i12]).intValue());
            } else {
                throw new IllegalStateException(InvalidProtocolBufferException.d());
            }
            i11 += X;
        }
        this.f28186d = i11;
        return i11;
    }

    public int e() {
        int i10 = this.f28186d;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.f28183a; i12++) {
            i11 += CodedOutputStream.I(p0.a(this.f28184b[i12]), (f) this.f28185c[i12]);
        }
        this.f28186d = i11;
        return i11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof n0)) {
            n0 n0Var = (n0) obj;
            int i10 = this.f28183a;
            return i10 == n0Var.f28183a && n(this.f28184b, n0Var.f28184b, i10) && k(this.f28185c, n0Var.f28185c, this.f28183a);
        }
        return false;
    }

    public void h() {
        this.f28187e = false;
    }

    public int hashCode() {
        int i10 = this.f28183a;
        return ((((527 + i10) * 31) + f(this.f28184b, i10)) * 31) + g(this.f28185c, this.f28183a);
    }

    public final void l(StringBuilder sb2, int i10) {
        for (int i11 = 0; i11 < this.f28183a; i11++) {
            e0.c(sb2, i10, String.valueOf(p0.a(this.f28184b[i11])), this.f28185c[i11]);
        }
    }

    public void m(int i10, Object obj) {
        a();
        b();
        int[] iArr = this.f28184b;
        int i11 = this.f28183a;
        iArr[i11] = i10;
        this.f28185c[i11] = obj;
        this.f28183a = i11 + 1;
    }

    public void o(q0 q0Var) throws IOException {
        if (q0Var.w() == q0.a.DESCENDING) {
            for (int i10 = this.f28183a - 1; i10 >= 0; i10--) {
                q0Var.b(p0.a(this.f28184b[i10]), this.f28185c[i10]);
            }
            return;
        }
        for (int i11 = 0; i11 < this.f28183a; i11++) {
            q0Var.b(p0.a(this.f28184b[i11]), this.f28185c[i11]);
        }
    }

    public void q(q0 q0Var) throws IOException {
        if (this.f28183a == 0) {
            return;
        }
        if (q0Var.w() == q0.a.ASCENDING) {
            for (int i10 = 0; i10 < this.f28183a; i10++) {
                p(this.f28184b[i10], this.f28185c[i10], q0Var);
            }
            return;
        }
        for (int i11 = this.f28183a - 1; i11 >= 0; i11--) {
            p(this.f28184b[i11], this.f28185c[i11], q0Var);
        }
    }

    public n0(int i10, int[] iArr, Object[] objArr, boolean z10) {
        this.f28186d = -1;
        this.f28183a = i10;
        this.f28184b = iArr;
        this.f28185c = objArr;
        this.f28187e = z10;
    }
}
