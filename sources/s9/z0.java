package s9;

import android.util.SparseIntArray;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes.dex */
public class z0 extends y0 {
    public static final ViewDataBinding.i Q = null;
    public static final SparseIntArray R;
    public final View O;
    public long P;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        R = sparseIntArray;
        sparseIntArray.put(q9.g.I2, 9);
        sparseIntArray.put(q9.g.G2, 10);
        sparseIntArray.put(q9.g.F2, 11);
        sparseIntArray.put(q9.g.rank_profile_point_image_view, 12);
    }

    public z0(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 13, Q, R));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        return false;
    }

    @Override // s9.y0
    public void T(z9.c0 c0Var) {
        this.N = c0Var;
        synchronized (this) {
            this.P |= 1;
        }
        c(q9.a.f48787b);
        super.H();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l() {
        long j10;
        boolean z10;
        int i10;
        boolean z11;
        boolean z12;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        float f10;
        int i11;
        synchronized (this) {
            j10 = this.P;
            this.P = 0L;
        }
        z9.c0 c0Var = this.N;
        int i12 = ((j10 & 3) > 0L ? 1 : ((j10 & 3) == 0L ? 0 : -1));
        boolean z13 = false;
        String str6 = null;
        if (i12 == 0 || c0Var == null) {
            z10 = false;
            i10 = 0;
            z11 = false;
            z12 = false;
            str = null;
            str2 = null;
            str3 = null;
            str4 = null;
            str5 = null;
            f10 = 0.0f;
            i11 = 0;
        } else {
            str6 = c0Var.d();
            String f11 = c0Var.f();
            str = c0Var.a();
            i11 = c0Var.c();
            float i13 = c0Var.i();
            str3 = c0Var.g();
            i10 = c0Var.j();
            str4 = c0Var.e();
            z11 = c0Var.l();
            boolean m10 = c0Var.m();
            z12 = c0Var.n();
            str5 = c0Var.h();
            z10 = c0Var.o();
            str2 = f11;
            z13 = m10;
            f10 = i13;
        }
        if (i12 != 0) {
            td.c.e(this.O, Boolean.valueOf(z13));
            td.a.f(this.B, str6);
            td.c.e(this.B, Boolean.valueOf(z10));
            td.a.f(this.C, str);
            td.c.e(this.C, Boolean.valueOf(z11));
            td.a.i(this.E, str4);
            td.c.e(this.G, Boolean.valueOf(z12));
            x3.e.c(this.I, str2);
            x3.e.c(this.K, str3);
            this.K.setTextColor(i11);
            x3.e.c(this.M, str5);
            this.M.setTextColor(i10);
            x3.e.d(this.M, f10);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean w() {
        synchronized (this) {
            return this.P != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void y() {
        synchronized (this) {
            this.P = 2L;
        }
        H();
    }

    public z0(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (AppCompatImageView) objArr[3], (AppCompatImageView) objArr[5], (ConstraintLayout) objArr[0], (AppCompatImageView) objArr[2], (ConstraintLayout) objArr[11], (ConstraintLayout) objArr[4], (AppCompatImageView) objArr[10], (AppCompatTextView) objArr[6], (AppCompatImageView) objArr[12], (AppCompatTextView) objArr[7], (ConstraintLayout) objArr[9], (AppCompatTextView) objArr[1]);
        this.P = -1L;
        View view2 = (View) objArr[8];
        this.O = view2;
        view2.setTag(null);
        this.B.setTag(null);
        this.C.setTag(null);
        this.D.setTag(null);
        this.E.setTag(null);
        this.G.setTag(null);
        this.I.setTag(null);
        this.K.setTag(null);
        this.M.setTag(null);
        N(view);
        y();
    }
}
