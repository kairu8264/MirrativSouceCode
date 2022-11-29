package ae;

import android.view.View;
import android.webkit.WebView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes2.dex */
public abstract class v0 extends ViewDataBinding {
    public final AppCompatImageView B;
    public final ConstraintLayout C;
    public final ConstraintLayout D;
    public final WebView E;

    public v0(Object obj, View view, int i10, AppCompatImageView appCompatImageView, ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, WebView webView) {
        super(obj, view, i10);
        this.B = appCompatImageView;
        this.C = constraintLayout;
        this.D = constraintLayout2;
        this.E = webView;
    }

    public static v0 T(View view) {
        return U(view, androidx.databinding.f.d());
    }

    @Deprecated
    public static v0 U(View view, Object obj) {
        return (v0) ViewDataBinding.j(obj, view, nd.b1.dialog_emomo_run_gift_info);
    }
}
