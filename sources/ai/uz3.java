package ai;

import java.util.Arrays;

/* loaded from: classes3.dex */
public final class uz3 {

    /* renamed from: d  reason: collision with root package name */
    public static final uz3 f10891d = new uz3(new sx3[0]);

    /* renamed from: e  reason: collision with root package name */
    public static final x2<uz3> f10892e = ty3.f10507a;

    /* renamed from: a  reason: collision with root package name */
    public final int f10893a;

    /* renamed from: b  reason: collision with root package name */
    public final sx3[] f10894b;

    /* renamed from: c  reason: collision with root package name */
    public int f10895c;

    public uz3(sx3... sx3VarArr) {
        this.f10894b = sx3VarArr;
        this.f10893a = sx3VarArr.length;
    }

    public final sx3 a(int i10) {
        return this.f10894b[i10];
    }

    public final int b(sx3 sx3Var) {
        for (int i10 = 0; i10 < this.f10893a; i10++) {
            if (this.f10894b[i10] == sx3Var) {
                return i10;
            }
        }
        return -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && uz3.class == obj.getClass()) {
            uz3 uz3Var = (uz3) obj;
            if (this.f10893a == uz3Var.f10893a && Arrays.equals(this.f10894b, uz3Var.f10894b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.f10895c;
        if (i10 == 0) {
            int hashCode = Arrays.hashCode(this.f10894b);
            this.f10895c = hashCode;
            return hashCode;
        }
        return i10;
    }
}
