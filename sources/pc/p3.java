package pc;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.Space;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.airbnb.lottie.LottieAnimationView;

/* loaded from: classes2.dex */
public class p3 extends o3 {
    public static final ViewDataBinding.i Y = null;
    public static final SparseIntArray Z;
    public long X;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        Z = sparseIntArray;
        sparseIntArray.put(nc.e.container_scroll_view, 2);
        sparseIntArray.put(nc.e.season_result_title_image_view, 3);
        sparseIntArray.put(nc.e.rank_image_space, 4);
        sparseIntArray.put(nc.e.light_flash_2_image_view, 5);
        sparseIntArray.put(nc.e.light_flash_1_image_view, 6);
        sparseIntArray.put(nc.e.rank_image_view, 7);
        sparseIntArray.put(nc.e.M, 8);
        sparseIntArray.put(nc.e.season_rating_info_container, 9);
        sparseIntArray.put(nc.e.rank_title_text_view, 10);
        sparseIntArray.put(nc.e.f41820b5, 11);
        sparseIntArray.put(nc.e.progressbar, 12);
        sparseIntArray.put(nc.e.exp_container, 13);
        sparseIntArray.put(nc.e.current_exp_text_view, 14);
        sparseIntArray.put(nc.e.divider_text_view, 15);
        sparseIntArray.put(nc.e.limit_exp_text_view, 16);
        sparseIntArray.put(nc.e.current_total_exp_text_view, 17);
        sparseIntArray.put(nc.e.E1, 18);
        sparseIntArray.put(nc.e.rate_info_container, 19);
        sparseIntArray.put(nc.e.period_title_text_view, 20);
        sparseIntArray.put(nc.e.period_text_view, 21);
    }

    public p3(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 22, Y, Z));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l() {
        long j10;
        synchronized (this) {
            j10 = this.X;
            this.X = 0L;
        }
        if ((j10 & 1) != 0) {
            td.c.c(this.C, 20, 1, Integer.valueOf(ViewDataBinding.t(this.C, nc.b.F)), Integer.valueOf(ViewDataBinding.t(this.C, nc.b.B)));
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean w() {
        synchronized (this) {
            return this.X != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void y() {
        synchronized (this) {
            this.X = 1L;
        }
        H();
    }

    public p3(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (LottieAnimationView) objArr[8], (AppCompatButton) objArr[1], (ConstraintLayout) objArr[0], (ScrollView) objArr[2], (AppCompatTextView) objArr[14], (AppCompatTextView) objArr[17], (AppCompatTextView) objArr[18], (AppCompatTextView) objArr[15], (LinearLayoutCompat) objArr[13], (AppCompatImageView) objArr[6], (AppCompatImageView) objArr[5], (AppCompatTextView) objArr[16], (AppCompatTextView) objArr[21], (AppCompatTextView) objArr[20], (ProgressBar) objArr[12], (Space) objArr[4], (AppCompatImageView) objArr[7], (AppCompatTextView) objArr[11], (AppCompatTextView) objArr[10], (ConstraintLayout) objArr[19], (LinearLayoutCompat) objArr[9], (AppCompatImageView) objArr[3]);
        this.X = -1L;
        this.C.setTag(null);
        this.D.setTag(null);
        N(view);
        y();
    }
}
