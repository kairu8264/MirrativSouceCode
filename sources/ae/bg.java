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
public class bg extends ag {
    public static final ViewDataBinding.i R = null;
    public static final SparseIntArray S;
    public final ConstraintLayout P;
    public long Q;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        S = sparseIntArray;
        sparseIntArray.put(nd.z0.f42297i6, 9);
        sparseIntArray.put(nd.z0.f42305k6, 10);
        sparseIntArray.put(nd.z0.f42311l6, 11);
        sparseIntArray.put(nd.z0.f42293h6, 12);
        sparseIntArray.put(nd.z0.L, 13);
    }

    public bg(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 14, R, S));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        return false;
    }

    @Override // ae.ag
    public void T(ud.s1 s1Var) {
        this.O = s1Var;
        synchronized (this) {
            this.Q |= 1;
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
        boolean z13;
        synchronized (this) {
            j10 = this.Q;
            this.Q = 0L;
        }
        ud.s1 s1Var = this.O;
        int i10 = ((j10 & 3) > 0L ? 1 : ((j10 & 3) == 0L ? 0 : -1));
        boolean z14 = false;
        if (i10 == 0 || s1Var == null) {
            z10 = false;
            z11 = false;
            z12 = false;
            str = null;
            str2 = null;
            str3 = null;
            str4 = null;
            str5 = null;
            str6 = null;
            z13 = false;
        } else {
            boolean n10 = s1Var.n();
            boolean m10 = s1Var.m();
            boolean k10 = s1Var.k();
            str2 = s1Var.d();
            str3 = s1Var.a();
            z11 = s1Var.l();
            z12 = s1Var.o();
            str4 = s1Var.f();
            str5 = s1Var.g();
            str6 = s1Var.b();
            str = s1Var.c();
            z13 = n10;
            z14 = k10;
            z10 = m10;
        }
        if (i10 != 0) {
            td.a.f(this.B, str3);
            td.c.e(this.B, Boolean.valueOf(z14));
            td.a.f(this.D, str6);
            td.c.e(this.D, Boolean.valueOf(z11));
            td.c.e(this.E, Boolean.valueOf(z13));
            td.c.e(this.J, Boolean.valueOf(z12));
            x3.e.c(this.K, str);
            x3.e.c(this.L, str2);
            td.c.e(this.L, Boolean.valueOf(z10));
            td.a.f(this.M, str5);
            x3.e.c(this.N, str4);
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

    public bg(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (AppCompatImageView) objArr[2], (View) objArr[13], (AppCompatImageView) objArr[3], (GiftItemEventAttributesView) objArr[8], (Guideline) objArr[12], (Guideline) objArr[9], (Guideline) objArr[10], (Guideline) objArr[11], (MultipleStarView) objArr[4], (AppCompatTextView) objArr[5], (AppCompatTextView) objArr[7], (AppCompatImageView) objArr[1], (AppCompatTextView) objArr[6]);
        this.Q = -1L;
        this.B.setTag(null);
        this.D.setTag(null);
        this.E.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.P = constraintLayout;
        constraintLayout.setTag(null);
        this.J.setTag(null);
        this.K.setTag(null);
        this.L.setTag(null);
        this.M.setTag(null);
        this.N.setTag(null);
        N(view);
        y();
    }
}
