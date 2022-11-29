package sa;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes2.dex */
public abstract class s extends ViewDataBinding {
    public final AppCompatTextView B;
    public final AppCompatImageView C;
    public final AppCompatTextView D;
    public final AppCompatTextView E;

    public s(Object obj, View view, int i10, AppCompatTextView appCompatTextView, AppCompatImageView appCompatImageView, AppCompatTextView appCompatTextView2, AppCompatTextView appCompatTextView3) {
        super(obj, view, i10);
        this.B = appCompatTextView;
        this.C = appCompatImageView;
        this.D = appCompatTextView2;
        this.E = appCompatTextView3;
    }
}
