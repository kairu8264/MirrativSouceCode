package ae;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes2.dex */
public abstract class ch extends ViewDataBinding {
    public final AppCompatImageView B;
    public final AppCompatTextView C;
    public ud.o2 D;

    public ch(Object obj, View view, int i10, AppCompatImageView appCompatImageView, AppCompatTextView appCompatTextView) {
        super(obj, view, i10);
        this.B = appCompatImageView;
        this.C = appCompatTextView;
    }

    public abstract void T(ud.o2 o2Var);
}
