package ae;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes2.dex */
public abstract class cl extends ViewDataBinding {
    public final AppCompatImageView B;
    public final RecyclerView C;

    public cl(Object obj, View view, int i10, AppCompatImageView appCompatImageView, RecyclerView recyclerView) {
        super(obj, view, i10);
        this.B = appCompatImageView;
        this.C = recyclerView;
    }
}
