package ae;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes2.dex */
public abstract class ej extends ViewDataBinding {
    public final AppCompatImageView B;
    public final AppCompatImageView C;
    public final View D;

    public ej(Object obj, View view, int i10, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, View view2) {
        super(obj, view, i10);
        this.B = appCompatImageView;
        this.C = appCompatImageView2;
        this.D = view2;
    }
}
