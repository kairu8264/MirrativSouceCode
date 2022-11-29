package ae;

import android.view.View;
import android.widget.ImageView;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes2.dex */
public abstract class w4 extends ViewDataBinding {
    public final ImageView B;
    public final ImageView C;

    public w4(Object obj, View view, int i10, ImageView imageView, ImageView imageView2) {
        super(obj, view, i10);
        this.B = imageView;
        this.C = imageView2;
    }

    public static w4 T(View view) {
        return U(view, androidx.databinding.f.d());
    }

    @Deprecated
    public static w4 U(View view, Object obj) {
        return (w4) ViewDataBinding.j(obj, view, nd.b1.dialog_fragment_shooter_rule);
    }
}
