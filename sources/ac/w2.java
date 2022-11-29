package ac;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.EditText;
import android.widget.ProgressBar;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes2.dex */
public class w2 extends v2 {
    public static final ViewDataBinding.i P = null;
    public static final SparseIntArray Q;
    public final ConstraintLayout N;
    public long O;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        Q = sparseIntArray;
        sparseIntArray.put(xb.o.header_bg_image_view, 1);
        sparseIntArray.put(xb.o.karaoke_search_toolber, 2);
        sparseIntArray.put(xb.o.T7, 3);
        sparseIntArray.put(xb.o.S7, 4);
        sparseIntArray.put(xb.o.U7, 5);
        sparseIntArray.put(xb.o.f59990i1, 6);
        sparseIntArray.put(xb.o.f59969a1, 7);
        sparseIntArray.put(xb.o.N5, 8);
        sparseIntArray.put(xb.o.search_history_recycler_view, 9);
        sparseIntArray.put(xb.o.search_result_recycler_view, 10);
        sparseIntArray.put(xb.o.f59999k7, 11);
        sparseIntArray.put(xb.o.f59995j7, 12);
    }

    public w2(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 13, P, Q));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l() {
        synchronized (this) {
            this.O = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean w() {
        synchronized (this) {
            return this.O != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void y() {
        synchronized (this) {
            this.O = 1L;
        }
        H();
    }

    public w2(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (AppCompatTextView) objArr[7], (View) objArr[6], (AppCompatImageView) objArr[1], (Toolbar) objArr[2], (AppCompatImageView) objArr[8], (ProgressBar) objArr[12], (ConstraintLayout) objArr[11], (View) objArr[4], (View) objArr[3], (EditText) objArr[5], (RecyclerView) objArr[9], (RecyclerView) objArr[10]);
        this.O = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.N = constraintLayout;
        constraintLayout.setTag(null);
        N(view);
        y();
    }
}
