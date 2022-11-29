package db;

import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.dena.mirrorman.customview.RoundedButtonView;
import com.dena.mirrorman.widget.OutlineTextView;

/* loaded from: classes2.dex */
public abstract class a0 extends ViewDataBinding {
    public final ConstraintLayout B;
    public final OutlineTextView C;
    public final AppCompatTextView D;
    public final RecyclerView E;
    public final RecyclerView F;
    public final OutlineTextView G;
    public final RoundedButtonView H;
    public ya.x I;

    public a0(Object obj, View view, int i10, ConstraintLayout constraintLayout, OutlineTextView outlineTextView, AppCompatTextView appCompatTextView, RecyclerView recyclerView, RecyclerView recyclerView2, OutlineTextView outlineTextView2, RoundedButtonView roundedButtonView) {
        super(obj, view, i10);
        this.B = constraintLayout;
        this.C = outlineTextView;
        this.D = appCompatTextView;
        this.E = recyclerView;
        this.F = recyclerView2;
        this.G = outlineTextView2;
        this.H = roundedButtonView;
    }

    public abstract void T(ya.x xVar);
}
