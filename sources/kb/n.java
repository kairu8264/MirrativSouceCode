package kb;

import android.view.View;
import android.widget.FrameLayout;
import androidx.databinding.ViewDataBinding;
import hb.x1;

/* loaded from: classes2.dex */
public abstract class n extends ViewDataBinding {
    public final FrameLayout B;

    public n(Object obj, View view, int i10, FrameLayout frameLayout) {
        super(obj, view, i10);
        this.B = frameLayout;
    }

    public static n T(View view) {
        return U(view, androidx.databinding.f.d());
    }

    @Deprecated
    public static n U(View view, Object obj) {
        return (n) ViewDataBinding.j(obj, view, x1.fragment_emomo_wipe_view);
    }
}
