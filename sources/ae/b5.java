package ae;

import android.util.SparseIntArray;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.dena.mirrativ.customview.StatusView;
import com.dena.mirrorman.customview.RoundedButtonView;

/* loaded from: classes2.dex */
public class b5 extends a5 {
    public static final ViewDataBinding.i S = null;
    public static final SparseIntArray T;
    public final ConstraintLayout Q;
    public long R;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        T = sparseIntArray;
        sparseIntArray.put(nd.z0.main_content_container, 1);
        sparseIntArray.put(nd.z0.f42352u6, 2);
        sparseIntArray.put(nd.z0.stamp_gift_image_view, 3);
        sparseIntArray.put(nd.z0.stamp_gift_title_text_view, 4);
        sparseIntArray.put(nd.z0.stamp_gift_description_1_text_view, 5);
        sparseIntArray.put(nd.z0.stamp_gift_description_2_text_view, 6);
        sparseIntArray.put(nd.z0.stamp_gift_create_button, 7);
        sparseIntArray.put(nd.z0.rich_gift_image_view, 8);
        sparseIntArray.put(nd.z0.rich_gift_title_text_view, 9);
        sparseIntArray.put(nd.z0.rich_gift_description_1_text_view, 10);
        sparseIntArray.put(nd.z0.rich_gift_description_2_text_view, 11);
        sparseIntArray.put(nd.z0.description_bottom_barrier, 12);
        sparseIntArray.put(nd.z0.rich_gift_create_button, 13);
        sparseIntArray.put(nd.z0.f42268be, 14);
        sparseIntArray.put(nd.z0.A1, 15);
    }

    public b5(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 16, S, T));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l() {
        synchronized (this) {
            this.R = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean w() {
        synchronized (this) {
            return this.R != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void y() {
        synchronized (this) {
            this.R = 1L;
        }
        H();
    }

    public b5(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (AppCompatImageView) objArr[15], (Barrier) objArr[12], (AppCompatImageView) objArr[2], (ConstraintLayout) objArr[1], (RoundedButtonView) objArr[13], (AppCompatTextView) objArr[10], (AppCompatTextView) objArr[11], (AppCompatImageView) objArr[8], (AppCompatTextView) objArr[9], (RoundedButtonView) objArr[7], (AppCompatTextView) objArr[5], (AppCompatTextView) objArr[6], (AppCompatImageView) objArr[3], (AppCompatTextView) objArr[4], (StatusView) objArr[14]);
        this.R = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.Q = constraintLayout;
        constraintLayout.setTag(null);
        N(view);
        y();
    }
}
