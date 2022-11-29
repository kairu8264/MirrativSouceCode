package ae;

import android.view.View;
import android.webkit.WebView;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes2.dex */
public abstract class g7 extends ViewDataBinding {
    public final WebView B;

    public g7(Object obj, View view, int i10, WebView webView) {
        super(obj, view, i10);
        this.B = webView;
    }

    public static g7 T(View view) {
        return U(view, androidx.databinding.f.d());
    }

    @Deprecated
    public static g7 U(View view, Object obj) {
        return (g7) ViewDataBinding.j(obj, view, nd.b1.fragment_web_view);
    }
}
