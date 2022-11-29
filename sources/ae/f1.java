package ae;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.ViewDataBinding;
import com.dena.mirrorman.customview.RoundedButtonView;

/* loaded from: classes2.dex */
public abstract class f1 extends ViewDataBinding {
    public final AppCompatImageView B;
    public final RoundedButtonView C;
    public final AppCompatImageView D;
    public final AppCompatTextView E;
    public final AppCompatTextView F;
    public final AppCompatTextView G;

    public f1(Object obj, View view, int i10, AppCompatImageView appCompatImageView, RoundedButtonView roundedButtonView, AppCompatImageView appCompatImageView2, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, AppCompatTextView appCompatTextView3) {
        super(obj, view, i10);
        this.B = appCompatImageView;
        this.C = roundedButtonView;
        this.D = appCompatImageView2;
        this.E = appCompatTextView;
        this.F = appCompatTextView2;
        this.G = appCompatTextView3;
    }

    public static f1 T(View view) {
        return U(view, androidx.databinding.f.d());
    }

    @Deprecated
    public static f1 U(View view, Object obj) {
        return (f1) ViewDataBinding.j(obj, view, nd.b1.dialog_fragment_app_user_id_warning);
    }
}
