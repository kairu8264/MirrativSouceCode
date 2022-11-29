package pc;

import ae.e8;
import android.view.View;
import android.webkit.WebView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.databinding.ViewDataBinding;
import com.dena.mirrativ.customview.StatusView;

/* loaded from: classes2.dex */
public abstract class a2 extends ViewDataBinding {
    public final AppCompatButton B;
    public final StatusView C;
    public final WebView D;
    public final e8 E;

    public a2(Object obj, View view, int i10, AppCompatButton appCompatButton, StatusView statusView, WebView webView, e8 e8Var) {
        super(obj, view, i10);
        this.B = appCompatButton;
        this.C = statusView;
        this.D = webView;
        this.E = e8Var;
    }

    public static a2 T(View view) {
        return U(view, androidx.databinding.f.d());
    }

    @Deprecated
    public static a2 U(View view, Object obj) {
        return (a2) ViewDataBinding.j(obj, view, nc.f.fragment_contract_terms);
    }
}
