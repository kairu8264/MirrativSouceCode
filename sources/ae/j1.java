package ae;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes2.dex */
public abstract class j1 extends ViewDataBinding {
    public final LinearLayout B;
    public final AppCompatTextView C;
    public final AppCompatTextView D;
    public final AppCompatTextView E;
    public final RelativeLayout F;
    public final AppCompatTextView G;

    public j1(Object obj, View view, int i10, LinearLayout linearLayout, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, AppCompatTextView appCompatTextView3, RelativeLayout relativeLayout, AppCompatTextView appCompatTextView4) {
        super(obj, view, i10);
        this.B = linearLayout;
        this.C = appCompatTextView;
        this.D = appCompatTextView2;
        this.E = appCompatTextView3;
        this.F = relativeLayout;
        this.G = appCompatTextView4;
    }
}
