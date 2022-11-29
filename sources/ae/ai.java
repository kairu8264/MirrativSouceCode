package ae;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes2.dex */
public abstract class ai extends ViewDataBinding {
    public final TextView B;
    public final ConstraintLayout C;

    public ai(Object obj, View view, int i10, TextView textView, ConstraintLayout constraintLayout) {
        super(obj, view, i10);
        this.B = textView;
        this.C = constraintLayout;
    }
}
