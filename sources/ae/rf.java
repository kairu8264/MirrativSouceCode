package ae;

import android.util.SparseIntArray;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.ViewDataBinding;
import com.dena.mirrorman.customview.GaugeView;

/* loaded from: classes2.dex */
public class rf extends qf {
    public static final ViewDataBinding.i Q = null;
    public static final SparseIntArray R;
    public final ConstraintLayout O;
    public long P;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        R = sparseIntArray;
        sparseIntArray.put(nd.z0.f42297i6, 7);
        sparseIntArray.put(nd.z0.f42317m6, 8);
        sparseIntArray.put(nd.z0.f42301j6, 9);
        sparseIntArray.put(nd.z0.f42293h6, 10);
        sparseIntArray.put(nd.z0.Me, 11);
        sparseIntArray.put(nd.z0.remaining_gift_point_container, 12);
    }

    public rf(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 13, Q, R));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        return false;
    }

    @Override // ae.qf
    public void T(ud.c1 c1Var) {
        this.N = c1Var;
        synchronized (this) {
            this.P |= 1;
        }
        c(nd.b.f41908d);
        super.H();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l() {
        long j10;
        String str;
        int i10;
        boolean z10;
        boolean z11;
        String str2;
        synchronized (this) {
            j10 = this.P;
            this.P = 0L;
        }
        float f10 = 0.0f;
        ud.c1 c1Var = this.N;
        int i11 = ((3 & j10) > 0L ? 1 : ((3 & j10) == 0L ? 0 : -1));
        String str3 = null;
        if (i11 == 0 || c1Var == null) {
            str = null;
            i10 = 0;
            z10 = false;
            z11 = false;
            str2 = null;
        } else {
            int a10 = c1Var.a();
            String f11 = c1Var.f();
            String e10 = c1Var.e();
            float d10 = c1Var.d();
            z10 = c1Var.g();
            z11 = c1Var.h();
            str = c1Var.c();
            str3 = e10;
            f10 = d10;
            i10 = a10;
            str2 = f11;
        }
        if (i11 != 0) {
            td.c.a(this.O, Integer.valueOf(i10));
            this.G.setGaugeViewProgress(f10);
            td.c.e(this.G, Boolean.valueOf(z10));
            x3.e.c(this.H, str3);
            td.c.e(this.H, Boolean.valueOf(z10));
            td.c.e(this.I, Boolean.valueOf(z10));
            td.c.e(this.J, Boolean.valueOf(z11));
            td.a.f(this.K, str);
            td.c.e(this.K, Boolean.valueOf(z10));
            x3.e.c(this.M, str2);
        }
        if ((j10 & 2) != 0) {
            td.c.b(this.I, 27, Integer.valueOf(ViewDataBinding.t(this.I, nd.w0.U0)));
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

    public rf(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (Guideline) objArr[10], (Guideline) objArr[7], (Guideline) objArr[9], (Guideline) objArr[8], (ConstraintLayout) objArr[12], (GaugeView) objArr[3], (AppCompatTextView) objArr[4], (View) objArr[5], (AppCompatImageView) objArr[2], (AppCompatImageView) objArr[6], (ConstraintLayout) objArr[11], (AppCompatTextView) objArr[1]);
        this.P = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.O = constraintLayout;
        constraintLayout.setTag(null);
        this.G.setTag(null);
        this.H.setTag(null);
        this.I.setTag(null);
        this.J.setTag(null);
        this.K.setTag(null);
        this.M.setTag(null);
        N(view);
        y();
    }
}
