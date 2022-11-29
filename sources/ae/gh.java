package ae;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes2.dex */
public abstract class gh extends ViewDataBinding {
    public final AppCompatImageView B;
    public final AppCompatTextView C;
    public final AppCompatImageView D;
    public final ConstraintLayout E;
    public ud.m F;

    public gh(Object obj, View view, int i10, AppCompatImageView appCompatImageView, AppCompatTextView appCompatTextView, AppCompatImageView appCompatImageView2, ConstraintLayout constraintLayout) {
        super(obj, view, i10);
        this.B = appCompatImageView;
        this.C = appCompatTextView;
        this.D = appCompatImageView2;
        this.E = constraintLayout;
    }

    public abstract void T(ud.m mVar);
}
