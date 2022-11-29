package ae;

import android.view.View;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes2.dex */
public abstract class qa extends ViewDataBinding {
    public final RecyclerView B;

    public qa(Object obj, View view, int i10, RecyclerView recyclerView) {
        super(obj, view, i10);
        this.B = recyclerView;
    }
}
