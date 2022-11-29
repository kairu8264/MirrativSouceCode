package ac;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes2.dex */
public abstract class b7 extends ViewDataBinding {
    public final AppCompatTextView B;
    public final AppCompatTextView C;
    public final AppCompatImageView D;
    public final AppCompatImageView E;

    public b7(Object obj, View view, int i10, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2) {
        super(obj, view, i10);
        this.B = appCompatTextView;
        this.C = appCompatTextView2;
        this.D = appCompatImageView;
        this.E = appCompatImageView2;
    }
}
