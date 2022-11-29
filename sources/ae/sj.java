package ae;

import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes2.dex */
public abstract class sj extends ViewDataBinding {
    public final AppCompatTextView B;
    public final AppCompatTextView C;
    public final AppCompatTextView D;

    public sj(Object obj, View view, int i10, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, AppCompatTextView appCompatTextView3) {
        super(obj, view, i10);
        this.B = appCompatTextView;
        this.C = appCompatTextView2;
        this.D = appCompatTextView3;
    }
}
