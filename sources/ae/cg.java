package ae;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.ViewDataBinding;
import com.dena.mirrorman.customview.ProfileImageView;
import com.dena.mirrorman.customview.RoundedButtonView;

/* loaded from: classes2.dex */
public abstract class cg extends ViewDataBinding {
    public final RoundedButtonView B;
    public final AppCompatTextView C;
    public final AppCompatImageView D;
    public final AppCompatTextView E;
    public final ProfileImageView F;
    public final AppCompatTextView G;

    public cg(Object obj, View view, int i10, RoundedButtonView roundedButtonView, AppCompatTextView appCompatTextView, AppCompatImageView appCompatImageView, AppCompatTextView appCompatTextView2, ProfileImageView profileImageView, AppCompatTextView appCompatTextView3) {
        super(obj, view, i10);
        this.B = roundedButtonView;
        this.C = appCompatTextView;
        this.D = appCompatImageView;
        this.E = appCompatTextView2;
        this.F = profileImageView;
        this.G = appCompatTextView3;
    }
}
