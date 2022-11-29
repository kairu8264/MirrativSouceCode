package ac;

import android.view.View;
import android.widget.EditText;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes2.dex */
public abstract class a0 extends ViewDataBinding {
    public final ConstraintLayout B;
    public final View C;
    public final AppCompatTextView D;
    public final AppCompatTextView E;
    public final AppCompatTextView F;
    public final EditText G;
    public final View H;
    public final AppCompatTextView I;
    public final AppCompatTextView J;

    public a0(Object obj, View view, int i10, ConstraintLayout constraintLayout, View view2, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, AppCompatTextView appCompatTextView3, EditText editText, View view3, AppCompatTextView appCompatTextView4, AppCompatTextView appCompatTextView5) {
        super(obj, view, i10);
        this.B = constraintLayout;
        this.C = view2;
        this.D = appCompatTextView;
        this.E = appCompatTextView2;
        this.F = appCompatTextView3;
        this.G = editText;
        this.H = view3;
        this.I = appCompatTextView4;
        this.J = appCompatTextView5;
    }

    public static a0 T(View view) {
        return U(view, androidx.databinding.f.d());
    }

    @Deprecated
    public static a0 U(View view, Object obj) {
        return (a0) ViewDataBinding.j(obj, view, xb.p.dialog_fragment_custom_thanks_message);
    }
}
