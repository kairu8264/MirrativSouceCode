package ae;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes2.dex */
public abstract class kj extends ViewDataBinding {
    public final AppCompatImageView B;
    public ud.w4 C;

    public kj(Object obj, View view, int i10, AppCompatImageView appCompatImageView) {
        super(obj, view, i10);
        this.B = appCompatImageView;
    }

    public abstract void T(ud.w4 w4Var);
}
