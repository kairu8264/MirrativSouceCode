package m9;

import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes.dex */
public abstract class c extends ViewDataBinding {
    public final AppCompatTextView B;
    public final AppCompatTextView C;

    public c(Object obj, View view, int i10, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2) {
        super(obj, view, i10);
        this.B = appCompatTextView;
        this.C = appCompatTextView2;
    }
}
