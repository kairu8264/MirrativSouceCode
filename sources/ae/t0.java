package ae;

import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes2.dex */
public abstract class t0 extends ViewDataBinding {
    public final AppCompatButton B;
    public final AppCompatButton C;
    public final LinearLayout D;
    public final AppCompatTextView E;
    public final AppCompatTextView F;

    public t0(Object obj, View view, int i10, AppCompatButton appCompatButton, AppCompatButton appCompatButton2, LinearLayout linearLayout, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2) {
        super(obj, view, i10);
        this.B = appCompatButton;
        this.C = appCompatButton2;
        this.D = linearLayout;
        this.E = appCompatTextView;
        this.F = appCompatTextView2;
    }
}
