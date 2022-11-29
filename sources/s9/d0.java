package s9;

import android.util.SparseIntArray;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.dena.mirrorman.customview.RemainingKandumeView;

/* loaded from: classes.dex */
public class d0 extends c0 {
    public static final ViewDataBinding.i M = null;
    public static final SparseIntArray N;
    public final ConstraintLayout K;
    public long L;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        N = sparseIntArray;
        sparseIntArray.put(q9.g.S3, 1);
        sparseIntArray.put(q9.g.remaining_kandume_view, 2);
        sparseIntArray.put(q9.g.J, 3);
        sparseIntArray.put(q9.g.border_title_view, 4);
        sparseIntArray.put(q9.g.parts_recycler_view, 5);
        sparseIntArray.put(q9.g.border_avatars_view, 6);
        sparseIntArray.put(q9.g.purchase_button, 7);
        sparseIntArray.put(q9.g.kandume_image_view, 8);
        sparseIntArray.put(q9.g.T2, 9);
    }

    public d0(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 10, M, N));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l() {
        synchronized (this) {
            this.L = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean w() {
        synchronized (this) {
            return this.L != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void y() {
        synchronized (this) {
            this.L = 1L;
        }
        H();
    }

    public d0(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (View) objArr[6], (View) objArr[4], (AppCompatImageView) objArr[3], (AppCompatImageView) objArr[8], (RecyclerView) objArr[5], (ConstraintLayout) objArr[7], (RemainingKandumeView) objArr[2], (AppCompatTextView) objArr[9], (AppCompatTextView) objArr[1]);
        this.L = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.K = constraintLayout;
        constraintLayout.setTag(null);
        N(view);
        y();
    }
}
