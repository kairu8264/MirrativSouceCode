package ai;

import java.util.Arrays;

/* loaded from: classes3.dex */
public final class ci {

    /* renamed from: d  reason: collision with root package name */
    public static final ci f2834d = new ci(new bi[0]);

    /* renamed from: a  reason: collision with root package name */
    public final int f2835a;

    /* renamed from: b  reason: collision with root package name */
    public final bi[] f2836b;

    /* renamed from: c  reason: collision with root package name */
    public int f2837c;

    public ci(bi... biVarArr) {
        this.f2836b = biVarArr;
        this.f2835a = biVarArr.length;
    }

    public final bi a(int i10) {
        return this.f2836b[i10];
    }

    public final int b(bi biVar) {
        for (int i10 = 0; i10 < this.f2835a; i10++) {
            if (this.f2836b[i10] == biVar) {
                return i10;
            }
        }
        return -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ci.class == obj.getClass()) {
            ci ciVar = (ci) obj;
            if (this.f2835a == ciVar.f2835a && Arrays.equals(this.f2836b, ciVar.f2836b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.f2837c;
        if (i10 == 0) {
            int hashCode = Arrays.hashCode(this.f2836b);
            this.f2837c = hashCode;
            return hashCode;
        }
        return i10;
    }
}
