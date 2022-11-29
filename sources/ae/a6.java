package ae;

import android.view.View;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes2.dex */
public abstract class a6 extends ViewDataBinding {
    public final AppCompatTextView B;
    public final AppCompatButton C;
    public final AppCompatButton D;
    public final AppCompatTextView E;

    public a6(Object obj, View view, int i10, AppCompatTextView appCompatTextView, AppCompatButton appCompatButton, AppCompatButton appCompatButton2, AppCompatTextView appCompatTextView2) {
        super(obj, view, i10);
        this.B = appCompatTextView;
        this.C = appCompatButton;
        this.D = appCompatButton2;
        this.E = appCompatTextView2;
    }

    public static a6 T(View view) {
        return U(view, androidx.databinding.f.d());
    }

    @Deprecated
    public static a6 U(View view, Object obj) {
        return (a6) ViewDataBinding.j(obj, view, nd.b1.dialog_simple_yes_or_no);
    }
}
