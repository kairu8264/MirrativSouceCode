package t8;

import android.view.View;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.dena.mirrativ.customview.StatusView;

/* loaded from: classes.dex */
public abstract class o extends ViewDataBinding {
    public final RecyclerView B;
    public final SwipeRefreshLayout C;
    public final StatusView D;

    public o(Object obj, View view, int i10, RecyclerView recyclerView, SwipeRefreshLayout swipeRefreshLayout, StatusView statusView) {
        super(obj, view, i10);
        this.B = recyclerView;
        this.C = swipeRefreshLayout;
        this.D = statusView;
    }

    public static o T(View view) {
        return U(view, androidx.databinding.f.d());
    }

    @Deprecated
    public static o U(View view, Object obj) {
        return (o) ViewDataBinding.j(obj, view, r8.f1.fragment_group_shot_gallery);
    }
}
