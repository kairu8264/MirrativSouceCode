package ac;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes2.dex */
public abstract class v3 extends ViewDataBinding {
    public final AppCompatImageView B;
    public final AppCompatImageView C;
    public final AppCompatTextView D;

    public v3(Object obj, View view, int i10, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, AppCompatTextView appCompatTextView) {
        super(obj, view, i10);
        this.B = appCompatImageView;
        this.C = appCompatImageView2;
        this.D = appCompatTextView;
    }
}
