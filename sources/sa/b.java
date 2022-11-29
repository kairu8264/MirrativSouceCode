package sa;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.Space;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.databinding.ViewDataBinding;
import androidx.viewpager.widget.ViewPager;
import com.dena.mirrativ.customview.MirraClassSeasonRatingCardView;
import com.dena.mirrorman.customview.TriangleView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.tabs.TabLayout;

/* loaded from: classes2.dex */
public class b extends a {
    public static final ViewDataBinding.i S = null;
    public static final SparseIntArray T;
    public final ConstraintLayout Q;
    public long R;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        T = sparseIntArray;
        sparseIntArray.put(qa.o.f48875a, 1);
        sparseIntArray.put(qa.o.L, 2);
        sparseIntArray.put(qa.o.J, 3);
        sparseIntArray.put(qa.o.notice_settings_image_view, 4);
        sparseIntArray.put(qa.o.f48883t, 5);
        sparseIntArray.put(qa.o.f48884u, 6);
        sparseIntArray.put(qa.o.f48882s, 7);
        sparseIntArray.put(qa.o.I, 8);
        sparseIntArray.put(qa.o.N, 9);
        sparseIntArray.put(qa.o.season_rating_views, 10);
        sparseIntArray.put(qa.o.season_rating_card_view, 11);
        sparseIntArray.put(qa.o.season_rating_popup_anchor_space, 12);
        sparseIntArray.put(qa.o.season_rating_popup_card_view, 13);
        sparseIntArray.put(qa.o.season_rating_popup_text_view, 14);
        sparseIntArray.put(qa.o.season_rating_popup_edge_view, 15);
    }

    public b(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 16, S, T));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l() {
        synchronized (this) {
            this.R = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean w() {
        synchronized (this) {
            return this.R != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void y() {
        synchronized (this) {
            this.R = 1L;
        }
        H();
    }

    public b(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (AppBarLayout) objArr[1], (View) objArr[7], (ConstraintLayout) objArr[5], (AppCompatImageView) objArr[6], (AppCompatImageView) objArr[4], (MirraClassSeasonRatingCardView) objArr[11], (Space) objArr[12], (MaterialCardView) objArr[13], (TriangleView) objArr[15], (AppCompatTextView) objArr[14], (Group) objArr[10], (TabLayout) objArr[8], (AppCompatTextView) objArr[3], (Toolbar) objArr[2], (ViewPager) objArr[9]);
        this.R = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.Q = constraintLayout;
        constraintLayout.setTag(null);
        N(view);
        y();
    }
}
