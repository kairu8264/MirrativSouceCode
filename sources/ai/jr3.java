package ai;

import android.content.Context;
import android.graphics.Point;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class jr3 extends x24 {

    /* renamed from: j  reason: collision with root package name */
    public boolean f5897j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f5898k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f5899l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f5900m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f5901n;

    /* renamed from: o  reason: collision with root package name */
    public final SparseArray<Map<uz3, lr3>> f5902o;

    /* renamed from: p  reason: collision with root package name */
    public final SparseBooleanArray f5903p;

    @Deprecated
    public jr3() {
        this.f5902o = new SparseArray<>();
        this.f5903p = new SparseBooleanArray();
        t();
    }

    @Override // ai.x24
    public final /* bridge */ /* synthetic */ x24 j(int i10, int i11, boolean z10) {
        super.j(i10, i11, true);
        return this;
    }

    public final jr3 s(int i10, boolean z10) {
        if (this.f5903p.get(i10) == z10) {
            return this;
        }
        if (z10) {
            this.f5903p.put(i10, true);
        } else {
            this.f5903p.delete(i10);
        }
        return this;
    }

    public final void t() {
        this.f5897j = true;
        this.f5898k = true;
        this.f5899l = true;
        this.f5900m = true;
        this.f5901n = true;
    }

    public jr3(Context context) {
        super.k(context);
        Point B = sb.B(context);
        j(B.x, B.y, true);
        this.f5902o = new SparseArray<>();
        this.f5903p = new SparseBooleanArray();
        t();
    }

    public /* synthetic */ jr3(ir3 ir3Var, fr3 fr3Var) {
        super(ir3Var);
        this.f5897j = ir3Var.B;
        this.f5898k = ir3Var.D;
        this.f5899l = ir3Var.E;
        this.f5900m = ir3Var.I;
        this.f5901n = ir3Var.K;
        SparseArray a10 = ir3.a(ir3Var);
        SparseArray<Map<uz3, lr3>> sparseArray = new SparseArray<>();
        for (int i10 = 0; i10 < a10.size(); i10++) {
            sparseArray.put(a10.keyAt(i10), new HashMap((Map) a10.valueAt(i10)));
        }
        this.f5902o = sparseArray;
        this.f5903p = ir3.b(ir3Var).clone();
    }
}
