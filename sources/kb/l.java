package kb;

import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.dena.mirrorman.customview.FollowsYouView;
import com.dena.mirrorman.customview.ProfileImageView;
import com.dena.mirrorman.customview.RoundedButtonView;

/* loaded from: classes2.dex */
public abstract class l extends ViewDataBinding {
    public final View B;
    public final View C;
    public final ConstraintLayout D;
    public final RoundedButtonView E;
    public final FollowsYouView F;
    public final AppCompatTextView G;
    public final ProfileImageView H;
    public final AppCompatTextView I;
    public final AppCompatTextView J;

    public l(Object obj, View view, int i10, View view2, View view3, ConstraintLayout constraintLayout, RoundedButtonView roundedButtonView, FollowsYouView followsYouView, AppCompatTextView appCompatTextView, ProfileImageView profileImageView, AppCompatTextView appCompatTextView2, AppCompatTextView appCompatTextView3) {
        super(obj, view, i10);
        this.B = view2;
        this.C = view3;
        this.D = constraintLayout;
        this.E = roundedButtonView;
        this.F = followsYouView;
        this.G = appCompatTextView;
        this.H = profileImageView;
        this.I = appCompatTextView2;
        this.J = appCompatTextView3;
    }
}
