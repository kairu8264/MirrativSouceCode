package ac;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ProgressBar;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes2.dex */
public class c3 extends b3 {
    public static final ViewDataBinding.i L = null;
    public static final SparseIntArray M;
    public final ConstraintLayout J;
    public long K;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        M = sparseIntArray;
        sparseIntArray.put(xb.o.header_bg_image_view, 1);
        sparseIntArray.put(xb.o.karaoke_list_toolber, 2);
        sparseIntArray.put(xb.o.U, 3);
        sparseIntArray.put(xb.o.emokara_category_title_text_view, 4);
        sparseIntArray.put(xb.o.karaoke_recycler_view, 5);
        sparseIntArray.put(xb.o.search_floating_button, 6);
        sparseIntArray.put(xb.o.f59999k7, 7);
        sparseIntArray.put(xb.o.f59995j7, 8);
    }

    public c3(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 9, L, M));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l() {
        synchronized (this) {
            this.K = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean w() {
        synchronized (this) {
            return this.K != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void y() {
        synchronized (this) {
            this.K = 1L;
        }
        H();
    }

    public c3(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (View) objArr[3], (AppCompatTextView) objArr[4], (AppCompatImageView) objArr[1], (Toolbar) objArr[2], (RecyclerView) objArr[5], (ProgressBar) objArr[8], (ConstraintLayout) objArr[7], (View) objArr[6]);
        this.K = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.J = constraintLayout;
        constraintLayout.setTag(null);
        N(view);
        y();
    }
}
