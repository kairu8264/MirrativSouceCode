package ai;

import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes3.dex */
public class br3 {

    /* renamed from: a  reason: collision with root package name */
    public final sx3 f2449a;

    /* renamed from: b  reason: collision with root package name */
    public final int f2450b;

    /* renamed from: c  reason: collision with root package name */
    public final int[] f2451c;

    /* renamed from: d  reason: collision with root package name */
    public final v4[] f2452d;

    /* renamed from: e  reason: collision with root package name */
    public int f2453e;

    public br3(sx3 sx3Var, int[] iArr, int i10) {
        int length = iArr.length;
        u9.d(length > 0);
        Objects.requireNonNull(sx3Var);
        this.f2449a = sx3Var;
        this.f2450b = length;
        this.f2452d = new v4[length];
        for (int i11 = 0; i11 < iArr.length; i11++) {
            this.f2452d[i11] = sx3Var.a(iArr[i11]);
        }
        Arrays.sort(this.f2452d, ar3.f1982w);
        this.f2451c = new int[this.f2450b];
        for (int i12 = 0; i12 < this.f2450b; i12++) {
            this.f2451c[i12] = sx3Var.b(this.f2452d[i12]);
        }
    }

    public final sx3 a() {
        return this.f2449a;
    }

    public final int b() {
        return this.f2451c.length;
    }

    public final v4 c(int i10) {
        return this.f2452d[i10];
    }

    public final int d(int i10) {
        return this.f2451c[0];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            br3 br3Var = (br3) obj;
            if (this.f2449a == br3Var.f2449a && Arrays.equals(this.f2451c, br3Var.f2451c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.f2453e;
        if (i10 == 0) {
            int identityHashCode = (System.identityHashCode(this.f2449a) * 31) + Arrays.hashCode(this.f2451c);
            this.f2453e = identityHashCode;
            return identityHashCode;
        }
        return i10;
    }
}
