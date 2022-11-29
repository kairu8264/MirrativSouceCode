package ae;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes2.dex */
public abstract class qm extends ViewDataBinding {
    public final ConstraintLayout B;
    public final AppCompatTextView C;
    public final AppCompatImageView D;
    public ud.y3 E;

    public qm(Object obj, View view, int i10, ConstraintLayout constraintLayout, AppCompatTextView appCompatTextView, AppCompatImageView appCompatImageView) {
        super(obj, view, i10);
        this.B = constraintLayout;
        this.C = appCompatTextView;
        this.D = appCompatImageView;
    }

    public abstract void T(ud.y3 y3Var);
}
