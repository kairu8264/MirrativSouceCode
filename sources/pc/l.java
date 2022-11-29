package pc;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes2.dex */
public class l extends k {
    public static final ViewDataBinding.i F;
    public static final SparseIntArray G;
    public long E;

    static {
        ViewDataBinding.i iVar = new ViewDataBinding.i(3);
        F = iVar;
        iVar.a(0, new String[]{"view_home_emomo_operation"}, new int[]{1}, new int[]{nc.f.view_home_emomo_operation});
        SparseIntArray sparseIntArray = new SparseIntArray();
        G = sparseIntArray;
        sparseIntArray.put(nc.e.f41854z, 2);
    }

    public l(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 3, F, G));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        if (i10 != 0) {
            return false;
        }
        return T((i3) obj, i11);
    }

    public final boolean T(i3 i3Var, int i10) {
        if (i10 == nc.a.f41787a) {
            synchronized (this) {
                this.E |= 1;
            }
            return true;
        }
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l() {
        synchronized (this) {
            this.E = 0L;
        }
        ViewDataBinding.n(this.D);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean w() {
        synchronized (this) {
            if (this.E != 0) {
                return true;
            }
            return this.D.w();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void y() {
        synchronized (this) {
            this.E = 2L;
        }
        this.D.y();
        H();
    }

    public l(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 1, (FrameLayout) objArr[2], (ConstraintLayout) objArr[0], (i3) objArr[1]);
        this.E = -1L;
        this.C.setTag(null);
        L(this.D);
        N(view);
        y();
    }
}
