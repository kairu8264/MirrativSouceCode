package ae;

import android.view.View;
import android.widget.Space;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.ViewDataBinding;
import com.dena.mirrorman.customview.RoundedButtonView;

/* loaded from: classes2.dex */
public abstract class m4 extends ViewDataBinding {
    public final View B;
    public final Space C;
    public final AppCompatTextView D;
    public final RoundedButtonView E;
    public final AppCompatTextView F;
    public final Space G;
    public final AppCompatImageView H;

    public m4(Object obj, View view, int i10, View view2, Space space, AppCompatTextView appCompatTextView, RoundedButtonView roundedButtonView, AppCompatTextView appCompatTextView2, Space space2, AppCompatImageView appCompatImageView) {
        super(obj, view, i10);
        this.B = view2;
        this.C = space;
        this.D = appCompatTextView;
        this.E = roundedButtonView;
        this.F = appCompatTextView2;
        this.G = space2;
        this.H = appCompatImageView;
    }

    public static m4 T(View view) {
        return U(view, androidx.databinding.f.d());
    }

    @Deprecated
    public static m4 U(View view, Object obj) {
        return (m4) ViewDataBinding.j(obj, view, nd.b1.dialog_fragment_shooter_invitation);
    }
}
