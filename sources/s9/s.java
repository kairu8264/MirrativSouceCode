package s9;

import android.view.View;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public abstract class s extends ViewDataBinding {
    public final View B;
    public final AppCompatEditText C;
    public final RecyclerView D;
    public final ConstraintLayout E;
    public final ConstraintLayout F;
    public final AppCompatTextView G;
    public final View H;
    public final View I;

    public s(Object obj, View view, int i10, View view2, AppCompatEditText appCompatEditText, RecyclerView recyclerView, ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, AppCompatTextView appCompatTextView, View view3, View view4) {
        super(obj, view, i10);
        this.B = view2;
        this.C = appCompatEditText;
        this.D = recyclerView;
        this.E = constraintLayout;
        this.F = constraintLayout2;
        this.G = appCompatTextView;
        this.H = view3;
        this.I = view4;
    }
}
