package ae;

import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.ViewDataBinding;
import com.dena.mirrorman.customview.RoundedButtonView;

/* loaded from: classes2.dex */
public abstract class l2 extends ViewDataBinding {
    public final AppCompatTextView B;
    public final RoundedButtonView C;
    public final AppCompatTextView D;
    public final RoundedButtonView E;

    public l2(Object obj, View view, int i10, AppCompatTextView appCompatTextView, RoundedButtonView roundedButtonView, AppCompatTextView appCompatTextView2, RoundedButtonView roundedButtonView2) {
        super(obj, view, i10);
        this.B = appCompatTextView;
        this.C = roundedButtonView;
        this.D = appCompatTextView2;
        this.E = roundedButtonView2;
    }

    public static l2 T(View view) {
        return U(view, androidx.databinding.f.d());
    }

    @Deprecated
    public static l2 U(View view, Object obj) {
        return (l2) ViewDataBinding.j(obj, view, nd.b1.dialog_fragment_custom_yes_no_vertical);
    }
}
