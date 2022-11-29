package ac;

import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes2.dex */
public abstract class x1 extends ViewDataBinding {
    public final ComposeView B;
    public final ConstraintLayout C;

    public x1(Object obj, View view, int i10, ComposeView composeView, ConstraintLayout constraintLayout) {
        super(obj, view, i10);
        this.B = composeView;
        this.C = constraintLayout;
    }
}
