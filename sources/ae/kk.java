package ae;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes2.dex */
public abstract class kk extends ViewDataBinding {
    public final AppCompatImageView B;
    public final AppCompatTextView C;
    public final AppCompatTextView D;

    public kk(Object obj, View view, int i10, AppCompatImageView appCompatImageView, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2) {
        super(obj, view, i10);
        this.B = appCompatImageView;
        this.C = appCompatTextView;
        this.D = appCompatTextView2;
    }
}
