package ae;

import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes2.dex */
public abstract class ud extends ViewDataBinding {
    public final AppCompatImageView B;
    public final ConstraintLayout C;
    public final ConstraintLayout D;
    public final ImageView E;
    public ud.a0 F;

    public ud(Object obj, View view, int i10, AppCompatImageView appCompatImageView, ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, ImageView imageView) {
        super(obj, view, i10);
        this.B = appCompatImageView;
        this.C = constraintLayout;
        this.D = constraintLayout2;
        this.E = imageView;
    }

    public abstract void T(ud.a0 a0Var);
}
