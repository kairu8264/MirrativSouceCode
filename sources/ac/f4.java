package ac;

import android.view.View;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes2.dex */
public abstract class f4 extends ViewDataBinding {
    public final RelativeLayout B;
    public final AppCompatImageView C;
    public final AppCompatImageView D;
    public final AppCompatTextView E;

    public f4(Object obj, View view, int i10, RelativeLayout relativeLayout, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, AppCompatTextView appCompatTextView) {
        super(obj, view, i10);
        this.B = relativeLayout;
        this.C = appCompatImageView;
        this.D = appCompatImageView2;
        this.E = appCompatTextView;
    }
}
