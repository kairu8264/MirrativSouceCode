package ac;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes2.dex */
public class p1 extends o1 {
    public static final ViewDataBinding.i E;
    public static final SparseIntArray F;
    public long D;

    static {
        ViewDataBinding.i iVar = new ViewDataBinding.i(2);
        E = iVar;
        iVar.a(0, new String[]{"dialog_confirm_moderator"}, new int[]{1}, new int[]{nd.b1.dialog_confirm_moderator});
        F = null;
    }

    public p1(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 2, E, F));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        if (i10 != 0) {
            return false;
        }
        return V((ae.t0) obj, i11);
    }

    public final boolean V(ae.t0 t0Var, int i10) {
        if (i10 == xb.b.f59838a) {
            synchronized (this) {
                this.D |= 1;
            }
            return true;
        }
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l() {
        synchronized (this) {
            this.D = 0L;
        }
        ViewDataBinding.n(this.B);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean w() {
        synchronized (this) {
            if (this.D != 0) {
                return true;
            }
            return this.B.w();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void y() {
        synchronized (this) {
            this.D = 2L;
        }
        this.B.y();
        H();
    }

    public p1(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 1, (ae.t0) objArr[1], (LinearLayout) objArr[0]);
        this.D = -1L;
        L(this.B);
        this.C.setTag(null);
        N(view);
        y();
    }
}
