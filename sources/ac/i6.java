package ac;

import android.util.SparseIntArray;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.ViewDataBinding;
import com.airbnb.lottie.LottieAnimationView;

/* loaded from: classes2.dex */
public class i6 extends h6 {
    public static final ViewDataBinding.i R = null;
    public static final SparseIntArray S;
    public long Q;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        S = sparseIntArray;
        sparseIntArray.put(xb.o.f59970a4, 8);
        sparseIntArray.put(xb.o.f59976c4, 9);
        sparseIntArray.put(xb.o.f59973b4, 10);
        sparseIntArray.put(xb.o.Z3, 11);
        sparseIntArray.put(xb.o.A9, 12);
        sparseIntArray.put(xb.o.f60019o7, 13);
    }

    public i6(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 14, R, S));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        return false;
    }

    @Override // ac.h6
    public void T(cc.t0 t0Var) {
        this.P = t0Var;
        synchronized (this) {
            this.Q |= 1;
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
        int i10;
        boolean z10;
        boolean z11;
        synchronized (this) {
            j10 = this.Q;
            this.Q = 0L;
        }
        cc.t0 t0Var = this.P;
        int i11 = ((3 & j10) > 0L ? 1 : ((3 & j10) == 0L ? 0 : -1));
        int i12 = 0;
        if (i11 == 0 || t0Var == null) {
            str = null;
            str2 = null;
            str3 = null;
            i10 = 0;
            z10 = false;
            z11 = false;
        } else {
            i12 = t0Var.a();
            str2 = t0Var.b();
            str3 = t0Var.e();
            i10 = t0Var.g();
            z10 = t0Var.i();
            z11 = t0Var.h();
            str = t0Var.f();
        }
        if (i11 != 0) {
            td.c.a(this.B, Integer.valueOf(i12));
            td.c.e(this.C, Boolean.valueOf(z11));
            td.c.e(this.D, Boolean.valueOf(z10));
            td.b.d(this.E, Integer.valueOf(i10), null);
            td.a.f(this.J, str2);
            this.L.setText(str);
            x3.e.c(this.O, str3);
        }
        if ((j10 & 2) != 0) {
            td.b.j(this.K, "MPLUSRounded1c-Black.ttf");
            td.b.j(this.L, "MPLUSRounded1c-Black.ttf");
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

    public i6(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (ConstraintLayout) objArr[0], (AppCompatImageView) objArr[1], (AppCompatImageView) objArr[6], (AppCompatTextView) objArr[7], (Guideline) objArr[11], (Guideline) objArr[8], (Guideline) objArr[10], (Guideline) objArr[9], (AppCompatImageView) objArr[3], (AppCompatTextView) objArr[5], (AppCompatTextView) objArr[4], (LottieAnimationView) objArr[13], (ConstraintLayout) objArr[12], (AppCompatTextView) objArr[2]);
        this.Q = -1L;
        this.B.setTag(null);
        this.C.setTag(null);
        this.D.setTag(null);
        this.E.setTag(null);
        this.J.setTag(null);
        this.K.setTag(null);
        this.L.setTag(null);
        this.O.setTag(null);
        N(view);
        y();
    }
}
