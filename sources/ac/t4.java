package ac;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes2.dex */
public abstract class t4 extends ViewDataBinding {
    public final LinearLayout B;
    public final AppCompatTextView C;
    public final AppCompatTextView D;
    public final RelativeLayout E;
    public final AppCompatTextView F;

    public t4(Object obj, View view, int i10, LinearLayout linearLayout, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, RelativeLayout relativeLayout, AppCompatTextView appCompatTextView3) {
        super(obj, view, i10);
        this.B = linearLayout;
        this.C = appCompatTextView;
        this.D = appCompatTextView2;
        this.E = relativeLayout;
        this.F = appCompatTextView3;
    }
}
