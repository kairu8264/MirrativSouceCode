package pc;

import android.view.View;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes2.dex */
public abstract class k extends ViewDataBinding {
    public final FrameLayout B;
    public final ConstraintLayout C;
    public final i3 D;

    public k(Object obj, View view, int i10, FrameLayout frameLayout, ConstraintLayout constraintLayout, i3 i3Var) {
        super(obj, view, i10);
        this.B = frameLayout;
        this.C = constraintLayout;
        this.D = i3Var;
    }
}
