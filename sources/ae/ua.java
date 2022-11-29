package ae;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes2.dex */
public abstract class ua extends ViewDataBinding {
    public final AppCompatTextView B;
    public final AppCompatImageView C;
    public final AppCompatImageView D;
    public final Guideline E;
    public final Guideline F;
    public final Guideline G;
    public final AppCompatImageView H;
    public final RecyclerView I;
    public final AppCompatTextView J;
    public ud.x0 K;

    public ua(Object obj, View view, int i10, AppCompatTextView appCompatTextView, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, Guideline guideline, Guideline guideline2, Guideline guideline3, AppCompatImageView appCompatImageView3, RecyclerView recyclerView, AppCompatTextView appCompatTextView2) {
        super(obj, view, i10);
        this.B = appCompatTextView;
        this.C = appCompatImageView;
        this.D = appCompatImageView2;
        this.E = guideline;
        this.F = guideline2;
        this.G = guideline3;
        this.H = appCompatImageView3;
        this.I = recyclerView;
        this.J = appCompatTextView2;
    }

    public abstract void T(ud.x0 x0Var);
}
