package ae;

import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.ViewDataBinding;
import com.dena.mirrorman.customview.RoundedButtonView;

/* loaded from: classes2.dex */
public abstract class f2 extends ViewDataBinding {
    public final RoundedButtonView B;
    public final AppCompatTextView C;

    public f2(Object obj, View view, int i10, RoundedButtonView roundedButtonView, AppCompatTextView appCompatTextView) {
        super(obj, view, i10);
        this.B = roundedButtonView;
        this.C = appCompatTextView;
    }

    public static f2 T(View view) {
        return U(view, androidx.databinding.f.d());
    }

    @Deprecated
    public static f2 U(View view, Object obj) {
        return (f2) ViewDataBinding.j(obj, view, nd.b1.dialog_fragment_confirmation_popup);
    }
}
