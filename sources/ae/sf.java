package ae;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes2.dex */
public abstract class sf extends ViewDataBinding {
    public final AppCompatTextView B;
    public final AppCompatImageView C;
    public final View D;

    public sf(Object obj, View view, int i10, AppCompatTextView appCompatTextView, AppCompatImageView appCompatImageView, View view2) {
        super(obj, view, i10);
        this.B = appCompatTextView;
        this.C = appCompatImageView;
        this.D = view2;
    }
}
