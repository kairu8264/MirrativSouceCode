package ae;

import android.util.SparseIntArray;
import android.view.View;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.dena.mirrorman.customview.PinCodeView;

/* loaded from: classes2.dex */
public class p5 extends o5 {
    public static final ViewDataBinding.i J = null;
    public static final SparseIntArray K;
    public final ConstraintLayout H;
    public long I;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        K = sparseIntArray;
        sparseIntArray.put(nd.z0.f42352u6, 2);
        sparseIntArray.put(nd.z0.pin_code_view, 3);
        sparseIntArray.put(nd.z0.detail_text_view, 4);
        sparseIntArray.put(nd.z0.Y0, 5);
    }

    public p5(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 6, J, K));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        if (i10 != 0) {
            return false;
        }
        return U((androidx.lifecycle.e0) obj, i11);
    }

    @Override // ae.o5
    public void T(ud.m1 m1Var) {
        this.G = m1Var;
        synchronized (this) {
            this.I |= 2;
        }
        c(nd.b.f41908d);
        super.H();
    }

    public final boolean U(androidx.lifecycle.e0<Boolean> e0Var, int i10) {
        if (i10 == nd.b.f41905a) {
            synchronized (this) {
                this.I |= 1;
            }
            return true;
        }
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l() {
        long j10;
        synchronized (this) {
            j10 = this.I;
            this.I = 0L;
        }
        ud.m1 m1Var = this.G;
        int i10 = ((j10 & 7) > 0L ? 1 : ((j10 & 7) == 0L ? 0 : -1));
        boolean z10 = false;
        if (i10 != 0) {
            androidx.lifecycle.e0<Boolean> f10 = m1Var != null ? m1Var.f() : null;
            Q(0, f10);
            z10 = ViewDataBinding.K(f10 != null ? f10.f() : null);
        }
        if (i10 != 0) {
            this.E.setEnabled(z10);
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
            this.I = 4L;
        }
        H();
    }

    public p5(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 1, (AppCompatButton) objArr[5], (AppCompatTextView) objArr[4], (AppCompatImageView) objArr[2], (AppCompatButton) objArr[1], (PinCodeView) objArr[3]);
        this.I = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.H = constraintLayout;
        constraintLayout.setTag(null);
        this.E.setTag(null);
        N(view);
        y();
    }
}
