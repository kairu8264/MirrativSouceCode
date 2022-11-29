package pc;

import android.util.SparseIntArray;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes2.dex */
public class l3 extends k3 {
    public static final ViewDataBinding.i L = null;
    public static final SparseIntArray M = null;
    public final ConstraintLayout J;
    public long K;

    public l3(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 8, L, M));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        return false;
    }

    @Override // pc.k3
    public void T(ad.m2 m2Var) {
        this.I = m2Var;
        synchronized (this) {
            this.K |= 1;
        }
        c(nc.a.f41788b);
        super.H();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l() {
        long j10;
        int i10;
        String str;
        String str2;
        String str3;
        String str4;
        boolean z10;
        String str5;
        synchronized (this) {
            j10 = this.K;
            this.K = 0L;
        }
        ad.m2 m2Var = this.I;
        int i11 = ((j10 & 3) > 0L ? 1 : ((j10 & 3) == 0L ? 0 : -1));
        String str6 = null;
        if (i11 != 0) {
            if (m2Var != null) {
                str6 = m2Var.c();
                str3 = m2Var.d();
                z10 = m2Var.g();
                i10 = m2Var.f();
                str5 = m2Var.b();
                str4 = m2Var.e();
                str = m2Var.a();
            } else {
                z10 = false;
                i10 = 0;
                str = null;
                str3 = null;
                str5 = null;
                str4 = null;
            }
            if (i11 != 0) {
                j10 |= z10 ? 8L : 4L;
            }
            r9 = z10 ? 0 : 8;
            str2 = str6;
            str6 = str5;
        } else {
            i10 = 0;
            str = null;
            str2 = null;
            str3 = null;
            str4 = null;
        }
        if ((j10 & 3) != 0) {
            x3.e.c(this.B, str6);
            x3.e.c(this.C, str);
            this.D.setVisibility(r9);
            x3.e.c(this.E, str2);
            x3.e.c(this.F, str4);
            this.F.setTextColor(i10);
            x3.e.c(this.G, str3);
            this.G.setTextColor(i10);
            this.H.setTextColor(i10);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean w() {
        synchronized (this) {
            return this.K != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void y() {
        synchronized (this) {
            this.K = 2L;
        }
        H();
    }

    public l3(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (AppCompatTextView) objArr[3], (AppCompatTextView) objArr[2], (AppCompatImageView) objArr[7], (AppCompatTextView) objArr[1], (AppCompatTextView) objArr[5], (AppCompatTextView) objArr[6], (AppCompatTextView) objArr[4]);
        this.K = -1L;
        this.B.setTag(null);
        this.C.setTag(null);
        this.D.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.J = constraintLayout;
        constraintLayout.setTag(null);
        this.E.setTag(null);
        this.F.setTag(null);
        this.G.setTag(null);
        this.H.setTag(null);
        N(view);
        y();
    }
}
