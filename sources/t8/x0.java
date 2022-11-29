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
import com.dena.mirrativ.catalog.LiveCatalogSmallStreamerView;
import com.dena.mirrativ.catalog.LivePreview;
import com.dena.mirrorman.customview.LiveBadgeView;
import com.dena.mirrorman.customview.LiveCatalogTagView;
import com.dena.mirrorman.customview.LiveTimeView;
import com.dena.mirrorman.customview.MultipleUserView;

/* loaded from: classes.dex */
public class x0 extends w0 {

    /* renamed from: d0  reason: collision with root package name */
    public static final ViewDataBinding.i f53275d0 = null;

    /* renamed from: e0  reason: collision with root package name */
    public static final SparseIntArray f53276e0;

    /* renamed from: b0  reason: collision with root package name */
    public final CardView f53277b0;

    /* renamed from: c0  reason: collision with root package name */
    public long f53278c0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f53276e0 = sparseIntArray;
        sparseIntArray.put(r8.e1.M, 1);
        sparseIntArray.put(r8.e1.new_live_background_view, 2);
        sparseIntArray.put(r8.e1.live_preview, 3);
        sparseIntArray.put(r8.e1.left_top_frame_image_view, 4);
        sparseIntArray.put(r8.e1.avatar_body_image_view, 5);
        sparseIntArray.put(r8.e1.right_bottom_frame_image_view, 6);
        sparseIntArray.put(r8.e1.right_bottom_frame_animation_image_view, 7);
        sparseIntArray.put(r8.e1.f49866h, 8);
        sparseIntArray.put(r8.e1.Q0, 9);
        sparseIntArray.put(r8.e1.H, 10);
        sparseIntArray.put(r8.e1.collab_lottie_animation_view, 11);
        sparseIntArray.put(r8.e1.collab_viewers_view, 12);
        sparseIntArray.put(r8.e1.Z0, 13);
        sparseIntArray.put(r8.e1.f49857a1, 14);
        sparseIntArray.put(r8.e1.live_catalog_tag_view2, 15);
        sparseIntArray.put(r8.e1.live_catalog_tag_view1, 16);
        sparseIntArray.put(r8.e1.live_catalog_small_streamer_view, 17);
        sparseIntArray.put(r8.e1.season_class_icon_image_view, 18);
        sparseIntArray.put(r8.e1.f49858b1, 19);
        sparseIntArray.put(r8.e1.live_game_tab1_text, 20);
        sparseIntArray.put(r8.e1.live_game_tab2_text, 21);
        sparseIntArray.put(r8.e1.viewer_play_live_game_count_text, 22);
        sparseIntArray.put(r8.e1.T2, 23);
        sparseIntArray.put(r8.e1.viewer_divider_view, 24);
        sparseIntArray.put(r8.e1.f49872k3, 25);
        sparseIntArray.put(r8.e1.omotenashi_image_view, 26);
    }

    public x0(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 27, f53275d0, f53276e0));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l() {
        synchronized (this) {
            this.f53278c0 = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean w() {
        synchronized (this) {
            return this.f53278c0 != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void y() {
        synchronized (this) {
            this.f53278c0 = 1L;
        }
        H();
    }

    public x0(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (AppCompatImageView) objArr[8], (AppCompatImageView) objArr[5], (ConstraintLayout) objArr[10], (LottieAnimationView) objArr[11], (MultipleUserView) objArr[12], (ConstraintLayout) objArr[1], (AppCompatImageView) objArr[4], (LiveBadgeView) objArr[9], (LiveCatalogSmallStreamerView) objArr[17], (LiveCatalogTagView) objArr[16], (LiveCatalogTagView) objArr[15], (AppCompatTextView) objArr[20], (AppCompatTextView) objArr[21], (LivePreview) objArr[3], (Barrier) objArr[13], (LiveTimeView) objArr[14], (AppCompatTextView) objArr[19], (View) objArr[2], (AppCompatImageView) objArr[26], (AppCompatImageView) objArr[7], (AppCompatImageView) objArr[6], (AppCompatImageView) objArr[18], (AppCompatTextView) objArr[23], (View) objArr[24], (AppCompatTextView) objArr[22], (MultipleUserView) objArr[25]);
        this.f53278c0 = -1L;
        CardView cardView = (CardView) objArr[0];
        this.f53277b0 = cardView;
        cardView.setTag(null);
        N(view);
        y();
    }
}
