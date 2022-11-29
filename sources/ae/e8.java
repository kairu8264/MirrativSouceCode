package ae;

import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.Toolbar;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes2.dex */
public abstract class e8 extends ViewDataBinding {
    public final Toolbar B;
    public final AppCompatTextView C;

    public e8(Object obj, View view, int i10, Toolbar toolbar, AppCompatTextView appCompatTextView) {
        super(obj, view, i10);
        this.B = toolbar;
        this.C = appCompatTextView;
    }
}
