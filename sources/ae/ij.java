package ae;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes2.dex */
public abstract class ij extends ViewDataBinding {
    public final View B;
    public final AppCompatImageView C;

    public ij(Object obj, View view, int i10, View view2, AppCompatImageView appCompatImageView) {
        super(obj, view, i10);
        this.B = view2;
        this.C = appCompatImageView;
    }
}
