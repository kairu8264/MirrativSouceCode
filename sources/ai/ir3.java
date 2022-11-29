package ai;

import android.content.Context;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.Map;

/* loaded from: classes3.dex */
public final class ir3 extends t34 {
    public static final ir3 N;
    @Deprecated
    public static final ir3 O;
    public static final x2<ir3> P;
    public final int A;
    public final boolean B;
    public final boolean C;
    public final boolean D;
    public final boolean E;
    public final boolean F;
    public final boolean G;
    public final boolean H;
    public final boolean I;
    public final boolean J;
    public final boolean K;
    public final SparseArray<Map<uz3, lr3>> L;
    public final SparseBooleanArray M;

    static {
        ir3 ir3Var = new ir3(new jr3());
        N = ir3Var;
        O = ir3Var;
        P = hr3.f4951a;
    }

    public ir3(jr3 jr3Var) {
        super(jr3Var);
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        SparseArray<Map<uz3, lr3>> sparseArray;
        SparseBooleanArray sparseBooleanArray;
        z10 = jr3Var.f5897j;
        this.B = z10;
        this.C = false;
        z11 = jr3Var.f5898k;
        this.D = z11;
        z12 = jr3Var.f5899l;
        this.E = z12;
        this.F = false;
        this.G = false;
        this.H = false;
        this.A = 0;
        z13 = jr3Var.f5900m;
        this.I = z13;
        this.J = false;
        z14 = jr3Var.f5901n;
        this.K = z14;
        sparseArray = jr3Var.f5902o;
        this.L = sparseArray;
        sparseBooleanArray = jr3Var.f5903p;
        this.M = sparseBooleanArray;
    }

    public static ir3 c(Context context) {
        return new ir3(new jr3(context));
    }

    public final boolean d(int i10) {
        return this.M.get(i10);
    }

    public final boolean e(int i10, uz3 uz3Var) {
        Map<uz3, lr3> map = this.L.get(i10);
        return map != null && map.containsKey(uz3Var);
    }

    @Override // ai.t34
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ir3.class == obj.getClass()) {
            ir3 ir3Var = (ir3) obj;
            if (super.equals(ir3Var) && this.B == ir3Var.B && this.D == ir3Var.D && this.E == ir3Var.E && this.I == ir3Var.I && this.K == ir3Var.K) {
                SparseBooleanArray sparseBooleanArray = this.M;
                SparseBooleanArray sparseBooleanArray2 = ir3Var.M;
                int size = sparseBooleanArray.size();
                if (sparseBooleanArray2.size() == size) {
                    int i10 = 0;
                    while (true) {
                        if (i10 < size) {
                            if (sparseBooleanArray2.indexOfKey(sparseBooleanArray.keyAt(i10)) < 0) {
                                break;
                            }
                            i10++;
                        } else {
                            SparseArray<Map<uz3, lr3>> sparseArray = this.L;
                            SparseArray<Map<uz3, lr3>> sparseArray2 = ir3Var.L;
                            int size2 = sparseArray.size();
                            if (sparseArray2.size() == size2) {
                                for (int i11 = 0; i11 < size2; i11++) {
                                    int indexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i11));
                                    if (indexOfKey >= 0) {
                                        Map<uz3, lr3> valueAt = sparseArray.valueAt(i11);
                                        Map<uz3, lr3> valueAt2 = sparseArray2.valueAt(indexOfKey);
                                        if (valueAt2.size() == valueAt.size()) {
                                            for (Map.Entry<uz3, lr3> entry : valueAt.entrySet()) {
                                                uz3 key = entry.getKey();
                                                if (valueAt2.containsKey(key)) {
                                                    if (!sb.H(entry.getValue(), valueAt2.get(key))) {
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final lr3 f(int i10, uz3 uz3Var) {
        Map<uz3, lr3> map = this.L.get(i10);
        if (map != null) {
            return map.get(uz3Var);
        }
        return null;
    }

    public final jr3 g() {
        return new jr3(this, null);
    }

    @Override // ai.t34
    public final int hashCode() {
        return ((((((((((super.hashCode() + 31) * 31) + (this.B ? 1 : 0)) * 961) + (this.D ? 1 : 0)) * 31) + (this.E ? 1 : 0)) * 28629151) + (this.I ? 1 : 0)) * 961) + (this.K ? 1 : 0);
    }
}
