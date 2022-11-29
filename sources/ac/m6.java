package ac;

import android.util.SparseIntArray;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes2.dex */
public class m6 extends l6 {
    public static final ViewDataBinding.i P = null;
    public static final SparseIntArray Q;
    public final ConstraintLayout N;
    public long O;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        Q = sparseIntArray;
        sparseIntArray.put(xb.o.f59970a4, 8);
        sparseIntArray.put(xb.o.f59976c4, 9);
        sparseIntArray.put(xb.o.f59973b4, 10);
        sparseIntArray.put(xb.o.Z3, 11);
    }

    public m6(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 12, P, Q));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        return false;
    }

    @Override // ac.l6
    public void T(ud.e1 e1Var) {
        this.M = e1Var;
        synchronized (this) {
            this.O |= 1;
        }
        c(xb.b.f59841d);
        super.H();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l() {
        long j10;
        String str;
        String str2;
        String str3;
        String str4;
        int i10;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        String str5;
        synchronized (this) {
            j10 = this.O;
            this.O = 0L;
        }
        ud.e1 e1Var = this.M;
        int i11 = ((j10 & 3) > 0L ? 1 : ((j10 & 3) == 0L ? 0 : -1));
        if (i11 == 0 || e1Var == null) {
            str = null;
            str2 = null;
            str3 = null;
            str4 = null;
            i10 = 0;
            z10 = false;
            z11 = false;
            z12 = false;
            z13 = false;
            z14 = false;
            z15 = false;
            z16 = false;
            str5 = null;
        } else {
            str5 = e1Var.b();
            str = e1Var.e();
            i10 = e1Var.c();
            str3 = e1Var.a();
            z10 = e1Var.n();
            z11 = e1Var.l();
            str4 = e1Var.d();
            z12 = e1Var.h();
            z13 = e1Var.j();
            z14 = e1Var.m();
            z15 = e1Var.k();
            z16 = e1Var.i();
            str2 = e1Var.f();
        }
        if (i11 != 0) {
            td.a.f(this.F, str5);
            td.c.e(this.F, Boolean.valueOf(z16));
            td.a.f(this.G, str3);
            td.c.e(this.G, Boolean.valueOf(z12));
            td.a.i(this.H, str4);
            td.c.e(this.H, Boolean.valueOf(z11));
            x3.e.c(this.I, str);
            td.c.e(this.I, Boolean.valueOf(z14));
            td.c.e(this.J, Boolean.valueOf(z15));
            td.b.d(this.J, Integer.valueOf(i10), null);
            td.c.e(this.K, Boolean.valueOf(z13));
            x3.e.c(this.L, str2);
            td.c.e(this.L, Boolean.valueOf(z10));
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean w() {
        synchronized (this) {
            return this.O != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void y() {
        synchronized (this) {
            this.O = 2L;
        }
        H();
    }

    public m6(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (Guideline) objArr[11], (Guideline) objArr[8], (Guideline) objArr[10], (Guideline) objArr[9], (AppCompatImageView) objArr[3], (AppCompatImageView) objArr[4], (AppCompatImageView) objArr[2], (AppCompatTextView) objArr[5], (AppCompatTextView) objArr[7], (AppCompatImageView) objArr[6], (AppCompatTextView) objArr[1]);
        this.O = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.N = constraintLayout;
        constraintLayout.setTag(null);
        this.F.setTag(null);
        this.G.setTag(null);
        this.H.setTag(null);
        this.I.setTag(null);
        this.J.setTag(null);
        this.K.setTag(null);
        this.L.setTag(null);
        N(view);
        y();
    }
}
