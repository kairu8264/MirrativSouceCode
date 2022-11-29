package kb;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.ViewDataBinding;
import ud.b2;

/* loaded from: classes2.dex */
public abstract class w0 extends ViewDataBinding {
    public final AppCompatTextView B;
    public final AppCompatImageView C;
    public b2 D;

    public w0(Object obj, View view, int i10, AppCompatTextView appCompatTextView, AppCompatImageView appCompatImageView) {
        super(obj, view, i10);
        this.B = appCompatTextView;
        this.C = appCompatImageView;
    }

    public abstract void T(b2 b2Var);
}
