package ae;

import android.view.View;
import android.widget.FrameLayout;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes2.dex */
public abstract class i6 extends ViewDataBinding {
    public final FrameLayout B;

    public i6(Object obj, View view, int i10, FrameLayout frameLayout) {
        super(obj, view, i10);
        this.B = frameLayout;
    }

    public static i6 T(View view) {
        return U(view, androidx.databinding.f.d());
    }

    @Deprecated
    public static i6 U(View view, Object obj) {
        return (i6) ViewDataBinding.j(obj, view, nd.b1.fragment_emomo_game_view);
    }
}
