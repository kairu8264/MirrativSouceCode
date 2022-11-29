package ac;

import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.dena.mirrorman.customview.RoundedButtonView;

/* loaded from: classes2.dex */
public abstract class j5 extends ViewDataBinding {
    public final AppCompatTextView B;
    public final View C;
    public final AppCompatTextView D;
    public final ConstraintLayout E;
    public final RecyclerView F;
    public final RoundedButtonView G;
    public final AppCompatTextView H;
    public final View I;

    public j5(Object obj, View view, int i10, AppCompatTextView appCompatTextView, View view2, AppCompatTextView appCompatTextView2, ConstraintLayout constraintLayout, RecyclerView recyclerView, RoundedButtonView roundedButtonView, AppCompatTextView appCompatTextView3, View view3) {
        super(obj, view, i10);
        this.B = appCompatTextView;
        this.C = view2;
        this.D = appCompatTextView2;
        this.E = constraintLayout;
        this.F = recyclerView;
        this.G = roundedButtonView;
        this.H = appCompatTextView3;
        this.I = view3;
    }
}
