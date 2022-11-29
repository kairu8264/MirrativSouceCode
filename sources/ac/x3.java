package ac;

import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes2.dex */
public abstract class x3 extends ViewDataBinding {
    public final View B;
    public final AppCompatTextView C;
    public final AppCompatTextView D;

    public x3(Object obj, View view, int i10, View view2, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2) {
        super(obj, view, i10);
        this.B = view2;
        this.C = appCompatTextView;
        this.D = appCompatTextView2;
    }
}
