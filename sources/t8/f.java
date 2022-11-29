package t8;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.databinding.ViewDataBinding;
import com.dena.mirrativ.customview.StatusView;
import com.google.android.material.appbar.AppBarLayout;

/* loaded from: classes.dex */
public class f extends e {
    public static final ViewDataBinding.i T = null;
    public static final SparseIntArray U;
    public long S;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        U = sparseIntArray;
        sparseIntArray.put(r8.e1.f49861e1, 1);
        sparseIntArray.put(r8.e1.f49863f, 2);
        sparseIntArray.put(r8.e1.C0, 3);
        sparseIntArray.put(r8.e1.bg_mission_catalog_image_view, 4);
        sparseIntArray.put(r8.e1.header_title_text_image_view, 5);
        sparseIntArray.put(r8.e1.header_description_text_view, 6);
        sparseIntArray.put(r8.e1.mission_daily_button, 7);
        sparseIntArray.put(r8.e1.mission_weekly_button, 8);
        sparseIntArray.put(r8.e1.daily_button_badge_image_view, 9);
        sparseIntArray.put(r8.e1.daily_button_badge_text_view, 10);
        sparseIntArray.put(r8.e1.weekly_button_badge_image_view, 11);
        sparseIntArray.put(r8.e1.weekly_button_badge_text_view, 12);
        sparseIntArray.put(r8.e1.O, 13);
        sparseIntArray.put(r8.e1.G2, 14);
        sparseIntArray.put(r8.e1.guide_mirrabit_image_view, 15);
        sparseIntArray.put(r8.e1.D, 16);
    }

    public f(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 17, T, U));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l() {
        synchronized (this) {
            this.S = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean w() {
        synchronized (this) {
            return this.S != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void y() {
        synchronized (this) {
            this.S = 1L;
        }
        H();
    }

    public f(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (AppBarLayout) objArr[2], (AppCompatImageView) objArr[4], (AppCompatImageView) objArr[16], (FrameLayout) objArr[13], (CoordinatorLayout) objArr[0], (AppCompatImageView) objArr[9], (AppCompatTextView) objArr[10], (AppCompatImageView) objArr[15], (ConstraintLayout) objArr[3], (AppCompatTextView) objArr[6], (AppCompatImageView) objArr[5], (ConstraintLayout) objArr[1], (AppCompatButton) objArr[7], (AppCompatButton) objArr[8], (StatusView) objArr[14], (AppCompatImageView) objArr[11], (AppCompatTextView) objArr[12]);
        this.S = -1L;
        this.F.setTag(null);
        N(view);
        y();
    }
}
