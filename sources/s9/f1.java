package s9;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.Space;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes.dex */
public class f1 extends e1 {
    public static final ViewDataBinding.i D = null;
    public static final SparseIntArray E = null;
    public long C;

    public f1(androidx.databinding.e eVar, View view) {
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

    public f1(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (Space) objArr[0]);
        this.C = -1L;
        this.B.setTag(null);
        N(view);
        y();
    }
}
