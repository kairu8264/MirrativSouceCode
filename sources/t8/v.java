package t8;

import android.util.SparseIntArray;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.dena.mirrativ.customview.StatusView;

/* loaded from: classes.dex */
public class v extends u {
    public static final ViewDataBinding.i H = null;
    public static final SparseIntArray I;
    public long G;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        I = sparseIntArray;
        sparseIntArray.put(r8.e1.f49861e1, 1);
        sparseIntArray.put(r8.e1.Y1, 2);
        sparseIntArray.put(r8.e1.tab_header_image_view, 3);
        sparseIntArray.put(r8.e1.post_status_view, 4);
    }

    public v(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 5, H, I));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l() {
        synchronized (this) {
            this.G = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean w() {
        synchronized (this) {
            return this.G != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void y() {
        synchronized (this) {
            this.G = 1L;
        }
        H();
    }

    public v(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (CoordinatorLayout) objArr[0], (ConstraintLayout) objArr[1], (StatusView) objArr[4], (RecyclerView) objArr[2], (AppCompatImageView) objArr[3]);
        this.G = -1L;
        this.B.setTag(null);
        N(view);
        y();
    }
}
