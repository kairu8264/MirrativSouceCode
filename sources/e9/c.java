package e9;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.f;
import com.dena.mirrorman.customview.RoundedButtonView;
import d9.e;

/* loaded from: classes.dex */
public abstract class c extends ViewDataBinding {
    public final AppCompatTextView B;
    public final ConstraintLayout C;
    public final AppCompatImageView D;
    public final RoundedButtonView E;
    public final SwitchCompat F;
    public final AppCompatTextView G;
    public final RoundedButtonView H;
    public final AppCompatTextView I;

    public c(Object obj, View view, int i10, AppCompatTextView appCompatTextView, ConstraintLayout constraintLayout, AppCompatImageView appCompatImageView, RoundedButtonView roundedButtonView, SwitchCompat switchCompat, AppCompatTextView appCompatTextView2, RoundedButtonView roundedButtonView2, AppCompatTextView appCompatTextView3) {
        super(obj, view, i10);
        this.B = appCompatTextView;
        this.C = constraintLayout;
        this.D = appCompatImageView;
        this.E = roundedButtonView;
        this.F = switchCompat;
        this.G = appCompatTextView2;
        this.H = roundedButtonView2;
        this.I = appCompatTextView3;
    }

    public static c T(View view) {
        return U(view, f.d());
    }

    @Deprecated
    public static c U(View view, Object obj) {
        return (c) ViewDataBinding.j(obj, view, e.dialog_fragment_collab_matching_setting_dialog);
    }
}
