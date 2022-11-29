package s9;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes.dex */
public abstract class m0 extends ViewDataBinding {
    public final AppCompatImageView B;
    public final ConstraintLayout C;
    public ud.o D;

    public m0(Object obj, View view, int i10, AppCompatImageView appCompatImageView, ConstraintLayout constraintLayout) {
        super(obj, view, i10);
        this.B = appCompatImageView;
        this.C = constraintLayout;
    }

    public abstract void T(ud.o oVar);
}
