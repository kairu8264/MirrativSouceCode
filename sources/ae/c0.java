package ae;

import android.view.View;
import android.webkit.WebView;
import androidx.databinding.ViewDataBinding;
import com.dena.mirrativ.customview.StatusView;

/* loaded from: classes2.dex */
public abstract class c0 extends ViewDataBinding {
    public final StatusView B;
    public final WebView C;

    public c0(Object obj, View view, int i10, StatusView statusView, WebView webView) {
        super(obj, view, i10);
        this.B = statusView;
        this.C = webView;
    }
}
