package ac;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.dena.mirrorman.customview.RoundedButtonView;

/* loaded from: classes2.dex */
public class u5 extends t5 {
    public static final ViewDataBinding.i H;
    public static final SparseIntArray I;
    public long G;

    static {
        ViewDataBinding.i iVar = new ViewDataBinding.i(5);
        H = iVar;
        iVar.a(0, new String[]{"comment_not_selectable"}, new int[]{1}, new int[]{nd.b1.comment_not_selectable});
        SparseIntArray sparseIntArray = new SparseIntArray();
        I = sparseIntArray;
        sparseIntArray.put(xb.o.K0, 2);
        sparseIntArray.put(xb.o.O8, 3);
        sparseIntArray.put(xb.o.f59972b1, 4);
    }

    public u5(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 5, H, I));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        if (i10 != 0) {
            return false;
        }
        return T((ae.m0) obj, i11);
    }

    public final boolean T(ae.m0 m0Var, int i10) {
        if (i10 == xb.b.f59838a) {
            synchronized (this) {
                this.G |= 1;
            }
            return true;
        }
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l() {
        synchronized (this) {
            this.G = 0L;
        }
        ViewDataBinding.n(this.D);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean w() {
        synchronized (this) {
            if (this.G != 0) {
                return true;
            }
            return this.D.w();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void y() {
        synchronized (this) {
            this.G = 2L;
        }
        this.D.y();
        H();
    }

    public u5(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 1, (ConstraintLayout) objArr[2], (RoundedButtonView) objArr[4], (ae.m0) objArr[1], (LinearLayout) objArr[0], (RoundedButtonView) objArr[3]);
        this.G = -1L;
        L(this.D);
        this.E.setTag(null);
        N(view);
        y();
    }
}
