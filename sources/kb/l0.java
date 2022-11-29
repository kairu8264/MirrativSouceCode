package kb;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes2.dex */
public abstract class l0 extends ViewDataBinding {
    public final AppCompatImageView B;
    public final View C;
    public final AppCompatTextView D;
    public jf.s E;

    public l0(Object obj, View view, int i10, AppCompatImageView appCompatImageView, View view2, AppCompatTextView appCompatTextView) {
        super(obj, view, i10);
        this.B = appCompatImageView;
        this.C = view2;
        this.D = appCompatTextView;
    }

    public jf.s T() {
        return this.E;
    }

    public abstract void U(jf.s sVar);
}
