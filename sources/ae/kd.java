package ae;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.dena.mirrorman.customview.RoundedButtonView;
import com.dena.mirrorman.widget.HtmlTextView;

/* loaded from: classes2.dex */
public abstract class kd extends ViewDataBinding {
    public final AppCompatImageView B;
    public final RoundedButtonView C;
    public final ConstraintLayout D;
    public final HtmlTextView E;
    public final AppCompatImageView F;
    public final AppCompatImageView G;
    public final RoundedButtonView H;

    public kd(Object obj, View view, int i10, AppCompatImageView appCompatImageView, RoundedButtonView roundedButtonView, ConstraintLayout constraintLayout, HtmlTextView htmlTextView, AppCompatImageView appCompatImageView2, AppCompatImageView appCompatImageView3, RoundedButtonView roundedButtonView2) {
        super(obj, view, i10);
        this.B = appCompatImageView;
        this.C = roundedButtonView;
        this.D = constraintLayout;
        this.E = htmlTextView;
        this.F = appCompatImageView2;
        this.G = appCompatImageView3;
        this.H = roundedButtonView2;
    }
}
