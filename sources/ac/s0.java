package ac;

import android.view.View;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.dena.mirrorman.customview.RoundedButtonView;

/* loaded from: classes2.dex */
public abstract class s0 extends ViewDataBinding {
    public final ConstraintLayout B;
    public final AppCompatEditText C;
    public final RoundedButtonView D;
    public final AppCompatTextView E;
    public final AppCompatTextView F;

    public s0(Object obj, View view, int i10, ConstraintLayout constraintLayout, AppCompatEditText appCompatEditText, RoundedButtonView roundedButtonView, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2) {
        super(obj, view, i10);
        this.B = constraintLayout;
        this.C = appCompatEditText;
        this.D = roundedButtonView;
        this.E = appCompatTextView;
        this.F = appCompatTextView2;
    }

    public static s0 T(View view) {
        return U(view, androidx.databinding.f.d());
    }

    @Deprecated
    public static s0 U(View view, Object obj) {
        return (s0) ViewDataBinding.j(obj, view, xb.p.dialog_fragment_group_shot_gallery_comment_input);
    }
}
