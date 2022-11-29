package ae;

import android.view.View;
import android.widget.Space;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.dena.mirrorman.customview.RoundedButtonView;

/* loaded from: classes2.dex */
public abstract class gc extends ViewDataBinding {
    public final Space B;
    public final ConstraintLayout C;
    public final AppCompatTextView D;
    public final TextView E;
    public final RoundedButtonView F;
    public final AppCompatImageView G;
    public final AppCompatImageView H;
    public final AppCompatTextView I;
    public ud.f J;

    public gc(Object obj, View view, int i10, Space space, ConstraintLayout constraintLayout, AppCompatTextView appCompatTextView, TextView textView, RoundedButtonView roundedButtonView, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, AppCompatTextView appCompatTextView2) {
        super(obj, view, i10);
        this.B = space;
        this.C = constraintLayout;
        this.D = appCompatTextView;
        this.E = textView;
        this.F = roundedButtonView;
        this.G = appCompatImageView;
        this.H = appCompatImageView2;
        this.I = appCompatTextView2;
    }

    public abstract void T(ud.f fVar);
}
