package s9;

import android.view.View;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes.dex */
public abstract class q extends ViewDataBinding {
    public final AppCompatTextView B;
    public final AppCompatTextView C;
    public final AppCompatButton D;
    public final View E;
    public final AppCompatButton F;

    public q(Object obj, View view, int i10, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, AppCompatButton appCompatButton, View view2, AppCompatButton appCompatButton2) {
        super(obj, view, i10);
        this.B = appCompatTextView;
        this.C = appCompatTextView2;
        this.D = appCompatButton;
        this.E = view2;
        this.F = appCompatButton2;
    }
}
