package ae;

import android.util.SparseIntArray;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.ViewDataBinding;
import com.dena.mirrorman.customview.YellRankIconView;

/* loaded from: classes2.dex */
public class lg extends kg {
    public static final ViewDataBinding.i Q = null;
    public static final SparseIntArray R;
    public long P;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        R = sparseIntArray;
        sparseIntArray.put(nd.z0.profile_image_view_center_guideline, 8);
        sparseIntArray.put(nd.z0.user_name_text_view_start_guideline, 9);
        sparseIntArray.put(nd.z0.user_name_text_view_end_guideline, 10);
        sparseIntArray.put(nd.z0.Lg, 11);
        sparseIntArray.put(nd.z0.E3, 12);
    }

    public lg(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 13, Q, R));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        return false;
    }

    @Override // ae.kg
    public void T(ud.y1 y1Var) {
        this.O = y1Var;
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
        String str2;
        String str3;
        int i10;
        boolean z10;
        int i11;
        int i12;
        int i13;
        synchronized (this) {
            j10 = this.P;
            this.P = 0L;
        }
        ud.y1 y1Var = this.O;
        int i14 = ((j10 & 3) > 0L ? 1 : ((j10 & 3) == 0L ? 0 : -1));
        String str4 = null;
        boolean z11 = false;
        if (i14 == 0 || y1Var == null) {
            str = null;
            str2 = null;
            str3 = null;
            i10 = 0;
            z10 = false;
            i11 = 0;
            i12 = 0;
            i13 = 0;
        } else {
            z11 = y1Var.l();
            int g10 = y1Var.g();
            String a10 = y1Var.a();
            z10 = y1Var.m();
            i11 = y1Var.h();
            i12 = y1Var.f();
            str2 = y1Var.d();
            str3 = y1Var.e();
            i13 = y1Var.b();
            str = y1Var.i();
            i10 = g10;
            str4 = a10;
        }
        if (i14 != 0) {
            td.a.f(this.C, str4);
            td.c.e(this.C, Boolean.valueOf(z11));
            td.c.e(this.E, Boolean.valueOf(z10));
            td.b.c(this.F, Integer.valueOf(i13));
            td.c.e(this.F, Boolean.valueOf(z10));
            td.a.i(this.G, str2);
            td.a.F(this.I, Integer.valueOf(i11));
            x3.e.c(this.J, str3);
            this.J.setTextColor(i12);
            td.b.h(this.J, Integer.valueOf(i10));
            x3.e.c(this.K, str);
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

    public lg(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (ConstraintLayout) objArr[0], (AppCompatImageView) objArr[4], (View) objArr[12], (AppCompatTextView) objArr[7], (AppCompatTextView) objArr[6], (AppCompatImageView) objArr[2], (Guideline) objArr[8], (AppCompatImageView) objArr[3], (AppCompatTextView) objArr[1], (AppCompatTextView) objArr[5], (Guideline) objArr[10], (Guideline) objArr[9], (YellRankIconView) objArr[11]);
        this.P = -1L;
        this.B.setTag(null);
        this.C.setTag(null);
        this.E.setTag(null);
        this.F.setTag(null);
        this.G.setTag(null);
        this.I.setTag(null);
        this.J.setTag(null);
        this.K.setTag(null);
        N(view);
        y();
    }
}
