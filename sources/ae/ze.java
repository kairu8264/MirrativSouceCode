package ae;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.Space;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.dena.mirrorman.customview.BorderedTextView;
import com.dena.mirrorman.customview.GiftGachaItemInfoView;

/* loaded from: classes2.dex */
public class ze extends ye {
    public static final ViewDataBinding.i L = null;
    public static final SparseIntArray M;
    public long K;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        M = sparseIntArray;
        sparseIntArray.put(nd.z0.rare_item_background_image_view, 1);
        sparseIntArray.put(nd.z0.rare_border_background_image_view, 2);
        sparseIntArray.put(nd.z0.item_image_view, 3);
        sparseIntArray.put(nd.z0.detail_image_view_container, 4);
        sparseIntArray.put(nd.z0.detail_image_view, 5);
        sparseIntArray.put(nd.z0.duplicated_point_bottom_anchor_space, 6);
        sparseIntArray.put(nd.z0.duplicated_point_text_view, 7);
        sparseIntArray.put(nd.z0.item_info_view, 8);
    }

    public ze(androidx.databinding.e eVar, View view) {
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

    public ze(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (ConstraintLayout) objArr[0], (AppCompatImageView) objArr[5], (ConstraintLayout) objArr[4], (Space) objArr[6], (BorderedTextView) objArr[7], (AppCompatImageView) objArr[3], (GiftGachaItemInfoView) objArr[8], (AppCompatImageView) objArr[2], (AppCompatImageView) objArr[1]);
        this.K = -1L;
        this.B.setTag(null);
        N(view);
        y();
    }
}
