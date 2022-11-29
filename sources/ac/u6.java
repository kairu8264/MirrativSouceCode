package ac;

import android.util.SparseIntArray;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes2.dex */
public class u6 extends t6 {
    public static final ViewDataBinding.i I = null;
    public static final SparseIntArray J = null;
    public long H;

    public u6(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 5, I, J));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        if (i10 != 0) {
            return false;
        }
        return W((androidx.lifecycle.e0) obj, i11);
    }

    @Override // ac.t6
    public void V(hc.y yVar) {
        this.G = yVar;
        synchronized (this) {
            this.H |= 2;
        }
        c(xb.b.f59841d);
        super.H();
    }

    public final boolean W(androidx.lifecycle.e0<Boolean> e0Var, int i10) {
        if (i10 == xb.b.f59838a) {
            synchronized (this) {
                this.H |= 1;
            }
            return true;
        }
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l() {
        long j10;
        Boolean bool;
        String str;
        String str2;
        boolean z10;
        String str3;
        synchronized (this) {
            j10 = this.H;
            this.H = 0L;
        }
        hc.y yVar = this.G;
        int i10 = ((7 & j10) > 0L ? 1 : ((7 & j10) == 0L ? 0 : -1));
        boolean z11 = false;
        String str4 = null;
        if (i10 != 0) {
            if ((j10 & 6) == 0 || yVar == null) {
                z10 = false;
                str = null;
                str2 = null;
                str3 = null;
            } else {
                str = yVar.b();
                z10 = yVar.f();
                str2 = yVar.d();
                str3 = yVar.a();
            }
            androidx.lifecycle.e0<Boolean> e10 = yVar != null ? yVar.e() : null;
            Q(0, e10);
            bool = e10 != null ? e10.f() : null;
            z11 = z10;
            str4 = str3;
        } else {
            bool = null;
            str = null;
            str2 = null;
        }
        if ((j10 & 6) != 0) {
            td.a.f(this.C, str4);
            td.c.e(this.C, Boolean.valueOf(z11));
            td.a.i(this.D, str);
            x3.e.c(this.F, str2);
        }
        if (i10 != 0) {
            td.c.e(this.E, bool);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean w() {
        synchronized (this) {
            return this.H != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void y() {
        synchronized (this) {
            this.H = 4L;
        }
        H();
    }

    public u6(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 1, (ConstraintLayout) objArr[0], (AppCompatImageView) objArr[2], (AppCompatImageView) objArr[1], (AppCompatImageView) objArr[4], (AppCompatTextView) objArr[3]);
        this.H = -1L;
        this.B.setTag(null);
        this.C.setTag(null);
        this.D.setTag(null);
        this.E.setTag(null);
        this.F.setTag(null);
        N(view);
        y();
    }
}
