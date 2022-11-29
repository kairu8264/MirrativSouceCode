package kb;

import android.util.SparseIntArray;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import hb.w1;

/* loaded from: classes2.dex */
public class m0 extends l0 {
    public static final ViewDataBinding.i H = null;
    public static final SparseIntArray I;
    public final ConstraintLayout F;
    public long G;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        I = sparseIntArray;
        sparseIntArray.put(w1.indicator_view, 3);
    }

    public m0(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 4, H, I));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        return false;
    }

    @Override // kb.l0
    public void U(jf.s sVar) {
        this.E = sVar;
        synchronized (this) {
            this.G |= 1;
        }
        c(hb.a.f34701c);
        super.H();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l() {
        long j10;
        String str;
        boolean z10;
        synchronized (this) {
            j10 = this.G;
            this.G = 0L;
        }
        jf.s sVar = this.E;
        int i10 = ((j10 & 3) > 0L ? 1 : ((j10 & 3) == 0L ? 0 : -1));
        String str2 = null;
        boolean z11 = false;
        if (i10 == 0 || sVar == null) {
            str = null;
            z10 = false;
        } else {
            boolean p10 = sVar.p();
            boolean n10 = sVar.n();
            str = sVar.i();
            z11 = n10;
            str2 = sVar.e();
            z10 = p10;
        }
        if (i10 != 0) {
            td.a.f(this.B, str2);
            td.c.e(this.B, Boolean.valueOf(z11));
            x3.e.c(this.D, str);
            td.c.e(this.D, Boolean.valueOf(z10));
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean w() {
        synchronized (this) {
            return this.G != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void y() {
        synchronized (this) {
            this.G = 2L;
        }
        H();
    }

    public m0(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (AppCompatImageView) objArr[1], (View) objArr[3], (AppCompatTextView) objArr[2]);
        this.G = -1L;
        this.B.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.F = constraintLayout;
        constraintLayout.setTag(null);
        this.D.setTag(null);
        N(view);
        y();
    }
}
