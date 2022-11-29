package ka;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.Space;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.Toolbar;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.databinding.ViewDataBinding;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.dena.mirrorman.customview.RoundedButtonView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import ja.l;

/* loaded from: classes.dex */
public class d extends c {

    /* renamed from: d0  reason: collision with root package name */
    public static final ViewDataBinding.i f38505d0 = null;

    /* renamed from: e0  reason: collision with root package name */
    public static final SparseIntArray f38506e0;

    /* renamed from: c0  reason: collision with root package name */
    public long f38507c0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f38506e0 = sparseIntArray;
        sparseIntArray.put(l.f37431h, 1);
        sparseIntArray.put(l.f37428a, 2);
        sparseIntArray.put(l.collapsing_toolbar_container, 3);
        sparseIntArray.put(l.live_game_cover_image_view, 4);
        sparseIntArray.put(l.live_game_banner_image_view, 5);
        sparseIntArray.put(l.live_game_animated_banner_image_view, 6);
        sparseIntArray.put(l.live_game_icon_spacer, 7);
        sparseIntArray.put(l.live_game_icon_image_view, 8);
        sparseIntArray.put(l.live_game_tile_text_view, 9);
        sparseIntArray.put(l.live_game_caption_text_view, 10);
        sparseIntArray.put(l.start_live_game_button, 11);
        sparseIntArray.put(l.f37429c, 12);
        sparseIntArray.put(l.provider_text_view, 13);
        sparseIntArray.put(l.provider_link_text_view, 14);
        sparseIntArray.put(l.f37432i, 15);
        sparseIntArray.put(l.mission_compose_view, 16);
        sparseIntArray.put(l.E, 17);
        sparseIntArray.put(l.toolbar_icon_image_view, 18);
        sparseIntArray.put(l.toolbar_start_live_game_button, 19);
        sparseIntArray.put(l.catalog_layout, 20);
        sparseIntArray.put(l.empty_view_container, 21);
        sparseIntArray.put(l.no_contents_image_view, 22);
        sparseIntArray.put(l.no_contents_text_view, 23);
        sparseIntArray.put(l.close_button_layout, 24);
        sparseIntArray.put(l.close_button_background_view, 25);
        sparseIntArray.put(l.f37430e, 26);
    }

    public d(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 27, f38505d0, f38506e0));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l() {
        synchronized (this) {
            this.f38507c0 = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean w() {
        synchronized (this) {
            return this.f38507c0 != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void y() {
        synchronized (this) {
            this.f38507c0 = 1L;
        }
        H();
    }

    public d(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (AppBarLayout) objArr[2], (FrameLayout) objArr[20], (AppCompatTextView) objArr[12], (View) objArr[25], (AppCompatImageView) objArr[26], (ConstraintLayout) objArr[24], (CollapsingToolbarLayout) objArr[3], (CoordinatorLayout) objArr[1], (View) objArr[15], (ConstraintLayout) objArr[21], (AppCompatImageView) objArr[6], (AppCompatImageView) objArr[5], (AppCompatTextView) objArr[10], (ConstraintLayout) objArr[4], (AppCompatImageView) objArr[8], (Space) objArr[7], (AppCompatTextView) objArr[9], (ComposeView) objArr[16], (AppCompatImageView) objArr[22], (AppCompatTextView) objArr[23], (AppCompatTextView) objArr[14], (AppCompatTextView) objArr[13], (RoundedButtonView) objArr[11], (SwipeRefreshLayout) objArr[0], (Toolbar) objArr[17], (AppCompatImageView) objArr[18], (RoundedButtonView) objArr[19]);
        this.f38507c0 = -1L;
        this.Y.setTag(null);
        N(view);
        y();
    }
}
