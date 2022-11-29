package ae;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes2.dex */
public abstract class ui extends ViewDataBinding {
    public final View B;
    public final ImageView C;
    public final ImageView D;
    public final TextView E;

    public ui(Object obj, View view, int i10, View view2, ImageView imageView, ImageView imageView2, TextView textView) {
        super(obj, view, i10);
        this.B = view2;
        this.C = imageView;
        this.D = imageView2;
        this.E = textView;
    }
}
