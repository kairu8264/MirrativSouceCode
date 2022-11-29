package ac;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes2.dex */
public abstract class d7 extends ViewDataBinding {
    public final AppCompatImageView B;
    public final AppCompatTextView C;
    public final AppCompatTextView D;
    public final AppCompatImageView E;
    public final AppCompatTextView F;

    public d7(Object obj, View view, int i10, AppCompatImageView appCompatImageView, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, AppCompatImageView appCompatImageView2, AppCompatTextView appCompatTextView3) {
        super(obj, view, i10);
        this.B = appCompatImageView;
        this.C = appCompatTextView;
        this.D = appCompatTextView2;
        this.E = appCompatImageView2;
        this.F = appCompatTextView3;
    }
}
