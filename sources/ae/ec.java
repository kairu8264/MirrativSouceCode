package ae;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes2.dex */
public abstract class ec extends ViewDataBinding {
    public final AppCompatImageView B;
    public ud.c C;

    public ec(Object obj, View view, int i10, AppCompatImageView appCompatImageView) {
        super(obj, view, i10);
        this.B = appCompatImageView;
    }

    public abstract void T(ud.c cVar);
}
