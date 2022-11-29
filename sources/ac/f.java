package ac;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.dena.mirrativ.customview.StatusView;
import com.dena.mirrorman.customview.RoundedButtonView;

/* loaded from: classes2.dex */
public class f extends e {
    public static final ViewDataBinding.i O = null;
    public static final SparseIntArray P;
    public final ConstraintLayout M;
    public long N;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        P = sparseIntArray;
        sparseIntArray.put(xb.o.I9, 1);
        sparseIntArray.put(xb.o.V, 2);
        sparseIntArray.put(xb.o.G9, 3);
        sparseIntArray.put(xb.o.f60017o2, 4);
        sparseIntArray.put(xb.o.inner_container, 5);
        sparseIntArray.put(xb.o.target_user_image_view, 6);
        sparseIntArray.put(xb.o.edit_text, 7);
        sparseIntArray.put(xb.o.f60045v7, 8);
        sparseIntArray.put(xb.o.Q8, 9);
        sparseIntArray.put(xb.o.start_private_stream_image_view, 10);
        sparseIntArray.put(xb.o.covered_progress_container, 11);
    }

    public f(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 12, O, P));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l() {
        synchronized (this) {
            this.N = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean w() {
        synchronized (this) {
            return this.N != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void y() {
        synchronized (this) {
            this.N = 1L;
        }
        H();
    }

    public f(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (AppCompatImageView) objArr[2], (FrameLayout) objArr[11], (AppCompatTextView) objArr[4], (EditText) objArr[7], (ConstraintLayout) objArr[5], (RecyclerView) objArr[8], (RoundedButtonView) objArr[10], (StatusView) objArr[9], (AppCompatImageView) objArr[6], (AppCompatTextView) objArr[3], (Toolbar) objArr[1]);
        this.N = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.M = constraintLayout;
        constraintLayout.setTag(null);
        N(view);
        y();
    }
}
