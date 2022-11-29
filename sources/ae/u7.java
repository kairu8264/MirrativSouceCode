package ae;

import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes2.dex */
public abstract class u7 extends ViewDataBinding {
    public final AppCompatImageView B;
    public final AppCompatImageView C;
    public final AppCompatImageView D;
    public final LinearLayout E;
    public final AppCompatTextView F;
    public final AppCompatTextView G;
    public final AppCompatTextView H;

    public u7(Object obj, View view, int i10, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, AppCompatImageView appCompatImageView3, LinearLayout linearLayout, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, AppCompatTextView appCompatTextView3) {
        super(obj, view, i10);
        this.B = appCompatImageView;
        this.C = appCompatImageView2;
        this.D = appCompatImageView3;
        this.E = linearLayout;
        this.F = appCompatTextView;
        this.G = appCompatTextView2;
        this.H = appCompatTextView3;
    }
}
