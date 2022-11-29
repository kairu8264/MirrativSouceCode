package ae;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.Space;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.dena.mirrorman.customview.GiftGachaItemInfoView;

/* loaded from: classes2.dex */
public class pe extends oe {
    public static final ViewDataBinding.i K = null;
    public static final SparseIntArray L;
    public long J;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        L = sparseIntArray;
        sparseIntArray.put(nd.z0.item_anchor_space, 1);
        sparseIntArray.put(nd.z0.item_image_view, 2);
        sparseIntArray.put(nd.z0.detail_image_view_container, 3);
        sparseIntArray.put(nd.z0.detail_image_view, 4);
        sparseIntArray.put(nd.z0.gacha_image_view, 5);
        sparseIntArray.put(nd.z0.event_bonus_image_view, 6);
        sparseIntArray.put(nd.z0.item_info_view, 7);
    }

    public pe(androidx.databinding.e eVar, View view) {
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

    public pe(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (ConstraintLayout) objArr[0], (AppCompatImageView) objArr[4], (ConstraintLayout) objArr[3], (AppCompatImageView) objArr[6], (AppCompatImageView) objArr[5], (Space) objArr[1], (AppCompatImageView) objArr[2], (GiftGachaItemInfoView) objArr[7]);
        this.J = -1L;
        this.B.setTag(null);
        N(view);
        y();
    }
}
