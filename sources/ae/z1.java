package ae;

import android.view.View;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.dena.mirrorman.customview.RoundedButtonView;

/* loaded from: classes2.dex */
public abstract class z1 extends ViewDataBinding {
    public final RoundedButtonView B;
    public final TextView C;
    public final RoundedButtonView D;

    public z1(Object obj, View view, int i10, RoundedButtonView roundedButtonView, TextView textView, RoundedButtonView roundedButtonView2) {
        super(obj, view, i10);
        this.B = roundedButtonView;
        this.C = textView;
        this.D = roundedButtonView2;
    }

    public static z1 T(View view) {
        return U(view, androidx.databinding.f.d());
    }

    @Deprecated
    public static z1 U(View view, Object obj) {
        return (z1) ViewDataBinding.j(obj, view, nd.b1.dialog_fragment_confirm);
    }
}
