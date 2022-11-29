package ae;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes2.dex */
public class l7 extends k7 {
    public static final ViewDataBinding.i G;
    public static final SparseIntArray H;
    public long F;

    static {
        ViewDataBinding.i iVar = new ViewDataBinding.i(4);
        G = iVar;
        iVar.a(0, new String[]{"comment_not_selectable"}, new int[]{1}, new int[]{nd.b1.comment_not_selectable});
        SparseIntArray sparseIntArray = new SparseIntArray();
        H = sparseIntArray;
        sparseIntArray.put(nd.z0.L0, 2);
        sparseIntArray.put(nd.z0.f42343se, 3);
    }

    public l7(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 4, G, H));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        if (i10 != 0) {
            return false;
        }
        return T((m0) obj, i11);
    }

    public final boolean T(m0 m0Var, int i10) {
        if (i10 == nd.b.f41905a) {
            synchronized (this) {
                this.F |= 1;
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
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean w() {
        synchronized (this) {
            if (this.F != 0) {
                return true;
            }
            return this.C.w();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void y() {
        synchronized (this) {
            this.F = 2L;
        }
        this.C.y();
        H();
    }

    public l7(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 1, (LinearLayout) objArr[2], (m0) objArr[1], (RelativeLayout) objArr[0], (AppCompatTextView) objArr[3]);
        this.F = -1L;
        L(this.C);
        this.D.setTag(null);
        N(view);
        y();
    }
}
