package ae;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes2.dex */
public abstract class we extends ViewDataBinding {
    public final AppCompatImageView B;
    public final AppCompatImageView C;
    public final View D;
    public final AppCompatImageView E;
    public final AppCompatTextView F;
    public ud.k0 G;

    public we(Object obj, View view, int i10, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, View view2, AppCompatImageView appCompatImageView3, AppCompatTextView appCompatTextView) {
        super(obj, view, i10);
        this.B = appCompatImageView;
        this.C = appCompatImageView2;
        this.D = view2;
        this.E = appCompatImageView3;
        this.F = appCompatTextView;
    }

    public abstract void T(ud.k0 k0Var);
}
