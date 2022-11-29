package ae;

import android.view.View;
import android.widget.FrameLayout;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes2.dex */
public abstract class k extends ViewDataBinding {
    public final FrameLayout B;
    public final View C;

    public k(Object obj, View view, int i10, FrameLayout frameLayout, View view2) {
        super(obj, view, i10);
        this.B = frameLayout;
        this.C = view2;
    }
}
