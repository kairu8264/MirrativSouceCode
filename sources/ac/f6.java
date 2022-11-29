package ac;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes2.dex */
public abstract class f6 extends ViewDataBinding {
    public final AppCompatTextView B;
    public final AppCompatImageView C;

    public f6(Object obj, View view, int i10, AppCompatTextView appCompatTextView, AppCompatImageView appCompatImageView) {
        super(obj, view, i10);
        this.B = appCompatTextView;
        this.C = appCompatImageView;
    }
}
