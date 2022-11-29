package ae;

import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes2.dex */
public abstract class ub extends ViewDataBinding {
    public final AppCompatTextView B;
    public final ImageView C;

    public ub(Object obj, View view, int i10, AppCompatTextView appCompatTextView, ImageView imageView) {
        super(obj, view, i10);
        this.B = appCompatTextView;
        this.C = imageView;
    }
}
