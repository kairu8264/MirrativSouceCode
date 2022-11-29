package ae;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.Space;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.dena.mirrorman.customview.MultipleStarView;

/* loaded from: classes2.dex */
public class pf extends of {
    public static final ViewDataBinding.i W = null;
    public static final SparseIntArray X;
    public long V;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        X = sparseIntArray;
        sparseIntArray.put(nd.z0.f42297i6, 11);
        sparseIntArray.put(nd.z0.f42305k6, 12);
        sparseIntArray.put(nd.z0.f42311l6, 13);
        sparseIntArray.put(nd.z0.f42293h6, 14);
        sparseIntArray.put(nd.z0.multiple_star_view, 15);
        sparseIntArray.put(nd.z0.logo_anchor_space, 16);
        sparseIntArray.put(nd.z0.L3, 17);
        sparseIntArray.put(nd.z0.caption_text_view, 18);
    }

    public pf(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 19, W, X));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        return false;
    }

    @Override // ae.of
    public void T(ud.v0 v0Var) {
        this.U = v0Var;
        synchronized (this) {
            this.V |= 1;
        }
        c(nd.b.f41908d);
        super.H();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l() {
        long j10;
        boolean z10;
        boolean z11;
        boolean z12;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        boolean z13;
        boolean z14;
        ud.x0 x0Var;
        synchronized (this) {
            j10 = this.V;
            this.V = 0L;
        }
        ud.v0 v0Var = this.U;
        int i10 = ((j10 & 3) > 0L ? 1 : ((j10 & 3) == 0L ? 0 : -1));
        boolean z15 = false;
        String str8 = null;
        if (i10 != 0) {
            if (v0Var != null) {
                z10 = v0Var.k();
                str2 = v0Var.e();
                x0Var = v0Var.c();
                z14 = v0Var.j();
                str4 = v0Var.g();
                str5 = v0Var.f();
                z11 = v0Var.m();
                str6 = v0Var.b();
                str7 = v0Var.a();
                z12 = v0Var.l();
                str = v0Var.i();
            } else {
                z10 = false;
                z14 = false;
                z11 = false;
                z12 = false;
                str = null;
                str2 = null;
                x0Var = null;
                str4 = null;
                str5 = null;
                str6 = null;
                str7 = null;
            }
            if (x0Var != null) {
                z15 = x0Var.i();
                str8 = x0Var.e();
            }
            str3 = str8;
            z13 = z15;
            z15 = z14;
        } else {
            z10 = false;
            z11 = false;
            z12 = false;
            str = null;
            str2 = null;
            str3 = null;
            str4 = null;
            str5 = null;
            str6 = null;
            str7 = null;
            z13 = false;
        }
        if (i10 != 0) {
            td.a.f(this.C, str7);
            td.c.e(this.C, Boolean.valueOf(z15));
            td.c.e(this.E, Boolean.valueOf(z11));
            x3.e.c(this.F, str);
            td.c.e(this.F, Boolean.valueOf(z11));
            td.c.e(this.G, Boolean.valueOf(z12));
            td.a.f(this.L, str2);
            td.a.f(this.N, str3);
            x3.e.c(this.P, str6);
            td.c.e(this.P, Boolean.valueOf(z10));
            td.c.e(this.Q, Boolean.valueOf(z13));
            x3.e.c(this.R, str5);
            x3.e.c(this.T, str4);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean w() {
        synchronized (this) {
            return this.V != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void y() {
        synchronized (this) {
            this.V = 2L;
        }
        H();
    }

    public pf(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (AppCompatTextView) objArr[18], (AppCompatImageView) objArr[2], (View) objArr[17], (AppCompatImageView) objArr[9], (AppCompatTextView) objArr[10], (ConstraintLayout) objArr[6], (Guideline) objArr[14], (Guideline) objArr[11], (Guideline) objArr[12], (Guideline) objArr[13], (AppCompatImageView) objArr[1], (Space) objArr[16], (AppCompatImageView) objArr[7], (MultipleStarView) objArr[15], (AppCompatTextView) objArr[5], (RecyclerView) objArr[8], (AppCompatTextView) objArr[3], (ConstraintLayout) objArr[0], (AppCompatTextView) objArr[4]);
        this.V = -1L;
        this.C.setTag(null);
        this.E.setTag(null);
        this.F.setTag(null);
        this.G.setTag(null);
        this.L.setTag(null);
        this.N.setTag(null);
        this.P.setTag(null);
        this.Q.setTag(null);
        this.R.setTag(null);
        this.S.setTag(null);
        this.T.setTag(null);
        N(view);
        y();
    }
}
