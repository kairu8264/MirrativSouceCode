package ae;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.dena.mirrorman.feature.player.EditTextWithOnKeyPreImeListener;

/* loaded from: classes2.dex */
public abstract class c4 extends ViewDataBinding {
    public final AppCompatTextView B;
    public final AppCompatTextView C;
    public final AppCompatImageView D;
    public final ConstraintLayout E;
    public final AppCompatImageView F;
    public final AppCompatTextView G;
    public final AppCompatTextView H;
    public final ConstraintLayout I;
    public final AppCompatTextView J;
    public final EditTextWithOnKeyPreImeListener K;

    public c4(Object obj, View view, int i10, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, AppCompatImageView appCompatImageView, ConstraintLayout constraintLayout, AppCompatImageView appCompatImageView2, AppCompatTextView appCompatTextView3, AppCompatTextView appCompatTextView4, ConstraintLayout constraintLayout2, AppCompatTextView appCompatTextView5, EditTextWithOnKeyPreImeListener editTextWithOnKeyPreImeListener) {
        super(obj, view, i10);
        this.B = appCompatTextView;
        this.C = appCompatTextView2;
        this.D = appCompatImageView;
        this.E = constraintLayout;
        this.F = appCompatImageView2;
        this.G = appCompatTextView3;
        this.H = appCompatTextView4;
        this.I = constraintLayout2;
        this.J = appCompatTextView5;
        this.K = editTextWithOnKeyPreImeListener;
    }

    public static c4 T(View view) {
        return U(view, androidx.databinding.f.d());
    }

    @Deprecated
    public static c4 U(View view, Object obj) {
        return (c4) ViewDataBinding.j(obj, view, nd.b1.dialog_fragment_registration);
    }
}
