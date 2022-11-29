package ai;

import java.util.Arrays;

/* loaded from: classes3.dex */
public final class bi {

    /* renamed from: a  reason: collision with root package name */
    public final int f2352a = 1;

    /* renamed from: b  reason: collision with root package name */
    public final oc[] f2353b;

    /* renamed from: c  reason: collision with root package name */
    public int f2354c;

    public bi(oc... ocVarArr) {
        this.f2353b = ocVarArr;
    }

    public final oc a(int i10) {
        return this.f2353b[i10];
    }

    public final int b(oc ocVar) {
        for (int i10 = 0; i10 <= 0; i10++) {
            if (ocVar == this.f2353b[i10]) {
                return i10;
            }
        }
        return -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && bi.class == obj.getClass() && Arrays.equals(this.f2353b, ((bi) obj).f2353b);
    }

    public final int hashCode() {
        int i10 = this.f2354c;
        if (i10 == 0) {
            int hashCode = Arrays.hashCode(this.f2353b) + 527;
            this.f2354c = hashCode;
            return hashCode;
        }
        return i10;
    }
}
