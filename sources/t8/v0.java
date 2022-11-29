package t8;

import android.util.SparseIntArray;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.airbnb.lottie.LottieAnimationView;
import com.dena.mirrativ.catalog.LivePreview;
import com.dena.mirrorman.customview.FollowingLabelView;
import com.dena.mirrorman.customview.LiveBadgeView;
import com.dena.mirrorman.customview.LiveCatalogStreamerView;
import com.dena.mirrorman.customview.LiveCatalogTagView;
import com.dena.mirrorman.customview.LiveCatalogUserAppStatusView;
import com.dena.mirrorman.customview.LiveTimeView;
import com.dena.mirrorman.customview.MultipleUserView;

/* loaded from: classes.dex */
public class v0 extends u0 {

    /* renamed from: g0  reason: collision with root package name */
    public static final ViewDataBinding.i f53271g0 = null;

    /* renamed from: h0  reason: collision with root package name */
    public static final SparseIntArray f53272h0;

    /* renamed from: f0  reason: collision with root package name */
    public long f53273f0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f53272h0 = sparseIntArray;
        sparseIntArray.put(r8.e1.M, 1);
        sparseIntArray.put(r8.e1.live_preview, 2);
        sparseIntArray.put(r8.e1.avatar_body_image_view, 3);
        sparseIntArray.put(r8.e1.left_top_frame_image_view, 4);
        sparseIntArray.put(r8.e1.right_bottom_frame_image_view, 5);
        sparseIntArray.put(r8.e1.f49866h, 6);
        sparseIntArray.put(r8.e1.Q0, 7);
        sparseIntArray.put(r8.e1.H, 8);
        sparseIntArray.put(r8.e1.collab_lottie_animation_view, 9);
        sparseIntArray.put(r8.e1.collab_viewers_view, 10);
        sparseIntArray.put(r8.e1.Z0, 11);
        sparseIntArray.put(r8.e1.f49857a1, 12);
        sparseIntArray.put(r8.e1.live_catalog_tag_view1, 13);
        sparseIntArray.put(r8.e1.live_catalog_tag_view2, 14);
        sparseIntArray.put(r8.e1.label_container, 15);
        sparseIntArray.put(r8.e1.recommend_container, 16);
        sparseIntArray.put(r8.e1.recommend_image_view, 17);
        sparseIntArray.put(r8.e1.recommend_text_view, 18);
        sparseIntArray.put(r8.e1.omotenashi_container, 19);
        sparseIntArray.put(r8.e1.omotenashi_image_view, 20);
        sparseIntArray.put(r8.e1.right_bottom_frame_animation_image_view, 21);
        sparseIntArray.put(r8.e1.f49858b1, 22);
        sparseIntArray.put(r8.e1.user_app_status_view1, 23);
        sparseIntArray.put(r8.e1.user_app_status_view2, 24);
        sparseIntArray.put(r8.e1.live_catalog_streamer_view, 25);
        sparseIntArray.put(r8.e1.season_class_icon_image_view, 26);
        sparseIntArray.put(r8.e1.T2, 27);
        sparseIntArray.put(r8.e1.f49872k3, 28);
        sparseIntArray.put(r8.e1.f49869j0, 29);
    }

    public v0(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 30, f53271g0, f53272h0));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l() {
        synchronized (this) {
            this.f53273f0 = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean w() {
        synchronized (this) {
            return this.f53273f0 != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void y() {
        synchronized (this) {
            this.f53273f0 = 1L;
        }
        H();
    }

    public v0(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (AppCompatImageView) objArr[6], (AppCompatImageView) objArr[3], (CardView) objArr[0], (ConstraintLayout) objArr[8], (LottieAnimationView) objArr[9], (MultipleUserView) objArr[10], (ConstraintLayout) objArr[1], (FollowingLabelView) objArr[29], (ConstraintLayout) objArr[15], (AppCompatImageView) objArr[4], (LiveBadgeView) objArr[7], (LiveCatalogStreamerView) objArr[25], (LiveCatalogTagView) objArr[13], (LiveCatalogTagView) objArr[14], (LivePreview) objArr[2], (Barrier) objArr[11], (LiveTimeView) objArr[12], (AppCompatTextView) objArr[22], (ConstraintLayout) objArr[19], (AppCompatImageView) objArr[20], (ConstraintLayout) objArr[16], (AppCompatImageView) objArr[17], (AppCompatTextView) objArr[18], (AppCompatImageView) objArr[21], (AppCompatImageView) objArr[5], (AppCompatImageView) objArr[26], (AppCompatTextView) objArr[27], (LiveCatalogUserAppStatusView) objArr[23], (LiveCatalogUserAppStatusView) objArr[24], (MultipleUserView) objArr[28]);
        this.f53273f0 = -1L;
        this.D.setTag(null);
        N(view);
        y();
    }
}
