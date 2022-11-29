package s9;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes.dex */
public abstract class a1 extends ViewDataBinding {
    public final View B;
    public final AppCompatImageView C;
    public jf.l0 D;

    public a1(Object obj, View view, int i10, View view2, AppCompatImageView appCompatImageView) {
        super(obj, view, i10);
        this.B = view2;
        this.C = appCompatImageView;
    }

    public abstract void T(jf.l0 l0Var);
}
