package ae;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes2.dex */
public abstract class n2 extends ViewDataBinding {
    public final AppCompatImageView B;
    public final AppCompatImageView C;

    public n2(Object obj, View view, int i10, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2) {
        super(obj, view, i10);
        this.B = appCompatImageView;
        this.C = appCompatImageView2;
    }

    public static n2 T(View view) {
        return U(view, androidx.databinding.f.d());
    }

    @Deprecated
    public static n2 U(View view, Object obj) {
        return (n2) ViewDataBinding.j(obj, view, nd.b1.dialog_fragment_emomo_dress_up_help_image);
    }
}
