package ae;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.dena.mirrorman.customview.TriangleView;

/* loaded from: classes2.dex */
public class j9 extends i9 {
    public static final ViewDataBinding.i O = null;
    public static final SparseIntArray P;
    public final ConstraintLayout M;
    public long N;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        P = sparseIntArray;
        sparseIntArray.put(nd.z0.f42302jd, 6);
        sparseIntArray.put(nd.z0.f42316m0, 7);
        sparseIntArray.put(nd.z0.L, 8);
        sparseIntArray.put(nd.z0.triangle_bottom_view, 9);
        sparseIntArray.put(nd.z0.triangle_bottom_inner_view, 10);
    }

    public j9(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 11, O, P));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        return false;
    }

    @Override // ae.i9
    public void T(ud.x xVar) {
        this.L = xVar;
        synchronized (this) {
            this.N |= 1;
        }
        c(nd.b.f41908d);
        super.H();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l() {
        long j10;
        String str;
        String str2;
        synchronized (this) {
            j10 = this.N;
            this.N = 0L;
        }
        ud.x xVar = this.L;
        boolean z10 = false;
        int i10 = ((j10 & 3) > 0L ? 1 : ((j10 & 3) == 0L ? 0 : -1));
        String str3 = null;
        if (i10 == 0 || xVar == null) {
            str = null;
            str2 = null;
        } else {
            str3 = xVar.a();
            str = xVar.b();
            str2 = xVar.d();
            z10 = xVar.c();
        }
        if (i10 != 0) {
            x3.e.c(this.D, str3);
            td.c.e(this.E, Boolean.valueOf(z10));
            x3.e.c(this.F, str);
            td.c.e(this.F, Boolean.valueOf(z10));
            td.c.e(this.G, Boolean.valueOf(z10));
            x3.e.c(this.H, str2);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean w() {
        synchronized (this) {
            return this.N != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void y() {
        synchronized (this) {
            this.N = 2L;
        }
        H();
    }

    public j9(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (View) objArr[8], (View) objArr[7], (AppCompatTextView) objArr[1], (View) objArr[3], (AppCompatTextView) objArr[4], (LinearLayout) objArr[5], (AppCompatTextView) objArr[2], (View) objArr[6], (TriangleView) objArr[10], (TriangleView) objArr[9]);
        this.N = -1L;
        this.D.setTag(null);
        this.E.setTag(null);
        this.F.setTag(null);
        this.G.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.M = constraintLayout;
        constraintLayout.setTag(null);
        this.H.setTag(null);
        N(view);
        y();
    }
}
