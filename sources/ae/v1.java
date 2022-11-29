package ae;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.dena.mirrorman.customview.RoundedButtonView;

/* loaded from: classes2.dex */
public abstract class v1 extends ViewDataBinding {
    public final RoundedButtonView B;
    public final ConstraintLayout C;
    public final RoundedButtonView D;
    public final AppCompatImageView E;
    public final AppCompatImageView F;
    public final AppCompatImageView G;
    public final AppCompatTextView H;

    public v1(Object obj, View view, int i10, RoundedButtonView roundedButtonView, ConstraintLayout constraintLayout, RoundedButtonView roundedButtonView2, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, AppCompatImageView appCompatImageView3, AppCompatTextView appCompatTextView) {
        super(obj, view, i10);
        this.B = roundedButtonView;
        this.C = constraintLayout;
        this.D = roundedButtonView2;
        this.E = appCompatImageView;
        this.F = appCompatImageView2;
        this.G = appCompatImageView3;
        this.H = appCompatTextView;
    }

    public static v1 T(View view) {
        return U(view, androidx.databinding.f.d());
    }

    @Deprecated
    public static v1 U(View view, Object obj) {
        return (v1) ViewDataBinding.j(obj, view, nd.b1.dialog_fragment_collab_request);
    }
}
