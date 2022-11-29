package s9;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.dena.mirrorman.customview.RemainingKandumeView;

/* loaded from: classes.dex */
public abstract class c0 extends ViewDataBinding {
    public final View B;
    public final View C;
    public final AppCompatImageView D;
    public final AppCompatImageView E;
    public final RecyclerView F;
    public final ConstraintLayout G;
    public final RemainingKandumeView H;
    public final AppCompatTextView I;
    public final AppCompatTextView J;

    public c0(Object obj, View view, int i10, View view2, View view3, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, RecyclerView recyclerView, ConstraintLayout constraintLayout, RemainingKandumeView remainingKandumeView, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2) {
        super(obj, view, i10);
        this.B = view2;
        this.C = view3;
        this.D = appCompatImageView;
        this.E = appCompatImageView2;
        this.F = recyclerView;
        this.G = constraintLayout;
        this.H = remainingKandumeView;
        this.I = appCompatTextView;
        this.J = appCompatTextView2;
    }
}
