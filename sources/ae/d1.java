package ae;

import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes2.dex */
public abstract class d1 extends ViewDataBinding {
    public final AppCompatTextView B;
    public final AppCompatTextView C;
    public final AppCompatTextView D;
    public final AppCompatTextView E;
    public final AppCompatTextView F;
    public final ConstraintLayout G;
    public final AppCompatTextView H;

    public d1(Object obj, View view, int i10, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, AppCompatTextView appCompatTextView3, AppCompatTextView appCompatTextView4, AppCompatTextView appCompatTextView5, ConstraintLayout constraintLayout, AppCompatTextView appCompatTextView6) {
        super(obj, view, i10);
        this.B = appCompatTextView;
        this.C = appCompatTextView2;
        this.D = appCompatTextView3;
        this.E = appCompatTextView4;
        this.F = appCompatTextView5;
        this.G = constraintLayout;
        this.H = appCompatTextView6;
    }

    public static d1 T(View view) {
        return U(view, androidx.databinding.f.d());
    }

    @Deprecated
    public static d1 U(View view, Object obj) {
        return (d1) ViewDataBinding.j(obj, view, nd.b1.dialog_fragment_app_user_id_confirm);
    }
}
