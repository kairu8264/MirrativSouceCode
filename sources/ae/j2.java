package ae;

import android.view.View;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes2.dex */
public abstract class j2 extends ViewDataBinding {
    public final ConstraintLayout B;
    public final AppCompatTextView C;
    public final AppCompatButton D;
    public final AppCompatTextView E;
    public final AppCompatButton F;

    public j2(Object obj, View view, int i10, ConstraintLayout constraintLayout, AppCompatTextView appCompatTextView, AppCompatButton appCompatButton, AppCompatTextView appCompatTextView2, AppCompatButton appCompatButton2) {
        super(obj, view, i10);
        this.B = constraintLayout;
        this.C = appCompatTextView;
        this.D = appCompatButton;
        this.E = appCompatTextView2;
        this.F = appCompatButton2;
    }
}
