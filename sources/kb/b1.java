package kb;

import android.util.SparseIntArray;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.dena.mirrorman.customview.YellRankIconView;
import hb.w1;
import ud.d2;

/* loaded from: classes2.dex */
public class b1 extends a1 {
    public static final ViewDataBinding.i K = null;
    public static final SparseIntArray L;
    public final ConstraintLayout I;
    public long J;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        L = sparseIntArray;
        sparseIntArray.put(w1.P3, 6);
    }

    public b1(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 7, K, L));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        return false;
    }

    @Override // kb.a1
    public void T(d2 d2Var) {
        this.H = d2Var;
        synchronized (this) {
            this.J |= 1;
        }
        c(hb.a.f34700b);
        super.H();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l() {
        long j10;
        String str;
        String str2;
        String str3;
        String str4;
        boolean z10;
        synchronized (this) {
            j10 = this.J;
            this.J = 0L;
        }
        d2 d2Var = this.H;
        int i10 = ((j10 & 3) > 0L ? 1 : ((j10 & 3) == 0L ? 0 : -1));
        int i11 = 0;
        if (i10 == 0 || d2Var == null) {
            str = null;
            str2 = null;
            str3 = null;
            str4 = null;
            z10 = false;
        } else {
            i11 = d2Var.a();
            z10 = d2Var.c();
            str = d2Var.e();
            str3 = d2Var.b();
            str4 = d2Var.d();
            str2 = d2Var.g();
        }
        if (i10 != 0) {
            td.a.F(this.B, Integer.valueOf(i11));
            td.c.e(this.B, Boolean.valueOf(z10));
            x3.e.c(this.C, str3);
            td.c.e(this.C, Boolean.valueOf(z10));
            td.a.f(this.D, str4);
            td.a.i(this.E, str);
            x3.e.c(this.F, str2);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean w() {
        synchronized (this) {
            return this.J != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void y() {
        synchronized (this) {
            this.J = 2L;
        }
        H();
    }

    public b1(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (AppCompatImageView) objArr[4], (AppCompatTextView) objArr[5], (AppCompatImageView) objArr[2], (AppCompatImageView) objArr[1], (AppCompatTextView) objArr[3], (YellRankIconView) objArr[6]);
        this.J = -1L;
        this.B.setTag(null);
        this.C.setTag(null);
        this.D.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.I = constraintLayout;
        constraintLayout.setTag(null);
        this.E.setTag(null);
        this.F.setTag(null);
        N(view);
        y();
    }
}
