package kb;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.Space;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.dena.mirrorman.customview.FollowTextView;
import com.dena.mirrorman.customview.FollowView;
import com.dena.mirrorman.customview.FollowsYouView;
import com.dena.mirrorman.customview.LiveRequestClapView;
import com.dena.mirrorman.customview.LiveRequestCountView;
import com.dena.mirrorman.customview.ProfileImageView;
import hb.w1;

/* loaded from: classes2.dex */
public class s extends r {
    public static final ViewDataBinding.i Z = null;

    /* renamed from: a0  reason: collision with root package name */
    public static final SparseIntArray f38542a0;
    public final ConstraintLayout X;
    public long Y;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f38542a0 = sparseIntArray;
        sparseIntArray.put(w1.f35014m, 1);
        sparseIntArray.put(w1.f35012l, 2);
        sparseIntArray.put(w1.f35006i, 3);
        sparseIntArray.put(w1.following_follow_text_view, 4);
        sparseIntArray.put(w1.follower_follow_text_view, 5);
        sparseIntArray.put(w1.G3, 6);
        sparseIntArray.put(w1.user_following_text_view, 7);
        sparseIntArray.put(w1.ribbon_image_view, 8);
        sparseIntArray.put(w1.I3, 9);
        sparseIntArray.put(w1.A3, 10);
        sparseIntArray.put(w1.J2, 11);
        sparseIntArray.put(w1.F0, 12);
        sparseIntArray.put(w1.follow_view, 13);
        sparseIntArray.put(w1.X2, 14);
        sparseIntArray.put(w1.ribbon_recycler_view, 15);
        sparseIntArray.put(w1.f34999f, 16);
        sparseIntArray.put(w1.f35022r0, 17);
        sparseIntArray.put(w1.f35030x3, 18);
        sparseIntArray.put(w1.f34996c2, 19);
        sparseIntArray.put(w1.f34993b2, 20);
        sparseIntArray.put(w1.f34992a2, 21);
        sparseIntArray.put(w1.repeat_image_view, 22);
    }

    public s(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 23, Z, f38542a0));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l() {
        synchronized (this) {
            this.Y = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean w() {
        synchronized (this) {
            return this.Y != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void y() {
        synchronized (this) {
            this.Y = 1L;
        }
        H();
    }

    public s(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (RecyclerView) objArr[16], (AppCompatImageView) objArr[3], (AppCompatImageView) objArr[2], (View) objArr[1], (View) objArr[17], (FollowView) objArr[13], (Space) objArr[12], (FollowTextView) objArr[5], (FollowTextView) objArr[4], (LiveRequestClapView) objArr[21], (Space) objArr[20], (LiveRequestCountView) objArr[19], (ProfileImageView) objArr[11], (ConstraintLayout) objArr[14], (AppCompatImageView) objArr[22], (AppCompatImageView) objArr[8], (RecyclerView) objArr[15], (AppCompatTextView) objArr[18], (AppCompatImageView) objArr[10], (FollowsYouView) objArr[7], (AppCompatTextView) objArr[6], (AppCompatTextView) objArr[9]);
        this.Y = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.X = constraintLayout;
        constraintLayout.setTag(null);
        N(view);
        y();
    }
}
