package ae;

import android.view.View;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes2.dex */
public abstract class g9 extends ViewDataBinding {
    public final RelativeLayout B;
    public final AppCompatTextView C;

    public g9(Object obj, View view, int i10, RelativeLayout relativeLayout, AppCompatTextView appCompatTextView) {
        super(obj, view, i10);
        this.B = relativeLayout;
        this.C = appCompatTextView;
    }
}
