package ai;

import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes3.dex */
public class fi {

    /* renamed from: a  reason: collision with root package name */
    public final bi f4039a;

    /* renamed from: b  reason: collision with root package name */
    public final int[] f4040b;

    /* renamed from: c  reason: collision with root package name */
    public final oc[] f4041c;

    /* renamed from: d  reason: collision with root package name */
    public int f4042d;

    public fi(bi biVar, int... iArr) {
        Objects.requireNonNull(biVar);
        this.f4039a = biVar;
        this.f4041c = new oc[1];
        for (int i10 = 0; i10 <= 0; i10++) {
            this.f4041c[i10] = biVar.a(iArr[i10]);
        }
        Arrays.sort(this.f4041c, new di(null));
        this.f4040b = new int[1];
        for (int i11 = 0; i11 <= 0; i11++) {
            this.f4040b[i11] = biVar.b(this.f4041c[i11]);
        }
    }

    public final bi a() {
        return this.f4039a;
    }

    public final int b() {
        int length = this.f4040b.length;
        return 1;
    }

    public final oc c(int i10) {
        return this.f4041c[i10];
    }

    public final int d(int i10) {
        return this.f4040b[0];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            fi fiVar = (fi) obj;
            if (this.f4039a == fiVar.f4039a && Arrays.equals(this.f4040b, fiVar.f4040b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.f4042d;
        if (i10 == 0) {
            int identityHashCode = (System.identityHashCode(this.f4039a) * 31) + Arrays.hashCode(this.f4040b);
            this.f4042d = identityHashCode;
            return identityHashCode;
        }
        return i10;
    }
}
