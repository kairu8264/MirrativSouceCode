package ae;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.ViewDataBinding;
import com.dena.mirrorman.customview.RoundedButtonView;

/* loaded from: classes2.dex */
public abstract class r1 extends ViewDataBinding {
    public final AppCompatImageView B;
    public final AppCompatTextView C;
    public final RoundedButtonView D;
    public final AppCompatTextView E;

    public r1(Object obj, View view, int i10, AppCompatImageView appCompatImageView, AppCompatTextView appCompatTextView, RoundedButtonView roundedButtonView, AppCompatTextView appCompatTextView2) {
        super(obj, view, i10);
        this.B = appCompatImageView;
        this.C = appCompatTextView;
        this.D = roundedButtonView;
        this.E = appCompatTextView2;
    }

    public static r1 T(View view) {
        return U(view, androidx.databinding.f.d());
    }

    @Deprecated
    public static r1 U(View view, Object obj) {
        return (r1) ViewDataBinding.j(obj, view, nd.b1.dialog_fragment_collab_matching_retry_dialog);
    }
}
