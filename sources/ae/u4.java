package ae;

import android.view.View;
import android.widget.Space;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.dena.mirrorman.customview.RoundedButtonView;

/* loaded from: classes2.dex */
public abstract class u4 extends ViewDataBinding {
    public final AppCompatTextView B;
    public final AppCompatTextView C;
    public final ConstraintLayout D;
    public final Space E;
    public final AppCompatImageView F;
    public final RoundedButtonView G;
    public final AppCompatTextView H;

    public u4(Object obj, View view, int i10, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, ConstraintLayout constraintLayout, Space space, AppCompatImageView appCompatImageView, RoundedButtonView roundedButtonView, AppCompatTextView appCompatTextView3) {
        super(obj, view, i10);
        this.B = appCompatTextView;
        this.C = appCompatTextView2;
        this.D = constraintLayout;
        this.E = space;
        this.F = appCompatImageView;
        this.G = roundedButtonView;
        this.H = appCompatTextView3;
    }

    public static u4 T(View view) {
        return U(view, androidx.databinding.f.d());
    }

    @Deprecated
    public static u4 U(View view, Object obj) {
        return (u4) ViewDataBinding.j(obj, view, nd.b1.dialog_fragment_shooter_matching_request_started);
    }
}
