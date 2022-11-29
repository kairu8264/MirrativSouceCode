package kb;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes2.dex */
public abstract class b0 extends ViewDataBinding {
    public final RecyclerView B;
    public final AppCompatImageView C;
    public final ConstraintLayout D;
    public final ConstraintLayout E;
    public final AppCompatTextView F;

    public b0(Object obj, View view, int i10, RecyclerView recyclerView, AppCompatImageView appCompatImageView, ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, AppCompatTextView appCompatTextView) {
        super(obj, view, i10);
        this.B = recyclerView;
        this.C = appCompatImageView;
        this.D = constraintLayout;
        this.E = constraintLayout2;
        this.F = appCompatTextView;
    }
}
