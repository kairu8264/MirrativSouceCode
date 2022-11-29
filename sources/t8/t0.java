package t8;

import android.util.SparseIntArray;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.dena.mirrorman.customview.LiveAnnounceAppView;

/* loaded from: classes.dex */
public class t0 extends s0 {
    public static final ViewDataBinding.i K = null;
    public static final SparseIntArray L;
    public final CardView I;
    public long J;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        L = sparseIntArray;
        sparseIntArray.put(r8.e1.dashboard_live_announcement, 1);
        sparseIntArray.put(r8.e1.f49859b3, 2);
        sparseIntArray.put(r8.e1.f49876n, 3);
        sparseIntArray.put(r8.e1.f49862e3, 4);
        sparseIntArray.put(r8.e1.announcement_time_text_view, 5);
        sparseIntArray.put(r8.e1.body_text_view, 6);
        sparseIntArray.put(r8.e1.P0, 7);
    }

    public t0(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 8, K, L));
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

    public t0(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (AppCompatTextView) objArr[5], (AppCompatImageView) objArr[3], (AppCompatTextView) objArr[6], (ConstraintLayout) objArr[1], (LiveAnnounceAppView) objArr[7], (AppCompatImageView) objArr[2], (AppCompatTextView) objArr[4]);
        this.J = -1L;
        CardView cardView = (CardView) objArr[0];
        this.I = cardView;
        cardView.setTag(null);
        N(view);
        y();
    }
}
