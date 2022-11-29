package s9;

import android.view.View;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes.dex */
public abstract class o extends ViewDataBinding {
    public final AppCompatTextView B;
    public final AppCompatButton C;
    public final View D;
    public final AppCompatButton E;

    public o(Object obj, View view, int i10, AppCompatTextView appCompatTextView, AppCompatButton appCompatButton, View view2, AppCompatButton appCompatButton2) {
        super(obj, view, i10);
        this.B = appCompatTextView;
        this.C = appCompatButton;
        this.D = view2;
        this.E = appCompatButton2;
    }
}
