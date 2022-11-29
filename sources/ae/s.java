package ae;

import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.dena.mirrativ.customview.StatusView;

/* loaded from: classes2.dex */
public abstract class s extends ViewDataBinding {
    public final LinearLayout B;
    public final AppCompatTextView C;
    public final AppCompatImageView D;
    public final LinearLayout E;
    public final AppCompatTextView F;
    public final ConstraintLayout G;
    public final AppCompatTextView H;
    public final AppCompatTextView I;
    public final StatusView J;
    public final LinearLayout K;
    public final AppCompatImageView L;

    public s(Object obj, View view, int i10, LinearLayout linearLayout, AppCompatTextView appCompatTextView, AppCompatImageView appCompatImageView, LinearLayout linearLayout2, AppCompatTextView appCompatTextView2, ConstraintLayout constraintLayout, AppCompatTextView appCompatTextView3, AppCompatTextView appCompatTextView4, StatusView statusView, LinearLayout linearLayout3, AppCompatImageView appCompatImageView2) {
        super(obj, view, i10);
        this.B = linearLayout;
        this.C = appCompatTextView;
        this.D = appCompatImageView;
        this.E = linearLayout2;
        this.F = appCompatTextView2;
        this.G = constraintLayout;
        this.H = appCompatTextView3;
        this.I = appCompatTextView4;
        this.J = statusView;
        this.K = linearLayout3;
        this.L = appCompatImageView2;
    }
}
