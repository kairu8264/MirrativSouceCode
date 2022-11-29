package ae;

import android.util.SparseIntArray;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.ViewDataBinding;
import com.dena.mirrorman.customview.GiftItemEventAttributesView;
import com.dena.mirrorman.customview.MultipleStarView;

/* loaded from: classes2.dex */
public class nf extends mf {
    public static final ViewDataBinding.i Q = null;
    public static final SparseIntArray R;
    public long P;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        R = sparseIntArray;
        sparseIntArray.put(nd.z0.f42283f8, 7);
        sparseIntArray.put(nd.z0.f42297i6, 8);
        sparseIntArray.put(nd.z0.f42305k6, 9);
        sparseIntArray.put(nd.z0.f42311l6, 10);
        sparseIntArray.put(nd.z0.f42293h6, 11);
        sparseIntArray.put(nd.z0.multiple_star_view, 12);
    }

    public nf(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 13, Q, R));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        return false;
    }

    @Override // ae.mf
    public void T(ud.u0 u0Var) {
        this.O = u0Var;
        synchronized (this) {
            this.P |= 1;
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
        String str4;
        synchronized (this) {
            j10 = this.P;
            this.P = 0L;
        }
        ud.u0 u0Var = this.O;
        int i10 = ((j10 & 3) > 0L ? 1 : ((j10 & 3) == 0L ? 0 : -1));
        boolean z12 = false;
        String str5 = null;
        if (i10 == 0 || u0Var == null) {
            z10 = false;
            z11 = false;
            str = null;
            str2 = null;
            str3 = null;
            str4 = null;
        } else {
            z12 = u0Var.i();
            String g10 = u0Var.g();
            str = u0Var.f();
            z11 = u0Var.j();
            str2 = u0Var.e();
            str3 = u0Var.b();
            String a10 = u0Var.a();
            z10 = u0Var.k();
            str4 = g10;
            str5 = a10;
        }
        if (i10 != 0) {
            td.a.f(this.B, str5);
            td.c.e(this.B, Boolean.valueOf(z12));
            td.c.e(this.C, Boolean.valueOf(z10));
            td.a.f(this.H, str2);
            x3.e.c(this.K, str3);
            td.c.e(this.K, Boolean.valueOf(z11));
            x3.e.c(this.L, str);
            x3.e.c(this.N, str4);
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

    public nf(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (AppCompatImageView) objArr[2], (GiftItemEventAttributesView) objArr[6], (Guideline) objArr[11], (Guideline) objArr[8], (Guideline) objArr[9], (Guideline) objArr[10], (AppCompatImageView) objArr[1], (ConstraintLayout) objArr[7], (MultipleStarView) objArr[12], (AppCompatTextView) objArr[5], (AppCompatTextView) objArr[3], (ConstraintLayout) objArr[0], (AppCompatTextView) objArr[4]);
        this.P = -1L;
        this.B.setTag(null);
        this.C.setTag(null);
        this.H.setTag(null);
        this.K.setTag(null);
        this.L.setTag(null);
        this.M.setTag(null);
        this.N.setTag(null);
        N(view);
        y();
    }
}
