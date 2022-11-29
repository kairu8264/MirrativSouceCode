package pc;

import ae.e8;
import android.view.View;
import android.webkit.WebView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.dena.mirrativ.customview.StatusView;

/* loaded from: classes2.dex */
public abstract class i extends ViewDataBinding {
    public final AppCompatTextView B;
    public final ConstraintLayout C;
    public final StatusView D;
    public final e8 E;
    public final WebView F;

    public i(Object obj, View view, int i10, AppCompatTextView appCompatTextView, ConstraintLayout constraintLayout, StatusView statusView, e8 e8Var, WebView webView) {
        super(obj, view, i10);
        this.B = appCompatTextView;
        this.C = constraintLayout;
        this.D = statusView;
        this.E = e8Var;
        this.F = webView;
    }
}
