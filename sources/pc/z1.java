package pc;

import ae.e8;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatButton;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes2.dex */
public class z1 extends y1 {
    public static final ViewDataBinding.i I;
    public static final SparseIntArray J;
    public final LinearLayout F;
    public final LinearLayout G;
    public long H;

    static {
        ViewDataBinding.i iVar = new ViewDataBinding.i(6);
        I = iVar;
        iVar.a(0, new String[]{"toolbar"}, new int[]{2}, new int[]{nd.b1.toolbar});
        iVar.a(1, new String[]{"view_contract_step"}, new int[]{3}, new int[]{nc.f.view_contract_step});
        SparseIntArray sparseIntArray = new SparseIntArray();
        J = sparseIntArray;
        sparseIntArray.put(nc.e.submit_button, 4);
        sparseIntArray.put(nc.e.R0, 5);
    }

    public z1(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 6, I, J));
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
                this.H |= 1;
            }
            return true;
        }
        return false;
    }

    public final boolean W(e8 e8Var, int i10) {
        if (i10 == nc.a.f41787a) {
            synchronized (this) {
                this.H |= 2;
            }
            return true;
        }
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l() {
        synchronized (this) {
            this.H = 0L;
        }
        ViewDataBinding.n(this.E);
        ViewDataBinding.n(this.C);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean w() {
        synchronized (this) {
            if (this.H != 0) {
                return true;
            }
            return this.E.w() || this.C.w();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void y() {
        synchronized (this) {
            this.H = 4L;
        }
        this.E.y();
        this.C.y();
        H();
    }

    public z1(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 2, (AppCompatButton) objArr[5], (y2) objArr[3], (AppCompatButton) objArr[4], (e8) objArr[2]);
        this.H = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.F = linearLayout;
        linearLayout.setTag(null);
        LinearLayout linearLayout2 = (LinearLayout) objArr[1];
        this.G = linearLayout2;
        linearLayout2.setTag(null);
        L(this.C);
        L(this.E);
        N(view);
        y();
    }
}
