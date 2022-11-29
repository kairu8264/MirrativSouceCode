package ae;

import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes2.dex */
public abstract class a8 extends ViewDataBinding {
    public final View B;
    public final AppCompatTextView C;

    public a8(Object obj, View view, int i10, View view2, AppCompatTextView appCompatTextView) {
        super(obj, view, i10);
        this.B = view2;
        this.C = appCompatTextView;
    }
}
