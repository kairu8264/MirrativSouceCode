package ae;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes2.dex */
public abstract class p2 extends ViewDataBinding {
    public final AppCompatImageView B;
    public final AppCompatImageView C;
    public final ConstraintLayout D;

    public p2(Object obj, View view, int i10, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, ConstraintLayout constraintLayout) {
        super(obj, view, i10);
        this.B = appCompatImageView;
        this.C = appCompatImageView2;
        this.D = constraintLayout;
    }
}
