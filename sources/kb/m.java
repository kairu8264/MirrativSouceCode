package kb;

import android.util.SparseIntArray;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.dena.mirrorman.customview.FollowsYouView;
import com.dena.mirrorman.customview.ProfileImageView;
import com.dena.mirrorman.customview.RoundedButtonView;
import hb.w1;

/* loaded from: classes2.dex */
public class m extends l {
    public static final ViewDataBinding.i M = null;
    public static final SparseIntArray N;
    public final ConstraintLayout K;
    public long L;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        N = sparseIntArray;
        sparseIntArray.put(w1.f35014m, 1);
        sparseIntArray.put(w1.J2, 2);
        sparseIntArray.put(w1.I3, 3);
        sparseIntArray.put(w1.follows_you_view, 4);
        sparseIntArray.put(w1.f35021r, 5);
        sparseIntArray.put(w1.urge_follow_view, 6);
        sparseIntArray.put(w1.follow_view, 7);
        sparseIntArray.put(w1.follow_later_container, 8);
        sparseIntArray.put(w1.T1, 9);
    }

    public m(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 10, M, N));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l() {
        synchronized (this) {
            this.L = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean w() {
        synchronized (this) {
            return this.L != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void y() {
        synchronized (this) {
            this.L = 1L;
        }
        H();
    }

    public m(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (View) objArr[1], (View) objArr[5], (ConstraintLayout) objArr[8], (RoundedButtonView) objArr[7], (FollowsYouView) objArr[4], (AppCompatTextView) objArr[9], (ProfileImageView) objArr[2], (AppCompatTextView) objArr[6], (AppCompatTextView) objArr[3]);
        this.L = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.K = constraintLayout;
        constraintLayout.setTag(null);
        N(view);
        y();
    }
}
