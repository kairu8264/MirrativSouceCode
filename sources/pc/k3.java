package pc;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes2.dex */
public abstract class k3 extends ViewDataBinding {
    public final AppCompatTextView B;
    public final AppCompatTextView C;
    public final AppCompatImageView D;
    public final AppCompatTextView E;
    public final AppCompatTextView F;
    public final AppCompatTextView G;
    public final AppCompatTextView H;
    public ad.m2 I;

    public k3(Object obj, View view, int i10, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, AppCompatImageView appCompatImageView, AppCompatTextView appCompatTextView3, AppCompatTextView appCompatTextView4, AppCompatTextView appCompatTextView5, AppCompatTextView appCompatTextView6) {
        super(obj, view, i10);
        this.B = appCompatTextView;
        this.C = appCompatTextView2;
        this.D = appCompatImageView;
        this.E = appCompatTextView3;
        this.F = appCompatTextView4;
        this.G = appCompatTextView5;
        this.H = appCompatTextView6;
    }

    public abstract void T(ad.m2 m2Var);
}
