package ae;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ScrollView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes2.dex */
public class k3 extends j3 {
    public static final ViewDataBinding.i G = null;
    public static final SparseIntArray H;
    public long F;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        H = sparseIntArray;
        sparseIntArray.put(nd.z0.content_scroll_view, 1);
        sparseIntArray.put(nd.z0.L6, 2);
        sparseIntArray.put(nd.z0.A1, 3);
    }

    public k3(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 4, G, H));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l() {
        synchronized (this) {
            this.F = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean w() {
        synchronized (this) {
            return this.F != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void y() {
        synchronized (this) {
            this.F = 1L;
        }
        H();
    }

    public k3(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (AppCompatImageView) objArr[3], (ScrollView) objArr[1], (AppCompatImageView) objArr[2], (ConstraintLayout) objArr[0]);
        this.F = -1L;
        this.E.setTag(null);
        N(view);
        y();
    }
}
