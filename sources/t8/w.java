package t8;

import android.view.View;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.dena.mirrativ.customview.StatusView;

/* loaded from: classes.dex */
public abstract class w extends ViewDataBinding {
    public final RecyclerView B;
    public final StatusView C;

    public w(Object obj, View view, int i10, RecyclerView recyclerView, StatusView statusView) {
        super(obj, view, i10);
        this.B = recyclerView;
        this.C = statusView;
    }
}
