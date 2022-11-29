package ae;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes2.dex */
public abstract class si extends ViewDataBinding {
    public final AppCompatImageView B;
    public final View C;
    public final AppCompatImageView D;
    public ud.z3 E;

    public si(Object obj, View view, int i10, AppCompatImageView appCompatImageView, View view2, AppCompatImageView appCompatImageView2) {
        super(obj, view, i10);
        this.B = appCompatImageView;
        this.C = view2;
        this.D = appCompatImageView2;
    }

    public abstract void T(ud.z3 z3Var);
}
