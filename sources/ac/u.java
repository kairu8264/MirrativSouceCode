package ac;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.dena.mirrorman.customview.RoundedButtonView;

/* loaded from: classes2.dex */
public abstract class u extends ViewDataBinding {
    public final ConstraintLayout B;
    public final AppCompatImageView C;
    public final RoundedButtonView D;

    public u(Object obj, View view, int i10, ConstraintLayout constraintLayout, AppCompatImageView appCompatImageView, RoundedButtonView roundedButtonView) {
        super(obj, view, i10);
        this.B = constraintLayout;
        this.C = appCompatImageView;
        this.D = roundedButtonView;
    }

    public static u T(View view) {
        return U(view, androidx.databinding.f.d());
    }

    @Deprecated
    public static u U(View view, Object obj) {
        return (u) ViewDataBinding.j(obj, view, xb.p.dialog_fragment_became_cheerleader_tutorial);
    }
}
