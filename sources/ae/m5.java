package ae;

import android.view.View;
import android.webkit.WebView;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes2.dex */
public abstract class m5 extends ViewDataBinding {
    public final ImageButton B;
    public final WebView C;
    public final RelativeLayout D;

    public m5(Object obj, View view, int i10, ImageButton imageButton, WebView webView, RelativeLayout relativeLayout) {
        super(obj, view, i10);
        this.B = imageButton;
        this.C = webView;
        this.D = relativeLayout;
    }
}
