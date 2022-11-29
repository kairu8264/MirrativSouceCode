package ka;

import android.view.View;
import android.webkit.WebView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.dena.mirrativ.customview.StatusView;

/* loaded from: classes.dex */
public abstract class e extends ViewDataBinding {
    public final AppCompatImageView B;
    public final ConstraintLayout C;
    public final StatusView D;
    public final WebView E;

    public e(Object obj, View view, int i10, AppCompatImageView appCompatImageView, ConstraintLayout constraintLayout, StatusView statusView, WebView webView) {
        super(obj, view, i10);
        this.B = appCompatImageView;
        this.C = constraintLayout;
        this.D = statusView;
        this.E = webView;
    }
}
