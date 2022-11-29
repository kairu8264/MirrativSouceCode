package ae;

import android.text.SpannableString;
import android.util.SparseIntArray;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.dena.mirrorman.widget.OutlineTextView;

/* loaded from: classes2.dex */
public class jl extends il {
    public static final ViewDataBinding.i J = null;
    public static final SparseIntArray K;
    public final ConstraintLayout H;
    public long I;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        K = sparseIntArray;
        sparseIntArray.put(nd.z0.f42370y6, 5);
    }

    public jl(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 6, J, K));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        return false;
    }

    @Override // ae.il
    public void T(ud.m2 m2Var) {
        this.G = m2Var;
        synchronized (this) {
            this.I |= 1;
        }
        c(nd.b.f41908d);
        super.H();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l() {
        long j10;
        String str;
        String str2;
        SpannableString spannableString;
        synchronized (this) {
            j10 = this.I;
            this.I = 0L;
        }
        ud.m2 m2Var = this.G;
        int i10 = ((j10 & 3) > 0L ? 1 : ((j10 & 3) == 0L ? 0 : -1));
        String str3 = null;
        if (i10 == 0 || m2Var == null) {
            str = null;
            str2 = null;
            spannableString = null;
        } else {
            String c10 = m2Var.c();
            String d10 = m2Var.d();
            String a10 = m2Var.a();
            spannableString = m2Var.b();
            str = c10;
            str3 = a10;
            str2 = d10;
        }
        if (i10 != 0) {
            td.a.f(this.B, str3);
            x3.e.c(this.C, spannableString);
            x3.e.c(this.D, str);
            x3.e.c(this.F, str2);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean w() {
        synchronized (this) {
            return this.I != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void y() {
        synchronized (this) {
            this.I = 2L;
        }
        H();
    }

    public jl(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (AppCompatImageView) objArr[3], (AppCompatTextView) objArr[4], (OutlineTextView) objArr[1], (AppCompatImageView) objArr[5], (AppCompatTextView) objArr[2]);
        this.I = -1L;
        this.B.setTag(null);
        this.C.setTag(null);
        this.D.setTag(null);
        this.F.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.H = constraintLayout;
        constraintLayout.setTag(null);
        N(view);
        y();
    }
}
