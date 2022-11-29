package ae;

import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes2.dex */
public abstract class aa extends ViewDataBinding {
    public final AppCompatImageView B;
    public final LinearLayout C;
    public final AppCompatTextView D;

    public aa(Object obj, View view, int i10, AppCompatImageView appCompatImageView, LinearLayout linearLayout, AppCompatTextView appCompatTextView) {
        super(obj, view, i10);
        this.B = appCompatImageView;
        this.C = linearLayout;
        this.D = appCompatTextView;
    }
}
