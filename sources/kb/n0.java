package kb;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes2.dex */
public abstract class n0 extends ViewDataBinding {
    public final AppCompatTextView B;
    public final AppCompatTextView C;
    public final AppCompatTextView D;
    public final AppCompatImageView E;
    public ud.y0 F;

    public n0(Object obj, View view, int i10, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, AppCompatTextView appCompatTextView3, AppCompatImageView appCompatImageView) {
        super(obj, view, i10);
        this.B = appCompatTextView;
        this.C = appCompatTextView2;
        this.D = appCompatTextView3;
        this.E = appCompatImageView;
    }

    public abstract void T(ud.y0 y0Var);
}
