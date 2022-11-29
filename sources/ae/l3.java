package ae;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.ViewDataBinding;
import com.dena.mirrorman.customview.RoundedButtonView;

/* loaded from: classes2.dex */
public abstract class l3 extends ViewDataBinding {
    public final RoundedButtonView B;
    public final AppCompatImageView C;
    public final AppCompatTextView D;
    public final AppCompatTextView E;

    public l3(Object obj, View view, int i10, RoundedButtonView roundedButtonView, AppCompatImageView appCompatImageView, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2) {
        super(obj, view, i10);
        this.B = roundedButtonView;
        this.C = appCompatImageView;
        this.D = appCompatTextView;
        this.E = appCompatTextView2;
    }

    public static l3 T(View view) {
        return U(view, androidx.databinding.f.d());
    }

    @Deprecated
    public static l3 U(View view, Object obj) {
        return (l3) ViewDataBinding.j(obj, view, nd.b1.dialog_fragment_invited_collab_call);
    }
}
