package db;

import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.dena.mirrorman.customview.RoundedButtonView;
import com.dena.mirrorman.widget.OutlineTextView;

/* loaded from: classes2.dex */
public abstract class c0 extends ViewDataBinding {
    public final ConstraintLayout B;
    public final OutlineTextView C;
    public final AppCompatTextView D;
    public final RecyclerView E;
    public final RecyclerView F;
    public final RoundedButtonView G;
    public final OutlineTextView H;
    public ya.d0 I;

    public c0(Object obj, View view, int i10, ConstraintLayout constraintLayout, OutlineTextView outlineTextView, AppCompatTextView appCompatTextView, RecyclerView recyclerView, RecyclerView recyclerView2, RoundedButtonView roundedButtonView, OutlineTextView outlineTextView2) {
        super(obj, view, i10);
        this.B = constraintLayout;
        this.C = outlineTextView;
        this.D = appCompatTextView;
        this.E = recyclerView;
        this.F = recyclerView2;
        this.G = roundedButtonView;
        this.H = outlineTextView2;
    }

    public abstract void T(ya.d0 d0Var);
}
