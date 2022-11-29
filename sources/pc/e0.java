package pc;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes2.dex */
public abstract class e0 extends ViewDataBinding {
    public final AppCompatTextView B;
    public final AppCompatImageView C;
    public final RecyclerView D;
    public final RecyclerView E;
    public final AppCompatTextView F;

    public e0(Object obj, View view, int i10, AppCompatTextView appCompatTextView, AppCompatImageView appCompatImageView, RecyclerView recyclerView, RecyclerView recyclerView2, AppCompatTextView appCompatTextView2) {
        super(obj, view, i10);
        this.B = appCompatTextView;
        this.C = appCompatImageView;
        this.D = recyclerView;
        this.E = recyclerView2;
        this.F = appCompatTextView2;
    }
}
