package s9;

import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes.dex */
public abstract class s0 extends ViewDataBinding {
    public final AppCompatTextView B;
    public z9.m C;

    public s0(Object obj, View view, int i10, AppCompatTextView appCompatTextView) {
        super(obj, view, i10);
        this.B = appCompatTextView;
    }

    public abstract void T(z9.m mVar);
}
