package m9;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.Space;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.dena.mirrativ.customview.MirraClassSeasonRatingExpOutLineTextView;

/* loaded from: classes.dex */
public class b extends a {
    public static final ViewDataBinding.i K = null;
    public static final SparseIntArray L;
    public long J;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        L = sparseIntArray;
        sparseIntArray.put(h9.d.season_rating_badge_image, 1);
        sparseIntArray.put(h9.d.season_rating_progress_bar, 2);
        sparseIntArray.put(h9.d.exp_text_bottom_anchor_space, 3);
        sparseIntArray.put(h9.d.season_rating_limit_exp_text, 4);
        sparseIntArray.put(h9.d.season_rating_exp_divider_text, 5);
        sparseIntArray.put(h9.d.season_rating_exp_text, 6);
        sparseIntArray.put(h9.d.season_rating_total_exp_text, 7);
    }

    public b(androidx.databinding.e eVar, View[] viewArr) {
        this(eVar, viewArr, ViewDataBinding.C(eVar, viewArr, 8, K, L));
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

    public b(androidx.databinding.e eVar, View[] viewArr, Object[] objArr) {
        super(eVar, viewArr[0], 0, (Space) objArr[3], (AppCompatImageView) objArr[1], (MirraClassSeasonRatingExpOutLineTextView) objArr[5], (MirraClassSeasonRatingExpOutLineTextView) objArr[6], (MirraClassSeasonRatingExpOutLineTextView) objArr[4], (ProgressBar) objArr[2], (ConstraintLayout) objArr[0], (MirraClassSeasonRatingExpOutLineTextView) objArr[7]);
        this.J = -1L;
        this.H.setTag(null);
        O(viewArr);
        y();
    }
}
