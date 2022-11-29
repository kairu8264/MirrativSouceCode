package s9;

import android.util.SparseIntArray;
import android.view.View;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public class t extends s {
    public static final ViewDataBinding.i K = null;
    public static final SparseIntArray L;
    public long J;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        L = sparseIntArray;
        sparseIntArray.put(q9.g.window_background, 1);
        sparseIntArray.put(q9.g.G, 2);
        sparseIntArray.put(q9.g.T3, 3);
        sparseIntArray.put(q9.g.closet_recycler_view, 4);
        sparseIntArray.put(q9.g.touch_intercept_view, 5);
        sparseIntArray.put(q9.g.closet_name_edit_text, 6);
        sparseIntArray.put(q9.g.D2, 7);
    }

    public t(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 8, K, L));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l() {
        synchronized (this) {
            this.J = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean w() {
        synchronized (this) {
            return this.J != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void y() {
        synchronized (this) {
            this.J = 1L;
        }
        H();
    }

    public t(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (View) objArr[2], (AppCompatEditText) objArr[6], (RecyclerView) objArr[4], (ConstraintLayout) objArr[0], (ConstraintLayout) objArr[7], (AppCompatTextView) objArr[3], (View) objArr[5], (View) objArr[1]);
        this.J = -1L;
        this.E.setTag(null);
        N(view);
        y();
    }
}
