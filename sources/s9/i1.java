package s9;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.ViewDataBinding;
import ud.t3;

/* loaded from: classes.dex */
public abstract class i1 extends ViewDataBinding {
    public final View B;
    public final AppCompatImageView C;
    public t3 D;

    public i1(Object obj, View view, int i10, View view2, AppCompatImageView appCompatImageView) {
        super(obj, view, i10);
        this.B = view2;
        this.C = appCompatImageView;
    }

    public abstract void T(t3 t3Var);
}
