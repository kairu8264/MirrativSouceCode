package ae;

import android.view.View;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes2.dex */
public abstract class a extends ViewDataBinding {
    public final AppCompatButton B;
    public final ConstraintLayout C;
    public final AppCompatButton D;
    public final AppCompatTextView E;
    public final AppCompatImageView F;
    public final View G;
    public final AppCompatTextView H;
    public final Toolbar I;
    public final AppCompatTextView J;
    public final AppCompatTextView K;
    public final AppCompatTextView L;

    public a(Object obj, View view, int i10, AppCompatButton appCompatButton, ConstraintLayout constraintLayout, AppCompatButton appCompatButton2, AppCompatTextView appCompatTextView, AppCompatImageView appCompatImageView, View view2, AppCompatTextView appCompatTextView2, Toolbar toolbar, AppCompatTextView appCompatTextView3, AppCompatTextView appCompatTextView4, AppCompatTextView appCompatTextView5) {
        super(obj, view, i10);
        this.B = appCompatButton;
        this.C = constraintLayout;
        this.D = appCompatButton2;
        this.E = appCompatTextView;
        this.F = appCompatImageView;
        this.G = view2;
        this.H = appCompatTextView2;
        this.I = toolbar;
        this.J = appCompatTextView3;
        this.K = appCompatTextView4;
        this.L = appCompatTextView5;
    }
}
