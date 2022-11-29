package ae;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes2.dex */
public abstract class k7 extends ViewDataBinding {
    public final LinearLayout B;
    public final m0 C;
    public final RelativeLayout D;
    public final AppCompatTextView E;

    public k7(Object obj, View view, int i10, LinearLayout linearLayout, m0 m0Var, RelativeLayout relativeLayout, AppCompatTextView appCompatTextView) {
        super(obj, view, i10);
        this.B = linearLayout;
        this.C = m0Var;
        this.D = relativeLayout;
        this.E = appCompatTextView;
    }
}
