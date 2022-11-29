package t8;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.dena.mirrativ.customview.StatusView;

/* loaded from: classes.dex */
public abstract class s extends ViewDataBinding {
    public final RecyclerView B;
    public final SwipeRefreshLayout C;
    public final StatusView D;

    public s(Object obj, View view, int i10, RecyclerView recyclerView, SwipeRefreshLayout swipeRefreshLayout, StatusView statusView) {
        super(obj, view, i10);
        this.B = recyclerView;
        this.C = swipeRefreshLayout;
        this.D = statusView;
    }

    public static s T(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        return U(layoutInflater, viewGroup, z10, androidx.databinding.f.d());
    }

    @Deprecated
    public static s U(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10, Object obj) {
        return (s) ViewDataBinding.x(layoutInflater, r8.f1.fragment_live_catalog, viewGroup, z10, obj);
    }
}
