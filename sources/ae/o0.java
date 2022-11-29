package ae;

import android.view.View;
import android.widget.ProgressBar;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes2.dex */
public abstract class o0 extends ViewDataBinding {
    public final AppCompatTextView B;
    public final AppCompatButton C;
    public final AppCompatImageView D;
    public final ProgressBar E;
    public final ConstraintLayout F;
    public final AppCompatTextView G;
    public final ConstraintLayout H;
    public final View I;

    public o0(Object obj, View view, int i10, AppCompatTextView appCompatTextView, AppCompatButton appCompatButton, AppCompatImageView appCompatImageView, ProgressBar progressBar, ConstraintLayout constraintLayout, AppCompatTextView appCompatTextView2, ConstraintLayout constraintLayout2, View view2) {
        super(obj, view, i10);
        this.B = appCompatTextView;
        this.C = appCompatButton;
        this.D = appCompatImageView;
        this.E = progressBar;
        this.F = constraintLayout;
        this.G = appCompatTextView2;
        this.H = constraintLayout2;
        this.I = view2;
    }

    public static o0 T(View view) {
        return U(view, androidx.databinding.f.d());
    }

    @Deprecated
    public static o0 U(View view, Object obj) {
        return (o0) ViewDataBinding.j(obj, view, nd.b1.dialog_after_shutter_emomo_onboarding);
    }
}
