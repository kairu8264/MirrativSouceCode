package ae;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.airbnb.lottie.LottieAnimationView;
import com.dena.mirrorman.customview.BottomNavigationTutorialCoverView;

/* loaded from: classes2.dex */
public class zk extends yk {

    /* renamed from: b0  reason: collision with root package name */
    public static final ViewDataBinding.i f1519b0 = null;

    /* renamed from: c0  reason: collision with root package name */
    public static final SparseIntArray f1520c0;
    public final ConstraintLayout Z;

    /* renamed from: a0  reason: collision with root package name */
    public long f1521a0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f1520c0 = sparseIntArray;
        sparseIntArray.put(nd.z0.bottom_navigation_edge_border, 1);
        sparseIntArray.put(nd.z0.bottom_navigation_bg, 2);
        sparseIntArray.put(nd.z0.bottom_navigation_container, 3);
        sparseIntArray.put(nd.z0.dashboard_container, 4);
        sparseIntArray.put(nd.z0.dashboard_lottie, 5);
        sparseIntArray.put(nd.z0.dashboard_text_view, 6);
        sparseIntArray.put(nd.z0.dashboard_pochi, 7);
        sparseIntArray.put(nd.z0.live_game_container, 8);
        sparseIntArray.put(nd.z0.live_game_lottie, 9);
        sparseIntArray.put(nd.z0.live_game_text_view, 10);
        sparseIntArray.put(nd.z0.live_game_pochi, 11);
        sparseIntArray.put(nd.z0.broadcast_button_shadow_view, 12);
        sparseIntArray.put(nd.z0.broadcast_btn_image_view, 13);
        sparseIntArray.put(nd.z0.broadcast_text_view, 14);
        sparseIntArray.put(nd.z0.icon_live_streaming, 15);
        sparseIntArray.put(nd.z0.following_container, 16);
        sparseIntArray.put(nd.z0.following_lottie, 17);
        sparseIntArray.put(nd.z0.f42300j5, 18);
        sparseIntArray.put(nd.z0.following_pochi, 19);
        sparseIntArray.put(nd.z0.notice_container, 20);
        sparseIntArray.put(nd.z0.notice_lottie, 21);
        sparseIntArray.put(nd.z0.E9, 22);
        sparseIntArray.put(nd.z0.notice_pochi, 23);
        sparseIntArray.put(nd.z0.tutorial_cover, 24);
    }

    public zk(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 25, f1519b0, f1520c0));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l() {
        synchronized (this) {
            this.f1521a0 = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean w() {
        synchronized (this) {
            return this.f1521a0 != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void y() {
        synchronized (this) {
            this.f1521a0 = 1L;
        }
        H();
    }

    public zk(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (View) objArr[2], (LinearLayout) objArr[3], (View) objArr[1], (AppCompatImageView) objArr[13], (View) objArr[12], (AppCompatTextView) objArr[14], (ConstraintLayout) objArr[4], (LottieAnimationView) objArr[5], (View) objArr[7], (AppCompatTextView) objArr[6], (ConstraintLayout) objArr[16], (LottieAnimationView) objArr[17], (View) objArr[19], (AppCompatTextView) objArr[18], (AppCompatImageView) objArr[15], (ConstraintLayout) objArr[8], (LottieAnimationView) objArr[9], (View) objArr[11], (AppCompatTextView) objArr[10], (ConstraintLayout) objArr[20], (LottieAnimationView) objArr[21], (View) objArr[23], (AppCompatTextView) objArr[22], (BottomNavigationTutorialCoverView) objArr[24]);
        this.f1521a0 = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.Z = constraintLayout;
        constraintLayout.setTag(null);
        N(view);
        y();
    }
}
