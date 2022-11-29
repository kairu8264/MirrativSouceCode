package pc;

import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes2.dex */
public class f1 extends e1 {
    public static final ViewDataBinding.i F;
    public static final SparseIntArray G;
    public final ConstraintLayout D;
    public long E;

    static {
        ViewDataBinding.i iVar = new ViewDataBinding.i(3);
        F = iVar;
        iVar.a(0, new String[]{"view_season_rating_result", "view_season_rating_start"}, new int[]{1, 2}, new int[]{nc.f.view_season_rating_result, nc.f.view_season_rating_start});
        G = null;
    }

    public f1(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 3, F, G));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        if (i10 != 0) {
            if (i10 != 1) {
                return false;
            }
            return W((o3) obj, i11);
        }
        return V((m3) obj, i11);
    }

    public final boolean V(m3 m3Var, int i10) {
        if (i10 == nc.a.f41787a) {
            synchronized (this) {
                this.E |= 1;
            }
            return true;
        }
        return false;
    }

    public final boolean W(o3 o3Var, int i10) {
        if (i10 == nc.a.f41787a) {
            synchronized (this) {
                this.E |= 2;
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
        ViewDataBinding.n(this.B);
        ViewDataBinding.n(this.C);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean w() {
        synchronized (this) {
            if (this.E != 0) {
                return true;
            }
            return this.B.w() || this.C.w();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void y() {
        synchronized (this) {
            this.E = 4L;
        }
        this.B.y();
        this.C.y();
        H();
    }

    public f1(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 2, (m3) objArr[1], (o3) objArr[2]);
        this.E = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.D = constraintLayout;
        constraintLayout.setTag(null);
        L(this.B);
        L(this.C);
        N(view);
        y();
    }
}
