package ae;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes2.dex */
public class z3 extends y3 {
    public static final ViewDataBinding.i D = null;
    public static final SparseIntArray E = null;
    public final RelativeLayout B;
    public long C;

    public z3(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 1, D, E));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l() {
        synchronized (this) {
            this.C = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean w() {
        synchronized (this) {
            return this.C != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void y() {
        synchronized (this) {
            this.C = 1L;
        }
        H();
    }

    public z3(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0);
        this.C = -1L;
        RelativeLayout relativeLayout = (RelativeLayout) objArr[0];
        this.B = relativeLayout;
        relativeLayout.setTag(null);
        N(view);
        y();
    }
}
