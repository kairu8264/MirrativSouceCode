package ae;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.dena.mirrorman.customview.TriangleView;

/* loaded from: classes2.dex */
public class r8 extends q8 {
    public static final ViewDataBinding.i R = null;
    public static final SparseIntArray S;
    public final ConstraintLayout O;
    public final AppCompatImageView P;
    public long Q;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        S = sparseIntArray;
        sparseIntArray.put(nd.z0.f42302jd, 8);
        sparseIntArray.put(nd.z0.f42316m0, 9);
        sparseIntArray.put(nd.z0.L, 10);
        sparseIntArray.put(nd.z0.f42354v7, 11);
        sparseIntArray.put(nd.z0.triangle_top_view, 12);
        sparseIntArray.put(nd.z0.triangle_top_inner_view, 13);
    }

    public r8(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 14, R, S));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        return false;
    }

    @Override // ae.q8
    public void T(ud.b4 b4Var) {
        this.N = b4Var;
        synchronized (this) {
            this.Q |= 1;
        }
        c(nd.b.f41908d);
        super.H();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l() {
        long j10;
        String str;
        synchronized (this) {
            j10 = this.Q;
            this.Q = 0L;
        }
        ud.b4 b4Var = this.N;
        boolean z10 = false;
        int i10 = ((j10 & 3) > 0L ? 1 : ((j10 & 3) == 0L ? 0 : -1));
        String str2 = null;
        if (i10 == 0 || b4Var == null) {
            str = null;
        } else {
            str2 = b4Var.a();
            z10 = b4Var.b();
            str = b4Var.c();
        }
        if (i10 != 0) {
            td.c.e(this.D, Boolean.valueOf(z10));
            td.c.e(this.E, Boolean.valueOf(z10));
            x3.e.c(this.F, str2);
            td.c.e(this.G, Boolean.valueOf(z10));
            td.c.e(this.H, Boolean.valueOf(z10));
            td.c.e(this.P, Boolean.valueOf(z10));
            x3.e.c(this.J, str);
            td.c.e(this.J, Boolean.valueOf(z10));
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean w() {
        synchronized (this) {
            return this.Q != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void y() {
        synchronized (this) {
            this.Q = 2L;
        }
        H();
    }

    public r8(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (View) objArr[10], (View) objArr[9], (AppCompatTextView) objArr[1], (View) objArr[5], (AppCompatTextView) objArr[6], (AppCompatTextView) objArr[3], (AppCompatTextView) objArr[4], (LinearLayout) objArr[11], (AppCompatTextView) objArr[2], (View) objArr[8], (TriangleView) objArr[13], (TriangleView) objArr[12]);
        this.Q = -1L;
        this.D.setTag(null);
        this.E.setTag(null);
        this.F.setTag(null);
        this.G.setTag(null);
        this.H.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.O = constraintLayout;
        constraintLayout.setTag(null);
        AppCompatImageView appCompatImageView = (AppCompatImageView) objArr[7];
        this.P = appCompatImageView;
        appCompatImageView.setTag(null);
        this.J.setTag(null);
        N(view);
        y();
    }
}
