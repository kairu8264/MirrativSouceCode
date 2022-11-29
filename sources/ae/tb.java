package ae;

import android.util.SparseIntArray;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes2.dex */
public class tb extends sb {
    public static final ViewDataBinding.i P = null;
    public static final SparseIntArray Q;
    public final ConstraintLayout N;
    public long O;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        Q = sparseIntArray;
        sparseIntArray.put(nd.z0.f42297i6, 6);
        sparseIntArray.put(nd.z0.f42317m6, 7);
        sparseIntArray.put(nd.z0.f42301j6, 8);
        sparseIntArray.put(nd.z0.f42293h6, 9);
        sparseIntArray.put(nd.z0.f42298ib, 10);
        sparseIntArray.put(nd.z0.rank_profile_point_text_view, 11);
    }

    public tb(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 12, P, Q));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        return false;
    }

    @Override // ae.sb
    public void T(ud.g1 g1Var) {
        this.M = g1Var;
        synchronized (this) {
            this.O |= 1;
        }
        c(nd.b.f41908d);
        super.H();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l() {
        long j10;
        boolean z10;
        boolean z11;
        String str;
        String str2;
        String str3;
        synchronized (this) {
            j10 = this.O;
            this.O = 0L;
        }
        ud.g1 g1Var = this.M;
        int i10 = ((3 & j10) > 0L ? 1 : ((3 & j10) == 0L ? 0 : -1));
        boolean z12 = false;
        String str4 = null;
        if (i10 == 0 || g1Var == null) {
            z10 = false;
            z11 = false;
            str = null;
            str2 = null;
            str3 = null;
        } else {
            str4 = g1Var.d();
            String g10 = g1Var.g();
            str2 = g1Var.c();
            str3 = g1Var.f();
            z10 = g1Var.i();
            z11 = g1Var.k();
            z12 = g1Var.j();
            str = g10;
        }
        if ((j10 & 2) != 0) {
            td.c.b(this.N, 8, Integer.valueOf(ViewDataBinding.t(this.N, nd.w0.U0)));
        }
        if (i10 != 0) {
            td.a.f(this.F, str4);
            td.c.e(this.F, Boolean.valueOf(z12));
            td.a.f(this.G, str2);
            td.c.e(this.G, Boolean.valueOf(z10));
            td.a.i(this.H, str3);
            x3.e.c(this.I, str);
            td.c.e(this.K, Boolean.valueOf(z11));
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

    public tb(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (Guideline) objArr[9], (Guideline) objArr[6], (Guideline) objArr[8], (Guideline) objArr[7], (AppCompatImageView) objArr[2], (AppCompatImageView) objArr[3], (AppCompatImageView) objArr[1], (AppCompatTextView) objArr[4], (AppCompatTextView) objArr[11], (AppCompatImageView) objArr[5], (AppCompatTextView) objArr[10]);
        this.O = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.N = constraintLayout;
        constraintLayout.setTag(null);
        this.F.setTag(null);
        this.G.setTag(null);
        this.H.setTag(null);
        this.I.setTag(null);
        this.K.setTag(null);
        N(view);
        y();
    }
}
