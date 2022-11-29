package sa;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes2.dex */
public class x extends w {
    public static final ViewDataBinding.i J = null;
    public static final SparseIntArray K;
    public final ConstraintLayout H;
    public long I;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        K = sparseIntArray;
        sparseIntArray.put(qa.o.image_container, 1);
        sparseIntArray.put(qa.o.f48879n, 2);
        sparseIntArray.put(qa.o.f48880p, 3);
        sparseIntArray.put(qa.o.f48881q, 4);
        sparseIntArray.put(qa.o.follower_recycler_view, 5);
        sparseIntArray.put(qa.o.date_text_view, 6);
    }

    public x(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 7, J, K));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l() {
        synchronized (this) {
            this.I = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean w() {
        synchronized (this) {
            return this.I != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void y() {
        synchronized (this) {
            this.I = 1L;
        }
        H();
    }

    public x(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (AppCompatTextView) objArr[6], (RecyclerView) objArr[5], (AppCompatImageView) objArr[2], (FrameLayout) objArr[1], (AppCompatImageView) objArr[3], (AppCompatTextView) objArr[4]);
        this.I = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.H = constraintLayout;
        constraintLayout.setTag(null);
        N(view);
        y();
    }
}
