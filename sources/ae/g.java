package ae;

import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.Toolbar;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.dena.mirrativ.customview.StatusView;

/* loaded from: classes2.dex */
public abstract class g extends ViewDataBinding {
    public final AppCompatTextView B;
    public final RecyclerView C;
    public final StatusView D;
    public final AppCompatTextView E;
    public final Toolbar F;

    public g(Object obj, View view, int i10, AppCompatTextView appCompatTextView, RecyclerView recyclerView, StatusView statusView, AppCompatTextView appCompatTextView2, Toolbar toolbar) {
        super(obj, view, i10);
        this.B = appCompatTextView;
        this.C = recyclerView;
        this.D = statusView;
        this.E = appCompatTextView2;
        this.F = toolbar;
    }
}
