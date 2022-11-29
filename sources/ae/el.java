package ae;

import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes2.dex */
public abstract class el extends ViewDataBinding {
    public final RecyclerView B;
    public final AppCompatTextView C;

    public el(Object obj, View view, int i10, RecyclerView recyclerView, AppCompatTextView appCompatTextView) {
        super(obj, view, i10);
        this.B = recyclerView;
        this.C = appCompatTextView;
    }
}
