package s9;

import android.view.View;
import android.widget.SeekBar;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes.dex */
public abstract class w extends ViewDataBinding {
    public final ConstraintLayout B;
    public final View C;
    public final SeekBar D;
    public final ConstraintLayout E;
    public final AppCompatTextView F;
    public final View G;

    public w(Object obj, View view, int i10, ConstraintLayout constraintLayout, View view2, SeekBar seekBar, ConstraintLayout constraintLayout2, AppCompatTextView appCompatTextView, View view3) {
        super(obj, view, i10);
        this.B = constraintLayout;
        this.C = view2;
        this.D = seekBar;
        this.E = constraintLayout2;
        this.F = appCompatTextView;
        this.G = view3;
    }

    public static w T(View view) {
        return U(view, androidx.databinding.f.d());
    }

    @Deprecated
    public static w U(View view, Object obj) {
        return (w) ViewDataBinding.j(obj, view, q9.h.dialog_fragment_color_gradient_picker);
    }
}
