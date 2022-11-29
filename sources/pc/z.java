package pc;

import ae.e8;
import android.util.SparseIntArray;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.dena.mirrorman.customview.RoundedButtonView;

/* loaded from: classes2.dex */
public class z extends y {
    public static final ViewDataBinding.i H;
    public static final SparseIntArray I;
    public final ConstraintLayout F;
    public long G;

    static {
        ViewDataBinding.i iVar = new ViewDataBinding.i(5);
        H = iVar;
        iVar.a(0, new String[]{"toolbar"}, new int[]{1}, new int[]{nd.b1.toolbar});
        SparseIntArray sparseIntArray = new SparseIntArray();
        I = sparseIntArray;
        sparseIntArray.put(nc.e.attention_image_view, 2);
        sparseIntArray.put(nc.e.f41834n6, 3);
        sparseIntArray.put(nc.e.leave_button_view, 4);
    }

    public z(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 5, H, I));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        if (i10 != 0) {
            return false;
        }
        return T((e8) obj, i11);
    }

    public final boolean T(e8 e8Var, int i10) {
        if (i10 == nc.a.f41787a) {
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
        ViewDataBinding.n(this.E);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean w() {
        synchronized (this) {
            if (this.G != 0) {
                return true;
            }
            return this.E.w();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void y() {
        synchronized (this) {
            this.G = 2L;
        }
        this.E.y();
        H();
    }

    public z(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 1, (AppCompatImageView) objArr[2], (RoundedButtonView) objArr[4], (AppCompatTextView) objArr[3], (e8) objArr[1]);
        this.G = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.F = constraintLayout;
        constraintLayout.setTag(null);
        L(this.E);
        N(view);
        y();
    }
}
