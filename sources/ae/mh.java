package ae;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.dena.mirrorman.customview.ProfileImageView;

/* loaded from: classes2.dex */
public abstract class mh extends ViewDataBinding {
    public final AppCompatImageView B;
    public final AppCompatImageView C;
    public final AppCompatTextView D;
    public final AppCompatTextView E;
    public final ConstraintLayout F;
    public final ProfileImageView G;

    public mh(Object obj, View view, int i10, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, ConstraintLayout constraintLayout, ProfileImageView profileImageView) {
        super(obj, view, i10);
        this.B = appCompatImageView;
        this.C = appCompatImageView2;
        this.D = appCompatTextView;
        this.E = appCompatTextView2;
        this.F = constraintLayout;
        this.G = profileImageView;
    }
}
