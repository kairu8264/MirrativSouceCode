package ac;

import android.util.SparseIntArray;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes2.dex */
public class z extends y {
    public static final ViewDataBinding.i U = null;
    public static final SparseIntArray V;
    public final ConstraintLayout S;
    public long T;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        V = sparseIntArray;
        sparseIntArray.put(xb.o.top_description_text, 1);
        sparseIntArray.put(xb.o.f60059z2, 2);
        sparseIntArray.put(xb.o.f60006m1, 3);
        sparseIntArray.put(xb.o.f60018o6, 4);
        sparseIntArray.put(xb.o.f60031r6, 5);
        sparseIntArray.put(xb.o.f60026q6, 6);
        sparseIntArray.put(xb.o.f60008m6, 7);
        sparseIntArray.put(xb.o.f60022p6, 8);
        sparseIntArray.put(xb.o.A2, 9);
        sparseIntArray.put(xb.o.f60033s6, 10);
        sparseIntArray.put(xb.o.f60044v6, 11);
        sparseIntArray.put(xb.o.f60039u6, 12);
        sparseIntArray.put(xb.o.f60035t6, 13);
        sparseIntArray.put(xb.o.divider3, 14);
        sparseIntArray.put(xb.o.f59983g6, 15);
        sparseIntArray.put(xb.o.f59991i6, 16);
        sparseIntArray.put(xb.o.f59986h6, 17);
    }

    public z(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 18, U, V));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l() {
        synchronized (this) {
            this.T = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean w() {
        synchronized (this) {
            return this.T != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void y() {
        synchronized (this) {
            this.T = 1L;
        }
        H();
    }

    public z(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (AppCompatImageView) objArr[3], (View) objArr[2], (View) objArr[9], (View) objArr[14], (ConstraintLayout) objArr[15], (AppCompatImageView) objArr[17], (AppCompatTextView) objArr[16], (AppCompatImageView) objArr[7], (ConstraintLayout) objArr[4], (AppCompatTextView) objArr[8], (AppCompatTextView) objArr[6], (AppCompatTextView) objArr[5], (ConstraintLayout) objArr[10], (AppCompatTextView) objArr[13], (AppCompatImageView) objArr[12], (AppCompatTextView) objArr[11], (AppCompatTextView) objArr[1]);
        this.T = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.S = constraintLayout;
        constraintLayout.setTag(null);
        N(view);
        y();
    }
}
