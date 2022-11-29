package pc;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes2.dex */
public abstract class g0 extends ViewDataBinding {
    public final AppCompatTextView B;
    public final AppCompatImageView C;
    public final AppCompatTextView D;
    public final RecyclerView E;
    public final ConstraintLayout F;
    public final RecyclerView G;
    public final RecyclerView H;

    public g0(Object obj, View view, int i10, AppCompatTextView appCompatTextView, AppCompatImageView appCompatImageView, AppCompatTextView appCompatTextView2, RecyclerView recyclerView, ConstraintLayout constraintLayout, RecyclerView recyclerView2, RecyclerView recyclerView3) {
        super(obj, view, i10);
        this.B = appCompatTextView;
        this.C = appCompatImageView;
        this.D = appCompatTextView2;
        this.E = recyclerView;
        this.F = constraintLayout;
        this.G = recyclerView2;
        this.H = recyclerView3;
    }
}
