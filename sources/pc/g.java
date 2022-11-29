package pc;

import android.view.View;
import android.webkit.WebView;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes2.dex */
public abstract class g extends ViewDataBinding {
    public final WebView B;

    public g(Object obj, View view, int i10, WebView webView) {
        super(obj, view, i10);
        this.B = webView;
    }
}
