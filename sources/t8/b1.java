package t8;

import android.util.SparseIntArray;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.cardview.widget.CardView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.dena.mirrorman.customview.LiveBadgeView;
import com.dena.mirrorman.customview.LiveCatalogStreamerView;
import com.dena.mirrorman.customview.LiveCatalogUserAppStatusView;
import com.dena.mirrorman.customview.LiveTimeView;

/* loaded from: classes.dex */
public class b1 extends a1 {
    public static final ViewDataBinding.i Q = null;
    public static final SparseIntArray R;
    public final CardView O;
    public long P;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        R = sparseIntArray;
        sparseIntArray.put(r8.e1.new_live_background_view, 1);
        sparseIntArray.put(r8.e1.Q1, 2);
        sparseIntArray.put(r8.e1.avatar_body_image_view, 3);
        sparseIntArray.put(r8.e1.left_top_frame_image_view, 4);
        sparseIntArray.put(r8.e1.right_bottom_frame_image_view, 5);
        sparseIntArray.put(r8.e1.right_bottom_frame_animation_image_view, 6);
        sparseIntArray.put(r8.e1.Q0, 7);
        sparseIntArray.put(r8.e1.f49857a1, 8);
        sparseIntArray.put(r8.e1.live_catalog_streamer_view, 9);
        sparseIntArray.put(r8.e1.viewer_recycler_view, 10);
        sparseIntArray.put(r8.e1.user_app_status_view1, 11);
        sparseIntArray.put(r8.e1.user_app_status_view2, 12);
        sparseIntArray.put(r8.e1.T2, 13);
    }

    public b1(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 14, Q, R));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l() {
        synchronized (this) {
            this.P = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean w() {
        synchronized (this) {
            return this.P != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void y() {
        synchronized (this) {
            this.P = 1L;
        }
        H();
    }

    public b1(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (AppCompatImageView) objArr[3], (AppCompatImageView) objArr[4], (LiveBadgeView) objArr[7], (LiveCatalogStreamerView) objArr[9], (LiveTimeView) objArr[8], (View) objArr[1], (AppCompatImageView) objArr[2], (AppCompatImageView) objArr[6], (AppCompatImageView) objArr[5], (AppCompatTextView) objArr[13], (LiveCatalogUserAppStatusView) objArr[11], (LiveCatalogUserAppStatusView) objArr[12], (RecyclerView) objArr[10]);
        this.P = -1L;
        CardView cardView = (CardView) objArr[0];
        this.O = cardView;
        cardView.setTag(null);
        N(view);
        y();
    }
}
