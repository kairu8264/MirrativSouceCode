package ae;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.ViewDataBinding;
import com.dena.mirrorman.customview.RoundedButtonView;

/* loaded from: classes2.dex */
public abstract class p1 extends ViewDataBinding {
    public final AppCompatImageView B;
    public final RoundedButtonView C;
    public final AppCompatTextView D;

    public p1(Object obj, View view, int i10, AppCompatImageView appCompatImageView, RoundedButtonView roundedButtonView, AppCompatTextView appCompatTextView) {
        super(obj, view, i10);
        this.B = appCompatImageView;
        this.C = roundedButtonView;
        this.D = appCompatTextView;
    }

    public static p1 T(View view) {
        return U(view, androidx.databinding.f.d());
    }

    @Deprecated
    public static p1 U(View view, Object obj) {
        return (p1) ViewDataBinding.j(obj, view, nd.b1.dialog_fragment_collab_matching_error_dialog);
    }
}
