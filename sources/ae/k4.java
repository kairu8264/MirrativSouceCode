package ae;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.dena.mirrorman.feature.player.EditTextWithOnKeyPreImeListener;

/* loaded from: classes2.dex */
public abstract class k4 extends ViewDataBinding {
    public final EditTextWithOnKeyPreImeListener B;
    public final ConstraintLayout C;
    public final AppCompatImageView D;
    public final ConstraintLayout E;
    public final AppCompatImageView F;

    public k4(Object obj, View view, int i10, EditTextWithOnKeyPreImeListener editTextWithOnKeyPreImeListener, ConstraintLayout constraintLayout, AppCompatImageView appCompatImageView, ConstraintLayout constraintLayout2, AppCompatImageView appCompatImageView2) {
        super(obj, view, i10);
        this.B = editTextWithOnKeyPreImeListener;
        this.C = constraintLayout;
        this.D = appCompatImageView;
        this.E = constraintLayout2;
        this.F = appCompatImageView2;
    }

    public static k4 T(View view) {
        return U(view, androidx.databinding.f.d());
    }

    @Deprecated
    public static k4 U(View view, Object obj) {
        return (k4) ViewDataBinding.j(obj, view, nd.b1.dialog_fragment_shooter_comment_input);
    }
}
