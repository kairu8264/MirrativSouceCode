package ae;

import android.view.View;
import android.widget.FrameLayout;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes2.dex */
public abstract class k6 extends ViewDataBinding {
    public final FrameLayout B;

    public k6(Object obj, View view, int i10, FrameLayout frameLayout) {
        super(obj, view, i10);
        this.B = frameLayout;
    }

    public static k6 T(View view) {
        return U(view, androidx.databinding.f.d());
    }

    @Deprecated
    public static k6 U(View view, Object obj) {
        return (k6) ViewDataBinding.j(obj, view, nd.b1.fragment_emomo_stream_view);
    }
}
