package ac;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.airbnb.lottie.LottieAnimationView;
import com.dena.mirrorman.customview.SwitchableEventBannerIconView;
import com.dena.mirrorman.feature.emomo.EmomoMotionView;
import com.dena.mirrorman.widget.OutlineTextView;
import com.google.android.material.card.MaterialCardView;

/* loaded from: classes2.dex */
public class d extends c {

    /* renamed from: b0  reason: collision with root package name */
    public static final ViewDataBinding.i f851b0 = null;

    /* renamed from: c0  reason: collision with root package name */
    public static final SparseIntArray f852c0;
    public final ConstraintLayout Z;

    /* renamed from: a0  reason: collision with root package name */
    public long f853a0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f852c0 = sparseIntArray;
        sparseIntArray.put(xb.o.M, 1);
        sparseIntArray.put(xb.o.operation_container, 2);
        sparseIntArray.put(xb.o.bottom_shadow_container, 3);
        sparseIntArray.put(xb.o.bottom_shadow_image_view, 4);
        sparseIntArray.put(xb.o.anniversary_shadow_view, 5);
        sparseIntArray.put(xb.o.N2, 6);
        sparseIntArray.put(xb.o.O2, 7);
        sparseIntArray.put(xb.o.closet_image_view, 8);
        sparseIntArray.put(xb.o.prepare_image_view, 9);
        sparseIntArray.put(xb.o.promote_streaming_container, 10);
        sparseIntArray.put(xb.o.badge_container, 11);
        sparseIntArray.put(xb.o.f59993j0, 12);
        sparseIntArray.put(xb.o.badge_sub_title_text_view, 13);
        sparseIntArray.put(xb.o.badge_title_text_view, 14);
        sparseIntArray.put(xb.o.badge_description_text_view, 15);
        sparseIntArray.put(xb.o.remaining_count_container, 16);
        sparseIntArray.put(xb.o.remaining_count_text_view, 17);
        sparseIntArray.put(xb.o.get_text_view, 18);
        sparseIntArray.put(xb.o.f60003l4, 19);
        sparseIntArray.put(xb.o.f60024q1, 20);
        sparseIntArray.put(xb.o.f59975b9, 21);
        sparseIntArray.put(xb.o.event_banner_tutorial_container, 22);
        sparseIntArray.put(xb.o.event_banner_tutorial_card_view, 23);
        sparseIntArray.put(xb.o.f59995j7, 24);
    }

    public d(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 25, f851b0, f852c0));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l() {
        synchronized (this) {
            this.f853a0 = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean w() {
        synchronized (this) {
            return this.f853a0 != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void y() {
        synchronized (this) {
            this.f853a0 = 1L;
        }
        H();
    }

    public d(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (AppCompatImageView) objArr[5], (FrameLayout) objArr[1], (ConstraintLayout) objArr[11], (OutlineTextView) objArr[15], (LottieAnimationView) objArr[12], (OutlineTextView) objArr[13], (OutlineTextView) objArr[14], (ConstraintLayout) objArr[3], (AppCompatImageView) objArr[4], (AppCompatImageView) objArr[20], (AppCompatImageView) objArr[8], (EmomoMotionView) objArr[6], (AppCompatButton) objArr[7], (MaterialCardView) objArr[23], (FrameLayout) objArr[22], (AppCompatTextView) objArr[18], (AppCompatImageView) objArr[19], (ConstraintLayout) objArr[2], (AppCompatTextView) objArr[9], (ProgressBar) objArr[24], (LinearLayout) objArr[10], (ConstraintLayout) objArr[16], (AppCompatTextView) objArr[17], (SwitchableEventBannerIconView) objArr[21]);
        this.f853a0 = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.Z = constraintLayout;
        constraintLayout.setTag(null);
        N(view);
        y();
    }
}
