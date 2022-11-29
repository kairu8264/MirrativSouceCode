package kb;

import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes2.dex */
public abstract class g1 extends ViewDataBinding {
    public final LinearLayout B;
    public final AppCompatImageView C;
    public final AppCompatTextView D;
    public final LinearLayout E;
    public final AppCompatImageView F;
    public final AppCompatTextView G;
    public final EditText H;
    public final AppCompatTextView I;
    public rf.e J;

    public g1(Object obj, View view, int i10, LinearLayout linearLayout, AppCompatImageView appCompatImageView, AppCompatTextView appCompatTextView, LinearLayout linearLayout2, AppCompatImageView appCompatImageView2, AppCompatTextView appCompatTextView2, EditText editText, AppCompatTextView appCompatTextView3) {
        super(obj, view, i10);
        this.B = linearLayout;
        this.C = appCompatImageView;
        this.D = appCompatTextView;
        this.E = linearLayout2;
        this.F = appCompatImageView2;
        this.G = appCompatTextView2;
        this.H = editText;
        this.I = appCompatTextView3;
    }

    public abstract void T(rf.e eVar);
}
