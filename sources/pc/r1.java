package pc;

import ae.e8;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes2.dex */
public class r1 extends q1 {
    public static final ViewDataBinding.i G;
    public static final SparseIntArray H;
    public final ConstraintLayout D;
    public final LinearLayout E;
    public long F;

    static {
        ViewDataBinding.i iVar = new ViewDataBinding.i(4);
        G = iVar;
        iVar.a(0, new String[]{"toolbar"}, new int[]{2}, new int[]{nd.b1.toolbar});
        iVar.a(1, new String[]{"view_contract_step"}, new int[]{3}, new int[]{nc.f.view_contract_step});
        H = null;
    }

    public r1(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 4, G, H));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        if (i10 != 0) {
            if (i10 != 1) {
                return false;
            }
            return W((e8) obj, i11);
        }
        return V((y2) obj, i11);
    }

    public final boolean V(y2 y2Var, int i10) {
        if (i10 == nc.a.f41787a) {
            synchronized (this) {
                this.F |= 1;
            }
            return true;
        }
        return false;
    }

    public final boolean W(e8 e8Var, int i10) {
        if (i10 == nc.a.f41787a) {
            synchronized (this) {
                this.F |= 2;
            }
            return true;
        }
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l() {
        synchronized (this) {
            this.F = 0L;
        }
        ViewDataBinding.n(this.C);
        ViewDataBinding.n(this.B);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean w() {
        synchronized (this) {
            if (this.F != 0) {
                return true;
            }
            return this.C.w() || this.B.w();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void y() {
        synchronized (this) {
            this.F = 4L;
        }
        this.C.y();
        this.B.y();
        H();
    }

    public r1(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 2, (y2) objArr[3], (e8) objArr[2]);
        this.F = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.D = constraintLayout;
        constraintLayout.setTag(null);
        LinearLayout linearLayout = (LinearLayout) objArr[1];
        this.E = linearLayout;
        linearLayout.setTag(null);
        L(this.B);
        L(this.C);
        N(view);
        y();
    }
}
