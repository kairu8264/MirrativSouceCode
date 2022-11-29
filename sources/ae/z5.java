package ae;

import android.util.SparseIntArray;
import android.view.View;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes2.dex */
public class z5 extends y5 {
    public static final ViewDataBinding.i K = null;
    public static final SparseIntArray L;
    public final ConstraintLayout I;
    public long J;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        L = sparseIntArray;
        sparseIntArray.put(nd.z0.M8, 1);
        sparseIntArray.put(nd.z0.Oa, 2);
        sparseIntArray.put(nd.z0.named_to_moderator_text_view, 3);
        sparseIntArray.put(nd.z0.moderator_description_text_view, 4);
        sparseIntArray.put(nd.z0.f42375z6, 5);
        sparseIntArray.put(nd.z0.help_icon_image_view, 6);
        sparseIntArray.put(nd.z0.R9, 7);
    }

    public z5(androidx.databinding.e eVar, View view) {
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

    public z5(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (AppCompatImageView) objArr[6], (AppCompatTextView) objArr[5], (AppCompatTextView) objArr[4], (AppCompatImageView) objArr[1], (AppCompatTextView) objArr[3], (AppCompatButton) objArr[7], (View) objArr[2]);
        this.J = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.I = constraintLayout;
        constraintLayout.setTag(null);
        N(view);
        y();
    }
}
