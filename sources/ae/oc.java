package ae;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.dena.mirrorman.customview.ProfileImageView;
import com.dena.mirrorman.widget.AutoLinkTextView;

/* loaded from: classes2.dex */
public abstract class oc extends ViewDataBinding {
    public final View B;
    public final ConstraintLayout C;
    public final AppCompatImageView D;
    public final AppCompatTextView E;
    public final AutoLinkTextView F;
    public final ProfileImageView G;
    public final AppCompatTextView H;

    public oc(Object obj, View view, int i10, View view2, ConstraintLayout constraintLayout, AppCompatImageView appCompatImageView, AppCompatTextView appCompatTextView, AutoLinkTextView autoLinkTextView, ProfileImageView profileImageView, AppCompatTextView appCompatTextView2) {
        super(obj, view, i10);
        this.B = view2;
        this.C = constraintLayout;
        this.D = appCompatImageView;
        this.E = appCompatTextView;
        this.F = autoLinkTextView;
        this.G = profileImageView;
        this.H = appCompatTextView2;
    }
}
