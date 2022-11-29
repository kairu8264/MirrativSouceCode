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
public class te extends se {
    public static final ViewDataBinding.i L = null;
    public static final SparseIntArray M;
    public long K;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        M = sparseIntArray;
        sparseIntArray.put(nd.z0.item_anchor_space, 1);
        sparseIntArray.put(nd.z0.item_image_view, 2);
        sparseIntArray.put(nd.z0.detail_image_view_container, 3);
        sparseIntArray.put(nd.z0.detail_image_view, 4);
        sparseIntArray.put(nd.z0.kaburi_point_bottom_anchor_space, 5);
        sparseIntArray.put(nd.z0.duplicated_point_text_view, 6);
        sparseIntArray.put(nd.z0.gacha_image_view, 7);
        sparseIntArray.put(nd.z0.item_info_view, 8);
    }

    public te(androidx.databinding.e eVar, View view) {
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

    public te(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (ConstraintLayout) objArr[0], (AppCompatImageView) objArr[4], (ConstraintLayout) objArr[3], (BorderedTextView) objArr[6], (AppCompatImageView) objArr[7], (Space) objArr[1], (AppCompatImageView) objArr[2], (GiftGachaItemInfoView) objArr[8], (Space) objArr[5]);
        this.K = -1L;
        this.B.setTag(null);
        N(view);
        y();
    }
}
