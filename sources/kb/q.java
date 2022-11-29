package kb;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.Space;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.ViewDataBinding;
import com.dena.mirrorman.customview.FollowTextView;
import com.dena.mirrorman.customview.FollowsYouView;
import com.dena.mirrorman.customview.LiveRequestClapView;
import com.dena.mirrorman.customview.LiveRequestCountView;
import com.dena.mirrorman.customview.ProfileImageView;
import hb.w1;

/* loaded from: classes2.dex */
public class q extends p {
    public static final ViewDataBinding.i X = null;
    public static final SparseIntArray Y;
    public final ConstraintLayout V;
    public long W;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        Y = sparseIntArray;
        sparseIntArray.put(w1.J3, 1);
        sparseIntArray.put(w1.K3, 2);
        sparseIntArray.put(w1.A1, 3);
        sparseIntArray.put(w1.f35014m, 4);
        sparseIntArray.put(w1.f35012l, 5);
        sparseIntArray.put(w1.f35006i, 6);
        sparseIntArray.put(w1.following_follow_text_view, 7);
        sparseIntArray.put(w1.follower_follow_text_view, 8);
        sparseIntArray.put(w1.ribbon_image_view, 9);
        sparseIntArray.put(w1.G3, 10);
        sparseIntArray.put(w1.user_following_text_view, 11);
        sparseIntArray.put(w1.I3, 12);
        sparseIntArray.put(w1.A3, 13);
        sparseIntArray.put(w1.J2, 14);
        sparseIntArray.put(w1.f35030x3, 15);
        sparseIntArray.put(w1.f34996c2, 16);
        sparseIntArray.put(w1.f34993b2, 17);
        sparseIntArray.put(w1.f34992a2, 18);
        sparseIntArray.put(w1.live_request_clap_bottom_anchor_space, 19);
        sparseIntArray.put(w1.repeat_image_view, 20);
    }

    public q(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 21, X, Y));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l() {
        synchronized (this) {
            this.W = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean w() {
        synchronized (this) {
            return this.W != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void y() {
        synchronized (this) {
            this.W = 1L;
        }
        H();
    }

    public q(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (AppCompatImageView) objArr[6], (AppCompatImageView) objArr[5], (View) objArr[4], (FollowTextView) objArr[8], (FollowTextView) objArr[7], (Guideline) objArr[3], (Space) objArr[19], (LiveRequestClapView) objArr[18], (Space) objArr[17], (LiveRequestCountView) objArr[16], (ProfileImageView) objArr[14], (AppCompatImageView) objArr[20], (AppCompatImageView) objArr[9], (AppCompatTextView) objArr[15], (AppCompatImageView) objArr[13], (FollowsYouView) objArr[11], (AppCompatTextView) objArr[10], (AppCompatTextView) objArr[12], (Guideline) objArr[1], (Guideline) objArr[2]);
        this.W = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.V = constraintLayout;
        constraintLayout.setTag(null);
        N(view);
        y();
    }
}
