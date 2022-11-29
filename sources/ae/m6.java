package ae;

import android.view.View;
import android.widget.FrameLayout;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes2.dex */
public abstract class m6 extends ViewDataBinding {
    public final FrameLayout B;
    public final View C;

    public m6(Object obj, View view, int i10, FrameLayout frameLayout, View view2) {
        super(obj, view, i10);
        this.B = frameLayout;
        this.C = view2;
    }

    public static m6 T(View view) {
        return U(view, androidx.databinding.f.d());
    }

    @Deprecated
    public static m6 U(View view, Object obj) {
        return (m6) ViewDataBinding.j(obj, view, nd.b1.fragment_emomo_user_view);
    }
}
