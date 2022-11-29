package ae;

import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes2.dex */
public abstract class mi extends ViewDataBinding {
    public final AppCompatTextView B;
    public ud.w3 C;

    public mi(Object obj, View view, int i10, AppCompatTextView appCompatTextView) {
        super(obj, view, i10);
        this.B = appCompatTextView;
    }

    public abstract void T(ud.w3 w3Var);
}
