package ae;

import android.view.View;
import android.webkit.WebView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes2.dex */
public abstract class k5 extends ViewDataBinding {
    public final AppCompatImageView B;
    public final ConstraintLayout C;
    public final WebView D;

    public k5(Object obj, View view, int i10, AppCompatImageView appCompatImageView, ConstraintLayout constraintLayout, WebView webView) {
        super(obj, view, i10);
        this.B = appCompatImageView;
        this.C = constraintLayout;
        this.D = webView;
    }

    public static k5 T(View view) {
        return U(view, androidx.databinding.f.d());
    }

    @Deprecated
    public static k5 U(View view, Object obj) {
        return (k5) ViewDataBinding.j(obj, view, nd.b1.dialog_fragment_web_view_pop_up);
    }
}
